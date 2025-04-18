package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    private final c a;

    /* renamed from: b, reason: collision with root package name */
    private float f3425b;

    /* renamed from: c, reason: collision with root package name */
    private int f3426c;

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public final class c implements Runnable {
        private float a;

        /* renamed from: b, reason: collision with root package name */
        private float f3427b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f3428c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f3429d;

        private c() {
        }

        public void a(float f10, float f11, boolean z10) {
            this.a = f10;
            this.f3427b = f11;
            this.f3428c = z10;
            if (!this.f3429d) {
                this.f3429d = true;
                AspectRatioFrameLayout.this.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3429d = false;
            AspectRatioFrameLayout.a(AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ b a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.f3426c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f3425b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = f12 / f13;
        float f15 = (this.f3425b / f14) - 1.0f;
        if (Math.abs(f15) <= 0.01f) {
            this.a.a(this.f3425b, f14, false);
            return;
        }
        int i12 = this.f3426c;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 4) {
                        if (f15 > 0.0f) {
                            f10 = this.f3425b;
                        } else {
                            f11 = this.f3425b;
                        }
                    }
                } else {
                    f10 = this.f3425b;
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f3425b;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f15 > 0.0f) {
            f11 = this.f3425b;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f3425b;
            measuredWidth = (int) (f13 * f10);
        }
        this.a.a(this.f3425b, f14, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f3425b != f10) {
            this.f3425b = f10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable b bVar) {
    }

    public void setResizeMode(int i10) {
        if (this.f3426c != i10) {
            this.f3426c = i10;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3426c = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.AppLovinAspectRatioFrameLayout, 0, 0);
            try {
                this.f3426c = obtainStyledAttributes.getInt(R.styleable.AppLovinAspectRatioFrameLayout_al_resize_mode, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.a = new c();
    }
}
