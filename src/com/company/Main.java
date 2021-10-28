package com.company;

import com.company.business.abstracts.*;
import com.company.business.concrete.*;
import com.company.dao.concrete.*;
import com.company.entities.concrete.*;

import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    //Services
    static ProductManager productService=new ProductService(new LocalProductDao());
    static BasketItemManager basketItemManager=new BasketIteamService(new LocalBasketItemDao(),new ProductService(new LocalProductDao()));
    static CategoryManager categoryManager=new CategoryService(new LocalCategoryDao());
    static PaymentDetailManager paymentDetailManager=new PaymentDetailService(new LocalPaymentDetailDao());
    static OrderDetailManager orderDetailManager=new OrderDetailService(new LocalOrderDetailDao());
    static OrderIteamManager orderIteamManager=new OrderIteamService(new LocalOrderIteamDao());

    static Scanner sc = new Scanner(System.in);
    static int operationCode;
    static boolean exitFromApp = false;

    public static void main(String[] args) {



        while (!exitFromApp) {
            System.out.println("1-Show all products | 2-Go basket | 3-Filter by category | 4-Show old orders | 5-Exit ");
            operationCode = sc.nextInt();

            if(operationCode<=5){
                if(operationCode==1){screen1Func();}
                else if (operationCode==2){screen2Func();}
                else if(operationCode==3){screen3Func();}
                else if(operationCode==4){screen4Func();}
                else if(operationCode==5){screen5Func();}
            }else{
                System.out.println("Please enter current operation's number");
            }
        }





    }

    public static void screen1Func(){
        productService.getAll().stream().forEach(p->System.out.println("Id:"+p.getId()+" |Name:"+p.getName()+" |Category:"+categoryManager.getById(p.getCategory()).getName()+" |Price:"+p.getPrice()+" |Unit in stock:"+p.getUnitInStock()));
        System.out.println("1-Return back | 2-Add your basket ");
        int operationCode= sc.nextInt();

        if(operationCode==1){
            return;
        }else if(operationCode==2){
            int idOfProduct;
            System.out.println("Enter product's which you want to buy id:");
            idOfProduct=sc.nextInt();
            Product addedProduct =productService.getAll().stream().filter(p->p.getId()==idOfProduct).collect(Collectors.toList()).get(0);

            if(addedProduct!=null){
                System.out.println("How many do you want to add?");
                int countOfProduct=sc.nextInt();
                basketItemManager.addToBasket(new BasketItem(idOfProduct,countOfProduct));
            }

        }
    }

    public static void screen2Func(){

        basketItemManager.showBasket().stream().forEach(b->{
            int idOfBasketItem=b.getProductId();
            productService.getAll().stream().filter(p->p.getId()==idOfBasketItem).forEach(p->System.out.println("Id:"+p.getId()+" |Name:"+p.getName()+" |Category:"+p.getCategory()+" |Price:"+p.getPrice()+" |Unit in stock:"+p.getUnitInStock()+" |Count:"+b.getCountOfProduct()));
        });



            System.out.println("1-Return back | 2-Complete order/Buy ");

            int operationCode = sc.nextInt();

            if (operationCode == 1) {
                return;
            } else if (operationCode == 2) {
                System.out.println("Which type of payment will you use? 1-Cash 2-Card:");
                int paymentType = sc.nextInt();
                String paymentTypeName = "";
                if (paymentType != 1 && paymentType != 2) {
                    System.out.println("This payment option is not possible");
                    return;
                } else if (paymentType == 1) {
                    paymentTypeName = "Cash";
                } else if (paymentType == 2) {
                    paymentTypeName = "Card";
                }

                System.out.println("Are you sure about to complete the order? (1-yes 2-no):");
                operationCode = sc.nextInt();
                if (operationCode == 1) {
                    PaymentDetail paymentDetail = new PaymentDetail(basketItemManager.calculateBasketTotalPrice(), paymentTypeName);
                    OrderDetail orderDetail = new OrderDetail(paymentDetail.getTotalPrice(), paymentDetail.getId());
                    paymentDetailManager.add(paymentDetail);
                    orderDetailManager.add(orderDetail);
                    basketItemManager.showBasket().forEach(bi -> orderIteamManager.add(new OrderIteam(orderDetail.getId(), bi.getProductId(), bi.getCountOfProduct())));
                    System.out.println("Order received successfully.");
                    basketItemManager.clear();
                } else {
                    return;
                }

            }




    }

    public static void screen3Func(){

        categoryManager.getAll().forEach(c->System.out.println("Id: "+c.getId()+" |Name:"+ c.getName()));
        System.out.println("Insert category's id:");
        int categoryId=sc.nextInt();

        productService.getByCategory(categoryId).forEach(p->{
            System.out.println("Id:"+p.getId()+" |Name:"+p.getName()+" |Category:"+categoryManager.getById(categoryId).getName()+" |Price:"+p.getPrice()+" |Unit in stock:"+p.getUnitInStock());
        });

        System.out.println("1-Return back | 2-Add your basket ");
        int operationCode= sc.nextInt();

        if(operationCode==1){
            return;
        }else if(operationCode==2){
            int idOfProduct;
            System.out.println("Enter product's which you want to buy id:");
            idOfProduct=sc.nextInt();
            Product addedProduct =productService.getAll().stream().filter(p->p.getId()==idOfProduct).collect(Collectors.toList()).get(0);

            if(addedProduct!=null){
                System.out.println("How many do you want to add?");
                int countOfProduct=sc.nextInt();
                basketItemManager.addToBasket(new BasketItem(idOfProduct,countOfProduct));
            }

        }






    }

    public static void screen4Func(){

        orderDetailManager.getAll().forEach(od->System.out.println("Id:"+od.getId()+"|Total Price:"+od.getTotalPrice()+"|Payment Detail:"+ paymentDetailManager.getById(od.getPaymentDetail()).getPaymentType()));
        System.out.println("1-Expand order's detail |2-Return back");
        int operationCode=sc.nextInt();
        if (operationCode==1){
            System.out.println("Insert id of order detail which you want to expand:");
            operationCode= sc.nextInt();
            orderIteamManager.getByOrderDetailId(operationCode).forEach(oi->{
                Product product=productService.getById(oi.getProductId());
                System.out.println("Product name:"+product.getName()+" |Category:"+product.getCategory()+" |Price:"+product.getPrice()+" |Count:"+oi.getOrderCount());
            });

        }else if (operationCode==2){
            return;
        }

    }

    public static void screen5Func(){
        exitFromApp=true;
    }


}
