package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraManager;

/* renamed from: com.pgl.ssdk.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1276t {
    public static int a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static int f16577b = -1;

    /* renamed from: com.pgl.ssdk.t$a */
    /* loaded from: classes4.dex */
    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            Context b3 = C1278v.b();
            int i10 = C1276t.f16577b;
            if (i10 == -1) {
                CameraManager cameraManager = (CameraManager) b3.getSystemService("camera");
                if (cameraManager != null) {
                    try {
                        C1276t.f16577b = cameraManager.getCameraIdList().length;
                    } catch (Throwable unused) {
                        C1276t.f16577b = -1;
                    }
                } else {
                    C1276t.f16577b = -2;
                }
                i10 = C1276t.f16577b;
            }
            C1276t.f16577b = i10;
            SharedPreferences a = L.a(C1278v.b());
            if (a != null) {
                a.edit().putInt("camera_count", C1276t.f16577b).apply();
            }
        }
    }

    public static int a() {
        int i10;
        int i11 = f16577b;
        if (i11 != -1) {
            return i11;
        }
        SharedPreferences a10 = L.a(C1278v.b());
        if (a10 != null && (i10 = a10.getInt("camera_count", -1)) != -1) {
            f16577b = i10;
            return i10;
        }
        AbstractC1260c.a(new a());
        return -1;
    }
}
