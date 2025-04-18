package bi;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import wh.e0;
import wh.f0;
import wh.l0;
import wh.u0;

/* loaded from: classes5.dex */
public final class a implements f0 {
    public static final a a = new a();

    @Override // wh.f0
    public final u0 intercept(e0 chain) {
        boolean z10;
        Intrinsics.checkNotNullParameter(chain, "chain");
        ci.f chain2 = (ci.f) chain;
        i iVar = chain2.a;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(chain2, "chain");
        synchronized (iVar) {
            if (iVar.f2481q) {
                if (!iVar.f2480p) {
                    if (!iVar.f2479o) {
                        Unit unit = Unit.INSTANCE;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        e eVar = iVar.f2475k;
        Intrinsics.checkNotNull(eVar);
        l0 client = iVar.f2467b;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain2, "chain");
        try {
            int i10 = chain2.f2806f;
            int i11 = chain2.f2807g;
            int i12 = chain2.f2808h;
            client.getClass();
            boolean z11 = client.f27114h;
            if (!Intrinsics.areEqual(chain2.f2805e.f27151b, "GET")) {
                z10 = true;
            } else {
                z10 = false;
            }
            a4.f fVar = new a4.f(iVar, iVar.f2471g, eVar, eVar.a(i10, i11, i12, z11, z10).j(client, chain2));
            iVar.f2478n = fVar;
            iVar.f2483s = fVar;
            synchronized (iVar) {
                iVar.f2479o = true;
                iVar.f2480p = true;
            }
            if (!iVar.f2482r) {
                return ci.f.a(chain2, 0, fVar, null, 61).b(chain2.f2805e);
            }
            throw new IOException("Canceled");
        } catch (m e2) {
            eVar.c(e2.f2506c);
            throw e2;
        } catch (IOException e10) {
            eVar.c(e10);
            throw new m(e10);
        }
    }
}
