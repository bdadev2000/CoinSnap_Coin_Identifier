package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class FlowMeasureLazyPolicy$measure$measurablesIterator$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SubcomposeMeasureScope f3979a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowMeasureLazyPolicy f3980b;

    /* renamed from: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$measurablesIterator$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FlowMeasureLazyPolicy f3981a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f3982b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ FlowLineInfo f3983c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FlowMeasureLazyPolicy flowMeasureLazyPolicy, int i2, FlowLineInfo flowLineInfo) {
            super(2);
            this.f3981a = flowMeasureLazyPolicy;
            this.f3982b = i2;
            this.f3983c = flowLineInfo;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                composer.A();
            } else {
                this.f3981a.f3974l.invoke(Integer.valueOf(this.f3982b), this.f3983c, composer, 0);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowMeasureLazyPolicy$measure$measurablesIterator$1(FlowMeasureLazyPolicy flowMeasureLazyPolicy, SubcomposeMeasureScope subcomposeMeasureScope) {
        super(2);
        this.f3979a = subcomposeMeasureScope;
        this.f3980b = flowMeasureLazyPolicy;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        Integer valueOf = Integer.valueOf(intValue);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f3980b, intValue, (FlowLineInfo) obj2);
        Object obj3 = ComposableLambdaKt.f14482a;
        return this.f3979a.D1(valueOf, new ComposableLambdaImpl(-195060736, anonymousClass1, true));
    }
}
