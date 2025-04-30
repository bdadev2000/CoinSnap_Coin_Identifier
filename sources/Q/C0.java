package q;

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
import j.AbstractC2379a;
import java.lang.reflect.Method;
import p.InterfaceC2519B;

/* loaded from: classes.dex */
public class C0 implements InterfaceC2519B {

    /* renamed from: C, reason: collision with root package name */
    public static final Method f22512C;

    /* renamed from: D, reason: collision with root package name */
    public static final Method f22513D;

    /* renamed from: A, reason: collision with root package name */
    public boolean f22514A;

    /* renamed from: B, reason: collision with root package name */
    public final C2636z f22515B;
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public ListAdapter f22516c;

    /* renamed from: d, reason: collision with root package name */
    public C2621r0 f22517d;

    /* renamed from: h, reason: collision with root package name */
    public int f22520h;

    /* renamed from: i, reason: collision with root package name */
    public int f22521i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f22523k;
    public boolean l;
    public boolean m;

    /* renamed from: p, reason: collision with root package name */
    public A0 f22526p;

    /* renamed from: q, reason: collision with root package name */
    public View f22527q;

    /* renamed from: r, reason: collision with root package name */
    public AdapterView.OnItemClickListener f22528r;

    /* renamed from: s, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f22529s;

    /* renamed from: x, reason: collision with root package name */
    public final Handler f22534x;

    /* renamed from: z, reason: collision with root package name */
    public Rect f22536z;

    /* renamed from: f, reason: collision with root package name */
    public final int f22518f = -2;

    /* renamed from: g, reason: collision with root package name */
    public int f22519g = -2;

    /* renamed from: j, reason: collision with root package name */
    public final int f22522j = 1002;

    /* renamed from: n, reason: collision with root package name */
    public int f22524n = 0;

    /* renamed from: o, reason: collision with root package name */
    public final int f22525o = Integer.MAX_VALUE;

    /* renamed from: t, reason: collision with root package name */
    public final RunnableC2637z0 f22530t = new RunnableC2637z0(this, 1);

    /* renamed from: u, reason: collision with root package name */
    public final j6.l f22531u = new j6.l(this, 1);

    /* renamed from: v, reason: collision with root package name */
    public final B0 f22532v = new B0(this);

    /* renamed from: w, reason: collision with root package name */
    public final RunnableC2637z0 f22533w = new RunnableC2637z0(this, 0);

    /* renamed from: y, reason: collision with root package name */
    public final Rect f22535y = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f22512C = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f22513D = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [android.widget.PopupWindow, q.z] */
    public C0(Context context, AttributeSet attributeSet, int i9, int i10) {
        Drawable drawable;
        int resourceId;
        this.b = context;
        this.f22534x = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2379a.f20953o, i9, i10);
        this.f22520h = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f22521i = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f22523k = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i9, i10);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC2379a.f20957s, i9, i10);
        if (obtainStyledAttributes2.hasValue(2)) {
            Z.l.c(popupWindow, obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = com.facebook.appevents.n.g(context, resourceId);
        } else {
            drawable = obtainStyledAttributes2.getDrawable(0);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.f22515B = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    @Override // p.InterfaceC2519B
    public final boolean a() {
        return this.f22515B.isShowing();
    }

    public final int b() {
        return this.f22520h;
    }

    public final void d(int i9) {
        this.f22520h = i9;
    }

    @Override // p.InterfaceC2519B
    public final void dismiss() {
        C2636z c2636z = this.f22515B;
        c2636z.dismiss();
        c2636z.setContentView(null);
        this.f22517d = null;
        this.f22534x.removeCallbacks(this.f22530t);
    }

    public final Drawable f() {
        return this.f22515B.getBackground();
    }

    @Override // p.InterfaceC2519B
    public final C2621r0 g() {
        return this.f22517d;
    }

    public final void i(Drawable drawable) {
        this.f22515B.setBackgroundDrawable(drawable);
    }

    public final void j(int i9) {
        this.f22521i = i9;
        this.f22523k = true;
    }

    public final int m() {
        if (!this.f22523k) {
            return 0;
        }
        return this.f22521i;
    }

    public void o(ListAdapter listAdapter) {
        A0 a02 = this.f22526p;
        if (a02 == null) {
            this.f22526p = new A0(this);
        } else {
            ListAdapter listAdapter2 = this.f22516c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(a02);
            }
        }
        this.f22516c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f22526p);
        }
        C2621r0 c2621r0 = this.f22517d;
        if (c2621r0 != null) {
            c2621r0.setAdapter(this.f22516c);
        }
    }

    public C2621r0 p(Context context, boolean z8) {
        return new C2621r0(context, z8);
    }

    public final void q(int i9) {
        Drawable background = this.f22515B.getBackground();
        if (background != null) {
            Rect rect = this.f22535y;
            background.getPadding(rect);
            this.f22519g = rect.left + rect.right + i9;
            return;
        }
        this.f22519g = i9;
    }

    @Override // p.InterfaceC2519B
    public final void show() {
        int i9;
        boolean z8;
        int makeMeasureSpec;
        int i10;
        int i11;
        boolean z9;
        C2621r0 c2621r0;
        int i12;
        int i13;
        C2621r0 c2621r02 = this.f22517d;
        C2636z c2636z = this.f22515B;
        Context context = this.b;
        if (c2621r02 == null) {
            C2621r0 p2 = p(context, !this.f22514A);
            this.f22517d = p2;
            p2.setAdapter(this.f22516c);
            this.f22517d.setOnItemClickListener(this.f22528r);
            this.f22517d.setFocusable(true);
            this.f22517d.setFocusableInTouchMode(true);
            this.f22517d.setOnItemSelectedListener(new C2631w0(this));
            this.f22517d.setOnScrollListener(this.f22532v);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f22529s;
            if (onItemSelectedListener != null) {
                this.f22517d.setOnItemSelectedListener(onItemSelectedListener);
            }
            c2636z.setContentView(this.f22517d);
        }
        Drawable background = c2636z.getBackground();
        int i14 = 0;
        Rect rect = this.f22535y;
        if (background != null) {
            background.getPadding(rect);
            int i15 = rect.top;
            i9 = rect.bottom + i15;
            if (!this.f22523k) {
                this.f22521i = -i15;
            }
        } else {
            rect.setEmpty();
            i9 = 0;
        }
        if (c2636z.getInputMethodMode() == 2) {
            z8 = true;
        } else {
            z8 = false;
        }
        int a6 = AbstractC2633x0.a(c2636z, this.f22527q, this.f22521i, z8);
        int i16 = this.f22518f;
        if (i16 == -1) {
            i11 = a6 + i9;
        } else {
            int i17 = this.f22519g;
            if (i17 != -2) {
                if (i17 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int a9 = this.f22517d.a(makeMeasureSpec, a6);
            if (a9 > 0) {
                i10 = this.f22517d.getPaddingBottom() + this.f22517d.getPaddingTop() + i9;
            } else {
                i10 = 0;
            }
            i11 = a9 + i10;
        }
        if (this.f22515B.getInputMethodMode() == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        Z.l.d(c2636z, this.f22522j);
        if (c2636z.isShowing()) {
            if (!this.f22527q.isAttachedToWindow()) {
                return;
            }
            int i18 = this.f22519g;
            if (i18 == -1) {
                i18 = -1;
            } else if (i18 == -2) {
                i18 = this.f22527q.getWidth();
            }
            if (i16 == -1) {
                if (z9) {
                    i16 = i11;
                } else {
                    i16 = -1;
                }
                if (z9) {
                    if (this.f22519g == -1) {
                        i13 = -1;
                    } else {
                        i13 = 0;
                    }
                    c2636z.setWidth(i13);
                    c2636z.setHeight(0);
                } else {
                    if (this.f22519g == -1) {
                        i14 = -1;
                    }
                    c2636z.setWidth(i14);
                    c2636z.setHeight(-1);
                }
            } else if (i16 == -2) {
                i16 = i11;
            }
            c2636z.setOutsideTouchable(true);
            View view = this.f22527q;
            int i19 = this.f22520h;
            int i20 = this.f22521i;
            if (i18 < 0) {
                i18 = -1;
            }
            if (i16 < 0) {
                i12 = -1;
            } else {
                i12 = i16;
            }
            c2636z.update(view, i19, i20, i18, i12);
            return;
        }
        int i21 = this.f22519g;
        if (i21 == -1) {
            i21 = -1;
        } else if (i21 == -2) {
            i21 = this.f22527q.getWidth();
        }
        if (i16 == -1) {
            i16 = -1;
        } else if (i16 == -2) {
            i16 = i11;
        }
        c2636z.setWidth(i21);
        c2636z.setHeight(i16);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f22512C;
            if (method != null) {
                try {
                    method.invoke(c2636z, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC2635y0.b(c2636z, true);
        }
        c2636z.setOutsideTouchable(true);
        c2636z.setTouchInterceptor(this.f22531u);
        if (this.m) {
            Z.l.c(c2636z, this.l);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f22513D;
            if (method2 != null) {
                try {
                    method2.invoke(c2636z, this.f22536z);
                } catch (Exception e4) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e4);
                }
            }
        } else {
            AbstractC2635y0.a(c2636z, this.f22536z);
        }
        c2636z.showAsDropDown(this.f22527q, this.f22520h, this.f22521i, this.f22524n);
        this.f22517d.setSelection(-1);
        if ((!this.f22514A || this.f22517d.isInTouchMode()) && (c2621r0 = this.f22517d) != null) {
            c2621r0.setListSelectionHidden(true);
            c2621r0.requestLayout();
        }
        if (!this.f22514A) {
            this.f22534x.post(this.f22533w);
        }
    }
}
