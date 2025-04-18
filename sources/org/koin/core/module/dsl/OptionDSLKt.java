package org.koin.core.module.dsl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import e0.u;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Callbacks;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.OptionDslMarker;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.StringQualifier;
import p0.a;
import q0.l;
import x0.c;

/* loaded from: classes4.dex */
public final class OptionDSLKt {
    public static final <T> void bind(BeanDefinition<? extends T> beanDefinition) {
        a.s(beanDefinition, "<this>");
        beanDefinition.getSecondaryTypes();
        a.A0();
        throw null;
    }

    public static final void binds(@NotNull BeanDefinition<?> beanDefinition, @NotNull List<? extends c> list) {
        a.s(beanDefinition, "<this>");
        a.s(list, "classes");
        beanDefinition.setSecondaryTypes(u.P0(list, beanDefinition.getSecondaryTypes()));
    }

    public static final void createdAtStart(@NotNull BeanDefinition<?> beanDefinition) {
        a.s(beanDefinition, "<this>");
        beanDefinition.set_createdAtStart(true);
    }

    public static final void named(@NotNull BeanDefinition<?> beanDefinition, @NotNull String str) {
        a.s(beanDefinition, "<this>");
        a.s(str, "name");
        beanDefinition.setQualifier(new StringQualifier(str));
    }

    public static final <T> void onClose(@NotNull BeanDefinition<T> beanDefinition, @NotNull l lVar) {
        a.s(beanDefinition, "<this>");
        a.s(lVar, "onClose");
        beanDefinition.setCallbacks(new Callbacks<>(lVar));
    }

    @NotNull
    public static final <T> KoinDefinition<T> onOptions(@NotNull KoinDefinition<T> koinDefinition, @Nullable l lVar) {
        a.s(koinDefinition, "<this>");
        if (lVar != null) {
            BeanDefinition<T> beanDefinition = koinDefinition.getFactory().getBeanDefinition();
            Qualifier qualifier = beanDefinition.getQualifier();
            lVar.invoke(beanDefinition);
            if (!a.g(beanDefinition.getQualifier(), qualifier)) {
                koinDefinition.getModule().indexPrimaryType(koinDefinition.getFactory());
            }
            if (!beanDefinition.getSecondaryTypes().isEmpty()) {
                koinDefinition.getModule().indexSecondaryTypes(koinDefinition.getFactory());
            }
            if (beanDefinition.get_createdAtStart() && (koinDefinition.getFactory() instanceof SingleInstanceFactory)) {
                koinDefinition.getModule().prepareForCreationAtStart((SingleInstanceFactory) koinDefinition.getFactory());
            }
        }
        return koinDefinition;
    }

    public static /* synthetic */ KoinDefinition onOptions$default(KoinDefinition koinDefinition, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = null;
        }
        return onOptions(koinDefinition, lVar);
    }

    @OptionDslMarker
    @NotNull
    public static final <T> KoinDefinition<T> withOptions(@NotNull KoinDefinition<T> koinDefinition, @NotNull l lVar) {
        a.s(koinDefinition, "<this>");
        a.s(lVar, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
        BeanDefinition<T> beanDefinition = koinDefinition.getFactory().getBeanDefinition();
        Qualifier qualifier = beanDefinition.getQualifier();
        lVar.invoke(beanDefinition);
        if (!a.g(beanDefinition.getQualifier(), qualifier)) {
            koinDefinition.getModule().indexPrimaryType(koinDefinition.getFactory());
        }
        if (!beanDefinition.getSecondaryTypes().isEmpty()) {
            koinDefinition.getModule().indexSecondaryTypes(koinDefinition.getFactory());
        }
        if (beanDefinition.get_createdAtStart() && (koinDefinition.getFactory() instanceof SingleInstanceFactory)) {
            koinDefinition.getModule().prepareForCreationAtStart((SingleInstanceFactory) koinDefinition.getFactory());
        }
        return koinDefinition;
    }

    public static final <T> void named(BeanDefinition<?> beanDefinition) {
        a.s(beanDefinition, "<this>");
        a.A0();
        throw null;
    }
}
