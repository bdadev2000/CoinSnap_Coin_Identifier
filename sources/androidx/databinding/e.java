package androidx.databinding;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.View;
import androidx.activity.i;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.g0;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class e extends p6.a {

    /* renamed from: q, reason: collision with root package name */
    public static final boolean f1316q = true;

    /* renamed from: r, reason: collision with root package name */
    public static final ReferenceQueue f1317r = new ReferenceQueue();

    /* renamed from: s, reason: collision with root package name */
    public static final c f1318s = new c(0);

    /* renamed from: f, reason: collision with root package name */
    public final i f1319f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1320g;

    /* renamed from: h, reason: collision with root package name */
    public final f[] f1321h;

    /* renamed from: i, reason: collision with root package name */
    public final View f1322i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1323j;

    /* renamed from: k, reason: collision with root package name */
    public final Choreographer f1324k;

    /* renamed from: l, reason: collision with root package name */
    public final d f1325l;

    /* renamed from: m, reason: collision with root package name */
    public final Handler f1326m;

    /* renamed from: n, reason: collision with root package name */
    public e f1327n;

    /* renamed from: o, reason: collision with root package name */
    public v f1328o;

    /* renamed from: p, reason: collision with root package name */
    public ViewDataBinding$OnStartListener f1329p;

    public e(View view, int i10, Object obj) {
        if (obj == null) {
            this.f1319f = new i(this, 6);
            this.f1320g = false;
            this.f1321h = new f[i10];
            this.f1322i = view;
            if (Looper.myLooper() != null) {
                if (f1316q) {
                    this.f1324k = Choreographer.getInstance();
                    this.f1325l = new d(this);
                    return;
                } else {
                    this.f1325l = null;
                    this.f1326m = new Handler(Looper.myLooper());
                    return;
                }
            }
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x009a, code lost:
    
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0098, code lost:
    
        if (r23 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r23 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ff A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ab A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void J(android.view.View r21, java.lang.Object[] r22, h.c r23, android.util.SparseIntArray r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.e.J(android.view.View, java.lang.Object[], h.c, android.util.SparseIntArray, boolean):void");
    }

    public static Object[] K(View view, int i10, h.c cVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        J(view, objArr, cVar, sparseIntArray, true);
        return objArr;
    }

    public abstract void E();

    public final void F() {
        if (this.f1323j) {
            L();
        } else {
            if (!H()) {
                return;
            }
            this.f1323j = true;
            E();
            this.f1323j = false;
        }
    }

    public final void G() {
        e eVar = this.f1327n;
        if (eVar == null) {
            F();
        } else {
            eVar.G();
        }
    }

    public abstract boolean H();

    public abstract void I();

    public final void L() {
        e eVar = this.f1327n;
        if (eVar != null) {
            eVar.L();
            return;
        }
        v vVar = this.f1328o;
        if (vVar != null && !((x) vVar.getLifecycle()).f1835d.a(o.STARTED)) {
            return;
        }
        synchronized (this) {
            if (this.f1320g) {
                return;
            }
            this.f1320g = true;
            if (f1316q) {
                this.f1324k.postFrameCallback(this.f1325l);
            } else {
                this.f1326m.post(this.f1319f);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.databinding.ViewDataBinding$OnStartListener] */
    public void M(v vVar) {
        if (vVar instanceof Fragment) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        v vVar2 = this.f1328o;
        if (vVar2 == vVar) {
            return;
        }
        if (vVar2 != null) {
            vVar2.getLifecycle().b(this.f1329p);
        }
        this.f1328o = vVar;
        if (vVar != null) {
            if (this.f1329p == null) {
                this.f1329p = new u(this) { // from class: androidx.databinding.ViewDataBinding$OnStartListener

                    /* renamed from: b, reason: collision with root package name */
                    public final WeakReference f1313b;

                    {
                        this.f1313b = new WeakReference(this);
                    }

                    @g0(n.ON_START)
                    public void onStart() {
                        e eVar = (e) this.f1313b.get();
                        if (eVar != null) {
                            eVar.G();
                        }
                    }
                };
            }
            vVar.getLifecycle().a(this.f1329p);
        }
        for (f fVar : this.f1321h) {
        }
    }
}
