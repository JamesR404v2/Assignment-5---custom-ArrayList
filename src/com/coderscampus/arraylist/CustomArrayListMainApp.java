package com.coderscampus.arraylist;


public class CustomArrayListMainApp {
    public static void main(String[] args) {
        System.out.println("app started.");
        CustomArrayListMainApp launch = new CustomArrayListMainApp();
        launch.Orchestrator();
    }


    public void Orchestrator()
    {
        System.out.println("app launched.");

//        use the CustomList interface to create a new CustomArrayList
        CustomList<String> myCustomList = new CustomArrayList<>();

//        add some items to the CustomArrayList
        myCustomList.add("Hello");
        myCustomList.add("World");
        myCustomList.add("!");



        myCustomList.add("test");

//        print out the size of the CustomArrayList
        System.out.println("Size of the CustomArrayList: " + myCustomList.getSize());

//        print out the items in the CustomArrayList
        for (int i = 0; i < myCustomList.getSize(); i++)
        {
            System.out.println(myCustomList.get(i));
        }

//        the test Trevor gave in the assignment description. 

myCustomList.add("element 1"); // and continue to add another 10, 20 or 40 more elements

// then you should validate that all the elements you've inserted actually exist in your data structure
for (int i=0; i<myCustomList.getSize(); i++) {
    System.out.println(myCustomList.get(i));
}


    }

}

