package Interfaces;

import BTree.BPlusTree;
import Model.Room;

public interface ModelLayerRoom {

    BPlusTree<Room, Integer> selectAllNumbers();

    Room selectOne(int id);

    int insert(Room room);

    int update(Room room);

    int delete(int id);
}
