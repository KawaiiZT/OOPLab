public class Fraction {
    public int topN;
    public int btmN;
    
    public String toFraction(){
        return topN + "/" + btmN;
    }
    public String toFloat(){
        return "" + ((double) topN  / btmN) ;
    }
    public void addFraction(Fraction f){
        if (this.btmN == f.btmN){
            this.topN = this.topN + f.topN;
        }
        else{
            this.topN = (this.topN * f.btmN) + (f.topN * this.btmN);
            this.btmN = this.btmN * f.btmN;
        }
    }
        
    public boolean myEquals(Fraction x){
        double valux = (double)x.topN / x.btmN;
        double valuy = (double) this.topN / this.btmN;
        if (valux != valuy){
            return false;
        } else {
            return true;
        }
    }
    public void LowestTermFrac(){
        int divide = _gcd(this.topN, this.btmN);
        this.topN = this.topN / divide;
        this.btmN = this.btmN / divide;
    }
    private int _gcd(int x , int y)
    {
        if (y == 0)
            return x;
        return _gcd(y, x % y);
    }
}
