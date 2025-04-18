package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.applovin.sdk.R;
import com.google.common.primitives.Ints;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes2.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final c f22517a;

    /* renamed from: b, reason: collision with root package name */
    private float f22518b;

    /* renamed from: c, reason: collision with root package name */
    private int f22519c;

    /* loaded from: classes2.dex */
    public interface b {
    }

    /* loaded from: classes2.dex */
    public final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private float f22520a;

        /* renamed from: b, reason: collision with root package name */
        private float f22521b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f22522c;
        private boolean d;

        private c() {
        }

        public void a(float f2, float f3, boolean z2) {
            this.f22520a = f2;
            this.f22521b = f3;
            this.f22522c = z2;
            if (this.d) {
                return;
            }
            this.d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.d = false;
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

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f30048a, this, me);
        return super.dispatchTouchEvent(me);
    }

    public int getResizeMode() {
        return this.f22519c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        float f2;
        float f3;
        super.onMeasure(i2, i3);
        if (this.f22518b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f4 = measuredWidth;
        float f5 = measuredHeight;
        float f6 = f4 / f5;
        float f7 = (this.f22518b / f6) - 1.0f;
        if (Math.abs(f7) <= 0.01f) {
            this.f22517a.a(this.f22518b, f6, false);
            return;
        }
        int i4 = this.f22519c;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    f2 = this.f22518b;
                } else if (i4 == 4) {
                    if (f7 > 0.0f) {
                        f2 = this.f22518b;
                    } else {
                        f3 = this.f22518b;
                    }
                }
                measuredWidth = (int) (f5 * f2);
            } else {
                f3 = this.f22518b;
            }
            measuredHeight = (int) (f4 / f3);
        } else if (f7 > 0.0f) {
            f3 = this.f22518b;
            measuredHeight = (int) (f4 / f3);
        } else {
            f2 = this.f22518b;
            measuredWidth = (int) (f5 * f2);
        }
        this.f22517a.a(this.f22518b, f6, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(measuredHeight, Ints.MAX_POWER_OF_TWO));
    }

    public void setAspectRatio(float f2) {
        if (this.f22518b != f2) {
            this.f22518b = f2;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable b bVar) {
    }

    public void setResizeMode(int i2) {
        if (this.f22519c != i2) {
            this.f22519c = i2;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22519c = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.AppLovinAspectRatioFrameLayout, 0, 0);
            try {
                this.f22519c = obtainStyledAttributes.getInt(R.styleable.AppLovinAspectRatioFrameLayout_al_resize_mode, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f22517a = new c();
    }
}
