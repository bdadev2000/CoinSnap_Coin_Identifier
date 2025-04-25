package com.glority.camera;

import java.util.List;

/* loaded from: classes6.dex */
public interface ICamera {
    public static final int FACING_BACK = 0;
    public static final int FACING_FRONT = 1;
    public static final int FLASH_AUTO = 3;
    public static final int FLASH_OFF = 0;
    public static final int FLASH_ON = 1;
    public static final int FLASH_RED_EYE = 4;
    public static final int FLASH_TORCH = 2;

    /* loaded from: classes6.dex */
    public interface Callback {
        void onAutoFocused();

        void onCameraClosed();

        void onCameraOpened();

        void onException(CameraException cameraException);

        void onLayoutRequested();

        void onPictureTaken(byte[] bArr);
    }

    /* loaded from: classes6.dex */
    public @interface Facing {
    }

    /* loaded from: classes6.dex */
    public @interface Flash {
    }

    /* loaded from: classes6.dex */
    public @interface Rotation {
    }

    void autoFocus();

    void focusOn(int i, int i2);

    AspectRatio getAspectRatio();

    boolean getAutoFocus();

    Callback getCallBack();

    int getExposureRatio();

    int getFacing();

    int getFlash();

    int getMaxZoom();

    List<Integer> getOutputFormats();

    IPreview getPreview();

    int getRotation();

    SensorController getSensorController();

    int getZoom();

    void initPreview(IPreview iPreview);

    boolean isCamera2();

    void setAspectRatio(AspectRatio aspectRatio);

    void setAutoFocus(boolean z);

    void setCallBack(Callback callback);

    void setExposureRatio(int i);

    void setFacing(int i);

    void setFlash(int i);

    void setMaxCaptureSize(Size size);

    void setRotation(int i);

    void setSensorController(SensorController sensorController);

    void setZoom(int i);

    boolean start();

    boolean startPreview();

    void stop();

    void stopPreview();

    void takePicture();
}
