public class House {
    public String message = "A7#q 9mA$%2mn!!8my@4mt^6mh&1mi*3mn(0mgZ9m 4wfymt@7mh# 5ma$2mt!8m mmma%3mk^4me&6ms*1m Q12mm &2-me#7m mc$9mu!5mt@8m 6hM.mt^4mh&6me *3m R7mc@2mh#9me$5me!832ms^4me&6m.";

    MouseFood[] mousePantry = new MouseFood[18];
    public int matchServings = 0;
    public String finalMessage = "";

    public static void main(String[] args) {

        House house = new House();
    }

    public House(){

        System.out.println("Hello, mouse! Get out of my house!");

        for (int i = 0; i < mousePantry.length; i++) {

            mousePantry[i] = new MouseFood((int)(1+(Math.random()) * 201), (int)(10 + (Math.random()) * 491));

        }
        displayMousePantry();
        if (checkServings()){
            System.out.println("The mouse pantry has at least 2 snacks of the same serving");
        }
        else{
            System.out.println("The mouse pantry has less than 2 snacks of the same serving");
        }
        System.out.println(decipher(message));
        makeSmells();
        displayMousePantry();
    }

    public void displayMousePantry(){
        for (int i = 0; i < mousePantry.length; i++) {

            mousePantry[i].PrintInfo();
            System.out.println();

        }
    }

    public boolean checkServings(){
    matchServings = 0;

        for (int x = 0; x < mousePantry.length; x++) {
            for (int y = 0; y < mousePantry.length; y++) {
                if(mousePantry[x].getServings() == mousePantry[y].getServings() && x != y){
                        matchServings++;
                }
            }
        }
        System.out.println(matchServings);
        return matchServings >= 2;

    }

    public String decipher(String message){
        String[] decipher = message.split("m");

        for (int i = 1; i < decipher.length; i++) {
            if(decipher[i].length() == 0) {
                finalMessage += "m";
            }
            else{
                decipher[i] = decipher[i].substring(0, 1);
                finalMessage += decipher[i];
            }
        }
        return finalMessage;
    }

    public void makeSmells(){

        for (int i = 0; i < mousePantry.length; i++) {
            mousePantry[i].setSmellFactor((int)(10 + (Math.random()) * 491));
        }

        for (int i = 0; i < mousePantry.length; i++) {
            for (int j = 0; j < mousePantry.length; j++) {
                if(mousePantry[i] == mousePantry[j] && i != j){
                    mousePantry[i].setSmellFactor((int)(10 + (Math.random()) * 491));
                }
            }
        }
    }
}
