package androidx.activity.compose;

import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes3.dex */
final class ReportDrawnComposition$observeReporter$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f248a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f249b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnComposition$observeReporter$1(b0 b0Var, q0.a aVar) {
        super(0);
        this.f248a = b0Var;
        this.f249b = aVar;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f248a.f30919a = ((Boolean) this.f249b.invoke()).booleanValue();
        return d0.b0.f30125a;
    }
}
