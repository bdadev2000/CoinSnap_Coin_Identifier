package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import d0.b0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class Recomposer$effectJob$1$1$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Recomposer f13907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f13908b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$effectJob$1$1$1$1(Recomposer recomposer, Throwable th) {
        super(1);
        this.f13907a = recomposer;
        this.f13908b = th;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        Recomposer recomposer = this.f13907a;
        Object obj2 = recomposer.f13878b;
        Throwable th2 = this.f13908b;
        synchronized (obj2) {
            if (th2 == null) {
                th2 = null;
            } else if (th != null) {
                try {
                    if (!(!(th instanceof CancellationException))) {
                        th = null;
                    }
                    if (th != null) {
                        q.a(th2, th);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            recomposer.d = th2;
            recomposer.f13894t.h(Recomposer.State.f13898a);
        }
        return b0.f30125a;
    }
}
