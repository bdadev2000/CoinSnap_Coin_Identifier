package androidx.lifecycle;

import kotlin.Lazy;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public final class y0 implements Lazy {

    /* renamed from: b, reason: collision with root package name */
    public final KClass f1842b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f1843c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f1844d;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f1845f;

    /* renamed from: g, reason: collision with root package name */
    public x0 f1846g;

    public y0(KClass viewModelClass, Function0 storeProducer, Function0 factoryProducer, Function0 extrasProducer) {
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        this.f1842b = viewModelClass;
        this.f1843c = storeProducer;
        this.f1844d = factoryProducer;
        this.f1845f = extrasProducer;
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        x0 x0Var = this.f1846g;
        if (x0Var == null) {
            x0 s5 = new h.c((d1) this.f1843c.invoke(), (a1) this.f1844d.invoke(), (k1.c) this.f1845f.invoke()).s(JvmClassMappingKt.getJavaClass(this.f1842b));
            this.f1846g = s5;
            return s5;
        }
        return x0Var;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.f1846g != null;
    }
}
