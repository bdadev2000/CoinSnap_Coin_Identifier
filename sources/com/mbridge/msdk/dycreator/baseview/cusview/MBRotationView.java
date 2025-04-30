package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public class MBRotationView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    Runnable f15080a;
    private Camera b;

    /* renamed from: c, reason: collision with root package name */
    private Matrix f15081c;

    /* renamed from: d, reason: collision with root package name */
    private int f15082d;

    /* renamed from: e, reason: collision with root package name */
    private int f15083e;

    /* renamed from: f, reason: collision with root package name */
    private int f15084f;

    /* renamed from: g, reason: collision with root package name */
    private int f15085g;

    /* renamed from: h, reason: collision with root package name */
    private int f15086h;

    /* renamed from: i, reason: collision with root package name */
    private int f15087i;

    /* renamed from: j, reason: collision with root package name */
    private int f15088j;

    /* renamed from: k, reason: collision with root package name */
    private int f15089k;
    private float l;
    private float m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f15090n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f15091o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f15092p;

    public MBRotationView(Context context) {
        super(context);
        this.f15084f = 40;
        this.f15085g = 20;
        this.f15086h = 0;
        this.f15087i = 0;
        this.f15089k = 0;
        this.l = 0.5f;
        this.m = 0.9f;
        this.f15090n = true;
        this.f15091o = false;
        this.f15092p = false;
        this.f15080a = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.a(MBRotationView.this);
            }
        };
        a();
    }

    private void a() {
        this.b = new Camera();
        this.f15081c = new Matrix();
        setWillNotDraw(false);
    }

    private void b(int i9, int i10, int i11) {
        if (i11 == 0) {
            float f9 = (-i9) / 2;
            this.b.translate(f9, 0.0f, 0.0f);
            float f10 = -i10;
            this.b.rotateY(f10);
            this.b.translate(f9, 0.0f, 0.0f);
            this.b.translate(f9, 0.0f, 0.0f);
            this.b.rotateY(f10);
            this.b.translate(f9, 0.0f, 0.0f);
            return;
        }
        if (i11 == 1) {
            float f11 = i9 / 2;
            this.b.translate(f11, 0.0f, 0.0f);
            this.b.rotateY(i10);
            this.b.translate(f11, 0.0f, 0.0f);
            return;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            this.b.rotateY(0.0f);
        } else {
            float f12 = (-i9) / 2;
            this.b.translate(f12, 0.0f, 0.0f);
            this.b.rotateY(-i10);
            this.b.translate(f12, 0.0f, 0.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.f15091o) {
            int height = getHeight() / 2;
            int i9 = ((this.f15086h * this.f15082d) / 2) / this.f15084f;
            a(canvas, i9, height, 0);
            a(canvas, i9, height, 1);
            if (Math.abs(this.f15086h) > this.f15084f / 2) {
                a(canvas, i9, height, 3);
                a(canvas, i9, height, 2);
                return;
            } else {
                a(canvas, i9, height, 2);
                a(canvas, i9, height, 3);
                return;
            }
        }
        int width = getWidth() / 2;
        int i10 = ((this.f15086h * this.f15083e) / 2) / this.f15084f;
        b(canvas, i10, width, 0);
        b(canvas, i10, width, 1);
        if (Math.abs(this.f15086h) > this.f15084f / 2) {
            b(canvas, i10, width, 3);
            b(canvas, i10, width, 2);
        } else {
            b(canvas, i10, width, 2);
            b(canvas, i10, width, 3);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        int i13 = i11 - i9;
        float f9 = i13;
        float f10 = this.l;
        int i14 = (int) (((1.0f - f10) * f9) / 2.0f);
        int i15 = i12 - i10;
        float f11 = i15;
        float f12 = this.m;
        int i16 = (int) (((1.0f - f12) * f11) / 2.0f);
        this.f15082d = (int) (f11 * f12);
        this.f15083e = (int) (f9 * f10);
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            childAt.layout(i14, i16, i13 - i14, i15 - i16);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i18 = layoutParams.width;
            int i19 = this.f15083e;
            if (i18 != i19) {
                layoutParams.width = i19;
                layoutParams.height = this.f15082d;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void setAutoscroll(boolean z8) {
        if (z8) {
            postDelayed(this.f15080a, 1000 / this.f15085g);
        }
        this.f15090n = z8;
    }

    public void setHeightRatio(float f9) {
        this.m = f9;
    }

    public void setRotateV(boolean z8) {
        this.f15091o = z8;
        invalidate();
    }

    public void setWidthRatio(float f9) {
        this.l = f9;
    }

    private void a(int i9, int i10, int i11) {
        float f9 = (-i9) / 2.0f;
        if (i11 == 0) {
            this.b.translate(0.0f, f9, 0.0f);
            float f10 = -i10;
            this.b.rotateX(f10);
            this.b.translate(0.0f, f9, 0.0f);
            this.b.translate(0.0f, f9, 0.0f);
            this.b.rotateX(f10);
            this.b.translate(0.0f, f9, 0.0f);
            return;
        }
        if (i11 == 1) {
            this.b.translate(0.0f, f9, 0.0f);
            this.b.rotateX(i10);
            this.b.translate(0.0f, f9, 0.0f);
        } else if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            this.b.rotateX(0.0f);
        } else {
            this.b.translate(0.0f, f9, 0.0f);
            this.b.rotateX(-i10);
            this.b.translate(0.0f, f9, 0.0f);
        }
    }

    public MBRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15084f = 40;
        this.f15085g = 20;
        this.f15086h = 0;
        this.f15087i = 0;
        this.f15089k = 0;
        this.l = 0.5f;
        this.m = 0.9f;
        this.f15090n = true;
        this.f15091o = false;
        this.f15092p = false;
        this.f15080a = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.a(MBRotationView.this);
            }
        };
        a();
    }

    private void b(Canvas canvas, int i9, int i10, int i11) {
        canvas.save();
        this.b.save();
        this.f15081c.reset();
        float f9 = i9;
        this.b.translate(f9, 0.0f, 0.0f);
        this.b.rotateY(this.f15086h);
        this.b.translate(f9, 0.0f, 0.0f);
        if (i9 == 0) {
            if (this.f15092p) {
                b(this.f15083e, this.f15084f, i11);
            } else {
                b(-this.f15083e, -this.f15084f, i11);
            }
        } else if (i9 > 0) {
            b(this.f15083e, this.f15084f, i11);
        } else if (i9 < 0) {
            b(-this.f15083e, -this.f15084f, i11);
        }
        this.b.getMatrix(this.f15081c);
        this.b.restore();
        this.f15081c.preTranslate(-i10, (-getHeight()) / 2);
        this.f15081c.postTranslate(i10, getHeight() / 2);
        canvas.concat(this.f15081c);
        View childAt = getChildAt(a(i11));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    private void a(Canvas canvas, int i9, int i10, int i11) {
        canvas.save();
        this.b.save();
        this.f15081c.reset();
        float f9 = i9;
        this.b.translate(0.0f, f9, 0.0f);
        this.b.rotateX(this.f15086h);
        this.b.translate(0.0f, f9, 0.0f);
        if (i9 == 0) {
            if (this.f15092p) {
                a(this.f15082d, this.f15084f, i11);
            } else {
                a(-this.f15082d, -this.f15084f, i11);
            }
        } else if (i9 > 0) {
            a(this.f15082d, this.f15084f, i11);
        } else if (i9 < 0) {
            a(-this.f15082d, -this.f15084f, i11);
        }
        this.b.getMatrix(this.f15081c);
        this.b.restore();
        this.f15081c.preTranslate((-getWidth()) / 2, -i10);
        this.f15081c.postTranslate(getWidth() / 2, i10);
        canvas.concat(this.f15081c);
        View childAt = getChildAt(a(i11));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    public MBRotationView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15084f = 40;
        this.f15085g = 20;
        this.f15086h = 0;
        this.f15087i = 0;
        this.f15089k = 0;
        this.l = 0.5f;
        this.m = 0.9f;
        this.f15090n = true;
        this.f15091o = false;
        this.f15092p = false;
        this.f15080a = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.a(MBRotationView.this);
            }
        };
        a();
    }

    private int a(int i9) {
        int i10;
        int i11;
        int i12;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    i10 = i9 != 3 ? 0 : this.f15087i;
                } else if (this.f15092p) {
                    i11 = this.f15087i;
                    i10 = i11 - 1;
                } else {
                    i12 = this.f15087i;
                    i10 = i12 + 1;
                }
            } else if (this.f15092p) {
                i12 = this.f15087i;
                i10 = i12 + 1;
            } else {
                i11 = this.f15087i;
                i10 = i11 - 1;
            }
        } else if (this.f15092p) {
            i10 = this.f15087i - 2;
        } else {
            i10 = this.f15087i + 2;
        }
        int childCount = i10 % getChildCount();
        return childCount >= 0 ? childCount : getChildCount() + childCount;
    }

    public static /* synthetic */ void a(MBRotationView mBRotationView) {
        int a6;
        if (mBRotationView.getChildCount() == 0) {
            return;
        }
        int i9 = mBRotationView.f15086h - 1;
        mBRotationView.f15086h = i9;
        int i10 = mBRotationView.f15087i;
        mBRotationView.f15088j = i10;
        int i11 = mBRotationView.f15084f;
        int i12 = i10 - (i9 / i11);
        int i13 = i9 % i11;
        mBRotationView.f15086h = i13;
        mBRotationView.f15087i = i12;
        if (Math.abs(i13) > mBRotationView.f15084f / 2) {
            a6 = mBRotationView.a(2);
        } else {
            a6 = mBRotationView.a(3);
        }
        if (mBRotationView.f15089k != a6) {
            mBRotationView.f15089k = a6;
        }
        mBRotationView.invalidate();
        if (mBRotationView.f15090n) {
            mBRotationView.postDelayed(mBRotationView.f15080a, 1000 / mBRotationView.f15085g);
        }
    }
}
