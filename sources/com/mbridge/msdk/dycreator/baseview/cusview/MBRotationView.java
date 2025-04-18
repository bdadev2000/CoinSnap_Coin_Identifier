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

/* loaded from: classes4.dex */
public class MBRotationView extends FrameLayout {
    Runnable a;

    /* renamed from: b, reason: collision with root package name */
    private Camera f12755b;

    /* renamed from: c, reason: collision with root package name */
    private Matrix f12756c;

    /* renamed from: d, reason: collision with root package name */
    private int f12757d;

    /* renamed from: e, reason: collision with root package name */
    private int f12758e;

    /* renamed from: f, reason: collision with root package name */
    private int f12759f;

    /* renamed from: g, reason: collision with root package name */
    private int f12760g;

    /* renamed from: h, reason: collision with root package name */
    private int f12761h;

    /* renamed from: i, reason: collision with root package name */
    private int f12762i;

    /* renamed from: j, reason: collision with root package name */
    private int f12763j;

    /* renamed from: k, reason: collision with root package name */
    private int f12764k;

    /* renamed from: l, reason: collision with root package name */
    private float f12765l;

    /* renamed from: m, reason: collision with root package name */
    private float f12766m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f12767n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f12768o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f12769p;

    public MBRotationView(Context context) {
        super(context);
        this.f12759f = 40;
        this.f12760g = 20;
        this.f12761h = 0;
        this.f12762i = 0;
        this.f12764k = 0;
        this.f12765l = 0.5f;
        this.f12766m = 0.9f;
        this.f12767n = true;
        this.f12768o = false;
        this.f12769p = false;
        this.a = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.a(MBRotationView.this);
            }
        };
        a();
    }

    private void a() {
        this.f12755b = new Camera();
        this.f12756c = new Matrix();
        setWillNotDraw(false);
    }

    private void b(int i10, int i11, int i12) {
        if (i12 == 0) {
            float f10 = (-i10) / 2;
            this.f12755b.translate(f10, 0.0f, 0.0f);
            float f11 = -i11;
            this.f12755b.rotateY(f11);
            this.f12755b.translate(f10, 0.0f, 0.0f);
            this.f12755b.translate(f10, 0.0f, 0.0f);
            this.f12755b.rotateY(f11);
            this.f12755b.translate(f10, 0.0f, 0.0f);
            return;
        }
        if (i12 == 1) {
            float f12 = i10 / 2;
            this.f12755b.translate(f12, 0.0f, 0.0f);
            this.f12755b.rotateY(i11);
            this.f12755b.translate(f12, 0.0f, 0.0f);
            return;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            this.f12755b.rotateY(0.0f);
        } else {
            float f13 = (-i10) / 2;
            this.f12755b.translate(f13, 0.0f, 0.0f);
            this.f12755b.rotateY(-i11);
            this.f12755b.translate(f13, 0.0f, 0.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.f12768o) {
            int height = getHeight() / 2;
            int i10 = ((this.f12761h * this.f12757d) / 2) / this.f12759f;
            a(canvas, i10, height, 0);
            a(canvas, i10, height, 1);
            if (Math.abs(this.f12761h) > this.f12759f / 2) {
                a(canvas, i10, height, 3);
                a(canvas, i10, height, 2);
                return;
            } else {
                a(canvas, i10, height, 2);
                a(canvas, i10, height, 3);
                return;
            }
        }
        int width = getWidth() / 2;
        int i11 = ((this.f12761h * this.f12758e) / 2) / this.f12759f;
        b(canvas, i11, width, 0);
        b(canvas, i11, width, 1);
        if (Math.abs(this.f12761h) > this.f12759f / 2) {
            b(canvas, i11, width, 3);
            b(canvas, i11, width, 2);
        } else {
            b(canvas, i11, width, 2);
            b(canvas, i11, width, 3);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        float f10 = i14;
        float f11 = this.f12765l;
        int i15 = (int) (((1.0f - f11) * f10) / 2.0f);
        int i16 = i13 - i11;
        float f12 = i16;
        float f13 = this.f12766m;
        int i17 = (int) (((1.0f - f13) * f12) / 2.0f);
        this.f12757d = (int) (f12 * f13);
        this.f12758e = (int) (f10 * f11);
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            childAt.layout(i15, i17, i14 - i15, i16 - i17);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i19 = layoutParams.width;
            int i20 = this.f12758e;
            if (i19 != i20) {
                layoutParams.width = i20;
                layoutParams.height = this.f12757d;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void setAutoscroll(boolean z10) {
        if (z10) {
            postDelayed(this.a, 1000 / this.f12760g);
        }
        this.f12767n = z10;
    }

    public void setHeightRatio(float f10) {
        this.f12766m = f10;
    }

    public void setRotateV(boolean z10) {
        this.f12768o = z10;
        invalidate();
    }

    public void setWidthRatio(float f10) {
        this.f12765l = f10;
    }

    private void a(int i10, int i11, int i12) {
        float f10 = (-i10) / 2.0f;
        if (i12 == 0) {
            this.f12755b.translate(0.0f, f10, 0.0f);
            float f11 = -i11;
            this.f12755b.rotateX(f11);
            this.f12755b.translate(0.0f, f10, 0.0f);
            this.f12755b.translate(0.0f, f10, 0.0f);
            this.f12755b.rotateX(f11);
            this.f12755b.translate(0.0f, f10, 0.0f);
            return;
        }
        if (i12 == 1) {
            this.f12755b.translate(0.0f, f10, 0.0f);
            this.f12755b.rotateX(i11);
            this.f12755b.translate(0.0f, f10, 0.0f);
        } else if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            this.f12755b.rotateX(0.0f);
        } else {
            this.f12755b.translate(0.0f, f10, 0.0f);
            this.f12755b.rotateX(-i11);
            this.f12755b.translate(0.0f, f10, 0.0f);
        }
    }

    public MBRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12759f = 40;
        this.f12760g = 20;
        this.f12761h = 0;
        this.f12762i = 0;
        this.f12764k = 0;
        this.f12765l = 0.5f;
        this.f12766m = 0.9f;
        this.f12767n = true;
        this.f12768o = false;
        this.f12769p = false;
        this.a = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.a(MBRotationView.this);
            }
        };
        a();
    }

    private void b(Canvas canvas, int i10, int i11, int i12) {
        canvas.save();
        this.f12755b.save();
        this.f12756c.reset();
        float f10 = i10;
        this.f12755b.translate(f10, 0.0f, 0.0f);
        this.f12755b.rotateY(this.f12761h);
        this.f12755b.translate(f10, 0.0f, 0.0f);
        if (i10 == 0) {
            if (this.f12769p) {
                b(this.f12758e, this.f12759f, i12);
            } else {
                b(-this.f12758e, -this.f12759f, i12);
            }
        } else if (i10 > 0) {
            b(this.f12758e, this.f12759f, i12);
        } else if (i10 < 0) {
            b(-this.f12758e, -this.f12759f, i12);
        }
        this.f12755b.getMatrix(this.f12756c);
        this.f12755b.restore();
        this.f12756c.preTranslate(-i11, (-getHeight()) / 2);
        this.f12756c.postTranslate(i11, getHeight() / 2);
        canvas.concat(this.f12756c);
        View childAt = getChildAt(a(i12));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    private void a(Canvas canvas, int i10, int i11, int i12) {
        canvas.save();
        this.f12755b.save();
        this.f12756c.reset();
        float f10 = i10;
        this.f12755b.translate(0.0f, f10, 0.0f);
        this.f12755b.rotateX(this.f12761h);
        this.f12755b.translate(0.0f, f10, 0.0f);
        if (i10 == 0) {
            if (this.f12769p) {
                a(this.f12757d, this.f12759f, i12);
            } else {
                a(-this.f12757d, -this.f12759f, i12);
            }
        } else if (i10 > 0) {
            a(this.f12757d, this.f12759f, i12);
        } else if (i10 < 0) {
            a(-this.f12757d, -this.f12759f, i12);
        }
        this.f12755b.getMatrix(this.f12756c);
        this.f12755b.restore();
        this.f12756c.preTranslate((-getWidth()) / 2, -i11);
        this.f12756c.postTranslate(getWidth() / 2, i11);
        canvas.concat(this.f12756c);
        View childAt = getChildAt(a(i12));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    public MBRotationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12759f = 40;
        this.f12760g = 20;
        this.f12761h = 0;
        this.f12762i = 0;
        this.f12764k = 0;
        this.f12765l = 0.5f;
        this.f12766m = 0.9f;
        this.f12767n = true;
        this.f12768o = false;
        this.f12769p = false;
        this.a = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.a(MBRotationView.this);
            }
        };
        a();
    }

    private int a(int i10) {
        int i11;
        int i12;
        int i13;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    i11 = i10 != 3 ? 0 : this.f12762i;
                } else if (this.f12769p) {
                    i12 = this.f12762i;
                    i11 = i12 - 1;
                } else {
                    i13 = this.f12762i;
                    i11 = i13 + 1;
                }
            } else if (this.f12769p) {
                i13 = this.f12762i;
                i11 = i13 + 1;
            } else {
                i12 = this.f12762i;
                i11 = i12 - 1;
            }
        } else if (this.f12769p) {
            i11 = this.f12762i - 2;
        } else {
            i11 = this.f12762i + 2;
        }
        int childCount = i11 % getChildCount();
        return childCount >= 0 ? childCount : getChildCount() + childCount;
    }

    public static /* synthetic */ void a(MBRotationView mBRotationView) {
        int a;
        if (mBRotationView.getChildCount() == 0) {
            return;
        }
        int i10 = mBRotationView.f12761h - 1;
        mBRotationView.f12761h = i10;
        int i11 = mBRotationView.f12762i;
        mBRotationView.f12763j = i11;
        int i12 = mBRotationView.f12759f;
        int i13 = i11 - (i10 / i12);
        int i14 = i10 % i12;
        mBRotationView.f12761h = i14;
        mBRotationView.f12762i = i13;
        if (Math.abs(i14) > mBRotationView.f12759f / 2) {
            a = mBRotationView.a(2);
        } else {
            a = mBRotationView.a(3);
        }
        if (mBRotationView.f12764k != a) {
            mBRotationView.f12764k = a;
        }
        mBRotationView.invalidate();
        if (mBRotationView.f12767n) {
            mBRotationView.postDelayed(mBRotationView.a, 1000 / mBRotationView.f12760g);
        }
    }
}
