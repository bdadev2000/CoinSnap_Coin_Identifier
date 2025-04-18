package com.facebook;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public interface LoginStatusCallback {
    void onCompleted(@NotNull AccessToken accessToken);

    void onError(@NotNull Exception exc);

    void onFailure();
}
