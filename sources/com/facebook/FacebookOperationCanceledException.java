package com.facebook;

import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class FacebookOperationCanceledException extends FacebookException {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final long serialVersionUID = 1;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public FacebookOperationCanceledException() {
    }

    public FacebookOperationCanceledException(@Nullable String str) {
        super(str);
    }

    public FacebookOperationCanceledException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }

    public FacebookOperationCanceledException(@Nullable Throwable th) {
        super(th);
    }
}
