package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class BoxWithConstraintsKt$BoxWithConstraints$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MeasurePolicy f3817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f3818b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoxWithConstraintsKt$BoxWithConstraints$1$1(MeasurePolicy measurePolicy, q qVar) {
        super(2);
        this.f3817a = measurePolicy;
        this.f3818b = qVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        SubcomposeMeasureScope subcomposeMeasureScope = (SubcomposeMeasureScope) obj;
        long j2 = ((Constraints) obj2).f17480a;
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = new BoxWithConstraintsScopeImpl(subcomposeMeasureScope, j2);
        b0 b0Var = b0.f30125a;
        BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1 boxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1 = new BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1(this.f3818b, boxWithConstraintsScopeImpl);
        Object obj3 = ComposableLambdaKt.f14482a;
        return this.f3817a.mo0measure3p2s80s(subcomposeMeasureScope, subcomposeMeasureScope.D1(b0Var, new ComposableLambdaImpl(-1945019079, boxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1, true)), j2);
    }
}
