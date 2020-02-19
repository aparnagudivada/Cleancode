public class House1 {
    int mstandard;
    int area;
    boolean automated;
    int p;

    public House1(int m,int a, boolean f) {
    	mstandard=m;
    	area=a;
    	automated=f;
      }
   public  int calculateConstructionCost() {
	   
	   
	   
	   if(mstandard==1)
	   {
		   p=(area*1200);
	   }
	   if(mstandard==2)
	   {
		   p=(area*1500);
	   }
	   if(mstandard==3)
	   {
		   p= (area*1800);
	   }
	   if(mstandard==4 && automated==true)
	   {
		   p= (area*2500);
	   }
	   if(automated==true && mstandard!=4)
	   {
		   p=-1;
	   }
	return p;
   }
}