package org.koin.core.qualifier;

import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes2.dex */
public final class QualifierKt {
    @NotNull
    public static final StringQualifier _q(@NotNull String str) {
        a.s(str, "name");
        return new StringQualifier(str);
    }

    @NotNull
    public static final <E extends Enum<E>> Qualifier getQualifier(@NotNull Enum<E> r2) {
        a.s(r2, "<this>");
        String lowerCase = r2.toString().toLowerCase();
        a.r(lowerCase, "toLowerCase(...)");
        return new StringQualifier(lowerCase);
    }

    @NotNull
    public static final StringQualifier named(@NotNull String str) {
        a.s(str, "name");
        return new StringQualifier(str);
    }

    @NotNull
    public static final StringQualifier qualifier(@NotNull String str) {
        a.s(str, "name");
        return new StringQualifier(str);
    }

    public static final <T> TypeQualifier _q() {
        a.A0();
        throw null;
    }

    @NotNull
    public static final <E extends Enum<E>> Qualifier named(@NotNull Enum<E> r1) {
        a.s(r1, "enum");
        return getQualifier(r1);
    }

    @NotNull
    public static final <E extends Enum<E>> Qualifier qualifier(@NotNull Enum<E> r1) {
        a.s(r1, "enum");
        return getQualifier(r1);
    }

    public static final <T> TypeQualifier named() {
        a.A0();
        throw null;
    }

    public static final <T> TypeQualifier qualifier() {
        a.A0();
        throw null;
    }
}
