package org.koin.core.qualifier;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.ext.KClassExtKt;
import p0.a;
import x0.c;

/* loaded from: classes4.dex */
public final class TypeQualifier implements Qualifier {

    @NotNull
    private final c type;

    @NotNull
    private final String value;

    public TypeQualifier(@NotNull c cVar) {
        a.s(cVar, "type");
        this.type = cVar;
        this.value = KClassExtKt.getFullName(cVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && TypeQualifier.class == obj.getClass() && a.g(getValue(), ((TypeQualifier) obj).getValue());
    }

    @NotNull
    public final c getType() {
        return this.type;
    }

    @Override // org.koin.core.qualifier.Qualifier
    @NotNull
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    @NotNull
    public String toString() {
        return "q:'" + getValue() + '\'';
    }
}
