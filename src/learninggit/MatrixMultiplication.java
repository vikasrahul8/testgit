package learninggit;

class MatrixMultiplication{
public static void main(String args[]){
int a[][]={{1,3,2},{4,5,2},{6,0,1}};
int b[][]={{1,3,2},{4,5,2},{6,0,1}};
int c[][]=new int[3][3];
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
for(int k=0;k<3;k++){
c[i][j] = c[i][j]+a[i][j]*b[k][i];
}
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}