package com.facebook;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface FacebookCallback<RESULT> {
    void onCancel();

    void onError(@NotNull FacebookException facebookException);

    void onSuccess(RESULT result);
}
