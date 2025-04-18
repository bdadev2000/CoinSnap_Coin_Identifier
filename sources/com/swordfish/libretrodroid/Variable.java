package com.swordfish.libretrodroid;

import android.support.v4.media.d;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class Variable {

    @Nullable
    private final String description;

    @Nullable
    private final String key;

    @Nullable
    private final String value;

    public Variable() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Variable copy$default(Variable variable, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = variable.key;
        }
        if ((i2 & 2) != 0) {
            str2 = variable.value;
        }
        if ((i2 & 4) != 0) {
            str3 = variable.description;
        }
        return variable.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.key;
    }

    @Nullable
    public final String component2() {
        return this.value;
    }

    @Nullable
    public final String component3() {
        return this.description;
    }

    @NotNull
    public final Variable copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new Variable(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Variable)) {
            return false;
        }
        Variable variable = (Variable) obj;
        return p0.a.g(this.key, variable.key) && p0.a.g(this.value, variable.value) && p0.a.g(this.description, variable.description);
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.key;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Variable(key=");
        sb.append(this.key);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", description=");
        return d.q(sb, this.description, ')');
    }

    public Variable(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.key = str;
        this.value = str2;
        this.description = str3;
    }

    public /* synthetic */ Variable(String str, String str2, String str3, int i2, k kVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3);
    }
}
