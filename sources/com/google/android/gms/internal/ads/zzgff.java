package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes2.dex */
public class zzgff extends zzgfp {
    public static zzgff zzu(ListenableFuture listenableFuture) {
        return listenableFuture instanceof zzgff ? (zzgff) listenableFuture : new zzgfg(listenableFuture);
    }
}
