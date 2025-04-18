package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import b1.k;
import d0.b0;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class Recomposer$broadcastFrameClock$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Recomposer f13905a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$broadcastFrameClock$1(Recomposer recomposer) {
        super(0);
        this.f13905a = recomposer;
    }

    @Override // q0.a
    public final Object invoke() {
        k C;
        Recomposer recomposer = this.f13905a;
        synchronized (recomposer.f13878b) {
            C = recomposer.C();
            if (((Recomposer.State) recomposer.f13894t.getValue()).compareTo(Recomposer.State.f13899b) <= 0) {
                throw e.a("Recomposer shutdown; frame clock awaiter will never resume", recomposer.d);
            }
        }
        if (C != null) {
            C.resumeWith(b0.f30125a);
        }
        return b0.f30125a;
    }
}
