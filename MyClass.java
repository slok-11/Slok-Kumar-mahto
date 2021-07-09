import java.lang.*;
import java.util.*;
class MyClass{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

Songs [] sg = new Songs[5];
for(int i =0 ; i<sg.length; i++){
String s1 = sc.nextLine();
int is = sc.nextInt();
sc.nextLine();
String s2 = sc.nextLine();
String s3 = sc.nextLine();
double d = sc.nextDouble();
sg[i]= new Songs(s1,is,s2,s3,d);

sc.nextLine();
}

String str3 =sc.nextLine();

String str2 = sc.nextLine(); 


String [] arr1 =fSBOL(sg,str3);
if(arr1==null){
	System.out.println("There is no songs with given language");
}else{
	for(String s : arr1){
		System.out.println(s);
	}
}
Songs [] arr2 = FSBOA(sg,str2);
if(arr2== null){System.out.println("There are no Song with the given artists");}
else{for(Songs s:arr2){
System.out.println(s.getS1());
System.out.println(s.getD());

}

}




}
public static String [] fSBOL(Songs [] sg,String s3 ){
int c =0;
for(int i =0 ; i<sg.length; i++){
if(sg[i].getS3().equals(s3)){
   c++;
 
}

}if(c==0){return null;}
String [] arr = new String[c];
int a =0;
for(int i =0 ; i<sg.length; i++){
if(sg[i].getS3().equals(s3)){
	arr[a++]= sg[i].getS1();
}
}
return arr;



}
public static Songs[] FSBOA(Songs [] sg , String s2){
	int c =0 ;
for(int i =0 ; i<sg.length;i++){

if(sg[i].getS2().equals(s2))
	{ 
		c++;
	}

}if(c==0){return null;}
Songs [] arr = new Songs[c];
int a =0;
for(int i =0 ; i<sg.length;i++){

	if(sg[i].getS2().equals(s2)){
		arr[a++]= sg[i];
	}
}
for(int i =0 ; i<arr.length;i++){
	for(int j =0 ; j<arr.length-1-i;j++){
		if(arr[j].getD()>arr[j+1].getD()){
        Songs temp = arr[j];
        arr[j]= arr[j+1];
        arr[j+1] = temp;
		}
	}
}
return arr;
} 


}
class Songs{
private String s1;
private int is;
private String s2;
private String s3;
private double d;

Songs(String s1 , int is, String s2,String s3,double d){

	this.s1=s1;
	this.is=is;
	this.s2 = s2;
	this.s3 = s3;
	this.d=d;

}
public void setS1(String s1){this.s1 = s1;}
public void setIs(int is){this.is = is;}
public void setS2(String s2){this.s2 =s2;}
public void setS3(String s3){this.s3 = s3;}
public void setD(double d){this.d=d;}

public String getS1(){return s1;}
public int getIs(){return is;}
public String getS2(){return s2;}
public String getS3(){return s3;}
public Double getD(){return d;}

}