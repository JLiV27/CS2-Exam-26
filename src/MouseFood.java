public class MouseFood {
    private int servings;
    private int smellFactor;

    public MouseFood(int pServings, int pSmellFactor){
        servings = pServings;
        smellFactor = pSmellFactor;

    }

    public int getServings(){
        return servings;
    }

    public int getSmellFactor(){
        return smellFactor;
    }

    public void setServings(int pServings){
        servings = pServings;
    }

    public void setSmellFactor(int pSmellFactor){
        smellFactor = pSmellFactor;
    }

    public void PrintInfo(){

        System.out.println("Servings: " + servings + "\n" +
                "Smell Factor: " + smellFactor);

    }
}
