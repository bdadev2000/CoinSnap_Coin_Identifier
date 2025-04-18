package com.facebook.login;

import com.facebook.internal.NativeProtocol;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public enum DefaultAudience {
    NONE(null),
    ONLY_ME(NativeProtocol.AUDIENCE_ME),
    FRIENDS(NativeProtocol.AUDIENCE_FRIENDS),
    EVERYONE(NativeProtocol.AUDIENCE_EVERYONE);


    @Nullable
    private final String nativeProtocolAudience;

    DefaultAudience(String str) {
        this.nativeProtocolAudience = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static DefaultAudience[] valuesCustom() {
        DefaultAudience[] valuesCustom = values();
        return (DefaultAudience[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @Nullable
    public final String getNativeProtocolAudience() {
        return this.nativeProtocolAudience;
    }
}
