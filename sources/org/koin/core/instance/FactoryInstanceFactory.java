package org.koin.core.instance;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.scope.Scope;
import p0.a;
import q0.l;

/* loaded from: classes3.dex */
public final class FactoryInstanceFactory<T> extends InstanceFactory<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FactoryInstanceFactory(@NotNull BeanDefinition<T> beanDefinition) {
        super(beanDefinition);
        a.s(beanDefinition, "beanDefinition");
    }

    @Override // org.koin.core.instance.InstanceFactory
    public void drop(@Nullable Scope scope) {
        l onClose = getBeanDefinition().getCallbacks().getOnClose();
        if (onClose != null) {
            onClose.invoke(null);
        }
    }

    @Override // org.koin.core.instance.InstanceFactory
    public void dropAll() {
    }

    @Override // org.koin.core.instance.InstanceFactory
    public T get(@NotNull InstanceContext instanceContext) {
        a.s(instanceContext, "context");
        return create(instanceContext);
    }

    @Override // org.koin.core.instance.InstanceFactory
    public boolean isCreated(@Nullable InstanceContext instanceContext) {
        return false;
    }
}
