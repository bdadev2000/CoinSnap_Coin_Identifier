package k;

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
import androidx.appcompat.widget.m2;
import androidx.appcompat.widget.q2;
import androidx.appcompat.widget.y1;
import androidx.core.view.ViewCompat;
import com.plantcare.ai.identifier.plantid.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i extends x implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public ViewTreeObserver A;
    public PopupWindow.OnDismissListener B;
    public boolean C;

    /* renamed from: c, reason: collision with root package name */
    public final Context f20087c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20088d;

    /* renamed from: f, reason: collision with root package name */
    public final int f20089f;

    /* renamed from: g, reason: collision with root package name */
    public final int f20090g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f20091h;

    /* renamed from: i, reason: collision with root package name */
    public final Handler f20092i;

    /* renamed from: q, reason: collision with root package name */
    public View f20100q;

    /* renamed from: r, reason: collision with root package name */
    public View f20101r;

    /* renamed from: s, reason: collision with root package name */
    public int f20102s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f20103t;
    public boolean u;

    /* renamed from: v, reason: collision with root package name */
    public int f20104v;

    /* renamed from: w, reason: collision with root package name */
    public int f20105w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f20107y;

    /* renamed from: z, reason: collision with root package name */
    public b0 f20108z;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f20093j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f20094k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final e f20095l = new e(this, 0);

    /* renamed from: m, reason: collision with root package name */
    public final f f20096m = new f(this, 0);

    /* renamed from: n, reason: collision with root package name */
    public final v3.c f20097n = new v3.c(this, 1);

    /* renamed from: o, reason: collision with root package name */
    public int f20098o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f20099p = 0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f20106x = false;

    public i(Context context, View view, int i10, int i11, boolean z10) {
        this.f20087c = context;
        this.f20100q = view;
        this.f20089f = i10;
        this.f20090g = i11;
        this.f20091h = z10;
        this.f20102s = ViewCompat.getLayoutDirection(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f20088d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f20092i = new Handler();
    }

    @Override // k.g0
    public final boolean a() {
        ArrayList arrayList = this.f20094k;
        return arrayList.size() > 0 && ((h) arrayList.get(0)).a.a();
    }

    @Override // k.c0
    public final void b(o oVar, boolean z10) {
        int i10;
        ArrayList arrayList = this.f20094k;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (oVar == ((h) arrayList.get(i11)).f20066b) {
                    break;
                } else {
                    i11++;
                }
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 < 0) {
            return;
        }
        int i12 = i11 + 1;
        if (i12 < arrayList.size()) {
            ((h) arrayList.get(i12)).f20066b.c(false);
        }
        h hVar = (h) arrayList.remove(i11);
        hVar.f20066b.r(this);
        boolean z11 = this.C;
        q2 q2Var = hVar.a;
        if (z11) {
            m2.b(q2Var.B, null);
            q2Var.B.setAnimationStyle(0);
        }
        q2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f20102s = ((h) arrayList.get(size2 - 1)).f20067c;
        } else {
            if (ViewCompat.getLayoutDirection(this.f20100q) == 1) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            this.f20102s = i10;
        }
        if (size2 == 0) {
            dismiss();
            b0 b0Var = this.f20108z;
            if (b0Var != null) {
                b0Var.b(oVar, true);
            }
            ViewTreeObserver viewTreeObserver = this.A;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.A.removeGlobalOnLayoutListener(this.f20095l);
                }
                this.A = null;
            }
            this.f20101r.removeOnAttachStateChangeListener(this.f20096m);
            this.B.onDismiss();
            return;
        }
        if (z10) {
            ((h) arrayList.get(0)).f20066b.c(false);
        }
    }

    @Override // k.c0
    public final void d() {
        Iterator it = this.f20094k.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((h) it.next()).a.f892d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((l) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.g0
    public final void dismiss() {
        ArrayList arrayList = this.f20094k;
        int size = arrayList.size();
        if (size > 0) {
            h[] hVarArr = (h[]) arrayList.toArray(new h[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    h hVar = hVarArr[size];
                    if (hVar.a.a()) {
                        hVar.a.dismiss();
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // k.c0
    public final boolean f(i0 i0Var) {
        Iterator it = this.f20094k.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (i0Var == hVar.f20066b) {
                hVar.a.f892d.requestFocus();
                return true;
            }
        }
        if (i0Var.hasVisibleItems()) {
            j(i0Var);
            b0 b0Var = this.f20108z;
            if (b0Var != null) {
                b0Var.i(i0Var);
            }
            return true;
        }
        return false;
    }

    @Override // k.c0
    public final void g(b0 b0Var) {
        this.f20108z = b0Var;
    }

    @Override // k.c0
    public final boolean h() {
        return false;
    }

    @Override // k.x
    public final void j(o oVar) {
        oVar.b(this, this.f20087c);
        if (a()) {
            u(oVar);
        } else {
            this.f20093j.add(oVar);
        }
    }

    @Override // k.x
    public final void l(View view) {
        if (this.f20100q != view) {
            this.f20100q = view;
            this.f20099p = Gravity.getAbsoluteGravity(this.f20098o, ViewCompat.getLayoutDirection(view));
        }
    }

    @Override // k.g0
    public final y1 m() {
        ArrayList arrayList = this.f20094k;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((h) arrayList.get(arrayList.size() - 1)).a.f892d;
    }

    @Override // k.x
    public final void n(boolean z10) {
        this.f20106x = z10;
    }

    @Override // k.x
    public final void o(int i10) {
        if (this.f20098o != i10) {
            this.f20098o = i10;
            this.f20099p = Gravity.getAbsoluteGravity(i10, ViewCompat.getLayoutDirection(this.f20100q));
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        h hVar;
        ArrayList arrayList = this.f20094k;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                hVar = (h) arrayList.get(i10);
                if (!hVar.a.a()) {
                    break;
                } else {
                    i10++;
                }
            } else {
                hVar = null;
                break;
            }
        }
        if (hVar != null) {
            hVar.f20066b.c(false);
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
        this.f20103t = true;
        this.f20104v = i10;
    }

    @Override // k.x
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.B = onDismissListener;
    }

    @Override // k.x
    public final void r(boolean z10) {
        this.f20107y = z10;
    }

    @Override // k.x
    public final void s(int i10) {
        this.u = true;
        this.f20105w = i10;
    }

    @Override // k.g0
    public final void show() {
        boolean z10;
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f20093j;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((o) it.next());
        }
        arrayList.clear();
        View view = this.f20100q;
        this.f20101r = view;
        if (view != null) {
            if (this.A == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.A = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f20095l);
            }
            this.f20101r.addOnAttachStateChangeListener(this.f20096m);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0135, code lost:
    
        if (((r0.getWidth() + r7[0]) + r3) > r8.right) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(k.o r15) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.i.u(k.o):void");
    }
}
