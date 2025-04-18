package org.koin.core.instance;

import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.error.InstanceCreationException;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;
import p0.a;

/* loaded from: classes2.dex */
public abstract class InstanceFactory<T> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String ERROR_SEPARATOR = "\n\t";

    @NotNull
    private final BeanDefinition<T> beanDefinition;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public InstanceFactory(@NotNull BeanDefinition<T> beanDefinition) {
        a.s(beanDefinition, "beanDefinition");
        this.beanDefinition = beanDefinition;
    }

    public static /* synthetic */ void drop$default(InstanceFactory instanceFactory, Scope scope, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drop");
        }
        if ((i2 & 1) != 0) {
            scope = null;
        }
        instanceFactory.drop(scope);
    }

    public static /* synthetic */ boolean isCreated$default(InstanceFactory instanceFactory, InstanceContext instanceContext, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isCreated");
        }
        if ((i2 & 1) != 0) {
            instanceContext = null;
        }
        return instanceFactory.isCreated(instanceContext);
    }

    public T create(@NotNull InstanceContext instanceContext) {
        a.s(instanceContext, "context");
        instanceContext.getLogger().debug("| (+) '" + this.beanDefinition + '\'');
        try {
            ParametersHolder parameters = instanceContext.getParameters();
            if (parameters == null) {
                parameters = ParametersHolderKt.emptyParametersHolder();
            }
            return (T) this.beanDefinition.getDefinition().invoke(instanceContext.getScope(), parameters);
        } catch (Exception e) {
            String stackTrace = KoinPlatformTools.INSTANCE.getStackTrace(e);
            instanceContext.getLogger().error("* Instance creation error : could not create instance for '" + this.beanDefinition + "': " + stackTrace);
            throw new InstanceCreationException("Could not create instance for '" + this.beanDefinition + '\'', e);
        }
    }

    public abstract void drop(@Nullable Scope scope);

    public abstract void dropAll();

    public boolean equals(@Nullable Object obj) {
        InstanceFactory instanceFactory = obj instanceof InstanceFactory ? (InstanceFactory) obj : null;
        return a.g(this.beanDefinition, instanceFactory != null ? instanceFactory.beanDefinition : null);
    }

    public abstract T get(@NotNull InstanceContext instanceContext);

    @NotNull
    public final BeanDefinition<T> getBeanDefinition() {
        return this.beanDefinition;
    }

    public int hashCode() {
        return this.beanDefinition.hashCode();
    }

    public abstract boolean isCreated(@Nullable InstanceContext instanceContext);
}
