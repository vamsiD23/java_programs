class app{
public static void main(String[] args){
String name= "shirt";
int code=123;
int price=1000;
int quantity=2;
int finaltotal=2000;
int discount=13/100;
int credit=150;
int coupen=25;

System.out.println("Name= shirt");
System.out.println("Code= 123");
System.out.println("Price= 1000");
System.out.println("Quantity= 2");
System.out.println("Total="+ price*quantity);
System.out.println("Discount=13"+ 13/100*(2000));
System.out.println("total="+ (finaltotal-discount));
System.out.println("credit card discount=150");
System.out.println("coupen code discount = 25");
System.out.println("total amount paid="+(1870-(credit+coupen)));


}}
