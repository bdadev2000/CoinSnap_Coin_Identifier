package com.google.ar.core;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class SharedCamera {
    private static final String TAG = "ArSdk-SharedCamera";
    private final Session session;
    private Handler sharedCameraHandler;
    private final k sharedCameraInfo = new k();
    private boolean cameraSharedWithAr = false;

    public SharedCamera(Session session) {
        HandlerThread handlerThread = new HandlerThread("SharedCameraHandlerThread");
        handlerThread.start();
        this.sharedCameraHandler = new Handler(handlerThread.getLooper());
        this.session = session;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: close, reason: merged with bridge method [inline-methods] */
    public void b() {
        Handler handler = this.sharedCameraHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.sharedCameraHandler.getLooper().quit();
            this.sharedCameraHandler = null;
        }
    }

    private ImageReader getCpuImageReader() {
        return nativeSharedCameraGetImageReader(this.session.nativeWrapperHandle, this.sharedCameraInfo.f14303a);
    }

    private ImageReader getCpuImageReaderMotionTracking() {
        return nativeSharedCameraGetImageReaderMotionTracking(this.session.nativeWrapperHandle, this.sharedCameraInfo.f14303a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getGpuSurface, reason: merged with bridge method [inline-methods] */
    public Surface m() {
        return nativeSharedCameraGetSurface(this.session.nativeWrapperHandle, this.sharedCameraInfo.f14303a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getGpuSurfaceTexture, reason: merged with bridge method [inline-methods] */
    public SurfaceTexture l() {
        return nativeSharedCameraGetSurfaceTexture(this.session.nativeWrapperHandle, this.sharedCameraInfo.f14303a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setDummyOnImageAvailableListener$0(ImageReader imageReader) {
        Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            acquireLatestImage.close();
        }
    }

    private native void nativeSharedCameraCaptureSessionActive(long j7, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionClosed(long j7, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionConfigureFailed(long j7, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionConfigured(long j7, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionReady(long j7, CameraCaptureSession cameraCaptureSession);

    private native ImageReader nativeSharedCameraGetImageReader(long j7, CameraDevice cameraDevice);

    private native ImageReader nativeSharedCameraGetImageReaderMotionTracking(long j7, CameraDevice cameraDevice);

    private native Surface nativeSharedCameraGetSurface(long j7, CameraDevice cameraDevice);

    private native SurfaceTexture nativeSharedCameraGetSurfaceTexture(long j7, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnClosed(long j7, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnDisconnected(long j7, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnOpened(long j7, CameraDevice cameraDevice);

    private native void nativeSharedCameraSetAppSurfaces(long j7, String str, List<Surface> list);

    private native void nativeSharedCameraSetCaptureCallback(long j7, CameraCaptureSession.CaptureCallback captureCallback, Handler handler);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCaptureSessionActive, reason: merged with bridge method [inline-methods] */
    public void g(CameraCaptureSession cameraCaptureSession) {
        nativeSharedCameraCaptureSessionActive(this.session.nativeWrapperHandle, cameraCaptureSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCaptureSessionClosed, reason: merged with bridge method [inline-methods] */
    public void h(CameraCaptureSession cameraCaptureSession) {
        nativeSharedCameraCaptureSessionClosed(this.session.nativeWrapperHandle, cameraCaptureSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCaptureSessionConfigureFailed, reason: merged with bridge method [inline-methods] */
    public void i(CameraCaptureSession cameraCaptureSession) {
        nativeSharedCameraCaptureSessionConfigureFailed(this.session.nativeWrapperHandle, cameraCaptureSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCaptureSessionConfigured, reason: merged with bridge method [inline-methods] */
    public void j(CameraCaptureSession cameraCaptureSession) {
        nativeSharedCameraCaptureSessionConfigured(this.session.nativeWrapperHandle, cameraCaptureSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCaptureSessionReady, reason: merged with bridge method [inline-methods] */
    public void k(CameraCaptureSession cameraCaptureSession) {
        nativeSharedCameraCaptureSessionReady(this.session.nativeWrapperHandle, cameraCaptureSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onDeviceClosed, reason: merged with bridge method [inline-methods] */
    public void e(CameraDevice cameraDevice) {
        nativeSharedCameraOnClosed(this.session.nativeWrapperHandle, cameraDevice);
        this.cameraSharedWithAr = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onDeviceDisconnected, reason: merged with bridge method [inline-methods] */
    public void f(CameraDevice cameraDevice) {
        nativeSharedCameraOnDisconnected(this.session.nativeWrapperHandle, cameraDevice);
        this.cameraSharedWithAr = false;
        this.sharedCameraInfo.f14303a = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onDeviceOpened, reason: merged with bridge method [inline-methods] */
    public void d(CameraDevice cameraDevice) {
        this.sharedCameraInfo.f14303a = cameraDevice;
        this.cameraSharedWithAr = true;
        nativeSharedCameraOnOpened(this.session.nativeWrapperHandle, cameraDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDummyListenerToAvoidImageBufferStarvation, reason: merged with bridge method [inline-methods] */
    public void c() {
        setDummyOnImageAvailableListener(getCpuImageReader());
        setDummyOnImageAvailableListener(getCpuImageReaderMotionTracking());
    }

    private void setDummyOnImageAvailableListener(ImageReader imageReader) {
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(l.f14306a, this.sharedCameraHandler);
        }
    }

    public CameraDevice.StateCallback createARDeviceStateCallback(CameraDevice.StateCallback stateCallback, Handler handler) {
        return new C1863i(this, handler, stateCallback);
    }

    public CameraCaptureSession.StateCallback createARSessionStateCallback(CameraCaptureSession.StateCallback stateCallback, Handler handler) {
        return new C1864j(this, handler, stateCallback);
    }

    public List<Surface> getArCoreSurfaces() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.sharedCameraInfo.f14305d);
        ImageReader cpuImageReaderMotionTracking = getCpuImageReaderMotionTracking();
        if (cpuImageReaderMotionTracking != null) {
            arrayList.add(cpuImageReaderMotionTracking.getSurface());
        }
        arrayList.add(getCpuImageReader().getSurface());
        return arrayList;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.sharedCameraInfo.f14304c;
    }

    public final /* synthetic */ k n() {
        return this.sharedCameraInfo;
    }

    public void pause() {
        if (this.sharedCameraInfo.f14303a != null) {
            c();
        }
    }

    public void setAppSurfaces(String str, List<Surface> list) {
        this.sharedCameraInfo.b.put(str, list);
        nativeSharedCameraSetAppSurfaces(this.session.nativeWrapperHandle, str, list);
    }

    public void setCaptureCallback(CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        nativeSharedCameraSetCaptureCallback(this.session.nativeWrapperHandle, captureCallback, handler);
    }
}
