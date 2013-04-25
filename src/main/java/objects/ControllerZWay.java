package objects;

/**
 * Created with IntelliJ IDEA.
 * User: gpt
 * Date: 25/04/13
 * Time: 18:39
 * To change this template use File | Settings | File Templates.
 */
public class ControllerZWay {

    private Data APIVersion; // Version of the Serial API
    private Data SDK; // System development kit version of the Transceiver firmware
    private Data SISPresent; // ase if SUIS is available
    private Data SUCNodeId; // Node ID of SUC if present
    private Data ZWVersion; // ZWave Version
    private Data ZWaveChip; // The name of the Z-Wave transceiver chip
    private Data ZWlibMajor; // library major version
    private Data ZWlibMinor; // library minor version
    private Data capabilities; // array of function class ids TO CHANGE
    private Data controllerState; // ag to show inclusion mode etc
    private Data countJobs; // shall job be counted
    private Data curSerialAPIAckTimeout10ms; // timing parameter of serial interface
    private Data curSerialAPIBytetimeout10ms; // timing parameter of serial interface
    private Data homeId; //the home id of the controller
    private Data isinOtherNetworks; // ag to show if controller is real primary if in other network
    private Data isPrimary; // ag to show if controller is primary
    private Data isRealprimary; // ag to show if controller can be primary
    private Data isSUC; // is SUC present
    private Data lastExcludedDevice; // node ID of last excluded device
    private Data lastIncludedDevice; // node ID of last included device
    private Data libType; // library basis type
    private Data manufacturerIS;
    private Data manufacturerProductId;
    private Data manufacturerProductTypeId; // ids to identify the transceiver hardware
    private Data memoryGetAddress;
    private Data memoryGetData;
    private Data nodeId; // own node ID
    private Data nonManagementJobs; // number of non man. jobs

    public String getAPIVersion() {
        return (String)APIVersion.value;
    }

    public String getSDK() {
        return (String)SDK.value;
    }

    public Boolean getSISPresent() {
        return (Boolean)SISPresent.value;
    }

    public Integer getSUCNodeId() {
        return (Integer)SUCNodeId.value;
    }

    public Integer getZWVersion() {
        return (Integer)ZWVersion.value;
    }

    public String getZWaveChip() {
        return (String)ZWaveChip.value;
    }

    public Integer getZWlibMajor() {
        return (Integer)ZWlibMajor.value;
    }

    public Integer getZWlibMinor() {
        return (Integer)ZWlibMinor.value;
    }

    public String getCapabilities() {
        return (String)capabilities.value;
    }

    public Integer getControllerState() {
        return (Integer)controllerState.value;
    }

    public Integer getCountJobs() {
        return (Integer)countJobs.value;
    }

    public Integer getCurSerialAPIAckTimeout10ms() {
        return (Integer)curSerialAPIAckTimeout10ms.value;
    }

    public Integer getCurSerialAPIBytetimeout10ms() {
        return (Integer)curSerialAPIBytetimeout10ms.value;
    }

    public Integer getHomeId() {
        return (Integer)homeId.value;
    }

    public Boolean getIsinOtherNetworks() {
        return (Boolean)isinOtherNetworks.value;
    }

    public Boolean getPrimary() {
        return (Boolean)isPrimary.value;
    }

    public Boolean getRealprimary() {
        return (Boolean)isRealprimary.value;
    }

    public Boolean getSUC() {
        return (Boolean)isSUC.value;
    }

    public Integer getLastExcludedDevice() {
        return (Integer)lastExcludedDevice.value;
    }

    public Integer getLastIncludedDevice() {
        return (Integer)lastIncludedDevice.value;
    }

    public String getLibType() {
        return (String)libType.value;
    }

    public Integer getManufacturerIS() {
        return (Integer)manufacturerIS.value;
    }

    public Integer getManufacturerProductId() {
        return (Integer)manufacturerProductId.value;
    }

    public Integer getManufacturerProductTypeId() {
        return (Integer)manufacturerProductTypeId.value;
    }

    public String getMemoryGetAddress() {
        return (String)memoryGetAddress.value;
    }

    public String getMemoryGetData() {
        return (String)memoryGetData.value;
    }

    public Integer getNodeId() {
        return (Integer)nodeId.value;
    }

    public Integer getNonManagementJobs() {
        return (Integer)nonManagementJobs.value;
    }
}
