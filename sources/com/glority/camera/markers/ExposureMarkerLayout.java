package com.glority.camera.markers;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.cmsui2.common.CmsUILogEvents;
import com.glority.android.xx.constants.LogEvents;
import com.glority.camera.R;
import com.glority.camera.widgets.CameraHorizontalSeekBar;
import com.glority.utils.app.ResUtils;
import com.glority.utils.ui.ViewUtils;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExposureMarkerLayout.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\b\b\u0001\u0010\u0019\u001a\u00020\u0007J\u0010\u0010\u001a\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\nJ\u0012\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/glority/camera/markers/ExposureMarkerLayout;", "Lcom/glority/camera/markers/BaseMarkerLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mExposureChangeListener", "Lcom/glority/camera/markers/ExposureMarkerLayout$ExposureChangeListener;", "mExposureMarkerLayout", "Landroid/widget/LinearLayout;", "mSeekBarBottom", "Lcom/glority/camera/widgets/CameraHorizontalSeekBar;", "mSeekBarTop", "cancelAnimation", "", "focus", "mx", "", LogEvents.my, "maxx", "maxy", "setExposure", CmsUILogEvents.EXPOSURE, "setOnExposureChangeListener", "exposureChangeListener", "startAnimation", "showScalingAnimation", "", "Companion", "ExposureChangeListener", "camera_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes6.dex */
public final class ExposureMarkerLayout extends BaseMarkerLayout {
    private static final float RightVerticalBarThreshold = 0.5f;
    private HashMap _$_findViewCache;
    private ExposureChangeListener mExposureChangeListener;
    private final LinearLayout mExposureMarkerLayout;
    private final CameraHorizontalSeekBar mSeekBarBottom;
    private final CameraHorizontalSeekBar mSeekBarTop;

    /* compiled from: ExposureMarkerLayout.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/glority/camera/markers/ExposureMarkerLayout$ExposureChangeListener;", "", "onChange", "", "int", "", "onChangeFinished", "camera_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes6.dex */
    public interface ExposureChangeListener {
        void onChange(int r1);

        void onChangeFinished(int r1);
    }

    public ExposureMarkerLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public ExposureMarkerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.glority.camera.markers.BaseMarkerLayout
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.glority.camera.markers.BaseMarkerLayout
    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposureMarkerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.layout_exposure_marker, this);
        View findViewById = findViewById(R.id.exposureMarkerContainer);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.exposureMarkerContainer)");
        LinearLayout linearLayout = (LinearLayout) findViewById;
        this.mExposureMarkerLayout = linearLayout;
        View findViewById2 = findViewById(R.id.seek_bar_top);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.seek_bar_top)");
        CameraHorizontalSeekBar cameraHorizontalSeekBar = (CameraHorizontalSeekBar) findViewById2;
        this.mSeekBarTop = cameraHorizontalSeekBar;
        View findViewById3 = findViewById(R.id.seek_bar_bottom);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.seek_bar_bottom)");
        CameraHorizontalSeekBar cameraHorizontalSeekBar2 = (CameraHorizontalSeekBar) findViewById3;
        this.mSeekBarBottom = cameraHorizontalSeekBar2;
        if (linearLayout != null) {
            linearLayout.setAlpha(0.0f);
        }
        ExposureMarkerLayout$onSeekBarChangeListener$1 exposureMarkerLayout$onSeekBarChangeListener$1 = new ExposureMarkerLayout$onSeekBarChangeListener$1(this);
        if (cameraHorizontalSeekBar != null) {
            cameraHorizontalSeekBar.setOnSeekBarChangeListener(exposureMarkerLayout$onSeekBarChangeListener$1);
        }
        if (cameraHorizontalSeekBar2 != null) {
            cameraHorizontalSeekBar2.setOnSeekBarChangeListener(exposureMarkerLayout$onSeekBarChangeListener$1);
        }
        if (cameraHorizontalSeekBar != null) {
            cameraHorizontalSeekBar.setThumbOffset(ViewUtils.dp2px(8.0f));
        }
        if (cameraHorizontalSeekBar2 != null) {
            cameraHorizontalSeekBar2.setThumbOffset(ViewUtils.dp2px(8.0f));
        }
        if (cameraHorizontalSeekBar != null) {
            cameraHorizontalSeekBar.setThumb(ResUtils.getDrawable(R.drawable.exposure_adjust_button));
        }
        if (cameraHorizontalSeekBar2 != null) {
            cameraHorizontalSeekBar2.setThumb(ResUtils.getDrawable(R.drawable.exposure_adjust_button));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ExposureMarkerLayout(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L8
            r2 = 0
            r5 = r2
            android.util.AttributeSet r5 = (android.util.AttributeSet) r5
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.camera.markers.ExposureMarkerLayout.<init>(android.content.Context, android.util.AttributeSet, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Override // com.glority.camera.markers.BaseMarkerLayout
    public void focus(float mx, float my, float maxx, float maxy) {
        setExposure(50);
        this.mSeekBarTop.setTrackVisible(8);
        this.mSeekBarBottom.setTrackVisible(8);
        ImageView iv_top_minus = (ImageView) _$_findCachedViewById(R.id.iv_top_minus);
        Intrinsics.checkExpressionValueIsNotNull(iv_top_minus, "iv_top_minus");
        iv_top_minus.setVisibility(8);
        ImageView iv_top_plus = (ImageView) _$_findCachedViewById(R.id.iv_top_plus);
        Intrinsics.checkExpressionValueIsNotNull(iv_top_plus, "iv_top_plus");
        iv_top_plus.setVisibility(8);
        ImageView iv_bottom_minus = (ImageView) _$_findCachedViewById(R.id.iv_bottom_minus);
        Intrinsics.checkExpressionValueIsNotNull(iv_bottom_minus, "iv_bottom_minus");
        iv_bottom_minus.setVisibility(8);
        ImageView iv_bottom_plus = (ImageView) _$_findCachedViewById(R.id.iv_bottom_plus);
        Intrinsics.checkExpressionValueIsNotNull(iv_bottom_plus, "iv_bottom_plus");
        iv_bottom_plus.setVisibility(8);
        LinearLayout linearLayout = this.mExposureMarkerLayout;
        int width = (int) (mx - (linearLayout.getWidth() / 2));
        int height = (int) (my - (linearLayout.getHeight() / 2));
        if (my >= maxy * 0.5f) {
            ConstraintLayout constraintLayout = (ConstraintLayout) linearLayout.findViewById(R.id.fl_top);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) linearLayout.findViewById(R.id.fl_bottom);
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(4);
            }
        } else {
            ConstraintLayout constraintLayout3 = (ConstraintLayout) linearLayout.findViewById(R.id.fl_top);
            if (constraintLayout3 != null) {
                constraintLayout3.setVisibility(4);
            }
            ConstraintLayout constraintLayout4 = (ConstraintLayout) linearLayout.findViewById(R.id.fl_bottom);
            if (constraintLayout4 != null) {
                constraintLayout4.setVisibility(0);
            }
        }
        linearLayout.setTranslationX(width);
        linearLayout.setTranslationY(height);
        linearLayout.setAlpha(1.0f);
        cancelAnimation();
        startAnimation$default(this, false, 1, null);
    }

    public final void setExposure(int exposure) {
        int max = Math.max(Math.min(exposure, 100), 0);
        this.mSeekBarTop.setProgress(max);
        this.mSeekBarBottom.setProgress(max);
        ExposureChangeListener exposureChangeListener = this.mExposureChangeListener;
        if (exposureChangeListener != null) {
            exposureChangeListener.onChange(max);
        }
    }

    public final void setOnExposureChangeListener(ExposureChangeListener exposureChangeListener) {
        this.mExposureChangeListener = exposureChangeListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelAnimation() {
        ViewPropertyAnimator listener;
        ViewPropertyAnimator animate = this.mExposureMarkerLayout.animate();
        if (animate != null && (listener = animate.setListener(null)) != null) {
            listener.cancel();
        }
        LinearLayout linearLayout = this.mExposureMarkerLayout;
        linearLayout.setScaleY(1.0f);
        linearLayout.setScaleX(1.0f);
        linearLayout.setAlpha(1.0f);
    }

    static /* synthetic */ void startAnimation$default(ExposureMarkerLayout exposureMarkerLayout, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        exposureMarkerLayout.startAnimation(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startAnimation(boolean showScalingAnimation) {
        final LinearLayout linearLayout = this.mExposureMarkerLayout;
        if (showScalingAnimation) {
            linearLayout.setScaleX(1.1f);
            linearLayout.setScaleY(1.1f);
            linearLayout.setAlpha(1.0f);
            linearLayout.animate().scaleX(1.0f).scaleY(1.0f).setStartDelay(0L).setDuration(100L).setInterpolator(new AccelerateInterpolator()).setListener(new ExposureMarkerLayout$startAnimation$1$1(linearLayout)).start();
            return;
        }
        linearLayout.animate().alpha(0.6f).setStartDelay(1500L).setDuration(500L).setInterpolator(new AccelerateInterpolator()).setListener(new AnimatorListenerAdapter() { // from class: com.glority.camera.markers.ExposureMarkerLayout$startAnimation$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                linearLayout.animate().alpha(0.0f).setStartDelay(2500L).setDuration(500L).setInterpolator(new AccelerateInterpolator()).setListener(null).start();
            }
        }).start();
    }
}
