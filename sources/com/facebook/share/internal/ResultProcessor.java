package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.internal.AppCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class ResultProcessor {

    @Nullable
    private final FacebookCallback<?> appCallback;

    public ResultProcessor(@Nullable FacebookCallback<?> facebookCallback) {
        this.appCallback = facebookCallback;
    }

    public void onCancel(@NotNull AppCall appCall) {
        p0.a.s(appCall, "appCall");
        FacebookCallback<?> facebookCallback = this.appCallback;
        if (facebookCallback == null) {
            return;
        }
        facebookCallback.onCancel();
    }

    public void onError(@NotNull AppCall appCall, @NotNull FacebookException facebookException) {
        p0.a.s(appCall, "appCall");
        p0.a.s(facebookException, "error");
        FacebookCallback<?> facebookCallback = this.appCallback;
        if (facebookCallback == null) {
            return;
        }
        facebookCallback.onError(facebookException);
    }

    public abstract void onSuccess(@NotNull AppCall appCall, @Nullable Bundle bundle);
}
