package Service;

import Interfaces.ModelLayerRoom;
import Interfaces.RoomProcessorInterface;
import Model.Room;
import Repository.RoomModel;

public class RoomProcessor implements RoomProcessorInterface {

    ModelLayerRoom modelRoom = new RoomModel();

    @Override
    public void addRoom(int number, String type, int price, String description){
        Room room = new Room(number, false, type, price, description);
        modelRoom.insert(room);
    }

    @Override
    public Room selectOne(int id){
        return modelRoom.selectOne(id);
    }

    @Override
    public void editRoom(int id, int number, boolean status, String type, int price, String description){
        Room room = new Room(id, number, status, type, price, description);
        modelRoom.update(room);
    }

    @Override
    public void delete(int id){
        modelRoom.delete(id);
    }
}
