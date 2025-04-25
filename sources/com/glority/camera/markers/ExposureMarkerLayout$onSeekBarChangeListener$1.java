package com.glority.camera.markers;

import android.os.CountDownTimer;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.glority.camera.R;
import com.glority.camera.markers.ExposureMarkerLayout;
import com.glority.camera.widgets.CameraHorizontalSeekBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExposureMarkerLayout.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0002\u0000\u0005\b\n\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"com/glority/camera/markers/ExposureMarkerLayout$onSeekBarChangeListener$1", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "mProgress", "", "timer", "com/glority/camera/markers/ExposureMarkerLayout$onSeekBarChangeListener$1$timer$1", "getTimer", "()Lcom/glority/camera/markers/ExposureMarkerLayout$onSeekBarChangeListener$1$timer$1;", "Lcom/glority/camera/markers/ExposureMarkerLayout$onSeekBarChangeListener$1$timer$1;", "onProgressChanged", "", "seekBar", "Landroid/widget/SeekBar;", "progress", "fromUser", "", "onStartTrackingTouch", "onStopTrackingTouch", "camera_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes6.dex */
public final class ExposureMarkerLayout$onSeekBarChangeListener$1 implements SeekBar.OnSeekBarChangeListener {
    private int mProgress;
    final /* synthetic */ ExposureMarkerLayout this$0;
    private final ExposureMarkerLayout$onSeekBarChangeListener$1$timer$1 timer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.glority.camera.markers.ExposureMarkerLayout$onSeekBarChangeListener$1$timer$1] */
    public ExposureMarkerLayout$onSeekBarChangeListener$1(ExposureMarkerLayout exposureMarkerLayout) {
        this.this$0 = exposureMarkerLayout;
        final long j = 1000;
        final long j2 = 1000;
        this.timer = new CountDownTimer(j, j2) { // from class: com.glority.camera.markers.ExposureMarkerLayout$onSeekBarChangeListener$1$timer$1
            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                CameraHorizontalSeekBar cameraHorizontalSeekBar;
                CameraHorizontalSeekBar cameraHorizontalSeekBar2;
                ExposureMarkerLayout.ExposureChangeListener exposureChangeListener;
                int i;
                cameraHorizontalSeekBar = ExposureMarkerLayout$onSeekBarChangeListener$1.this.this$0.mSeekBarTop;
                if (cameraHorizontalSeekBar != null) {
                    cameraHorizontalSeekBar.setTrackVisible(8);
                }
                cameraHorizontalSeekBar2 = ExposureMarkerLayout$onSeekBarChangeListener$1.this.this$0.mSeekBarBottom;
                if (cameraHorizontalSeekBar2 != null) {
                    cameraHorizontalSeekBar2.setTrackVisible(8);
                }
                ImageView iv_top_minus = (ImageView) ExposureMarkerLayout$onSeekBarChangeListener$1.this.this$0._$_findCachedViewById(R.id.iv_top_minus);
                Intrinsics.checkExpressionValueIsNotNull(iv_top_minus, "iv_top_minus");
                iv_top_minus.setVisibility(8);
                ImageView iv_top_plus = (ImageView) ExposureMarkerLayout$onSeekBarChangeListener$1.this.this$0._$_findCachedViewById(R.id.iv_top_plus);
                Intrinsics.checkExpressionValueIsNotNull(iv_top_plus, "iv_top_plus");
                iv_top_plus.setVisibility(8);
                ImageView iv_bottom_minus = (ImageView) ExposureMarkerLayout$onSeekBarChangeListener$1.this.this$0._$_findCachedViewById(R.id.iv_bottom_minus);
                Intrinsics.checkExpressionValueIsNotNull(iv_bottom_minus, "iv_bottom_minus");
                iv_bottom_minus.setVisibility(8);
                ImageView iv_bottom_plus = (ImageView) ExposureMarkerLayout$onSeekBarChangeListener$1.this.this$0._$_findCachedViewById(R.id.iv_bottom_plus);
                Intrinsics.checkExpressionValueIsNotNull(iv_bottom_plus, "iv_bottom_plus");
                iv_bottom_plus.setVisibility(8);
                exposureChangeListener = ExposureMarkerLayout$onSeekBarChangeListener$1.this.this$0.mExposureChangeListener;
                if (exposureChangeListener != null) {
                    i = ExposureMarkerLayout$onSeekBarChangeListener$1.this.mProgress;
                    exposureChangeListener.onChangeFinished(i - 50);
                }
            }
        };
    }

    public final ExposureMarkerLayout$onSeekBarChangeListener$1$timer$1 getTimer() {
        return this.timer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        r1 = r0.this$0.mSeekBarBottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x000e, code lost:
    
        r1 = r0.this$0.mSeekBarTop;
     */
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onProgressChanged(android.widget.SeekBar r1, int r2, boolean r3) {
        /*
            r0 = this;
            com.glority.camera.markers.ExposureMarkerLayout r1 = r0.this$0
            com.glority.camera.widgets.CameraHorizontalSeekBar r1 = com.glority.camera.markers.ExposureMarkerLayout.access$getMSeekBarTop$p(r1)
            if (r1 == 0) goto Le
            int r1 = r1.getProgress()
            if (r1 == r2) goto L19
        Le:
            com.glority.camera.markers.ExposureMarkerLayout r1 = r0.this$0
            com.glority.camera.widgets.CameraHorizontalSeekBar r1 = com.glority.camera.markers.ExposureMarkerLayout.access$getMSeekBarTop$p(r1)
            if (r1 == 0) goto L19
            r1.setProgress(r2)
        L19:
            com.glority.camera.markers.ExposureMarkerLayout r1 = r0.this$0
            com.glority.camera.widgets.CameraHorizontalSeekBar r1 = com.glority.camera.markers.ExposureMarkerLayout.access$getMSeekBarBottom$p(r1)
            if (r1 == 0) goto L27
            int r1 = r1.getProgress()
            if (r1 == r2) goto L32
        L27:
            com.glority.camera.markers.ExposureMarkerLayout r1 = r0.this$0
            com.glority.camera.widgets.CameraHorizontalSeekBar r1 = com.glority.camera.markers.ExposureMarkerLayout.access$getMSeekBarBottom$p(r1)
            if (r1 == 0) goto L32
            r1.setProgress(r2)
        L32:
            com.glority.camera.markers.ExposureMarkerLayout r1 = r0.this$0
            com.glority.camera.markers.ExposureMarkerLayout$ExposureChangeListener r1 = com.glority.camera.markers.ExposureMarkerLayout.access$getMExposureChangeListener$p(r1)
            if (r1 == 0) goto L3d
            r1.onChange(r2)
        L3d:
            r0.mProgress = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.camera.markers.ExposureMarkerLayout$onSeekBarChangeListener$1.onProgressChanged(android.widget.SeekBar, int, boolean):void");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        CameraHorizontalSeekBar cameraHorizontalSeekBar;
        CameraHorizontalSeekBar cameraHorizontalSeekBar2;
        cameraHorizontalSeekBar = this.this$0.mSeekBarTop;
        if (cameraHorizontalSeekBar != null) {
            cameraHorizontalSeekBar.setTrackVisible(0);
        }
        cameraHorizontalSeekBar2 = this.this$0.mSeekBarBottom;
        if (cameraHorizontalSeekBar2 != null) {
            cameraHorizontalSeekBar2.setTrackVisible(0);
        }
        ImageView iv_top_minus = (ImageView) this.this$0._$_findCachedViewById(R.id.iv_top_minus);
        Intrinsics.checkExpressionValueIsNotNull(iv_top_minus, "iv_top_minus");
        iv_top_minus.setVisibility(0);
        ImageView iv_top_plus = (ImageView) this.this$0._$_findCachedViewById(R.id.iv_top_plus);
        Intrinsics.checkExpressionValueIsNotNull(iv_top_plus, "iv_top_plus");
        iv_top_plus.setVisibility(0);
        ImageView iv_bottom_minus = (ImageView) this.this$0._$_findCachedViewById(R.id.iv_bottom_minus);
        Intrinsics.checkExpressionValueIsNotNull(iv_bottom_minus, "iv_bottom_minus");
        iv_bottom_minus.setVisibility(0);
        ImageView iv_bottom_plus = (ImageView) this.this$0._$_findCachedViewById(R.id.iv_bottom_plus);
        Intrinsics.checkExpressionValueIsNotNull(iv_bottom_plus, "iv_bottom_plus");
        iv_bottom_plus.setVisibility(0);
        cancel();
        this.this$0.cancelAnimation();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        start();
        this.this$0.startAnimation(false);
    }
}
