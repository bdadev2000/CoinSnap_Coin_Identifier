package com.glority.camera;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.glority.camera.ICamera;
import com.glority.camera.SensorController;
import com.glority.camera.markers.BaseMarkerLayout;
import com.glority.camera.markers.ExposureMarkerLayout;
import com.glority.camera.markers.FocusMarkerLayout;

/* loaded from: classes6.dex */
public class CameraView extends FrameLayout implements LifecycleObserver {
    private static final float MAX_ZOOM_SCALE = 10.0f;
    private boolean autoRotateOutputImage;
    private Callback callback;
    private boolean mAdjustViewBounds;
    private ICamera mCamera;
    private boolean mEnableExposureAdjust;
    private final ExposureMarkerLayout.ExposureChangeListener mExposureChangeListener;
    private final GestureDetector mGestureDetector;
    private boolean mIsScaling;
    private BaseMarkerLayout mMarkerLayout;
    private IPreview mPreview;
    private int mRotation;
    private final ScaleGestureDetector mScaleGestureDetector;
    private SensorController mSensorController;
    private CameraLogRecord record;

    /* loaded from: classes6.dex */
    public static abstract class Callback {
        public void onAutoFocused() {
        }

        public void onCameraClosed(ICamera iCamera) {
        }

        public void onCameraOpened(ICamera iCamera) {
        }

        public void onException(ICamera iCamera, CameraException cameraException) {
        }

        public void onExposureChangeFinished(ICamera iCamera, int i) {
        }

        public void onFocusTap(ICamera iCamera) {
        }

        public void onLightChanged(ICamera iCamera, float f) {
        }

        public void onLogEvent(String str, Bundle bundle) {
        }

        public void onPictureTaken(ICamera iCamera, byte[] bArr) {
        }

        public void onZoomChanged(ICamera iCamera, int i) {
        }
    }

    public CameraView(Context context) {
        this(context, null);
    }

    public CameraView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CameraView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIsScaling = false;
        this.mScaleGestureDetector = new ScaleGestureDetector(getContext(), new ScaleGestureDetector.OnScaleGestureListener() { // from class: com.glority.camera.CameraView.1
            int beginZoom = 0;
            float unitZoom = 0.0f;

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                CameraView.this.mIsScaling = true;
                this.beginZoom = CameraView.this.mCamera.getZoom();
                this.unitZoom = CameraView.this.mCamera.getMaxZoom() / 9.0f;
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                int scaleFactor = (int) ((((((this.beginZoom / this.unitZoom) + 1.0f) * scaleGestureDetector.getScaleFactor()) - 1.0f) * this.unitZoom) + 0.5d);
                CameraView.this.mCamera.setZoom(scaleFactor);
                if (CameraView.this.callback == null) {
                    return false;
                }
                CameraView.this.callback.onZoomChanged(CameraView.this.mCamera, scaleFactor);
                return false;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                CameraView.this.mIsScaling = false;
            }
        });
        this.mGestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.glority.camera.CameraView.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                if (CameraView.this.record != null) {
                    CameraView.this.record.manualFocus = true;
                }
                if (CameraView.this.callback != null) {
                    CameraView.this.callback.onFocusTap(CameraView.this.mCamera);
                }
                CameraView.this.mMarkerLayout.focus(motionEvent.getX(), motionEvent.getY(), CameraView.this.getMeasuredWidth(), CameraView.this.getMeasuredHeight());
                CameraView.this.focusOn((int) motionEvent.getX(), (int) motionEvent.getY());
                return super.onSingleTapUp(motionEvent);
            }
        });
        this.mExposureChangeListener = new ExposureMarkerLayout.ExposureChangeListener() { // from class: com.glority.camera.CameraView.3
            @Override // com.glority.camera.markers.ExposureMarkerLayout.ExposureChangeListener
            public void onChange(int i2) {
                CameraView.this.mCamera.setExposureRatio(i2);
            }

            @Override // com.glority.camera.markers.ExposureMarkerLayout.ExposureChangeListener
            public void onChangeFinished(int i2) {
                if (CameraView.this.callback != null) {
                    CameraView.this.callback.onExposureChangeFinished(CameraView.this.mCamera, i2);
                }
            }
        };
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CameraView, i, 0);
        this.mAdjustViewBounds = obtainStyledAttributes.getBoolean(R.styleable.CameraView_android_adjustViewBounds, false);
        this.autoRotateOutputImage = obtainStyledAttributes.getBoolean(R.styleable.CameraView_autoRotateOutputImage, false);
        this.mEnableExposureAdjust = obtainStyledAttributes.getBoolean(R.styleable.CameraView_enableExposureAdjust, false);
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.CameraView_autoFocus, true);
        int i2 = obtainStyledAttributes.getInt(R.styleable.CameraView_facing, 0);
        int i3 = obtainStyledAttributes.getInt(R.styleable.CameraView_flash, 0);
        obtainStyledAttributes.recycle();
        this.mCamera = CameraFactory.newCamera(getContext());
        initView();
        this.record = new CameraLogRecord();
        initSensorController();
        initCamera(z, i2, i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Display display;
        super.onAttachedToWindow();
        if (isInEditMode() || (display = ViewCompat.getDisplay(this)) == null) {
            return;
        }
        this.mRotation = display.getRotation();
        Log.d("CameraView", "Display#getRotation: " + this.mRotation);
        this.mCamera.setRotation(this.mRotation);
        this.mPreview.setRotation(this.mRotation);
        if (this.autoRotateOutputImage) {
            DeviceOrientationDetector.getInstance().enable();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (!isInEditMode() && this.autoRotateOutputImage) {
            DeviceOrientationDetector.getInstance().disable();
        }
        super.onDetachedFromWindow();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(LifecycleOwner lifecycleOwner) {
        Log.d("CameraView", "onResume..");
        start();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause(LifecycleOwner lifecycleOwner) {
        Log.d("CameraView", "onPause..");
        stop();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (isInEditMode()) {
            super.onMeasure(i, i2);
            return;
        }
        if (this.mAdjustViewBounds) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            AspectRatio aspectRatio = this.mCamera.getAspectRatio();
            if (mode == 1073741824 && mode2 != 1073741824) {
                int size = (int) (View.MeasureSpec.getSize(i) * aspectRatio.toFloat());
                if (mode2 == Integer.MIN_VALUE) {
                    size = Math.min(size, View.MeasureSpec.getSize(i2));
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            } else if (mode != 1073741824 && mode2 == 1073741824) {
                int size2 = (int) (View.MeasureSpec.getSize(i2) * aspectRatio.toFloat());
                if (mode == Integer.MIN_VALUE) {
                    size2 = Math.min(size2, View.MeasureSpec.getSize(i));
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), i2);
            } else {
                super.onMeasure(i, i2);
            }
        } else {
            super.onMeasure(i, i2);
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        AspectRatio aspectRatio2 = this.mCamera.getAspectRatio();
        int i3 = this.mRotation;
        if (i3 == 0 || i3 == 2) {
            aspectRatio2 = aspectRatio2.inverse();
        }
        if (measuredHeight < (aspectRatio2.getY() * measuredWidth) / aspectRatio2.getX()) {
            this.mPreview.getView().measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec((measuredWidth * aspectRatio2.getY()) / aspectRatio2.getX(), 1073741824));
        } else {
            this.mPreview.getView().measure(View.MeasureSpec.makeMeasureSpec((aspectRatio2.getX() * measuredHeight) / aspectRatio2.getY(), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.mScaleGestureDetector.onTouchEvent(motionEvent);
        if (this.mIsScaling) {
            return onTouchEvent;
        }
        return this.mGestureDetector.onTouchEvent(motionEvent) || onTouchEvent;
    }

    private void initView() {
        this.mPreview = new TextureViewPreview(getContext(), this);
        if (this.mCamera.isCamera2() && this.mEnableExposureAdjust) {
            setEnableExposureAdjust(true);
            return;
        }
        FocusMarkerLayout focusMarkerLayout = new FocusMarkerLayout(getContext());
        this.mMarkerLayout = focusMarkerLayout;
        addView(focusMarkerLayout);
    }

    private void initSensorController() {
        SensorController sensorController = new SensorController(getContext());
        this.mSensorController = sensorController;
        sensorController.setOnLightChangedListener(new SensorController.OnLightChangedListener() { // from class: com.glority.camera.CameraView.4
            @Override // com.glority.camera.SensorController.OnLightChangedListener
            public void onLightChanged(SensorController sensorController2, float f) {
                if (CameraView.this.callback != null) {
                    CameraView.this.callback.onLightChanged(CameraView.this.mCamera, f);
                }
            }
        });
    }

    private void initCamera(boolean z, int i, int i2) {
        this.mCamera.setAutoFocus(z);
        this.mCamera.setFacing(i);
        this.mCamera.setFlash(i2);
        this.mCamera.setAspectRatio(AspectRatio.DEFAULT_RATIO);
        this.mCamera.setSensorController(this.mSensorController);
        this.mCamera.setCallBack(new ICamera.Callback() { // from class: com.glority.camera.CameraView.5
            final long initTs = System.currentTimeMillis();

            @Override // com.glority.camera.ICamera.Callback
            public void onCameraOpened() {
                if (CameraView.this.record != null) {
                    CameraView.this.record.module = CameraView.this.mCamera.isCamera2() ? 2 : 1;
                    CameraView.this.record.launchTime = System.currentTimeMillis() - this.initTs;
                }
                if (CameraView.this.callback != null) {
                    CameraView.this.callback.onCameraOpened(CameraView.this.mCamera);
                }
            }

            @Override // com.glority.camera.ICamera.Callback
            public void onCameraClosed() {
                if (CameraView.this.callback != null) {
                    CameraView.this.callback.onCameraClosed(CameraView.this.mCamera);
                }
            }

            @Override // com.glority.camera.ICamera.Callback
            public void onAutoFocused() {
                if (CameraView.this.record.autoFocusTime == 0) {
                    CameraView.this.record.autoFocusTime = System.currentTimeMillis() - (this.initTs + CameraView.this.record.launchTime);
                }
                if (CameraView.this.callback != null) {
                    CameraView.this.callback.onAutoFocused();
                }
            }

            @Override // com.glority.camera.ICamera.Callback
            public void onPictureTaken(byte[] bArr) {
                if (CameraView.this.record != null && CameraView.this.record.shotTs > 0) {
                    CameraView.this.record.outputDataTime = System.currentTimeMillis() - CameraView.this.record.shotTs;
                    CameraView.this.record.fileSize = bArr.length;
                }
                if (CameraView.this.callback != null) {
                    if (CameraView.this.record != null) {
                        CameraView.this.callback.onLogEvent(CameraLogRecord.EVENT_CAMERA_PERFORMANCE, CameraView.this.record.toBundle());
                    }
                    CameraView.this.callback.onPictureTaken(CameraView.this.mCamera, bArr);
                }
            }

            @Override // com.glority.camera.ICamera.Callback
            public void onLayoutRequested() {
                CameraView.this.requestLayout();
            }

            @Override // com.glority.camera.ICamera.Callback
            public void onException(CameraException cameraException) {
                if (CameraView.this.callback != null) {
                    CameraView.this.callback.onException(CameraView.this.mCamera, cameraException);
                }
            }
        });
        this.mCamera.initPreview(this.mPreview);
    }

    public void setEnableExposureAdjust(boolean z) {
        if (this.mCamera.isCamera2()) {
            this.mEnableExposureAdjust = z;
            if (z) {
                BaseMarkerLayout baseMarkerLayout = this.mMarkerLayout;
                if (baseMarkerLayout != null) {
                    removeView(baseMarkerLayout);
                }
                ExposureMarkerLayout exposureMarkerLayout = new ExposureMarkerLayout(getContext());
                exposureMarkerLayout.setOnExposureChangeListener(this.mExposureChangeListener);
                this.mMarkerLayout = exposureMarkerLayout;
            } else {
                BaseMarkerLayout baseMarkerLayout2 = this.mMarkerLayout;
                if (baseMarkerLayout2 != null) {
                    removeView(baseMarkerLayout2);
                }
                this.mMarkerLayout = new FocusMarkerLayout(getContext());
            }
            addView(this.mMarkerLayout);
        }
    }

    public void setFlash(int i) {
        this.mCamera.setFlash(i);
    }

    public int getFlash() {
        return this.mCamera.getFlash();
    }

    public void setFacing(int i) {
        this.mCamera.setFacing(i);
    }

    public int getFacing() {
        return this.mCamera.getFacing();
    }

    public int getCameraRotation() {
        return this.mCamera.getRotation();
    }

    public void takePicture() {
        CameraLogRecord cameraLogRecord = this.record;
        if (cameraLogRecord != null) {
            cameraLogRecord.shotTs = System.currentTimeMillis();
        }
        this.mCamera.takePicture();
    }

    public IPreview getPreview() {
        return this.mCamera.getPreview();
    }

    public boolean start() {
        if (ActivityCompat.checkSelfPermission(getContext(), "android.permission.CAMERA") != 0) {
            Callback callback = this.callback;
            if (callback == null) {
                return false;
            }
            callback.onException(null, new CameraException(CameraException.CAMERA_PERMISSION_NOT_GRANTED, "Camera permission not granted."));
            return false;
        }
        boolean start = this.mCamera.start();
        if (start || !this.mCamera.isCamera2()) {
            return start;
        }
        ICamera newCamera1 = CameraFactory.newCamera1(this.mCamera);
        this.mCamera = newCamera1;
        return newCamera1.start();
    }

    public void stop() {
        if (ActivityCompat.checkSelfPermission(getContext(), "android.permission.CAMERA") != 0) {
            Callback callback = this.callback;
            if (callback != null) {
                callback.onException(null, new CameraException(CameraException.CAMERA_PERMISSION_NOT_GRANTED, "Camera permission not granted."));
                return;
            }
            return;
        }
        this.mCamera.stop();
    }

    public boolean startPreview() {
        return this.mCamera.startPreview();
    }

    public void stopPreview() {
        this.mCamera.stopPreview();
    }

    public void setAutoFocus(boolean z) {
        this.mCamera.setAutoFocus(z);
    }

    public boolean getAutoFocus() {
        return this.mCamera.getAutoFocus();
    }

    public void setAspectRatio(AspectRatio aspectRatio) {
        this.mCamera.setAspectRatio(aspectRatio);
    }

    public AspectRatio getAspectRatio() {
        return this.mCamera.getAspectRatio();
    }

    public void setZoom(int i) {
        this.mCamera.setZoom(i);
    }

    public int getZoom() {
        return this.mCamera.getZoom();
    }

    public int getMaxZoom() {
        return this.mCamera.getMaxZoom();
    }

    public void autoFocus() {
        this.mCamera.autoFocus();
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public void focusOn(int i, int i2) {
        this.mCamera.focusOn(i + ((this.mPreview.getView().getWidth() - getWidth()) / 2), i2 + ((this.mPreview.getView().getHeight() - getHeight()) / 2));
    }

    public void setMaxCaptureSize(Size size) {
        this.mCamera.setMaxCaptureSize(size);
    }
}
