package org.koin.core.instance;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;
import p0.a;
import q0.l;

/* loaded from: classes3.dex */
public final class SingleInstanceFactory<T> extends InstanceFactory<T> {

    @Nullable
    private T value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleInstanceFactory(@NotNull BeanDefinition<T> beanDefinition) {
        super(beanDefinition);
        a.s(beanDefinition, "beanDefinition");
    }

    private final T getValue() {
        T t2 = this.value;
        if (t2 != null) {
            return t2;
        }
        throw new IllegalStateException("Single instance created couldn't return value".toString());
    }

    @Override // org.koin.core.instance.InstanceFactory
    public T create(@NotNull InstanceContext instanceContext) {
        a.s(instanceContext, "context");
        return this.value == null ? (T) super.create(instanceContext) : getValue();
    }

    @Override // org.koin.core.instance.InstanceFactory
    public void drop(@Nullable Scope scope) {
        l onClose = getBeanDefinition().getCallbacks().getOnClose();
        if (onClose != null) {
            onClose.invoke(this.value);
        }
        this.value = null;
    }

    @Override // org.koin.core.instance.InstanceFactory
    public void dropAll() {
        InstanceFactory.drop$default(this, null, 1, null);
    }

    @Override // org.koin.core.instance.InstanceFactory
    public T get(@NotNull InstanceContext instanceContext) {
        a.s(instanceContext, "context");
        KoinPlatformTools.INSTANCE.m818synchronized(this, new SingleInstanceFactory$get$1(this, instanceContext));
        return getValue();
    }

    @Override // org.koin.core.instance.InstanceFactory
    public boolean isCreated(@Nullable InstanceContext instanceContext) {
        return this.value != null;
    }
}
