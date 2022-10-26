package ol;

import jsinterop.annotations.JsFunction;

/**
 * @author grandeemme
 *
 * @param <T> type of the functions input parameter
 */
@FunctionalInterface
@JsFunction
public interface VoidFunction<T> {
	void call(T object);
}
