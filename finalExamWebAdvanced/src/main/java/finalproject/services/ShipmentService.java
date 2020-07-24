package finalproject.services;

import finalproject.models.entities.SenderOrRecipient;
import finalproject.models.entities.Shipment;
import finalproject.models.serviceModels.SenderOrRecipientServiceModel;
import finalproject.models.serviceModels.ShipmentServiceModel;
import finalproject.models.serviceModels.UserServiceModel;

import java.util.List;

public interface ShipmentService {
    ShipmentServiceModel addSender(ShipmentServiceModel shipSerMod,
                                   SenderOrRecipientServiceModel sender,SenderOrRecipientServiceModel recipient);

    ShipmentServiceModel addRecipient(ShipmentServiceModel shipSerMod);

    UserServiceModel addUser(UserServiceModel userServiceModel);

    List<Shipment>findAllByRecipients(String email, boolean isSender);

    //boolean findByEmail(String email);

    //List<Shipment> allShipmentsOnUserRecipient(String  email,boolean isSender);
}