package org.koin.core.instance;

import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class ScopedInstanceFactory<T> extends InstanceFactory<T> {

    @NotNull
    private HashMap<String, T> values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopedInstanceFactory(@NotNull BeanDefinition<T> beanDefinition) {
        super(beanDefinition);
        a.s(beanDefinition, "beanDefinition");
        this.values = new HashMap<>();
    }

    @Override // org.koin.core.instance.InstanceFactory
    public T create(@NotNull InstanceContext instanceContext) {
        a.s(instanceContext, "context");
        if (this.values.get(instanceContext.getScope().getId()) == null) {
            return (T) super.create(instanceContext);
        }
        T t2 = this.values.get(instanceContext.getScope().getId());
        if (t2 != null) {
            return t2;
        }
        throw new IllegalStateException(("Scoped instance not found for " + instanceContext.getScope().getId() + " in " + getBeanDefinition()).toString());
    }

    @Override // org.koin.core.instance.InstanceFactory
    public void drop(@Nullable Scope scope) {
        if (scope != null) {
            l onClose = getBeanDefinition().getCallbacks().getOnClose();
            if (onClose != null) {
                onClose.invoke(this.values.get(scope.getId()));
            }
            this.values.remove(scope.getId());
        }
    }

    @Override // org.koin.core.instance.InstanceFactory
    public void dropAll() {
        this.values.clear();
    }

    @Override // org.koin.core.instance.InstanceFactory
    public T get(@NotNull InstanceContext instanceContext) {
        a.s(instanceContext, "context");
        if (!a.g(instanceContext.getScope().getScopeQualifier(), getBeanDefinition().getScopeQualifier())) {
            throw new IllegalStateException(("Wrong Scope: trying to open instance for " + instanceContext.getScope().getId() + " in " + getBeanDefinition()).toString());
        }
        KoinPlatformTools.INSTANCE.m818synchronized(this, new ScopedInstanceFactory$get$1(this, instanceContext));
        T t2 = this.values.get(instanceContext.getScope().getId());
        if (t2 != null) {
            return t2;
        }
        throw new IllegalStateException(("Scoped instance not found for " + instanceContext.getScope().getId() + " in " + getBeanDefinition()).toString());
    }

    @Override // org.koin.core.instance.InstanceFactory
    public boolean isCreated(@Nullable InstanceContext instanceContext) {
        Scope scope;
        return this.values.get((instanceContext == null || (scope = instanceContext.getScope()) == null) ? null : scope.getId()) != null;
    }

    public final void refreshInstance(@NotNull String str, @NotNull Object obj) {
        a.s(str, "scopeID");
        a.s(obj, "instance");
        this.values.put(str, obj);
    }
}
