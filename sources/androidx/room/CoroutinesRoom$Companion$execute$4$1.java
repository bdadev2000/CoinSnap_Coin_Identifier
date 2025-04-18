package androidx.room;

import android.os.CancellationSignal;
import b1.a2;
import b1.h1;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class CoroutinesRoom$Companion$execute$4$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f21245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f21246b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$4$1(CancellationSignal cancellationSignal, a2 a2Var) {
        super(1);
        this.f21245a = cancellationSignal;
        this.f21246b = a2Var;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        CancellationSignal cancellationSignal = this.f21245a;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        this.f21246b.a(null);
        return b0.f30125a;
    }
}
