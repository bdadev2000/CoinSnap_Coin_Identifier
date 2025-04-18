package org.koin.core.qualifier;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes4.dex */
public final class StringQualifier implements Qualifier {

    @NotNull
    private final String value;

    public StringQualifier(@NotNull String str) {
        a.s(str, "value");
        this.value = str;
    }

    public static /* synthetic */ StringQualifier copy$default(StringQualifier stringQualifier, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = stringQualifier.value;
        }
        return stringQualifier.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.value;
    }

    @NotNull
    public final StringQualifier copy(@NotNull String str) {
        a.s(str, "value");
        return new StringQualifier(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StringQualifier) && a.g(this.value, ((StringQualifier) obj).value);
    }

    @Override // org.koin.core.qualifier.Qualifier
    @NotNull
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return getValue();
    }
}
