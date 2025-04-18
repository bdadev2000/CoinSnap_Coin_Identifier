package ye;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import he.a0;
import he.t;
import he.v;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: i, reason: collision with root package name */
    public static final fe.c f28175i = new fe.c(b.class.getSimpleName());
    public a a;

    /* renamed from: b, reason: collision with root package name */
    public final View f28176b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f28177c;

    /* renamed from: d, reason: collision with root package name */
    public int f28178d;

    /* renamed from: e, reason: collision with root package name */
    public int f28179e;

    /* renamed from: f, reason: collision with root package name */
    public int f28180f;

    /* renamed from: g, reason: collision with root package name */
    public int f28181g;

    /* renamed from: h, reason: collision with root package name */
    public int f28182h;

    public b(Context context, ViewGroup viewGroup) {
        this.f28176b = g(context, viewGroup);
    }

    public void a() {
    }

    public final void b(int i10, int i11) {
        f28175i.a(1, "dispatchOnSurfaceAvailable:", "w=", Integer.valueOf(i10), "h=", Integer.valueOf(i11));
        this.f28178d = i10;
        this.f28179e = i11;
        if (i10 > 0 && i11 > 0) {
            a();
        }
        a aVar = this.a;
        if (aVar != null) {
            ((a0) aVar).m();
        }
    }

    public final void c(int i10, int i11) {
        int i12 = 1;
        f28175i.a(1, "dispatchOnSurfaceSizeChanged:", "w=", Integer.valueOf(i10), "h=", Integer.valueOf(i11));
        if (i10 != this.f28178d || i11 != this.f28179e) {
            this.f28178d = i10;
            this.f28179e = i11;
            if (i10 > 0 && i11 > 0) {
                a();
            }
            a aVar = this.a;
            if (aVar != null) {
                v vVar = (v) aVar;
                a0.f19026e.a(1, "onSurfaceChanged:", "Size is", vVar.O(3));
                vVar.f19029d.e("surface changed", pe.f.BIND, new t(vVar, i12));
            }
        }
    }

    public abstract Object d();

    public abstract Class e();

    public abstract View f();

    public abstract View g(Context context, ViewGroup viewGroup);

    public void h() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            View f10 = f();
            ViewParent parent = f10.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(f10);
                return;
            }
            return;
        }
        Handler handler = new Handler(Looper.getMainLooper());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        handler.post(new he.c(9, this, taskCompletionSource));
        try {
            Tasks.await(taskCompletionSource.getTask());
        } catch (Exception unused) {
        }
    }

    public void i() {
    }

    public void j() {
    }

    public void k(int i10) {
        this.f28182h = i10;
    }

    public final void l(int i10, int i11) {
        f28175i.a(1, "setStreamSize:", "desiredW=", Integer.valueOf(i10), "desiredH=", Integer.valueOf(i11));
        this.f28180f = i10;
        this.f28181g = i11;
        if (i10 > 0 && i11 > 0) {
            a();
        }
    }

    public final void m(a aVar) {
        boolean z10;
        a aVar2;
        boolean z11 = true;
        if (this.f28178d > 0 && this.f28179e > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (aVar2 = this.a) != null) {
            a0 a0Var = (a0) aVar2;
            a0.f19026e.a(1, "onSurfaceDestroyed");
            a0Var.H(false);
            a0Var.G(false);
        }
        this.a = aVar;
        if (this.f28178d <= 0 || this.f28179e <= 0) {
            z11 = false;
        }
        if (z11 && aVar != null) {
            ((a0) aVar).m();
        }
    }

    public boolean n() {
        return this instanceof g;
    }
}
