package x.app.common

/**
 *   @Project: base
 *   @Package: x.app.common
 *   @Author:  Iamee
 *   @Date:    2019-04-27 23:10
 */
abstract class AbstractCommand<T : AbstractResult> : Identifiable {

    @Suppress("UNCHECKED_CAST")
    fun covert(obj: Any): T {
        return obj as T
    }

}