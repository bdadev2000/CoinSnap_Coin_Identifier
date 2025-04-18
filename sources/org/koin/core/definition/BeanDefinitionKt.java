package org.koin.core.definition;

import e0.w;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.qualifier.Qualifier;
import org.koin.ext.KClassExtKt;
import p0.a;
import q0.p;
import x0.c;

/* loaded from: classes4.dex */
public final class BeanDefinitionKt {
    public static final <T> BeanDefinition<T> _createDefinition(Kind kind, Qualifier qualifier, p pVar, List<? extends c> list, Qualifier qualifier2) {
        a.s(kind, "kind");
        a.s(pVar, "definition");
        a.s(list, "secondaryTypes");
        a.s(qualifier2, "scopeQualifier");
        a.A0();
        throw null;
    }

    public static BeanDefinition _createDefinition$default(Kind kind, Qualifier qualifier, p pVar, List list, Qualifier qualifier2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            kind = Kind.Singleton;
        }
        if ((i2 & 8) != 0) {
            list = w.f30218a;
        }
        a.s(kind, "kind");
        a.s(pVar, "definition");
        a.s(list, "secondaryTypes");
        a.s(qualifier2, "scopeQualifier");
        a.A0();
        throw null;
    }

    @NotNull
    public static final String indexKey(@NotNull c cVar, @Nullable Qualifier qualifier, @NotNull Qualifier qualifier2) {
        String str;
        a.s(cVar, "clazz");
        a.s(qualifier2, "scopeQualifier");
        if (qualifier == null || (str = qualifier.getValue()) == null) {
            str = "";
        }
        return KClassExtKt.getFullName(cVar) + ':' + str + ':' + qualifier2;
    }
}
