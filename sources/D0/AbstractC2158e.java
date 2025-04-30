package d0;

import L3.m;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0513x;
import androidx.lifecycle.EnumC0504n;
import androidx.lifecycle.InterfaceC0511v;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.lang.ref.ReferenceQueue;
import r8.k;

/* renamed from: d0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2158e extends k {

    /* renamed from: n, reason: collision with root package name */
    public static final boolean f19781n = true;

    /* renamed from: o, reason: collision with root package name */
    public static final ReferenceQueue f19782o = new ReferenceQueue();

    /* renamed from: p, reason: collision with root package name */
    public static final m f19783p = new m(1);

    /* renamed from: c, reason: collision with root package name */
    public final B3.k f19784c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19785d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC2159f[] f19786e;

    /* renamed from: f, reason: collision with root package name */
    public final View f19787f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19788g;

    /* renamed from: h, reason: collision with root package name */
    public final Choreographer f19789h;

    /* renamed from: i, reason: collision with root package name */
    public final ChoreographerFrameCallbackC2156c f19790i;

    /* renamed from: j, reason: collision with root package name */
    public final Handler f19791j;

    /* renamed from: k, reason: collision with root package name */
    public AbstractC2158e f19792k;
    public InterfaceC0511v l;
    public C2157d m;

    public AbstractC2158e(View view, int i9, Object obj) {
        if (obj == null) {
            this.f19784c = new B3.k(this, 14);
            this.f19785d = false;
            this.f19786e = new AbstractC2159f[i9];
            this.f19787f = view;
            if (Looper.myLooper() != null) {
                if (f19781n) {
                    this.f19789h = Choreographer.getInstance();
                    this.f19790i = new ChoreographerFrameCallbackC2156c(this, 0);
                    return;
                } else {
                    this.f19790i = null;
                    this.f19791j = new Handler(Looper.myLooper());
                    return;
                }
            }
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0096, code lost:
    
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0094, code lost:
    
        if (r23 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        if (r23 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ee A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void J(android.view.View r21, java.lang.Object[] r22, C.c r23, android.util.SparseIntArray r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.AbstractC2158e.J(android.view.View, java.lang.Object[], C.c, android.util.SparseIntArray, boolean):void");
    }

    public static Object[] K(View view, int i9, C.c cVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i9];
        J(view, objArr, cVar, sparseIntArray, true);
        return objArr;
    }

    public abstract void E();

    public final void F() {
        if (this.f19788g) {
            L();
        } else {
            if (!H()) {
                return;
            }
            this.f19788g = true;
            E();
            this.f19788g = false;
        }
    }

    public final void G() {
        AbstractC2158e abstractC2158e = this.f19792k;
        if (abstractC2158e == null) {
            F();
        } else {
            abstractC2158e.G();
        }
    }

    public abstract boolean H();

    public abstract void I();

    public final void L() {
        AbstractC2158e abstractC2158e = this.f19792k;
        if (abstractC2158e != null) {
            abstractC2158e.L();
            return;
        }
        InterfaceC0511v interfaceC0511v = this.l;
        if (interfaceC0511v != null && ((C0513x) interfaceC0511v.getLifecycle()).f4904d.compareTo(EnumC0504n.f4894f) < 0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f19785d) {
                    return;
                }
                this.f19785d = true;
                if (f19781n) {
                    this.f19789h.postFrameCallback(this.f19790i);
                } else {
                    this.f19791j.post(this.f19784c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void M(InterfaceC0511v interfaceC0511v) {
        if (interfaceC0511v instanceof Fragment) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        InterfaceC0511v interfaceC0511v2 = this.l;
        if (interfaceC0511v2 == interfaceC0511v) {
            return;
        }
        if (interfaceC0511v2 != null) {
            interfaceC0511v2.getLifecycle().b(this.m);
        }
        this.l = interfaceC0511v;
        if (interfaceC0511v != null) {
            if (this.m == null) {
                this.m = new C2157d(this);
            }
            interfaceC0511v.getLifecycle().a(this.m);
        }
        for (AbstractC2159f abstractC2159f : this.f19786e) {
        }
    }

    public final void N(View view) {
        view.setTag(R.id.dataBinding, this);
    }
}
