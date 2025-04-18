package org.koin.android.error;

import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes2.dex */
public final class MissingAndroidContextException extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingAndroidContextException(@NotNull String str) {
        super(str);
        a.s(str, "s");
    }
}
