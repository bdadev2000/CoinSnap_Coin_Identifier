package org.koin.core.error;

import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes4.dex */
public final class ScopeAlreadyCreatedException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopeAlreadyCreatedException(@NotNull String str) {
        super(str);
        a.s(str, "s");
    }
}
