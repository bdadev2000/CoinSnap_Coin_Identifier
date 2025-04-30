package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzir {
    private final Context zza;
    private final zzip zzb;

    public zzir(Context context, Handler handler, zziq zziqVar) {
        this.zza = context.getApplicationContext();
        this.zzb = new zzip(this, handler, zziqVar);
    }
}
