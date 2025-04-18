package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes3.dex */
final class zzazh implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzazl zzb;

    public zzazh(zzazl zzazlVar, View view) {
        this.zza = view;
        this.zzb = zzazlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
