/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: root
 *
 * Created on January 15, 2020, 1:57 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
void main() {

    int t=0,totalInt=0,rotate=0,i=0,j=0;
    scanf("%d",&t);
    for(i=0;i<t;i++){
        scanf("%d %d",&totalInt,&rotate);
        int a[totalInt];
        for(j=0;j<totalInt;j++){
            scanf("%d",&a[j]);
        }
        
        for(j=totalInt-1;j>=rotate;j--){
            printf("%d",a[j]);
            printf("%s"," ");
        }
        
        for(j=0;j<rotate;j++){
            printf("%d",a[j]);
            printf("%s"," ");
        }
        
    }
}

