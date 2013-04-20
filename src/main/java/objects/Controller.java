package objects;

public class Controller
{
  String APIVersion; // Version of the Serial API
  String SDK; // System development kit version of the Transceiver firmware
  Boolean SISPresent; // ase if SUIS is available
  Integer SUCNodeId; // Node ID of SUC if present
  Integer ZWVersion; // ZWave Version 
  String ZWaveChip; // The name of the Z-Wave transceiver chip
  Integer ZWlibMajor; // library major version  
  Integer ZWlibMinor; // library minor version
  String capabilities; // array of function class ids TO CHANGE
  Integer controllerState; // ag to show inclusion mode etc
  Integer countJobs; // shall job be counted
  Integer curSerialAPIAckTimeout10ms; // timing parameter of serial interface
  Integer curSerialAPIBytetimeout10ms; // timing parameter of serial interface
  Integer homeId; //the home id of the controller
  Boolean isinOtherNetworks; // ag to show if controller is real primary if in other network
  Boolean isPrimary; // ag to show if controller is primary
  Boolean isRealprimary; // ag to show if controller can be primary
  Boolean isSUC; // is SUC present
  Integer lastExcludedDevice; // node ID of last excluded device
  Integer lastIncludedDevice; // node ID of last included device
  String libType; // library basis type
  Integer manufacturerIS;
  Integer manufacturerProductId;
  Integer manufacturerProductTypeId; // ids to identify the transceiver hardware
  String memoryGetAddress;
  String memoryGetData;
  Integer nodeId; // own node ID
  Integer nonManagementJobs; // number of non man. jobs
}
