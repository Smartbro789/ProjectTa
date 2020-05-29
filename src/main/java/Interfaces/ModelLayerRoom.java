package Interfaces;

import BTree.BPlusTree;
import Model.Room;

import java.util.ArrayList;

public interface ModelLayerRoom {

    BPlusTree<Room, Integer> selectAllNumbers();

    ArrayList<Room> selectAll();

    Room selectOne(int id);

    ArrayList<Room> selectByRoomType(String type);

    int insert(Room room);

    int update(Room room);

    int delete(int id);
}
