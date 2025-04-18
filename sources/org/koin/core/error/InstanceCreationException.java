package org.koin.core.error;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes.dex */
public final class InstanceCreationException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstanceCreationException(@NotNull String str, @NotNull Exception exc) {
        super(str, exc);
        a.s(str, SDKConstants.PARAM_DEBUG_MESSAGE);
        a.s(exc, "parent");
    }
}
