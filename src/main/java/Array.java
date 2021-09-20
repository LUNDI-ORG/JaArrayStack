public class Array {
     String [] a;
    int n;
    int x = (2*n);
    String [] b = new String[(n*2)];
    
    public Array(int np){
        n=np;
        a = new String[n];
    }
    public int size(){
        return n;
    }
    public void set(int i, String x){
        if ((i>=0) && (i<n)){a[i] = x;}
    }
    public String get(int i){
        String r = "Out of bound";
        if ((i>=0) && (i<n)){r=a[i];}
        return (r);
    } 
    public void add(int i, String name){
        if (n + 1 > a.length)
            resize();
        for  (int j = n; j > i; j--)
            a[j] = a[j-1];
            a[i] = name;
            n++;
    }
    public String remove(int i){
        String x = a[i];
        for (int j = i; j< n-1; j++)
            a[j] = a[j + 1];
        n--;
        if (a.length >= 3*n)resize();
        return x;
    }
    public void resize(){
        String [] b = new String[Math.max(n*2, 1)];
        for (int i = 0; i < n; i++){
            b[i] = a[i];
        }
        a = b;
    }

         
}
