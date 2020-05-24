package Model;

public class Room {

    private int roomId;
    private int roomNumber;
    private boolean roomStatus;
    private String roomType;
    private int roomPrice;
    private String roomDescription;

    public Room(int roomNumber, boolean roomStatus, String roomType, int roomPrice, String roomDescription) {
        this.roomNumber = roomNumber;
        this.roomStatus = roomStatus;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.roomDescription = roomDescription;
    }

    public Room(int roomId, int roomNumber, boolean roomStatus, String roomType, int roomPrice, String roomDescription) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.roomStatus = roomStatus;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.roomDescription = roomDescription;
    }

    public int getRoomId() {
        return roomId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean getRoomStatus() {
        return roomStatus;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getRoomPrice() {
        return roomPrice;
    }

    public String getRoomDescription() {
        return roomDescription;
    }
}
