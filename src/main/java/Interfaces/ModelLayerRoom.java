package Interfaces;

import Model.Room;
import Tree.RedBlackTree;

public interface ModelLayerRoom {

    RedBlackTree selectAllNumbers();

    Room selectOne(int id);

    int insert(Room room);

    int update(Room room);

    int delete(int id);
}
