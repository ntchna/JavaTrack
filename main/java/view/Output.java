package view;


import model.HomeAppliances;

public class Output {

    private Input input;

    public Output(){
        input = new Input();
    }

    public void showMessage(String string){
        System.out.println(string);
    }

    public void showError(String string){
        System.out.println(string);
    }

    public void viewMenu(){
        System.out.println(("Menu"));
        System.out.println("1. Show a list of all home appliances");
        System.out.println("2. Show a list of home appliances of a given type");
        System.out.println("3. Show a list of home appliances with price less than 500UAH");
        System.out.println("4. Show a list of home appliances for a given company");
        System.out.println("5. Exit");
    }

    public int getMenuPoint(){
        int menuPoint;
        while (true) {
            menuPoint = input.getMenuPointForChoise(this);
            if (menuPoint != -1)
                return menuPoint;
        }
    }

    public String getGivenType(){
        String  givenType;
        while (true){
            givenType = input.inputGivenType(this);
            return givenType;
        }
    }


    public String getGivenCompany(){
        String givenCompany;
        while (true){
            givenCompany = input.inputGivenCompany(this);
            return givenCompany;
        }
    }

    public String getFilePath(){
       String filePath;
       while (true){
           filePath = input.inputFilePath(this);
           return filePath;
       }
    }

    public void displayAppliances (HomeAppliances[] appliances){
        if (appliances.length == 0){
            System.out.println("no appliances");
        }else {
            System.out.println("ID    || Type                        || Model            || Name                           || Company     || Quantity || Price  || Date\n");
            for (HomeAppliances homeAppliances : appliances) {
                System.out.println(homeAppliances);

            }
        }
    }


}
