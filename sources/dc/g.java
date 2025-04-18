package dc;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.collect.c1;

/* loaded from: classes3.dex */
public final class g implements j {
    public final k a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f16985b;

    public g(k kVar, TaskCompletionSource taskCompletionSource) {
        this.a = kVar;
        this.f16985b = taskCompletionSource;
    }

    @Override // dc.j
    public final boolean a(Exception exc) {
        this.f16985b.trySetException(exc);
        return true;
    }

    @Override // dc.j
    public final boolean b(ec.a aVar) {
        boolean z10;
        String str;
        if (aVar.f17292b == ec.c.REGISTERED) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || this.a.a(aVar)) {
            return false;
        }
        c1 c1Var = new c1(6);
        String str2 = aVar.f17293c;
        if (str2 != null) {
            c1Var.f11923b = str2;
            c1Var.f11924c = Long.valueOf(aVar.f17295e);
            c1Var.f11925d = Long.valueOf(aVar.f17296f);
            if (((String) c1Var.f11923b) == null) {
                str = " token";
            } else {
                str = "";
            }
            if (((Long) c1Var.f11924c) == null) {
                str = str.concat(" tokenExpirationTimestamp");
            }
            if (((Long) c1Var.f11925d) == null) {
                str = eb.j.k(str, " tokenCreationTimestamp");
            }
            if (str.isEmpty()) {
                this.f16985b.setResult(new a((String) c1Var.f11923b, ((Long) c1Var.f11924c).longValue(), ((Long) c1Var.f11925d).longValue()));
                return true;
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        throw new NullPointerException("Null token");
    }
}
