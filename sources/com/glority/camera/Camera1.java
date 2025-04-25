package com.glority.camera;

import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.SurfaceHolder;
import androidx.collection.SparseArrayCompat;
import com.glority.camera.ICamera;
import com.glority.camera.IPreview;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes6.dex */
public class Camera1 extends CameraImpl {
    private static final SparseArrayCompat<String> FLASH_MODES;
    private static final SparseIntArray INTERNAL_FACING;
    private Handler mBackgroundHandler;
    private HandlerThread mBackgroundThread;
    private Camera mCamera;
    private int mCameraId;
    private Camera.Parameters mCameraParameters;
    private int mDisplayOrientation;
    private boolean mShowingPreview;
    private final IPreview.CallBack mPreviewCallBack = new IPreview.CallBack() { // from class: com.glority.camera.Camera1.1
        @Override // com.glority.camera.IPreview.CallBack
        public void onSurfaceChanged() {
            if (Camera1.this.isCameraOpened()) {
                Camera1.this.updatePreview();
                Handler handler = Camera1.this.mBackgroundHandler;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: com.glority.camera.Camera1.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                Camera1.this.adjustCameraParameters();
                            } catch (Throwable th) {
                                ICamera.Callback callback = Camera1.this.mCallBack;
                                if (callback != null) {
                                    callback.onException(new CameraException(20000, "Camera1 - onSurfaceChanged failed. message: " + th.getMessage()));
                                }
                            }
                        }
                    });
                }
            }
        }
    };
    private final AtomicBoolean mIsPictureCaptureInProgress = new AtomicBoolean(false);
    private Camera.CameraInfo mCameraInfo = new Camera.CameraInfo();
    private final SizeMap mPreviewSizes = new SizeMap();
    private final SizeMap mPictureSizes = new SizeMap();

    @Override // com.glority.camera.ICamera
    public boolean isCamera2() {
        return false;
    }

    @Override // com.glority.camera.CameraImpl
    protected void updateExposureRatio() {
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        INTERNAL_FACING = sparseIntArray;
        sparseIntArray.put(0, 0);
        sparseIntArray.put(1, 1);
        SparseArrayCompat<String> sparseArrayCompat = new SparseArrayCompat<>();
        FLASH_MODES = sparseArrayCompat;
        sparseArrayCompat.put(0, DebugKt.DEBUG_PROPERTY_VALUE_OFF);
        sparseArrayCompat.put(1, DebugKt.DEBUG_PROPERTY_VALUE_ON);
        sparseArrayCompat.put(2, "torch");
        sparseArrayCompat.put(3, "auto");
        sparseArrayCompat.put(4, "red-eye");
    }

    @Override // com.glority.camera.CameraImpl
    protected void updateFlash() {
        Camera.Parameters parameters;
        if (!isCameraOpened() || (parameters = this.mCameraParameters) == null) {
            return;
        }
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String str = FLASH_MODES.get(this.mFlash);
        if (supportedFlashModes != null && supportedFlashModes.contains(str)) {
            this.mCameraParameters.setFlashMode(str);
        } else {
            this.mCameraParameters.setFlashMode(DebugKt.DEBUG_PROPERTY_VALUE_OFF);
            this.mFlash = 0;
        }
        setParametersInternal();
    }

    @Override // com.glority.camera.CameraImpl
    protected void updateFacing() {
        start();
    }

    @Override // com.glority.camera.ICamera
    public List<Integer> getOutputFormats() {
        Camera.Parameters parameters = this.mCameraParameters;
        if (parameters == null) {
            return null;
        }
        return parameters.getSupportedPictureFormats();
    }

    @Override // com.glority.camera.ICamera
    public void takePicture() {
        if (isCameraOpened()) {
            try {
                takePictureInternal();
            } catch (Exception e) {
                if (this.mCallBack != null) {
                    this.mCallBack.onException(new CameraException(20000, "Camera1 - takePicture failed. message: " + e.getMessage()));
                }
            }
        }
    }

    @Override // com.glority.camera.CameraImpl, com.glority.camera.ICamera
    public boolean start() {
        try {
            stop(false);
            super.start();
            if (this.mPreview == null) {
                return false;
            }
            if (this.mBackgroundThread == null) {
                HandlerThread handlerThread = new HandlerThread("Camera1_background_thread");
                this.mBackgroundThread = handlerThread;
                handlerThread.start();
                this.mBackgroundHandler = new Handler(handlerThread.getLooper());
            }
            this.mBackgroundHandler.post(new Runnable() { // from class: com.glority.camera.Camera1.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Camera1.this.chooseCamera();
                        Camera1.this.openCamera();
                        Camera1.this.updatePreview();
                        Camera camera = Camera1.this.mCamera;
                        if (camera != null) {
                            camera.startPreview();
                            Camera1.this.mShowingPreview = true;
                        }
                    } catch (Throwable th) {
                        ICamera.Callback callback = Camera1.this.mCallBack;
                        if (callback != null) {
                            callback.onException(new CameraException(CameraException.CAMERA_ERROR, "Camera1 - start->startPreview failed. message: " + th.getMessage()));
                        }
                    }
                }
            });
            return true;
        } catch (Exception e) {
            if (this.mCallBack != null) {
                this.mCallBack.onException(new CameraException(CameraException.CAMERA_ERROR, "Camera1 - start->startBackgroundThread failed. messsage: " + e.getMessage()));
            }
            return false;
        }
    }

    @Override // com.glority.camera.CameraImpl, com.glority.camera.ICamera
    public void stop() {
        stop(true);
    }

    public void stop(boolean z) {
        super.stop();
        stopCamera();
        if (z) {
            stopBackgroundThread();
        }
    }

    @Override // com.glority.camera.ICamera
    public boolean startPreview() {
        if (isCameraOpened()) {
            try {
                this.mCamera.startPreview();
                this.mShowingPreview = true;
            } catch (Exception e) {
                if (this.mCallBack != null) {
                    this.mCallBack.onException(new CameraException(CameraException.CAMERA_ERROR, "Camera1 - startPreview failed. message: " + e.getMessage()));
                }
            }
        }
        return this.mShowingPreview;
    }

    @Override // com.glority.camera.ICamera
    public void stopPreview() {
        if (isCameraOpened()) {
            try {
                this.mCamera.stopPreview();
            } catch (Exception e) {
                if (this.mCallBack != null) {
                    this.mCallBack.onException(new CameraException(CameraException.CAMERA_ERROR, "Camera1 - stopPreview failed. message: " + e.getMessage()));
                }
            }
        }
        this.mShowingPreview = false;
    }

    @Override // com.glority.camera.ICamera
    public int getMaxZoom() {
        Camera.Parameters parameters = this.mCameraParameters;
        if (parameters == null) {
            return 200;
        }
        return parameters.getMaxZoom();
    }

    @Override // com.glority.camera.CameraImpl
    protected void updateAutoFocus() {
        if (isCameraOpened()) {
            List<String> supportedFocusModes = this.mCameraParameters.getSupportedFocusModes();
            if (this.mAutoFocus && supportedFocusModes.contains("continuous-picture")) {
                this.mCameraParameters.setFocusMode("continuous-picture");
            } else if (supportedFocusModes.contains("fixed")) {
                this.mCameraParameters.setFocusMode("fixed");
            } else if (supportedFocusModes.contains("infinity")) {
                this.mCameraParameters.setFocusMode("infinity");
            } else {
                this.mCameraParameters.setFocusMode(supportedFocusModes.get(0));
            }
            setParametersInternal();
        }
    }

    @Override // com.glority.camera.CameraImpl
    protected void updatePreview() {
        this.mPreview.setCallBack(this.mPreviewCallBack);
        if (isCameraOpened() && this.mPreview.isReady()) {
            try {
                if (this.mPreview.getOutputClass() == SurfaceHolder.class) {
                    if (this.mShowingPreview) {
                        this.mCamera.stopPreview();
                    }
                    this.mCamera.setPreviewDisplay(this.mPreview.getSurfaceHolder());
                    if (this.mShowingPreview) {
                        this.mCamera.startPreview();
                        return;
                    }
                    return;
                }
                this.mCamera.setPreviewTexture(this.mPreview.getSurfaceTexture());
            } catch (Exception e) {
                if (this.mCallBack != null) {
                    this.mCallBack.onException(new CameraException(20000, "Camera1 - updatePreview failed. message: " + e.getMessage()));
                }
            }
        }
    }

    @Override // com.glority.camera.CameraImpl
    protected void updateZoom() {
        if (isCameraOpened()) {
            restoreFocusArea();
            int maxZoom = getMaxZoom();
            if (this.mZoom < 0) {
                this.mZoom = 0;
            }
            if (this.mZoom > maxZoom) {
                this.mZoom = maxZoom;
            }
            this.mCameraParameters.setZoom(this.mZoom);
            setParametersInternal();
        }
    }

    @Override // com.glority.camera.CameraImpl, com.glority.camera.ICamera
    public void autoFocus() {
        super.autoFocus();
        if (isCameraOpened()) {
            try {
                this.mCamera.cancelAutoFocus();
                this.mCameraParameters.setFocusMode("auto");
                setParametersInternal();
                this.mCamera.autoFocus(new Camera.AutoFocusCallback() { // from class: com.glority.camera.Camera1.3
                    @Override // android.hardware.Camera.AutoFocusCallback
                    public void onAutoFocus(boolean z, Camera camera) {
                        Camera1.this.endAutoFocus();
                    }
                });
            } catch (Exception unused) {
                if (this.mCallBack != null) {
                    this.mCallBack.onException(new CameraException(CameraException.CAMERA_ERROR, ""));
                }
            }
        }
    }

    @Override // com.glority.camera.ICamera
    public void focusOn(int i, int i2) {
        Rect rect;
        if (!isCameraOpened() || this.mPreview.getWidth() == 0 || this.mPreview.getHeight() == 0) {
            return;
        }
        Rect rect2 = new Rect(i - 100, i2 - 100, i + 100, i2 + 100);
        int i3 = this.mDisplayOrientation;
        if (i3 == 90) {
            rect = new Rect(((rect2.top * 2000) / this.mPreview.getHeight()) - 1000, (((this.mPreview.getWidth() - rect2.right) * 2000) / this.mPreview.getWidth()) - 1000, ((rect2.bottom * 2000) / this.mPreview.getHeight()) - 1000, (((this.mPreview.getWidth() - rect2.left) * 2000) / this.mPreview.getWidth()) - 1000);
        } else if (i3 == 180) {
            rect = new Rect((((this.mPreview.getWidth() - rect2.right) * 2000) / this.mPreview.getWidth()) - 1000, (((this.mPreview.getHeight() - rect2.bottom) * 2000) / this.mPreview.getHeight()) - 1000, (((this.mPreview.getWidth() - rect2.left) * 2000) / this.mPreview.getWidth()) - 1000, (((this.mPreview.getHeight() - rect2.top) * 2000) / this.mPreview.getHeight()) - 1000);
        } else if (i3 == 270) {
            rect = new Rect((((this.mPreview.getHeight() - rect2.bottom) * 2000) / this.mPreview.getHeight()) - 1000, ((rect2.left * 2000) / this.mPreview.getWidth()) - 1000, (((this.mPreview.getHeight() - rect2.top) * 2000) / this.mPreview.getHeight()) - 1000, ((rect2.right * 2000) / this.mPreview.getWidth()) - 1000);
        } else {
            rect = new Rect(((rect2.left * 2000) / this.mPreview.getWidth()) - 1000, ((rect2.top * 2000) / this.mPreview.getHeight()) - 1000, ((rect2.right * 2000) / this.mPreview.getWidth()) - 1000, ((rect2.bottom * 2000) / this.mPreview.getHeight()) - 1000);
        }
        if (rect.left < -1000) {
            rect.left = 1000;
        }
        if (rect.top < -1000) {
            rect.top = 1000;
        }
        if (rect.right > 1000) {
            rect.right = 1000;
        }
        if (rect.bottom > 1000) {
            rect.bottom = 1000;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Camera.Area(rect, 100));
        Camera.Parameters parameters = this.mCameraParameters;
        if (parameters != null) {
            parameters.setFocusAreas(arrayList);
            this.mCameraParameters.setMeteringAreas(arrayList);
            setParametersInternal();
            autoFocus();
        }
    }

    @Override // com.glority.camera.CameraImpl
    protected void restoreFocusArea() {
        if (isCameraOpened()) {
            this.mCameraParameters.setFocusAreas(null);
            this.mCameraParameters.setMeteringAreas(null);
            setParametersInternal();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void chooseCamera() {
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.getCameraInfo(i, this.mCameraInfo);
            if (this.mCameraInfo.facing == INTERNAL_FACING.get(this.mFacing)) {
                this.mCameraId = i;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openCamera() {
        try {
            Camera open = Camera.open(this.mCameraId);
            this.mCamera = open;
            this.mCameraParameters = open.getParameters();
            this.mPreviewSizes.clear();
            for (Camera.Size size : this.mCameraParameters.getSupportedPreviewSizes()) {
                this.mPreviewSizes.addSize(new Size(size.width, size.height));
            }
            this.mPictureSizes.clear();
            for (Camera.Size size2 : this.mCameraParameters.getSupportedPictureSizes()) {
                this.mPictureSizes.addSize(new Size(size2.width, size2.height));
            }
            Iterator<AspectRatio> it = this.mPreviewSizes.ratios().iterator();
            while (it.hasNext()) {
                if (!this.mPictureSizes.ratios().contains(it.next())) {
                    it.remove();
                }
            }
            if (this.mPreviewSizes.isEmpty()) {
                Camera.Size size3 = this.mCameraParameters.getSupportedPreviewSizes().get(0);
                this.mPreviewSizes.addSize(new Size(size3.width, size3.height));
            }
            if (!this.mPreviewSizes.ratios().contains(this.mAspectRatio)) {
                this.mAspectRatio = this.mPreviewSizes.ratios().iterator().next();
                if (this.mCallBack != null) {
                    this.mCallBack.onLayoutRequested();
                }
            }
            adjustCameraParameters();
            if (this.mCallBack != null) {
                this.mCallBack.onCameraOpened();
            }
        } catch (Exception e) {
            if (this.mCallBack != null) {
                this.mCallBack.onException(new CameraException(CameraException.CAMERA_ERROR, "call Camera1.openCamera failed. internal error message is: " + e.getMessage()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void adjustCameraParameters() {
        try {
            Size chooseOptimalSize = chooseOptimalSize(this.mPreviewSizes);
            if (this.mShowingPreview) {
                this.mCamera.stopPreview();
            }
            this.mCameraParameters.setPreviewSize(chooseOptimalSize.getWidth(), chooseOptimalSize.getHeight());
            Size chooseOptimalSize2 = chooseOptimalSize(this.mPictureSizes);
            this.mCameraParameters.setPictureSize(chooseOptimalSize2.getWidth(), chooseOptimalSize2.getHeight());
            setParametersInternal();
            int i = ((this.mCameraInfo.orientation + 360) + (this.mFacing == 1 ? 180 : 0)) % 360;
            this.mDisplayOrientation = i;
            this.mCamera.setDisplayOrientation(i);
            updateAutoFocus();
            updateFlash();
            updateZoom();
            if (this.mShowingPreview) {
                this.mCamera.startPreview();
            }
        } catch (Exception e) {
            if (this.mCallBack != null) {
                this.mCallBack.onException(new CameraException(CameraException.CAMERA_ERROR, "Call Camera1.adjustCameraParameters failed, internal error message is: " + e.getMessage()));
            }
        }
    }

    private Size chooseOptimalSize(SizeMap sizeMap) {
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
        for (Size size : sizes) {
            if (size.getWidth() >= width && size.getHeight() >= height) {
                return size;
            }
        }
        return sizes.last();
    }

    private void takePictureInternal() {
        if (isCameraOpened()) {
            try {
                this.mCameraParameters.setRotation(getPictureRotation());
                setParametersInternal();
                if (this.mIsPictureCaptureInProgress.getAndSet(true)) {
                    return;
                }
                this.mCamera.takePicture(null, null, null, new Camera.PictureCallback() { // from class: com.glority.camera.Camera1.4
                    @Override // android.hardware.Camera.PictureCallback
                    public void onPictureTaken(byte[] bArr, Camera camera) {
                        if (Camera1.this.mCallBack != null) {
                            Camera1.this.mCallBack.onPictureTaken(bArr);
                        }
                        Camera1.this.mIsPictureCaptureInProgress.set(false);
                        try {
                            camera.cancelAutoFocus();
                            camera.startPreview();
                        } catch (Exception e) {
                            if (Camera1.this.mCallBack != null) {
                                Camera1.this.mCallBack.onException(new CameraException(CameraException.CAMERA_ERROR, "Exception in Camera1.onPictureTaken... message: " + e.getMessage()));
                            }
                        }
                    }
                });
            } catch (Exception e) {
                if (this.mCallBack != null) {
                    this.mCallBack.onException(new CameraException(CameraException.CAMERA_ERROR, "call Camera1.takePictureInternal failed. message: " + e.getMessage()));
                }
            }
        }
    }

    private int getPictureRotation() {
        return (((this.mCameraInfo.orientation + (getRotation() * 90)) + getDeviceRotation()) + (isLandscape() ? 180 : 0)) % 360;
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

    private boolean isLandscape() {
        return getRotation() == 1 || getRotation() == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isCameraOpened() {
        return this.mCamera != null;
    }

    private void setParametersInternal() {
        if (isCameraOpened()) {
            try {
                this.mCamera.setParameters(this.mCameraParameters);
            } catch (Exception e) {
                try {
                    this.mCameraParameters = this.mCamera.getParameters();
                } catch (Exception e2) {
                    if (this.mCallBack != null) {
                        this.mCallBack.onException(new CameraException(CameraException.CAMERA_ERROR, "call Camera1.setParametersInternal failed. internal message: " + e2.getMessage()));
                    }
                }
                if (this.mCallBack != null) {
                    this.mCallBack.onException(new CameraException(CameraException.CAMERA_ERROR, "call Camera1.getParameters failed. internal message: " + e.getMessage()));
                }
            }
        }
    }

    private void stopCamera() {
        final ICamera.Callback callback = this.mCallBack;
        try {
            if (isCameraOpened()) {
                stopPreview();
                final Camera camera = this.mCamera;
                this.mBackgroundHandler.post(new Runnable() { // from class: com.glority.camera.Camera1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            camera.release();
                        } catch (Throwable th) {
                            ICamera.Callback callback2 = callback;
                            if (callback2 != null) {
                                callback2.onException(new CameraException(CameraException.CAMERA_ERROR, "Camera1 - release camera failed. message: " + th.getMessage()));
                            }
                        }
                    }
                });
                this.mCamera = null;
                if (callback != null) {
                    callback.onCameraClosed();
                }
            }
        } catch (Exception e) {
            if (callback != null) {
                callback.onException(new CameraException(20000, "Camera1 - stop camera failed. message: " + e.getMessage()));
            }
        }
    }

    private void stopBackgroundThread() {
        final ICamera.Callback callback = this.mCallBack;
        try {
            final HandlerThread handlerThread = this.mBackgroundThread;
            this.mBackgroundHandler.post(new Runnable() { // from class: com.glority.camera.Camera1.6
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        handlerThread.quitSafely();
                    } catch (Throwable th) {
                        ICamera.Callback callback2 = callback;
                        if (callback2 != null) {
                            callback2.onException(new CameraException(20000, "Camera1 - quit background thread failed. message: " + th.getMessage()));
                        }
                    }
                }
            });
            this.mBackgroundHandler = null;
            this.mBackgroundThread = null;
        } catch (Throwable th) {
            if (callback != null) {
                callback.onException(new CameraException(20000, "Camera1 - stopBackgroundThread failed. message: " + th.getMessage()));
            }
        }
    }
}
