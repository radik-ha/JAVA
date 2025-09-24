import java.util.Scanner;
class stack
{
int top;
int stack[];
int max=5;
stack()
{
top = -1;
stack = new int[max];
}
void push(int data)
{
top++;
stack[top] = data;
}
void disp()
{
System.out.println("\n The elements are:");
for(int i=0;i<=top;i++)
{
System.out.println(stack[i]);
}
}
int pop()
{
int value = stack[top];
System.out.println("\n Deleted element is:"+stack[top]);
System.out.println("\n");
stack[top] = 0;
top--;
return value;
}
}

class operation extends stack
{
int s;
int add(int m,int n)
{
s = m+n;
return s;
}

int sub(int m,int n)
{
s = m-n;
return s;
}

int div(int m,int n)
{
s = m/n;
return s;
}
int mul(int m,int n)
{
s = m*n;
return s;
}
}

class StackApp
{
public static void main(String args[])
{
int data;
char opt;
int choice,a,b,c,d;
Scanner o = new Scanner(System.in);
stack x = new stack();
operation y = new operation();
do
{
System.out.println("\n ...STACK OPERATIONS...\n");
System.out.println("1.PUSH");
System.out.println("1.POP");
System.out.println("1.DISPLAY");
System.out.println("1.EXIT");
System.out.println("1.Enter your choice:");
choice = o.nextInt();
switch(choice)
{
case 1:
if(x.top == x.max-1)
{
System.out.println("Stack Overflow");
}
else
{
System.out.println("Enter the element to insert: ");
if(o.hasNextInt())
{
data = o.nextInt();
x.push(data);
}
else
{
opt = o.next().charAt(0);
if(opt == '+' || opt == '-' || opt == '*' || opt == '/');
{
if(x.top == -1)
{
System.out.println("Stack Underflow \n");
}
else
{
int e1 = x.pop();
int e2 = x.pop();
if(opt == '+')
{
a = y.add(e1,e2);
x.push(a);
}
else if(opt == '-')
{
b = y.sub(e1,e2);
x.push(b);
}
else if(opt == '*')
{
c = y.sub(e1,e2);
x.push(c);
}
else
{
d = y.div(e1,e2);
x.push(d);
}
}
}
}
}
break;
case 2:
if(x.top == -1)
{
System.out.println("Stack Underflow");
}
else
{
x.pop();
}
break;
case 3:
if(x.top == -1)
{
System.out.println("Stack empty");
}
else
{
x.disp();
}
break;
case 4:
System.out.println("Exit from stack");
break;
default:
System.out.println("Enter correct choice");
}
}while(choice != 4);
o.close();
}
}						