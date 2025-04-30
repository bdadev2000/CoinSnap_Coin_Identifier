package com.mbridge.msdk.shake;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.i;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private SensorManager f17744a;

    /* renamed from: com.mbridge.msdk.shake.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0189a {

        /* renamed from: a, reason: collision with root package name */
        static a f17745a = new a();
    }

    public static a a() {
        return C0189a.f17745a;
    }

    public final void b(SensorEventListener sensorEventListener) {
        SensorManager sensorManager = this.f17744a;
        if (sensorManager != null) {
            try {
                sensorManager.unregisterListener(sensorEventListener);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    private a() {
    }

    public final void a(SensorEventListener sensorEventListener) {
        Context c9 = c.m().c();
        if (c9 != null) {
            try {
                if (this.f17744a == null) {
                    this.f17744a = (SensorManager) c9.getSystemService("sensor");
                }
                this.f17744a.registerListener(sensorEventListener, this.f17744a.getDefaultSensor(1), 2);
            } catch (Exception e4) {
                e4.printStackTrace();
                String message = e4.getMessage();
                try {
                    if (TextUtils.isEmpty(message)) {
                        return;
                    }
                    StringBuffer stringBuffer = new StringBuffer("key=2000106&");
                    if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15673U)) {
                        stringBuffer.append("b=" + com.mbridge.msdk.foundation.same.a.f15673U + "&");
                    }
                    if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15681g)) {
                        stringBuffer.append("c=" + com.mbridge.msdk.foundation.same.a.f15681g + "&");
                    }
                    stringBuffer.append("reason=" + message);
                    i.a(c9, stringBuffer.toString());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }
}
