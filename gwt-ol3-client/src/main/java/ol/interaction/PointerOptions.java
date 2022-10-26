package ol.interaction;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.GenericFunction;
import ol.MapBrowserEvent;
import ol.Options;
import ol.VoidFunction;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class PointerOptions implements Options {

    /**
     * Function handling "down" events. If the function returns true then a drag
     * sequence is started.
     * 
     * @param func
     */
    @JsProperty
    public native void setHandleDownEvent(GenericFunction<MapBrowserEvent, Boolean> func);

    /**
     * 
     * 
     * Function handling "drag" events. This function is called on "move" events
     * during a drag sequence.
     * 
     * @param func
     */
    @JsProperty
    public native void setHandleDragEvent(VoidFunction<MapBrowserEvent> func);

    /**
     * Function handling "move" events. This function is called on "move" events.
     * This functions is also called during a drag sequence, so during a drag
     * sequence both the handleDragEvent function and this function are called. If
     * handleDownEvent is defined and it returns true this function will not be
     * called during a drag sequence.
     * 
     * @param func
     */
    @JsProperty
    public native void setHandleMoveEvent(VoidFunction<MapBrowserEvent> func);

    /**
     * Function handling "up" events. If the function returns false then the current
     * drag sequence is stopped.
     * 
     * @param func
     */
    @JsProperty
    public native void setHandleUpEvent(GenericFunction<MapBrowserEvent, Boolean> func);

    /**
     * Should the down event be propagated to other interactions, or should be
     * stopped?
     * 
     * @param func
     */
    @JsProperty
    public native void setStopDown(GenericFunction<MapBrowserEvent, Boolean> func);

}
