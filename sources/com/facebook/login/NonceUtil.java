package com.facebook.login;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z0.m;

/* loaded from: classes2.dex */
public final class NonceUtil {

    @NotNull
    public static final NonceUtil INSTANCE = new NonceUtil();

    private NonceUtil() {
    }

    public static final boolean isValidNonce(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return !(m.W0(str, ' ', 0, false, 6) >= 0);
    }
}
