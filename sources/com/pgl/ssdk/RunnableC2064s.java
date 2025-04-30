package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.pgl.ssdk.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2064s implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        Context b = v.b();
        int i9 = C2065t.b;
        if (i9 == -1) {
            CameraManager cameraManager = (CameraManager) b.getSystemService("camera");
            if (cameraManager != null) {
                try {
                    C2065t.b = cameraManager.getCameraIdList().length;
                } catch (Throwable unused) {
                    C2065t.b = -1;
                }
            } else {
                C2065t.b = -2;
            }
            i9 = C2065t.b;
        }
        C2065t.b = i9;
        SharedPreferences a6 = K.a(v.b());
        if (a6 != null) {
            a6.edit().putInt("camera_count", C2065t.b).apply();
        }
    }
}
