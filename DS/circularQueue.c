#include <stdio.h>
#define MAX 5

typedef struct
{
    int a[MAX];
    int front, rear;
    int count;
}cqueue;

void enqueue(cqueue *q, int ele)
{
    if(q -> count == MAX)
    {
        printf("Circular queue OVERFLOW\n");
        return;
    }
    else
    {
        q -> count++;
        q -> rear = (q -> rear + 1) % MAX;
        q -> a[q -> rear] = ele;
    }
}

int isempty(cqueue *q)
{
    if(q -> count == 0)
    {
        return 1;
    }
    else{
        return 0;
    }
}

int dequeue(cqueue *q)
{
    int x;
    if(isempty(q)){
        return -1;
    }
    q -> count --;
    x = q -> a[q -> front];
    q -> front = (q -> front + 1) % MAX;
    return x;
}

int queuefront(cqueue *q)
{
    if(isempty(q))
    return -1;
    else
    return q -> a[q -> front];
}

void display(cqueue *q)
{
    int i;
    if(isempty(q)){
        printf("QUEUE UNDERFLOW\n");
        return;
    } 
    else{
        i = q -> front;
        while(1){
            printf("%d\t", q -> a[i]);
            if(i == q -> rear)
            break;
            i = (i + 1) % MAX;
        }
        
    }
}

int main()
{
    int ch,ele;
    cqueue q;
    q.front = 0;
    q.rear = MAX - 1;
    q.count = 0;
    while(1){
        printf("\n1:ENQUE \n2:DEQUEUE \n3:QUEUEFRONT \n4:DISPLAY \n5:EXIT\n");
        printf("Enter Choice\n");
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