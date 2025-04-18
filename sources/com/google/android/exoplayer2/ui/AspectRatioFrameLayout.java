package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import l9.a;
import l9.b;
import l9.m;

@Deprecated
/* loaded from: classes3.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f11495f = 0;

    /* renamed from: b, reason: collision with root package name */
    public final b f11496b;

    /* renamed from: c, reason: collision with root package name */
    public float f11497c;

    /* renamed from: d, reason: collision with root package name */
    public int f11498d;

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11498d = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, m.a, 0, 0);
            try {
                this.f11498d = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f11496b = new b(this);
    }

    public int getResizeMode() {
        return this.f11498d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f11497c <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = (this.f11497c / (f12 / f13)) - 1.0f;
        float abs = Math.abs(f14);
        b bVar = this.f11496b;
        if (abs <= 0.01f) {
            if (!bVar.f21172b) {
                bVar.f21172b = true;
                bVar.f21173c.post(bVar);
                return;
            }
            return;
        }
        int i12 = this.f11498d;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 4) {
                        if (f14 > 0.0f) {
                            f10 = this.f11497c;
                        } else {
                            f11 = this.f11497c;
                        }
                    }
                } else {
                    f10 = this.f11497c;
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f11497c;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f14 > 0.0f) {
            f11 = this.f11497c;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f11497c;
            measuredWidth = (int) (f13 * f10);
        }
        if (!bVar.f21172b) {
            bVar.f21172b = true;
            bVar.f21173c.post(bVar);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f11497c != f10) {
            this.f11497c = f10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable a aVar) {
    }

    public void setResizeMode(int i10) {
        if (this.f11498d != i10) {
            this.f11498d = i10;
            requestLayout();
        }
    }
}
