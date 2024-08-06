static void reverse(int[] a,int x,int y) 
  { 
    while(x<y) 
    { 
      int temp = a[x]; 
      a[x] = a[y]; 
      a[y] = temp; 
      x++; 
      y--; 
    } 
   
  static boolean sortArr(int[] a, int n) 
  { 
    int x = -1; 
    int y = -1; 
  
    for (int i = 0; i < n - 1; i++) { 
      if (a[i] > a[i + 1]) { 
        if (x == -1) { 
          x = i; // first index where ele greater than next element (probably last element of array)
        } 
        y = i + 1; 
      } 
    } 
  
    if (x != -1) { 
      reverse(a,x,y); 
      for (int i = 0; i < n - 1; i++) { 
        if (a[i] > a[i + 1]) { 
          return false; 
        } 
      } 
    } 
  
    return true; 
  } 
}
