package Sort;

import Model.Room;

import java.util.ArrayList;

class QuickSort {

    public ArrayList<Room> quicksort(ArrayList<Room> input){

        if(input.size() <= 1){
            return input;
        }

        int middle = (int) Math.ceil((double)input.size() / 2);
        Room pivot = input.get(middle);

        ArrayList<Room> less = new ArrayList<>();
        ArrayList<Room> greater = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            if(input.get(i).getRoomPrice() <= pivot.getRoomPrice()){
                if(i == middle){
                    continue;
                }
                less.add(input.get(i));
            }
            else{
                greater.add(input.get(i));
            }
        }
        return concatenate(quicksort(less), pivot, quicksort(greater));
    }

    private ArrayList<Room> concatenate(ArrayList<Room> less, Room pivot, ArrayList<Room> greater){

        ArrayList<Room> list = new ArrayList<Room>(less);
        list.add(pivot);
        list.addAll(greater);

        return list;
    }
}
