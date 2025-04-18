package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
final class LazyLayoutKt$LazyLayout$3$2$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutItemContentFactory f4809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f4810b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutKt$LazyLayout$3$2$1(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, p pVar) {
        super(2);
        this.f4809a = lazyLayoutItemContentFactory;
        this.f4810b = pVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        long j2 = ((Constraints) obj2).f17480a;
        return (MeasureResult) this.f4810b.invoke(new LazyLayoutMeasureScopeImpl(this.f4809a, (SubcomposeMeasureScope) obj), new Constraints(j2));
    }
}
