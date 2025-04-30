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

    /* renamed from: a, reason: collision with root package name */
    private final c f6173a;
    private float b;

    /* renamed from: c, reason: collision with root package name */
    private int f6174c;

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private float f6175a;
        private float b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f6176c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f6177d;

        private c() {
        }

        public void a(float f9, float f10, boolean z8) {
            this.f6175a = f9;
            this.b = f10;
            this.f6176c = z8;
            if (!this.f6177d) {
                this.f6177d = true;
                AspectRatioFrameLayout.this.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6177d = false;
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
        return this.f6174c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        float f9;
        float f10;
        super.onMeasure(i9, i10);
        if (this.b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f11 = measuredWidth;
        float f12 = measuredHeight;
        float f13 = f11 / f12;
        float f14 = (this.b / f13) - 1.0f;
        if (Math.abs(f14) <= 0.01f) {
            this.f6173a.a(this.b, f13, false);
            return;
        }
        int i11 = this.f6174c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 4) {
                        if (f14 > 0.0f) {
                            f9 = this.b;
                        } else {
                            f10 = this.b;
                        }
                    }
                } else {
                    f9 = this.b;
                }
                measuredWidth = (int) (f12 * f9);
            } else {
                f10 = this.b;
            }
            measuredHeight = (int) (f11 / f10);
        } else if (f14 > 0.0f) {
            f10 = this.b;
            measuredHeight = (int) (f11 / f10);
        } else {
            f9 = this.b;
            measuredWidth = (int) (f12 * f9);
        }
        this.f6173a.a(this.b, f13, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f9) {
        if (this.b != f9) {
            this.b = f9;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable b bVar) {
    }

    public void setResizeMode(int i9) {
        if (this.f6174c != i9) {
            this.f6174c = i9;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6174c = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.AppLovinAspectRatioFrameLayout, 0, 0);
            try {
                this.f6174c = obtainStyledAttributes.getInt(R.styleable.AppLovinAspectRatioFrameLayout_al_resize_mode, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f6173a = new c();
    }
}
