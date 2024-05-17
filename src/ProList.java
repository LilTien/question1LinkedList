public class ProList {

    private String proCode;
    private String expDate;
    private String distributor;
    private double sellingPrice;

    public ProList(String p, String e, String d, double sp){
        proCode =p;
        expDate = e;
        distributor =d ;
        sellingPrice =sp;
    }
    public String getCode(){
        return  proCode;
    }
    public String getExpDate(){
        return  expDate;
    }
    public String getDist(){
        return distributor;
    }
    public double getSellingPrice(){
        return  sellingPrice;
    }

    public String toString(){
        return "\ncode:" + proCode + "\nExp date: " + expDate + "\nDistribution : " + distributor +"\nSelling Price: "+ sellingPrice;
    }


}
