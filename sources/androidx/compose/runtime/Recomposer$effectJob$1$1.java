package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import b1.h1;
import b1.k;
import d0.b0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Recomposer$effectJob$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Recomposer f13906a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$effectJob$1$1(Recomposer recomposer) {
        super(1);
        this.f13906a = recomposer;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        k kVar;
        k kVar2;
        Throwable th = (Throwable) obj;
        CancellationException a2 = e.a("Recomposer effect job completed", th);
        Recomposer recomposer = this.f13906a;
        synchronized (recomposer.f13878b) {
            try {
                h1 h1Var = recomposer.f13879c;
                kVar = null;
                if (h1Var != null) {
                    recomposer.f13894t.h(Recomposer.State.f13899b);
                    if (recomposer.f13891q) {
                        kVar2 = recomposer.f13889o;
                        if (kVar2 != null) {
                            recomposer.f13889o = null;
                            h1Var.g0(new Recomposer$effectJob$1$1$1$1(recomposer, th));
                            kVar = kVar2;
                        }
                    } else {
                        h1Var.a(a2);
                    }
                    kVar2 = null;
                    recomposer.f13889o = null;
                    h1Var.g0(new Recomposer$effectJob$1$1$1$1(recomposer, th));
                    kVar = kVar2;
                } else {
                    recomposer.d = a2;
                    recomposer.f13894t.h(Recomposer.State.f13898a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (kVar != null) {
            kVar.resumeWith(b0.f30125a);
        }
        return b0.f30125a;
    }
}
