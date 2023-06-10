/*

take integer an argument and count the digit.

*/

int CountDigit(int x){
    int result = 0;
    while(x>0){
        x=x/10;
        result++;
    }
    return result;
}
