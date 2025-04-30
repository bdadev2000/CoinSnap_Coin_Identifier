package com.google.ar.core;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;

/* renamed from: com.google.ar.core.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1863i extends CameraDevice.StateCallback {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f14297d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f14298a;
    public final /* synthetic */ CameraDevice.StateCallback b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SharedCamera f14299c;

    public C1863i(SharedCamera sharedCamera, Handler handler, CameraDevice.StateCallback stateCallback) {
        this.f14298a = handler;
        this.b = stateCallback;
        this.f14299c = sharedCamera;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        this.f14298a.post(new B3.b(3, this.b, cameraDevice, 3));
        this.f14299c.e(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f14298a.post(new B3.b(2, this.b, cameraDevice, 3));
        this.f14299c.f(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i9) {
        this.f14298a.post(new B3.b(i9, this.b, cameraDevice, 4));
        this.f14299c.b();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        SharedCamera sharedCamera = this.f14299c;
        sharedCamera.n().f14303a = cameraDevice;
        this.f14298a.post(new B3.b(0, this.b, cameraDevice, 3));
        sharedCamera.d(cameraDevice);
        sharedCamera.n().f14304c = sharedCamera.l();
        sharedCamera.n().f14305d = sharedCamera.m();
    }
}
