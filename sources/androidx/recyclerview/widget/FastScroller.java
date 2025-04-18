package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import com.safedk.android.internal.d;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes2.dex */
public class FastScroller extends RecyclerView.ItemDecoration implements RecyclerView.OnItemTouchListener {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final Runnable B;

    /* renamed from: a, reason: collision with root package name */
    public final int f20973a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20974b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f20975c;
    public final Drawable d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20976f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f20977g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f20978h;

    /* renamed from: i, reason: collision with root package name */
    public final int f20979i;

    /* renamed from: j, reason: collision with root package name */
    public final int f20980j;

    /* renamed from: k, reason: collision with root package name */
    public int f20981k;

    /* renamed from: l, reason: collision with root package name */
    public int f20982l;

    /* renamed from: m, reason: collision with root package name */
    public float f20983m;

    /* renamed from: n, reason: collision with root package name */
    public int f20984n;

    /* renamed from: o, reason: collision with root package name */
    public int f20985o;

    /* renamed from: p, reason: collision with root package name */
    public float f20986p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f20989s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f20994z;

    /* renamed from: q, reason: collision with root package name */
    public int f20987q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f20988r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f20990t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f20991u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f20992v = 0;
    public int w = 0;
    public final int[] x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f20993y = new int[2];

    /* loaded from: classes2.dex */
    public class AnimatorListener extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f20997a = false;

        public AnimatorListener() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f20997a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f20997a) {
                this.f20997a = false;
                return;
            }
            FastScroller fastScroller = FastScroller.this;
            if (((Float) fastScroller.f20994z.getAnimatedValue()).floatValue() == 0.0f) {
                fastScroller.A = 0;
                fastScroller.h(0);
            } else {
                fastScroller.A = 2;
                fastScroller.f20989s.invalidate();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class AnimatorUpdater implements ValueAnimator.AnimatorUpdateListener {
        public AnimatorUpdater() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            FastScroller fastScroller = FastScroller.this;
            fastScroller.f20975c.setAlpha(floatValue);
            fastScroller.d.setAlpha(floatValue);
            fastScroller.f20989s.invalidate();
        }
    }

    public FastScroller(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f20994z = ofFloat;
        this.A = 0;
        Runnable runnable = new Runnable() { // from class: androidx.recyclerview.widget.FastScroller.1
            @Override // java.lang.Runnable
            public final void run() {
                FastScroller fastScroller = FastScroller.this;
                int i5 = fastScroller.A;
                ValueAnimator valueAnimator = fastScroller.f20994z;
                if (i5 == 1) {
                    valueAnimator.cancel();
                } else if (i5 != 2) {
                    return;
                }
                fastScroller.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(d.f29936c);
                valueAnimator.start();
            }
        };
        this.B = runnable;
        RecyclerView.OnScrollListener onScrollListener = new RecyclerView.OnScrollListener() { // from class: androidx.recyclerview.widget.FastScroller.2
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrolled(RecyclerView recyclerView2, int i5, int i6) {
                int computeHorizontalScrollOffset = recyclerView2.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = recyclerView2.computeVerticalScrollOffset();
                FastScroller fastScroller = FastScroller.this;
                int computeVerticalScrollRange = fastScroller.f20989s.computeVerticalScrollRange();
                int i7 = fastScroller.f20988r;
                int i8 = computeVerticalScrollRange - i7;
                int i9 = fastScroller.f20973a;
                fastScroller.f20990t = i8 > 0 && i7 >= i9;
                int computeHorizontalScrollRange = fastScroller.f20989s.computeHorizontalScrollRange();
                int i10 = fastScroller.f20987q;
                boolean z2 = computeHorizontalScrollRange - i10 > 0 && i10 >= i9;
                fastScroller.f20991u = z2;
                boolean z3 = fastScroller.f20990t;
                if (!z3 && !z2) {
                    if (fastScroller.f20992v != 0) {
                        fastScroller.h(0);
                        return;
                    }
                    return;
                }
                if (z3) {
                    float f2 = i7;
                    fastScroller.f20982l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
                    fastScroller.f20981k = Math.min(i7, (i7 * i7) / computeVerticalScrollRange);
                }
                if (fastScroller.f20991u) {
                    float f3 = computeHorizontalScrollOffset;
                    float f4 = i10;
                    fastScroller.f20985o = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
                    fastScroller.f20984n = Math.min(i10, (i10 * i10) / computeHorizontalScrollRange);
                }
                int i11 = fastScroller.f20992v;
                if (i11 == 0 || i11 == 1) {
                    fastScroller.h(1);
                }
            }
        };
        this.f20975c = stateListDrawable;
        this.d = drawable;
        this.f20977g = stateListDrawable2;
        this.f20978h = drawable2;
        this.e = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f20976f = Math.max(i2, drawable.getIntrinsicWidth());
        this.f20979i = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f20980j = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f20973a = i3;
        this.f20974b = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new AnimatorListener());
        ofFloat.addUpdateListener(new AnimatorUpdater());
        RecyclerView recyclerView2 = this.f20989s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f20989s.removeOnItemTouchListener(this);
            this.f20989s.removeOnScrollListener(onScrollListener);
            this.f20989s.removeCallbacks(runnable);
        }
        this.f20989s = recyclerView;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(this);
            this.f20989s.addOnItemTouchListener(this);
            this.f20989s.addOnScrollListener(onScrollListener);
        }
    }

    public static int g(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / i5) * i6);
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void c(boolean z2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final boolean d(MotionEvent motionEvent) {
        int i2 = this.f20992v;
        if (i2 == 1) {
            boolean f2 = f(motionEvent.getX(), motionEvent.getY());
            boolean e = e(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!f2 && !e) {
                return false;
            }
            if (e) {
                this.w = 1;
                this.f20986p = (int) motionEvent.getX();
            } else if (f2) {
                this.w = 2;
                this.f20983m = (int) motionEvent.getY();
            }
            h(2);
        } else if (i2 != 2) {
            return false;
        }
        return true;
    }

    public final boolean e(float f2, float f3) {
        if (f3 >= this.f20988r - this.f20979i) {
            int i2 = this.f20985o;
            int i3 = this.f20984n;
            if (f2 >= i2 - (i3 / 2) && f2 <= (i3 / 2) + i2) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(float f2, float f3) {
        RecyclerView recyclerView = this.f20989s;
        WeakHashMap weakHashMap = ViewCompat.f18740a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i2 = this.e;
        if (z2) {
            if (f2 > i2) {
                return false;
            }
        } else if (f2 < this.f20987q - i2) {
            return false;
        }
        int i3 = this.f20982l;
        int i4 = this.f20981k / 2;
        return f3 >= ((float) (i3 - i4)) && f3 <= ((float) (i4 + i3));
    }

    public final void h(int i2) {
        Runnable runnable = this.B;
        StateListDrawable stateListDrawable = this.f20975c;
        if (i2 == 2 && this.f20992v != 2) {
            stateListDrawable.setState(C);
            this.f20989s.removeCallbacks(runnable);
        }
        if (i2 == 0) {
            this.f20989s.invalidate();
        } else {
            i();
        }
        if (this.f20992v == 2 && i2 != 2) {
            stateListDrawable.setState(D);
            this.f20989s.removeCallbacks(runnable);
            this.f20989s.postDelayed(runnable, 1200);
        } else if (i2 == 1) {
            this.f20989s.removeCallbacks(runnable);
            this.f20989s.postDelayed(runnable, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f20992v = i2;
    }

    public final void i() {
        int i2 = this.A;
        ValueAnimator valueAnimator = this.f20994z;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.f20987q != this.f20989s.getWidth() || this.f20988r != this.f20989s.getHeight()) {
            this.f20987q = this.f20989s.getWidth();
            this.f20988r = this.f20989s.getHeight();
            h(0);
            return;
        }
        if (this.A != 0) {
            if (this.f20990t) {
                int i2 = this.f20987q;
                int i3 = this.e;
                int i4 = i2 - i3;
                int i5 = this.f20982l;
                int i6 = this.f20981k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f20975c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f20988r;
                int i9 = this.f20976f;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i9, i8);
                RecyclerView recyclerView2 = this.f20989s;
                WeakHashMap weakHashMap = ViewCompat.f18740a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.f20991u) {
                int i10 = this.f20988r;
                int i11 = this.f20979i;
                int i12 = i10 - i11;
                int i13 = this.f20985o;
                int i14 = this.f20984n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f20977g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f20987q;
                int i17 = this.f20980j;
                Drawable drawable2 = this.f20978h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onTouchEvent(MotionEvent motionEvent) {
        if (this.f20992v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean f2 = f(motionEvent.getX(), motionEvent.getY());
            boolean e = e(motionEvent.getX(), motionEvent.getY());
            if (f2 || e) {
                if (e) {
                    this.w = 1;
                    this.f20986p = (int) motionEvent.getX();
                } else if (f2) {
                    this.w = 2;
                    this.f20983m = (int) motionEvent.getY();
                }
                h(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f20992v == 2) {
            this.f20983m = 0.0f;
            this.f20986p = 0.0f;
            h(1);
            this.w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f20992v == 2) {
            i();
            int i2 = this.w;
            int i3 = this.f20974b;
            if (i2 == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f20993y;
                iArr[0] = i3;
                int i4 = this.f20987q - i3;
                iArr[1] = i4;
                float max = Math.max(i3, Math.min(i4, x));
                if (Math.abs(this.f20985o - max) >= 2.0f) {
                    int g2 = g(this.f20986p, max, iArr, this.f20989s.computeHorizontalScrollRange(), this.f20989s.computeHorizontalScrollOffset(), this.f20987q);
                    if (g2 != 0) {
                        this.f20989s.scrollBy(g2, 0);
                    }
                    this.f20986p = max;
                }
            }
            if (this.w == 2) {
                float y2 = motionEvent.getY();
                int[] iArr2 = this.x;
                iArr2[0] = i3;
                int i5 = this.f20988r - i3;
                iArr2[1] = i5;
                float max2 = Math.max(i3, Math.min(i5, y2));
                if (Math.abs(this.f20982l - max2) < 2.0f) {
                    return;
                }
                int g3 = g(this.f20983m, max2, iArr2, this.f20989s.computeVerticalScrollRange(), this.f20989s.computeVerticalScrollOffset(), this.f20988r);
                if (g3 != 0) {
                    this.f20989s.scrollBy(0, g3);
                }
                this.f20983m = max2;
            }
        }
    }
}
