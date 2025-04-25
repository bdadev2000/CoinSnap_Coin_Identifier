package com.glority.android.picturexx.recognize.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.FrameLayout;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.ZoomState;
import androidx.camera.view.CameraController;
import androidx.camera.view.PreviewView;
import androidx.core.app.NotificationCompat;
import com.glority.camera.markers.FocusMarkerLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CoinCameraPreviewView.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J\u0018\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010$\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0014H\u0002J\u0018\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0014H\u0002R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/glority/android/picturexx/recognize/camera/CoinCameraPreviewView;", "Landroid/widget/FrameLayout;", "Landroid/view/ScaleGestureDetector$OnScaleGestureListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "cameraXPreviewView", "Landroidx/camera/view/PreviewView;", "getCameraXPreviewView", "()Landroidx/camera/view/PreviewView;", "focusMarkerLayout", "Lcom/glority/camera/markers/FocusMarkerLayout;", "cameraController", "Landroidx/camera/view/CameraController;", "mScaleGestureDetector", "Landroid/view/ScaleGestureDetector;", "AF_SIZE", "", "AE_SIZE", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "setCameraController", "", "mOnTapGestureDetector", "Landroid/view/GestureDetector;", "onTouchEvent", NotificationCompat.CATEGORY_EVENT, "onPinchToZoom", "pinchToZoomScale", "onScale", "detector", "onScaleBegin", "onScaleEnd", "speedUpZoomBy2X", "scaleFactor", "focusOn", "x", "y", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CoinCameraPreviewView extends FrameLayout implements ScaleGestureDetector.OnScaleGestureListener {
    private final float AE_SIZE;
    private final float AF_SIZE;
    private CameraController cameraController;
    private final PreviewView cameraXPreviewView;
    private final FocusMarkerLayout focusMarkerLayout;
    private final GestureDetector mOnTapGestureDetector;
    private final ScaleGestureDetector mScaleGestureDetector;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoinCameraPreviewView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final float speedUpZoomBy2X(float scaleFactor) {
        return scaleFactor > 1.0f ? ((scaleFactor - 1.0f) * 2) + 1.0f : 1.0f - ((1.0f - scaleFactor) * 2);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
    }

    public /* synthetic */ CoinCameraPreviewView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinCameraPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mScaleGestureDetector = new ScaleGestureDetector(context, this);
        this.AF_SIZE = 0.16666667f;
        this.AE_SIZE = 0.16666667f * 1.5f;
        PreviewView previewView = new PreviewView(context);
        this.cameraXPreviewView = previewView;
        addView(previewView, -1, -1);
        FocusMarkerLayout focusMarkerLayout = new FocusMarkerLayout(context);
        this.focusMarkerLayout = focusMarkerLayout;
        addView(focusMarkerLayout, -1, -1);
        this.mOnTapGestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.glority.android.picturexx.recognize.camera.CoinCameraPreviewView$mOnTapGestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent e) {
                FocusMarkerLayout focusMarkerLayout2;
                Intrinsics.checkNotNullParameter(e, "e");
                focusMarkerLayout2 = CoinCameraPreviewView.this.focusMarkerLayout;
                focusMarkerLayout2.focus(e.getX(), e.getY(), CoinCameraPreviewView.this.getMeasuredWidth(), CoinCameraPreviewView.this.getMeasuredHeight());
                CoinCameraPreviewView.this.focusOn(e.getX(), e.getY());
                return true;
            }
        });
    }

    public final PreviewView getCameraXPreviewView() {
        return this.cameraXPreviewView;
    }

    public final void setCameraController(CameraController cameraController) {
        this.cameraController = cameraController;
        this.cameraXPreviewView.setController(cameraController);
        if (cameraController != null) {
            cameraController.setTapToFocusEnabled(false);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.mOnTapGestureDetector.onTouchEvent(event) || this.mScaleGestureDetector.onTouchEvent(event) || super.onTouchEvent(event);
    }

    private final void onPinchToZoom(float pinchToZoomScale, CameraController cameraController) {
        ZoomState value = cameraController.getZoomState().getValue();
        if (value == null) {
            return;
        }
        cameraController.setZoomRatio(Math.min(Math.max(value.getZoomRatio() * speedUpZoomBy2X(pinchToZoomScale), value.getMinZoomRatio()), value.getMaxZoomRatio()));
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        CameraController cameraController = this.cameraController;
        if (cameraController == null) {
            return true;
        }
        onPinchToZoom(detector.getScaleFactor(), cameraController);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void focusOn(float x, float y) {
        CameraControl cameraControl;
        MeteringPoint createPoint = this.cameraXPreviewView.getMeteringPointFactory().createPoint(x, y, this.AF_SIZE);
        Intrinsics.checkNotNullExpressionValue(createPoint, "createPoint(...)");
        MeteringPoint createPoint2 = this.cameraXPreviewView.getMeteringPointFactory().createPoint(x, y, this.AE_SIZE);
        Intrinsics.checkNotNullExpressionValue(createPoint2, "createPoint(...)");
        FocusMeteringAction build = new FocusMeteringAction.Builder(createPoint, 1).addPoint(createPoint2, 2).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        CameraController cameraController = this.cameraController;
        if (cameraController == null || (cameraControl = cameraController.getCameraControl()) == null) {
            return;
        }
        cameraControl.startFocusAndMetering(build);
    }
}
