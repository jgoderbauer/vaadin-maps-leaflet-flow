package software.xdev.vaadin.maps.leaflet.flow.data.base;

import elemental.json.JsonObject;

public interface CanConvertToJson {
    /**
     * The json data for e.g. adding the component to a map or options for a Layer Control.
     * @return Element to transfer to the clientside
     */
    JsonObject toJson();
}