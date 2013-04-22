package objects;

public class Instance
{
  Integer length; // Length of the list
  Array <CommandClass> commandClasses; // list of command classes of this instance. In case there is only one instance, this is equivalent to the list of command classes of the device.
  Boolean dynamic; // ag if instance is dynamic
  String genericType; // generic Z-Wave device class of instance
  String specificType; // specific Z-Wave device class of instance
}
