/**
 *
 * @author mg
 */
public class Poire {
    private double prix;
    private String origine;
	
    public Poire() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Poire(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Poire de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 Poires sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Poire or = (Poire) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une Poire a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
	System.out.println("premier test Poire");
    Poire po = new Poire(3, "Bresil");
    Poire po2 = new Poire(2, "Espagne");
    Poire po3 = new Poire(2.0, "Espagne");
    System.out.println(po.toString());
    
    if(po.equals(po3)==true)
        System.out.println("Les deux Poires sont à un prix équivalent et de meme origine.");
    else
        System.out.println("Ces Poires sont différentes");


   }
}
