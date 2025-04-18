package org.koin.core.definition;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.module.KoinDslMarker;
import org.koin.core.module.Module;
import p0.a;

@KoinDslMarker
/* loaded from: classes3.dex */
public final class KoinDefinition<R> {

    @NotNull
    private final InstanceFactory<R> factory;

    @NotNull
    private final Module module;

    public KoinDefinition(@NotNull Module module, @NotNull InstanceFactory<R> instanceFactory) {
        a.s(module, "module");
        a.s(instanceFactory, "factory");
        this.module = module;
        this.factory = instanceFactory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KoinDefinition copy$default(KoinDefinition koinDefinition, Module module, InstanceFactory instanceFactory, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            module = koinDefinition.module;
        }
        if ((i2 & 2) != 0) {
            instanceFactory = koinDefinition.factory;
        }
        return koinDefinition.copy(module, instanceFactory);
    }

    @NotNull
    public final Module component1() {
        return this.module;
    }

    @NotNull
    public final InstanceFactory<R> component2() {
        return this.factory;
    }

    @NotNull
    public final KoinDefinition<R> copy(@NotNull Module module, @NotNull InstanceFactory<R> instanceFactory) {
        a.s(module, "module");
        a.s(instanceFactory, "factory");
        return new KoinDefinition<>(module, instanceFactory);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KoinDefinition)) {
            return false;
        }
        KoinDefinition koinDefinition = (KoinDefinition) obj;
        return a.g(this.module, koinDefinition.module) && a.g(this.factory, koinDefinition.factory);
    }

    @NotNull
    public final InstanceFactory<R> getFactory() {
        return this.factory;
    }

    @NotNull
    public final Module getModule() {
        return this.module;
    }

    public int hashCode() {
        return this.factory.hashCode() + (this.module.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "KoinDefinition(module=" + this.module + ", factory=" + this.factory + ')';
    }
}
