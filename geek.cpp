#include<bits/stdc++.h>
using namespace std;
int main()
{
    int num[100000];
    int j,n,m,l,t,i;
    scanf("%d",&t);
    for(j=0;j<t;j++)
    {
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&num[i]);
    }
    sort(num,num+n);
    cin>>l;
    printf("%d\n",num[l-1]);
    }
}
