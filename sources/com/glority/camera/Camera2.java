package com.glority.camera;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.Range;
import android.util.SparseIntArray;
import android.view.Surface;
import androidx.core.app.ActivityCompat;
import com.glority.android.picturexx.recognize.logevents.RecognizeLogEvents;
import com.glority.camera.IPreview;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

/* loaded from: classes6.dex */
public class Camera2 extends CameraImpl {
    private static final SparseIntArray INTERNAL_FACING;
    private static final int MAX_PREVIEW_HEIGHT = 1500;
    private static final int MAX_PREVIEW_WIDTH = 2000;
    private Handler mBackgroundHandler;
    private HandlerThread mBackgroundThread;
    private CameraDevice mCamera;
    private CameraCharacteristics mCameraCharacteristics;
    private String mCameraId;
    private final CameraManager mCameraManager;
    private CameraCaptureSession mCaptureSession;
    private ImageReader mImageReader;
    private Size mPictureSize;
    private CaptureRequest.Builder mPreviewRequestBuilder;
    private Size mPreviewSize;
    private boolean mShowingPreview;
    private StreamConfigurationMap mStreamConfigurationMap;
    private final ImageReader.OnImageAvailableListener mOnImageAvailableListener = new ImageReader.OnImageAvailableListener() { // from class: com.glority.camera.Camera2.1
        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            try {
                Image acquireNextImage = imageReader.acquireNextImage();
                try {
                    Image.Plane[] planes = acquireNextImage.getPlanes();
                    if (planes.length > 0) {
                        ByteBuffer buffer = planes[0].getBuffer();
                        byte[] bArr = new byte[buffer.remaining()];
                        buffer.get(bArr);
                        acquireNextImage.close();
                        if (Camera2.this.mCallBack != null) {
                            Camera2.this.mCallBack.onPictureTaken(bArr);
                        }
                    }
                    if (acquireNextImage != null) {
                        acquireNextImage.close();
                    }
                } finally {
                }
            } catch (Throwable th) {
                if (Camera2.this.mCallBack != null) {
                    Camera2.this.mCallBack.onException(new CameraException(CameraException.CAMERA_ERROR, "Camera2 - onImageAvailable callback error. message: " + th.getMessage()));
                }
            }
        }
    };
    private final CameraDevice.StateCallback mCameraDeviceCallBack = new CameraDevice.StateCallback() { // from class: com.glority.camera.Camera2.2
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            Camera2.this.mCamera = cameraDevice;
            if (Camera2.this.mCallBack != null) {
                Camera2.this.mCallBack.onCameraOpened();
            }
            Camera2.this.startCaptureSession();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            if (Camera2.this.mCallBack != null) {
                Camera2.this.mCallBack.onCameraClosed();
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            Camera2.this.stop();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            Camera2.this.stop();
        }
    };
    private final CameraCaptureSession.StateCallback mSessionCallback = new CameraCaptureSession.StateCallback() { // from class: com.glority.camera.Camera2.3
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            if (Camera2.this.mCamera == null) {
                return;
            }
            try {
                Camera2.this.mCaptureSession = cameraCaptureSession;
                Camera2.this.updateFlash();
                Camera2.this.updateZoom();
                Camera2.this.updateAutoFocus();
                Camera2.this.startPreview();
            } catch (Throwable th) {
                if (Camera2.this.mCallBack != null) {
                    Camera2.this.mCallBack.onException(new CameraException(CameraException.CAMERA_ERROR, "Camera2 - error on mSessionCallback.onConfigured. message: " + th.getMessage()));
                }
            }
        }
    };
    private final PictureCaptureCallback mCaptureCallback = new PictureCaptureCallback() { // from class: com.glority.camera.Camera2.4
        @Override // com.glority.camera.Camera2.PictureCaptureCallback
        public void onReady() {
            Camera2.this.captureStillPicture();
        }

        @Override // com.glority.camera.Camera2.PictureCaptureCallback
        public void onPrecaptureRequired() {
            Camera2.this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            setState(3);
            try {
                Camera2.this.mCaptureSession.capture(Camera2.this.mPreviewRequestBuilder.build(), this, null);
                Camera2.this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
            } catch (CameraAccessException e) {
                e.printStackTrace();
                if (Camera2.this.mCallBack != null) {
                    Camera2.this.mCallBack.onException(CameraException.from(e, "Camera2 - error in onPrecaptureRequired callback."));
                }
            } catch (Exception e2) {
                if (Camera2.this.mCallBack != null) {
                    Camera2.this.mCallBack.onException(new CameraException(20000, "Camera2 - unknown error in onPrecaptureRequired. msg: " + e2.getMessage()));
                }
            }
        }
    };
    private final IPreview.CallBack mPreviewCallBack = new IPreview.CallBack() { // from class: com.glority.camera.Camera2.5
        @Override // com.glority.camera.IPreview.CallBack
        public void onSurfaceChanged() {
            if (Camera2.this.mCamera != null) {
                Camera2.this.updatePreview();
                Camera2.this.startCaptureSession();
            }
        }
    };
    private final SizeMap mPreviewSizes = new SizeMap();
    private final SizeMap mPictureSizes = new SizeMap();

    @Override // com.glority.camera.ICamera
    public int getMaxZoom() {
        return 200;
    }

    @Override // com.glority.camera.ICamera
    public boolean isCamera2() {
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        INTERNAL_FACING = sparseIntArray;
        sparseIntArray.put(0, 1);
        sparseIntArray.put(1, 0);
    }

    public Camera2(Context context) {
        this.mCameraManager = (CameraManager) context.getSystemService(RecognizeLogEvents.camera);
    }

    @Override // com.glority.camera.CameraImpl
    protected void updateFlash() {
        if (this.mPreviewRequestBuilder == null || this.mCaptureSession == null) {
            return;
        }
        int i = this.mFlash;
        if (i == 0) {
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.mPreviewRequestBuilder.set(CaptureRequest.FLASH_MODE, 0);
        } else if (i == 1) {
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 3);
            this.mPreviewRequestBuilder.set(CaptureRequest.FLASH_MODE, 0);
        } else if (i == 2) {
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.mPreviewRequestBuilder.set(CaptureRequest.FLASH_MODE, 2);
        } else if (i == 3) {
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 2);
            this.mPreviewRequestBuilder.set(CaptureRequest.FLASH_MODE, 0);
        } else if (i == 4) {
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 4);
            this.mPreviewRequestBuilder.set(CaptureRequest.FLASH_MODE, 0);
        }
        if (this.mShowingPreview) {
            startPreview();
        }
    }

    @Override // com.glority.camera.CameraImpl
    protected void updateFacing() {
        start();
    }

    @Override // com.glority.camera.ICamera
    public List<Integer> getOutputFormats() {
        if (this.mStreamConfigurationMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i : this.mStreamConfigurationMap.getOutputFormats()) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    @Override // com.glority.camera.ICamera
    public void takePicture() {
        captureStillPicture();
    }

    @Override // com.glority.camera.CameraImpl, com.glority.camera.ICamera
    public boolean start() {
        if (isCameraOpened()) {
            stop();
        }
        super.start();
        try {
            if (!chooseCameraIdBayFacing() || this.mPreview == null) {
                return false;
            }
            HandlerThread handlerThread = new HandlerThread("Camera2_background_thread");
            this.mBackgroundThread = handlerThread;
            handlerThread.start();
            this.mBackgroundHandler = new Handler(this.mBackgroundThread.getLooper());
            collectCameraInfo();
            return openCamera();
        } catch (Exception e) {
            if (this.mCallBack != null) {
                this.mCallBack.onException(new CameraException(20000, "Camera2 - Unknown error occur. message: " + e.getMessage()));
            }
            return false;
        }
    }

    @Override // com.glority.camera.CameraImpl, com.glority.camera.ICamera
    public void stop() {
        super.stop();
        try {
            CameraCaptureSession cameraCaptureSession = this.mCaptureSession;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                this.mCaptureSession = null;
            }
            CameraDevice cameraDevice = this.mCamera;
            if (cameraDevice != null) {
                cameraDevice.close();
                this.mCamera = null;
            }
            ImageReader imageReader = this.mImageReader;
            if (imageReader != null) {
                imageReader.close();
                this.mImageReader = null;
            }
            HandlerThread handlerThread = this.mBackgroundThread;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                this.mBackgroundThread = null;
            }
            this.mBackgroundHandler = null;
            this.mPreviewSizes.clear();
            this.mPictureSizes.clear();
            this.mPreviewSize = null;
            this.mPictureSize = null;
            this.mCameraCharacteristics = null;
            this.mStreamConfigurationMap = null;
            this.mCameraId = null;
        } catch (Throwable th) {
            if (this.mCallBack != null) {
                this.mCallBack.onException(new CameraException(CameraException.CAMERA_ERROR, "Camera2 - stop camera failed. message: " + th.getMessage()));
            }
        }
    }

    @Override // com.glority.camera.ICamera
    public boolean startPreview() {
        try {
            this.mCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), new CameraCaptureSession.CaptureCallback() { // from class: com.glority.camera.Camera2.6
                int lastAfState = 0;

                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                    Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                    if (num == null || this.lastAfState == num.intValue()) {
                        return;
                    }
                    if (num.intValue() == 2) {
                        Log.d("Camera2Preview", "onAutoFocused, current CONTROL_AF_STATE: " + num);
                        if (Camera2.this.mCallBack != null) {
                            Camera2.this.mCallBack.onAutoFocused();
                        }
                    }
                    this.lastAfState = num.intValue();
                }
            }, this.mBackgroundHandler);
            this.mShowingPreview = true;
        } catch (CameraAccessException e) {
            e.printStackTrace();
            if (this.mCallBack != null) {
                this.mCallBack.onException(CameraException.from(e, "Camera2 - startPreview failed."));
            }
        } catch (Exception e2) {
            if (this.mCallBack != null) {
                this.mCallBack.onException(new CameraException(20000, "Camera2 - unknown error when startPreview. msg: " + e2.getMessage()));
            }
        }
        return this.mShowingPreview;
    }

    @Override // com.glority.camera.ICamera
    public void stopPreview() {
        CameraCaptureSession cameraCaptureSession = this.mCaptureSession;
        if (cameraCaptureSession == null) {
            return;
        }
        try {
            cameraCaptureSession.stopRepeating();
        } catch (CameraAccessException e) {
            e.printStackTrace();
            if (this.mCallBack != null) {
                this.mCallBack.onException(CameraException.from(e, "Camera2 - stopPreview failed."));
            }
        } catch (Exception e2) {
            if (this.mCallBack != null) {
                this.mCallBack.onException(new CameraException(20000, "Camera2 - unknown error when stopPreview. msg: " + e2.getMessage()));
            }
        }
    }

    @Override // com.glority.camera.CameraImpl
    protected void updateAutoFocus() {
        if (this.mCameraCharacteristics == null || this.mPreviewRequestBuilder == null || this.mCaptureSession == null) {
            return;
        }
        if (this.mAutoFocus) {
            int[] iArr = (int[]) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
            if (iArr == null || iArr.length == 0 || (iArr.length == 1 && iArr[0] == 0)) {
                this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 0);
            } else {
                this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 4);
            }
        } else {
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 0);
            this.mAutoFocus = false;
        }
        Rect rect = (Rect) this.mPreviewRequestBuilder.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect != null) {
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 0)});
        }
        if (this.mShowingPreview) {
            startPreview();
        }
    }

    @Override // com.glority.camera.CameraImpl
    protected void updatePreview() {
        this.mPreview.setCallBack(this.mPreviewCallBack);
    }

    @Override // com.glority.camera.CameraImpl
    protected void updateZoom() {
        Float f;
        Rect rect;
        CameraCharacteristics cameraCharacteristics = this.mCameraCharacteristics;
        if (cameraCharacteristics == null || this.mPreviewRequestBuilder == null || this.mCaptureSession == null || (f = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)) == null || (rect = (Rect) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE)) == null) {
            return;
        }
        restoreFocusArea();
        if (this.mZoom < 0) {
            this.mZoom = 0;
        }
        if (this.mZoom > getMaxZoom()) {
            this.mZoom = getMaxZoom();
        }
        float maxZoom = ((this.mZoom / getMaxZoom()) * f.floatValue()) + 1.0f;
        int width = (rect.width() - ((int) (rect.width() / maxZoom))) / 2;
        int height = (rect.height() - ((int) (rect.height() / maxZoom))) / 2;
        this.mPreviewRequestBuilder.set(CaptureRequest.SCALER_CROP_REGION, new Rect(width, height, rect.width() - width, rect.height() - height));
        if (this.mShowingPreview) {
            startPreview();
        }
    }

    @Override // com.glority.camera.CameraImpl
    protected void updateExposureRatio() {
        CameraCharacteristics cameraCharacteristics = this.mCameraCharacteristics;
        if (cameraCharacteristics == null) {
            return;
        }
        Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        int intValue = ((Integer) range.getUpper()).intValue();
        int intValue2 = ((Integer) range.getLower()).intValue();
        double exposureRatio = (((100 - getExposureRatio()) / 100.0d) * 2.0d) - 1.0d;
        if (intValue2 == 0 && intValue == 0) {
            return;
        }
        float f = (float) ((exposureRatio >= 0.0d ? intValue2 : intValue * (-1)) * exposureRatio);
        CaptureRequest.Builder builder = this.mPreviewRequestBuilder;
        if (builder != null) {
            builder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf((int) f));
            startPreview();
        }
    }

    @Override // com.glority.camera.CameraImpl, com.glority.camera.ICamera
    public void autoFocus() {
        super.autoFocus();
        try {
            if (this.mShowingPreview) {
                stopPreview();
                this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                this.mCaptureSession.capture(this.mPreviewRequestBuilder.build(), null, null);
                this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 1);
                this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                this.mCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), new AnonymousClass7(), this.mBackgroundHandler);
            }
        } catch (CameraAccessException e) {
            e.printStackTrace();
            if (this.mCallBack != null) {
                this.mCallBack.onException(CameraException.from(e, "Camera2 - autoFocus failed."));
            }
        } catch (Exception e2) {
            if (this.mCallBack != null) {
                this.mCallBack.onException(new CameraException(20000, "Camera2 - unknown error in autoFocus. msg: " + e2.getMessage()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.glority.camera.Camera2$7, reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass7 extends CameraCaptureSession.CaptureCallback {
        boolean isLocked = false;

        AnonymousClass7() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            try {
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (this.isLocked) {
                    return;
                }
                if (num == null || num.intValue() == 4 || num.intValue() == 5 || !(num.intValue() == 2 || num.intValue() == 3)) {
                    this.isLocked = true;
                    Camera2.this.stopPreview();
                    Camera2.this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    Camera2.this.mCaptureSession.capture(Camera2.this.mPreviewRequestBuilder.build(), new CameraCaptureSession.CaptureCallback() { // from class: com.glority.camera.Camera2.7.1
                        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession2, CaptureRequest captureRequest2, TotalCaptureResult totalCaptureResult2) {
                            super.onCaptureCompleted(cameraCaptureSession2, captureRequest2, totalCaptureResult2);
                            try {
                                Camera2.this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                                Camera2.this.mCaptureSession.capture(Camera2.this.mPreviewRequestBuilder.build(), new CameraCaptureSession.CaptureCallback() { // from class: com.glority.camera.Camera2.7.1.1
                                    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                                    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession3, CaptureRequest captureRequest3, TotalCaptureResult totalCaptureResult3) {
                                        super.onCaptureCompleted(cameraCaptureSession3, captureRequest3, totalCaptureResult3);
                                        try {
                                            Camera2.this.startPreview();
                                            Camera2.this.endAutoFocus();
                                        } catch (Throwable th) {
                                            if (Camera2.this.mCallBack != null) {
                                                Camera2.this.mCallBack.onException(new CameraException(CameraException.CAMERA_ERROR, "Camera2 - autoFocus failed. message: " + th.getMessage()));
                                            }
                                        }
                                    }
                                }, Camera2.this.mBackgroundHandler);
                            } catch (Throwable th) {
                                if (Camera2.this.mCallBack != null) {
                                    Camera2.this.mCallBack.onException(new CameraException(CameraException.CAMERA_ERROR, "Camera2 - autoFocus failed. message: " + th.getMessage()));
                                }
                            }
                        }
                    }, Camera2.this.mBackgroundHandler);
                }
            } catch (Throwable th) {
                if (Camera2.this.mCallBack != null) {
                    Camera2.this.mCallBack.onException(new CameraException(CameraException.CAMERA_ERROR, "Camera2 - autoFocus failed. message: " + th.getMessage()));
                }
            }
        }
    }

    @Override // com.glority.camera.ICamera
    public void focusOn(int i, int i2) {
        Rect rect;
        CameraCharacteristics cameraCharacteristics = this.mCameraCharacteristics;
        if (cameraCharacteristics == null || this.mPreviewRequestBuilder == null) {
            return;
        }
        try {
            Rect rect2 = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            if (rect2 == null) {
                return;
            }
            int width = rect2.width();
            int height = rect2.height();
            int i3 = rect2.left;
            int i4 = rect2.top;
            Rect rect3 = new Rect(i - 100, i2 - 100, i + 100, i2 + 100);
            int i5 = this.mRotation;
            if (i5 == 0) {
                rect = new Rect(((rect3.top * width) / this.mPreview.getHeight()) - i3, (((this.mPreview.getWidth() - rect3.right) * height) / this.mPreview.getWidth()) - i4, ((rect3.bottom * width) / this.mPreview.getHeight()) - i3, (((this.mPreview.getWidth() - rect3.left) * height) / this.mPreview.getWidth()) - i4);
            } else if (i5 == 2) {
                rect = new Rect((((this.mPreview.getHeight() - rect3.bottom) * width) / this.mPreview.getHeight()) - i3, ((rect3.left * height) / this.mPreview.getWidth()) - i4, (((this.mPreview.getHeight() - rect3.top) * width) / this.mPreview.getHeight()) - i3, ((rect3.right * height) / this.mPreview.getWidth()) - i4);
            } else if (i5 == 3) {
                rect = new Rect((((this.mPreview.getWidth() - rect3.right) * width) / this.mPreview.getWidth()) - i3, (((this.mPreview.getHeight() - rect3.bottom) * height) / this.mPreview.getHeight()) - i4, (((this.mPreview.getWidth() - rect3.left) * width) / this.mPreview.getWidth()) - i3, (((this.mPreview.getHeight() - rect3.top) * height) / this.mPreview.getHeight()) - i4);
            } else {
                rect = new Rect(((rect3.left * width) / this.mPreview.getWidth()) - i3, ((rect3.top * height) / this.mPreview.getHeight()) - i4, ((rect3.right * width) / this.mPreview.getWidth()) - i3, ((rect3.bottom * height) / this.mPreview.getHeight()) - i4);
            }
            if (rect.left < i3) {
                rect.left = i3;
            }
            if (rect.top < i4) {
                rect.top = i4;
            }
            if (rect.right > rect2.right) {
                rect.right = rect2.right;
            }
            if (rect.bottom > rect2.bottom) {
                rect.bottom = rect2.bottom;
            }
            MeteringRectangle[] meteringRectangleArr = {new MeteringRectangle(rect, 999)};
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr);
            autoFocus();
        } catch (Exception e) {
            if (this.mCallBack != null) {
                this.mCallBack.onException(new CameraException(20000, "Camera2 - unknown error in focusOn. message: " + e.getMessage()));
            }
        }
    }

    @Override // com.glority.camera.CameraImpl
    protected void restoreFocusArea() {
        if (this.mCameraCharacteristics == null || this.mPreviewRequestBuilder == null) {
            return;
        }
        try {
            MeteringRectangle[] meteringRectangleArr = {new MeteringRectangle((Rect) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE), 0)};
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr);
            if (this.mShowingPreview) {
                startPreview();
            }
        } catch (Exception e) {
            if (this.mCallBack != null) {
                this.mCallBack.onException(new CameraException(20000, "Camera2 - restoreFocusArea error. message: " + e.getMessage()));
            }
        }
    }

    private boolean chooseCameraIdBayFacing() {
        StreamConfigurationMap streamConfigurationMap;
        Integer num;
        StreamConfigurationMap streamConfigurationMap2;
        Integer num2;
        try {
            int i = INTERNAL_FACING.get(this.mFacing);
            String[] cameraIdList = this.mCameraManager.getCameraIdList();
            if (cameraIdList.length == 0) {
                return false;
            }
            for (String str : cameraIdList) {
                CameraCharacteristics cameraCharacteristics = this.mCameraManager.getCameraCharacteristics(str);
                Integer num3 = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                if (num3 != null && num3.intValue() != 2 && (streamConfigurationMap2 = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)) != null && i == num2.intValue()) {
                    this.mCameraId = str;
                    this.mCameraCharacteristics = cameraCharacteristics;
                    this.mStreamConfigurationMap = streamConfigurationMap2;
                    return true;
                }
            }
            String str2 = cameraIdList[0];
            CameraCharacteristics cameraCharacteristics2 = this.mCameraManager.getCameraCharacteristics(str2);
            Integer num4 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (num4 == null || num4.intValue() == 2 || (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) == null || (num = (Integer) cameraCharacteristics2.get(CameraCharacteristics.LENS_FACING)) == null) {
                return false;
            }
            this.mCameraId = str2;
            this.mCameraCharacteristics = cameraCharacteristics2;
            this.mStreamConfigurationMap = streamConfigurationMap;
            int size = INTERNAL_FACING.size();
            for (int i2 = 0; i2 < size; i2++) {
                SparseIntArray sparseIntArray = INTERNAL_FACING;
                if (sparseIntArray.valueAt(i2) == num.intValue()) {
                    this.mFacing = sparseIntArray.keyAt(i2);
                    return true;
                }
            }
            this.mFacing = 0;
            return true;
        } catch (CameraAccessException e) {
            e.printStackTrace();
            if (this.mCallBack != null) {
                this.mCallBack.onException(CameraException.from(e, "Camera2 - chooseCameraIdBayFacing failed."));
            }
            return false;
        } catch (Exception e2) {
            if (this.mCallBack != null) {
                this.mCallBack.onException(new CameraException(20000, "Camera2 - unknown error in chooseCameraIdByFacing. msg: " + e2.getMessage()));
            }
            return false;
        }
    }

    private void collectCameraInfo() {
        this.mPreviewSizes.clear();
        for (android.util.Size size : this.mStreamConfigurationMap.getOutputSizes(this.mPreview.getOutputClass())) {
            int width = size.getWidth();
            int height = size.getHeight();
            if (width <= 2000 && height <= 1500) {
                this.mPreviewSizes.addSize(new Size(width, height));
            }
        }
        this.mPictureSizes.clear();
        for (android.util.Size size2 : this.mStreamConfigurationMap.getOutputSizes(256)) {
            this.mPictureSizes.addSize(new Size(size2.getWidth(), size2.getHeight()));
        }
        Iterator<AspectRatio> it = this.mPreviewSizes.ratios().iterator();
        while (it.hasNext()) {
            if (!this.mPictureSizes.ratios().contains(it.next())) {
                it.remove();
            }
        }
        if (this.mPreviewSizes.ratios().contains(this.mAspectRatio)) {
            return;
        }
        this.mAspectRatio = this.mPreviewSizes.ratios().iterator().next();
        if (this.mCallBack != null) {
            this.mCallBack.onLayoutRequested();
        }
    }

    private void prepareImageReader() {
        ImageReader imageReader = this.mImageReader;
        if (imageReader != null) {
            imageReader.close();
        }
        Size size = this.mPictureSize;
        if (size == null) {
            return;
        }
        ImageReader newInstance = ImageReader.newInstance(size.getWidth(), this.mPictureSize.getHeight(), 256, 1);
        this.mImageReader = newInstance;
        newInstance.setOnImageAvailableListener(this.mOnImageAvailableListener, this.mBackgroundHandler);
    }

    private boolean openCamera() {
        try {
            if (ActivityCompat.checkSelfPermission(this.mPreview.getView().getContext(), "android.permission.CAMERA") != 0) {
                throw new CameraException(CameraException.CAMERA_PERMISSION_NOT_GRANTED, "No camera permission");
            }
            this.mCameraManager.openCamera(this.mCameraId, this.mCameraDeviceCallBack, this.mBackgroundHandler);
            return true;
        } catch (CameraAccessException e) {
            e.printStackTrace();
            if (this.mCallBack != null) {
                this.mCallBack.onException(CameraException.from(e, "Camera2 - openCamera failed."));
            }
            return false;
        } catch (CameraException e2) {
            if (this.mCallBack != null) {
                this.mCallBack.onException(e2);
            }
            return false;
        } catch (Exception e3) {
            if (this.mCallBack != null) {
                this.mCallBack.onException(new CameraException(20000, "Camera2 - unknown error in openCamera. msg: " + e3.getMessage()));
            }
            return false;
        }
    }

    private Size chooseOptimalSize(SizeMap sizeMap, Size size) {
        int width = this.mPreview.getWidth();
        int height = this.mPreview.getHeight();
        if (width < height) {
            height = width;
            width = height;
        }
        SortedSet<Size> sizes = sizeMap.sizes(this.mAspectRatio);
        if (sizes == null) {
            return sizeMap.sizes(sizeMap.ratios().iterator().next()).last();
        }
        if (size == null) {
            size = new Size(0, 0);
        }
        for (Size size2 : sizes) {
            if (size2.getWidth() >= width && size2.getHeight() >= height && size2.getHeight() * size2.getWidth() >= size.getHeight() * size.getWidth()) {
                return size2;
            }
        }
        return sizes.last();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startCaptureSession() {
        if (this.mCamera == null || this.mPreview == null || !this.mPreview.isReady() || this.mPreviewSizes.isEmpty() || this.mPictureSizes.isEmpty()) {
            return;
        }
        try {
            this.mPreviewSize = chooseOptimalSize(this.mPreviewSizes, null);
            this.mPictureSize = chooseOptimalSize(this.mPictureSizes, this.mMaxCaptureSize);
            this.mPreview.setBufferSize(this.mPreviewSize.getWidth(), this.mPreviewSize.getHeight());
            Surface surface = this.mPreview.getSurface();
            prepareImageReader();
            CaptureRequest.Builder createCaptureRequest = this.mCamera.createCaptureRequest(1);
            this.mPreviewRequestBuilder = createCaptureRequest;
            createCaptureRequest.addTarget(surface);
            this.mCamera.createCaptureSession(Arrays.asList(surface, this.mImageReader.getSurface()), this.mSessionCallback, this.mBackgroundHandler);
        } catch (CameraAccessException e) {
            e.printStackTrace();
            if (this.mCallBack != null) {
                this.mCallBack.onException(CameraException.from(e, "Camera2 - startCaptureSession failed."));
            }
        } catch (Exception e2) {
            if (this.mCallBack != null) {
                this.mCallBack.onException(new CameraException(20000, "Camera2 - unknown error in startCaptureSession. msg: " + e2.getMessage()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void captureStillPicture() {
        CameraDevice cameraDevice = this.mCamera;
        if (cameraDevice == null || this.mImageReader == null || this.mPreviewRequestBuilder == null || this.mCaptureSession == null) {
            if (this.mCallBack != null) {
                this.mCallBack.onException(new CameraException(CameraException.CAMERA_ERROR, "Camera2 - not prepared or released."));
                return;
            }
            return;
        }
        try {
            CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(2);
            createCaptureRequest.addTarget(this.mImageReader.getSurface());
            createCaptureRequest.set(CaptureRequest.CONTROL_MODE, this.mPreviewRequestBuilder.get(CaptureRequest.CONTROL_MODE));
            createCaptureRequest.set(CaptureRequest.CONTROL_SCENE_MODE, this.mPreviewRequestBuilder.get(CaptureRequest.CONTROL_SCENE_MODE));
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, this.mPreviewRequestBuilder.get(CaptureRequest.CONTROL_AF_MODE));
            createCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, this.mPreviewRequestBuilder.get(CaptureRequest.SCALER_CROP_REGION));
            int i = this.mFlash;
            if (i == 0) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                createCaptureRequest.set(CaptureRequest.FLASH_MODE, 0);
            } else if (i == 1) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 3);
            } else if (i == 2) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                createCaptureRequest.set(CaptureRequest.FLASH_MODE, 2);
            } else if (i == 3) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 2);
            } else if (i == 4) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 4);
            }
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(getPictureOrientation()));
            this.mCaptureSession.stopRepeating();
            this.mCaptureSession.capture(createCaptureRequest.build(), new CameraCaptureSession.CaptureCallback() { // from class: com.glority.camera.Camera2.8
                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                    Camera2.this.unlockFocus();
                }
            }, this.mBackgroundHandler);
        } catch (CameraAccessException e) {
            e.printStackTrace();
            if (this.mCallBack != null) {
                this.mCallBack.onException(CameraException.from(e, "Camera2 - captureStillPicture failed."));
            }
        } catch (Exception e2) {
            if (this.mCallBack != null) {
                this.mCallBack.onException(new CameraException(20000, "Camera2 - unknown error when captureStillPicture. msg: " + e2.getMessage()));
            }
        }
    }

    private void lockFocus() {
        this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        try {
            this.mCaptureCallback.setState(1);
            this.mCaptureSession.capture(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mBackgroundHandler);
        } catch (CameraAccessException e) {
            e.printStackTrace();
            if (this.mCallBack != null) {
                this.mCallBack.onException(CameraException.from(e, "Camera2 - lockFocus failed."));
            }
        } catch (Exception e2) {
            if (this.mCallBack != null) {
                this.mCallBack.onException(new CameraException(20000, "Camera2 - unknown error when lockFocus. msg: " + e2.getMessage()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unlockFocus() {
        this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        try {
            this.mCaptureSession.capture(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mBackgroundHandler);
            updateAutoFocus();
            updateZoom();
            updateFlash();
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            startPreview();
            this.mCaptureCallback.setState(0);
        } catch (CameraAccessException e) {
            e.printStackTrace();
            if (this.mCallBack != null) {
                this.mCallBack.onException(CameraException.from(e, "Camera2 - unlockFocus failed."));
            }
        } catch (Exception e2) {
            if (this.mCallBack != null) {
                this.mCallBack.onException(new CameraException(20000, "Camera2 - unknown error when unlockFocus. msg: " + e2.getMessage()));
            }
        }
    }

    private int getPictureOrientation() {
        CameraCharacteristics cameraCharacteristics = this.mCameraCharacteristics;
        Integer num = cameraCharacteristics != null ? (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION) : null;
        if (num == null) {
            num = 0;
        }
        return (((num.intValue() + getDeviceRotation()) + ((getRotation() * 90) * (this.mFacing != 1 ? -1 : 1))) + 360) % 360;
    }

    private int getDeviceRotation() {
        int lastKnownDeviceOrientation = DeviceOrientationDetector.getInstance().getLastKnownDeviceOrientation();
        int i = this.mRotation;
        if (i == 0) {
            return lastKnownDeviceOrientation;
        }
        if (i == 1) {
            return lastKnownDeviceOrientation + 90;
        }
        if (i == 2) {
            return lastKnownDeviceOrientation + 180;
        }
        if (i != 3) {
            return 0;
        }
        return lastKnownDeviceOrientation + 270;
    }

    private boolean isCameraOpened() {
        return this.mCamera != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static abstract class PictureCaptureCallback extends CameraCaptureSession.CaptureCallback {
        static final int STATE_CAPTURING = 5;
        static final int STATE_LOCKED = 2;
        static final int STATE_LOCKING = 1;
        static final int STATE_PRECAPTURE = 3;
        static final int STATE_PREVIEW = 0;
        static final int STATE_WAITING = 4;
        private int mState;

        public abstract void onPrecaptureRequired();

        public abstract void onReady();

        private PictureCaptureCallback() {
        }

        void setState(int i) {
            this.mState = i;
        }

        private void process(CaptureResult captureResult) {
            int i = this.mState;
            if (i != 1) {
                if (i == 3) {
                    Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num == null || num.intValue() == 2 || num.intValue() == 5 || num.intValue() == 4) {
                        setState(4);
                        return;
                    }
                    return;
                }
                if (i != 4) {
                    return;
                }
                Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num2 == null || num2.intValue() != 5) {
                    setState(5);
                    onReady();
                    return;
                }
                return;
            }
            Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num3 == null) {
                return;
            }
            if (num3.intValue() == 4 || num3.intValue() == 5 || num3.intValue() == 1) {
                Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num4 == null || num4.intValue() == 2) {
                    setState(5);
                    onReady();
                    return;
                } else {
                    setState(2);
                    onPrecaptureRequired();
                    return;
                }
            }
            setState(5);
            onReady();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            process(captureResult);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            process(totalCaptureResult);
        }
    }
}
