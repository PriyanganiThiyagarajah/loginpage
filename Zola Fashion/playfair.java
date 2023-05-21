import java.util.*;

public class playfair{

static String removeDuplicateElementsFromKey(String key){
if(key != "" && key!=null){
char array[]=new char[key.length()];
for(int i=0;i <array.length;i++){
if(isNotContains(array,key.charAt(i))){
array[i]=key.charAt(i);
}
}
return removeEmptyElements(array);
}
return "";
}
static boolean isNotContains(char array[],char c){
for(int i=0;i<array.length;i++){
	if(array[i]==c){
	return false;
}
}
	return true;
}


static String removeEmptyElements(char array[]){
String keyString="";
for(int i=0;i<array.length;i++){
	if(array[i] !='\u0000'){
keyString +=array[i];
}
}
return keyString;
}

static String createKeyAndArray(char alpha[],String key){
char array[]=new char[25];
for(int i=0;i<key.length();i++){
 array[i]=key.charAt(i);
}
int count =key.length();
for(int i=0;i<array.length;i++){
	if(isNotContains(array,alpha[i])){
array[count]=alpha[i];
count++;
}
}
return removeEmptyElements(array);
}


static char [][] createKeymatrix(String arrayString){
char matrix[][]=new char [5][5];
int k=0;
for(int i=0;i<5;i++){
for(int j=0;j<5;j++){
matrix [i][j]=arrayString.charAt(k);
k++;
}
}
return matrix;
}

static void printKeymatrixForm(char matrix[][]){
for(int i=0;i<5;i++){
for(int j=0;j<5;j++){
System.out.print(matrix [i][j]+" ");
}
System.out.println();
}

}


public static void main(String args[]){
char alpha[]={'A', 'B', 'C', 'D', 'E', 'F','G', 'H', 'I', 'K', 'L','M', 'N', 'O', 'P', 'Q', 'R','S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
Scanner scan=new Scanner(System.in);
System.out.println("Enter the key");
String key=scan.nextLine();
key=key.toUpperCase();

String uniqueKeyString=removeDuplicateElementsFromKey(key);
System.out.println(uniqueKeyString);

String uniqueArrayString=createKeyAndArray(alpha,uniqueKeyString);
System.out.println(uniqueArrayString);

char [][] keyMatrix=createKeymatrix(uniqueArrayString);
printKeymatrixForm(keyMatrix);
}

}