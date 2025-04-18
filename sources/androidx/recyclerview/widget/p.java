package androidx.recyclerview.widget;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public final class p extends r0 implements z0 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final l B;
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1983b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f1984c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f1985d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1986e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1987f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f1988g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f1989h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1990i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1991j;

    /* renamed from: k, reason: collision with root package name */
    public int f1992k;

    /* renamed from: l, reason: collision with root package name */
    public int f1993l;

    /* renamed from: m, reason: collision with root package name */
    public float f1994m;

    /* renamed from: n, reason: collision with root package name */
    public int f1995n;

    /* renamed from: o, reason: collision with root package name */
    public int f1996o;

    /* renamed from: p, reason: collision with root package name */
    public float f1997p;

    /* renamed from: s, reason: collision with root package name */
    public RecyclerView f2000s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f2006z;

    /* renamed from: q, reason: collision with root package name */
    public int f1998q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f1999r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2001t = false;
    public boolean u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f2002v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f2003w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f2004x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f2005y = new int[2];

    public p(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2006z = ofFloat;
        this.A = 0;
        l lVar = new l(this, 0);
        this.B = lVar;
        m mVar = new m(this);
        this.f1984c = stateListDrawable;
        this.f1985d = drawable;
        this.f1988g = stateListDrawable2;
        this.f1989h = drawable2;
        this.f1986e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f1987f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f1990i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f1991j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.a = i11;
        this.f1983b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new n(this));
        ofFloat.addUpdateListener(new o(this));
        RecyclerView recyclerView2 = this.f2000s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeItemDecoration(this);
                this.f2000s.removeOnItemTouchListener(this);
                this.f2000s.removeOnScrollListener(mVar);
                this.f2000s.removeCallbacks(lVar);
            }
            this.f2000s = recyclerView;
            if (recyclerView != null) {
                recyclerView.addItemDecoration(this);
                this.f2000s.addOnItemTouchListener(this);
                this.f2000s.addOnScrollListener(mVar);
            }
        }
    }

    public final boolean a(float f10, float f11) {
        if (f11 >= this.f1999r - this.f1990i) {
            int i10 = this.f1996o;
            int i11 = this.f1995n;
            if (f10 >= i10 - (i11 / 2) && f10 <= (i11 / 2) + i10) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(float f10, float f11) {
        boolean z10;
        if (ViewCompat.getLayoutDirection(this.f2000s) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.f1986e;
        if (z10) {
            if (f10 > i10) {
                return false;
            }
        } else if (f10 < this.f1998q - i10) {
            return false;
        }
        int i11 = this.f1993l;
        int i12 = this.f1992k / 2;
        if (f11 < i11 - i12 || f11 > i12 + i11) {
            return false;
        }
        return true;
    }

    public final void c(int i10) {
        l lVar = this.B;
        StateListDrawable stateListDrawable = this.f1984c;
        if (i10 == 2 && this.f2002v != 2) {
            stateListDrawable.setState(C);
            this.f2000s.removeCallbacks(lVar);
        }
        if (i10 == 0) {
            this.f2000s.invalidate();
        } else {
            d();
        }
        if (this.f2002v == 2 && i10 != 2) {
            stateListDrawable.setState(D);
            this.f2000s.removeCallbacks(lVar);
            this.f2000s.postDelayed(lVar, 1200);
        } else if (i10 == 1) {
            this.f2000s.removeCallbacks(lVar);
            this.f2000s.postDelayed(lVar, 1500);
        }
        this.f2002v = i10;
    }

    public final void d() {
        int i10 = this.A;
        ValueAnimator valueAnimator = this.f2006z;
        if (i10 != 0) {
            if (i10 == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.r0
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, k1 k1Var) {
        if (this.f1998q == this.f2000s.getWidth() && this.f1999r == this.f2000s.getHeight()) {
            if (this.A != 0) {
                if (this.f2001t) {
                    int i10 = this.f1998q;
                    int i11 = this.f1986e;
                    int i12 = i10 - i11;
                    int i13 = this.f1993l;
                    int i14 = this.f1992k;
                    int i15 = i13 - (i14 / 2);
                    StateListDrawable stateListDrawable = this.f1984c;
                    stateListDrawable.setBounds(0, 0, i11, i14);
                    int i16 = this.f1999r;
                    int i17 = this.f1987f;
                    Drawable drawable = this.f1985d;
                    drawable.setBounds(0, 0, i17, i16);
                    boolean z10 = true;
                    if (ViewCompat.getLayoutDirection(this.f2000s) != 1) {
                        z10 = false;
                    }
                    if (z10) {
                        drawable.draw(canvas);
                        canvas.translate(i11, i15);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-i11, -i15);
                    } else {
                        canvas.translate(i12, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i15);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i12, -i15);
                    }
                }
                if (this.u) {
                    int i18 = this.f1999r;
                    int i19 = this.f1990i;
                    int i20 = i18 - i19;
                    int i21 = this.f1996o;
                    int i22 = this.f1995n;
                    int i23 = i21 - (i22 / 2);
                    StateListDrawable stateListDrawable2 = this.f1988g;
                    stateListDrawable2.setBounds(0, 0, i22, i19);
                    int i24 = this.f1998q;
                    int i25 = this.f1991j;
                    Drawable drawable2 = this.f1989h;
                    drawable2.setBounds(0, 0, i24, i25);
                    canvas.translate(0.0f, i20);
                    drawable2.draw(canvas);
                    canvas.translate(i23, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i23, -i20);
                    return;
                }
                return;
            }
            return;
        }
        this.f1998q = this.f2000s.getWidth();
        this.f1999r = this.f2000s.getHeight();
        c(0);
    }
}
