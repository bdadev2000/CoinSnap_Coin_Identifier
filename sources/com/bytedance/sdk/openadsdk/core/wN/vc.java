package com.bytedance.sdk.openadsdk.core.wN;

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
public class vc extends FrameLayout {
    private Drawable AlY;
    private ValueAnimator DSW;
    private int Sg;
    private int YFl;
    private boolean qsH;
    private Drawable tN;

    /* renamed from: vc, reason: collision with root package name */
    private boolean f10755vc;
    private Drawable wN;

    public vc(Context context) {
        super(context);
        this.YFl = 100;
    }

    private void YFl() {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 10000);
        this.DSW = ofInt;
        ofInt.setDuration(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        this.DSW.setRepeatCount(-1);
        this.DSW.setInterpolator(new LinearInterpolator());
        this.DSW.setRepeatMode(1);
        this.DSW.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.wN.vc.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                vc.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.DSW.start();
        setMax(10000);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10755vc = true;
        if (this.wN != null) {
            YFl();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10755vc = false;
        ValueAnimator valueAnimator = this.DSW;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.DSW.removeAllUpdateListeners();
            this.DSW = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            if (this.qsH) {
                this.qsH = false;
                ValueAnimator valueAnimator = this.DSW;
                if (valueAnimator != null) {
                    valueAnimator.resume();
                    return;
                } else {
                    YFl();
                    return;
                }
            }
            return;
        }
        ValueAnimator valueAnimator2 = this.DSW;
        if (valueAnimator2 != null && !this.qsH) {
            this.qsH = true;
            valueAnimator2.pause();
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        this.wN = drawable;
        setProgressDrawable(drawable);
        if (this.f10755vc && this.DSW == null) {
            YFl();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(NjR.YFl(this, layoutParams));
    }

    public void setMax(int i10) {
        this.YFl = i10;
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
    }

    public void setProgress(int i10) {
        this.Sg = i10;
        Drawable drawable = this.tN;
        if (drawable != null) {
            drawable.setLevel((int) ((i10 * 10000.0f) / this.YFl));
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        this.AlY = drawable;
        setBackground(drawable);
        Drawable drawable2 = this.AlY;
        if (drawable2 instanceof LayerDrawable) {
            int numberOfLayers = ((LayerDrawable) drawable2).getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                Drawable drawable3 = ((LayerDrawable) this.AlY).getDrawable(i10);
                if ((drawable3 instanceof ScaleDrawable) || (drawable3 instanceof ClipDrawable)) {
                    this.tN = drawable3;
                }
            }
        }
        Drawable drawable4 = this.AlY;
        if (drawable4 instanceof RotateDrawable) {
            this.tN = drawable4;
        }
    }

    public vc(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.YFl = 100;
    }
}
