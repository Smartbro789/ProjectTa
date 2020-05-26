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
}
