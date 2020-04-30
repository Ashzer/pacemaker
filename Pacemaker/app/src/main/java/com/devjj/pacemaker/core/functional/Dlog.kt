package com.devjj.pacemaker.core.functional

import android.util.Log
import com.devjj.pacemaker.AndroidApplication

class Dlog {
    val TAG = "Debug Log"

    /** Log Level Error **/
    fun e(message: String) {
        if (AndroidApplication.DEBUG)
            Log.e(TAG, buildLogMsg(message))
    }

    /** Log Level Warning **/
    fun w(message: String) {
        if (AndroidApplication.DEBUG)
            Log.w(TAG, buildLogMsg(message))
    }

    /** Log Level Information **/
    fun i(message: String) {
        if (AndroidApplication.DEBUG)
            Log.i(TAG, buildLogMsg(message))
    }
    /** Log Level Debug **/
    fun d(message: String) {
        if (AndroidApplication.DEBUG) {
            Log.d(TAG, buildLogMsg(message))
        }
    }
    /** Log Level Verbose **/
    fun v(message: String) {
        if (AndroidApplication.DEBUG)
            Log.v(TAG, buildLogMsg(message))
    }

    private fun buildLogMsg(message: String) : String {
        val ste = Thread.currentThread().stackTrace[4]

        val sb = StringBuilder()

        sb.append("[")
        sb.append(ste.fileName.replace(".java", ""))
        sb.append("::")
        sb.append(ste.methodName)
        sb.append("]")
        sb.append(message)

        return sb.toString()
    }
}