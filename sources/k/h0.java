package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.q2;
import androidx.appcompat.widget.y1;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes.dex */
public final class h0 extends x implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: c, reason: collision with root package name */
    public final Context f20068c;

    /* renamed from: d, reason: collision with root package name */
    public final o f20069d;

    /* renamed from: f, reason: collision with root package name */
    public final l f20070f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f20071g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20072h;

    /* renamed from: i, reason: collision with root package name */
    public final int f20073i;

    /* renamed from: j, reason: collision with root package name */
    public final int f20074j;

    /* renamed from: k, reason: collision with root package name */
    public final q2 f20075k;

    /* renamed from: n, reason: collision with root package name */
    public PopupWindow.OnDismissListener f20078n;

    /* renamed from: o, reason: collision with root package name */
    public View f20079o;

    /* renamed from: p, reason: collision with root package name */
    public View f20080p;

    /* renamed from: q, reason: collision with root package name */
    public b0 f20081q;

    /* renamed from: r, reason: collision with root package name */
    public ViewTreeObserver f20082r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f20083s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f20084t;
    public int u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f20086w;

    /* renamed from: l, reason: collision with root package name */
    public final e f20076l = new e(this, 1);

    /* renamed from: m, reason: collision with root package name */
    public final f f20077m = new f(this, 1);

    /* renamed from: v, reason: collision with root package name */
    public int f20085v = 0;

    public h0(int i10, int i11, Context context, View view, o oVar, boolean z10) {
        this.f20068c = context;
        this.f20069d = oVar;
        this.f20071g = z10;
        this.f20070f = new l(oVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.f20073i = i10;
        this.f20074j = i11;
        Resources resources = context.getResources();
        this.f20072h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f20079o = view;
        this.f20075k = new q2(context, i10, i11);
        oVar.b(this, context);
    }

    @Override // k.g0
    public final boolean a() {
        return !this.f20083s && this.f20075k.a();
    }

    @Override // k.c0
    public final void b(o oVar, boolean z10) {
        if (oVar != this.f20069d) {
            return;
        }
        dismiss();
        b0 b0Var = this.f20081q;
        if (b0Var != null) {
            b0Var.b(oVar, z10);
        }
    }

    @Override // k.c0
    public final void d() {
        this.f20084t = false;
        l lVar = this.f20070f;
        if (lVar != null) {
            lVar.notifyDataSetChanged();
        }
    }

    @Override // k.g0
    public final void dismiss() {
        if (a()) {
            this.f20075k.dismiss();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    @Override // k.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(k.i0 r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L78
            k.a0 r0 = new k.a0
            android.content.Context r5 = r9.f20068c
            android.view.View r6 = r9.f20080p
            boolean r8 = r9.f20071g
            int r3 = r9.f20073i
            int r4 = r9.f20074j
            r2 = r0
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            k.b0 r2 = r9.f20081q
            r0.f20049i = r2
            k.x r3 = r0.f20050j
            if (r3 == 0) goto L23
            r3.g(r2)
        L23:
            boolean r2 = k.x.t(r10)
            r0.f20048h = r2
            k.x r3 = r0.f20050j
            if (r3 == 0) goto L30
            r3.n(r2)
        L30:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f20078n
            r0.f20051k = r2
            r2 = 0
            r9.f20078n = r2
            k.o r2 = r9.f20069d
            r2.c(r1)
            androidx.appcompat.widget.q2 r2 = r9.f20075k
            int r3 = r2.f895h
            int r2 = r2.k()
            int r4 = r9.f20085v
            android.view.View r5 = r9.f20079o
            int r5 = androidx.core.view.ViewCompat.getLayoutDirection(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L5c
            android.view.View r4 = r9.f20079o
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L5c:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L64
            goto L6d
        L64:
            android.view.View r4 = r0.f20046f
            if (r4 != 0) goto L6a
            r0 = r1
            goto L6e
        L6a:
            r0.d(r3, r2, r5, r5)
        L6d:
            r0 = r5
        L6e:
            if (r0 == 0) goto L78
            k.b0 r0 = r9.f20081q
            if (r0 == 0) goto L77
            r0.i(r10)
        L77:
            return r5
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.f(k.i0):boolean");
    }

    @Override // k.c0
    public final void g(b0 b0Var) {
        this.f20081q = b0Var;
    }

    @Override // k.c0
    public final boolean h() {
        return false;
    }

    @Override // k.x
    public final void j(o oVar) {
    }

    @Override // k.x
    public final void l(View view) {
        this.f20079o = view;
    }

    @Override // k.g0
    public final y1 m() {
        return this.f20075k.f892d;
    }

    @Override // k.x
    public final void n(boolean z10) {
        this.f20070f.f20120d = z10;
    }

    @Override // k.x
    public final void o(int i10) {
        this.f20085v = i10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f20083s = true;
        this.f20069d.c(true);
        ViewTreeObserver viewTreeObserver = this.f20082r;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f20082r = this.f20080p.getViewTreeObserver();
            }
            this.f20082r.removeGlobalOnLayoutListener(this.f20076l);
            this.f20082r = null;
        }
        this.f20080p.removeOnAttachStateChangeListener(this.f20077m);
        PopupWindow.OnDismissListener onDismissListener = this.f20078n;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // k.x
    public final void p(int i10) {
        this.f20075k.f895h = i10;
    }

    @Override // k.x
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.f20078n = onDismissListener;
    }

    @Override // k.x
    public final void r(boolean z10) {
        this.f20086w = z10;
    }

    @Override // k.x
    public final void s(int i10) {
        this.f20075k.g(i10);
    }

    @Override // k.g0
    public final void show() {
        View view;
        boolean z10;
        Rect rect;
        boolean z11 = true;
        if (!a()) {
            if (!this.f20083s && (view = this.f20079o) != null) {
                this.f20080p = view;
                q2 q2Var = this.f20075k;
                q2Var.B.setOnDismissListener(this);
                q2Var.f905r = this;
                q2Var.A = true;
                androidx.appcompat.widget.d0 d0Var = q2Var.B;
                d0Var.setFocusable(true);
                View view2 = this.f20080p;
                if (this.f20082r == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f20082r = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f20076l);
                }
                view2.addOnAttachStateChangeListener(this.f20077m);
                q2Var.f904q = view2;
                q2Var.f901n = this.f20085v;
                boolean z12 = this.f20084t;
                Context context = this.f20068c;
                l lVar = this.f20070f;
                if (!z12) {
                    this.u = x.k(lVar, context, this.f20072h);
                    this.f20084t = true;
                }
                q2Var.p(this.u);
                d0Var.setInputMethodMode(2);
                Rect rect2 = this.f20182b;
                if (rect2 != null) {
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                q2Var.f912z = rect;
                q2Var.show();
                y1 y1Var = q2Var.f892d;
                y1Var.setOnKeyListener(this);
                if (this.f20086w) {
                    o oVar = this.f20069d;
                    if (oVar.f20136m != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) y1Var, false);
                        TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                        if (textView != null) {
                            textView.setText(oVar.f20136m);
                        }
                        frameLayout.setEnabled(false);
                        y1Var.addHeaderView(frameLayout, null, false);
                    }
                }
                q2Var.l(lVar);
                q2Var.show();
            } else {
                z11 = false;
            }
        }
        if (z11) {
        } else {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }
}
