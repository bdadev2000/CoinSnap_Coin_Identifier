package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes2.dex */
final class zzbbi implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzbbm zzb;

    public zzbbi(zzbbm zzbbmVar, View view) {
        this.zza = view;
        this.zzb = zzbbmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc(this.zza);
    }
}
