
#include <stdio.h>
#include <conio.h>
#include <malloc.h>
#include <stdlib.h>
struct node {
    int data;
    struct node *next;
};
struct node *createll(struct node *);
struct node *displayll(struct node *);
struct node *reversell(struct node *);
struct node *start = NULL;
int main(int argc, char *argv[])
{
    start=createll(start);
    start=displayll(start);
    start=reversell(start);
    return 0;
}
struct node *createll(struct node *start) {
     struct node *new_node,*ptr;
    int num;
    printf("Enter -1 to end\n");
    printf("Enter data\n");
    scanf("%d",&num);
    while (num != -1) {
        new_node = (struct node*)malloc(sizeof(struct node));
        new_node ->  data = num;
        if(start == NULL) {
            new_node -> next =NULL;
            start = new_node;
        }
        else {
            ptr = start;
            while (ptr->next != NULL) 
            ptr=ptr->next;
            ptr->next = new_node;
            new_node->next=NULL; 
        }
        printf("Enter data\n");
        scanf("%d",&num);
    }
    return start;
}
struct node *reversell(struct node *start) {
    struct node *ptr,*nextptr,*prevptr;
    ptr=start;
    prevptr=NULL;
    nextptr=NULL;
    while(ptr!=NULL) {
        nextptr=ptr->next;
        ptr->next=prevptr;
        prevptr=ptr;
        ptr=nextptr;
    }
    start=prevptr;
    displayll(start);
    return start;
}

struct node *displayll(struct node *start) {
     struct node *ptr;
    ptr = start;
    while(ptr!=NULL) {
        printf("%d\t",ptr->data);
        ptr=ptr->next;
    }
    printf("\n");
    return start;
}

