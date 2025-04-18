package f1;

import com.google.android.gms.common.api.Api;
import e1.s0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public d[] f30452a;

    /* renamed from: b, reason: collision with root package name */
    public int f30453b;

    /* renamed from: c, reason: collision with root package name */
    public int f30454c;
    public c0 d;

    public final d a() {
        d dVar;
        c0 c0Var;
        synchronized (this) {
            try {
                d[] dVarArr = this.f30452a;
                if (dVarArr == null) {
                    dVarArr = d();
                    this.f30452a = dVarArr;
                } else if (this.f30453b >= dVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    p0.a.r(copyOf, "copyOf(this, newSize)");
                    this.f30452a = (d[]) copyOf;
                    dVarArr = (d[]) copyOf;
                }
                int i2 = this.f30454c;
                do {
                    dVar = dVarArr[i2];
                    if (dVar == null) {
                        dVar = c();
                        dVarArr[i2] = dVar;
                    }
                    i2++;
                    if (i2 >= dVarArr.length) {
                        i2 = 0;
                    }
                    p0.a.q(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVar.a(this));
                this.f30454c = i2;
                this.f30453b++;
                c0Var = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0Var != null) {
            c0Var.u(1);
        }
        return dVar;
    }

    public abstract d c();

    public abstract d[] d();

    public final void e(d dVar) {
        c0 c0Var;
        int i2;
        h0.g[] b2;
        synchronized (this) {
            try {
                int i3 = this.f30453b - 1;
                this.f30453b = i3;
                c0Var = this.d;
                if (i3 == 0) {
                    this.f30454c = 0;
                }
                p0.a.q(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b2 = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (h0.g gVar : b2) {
            if (gVar != null) {
                gVar.resumeWith(d0.b0.f30125a);
            }
        }
        if (c0Var != null) {
            c0Var.u(-1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [f1.c0, e1.s0] */
    public final c0 f() {
        c0 c0Var;
        synchronized (this) {
            c0 c0Var2 = this.d;
            c0Var = c0Var2;
            if (c0Var2 == null) {
                int i2 = this.f30453b;
                ?? s0Var = new s0(1, Api.BaseClientBuilder.API_PRIORITY_OTHER, 2);
                s0Var.b(Integer.valueOf(i2));
                this.d = s0Var;
                c0Var = s0Var;
            }
        }
        return c0Var;
    }
}
