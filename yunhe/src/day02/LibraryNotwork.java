package day02;

import java.util.Scanner;
public class LibraryNotwork {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        //第一步书数据的初始化
        //图书的名称  图书的借阅状态   图书的借阅日期  图书的借阅次数
        //给存在的书进行空间的划分
        String[] name=new String[6];
        int States[]=new int[6];//0可借    1已经借出
        int dates[]=new int[6];
        int Count[]=new int[6];

        //初始化已经拥有的图书
        name[0]="白雪公主";
        States[0]=1;
        dates[0]=15;
        Count[0]=13;

        name[1]="西游记";
        States[1]=0;
        dates[1]=0;
        Count[1]=18;

        name[2]="三国志";
        States[2]=0;
        dates[2]=0;
        Count[2]=23;

        boolean flag=true;
        //用户是否退出系统
        int num;

        do{
            System.out.println("******欢迎使用本图书管理系统*****");
            System.out.println("******1.查看图书*****");
            System.out.println("******2.新增图书*****");
            System.out.println("******3.借阅图书*****");
            System.out.println("******4.归还图书*****");
            System.out.println("******5.删除图书*****");
            System.out.println("******6.退出系统*****");
            System.out.println("请进行你的操作");
            int input=a.nextInt();
            switch(input){
                case 1://查询
                    System.out.println("图书列表");
                    System.out.println("图书序号\t图书名称\t图书状态\t借阅时间\t借阅次数");
                    //遍历所有图书的信息来显示
                    for(int i=0;i<name.length;i++){
                        if(name[i]!=null){
                            String state=(States[i]==0?"可借阅":"已借出");
                            String date=(dates[i]==0?" ":dates[i]+"日");
                            String Count1=Count[i]+"次";
                            System.out.println((i+1)+"\t"+name[i]+"\t"+state+"\t"+date+"\t"+Count1);
                        }else{
                            //遇到第一个为null的空数组元素后面亦为空
                            break;
                        }
                    }
                    break;
                case 2:
                    //新增图书;
                    for(int i=0;i<name.length;i++){
                        if(name[i]!=null){
                        }else{
                            name[i]=a.next();
                            System.out.print(name[i]);
                            break;
                        }
                    }
                    break;
                case 3:
                    //借阅图书;
                    System.out.println("请借阅您想要的书籍");
                    String s=a.next();
                    for(int i=0;i<name.length;i++){
                        if(name[i]==null){
                            System.out.print("没有你想要的书");
                        }else if(name[i].equals(s)&&States[i]==0){
                            System.out.print("请输入借阅时间");
                            dates[i]=a.nextInt();
                            while(dates[i]<1||dates[i]>31){
                                System.out.print("输入不正确，请重新输入");
                                dates[i]=a.nextInt();

                            }
                            System.out.print("借书成功");
                            States[i]=1;
                            Count[i]++;
                            break;
                        }
                    }
                    break;
                case 4:
                    //归还图书;
                    System.out.println("请归还图书");
                    String guihuan=a.next();
                    for(int i=0;i<name.length;i++){
                        if(name[i].equals(guihuan)&&States[i]==1){
                            States[i]=0;
                            dates[i]=0;
                            System.out.print("还书成功");
                            break;
                        }else if(name[i]==null){
                            System.out.print("非馆藏书籍，请重新输入");
                        }

                    }
                    break;
                case 5:
                    //删除图书;
                    int index=-1;
                    System.out.print("请删除不需要的老图书");
                    String delete=a.next();
                    for(int i=0;i<name.length-1;i++){
                        if(name[i].equals(delete)){
                            index=i;
                            break;
                        }
                    }
                    if(index!=-1){
                        for(int i=index;i<name.length;i++){
                            if(i!=name.length-1){
                                name[i]=name[i+1];
                                dates[i]=dates[i+1];
                                Count[i]=Count[i+1];}
                        }
                        System.out.print("删除成功");
                    }
                    break;
                case 6:
                    //退出系统;
                    flag=false;
                    break;
                default:
                    flag=false;
                    //输入错了，退出
                    break;
            }
            if(!flag){
                //跳出循环
                break;
            }else{
                System.out.print("请输入0返回主菜单");
                num=a.nextInt();
            }
        }while(num==0);
        System.out.println("谢谢使用");


//    Scanner scanner = new Scanner(System.in);

//    //数据初始化
//        //图书
//        String[] name=new String[6];
//        //借阅状态
//        int States[]=new int[6];
//        int dates[]=new int[6];
//        int Count[]=new int[6];
    }
}
