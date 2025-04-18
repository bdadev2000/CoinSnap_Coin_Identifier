package com.google.android.play.core.ktx;

import h0.g;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.google.android.play.core.ktx.AppUpdateManagerKtxKt", f = "AppUpdateManagerKtx.kt", l = {226}, m = "requestAppUpdateInfo")
/* loaded from: classes.dex */
public final class AppUpdateManagerKtxKt$requestAppUpdateInfo$1 extends c {
    int label;
    /* synthetic */ Object result;

    public AppUpdateManagerKtxKt$requestAppUpdateInfo$1(g gVar) {
        super(gVar);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AppUpdateManagerKtxKt.requestAppUpdateInfo(null, this);
    }
}
