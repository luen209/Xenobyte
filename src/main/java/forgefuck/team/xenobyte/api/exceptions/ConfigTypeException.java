package forgefuck.team.xenobyte.api.exceptions;

public class ConfigTypeException extends Exception {
    
    public ConfigTypeException(String type) {
        super("Тип [" + type + "] не реализован");
    }

}