package com.google.ar.core;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Handler;

/* renamed from: com.google.ar.core.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1864j extends CameraCaptureSession.StateCallback {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f14300d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f14301a;
    public final /* synthetic */ CameraCaptureSession.StateCallback b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SharedCamera f14302c;

    public C1864j(SharedCamera sharedCamera, Handler handler, CameraCaptureSession.StateCallback stateCallback) {
        this.f14301a = handler;
        this.b = stateCallback;
        this.f14302c = sharedCamera;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.f14301a.post(new B3.b(7, this.b, cameraCaptureSession, 3));
        this.f14302c.g(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.f14301a.post(new B3.b(8, this.b, cameraCaptureSession, 3));
        this.f14302c.h(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.f14301a.post(new B3.b(5, this.b, cameraCaptureSession, 3));
        this.f14302c.i(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.f14301a.post(new B3.b(4, this.b, cameraCaptureSession, 3));
        SharedCamera sharedCamera = this.f14302c;
        sharedCamera.j(cameraCaptureSession);
        if (sharedCamera.n().f14303a != null) {
            sharedCamera.c();
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.f14301a.post(new B3.b(6, this.b, cameraCaptureSession, 3));
        this.f14302c.k(cameraCaptureSession);
    }
}
