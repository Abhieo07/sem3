#include <stdio.h>
#define MAX 5

typedef struct {
    int a[MAX];
    int front,rear;
}queue;

void enqueue(queue *q, int ele)
{
    if(q -> rear == MAX - 1)
    {
        printf("QUEUE IS OVERFLOW\n");
        return;
    }
    int i,j;
    for(i = q -> rear; j >= i; j++) {
        q -> a[j + 1] = q -> a[i];

        q -> a[i] = ele;
        q -> rear++;
    }
}

int isempty(queue *q)
{
    if(q -> rear + 1 == q -> front)
    {return 1;}
    else
    {return 0;}
}

int dequeue(queue *q)
{
    int x;
    if(isempty(q)){
        return -1;
    }
    x = q -> a[q -> front];
    q -> front++;
    return x;
}

int queuefront(queue *q)
{
    if(isempty(q)){
        return -1;
    }else {
        return q -> a[q -> front];
    }
}

void display(queue *q)
{
    int i;
    if(isempty(q)){
        printf("QUEUE UNDERFLOW\n");
        return;
    }
    else {
        for(i = q -> front; i <= q -> rear; i++){
            printf("%d\t", q -> a[i]);
        }
        printf("\n");
    }
}

int main()
{
    int ch,ele;
    queue q;
    q.front = 0;
    q.rear = -1;

    while(1)
    {
        printf("1:ENQUE\n2:DEQUEUE\n3:QUEUEFRONT\n4:DISPLAY\n5:EXIT\n");
        printf("enter choice\n");
        scanf("%d", &ch);
        if(ch == 5){
            break;
        }
        switch(ch)
        {
            case 1: printf("Enter element to enqueue\n");
                scanf("%d", &ele);
                enqueue(&q, ele);
            break;
            case 2: ele = dequeue(&q);
                if(ele == -1){
                    printf("QUEUE UNDERFLOW\n");
                }
                else{
                    printf("element dequeue = %d\n", ele);
                }
            break;
            case 3: ele = queuefront(&q);
                if(ele == -1){
                    printf("QUEUE UNDERFLOW\n");
                }
                else{
                    printf("queue front element = %d\n", ele);
                }
            break;
            case 4: display(&q);
            break;
            default: printf("INVALID CHOICE\n");
        }
    }

    return 0;
}