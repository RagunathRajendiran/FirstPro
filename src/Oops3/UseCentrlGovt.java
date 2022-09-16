package Oops3;

public class UseCentrlGovt {
  public static void main(String[] args) {
	//TNGovt t=new TNGovt();
	//KeralaGovt k=new KeralaGovt();
	//System.out.println(t.numberPlateSize()+" "+t.typeOfFit()+" "+t.color()+" "+t.isINDStricker()+" "+t.tag()+" "+t.bant());
//	System.out.println(k.numberPlateSize()+" "+k.typeOfFit()+" "+k.color()+" "+k.isINDStricker()+" "+k.tag()+" "+k.plateFixingSide());
	Distric d=new Distric();
	System.out.println(d.numberPlateSize()+" "+d.typeOfFit()+" "+d.color()+" "+d.isINDStricker()+" "+d.tag()+" "+d.bant()+" "+d.districCode());
    KochinDistric kd=new KochinDistric();
    System.out.println(kd.numberPlateSize()+" "+kd.typeOfFit()+" "+kd.color()+" "+kd.isINDStricker()+" "+kd.tag()+" "+kd.plateFixingSide()+" "+kd.disrticCode());
  
  }
	

}
