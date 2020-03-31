import java.util.*;
class Star1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
  int n=s.nextInt();
for(int i=0;i<n;i++)
{
for(int j=0;j<i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}
// if n=8, output is:
//*
//**
//***
//****


import java.util.*;
class Star2
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=0;i<n;i++)
{
for(int j=n-i-1;j>=0;j--)
{
System.out.print("*");
}
System.out.println();
}
}
}

//if n=5, then the output is:
//*****
//****
//***
//**
//*


