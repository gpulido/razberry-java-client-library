package objects;

public class Device
{
  Integer basicType;
  Integer genericType; 
  Integer specificType; 
  Integer infoProtocolSpecific;
  String deviceTypeString;
  Boolean isVirtual;
  Boolean isListening;
  Boolean isRouting;
  Boolean isAwake";
  Boolean optional;
  Boolean isFailed;
  Boolean beam;
  Boolean sensor250;
  Boolean sensor1000;
  String neighbours; // NOTE in json it's "binary" - array of integer
  Integer manufacturerId;
  String vendorString;
  Integer manufacturerProductType;
  Integer manufacturerProductId;
  Integer ZWLib;
  Integer ZWProtocolMajor;
  Integer ZWProtocolMinor;
  String SDK;
  Integer applicationMajor;
  Integer applicationMinor;
  String nodeInfoFrame; // NOTE in json it's "binary type" e.g. values [ 114, 96, 134, 143, 38, 152, 119, 32 ]
  String ZDDXML;
  String ZDDXMLLang;
  String ZDDXMLFile;
  Integer lastSend;
  Integer lastReceived;
  Boolean keepAwake;
  Integer countSuccess;
  Integer countFailed;
  Integer queueLength;
  String networkKey; // NOTE in json it's "binary type" e.g. values [ 114, 96, 134, 143, 38, 152, 119, 32 ]
  Integer secureControllerId;

}
