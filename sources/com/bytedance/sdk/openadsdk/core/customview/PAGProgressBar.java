package com.bytedance.sdk.openadsdk.core.customview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: classes.dex */
public class PAGProgressBar extends FrameLayout {
    private Drawable COT;
    private boolean HWF;
    private Drawable KS;
    private ValueAnimator QR;
    private Drawable jU;
    private boolean ku;
    private int lMd;
    private int zp;

    public PAGProgressBar(Context context) {
        super(context);
        this.zp = 100;
    }

    private void zp() {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 10000);
        this.QR = ofInt;
        ofInt.setDuration(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        this.QR.setRepeatCount(-1);
        this.QR.setInterpolator(new LinearInterpolator());
        this.QR.setRepeatMode(1);
        this.QR.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PAGProgressBar.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.QR.start();
        setMax(10000);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.HWF = true;
        if (this.COT != null) {
            zp();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.HWF = false;
        ValueAnimator valueAnimator = this.QR;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.QR.removeAllUpdateListeners();
            this.QR = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i9) {
        super.onVisibilityChanged(view, i9);
        if (i9 == 0) {
            if (this.ku) {
                this.ku = false;
                ValueAnimator valueAnimator = this.QR;
                if (valueAnimator != null) {
                    valueAnimator.resume();
                    return;
                } else {
                    zp();
                    return;
                }
            }
            return;
        }
        ValueAnimator valueAnimator2 = this.QR;
        if (valueAnimator2 != null && !this.ku) {
            this.ku = true;
            valueAnimator2.pause();
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        this.COT = drawable;
        setProgressDrawable(drawable);
        if (this.HWF && this.QR == null) {
            zp();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(zp.zp(this, layoutParams));
    }

    public void setMax(int i9) {
        this.zp = i9;
    }

    @Override // android.view.View
    public void setPadding(int i9, int i10, int i11, int i12) {
        super.setPaddingRelative(i9, i10, i11, i12);
    }

    public void setProgress(int i9) {
        this.lMd = i9;
        Drawable drawable = this.KS;
        if (drawable != null) {
            drawable.setLevel((int) ((i9 * 10000.0f) / this.zp));
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        this.jU = drawable;
        setBackground(drawable);
        Drawable drawable2 = this.jU;
        if (drawable2 instanceof LayerDrawable) {
            int numberOfLayers = ((LayerDrawable) drawable2).getNumberOfLayers();
            for (int i9 = 0; i9 < numberOfLayers; i9++) {
                Drawable drawable3 = ((LayerDrawable) this.jU).getDrawable(i9);
                if ((drawable3 instanceof ScaleDrawable) || (drawable3 instanceof ClipDrawable)) {
                    this.KS = drawable3;
                }
            }
        }
        Drawable drawable4 = this.jU;
        if (drawable4 instanceof RotateDrawable) {
            this.KS = drawable4;
        }
    }

    public PAGProgressBar(Context context, @Nullable AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.zp = 100;
    }
}
