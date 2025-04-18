package org.koin.dsl;

import e0.t;
import e0.u;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Callbacks;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.OptionDslMarker;
import p0.a;
import q0.l;
import x0.c;

/* loaded from: classes3.dex */
public final class DefinitionBindingKt {
    @OptionDslMarker
    @NotNull
    public static final <S> KoinDefinition<? extends S> bind(@NotNull KoinDefinition<? extends S> koinDefinition, @NotNull c cVar) {
        a.s(koinDefinition, "<this>");
        a.s(cVar, "clazz");
        koinDefinition.getFactory().getBeanDefinition().setSecondaryTypes(u.Q0(koinDefinition.getFactory().getBeanDefinition().getSecondaryTypes(), cVar));
        koinDefinition.getModule().saveMapping(BeanDefinitionKt.indexKey(cVar, koinDefinition.getFactory().getBeanDefinition().getQualifier(), koinDefinition.getFactory().getBeanDefinition().getScopeQualifier()), koinDefinition.getFactory());
        return koinDefinition;
    }

    @OptionDslMarker
    @NotNull
    public static final KoinDefinition<?> binds(@NotNull KoinDefinition<?> koinDefinition, @NotNull c[] cVarArr) {
        a.s(koinDefinition, "<this>");
        a.s(cVarArr, "classes");
        BeanDefinition<?> beanDefinition = koinDefinition.getFactory().getBeanDefinition();
        List<c> secondaryTypes = beanDefinition.getSecondaryTypes();
        a.s(secondaryTypes, "<this>");
        ArrayList arrayList = new ArrayList(secondaryTypes.size() + cVarArr.length);
        arrayList.addAll(secondaryTypes);
        t.u0(arrayList, cVarArr);
        beanDefinition.setSecondaryTypes(arrayList);
        for (c cVar : cVarArr) {
            koinDefinition.getModule().saveMapping(BeanDefinitionKt.indexKey(cVar, koinDefinition.getFactory().getBeanDefinition().getQualifier(), koinDefinition.getFactory().getBeanDefinition().getScopeQualifier()), koinDefinition.getFactory());
        }
        return koinDefinition;
    }

    @OptionDslMarker
    @NotNull
    public static final <T> KoinDefinition<T> onClose(@NotNull KoinDefinition<T> koinDefinition, @NotNull l lVar) {
        a.s(koinDefinition, "<this>");
        a.s(lVar, "onClose");
        koinDefinition.getFactory().getBeanDefinition().setCallbacks(new Callbacks<>(lVar));
        return koinDefinition;
    }

    @OptionDslMarker
    public static final <S> KoinDefinition<? extends S> bind(KoinDefinition<? extends S> koinDefinition) {
        a.s(koinDefinition, "<this>");
        a.A0();
        throw null;
    }
}
