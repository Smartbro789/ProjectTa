package Interfaces;

import Model.Room;

import java.util.ArrayList;

public interface ModelLayerRoom {

    ArrayList<Room> selectAll();

    Room selectOne(int id);

    int insert(Room room);

    int update(Room room);

    int delete(int id);
}
