package com.lanpn.englishforkids

import android.graphics.drawable.BitmapDrawable
import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import com.lanpn.englishforkids.handlers.GcpHandler
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.*

@RunWith(AndroidJUnit4::class)
class GCPTest {
    @Test
    fun test_api_call() {
        val appContext = InstrumentationRegistry.getTargetContext()
        val key = appContext.resources.getString(R.string.gcp_api_key)
        val d = appContext.resources.getDrawable(R.mipmap.test) as BitmapDrawable
        val bitmap = d.bitmap

        val handler = GcpHandler(key)
        handler.handleImage(bitmap)
        while (true) {}
    }
}