package com.facebook;

import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class FacebookAuthorizationException extends FacebookException {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final long serialVersionUID = 1;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public FacebookAuthorizationException() {
    }

    public FacebookAuthorizationException(@Nullable String str) {
        super(str);
    }

    public FacebookAuthorizationException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }

    public FacebookAuthorizationException(@Nullable Throwable th) {
        super(th);
    }
}
