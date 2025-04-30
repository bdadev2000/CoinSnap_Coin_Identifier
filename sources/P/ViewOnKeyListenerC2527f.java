package p;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.ArrayList;
import java.util.Iterator;
import q.C2621r0;
import q.E0;
import q.H0;

/* renamed from: p.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC2527f extends t implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A, reason: collision with root package name */
    public ViewTreeObserver f22066A;

    /* renamed from: B, reason: collision with root package name */
    public PopupWindow.OnDismissListener f22067B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f22068C;

    /* renamed from: c, reason: collision with root package name */
    public final Context f22069c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22070d;

    /* renamed from: f, reason: collision with root package name */
    public final int f22071f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22072g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f22073h;

    /* renamed from: i, reason: collision with root package name */
    public final Handler f22074i;

    /* renamed from: q, reason: collision with root package name */
    public View f22080q;

    /* renamed from: r, reason: collision with root package name */
    public View f22081r;

    /* renamed from: s, reason: collision with root package name */
    public int f22082s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f22083t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f22084u;

    /* renamed from: v, reason: collision with root package name */
    public int f22085v;

    /* renamed from: w, reason: collision with root package name */
    public int f22086w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f22088y;

    /* renamed from: z, reason: collision with root package name */
    public w f22089z;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f22075j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f22076k = new ArrayList();
    public final ViewTreeObserverOnGlobalLayoutListenerC2525d l = new ViewTreeObserverOnGlobalLayoutListenerC2525d(this, 0);
    public final U3.n m = new U3.n(this, 2);

    /* renamed from: n, reason: collision with root package name */
    public final com.bumptech.glide.f f22077n = new com.bumptech.glide.f(this, 9);

    /* renamed from: o, reason: collision with root package name */
    public int f22078o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f22079p = 0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f22087x = false;

    public ViewOnKeyListenerC2527f(Context context, View view, int i9, int i10, boolean z8) {
        this.f22069c = context;
        this.f22080q = view;
        this.f22071f = i9;
        this.f22072g = i10;
        this.f22073h = z8;
        this.f22082s = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f22070d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f22074i = new Handler();
    }

    @Override // p.InterfaceC2519B
    public final boolean a() {
        ArrayList arrayList = this.f22076k;
        if (arrayList.size() <= 0 || !((C2526e) arrayList.get(0)).f22064a.f22515B.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // p.x
    public final void b(MenuC2533l menuC2533l, boolean z8) {
        int i9;
        ArrayList arrayList = this.f22076k;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (menuC2533l == ((C2526e) arrayList.get(i10)).b) {
                    break;
                } else {
                    i10++;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 < 0) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            ((C2526e) arrayList.get(i11)).b.c(false);
        }
        C2526e c2526e = (C2526e) arrayList.remove(i10);
        c2526e.b.r(this);
        boolean z9 = this.f22068C;
        H0 h02 = c2526e.f22064a;
        if (z9) {
            E0.b(h02.f22515B, null);
            h02.f22515B.setAnimationStyle(0);
        }
        h02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f22082s = ((C2526e) arrayList.get(size2 - 1)).f22065c;
        } else {
            if (this.f22080q.getLayoutDirection() == 1) {
                i9 = 0;
            } else {
                i9 = 1;
            }
            this.f22082s = i9;
        }
        if (size2 == 0) {
            dismiss();
            w wVar = this.f22089z;
            if (wVar != null) {
                wVar.b(menuC2533l, true);
            }
            ViewTreeObserver viewTreeObserver = this.f22066A;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.f22066A.removeGlobalOnLayoutListener(this.l);
                }
                this.f22066A = null;
            }
            this.f22081r.removeOnAttachStateChangeListener(this.m);
            this.f22067B.onDismiss();
            return;
        }
        if (z8) {
            ((C2526e) arrayList.get(0)).b.c(false);
        }
    }

    @Override // p.x
    public final boolean d() {
        return false;
    }

    @Override // p.InterfaceC2519B
    public final void dismiss() {
        ArrayList arrayList = this.f22076k;
        int size = arrayList.size();
        if (size > 0) {
            C2526e[] c2526eArr = (C2526e[]) arrayList.toArray(new C2526e[size]);
            for (int i9 = size - 1; i9 >= 0; i9--) {
                C2526e c2526e = c2526eArr[i9];
                if (c2526e.f22064a.f22515B.isShowing()) {
                    c2526e.f22064a.dismiss();
                }
            }
        }
    }

    @Override // p.x
    public final void e(w wVar) {
        this.f22089z = wVar;
    }

    @Override // p.x
    public final void f() {
        Iterator it = this.f22076k.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C2526e) it.next()).f22064a.f22517d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C2530i) adapter).notifyDataSetChanged();
        }
    }

    @Override // p.InterfaceC2519B
    public final C2621r0 g() {
        ArrayList arrayList = this.f22076k;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C2526e) com.mbridge.msdk.foundation.entity.o.g(arrayList, 1)).f22064a.f22517d;
    }

    @Override // p.x
    public final boolean h(SubMenuC2521D subMenuC2521D) {
        Iterator it = this.f22076k.iterator();
        while (it.hasNext()) {
            C2526e c2526e = (C2526e) it.next();
            if (subMenuC2521D == c2526e.b) {
                c2526e.f22064a.f22517d.requestFocus();
                return true;
            }
        }
        if (subMenuC2521D.hasVisibleItems()) {
            k(subMenuC2521D);
            w wVar = this.f22089z;
            if (wVar != null) {
                wVar.g(subMenuC2521D);
            }
            return true;
        }
        return false;
    }

    @Override // p.t
    public final void k(MenuC2533l menuC2533l) {
        menuC2533l.b(this, this.f22069c);
        if (a()) {
            u(menuC2533l);
        } else {
            this.f22075j.add(menuC2533l);
        }
    }

    @Override // p.t
    public final void m(View view) {
        if (this.f22080q != view) {
            this.f22080q = view;
            this.f22079p = Gravity.getAbsoluteGravity(this.f22078o, view.getLayoutDirection());
        }
    }

    @Override // p.t
    public final void n(boolean z8) {
        this.f22087x = z8;
    }

    @Override // p.t
    public final void o(int i9) {
        if (this.f22078o != i9) {
            this.f22078o = i9;
            this.f22079p = Gravity.getAbsoluteGravity(i9, this.f22080q.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C2526e c2526e;
        ArrayList arrayList = this.f22076k;
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                c2526e = (C2526e) arrayList.get(i9);
                if (!c2526e.f22064a.f22515B.isShowing()) {
                    break;
                } else {
                    i9++;
                }
            } else {
                c2526e = null;
                break;
            }
        }
        if (c2526e != null) {
            c2526e.b.c(false);
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
        this.f22083t = true;
        this.f22085v = i9;
    }

    @Override // p.t
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.f22067B = onDismissListener;
    }

    @Override // p.t
    public final void r(boolean z8) {
        this.f22088y = z8;
    }

    @Override // p.t
    public final void s(int i9) {
        this.f22084u = true;
        this.f22086w = i9;
    }

    @Override // p.InterfaceC2519B
    public final void show() {
        boolean z8;
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f22075j;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((MenuC2533l) it.next());
        }
        arrayList.clear();
        View view = this.f22080q;
        this.f22081r = view;
        if (view != null) {
            if (this.f22066A == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f22066A = viewTreeObserver;
            if (z8) {
                viewTreeObserver.addOnGlobalLayoutListener(this.l);
            }
            this.f22081r.addOnAttachStateChangeListener(this.m);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x013c, code lost:
    
        if (((r8.getWidth() + r11[0]) + r5) > r10.right) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x013e, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0141, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0146, code lost:
    
        if ((r11[0] - r5) < 0) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01af  */
    /* JADX WARN: Type inference failed for: r7v0, types: [q.H0, q.C0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(p.MenuC2533l r17) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ViewOnKeyListenerC2527f.u(p.l):void");
    }
}
