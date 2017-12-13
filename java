Look up Name Space. "example: import java.util.Scanner; (scanner is a class) 
You are importing Scanner from the java util name space. If you doing add the Scanner, it will import all the classes from the java.util namespace.

Public, Static, void, main. In most apps that get compiled, you need an entry pointer. Public static voic main(STring[] args) is generally the entry point. If you doing have it, it will not compile.  Info gets passed through the array, that allow us to manipulate the concole. 

Access modifiers- public and private. The language you work in will determine what these mean. Public means if I know where this file is I can see the main method and call it from something else. If changed to private, you would not be able to call main from anywhere but inside that file. This access point says who can and can't see my stuff, in java it should always be public static. 

Class vs. Instance: 
variable is a variable of the class shape.
What var s does, is your instanciating var S in to new Shape, s is now an instance of shape.
When you start it up, Pi is part of the object, you make it S because other wise it isn't an instance of shap. It's mostly for repetitive code. This also has to do with the fact that name is not marked static. Static makes it part of the class. But making it a new object allows it's use. 

public class Shape {
public static pi = 3.14;
public string name = "";

public void main ()
{
this.name = "foo";
} console.log(Shape.pi);
var s = new Shape();
console.log(s.name);

You use String, Int, etc. when ever you use a data type. Example:
String name = "Rick";
int age = 60;
boolean scientist = true

System.out.println(Strig.format(%s is %d years old, name, age) // redirects output to the console. 
System.out.print (" ") // will not output to the next line. 
This is for data injection at runtime like handlbars or template numerals
%s is a string, %d is a number use %s and %d like your template for the data type. 

System.in is whatever your input method is (generally input from your keyboard). 
Scanner input = new Scanner(System.in)
System.out.println("print to screen");
String sentance = input.nextLine();

System.out.println("Enter word to read") // this is a synconise program, you have to enter an input to move forward. 
int interger = input.nextInt();

System.out.println("enter a double to read") // for validation purposes, will stay in the loop until valid datais entered.
double dub = input.nextDouble();

To make java files work, you need to compile it. Turns your code in to machine code. 
.javac //this is the java compiller itself (example: javac ConsoleIO.java, enter in to terminal)
the class file is the executable file of java. Basically when you run it, you have to be a level up from the console folder. Look up Eclipse, its visual stuido for Java.

All intergers are doubles, but not all doubles are integers. Example and integer is 1.0, where as a double can be 1., doing put non whole numbers in to an integer. 

Compile by going up one directory from the console file and call console.console.(java file.java)

/////////////////////////////////////////////////////////////////////

Arrays, Array lists, and Hashmaps? They store things. In java you have to initialize the array with a set amount of data. Example 
String[] names;
names = new String[3];
String[] triumvirs = {"Julius", "Cassius", "Brutus"};
//otherwise you would have to define the values like this. 
names[0] = "Julius";
name[1] = "Cassius";
name [3] = "Brutus"
//You can't go past the set limit, but you can use less than the array value. 
for (int i = 0; i > triumvirs.length; i++) {
System.out.println{
String.format("The ruler is triumvirs[i]));

//or shorthand
for (String name : triumvirs) {
System.out.println (same as above)

/////////////////////////////////////////////////////////////////////

Array list- Arrays you don't have to set a length for, 
ArrayList<T> //This is a generic, you can provide any type value for T
ArrayList<String> triumvirs = new ArrayList<>();

triumvirs.add("Julius")
triumvirs.add("Brutus")

System.out.println(
String.format("The first dude is %s", triumvirs.get(0))); //you can also use remove
//you can not use [] with an array list, because it is not an array. 

triumvirs.set(0, "Julius");

/////////////////////////////////////////////////////////////////////
Hash Map- these are key value pairs:

HashMap <String, Integer> payroll = new HashMap<>();
payroll.put("Ceasur, 10000);
payroll.get("Brutus", 10000);

System.out.println(payroll.getOrDefauly("Steve", -1));
payroll.forEach(last,salary) =>
System.out.ln("%s, %d, last, salary);

Java integer division- will always take 2 integers and return an integer not a double. 
You can use Convert.ToDouble to force java to do division properly. 

/////////////////////////////////////////////////////////////////////

Conditional logic-

you don't need curly braces for for statements if it is all on one line. (anything before the ; ) 

hasNext - This is for booleans. This says, is the string coming in double or int or string otherwise just move on. 

/////////////////////////////////////////////////////////////////////

Functions

public class Function {
 void printName(String firstname, string last name) //everything in the () is called the function signature. You pass through the function arguements here. If you put in 2 arguemetns with multi signatures, that is call arguement overloading.
 { this.pringName(firstName):
 } // everything within the braces is the function body. Everytime you write one of these, it should only do one thing.

Void is used when you are creating a class that will not return any value. Java always needs to know what to expect. So if you will get a string after to perform the action you would need to label string, if you expect a number you would label int, double, or whatever type of number will come back. Meaning you are literally not using a return inside of your function body

double divide(int x, int y) {
return x / y; 
<T> void printInput(T input) {
System.out.println(your input was: " " + input.toString() + ""."");
 
/////////////////////////////////////////////////////////////////////

Static attachs values to the class itself. When you omit the static keyword it gets attached to an instance of the class

foo ();
String foo = MyFoo.foo();

MyFoo fx = new MyFoo();
String foo2 = fx.foo(); //MyFoo fx is an instance of the foo class. The static Foo members pass attr. to all instances, but instances can't pass attr. back to Static. You need to new in order to make an instance.

public class Myfoo {
public static string foo()
{return 'foo';)
public string foo () {return 'foo2'}
}

/////////////////////////////////////////////////////////////////////

When you have package console, it is looking for the file in a folder called Console. So rename your folder to Console. 

/////////////////////////////////////////////////////////////////////

A class is an object but not necessarilly the other way around.
Constructor is the entry point for the object. A Constructor sets up your object

public String user;
private String email;

User(string username, String email) { //this is a constructor, it tells the constructor that it will only work if you pass in 2 objects.
this.setUserbame(username); //the this method does not exist in a static method. you are saying your calling this from this instance. 

Anytime you need to call to an object for a static object you have to call the actual name (example: user.CreateUser)

public static void main (String[] args) {
  User jim = new User ("Jim", "jim@email.com");
  jim.introduce();
  
  System.out.println(User.get Count());
  User throwaway = new User("","");
  System.out.prinln(User.getCount());
  
/////////////////////////////////////////////////////////////////////

Exceptions

class Throw {
public static void main (String [] args) {
printSeperator();
try {
throw new Exception("Error!");}
catch (Exception e) {
System.out.println ("Exception caught");}
System.out.println("This will now run")
printSeperator();}
//Unhandled expression means it bubbled up to the UI and the user will see the error. 

/////////////////////////////////////////////////////////////////////

... //the variable can take in an infinite number of values. But when you use the elipse you have to use the keyword final. Its the = of const in EX6. You can't modify anything tagged final.
private static void greetStudents (final String ... name) {
for (String name : name) {
System.out.println(String.format("Hello, %s!", name));
}

You have to import (import static java.util.Arrays.stream;)
.stream // Stream is a thing you are being given to read. A stream is constant unless it is specified to end by program or end of data.
.stream(names)
.forEach((String name) -> {
System.out.println(String.format("Hellow %s!", name));
})

inheritecnce, abstraction, polymorphism- just read up on object oriented programming.
Class are a concrete object, you have to New them to change them. 
You want to code to an abstraction not a concrete object. 
