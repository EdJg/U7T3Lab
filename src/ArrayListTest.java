import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest
{
    public static void main(String[] args)
    {
//        ArrayList<String> names = new ArrayList<String>();
//        names.add("Jamal");
//        names.add("Emily");
//        names.add("Destiny");
//        names.add("Mateo");
//
//        //COMPLETE ME: print each name using an index based for loop
//        for (int index = 0; index < names.size(); index ++)
//        {
//            System.out.println(names.get(index));
//        }
//        //COMPLETE ME: print each name (again!) using enhanced for loop
//        for (String person: names)
//        {
//            System.out.println(person);
//        }
//        //COMPLETE ME: print each name (a third time!) using a while loop
//        int i = 1;
//        while (i < names.size())
//        {
//            System.out.println(names.get(i));
//            i ++;
//        }
        /////////////

//        ArrayList<Cat> catList = new ArrayList<Cat>();
//        catList.add(new Cat("Patty"));
//        catList.add(new Cat("Keith"));
//        catList.add(new Cat("Jerry"));
//        catList.add(new Cat("Mary"));
//
//        // COMPLETE ME: print each Cat’s name using a
//        // standard for loop
//        for (int index = 0; index < catList.size(); index ++)
//        {
//            System.out.println(catList.get(index).getName());
//        }
//        // COMPLETE ME: print each Cat’s name using an
//        // enhanced for loop
//        for (Cat cat: catList)
//        {
//            System.out.println(cat.getName());
//        }

        //////

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(nums));
        for (int index = 1; index < numList.size(); index ++)
        {
            if (index + 1 == numList.size())
            {
                index = numList.size();
            }
            else
            {
                numList.set(index - 1, numList.get(index) + numList.get(index + 1));
            }
        }
        System.out.println(numList);
    }
}
