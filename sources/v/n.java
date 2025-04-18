package v;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import b1.f0;
import d0.b0;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class n implements ComponentCallbacks2, p.g {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f31392a;

    /* renamed from: b, reason: collision with root package name */
    public Context f31393b;

    /* renamed from: c, reason: collision with root package name */
    public p.h f31394c;
    public boolean d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31395f = true;

    public n(f.o oVar) {
        this.f31392a = new WeakReference(oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v8, types: [p.h] */
    public final synchronized void a() {
        b0 b0Var;
        try {
            f.o oVar = (f.o) this.f31392a.get();
            if (oVar != null) {
                if (this.f31394c == null) {
                    ?? a2 = oVar.d.f31387b ? f0.a(oVar.f30409a, this) : new Object();
                    this.f31394c = a2;
                    this.f31395f = a2.d();
                }
                b0Var = b0.f30125a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            Context context = this.f31393b;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            p.h hVar = this.f31394c;
            if (hVar != null) {
                hVar.shutdown();
            }
            this.f31392a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        try {
            if ((((f.o) this.f31392a.get()) != null ? b0.f30125a : null) == null) {
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i2) {
        b0 b0Var;
        o.f fVar;
        try {
            f.o oVar = (f.o) this.f31392a.get();
            if (oVar != null) {
                d0.h hVar = oVar.f30411c;
                if (hVar != null && (fVar = (o.f) hVar.getValue()) != null) {
                    fVar.f31173a.a(i2);
                    fVar.f31174b.a(i2);
                }
                b0Var = b0.f30125a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
