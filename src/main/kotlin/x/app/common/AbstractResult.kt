package x.app.common

/**
 *   @Project: service-account
 *   @Package: x.app.common
 *   @Author:  Iamee
 *   @Date:    2019-04-29 23:45
 */
abstract class AbstractResult {

    open val success: Boolean = true

    open var exception: AbstractException? = null
}