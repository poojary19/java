
#include<stdio.h>
#include<stdlib.h>
struct node
{
char ssn[10],name[10],dept[15],design[10],phno[15];
int sal;
struct node*llink;
struct node*rlink;
};
typedef struct node*NODE;
NODE temp ,FIRST=NULL,END=NULL;
NODE getnode()
{
NODE x;
x=(NODE)malloc(sizeof(struct node));
return x;
}
void read()
{
temp=getnode();
temp->llink=NULL;
temp->rlink=NULL;
printf("Enter SSN:");
scanf("%s",temp->ssn);
printf("Enter name:");
scanf("%s",temp->name);
printf("Enter Dept:");
scanf("%s",temp->dept);
printf("Enter designation:");
scanf("%s",temp->design);
printf("Enter Phno:");
scanf("%s",temp->phno);
printf("Enter salary:");
scanf("%d",&temp->sal);
return;
}
void Insertionend()
{
printf("Enter the details of the employee\n");
read();
if(FIRST==NULL)
{
FIRST=temp;
END=temp;
}
else
{
END->rlink=temp;
temp->llink=END;
}
return;
}
void Deletionend()
{
temp=FIRST;
if(FIRST==NULL)
{
printf("List is empty");
}
else if(FIRST==END)
{
printf("Deletion element is%s\n",temp->ssn);
FIRST=NULL;
END=NULL;
free(temp);
}
else
{
printf("Delected element is%s\n",temp->ssn);
FIRST=FIRST->rlink;
FIRST->llink=NULL;
free(temp);
}
return;
}
void display()
{
temp=FIRST;
printf("employee details:\n");
if(FIRST==NULL)
{
printf("No employee records found\n");
}
else
{
while(temp!=END)
{
printf("%s\t%s\t%s\t%s\t%s\t%d\n",temp->ssn,temp->name,temp->dept,temp->design,temp->phno,temp->sal);
temp=temp->rlink;
}
printf("%s\t%s\t%s\t%s\t%s\t%d\n",temp->ssn,temp->name,temp->dept,temp->design,temp->phno,temp->sal);
}
return;
}
void main()
{
int choice;
while(1)
{
printf("-------------------------MENU-------------------------\n");
printf("\n1- insertion in DLL queue");
printf("\n2-deletion in DLL queue ");
printf("\n3-Display from DLL");
printf("\n4-Exit\n");
printf("-----------------------------------------------------\n");
printf("Enter your choice:");
scanf("%d",&choice);
switch(choice)
{
case 1:Insertionend();
break;
case 2:Deletionend();
break;
case 3:display();
break;
case 4:exit(0);
default:printf("Invalid choice\n");
}
}
}





