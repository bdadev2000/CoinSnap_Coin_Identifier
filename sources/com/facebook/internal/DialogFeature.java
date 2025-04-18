package com.facebook.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public interface DialogFeature {

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void name$annotations() {
        }
    }

    @NotNull
    String getAction();

    int getMinVersion();

    @NotNull
    String name();
}
