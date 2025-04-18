package org.koin.core.error;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import d0.a;
import org.jetbrains.annotations.NotNull;

@a
/* loaded from: classes.dex */
public final class NoBeanDefFoundException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoBeanDefFoundException(@NotNull String str) {
        super(str);
        p0.a.s(str, SDKConstants.PARAM_DEBUG_MESSAGE);
    }
}
