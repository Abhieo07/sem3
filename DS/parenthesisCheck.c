#include <stdio.h>
#include <string.h>
#define MAX 15

typedef struct {
    int a[MAX];
    int top;
}stack;

void push(stack *s, int ele)
{
    s -> top++;
    s -> a[s -> top] = ele;
}

int pop(stack *s)
{
    int x;
    x = s -> a[s -> top];
    s -> top--;
    return x;
}

int isopenbracket(int x)
{
    if(x == '(' || x == '{' || x == '['){
        return 1;
    }
    else {
        return 0;
    }
}

int isclosebracket(int x)
{
    if(x == ')' || x == '}' || x == ']'){
        return 1;
    }
    else {
        return 0;
    }
}

int isempty(stack *s)
{
    if(s -> top == -1){
        return 1;
    }
    else {
        return 0;
    }
}

int check(char *exp)
{
    stack s;
    s.top = -1;
    int x,ele,i;

    for(i = 0; i < strlen(exp); i++)
    {
        x = exp[i];
        if(isopenbracket(x)){
            push(&s, x);
        }
        else if(isclosebracket(x)){
            if(isempty(&s)){
                return 0;
            }
            else
            {
                ele = pop(&s);
                if(x == ')' && x != '('){
                    return 0;
                }else if(x == ']' && x != '['){
                    return 0;
                }else if(x == '}' && x != '{'){
                    return 0;
                }
            }
        }
    }
    if(isempty(&s)){
        return 1;
    }
    else {
        return 0;
    }
}

int main()
{
    char exp[50];
    printf("Enter Expression\n");
    gets(exp);
    if(check(exp)){
        printf("Parenthesis is correct\n");
    }
    else {
        printf("Parenthesis is incorrect\n");
    }

    return 0;
}