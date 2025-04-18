package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class k2 implements k.g0 {
    public static final Method C;
    public static final Method D;
    public boolean A;
    public final d0 B;

    /* renamed from: b, reason: collision with root package name */
    public final Context f890b;

    /* renamed from: c, reason: collision with root package name */
    public ListAdapter f891c;

    /* renamed from: d, reason: collision with root package name */
    public y1 f892d;

    /* renamed from: h, reason: collision with root package name */
    public int f895h;

    /* renamed from: i, reason: collision with root package name */
    public int f896i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f898k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f899l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f900m;

    /* renamed from: p, reason: collision with root package name */
    public h2 f903p;

    /* renamed from: q, reason: collision with root package name */
    public View f904q;

    /* renamed from: r, reason: collision with root package name */
    public AdapterView.OnItemClickListener f905r;

    /* renamed from: s, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f906s;

    /* renamed from: x, reason: collision with root package name */
    public final Handler f910x;

    /* renamed from: z, reason: collision with root package name */
    public Rect f912z;

    /* renamed from: f, reason: collision with root package name */
    public final int f893f = -2;

    /* renamed from: g, reason: collision with root package name */
    public int f894g = -2;

    /* renamed from: j, reason: collision with root package name */
    public final int f897j = 1002;

    /* renamed from: n, reason: collision with root package name */
    public int f901n = 0;

    /* renamed from: o, reason: collision with root package name */
    public final int f902o = Integer.MAX_VALUE;

    /* renamed from: t, reason: collision with root package name */
    public final d2 f907t = new d2(this, 2);
    public final j2 u = new j2(this, 0);

    /* renamed from: v, reason: collision with root package name */
    public final i2 f908v = new i2(this);

    /* renamed from: w, reason: collision with root package name */
    public final d2 f909w = new d2(this, 1);

    /* renamed from: y, reason: collision with root package name */
    public final Rect f911y = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                C = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                D = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public k2(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f890b = context;
        this.f910x = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.a.f17892o, i10, i11);
        this.f895h = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f896i = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f898k = true;
        }
        obtainStyledAttributes.recycle();
        d0 d0Var = new d0(context, attributeSet, i10, i11);
        this.B = d0Var;
        d0Var.setInputMethodMode(1);
    }

    @Override // k.g0
    public final boolean a() {
        return this.B.isShowing();
    }

    public final int b() {
        return this.f895h;
    }

    public final void c(int i10) {
        this.f895h = i10;
    }

    @Override // k.g0
    public final void dismiss() {
        d0 d0Var = this.B;
        d0Var.dismiss();
        d0Var.setContentView(null);
        this.f892d = null;
        this.f910x.removeCallbacks(this.f907t);
    }

    public final Drawable e() {
        return this.B.getBackground();
    }

    public final void g(int i10) {
        this.f896i = i10;
        this.f898k = true;
    }

    public final int k() {
        if (!this.f898k) {
            return 0;
        }
        return this.f896i;
    }

    public void l(ListAdapter listAdapter) {
        h2 h2Var = this.f903p;
        if (h2Var == null) {
            this.f903p = new h2(this, 0);
        } else {
            ListAdapter listAdapter2 = this.f891c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(h2Var);
            }
        }
        this.f891c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f903p);
        }
        y1 y1Var = this.f892d;
        if (y1Var != null) {
            y1Var.setAdapter(this.f891c);
        }
    }

    @Override // k.g0
    public final y1 m() {
        return this.f892d;
    }

    public final void n(Drawable drawable) {
        this.B.setBackgroundDrawable(drawable);
    }

    public y1 o(Context context, boolean z10) {
        return new y1(context, z10);
    }

    public final void p(int i10) {
        Drawable background = this.B.getBackground();
        if (background != null) {
            Rect rect = this.f911y;
            background.getPadding(rect);
            this.f894g = rect.left + rect.right + i10;
            return;
        }
        this.f894g = i10;
    }

    @Override // k.g0
    public final void show() {
        int i10;
        boolean z10;
        int makeMeasureSpec;
        int i11;
        int i12;
        boolean z11;
        y1 y1Var;
        int i13;
        int i14;
        y1 y1Var2 = this.f892d;
        d0 d0Var = this.B;
        int i15 = 0;
        Context context = this.f890b;
        if (y1Var2 == null) {
            y1 o10 = o(context, !this.A);
            this.f892d = o10;
            o10.setAdapter(this.f891c);
            this.f892d.setOnItemClickListener(this.f905r);
            this.f892d.setFocusable(true);
            this.f892d.setFocusableInTouchMode(true);
            this.f892d.setOnItemSelectedListener(new e2(this, 0));
            this.f892d.setOnScrollListener(this.f908v);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f906s;
            if (onItemSelectedListener != null) {
                this.f892d.setOnItemSelectedListener(onItemSelectedListener);
            }
            d0Var.setContentView(this.f892d);
        }
        Drawable background = d0Var.getBackground();
        Rect rect = this.f911y;
        if (background != null) {
            background.getPadding(rect);
            int i16 = rect.top;
            i10 = rect.bottom + i16;
            if (!this.f898k) {
                this.f896i = -i16;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        if (d0Var.getInputMethodMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        int a = f2.a(d0Var, this.f904q, this.f896i, z10);
        int i17 = this.f893f;
        if (i17 == -1) {
            i12 = a + i10;
        } else {
            int i18 = this.f894g;
            if (i18 != -2) {
                if (i18 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int a10 = this.f892d.a(makeMeasureSpec, a + 0);
            if (a10 > 0) {
                i11 = this.f892d.getPaddingBottom() + this.f892d.getPaddingTop() + i10 + 0;
            } else {
                i11 = 0;
            }
            i12 = a10 + i11;
        }
        if (d0Var.getInputMethodMode() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        t0.l.d(d0Var, this.f897j);
        if (d0Var.isShowing()) {
            if (!ViewCompat.isAttachedToWindow(this.f904q)) {
                return;
            }
            int i19 = this.f894g;
            if (i19 == -1) {
                i19 = -1;
            } else if (i19 == -2) {
                i19 = this.f904q.getWidth();
            }
            if (i17 == -1) {
                if (z11) {
                    i17 = i12;
                } else {
                    i17 = -1;
                }
                if (z11) {
                    if (this.f894g == -1) {
                        i14 = -1;
                    } else {
                        i14 = 0;
                    }
                    d0Var.setWidth(i14);
                    d0Var.setHeight(0);
                } else {
                    if (this.f894g == -1) {
                        i15 = -1;
                    }
                    d0Var.setWidth(i15);
                    d0Var.setHeight(-1);
                }
            } else if (i17 == -2) {
                i17 = i12;
            }
            d0Var.setOutsideTouchable(true);
            View view = this.f904q;
            int i20 = this.f895h;
            int i21 = this.f896i;
            if (i19 < 0) {
                i19 = -1;
            }
            if (i17 < 0) {
                i13 = -1;
            } else {
                i13 = i17;
            }
            d0Var.update(view, i20, i21, i19, i13);
            return;
        }
        int i22 = this.f894g;
        if (i22 == -1) {
            i22 = -1;
        } else if (i22 == -2) {
            i22 = this.f904q.getWidth();
        }
        if (i17 == -1) {
            i17 = -1;
        } else if (i17 == -2) {
            i17 = i12;
        }
        d0Var.setWidth(i22);
        d0Var.setHeight(i17);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = C;
            if (method != null) {
                try {
                    method.invoke(d0Var, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            g2.b(d0Var, true);
        }
        d0Var.setOutsideTouchable(true);
        d0Var.setTouchInterceptor(this.u);
        if (this.f900m) {
            t0.l.c(d0Var, this.f899l);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = D;
            if (method2 != null) {
                try {
                    method2.invoke(d0Var, this.f912z);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            g2.a(d0Var, this.f912z);
        }
        d0Var.showAsDropDown(this.f904q, this.f895h, this.f896i, this.f901n);
        this.f892d.setSelection(-1);
        if ((!this.A || this.f892d.isInTouchMode()) && (y1Var = this.f892d) != null) {
            y1Var.setListSelectionHidden(true);
            y1Var.requestLayout();
        }
        if (!this.A) {
            this.f910x.post(this.f909w);
        }
    }
}
