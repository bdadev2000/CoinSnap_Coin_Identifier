package com.glority.camera;

import com.glority.camera.ICamera;
import com.glority.camera.SensorController;

/* loaded from: classes6.dex */
public abstract class CameraImpl implements ICamera {
    static final int DEFAULT_FOCUS_RECT = 200;
    static final int DEFAULT_MAX_ZOOM = 200;
    AspectRatio mAspectRatio;
    boolean mAutoFocus;
    ICamera.Callback mCallBack;
    int mFacing;
    int mFlash;
    Size mMaxCaptureSize;
    IPreview mPreview;
    int mRotation;
    SensorController mSensorController;
    int mZoom;
    private final Runnable mAutoFocusRunnable = new Runnable() { // from class: com.glority.camera.CameraImpl.1
        @Override // java.lang.Runnable
        public void run() {
            CameraImpl.this.restoreFocusArea();
            CameraImpl.this.updateAutoFocus();
            CameraImpl.this.mSensorController.setSensorListener(null);
        }
    };
    private int mExposureRatio = 50;

    protected abstract void restoreFocusArea();

    protected abstract void updateAutoFocus();

    protected abstract void updateExposureRatio();

    protected abstract void updateFacing();

    protected abstract void updateFlash();

    protected abstract void updatePreview();

    protected abstract void updateZoom();

    @Override // com.glority.camera.ICamera
    public void setFlash(int i) {
        this.mFlash = i;
        updateFlash();
    }

    @Override // com.glority.camera.ICamera
    public int getFlash() {
        return this.mFlash;
    }

    @Override // com.glority.camera.ICamera
    public void setFacing(int i) {
        this.mFacing = i;
        updateFacing();
    }

    @Override // com.glority.camera.ICamera
    public int getFacing() {
        return this.mFacing;
    }

    @Override // com.glority.camera.ICamera
    public void setRotation(int i) {
        this.mRotation = i;
    }

    @Override // com.glority.camera.ICamera
    public int getRotation() {
        return this.mRotation;
    }

    @Override // com.glority.camera.ICamera
    public void setAutoFocus(boolean z) {
        if (this.mAutoFocus == z) {
            return;
        }
        this.mAutoFocus = z;
        updateAutoFocus();
    }

    @Override // com.glority.camera.ICamera
    public boolean getAutoFocus() {
        return this.mAutoFocus;
    }

    @Override // com.glority.camera.ICamera
    public void setAspectRatio(AspectRatio aspectRatio) {
        this.mAspectRatio = aspectRatio;
    }

    @Override // com.glority.camera.ICamera
    public AspectRatio getAspectRatio() {
        return this.mAspectRatio;
    }

    @Override // com.glority.camera.ICamera
    public void setCallBack(ICamera.Callback callback) {
        this.mCallBack = callback;
    }

    @Override // com.glority.camera.ICamera
    public ICamera.Callback getCallBack() {
        return this.mCallBack;
    }

    @Override // com.glority.camera.ICamera
    public void initPreview(IPreview iPreview) {
        this.mPreview = iPreview;
        updatePreview();
    }

    @Override // com.glority.camera.ICamera
    public IPreview getPreview() {
        return this.mPreview;
    }

    @Override // com.glority.camera.ICamera
    public void setZoom(int i) {
        this.mZoom = i;
        updateZoom();
    }

    @Override // com.glority.camera.ICamera
    public int getZoom() {
        return this.mZoom;
    }

    @Override // com.glority.camera.ICamera
    public void setExposureRatio(int i) {
        this.mExposureRatio = Math.max(Math.min(i, 100), 0);
        updateExposureRatio();
    }

    @Override // com.glority.camera.ICamera
    public int getExposureRatio() {
        return this.mExposureRatio;
    }

    @Override // com.glority.camera.ICamera
    public void setSensorController(SensorController sensorController) {
        this.mSensorController = sensorController;
    }

    @Override // com.glority.camera.ICamera
    public SensorController getSensorController() {
        return this.mSensorController;
    }

    @Override // com.glority.camera.ICamera
    public void autoFocus() {
        this.mPreview.getView().removeCallbacks(this.mAutoFocusRunnable);
    }

    @Override // com.glority.camera.ICamera
    public boolean start() {
        SensorController sensorController = this.mSensorController;
        if (sensorController == null) {
            return false;
        }
        sensorController.start();
        return false;
    }

    @Override // com.glority.camera.ICamera
    public void stop() {
        SensorController sensorController = this.mSensorController;
        if (sensorController != null) {
            sensorController.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void endAutoFocus() {
        this.mPreview.getView().removeCallbacks(this.mAutoFocusRunnable);
        SensorController sensorController = this.mSensorController;
        if (sensorController != null) {
            sensorController.setSensorListener(new SensorController.SensorListener() { // from class: com.glority.camera.CameraImpl.2
                boolean isMoved = false;

                @Override // com.glority.camera.SensorController.SensorListener
                public void onStatusChanged(SensorController sensorController2, int i) {
                    if (i != 2) {
                        CameraImpl.this.mPreview.getView().removeCallbacks(CameraImpl.this.mAutoFocusRunnable);
                    } else if (this.isMoved) {
                        CameraImpl.this.mPreview.getView().removeCallbacks(CameraImpl.this.mAutoFocusRunnable);
                        CameraImpl.this.mAutoFocusRunnable.run();
                    } else {
                        this.isMoved = true;
                        CameraImpl.this.mPreview.getView().postDelayed(CameraImpl.this.mAutoFocusRunnable, 1000L);
                    }
                }
            });
        }
    }

    @Override // com.glority.camera.ICamera
    public void setMaxCaptureSize(Size size) {
        this.mMaxCaptureSize = size;
    }
}
