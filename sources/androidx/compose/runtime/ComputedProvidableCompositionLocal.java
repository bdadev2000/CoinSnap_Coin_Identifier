package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.r;
import q0.l;

@StabilityInferred
/* loaded from: classes4.dex */
public final class ComputedProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {

    /* renamed from: b, reason: collision with root package name */
    public final ComputedValueHolder f13775b;

    /* renamed from: androidx.compose.runtime.ComputedProvidableCompositionLocal$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f13776a = new r(0);

        @Override // q0.a
        public final Object invoke() {
            ComposerKt.d("Unexpected call to default provider");
            throw null;
        }
    }

    public ComputedProvidableCompositionLocal(l lVar) {
        super(AnonymousClass1.f13776a);
        this.f13775b = new ComputedValueHolder(lVar);
    }

    @Override // androidx.compose.runtime.CompositionLocal
    public final ValueHolder a() {
        return this.f13775b;
    }

    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    public final ProvidedValue c(Object obj) {
        return new ProvidedValue(this, obj, obj == null, null, null, null, true);
    }
}
