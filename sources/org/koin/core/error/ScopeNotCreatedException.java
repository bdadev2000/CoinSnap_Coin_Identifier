package org.koin.core.error;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes2.dex */
public final class ScopeNotCreatedException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopeNotCreatedException(@NotNull String str) {
        super(str);
        a.s(str, SDKConstants.PARAM_DEBUG_MESSAGE);
    }
}
