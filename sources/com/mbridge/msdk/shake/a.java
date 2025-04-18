package com.mbridge.msdk.shake;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.i;

/* loaded from: classes4.dex */
public final class a {
    private SensorManager a;

    /* renamed from: com.mbridge.msdk.shake.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0201a {
        static a a = new a();
    }

    public static a a() {
        return C0201a.a;
    }

    public final void b(SensorEventListener sensorEventListener) {
        SensorManager sensorManager = this.a;
        if (sensorManager != null) {
            try {
                sensorManager.unregisterListener(sensorEventListener);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private a() {
    }

    public final void a(SensorEventListener sensorEventListener) {
        Context c10 = c.m().c();
        if (c10 != null) {
            try {
                if (this.a == null) {
                    this.a = (SensorManager) c10.getSystemService("sensor");
                }
                this.a.registerListener(sensorEventListener, this.a.getDefaultSensor(1), 2);
            } catch (Exception e2) {
                e2.printStackTrace();
                String message = e2.getMessage();
                try {
                    if (TextUtils.isEmpty(message)) {
                        return;
                    }
                    StringBuffer stringBuffer = new StringBuffer("key=2000106&");
                    if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.U)) {
                        stringBuffer.append("b=" + com.mbridge.msdk.foundation.same.a.U + "&");
                    }
                    if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f13276g)) {
                        stringBuffer.append("c=" + com.mbridge.msdk.foundation.same.a.f13276g + "&");
                    }
                    stringBuffer.append("reason=" + message);
                    i.a(c10, stringBuffer.toString());
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
    }
}
