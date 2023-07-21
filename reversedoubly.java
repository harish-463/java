#include <stdio.h>
#include <stdlib.h>
struct Node
{
    int data;
    struct Node* prev;
    struct Node* next;
};
struct Node* createNode(int data)
{
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->prev = NULL;
    newNode->next = NULL;
    return newNode;
}
struct Node* insertNode(struct Node* head, int data)
{
    struct Node* newNode = createNode(data);
    if (head == NULL)
    {
        head = newNode;
    }
    else
    {
        newNode->next = head;
        head->prev = newNode;
        head = newNode;
    }
    return head;
}
struct Node* reverseList(struct Node* head)
{
    struct Node* current = head;
    while (current != NULL)
    {
        struct Node* temp = current->prev;
        current->prev = current->next;
        current->next = temp;
        head = current;
        current = current->prev;
    }
    return head;
}
void printList(struct Node* head)
{
    struct Node* current = head;
    while (current != NULL)
    {
        printf("%d ", current->data);
        current = current->next;
    }
}

int main()
{
    struct Node* head = NULL;
    int n, data;
    printf("Enter the number of nodes: ");
    scanf("%d", &n);
    printf("Enter the data of the nodes: ");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &data);
        head = insertNode(head, data);
    }
    printf("Original doubly linked list: ");
    printList(head);
    head = reverseList(head);
    printf("\nReversed doubly linked list: ");
    printList(head);
    return 0;
}
