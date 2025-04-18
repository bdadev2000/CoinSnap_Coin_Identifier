package org.koin.core.error;

import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes2.dex */
public final class NoScopeDefFoundException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoScopeDefFoundException(@NotNull String str) {
        super(str);
        a.s(str, "s");
    }
}
