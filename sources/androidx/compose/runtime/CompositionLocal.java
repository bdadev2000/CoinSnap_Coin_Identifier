package androidx.compose.runtime;

@Stable
/* loaded from: classes4.dex */
public abstract class CompositionLocal<T> {

    /* renamed from: a, reason: collision with root package name */
    public final LazyValueHolder f13760a;

    public CompositionLocal(q0.a aVar) {
        this.f13760a = new LazyValueHolder(aVar);
    }

    public ValueHolder a() {
        return this.f13760a;
    }

    public abstract ValueHolder b(ProvidedValue providedValue, ValueHolder valueHolder);
}
