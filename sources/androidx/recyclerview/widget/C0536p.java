package androidx.recyclerview.widget;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.core.view.ViewCompat;

/* renamed from: androidx.recyclerview.widget.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0536p extends S implements InterfaceC0517a0 {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f5046C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f5047D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f5048A;

    /* renamed from: B, reason: collision with root package name */
    public final RunnableC0532l f5049B;

    /* renamed from: a, reason: collision with root package name */
    public final int f5050a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f5051c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f5052d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5053e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5054f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f5055g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f5056h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5057i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5058j;

    /* renamed from: k, reason: collision with root package name */
    public int f5059k;
    public int l;
    public float m;

    /* renamed from: n, reason: collision with root package name */
    public int f5060n;

    /* renamed from: o, reason: collision with root package name */
    public int f5061o;

    /* renamed from: p, reason: collision with root package name */
    public float f5062p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f5065s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f5072z;

    /* renamed from: q, reason: collision with root package name */
    public int f5063q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f5064r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5066t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5067u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f5068v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f5069w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f5070x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f5071y = new int[2];

    public C0536p(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i9, int i10, int i11) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5072z = ofFloat;
        this.f5048A = 0;
        RunnableC0532l runnableC0532l = new RunnableC0532l(this, 0);
        this.f5049B = runnableC0532l;
        C0533m c0533m = new C0533m(this);
        this.f5051c = stateListDrawable;
        this.f5052d = drawable;
        this.f5055g = stateListDrawable2;
        this.f5056h = drawable2;
        this.f5053e = Math.max(i9, stateListDrawable.getIntrinsicWidth());
        this.f5054f = Math.max(i9, drawable.getIntrinsicWidth());
        this.f5057i = Math.max(i9, stateListDrawable2.getIntrinsicWidth());
        this.f5058j = Math.max(i9, drawable2.getIntrinsicWidth());
        this.f5050a = i10;
        this.b = i11;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0534n(this));
        ofFloat.addUpdateListener(new C0535o(this));
        RecyclerView recyclerView2 = this.f5065s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeItemDecoration(this);
                this.f5065s.removeOnItemTouchListener(this);
                this.f5065s.removeOnScrollListener(c0533m);
                this.f5065s.removeCallbacks(runnableC0532l);
            }
            this.f5065s = recyclerView;
            if (recyclerView != null) {
                recyclerView.addItemDecoration(this);
                this.f5065s.addOnItemTouchListener(this);
                this.f5065s.addOnScrollListener(c0533m);
            }
        }
    }

    public static int c(float f9, float f10, int[] iArr, int i9, int i10, int i11) {
        int i12 = iArr[1] - iArr[0];
        if (i12 == 0) {
            return 0;
        }
        int i13 = i9 - i11;
        int i14 = (int) (((f10 - f9) / i12) * i13);
        int i15 = i10 + i14;
        if (i15 >= i13 || i15 < 0) {
            return 0;
        }
        return i14;
    }

    public final boolean a(float f9, float f10) {
        if (f10 >= this.f5064r - this.f5057i) {
            int i9 = this.f5061o;
            int i10 = this.f5060n;
            if (f9 >= i9 - (i10 / 2) && f9 <= (i10 / 2) + i9) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(float f9, float f10) {
        boolean z8;
        if (ViewCompat.getLayoutDirection(this.f5065s) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        int i9 = this.f5053e;
        if (z8) {
            if (f9 > i9) {
                return false;
            }
        } else if (f9 < this.f5063q - i9) {
            return false;
        }
        int i10 = this.l;
        int i11 = this.f5059k / 2;
        if (f10 < i10 - i11 || f10 > i11 + i10) {
            return false;
        }
        return true;
    }

    public final void d(int i9) {
        RunnableC0532l runnableC0532l = this.f5049B;
        StateListDrawable stateListDrawable = this.f5051c;
        if (i9 == 2 && this.f5068v != 2) {
            stateListDrawable.setState(f5046C);
            this.f5065s.removeCallbacks(runnableC0532l);
        }
        if (i9 == 0) {
            this.f5065s.invalidate();
        } else {
            e();
        }
        if (this.f5068v == 2 && i9 != 2) {
            stateListDrawable.setState(f5047D);
            this.f5065s.removeCallbacks(runnableC0532l);
            this.f5065s.postDelayed(runnableC0532l, 1200);
        } else if (i9 == 1) {
            this.f5065s.removeCallbacks(runnableC0532l);
            this.f5065s.postDelayed(runnableC0532l, 1500);
        }
        this.f5068v = i9;
    }

    public final void e() {
        int i9 = this.f5048A;
        ValueAnimator valueAnimator = this.f5072z;
        if (i9 != 0) {
            if (i9 == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.f5048A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.S
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, l0 l0Var) {
        if (this.f5063q == this.f5065s.getWidth() && this.f5064r == this.f5065s.getHeight()) {
            if (this.f5048A != 0) {
                if (this.f5066t) {
                    int i9 = this.f5063q;
                    int i10 = this.f5053e;
                    int i11 = i9 - i10;
                    int i12 = this.l;
                    int i13 = this.f5059k;
                    int i14 = i12 - (i13 / 2);
                    StateListDrawable stateListDrawable = this.f5051c;
                    stateListDrawable.setBounds(0, 0, i10, i13);
                    int i15 = this.f5064r;
                    int i16 = this.f5054f;
                    Drawable drawable = this.f5052d;
                    drawable.setBounds(0, 0, i16, i15);
                    if (ViewCompat.getLayoutDirection(this.f5065s) == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i10, i14);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-i10, -i14);
                    } else {
                        canvas.translate(i11, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i14);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i11, -i14);
                    }
                }
                if (this.f5067u) {
                    int i17 = this.f5064r;
                    int i18 = this.f5057i;
                    int i19 = i17 - i18;
                    int i20 = this.f5061o;
                    int i21 = this.f5060n;
                    int i22 = i20 - (i21 / 2);
                    StateListDrawable stateListDrawable2 = this.f5055g;
                    stateListDrawable2.setBounds(0, 0, i21, i18);
                    int i23 = this.f5063q;
                    int i24 = this.f5058j;
                    Drawable drawable2 = this.f5056h;
                    drawable2.setBounds(0, 0, i23, i24);
                    canvas.translate(0.0f, i19);
                    drawable2.draw(canvas);
                    canvas.translate(i22, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i22, -i19);
                    return;
                }
                return;
            }
            return;
        }
        this.f5063q = this.f5065s.getWidth();
        this.f5064r = this.f5065s.getHeight();
        d(0);
    }
}
