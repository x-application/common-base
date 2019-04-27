package x.app.common

import java.lang.RuntimeException

/**
 *   @Project: base
 *   @Package: x.app.common
 *   @Author:  Iamee
 *   @Date:    2019-04-27 23:11
 */
abstract class AbstractException : RuntimeException {

    abstract val code: Int

    constructor()

    constructor(message: String) : super(message)

    constructor(cause: Throwable) : super(cause)

}