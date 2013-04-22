package objects;

public class CommandClass
{
  Integer id; //: Id of the Command Class of the instance of the device
  Integer interviewCounter;// number of attempts left until interview is terminate even if not successful
  Boolean interviewDone; // ag if interview of the command class is nished
  Boolean security; // ag if command class is operated under special security mode
  String version; // version of the command class implemented
  Boolean supported; // ag if CC is supported or only controlled
  String name; //: Command Class name
  String Method; // Command Class method
}
