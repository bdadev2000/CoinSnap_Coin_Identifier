package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.tools.arruler.photomeasure.camera.ruler.R;
import q.C0;
import q.C2621r0;
import q.H0;

/* renamed from: p.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC2520C extends t implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: c, reason: collision with root package name */
    public final Context f22030c;

    /* renamed from: d, reason: collision with root package name */
    public final MenuC2533l f22031d;

    /* renamed from: f, reason: collision with root package name */
    public final C2530i f22032f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f22033g;

    /* renamed from: h, reason: collision with root package name */
    public final int f22034h;

    /* renamed from: i, reason: collision with root package name */
    public final int f22035i;

    /* renamed from: j, reason: collision with root package name */
    public final int f22036j;

    /* renamed from: k, reason: collision with root package name */
    public final H0 f22037k;

    /* renamed from: n, reason: collision with root package name */
    public PopupWindow.OnDismissListener f22038n;

    /* renamed from: o, reason: collision with root package name */
    public View f22039o;

    /* renamed from: p, reason: collision with root package name */
    public View f22040p;

    /* renamed from: q, reason: collision with root package name */
    public w f22041q;

    /* renamed from: r, reason: collision with root package name */
    public ViewTreeObserver f22042r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f22043s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f22044t;

    /* renamed from: u, reason: collision with root package name */
    public int f22045u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f22047w;
    public final ViewTreeObserverOnGlobalLayoutListenerC2525d l = new ViewTreeObserverOnGlobalLayoutListenerC2525d(this, 1);
    public final U3.n m = new U3.n(this, 3);

    /* renamed from: v, reason: collision with root package name */
    public int f22046v = 0;

    /* JADX WARN: Type inference failed for: r7v1, types: [q.H0, q.C0] */
    public ViewOnKeyListenerC2520C(int i9, int i10, Context context, View view, MenuC2533l menuC2533l, boolean z8) {
        this.f22030c = context;
        this.f22031d = menuC2533l;
        this.f22033g = z8;
        this.f22032f = new C2530i(menuC2533l, LayoutInflater.from(context), z8, R.layout.abc_popup_menu_item_layout);
        this.f22035i = i9;
        this.f22036j = i10;
        Resources resources = context.getResources();
        this.f22034h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f22039o = view;
        this.f22037k = new C0(context, null, i9, i10);
        menuC2533l.b(this, context);
    }

    @Override // p.InterfaceC2519B
    public final boolean a() {
        if (!this.f22043s && this.f22037k.f22515B.isShowing()) {
            return true;
        }
        return false;
    }

    @Override // p.x
    public final void b(MenuC2533l menuC2533l, boolean z8) {
        if (menuC2533l != this.f22031d) {
            return;
        }
        dismiss();
        w wVar = this.f22041q;
        if (wVar != null) {
            wVar.b(menuC2533l, z8);
        }
    }

    @Override // p.x
    public final boolean d() {
        return false;
    }

    @Override // p.InterfaceC2519B
    public final void dismiss() {
        if (a()) {
            this.f22037k.dismiss();
        }
    }

    @Override // p.x
    public final void e(w wVar) {
        this.f22041q = wVar;
    }

    @Override // p.x
    public final void f() {
        this.f22044t = false;
        C2530i c2530i = this.f22032f;
        if (c2530i != null) {
            c2530i.notifyDataSetChanged();
        }
    }

    @Override // p.InterfaceC2519B
    public final C2621r0 g() {
        return this.f22037k.f22517d;
    }

    @Override // p.x
    public final boolean h(SubMenuC2521D subMenuC2521D) {
        if (subMenuC2521D.hasVisibleItems()) {
            View view = this.f22040p;
            v vVar = new v(this.f22035i, this.f22036j, this.f22030c, view, subMenuC2521D, this.f22033g);
            w wVar = this.f22041q;
            vVar.f22165i = wVar;
            t tVar = vVar.f22166j;
            if (tVar != null) {
                tVar.e(wVar);
            }
            boolean t9 = t.t(subMenuC2521D);
            vVar.f22164h = t9;
            t tVar2 = vVar.f22166j;
            if (tVar2 != null) {
                tVar2.n(t9);
            }
            vVar.f22167k = this.f22038n;
            this.f22038n = null;
            this.f22031d.c(false);
            H0 h02 = this.f22037k;
            int i9 = h02.f22520h;
            int m = h02.m();
            if ((Gravity.getAbsoluteGravity(this.f22046v, this.f22039o.getLayoutDirection()) & 7) == 5) {
                i9 += this.f22039o.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f22162f != null) {
                    vVar.d(i9, m, true, true);
                }
            }
            w wVar2 = this.f22041q;
            if (wVar2 != null) {
                wVar2.g(subMenuC2521D);
            }
            return true;
        }
        return false;
    }

    @Override // p.t
    public final void m(View view) {
        this.f22039o = view;
    }

    @Override // p.t
    public final void n(boolean z8) {
        this.f22032f.f22097d = z8;
    }

    @Override // p.t
    public final void o(int i9) {
        this.f22046v = i9;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f22043s = true;
        this.f22031d.c(true);
        ViewTreeObserver viewTreeObserver = this.f22042r;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f22042r = this.f22040p.getViewTreeObserver();
            }
            this.f22042r.removeGlobalOnLayoutListener(this.l);
            this.f22042r = null;
        }
        this.f22040p.removeOnAttachStateChangeListener(this.m);
        PopupWindow.OnDismissListener onDismissListener = this.f22038n;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i9, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i9 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // p.t
    public final void p(int i9) {
        this.f22037k.f22520h = i9;
    }

    @Override // p.t
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.f22038n = onDismissListener;
    }

    @Override // p.t
    public final void r(boolean z8) {
        this.f22047w = z8;
    }

    @Override // p.t
    public final void s(int i9) {
        this.f22037k.j(i9);
    }

    @Override // p.InterfaceC2519B
    public final void show() {
        View view;
        boolean z8;
        Rect rect;
        if (!a()) {
            if (!this.f22043s && (view = this.f22039o) != null) {
                this.f22040p = view;
                H0 h02 = this.f22037k;
                h02.f22515B.setOnDismissListener(this);
                h02.f22528r = this;
                h02.f22514A = true;
                h02.f22515B.setFocusable(true);
                View view2 = this.f22040p;
                if (this.f22042r == null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f22042r = viewTreeObserver;
                if (z8) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.l);
                }
                view2.addOnAttachStateChangeListener(this.m);
                h02.f22527q = view2;
                h02.f22524n = this.f22046v;
                boolean z9 = this.f22044t;
                Context context = this.f22030c;
                C2530i c2530i = this.f22032f;
                if (!z9) {
                    this.f22045u = t.l(c2530i, context, this.f22034h);
                    this.f22044t = true;
                }
                h02.q(this.f22045u);
                h02.f22515B.setInputMethodMode(2);
                Rect rect2 = this.b;
                if (rect2 != null) {
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                h02.f22536z = rect;
                h02.show();
                C2621r0 c2621r0 = h02.f22517d;
                c2621r0.setOnKeyListener(this);
                if (this.f22047w) {
                    MenuC2533l menuC2533l = this.f22031d;
                    if (menuC2533l.f22111o != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c2621r0, false);
                        TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                        if (textView != null) {
                            textView.setText(menuC2533l.f22111o);
                        }
                        frameLayout.setEnabled(false);
                        c2621r0.addHeaderView(frameLayout, null, false);
                    }
                }
                h02.o(c2530i);
                h02.show();
                return;
            }
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // p.t
    public final void k(MenuC2533l menuC2533l) {
    }
}
