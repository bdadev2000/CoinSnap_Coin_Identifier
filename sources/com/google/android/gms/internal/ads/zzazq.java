package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes4.dex */
final class zzazq implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzazu zzb;

    public zzazq(zzazu zzazuVar, View view) {
        this.zza = view;
        this.zzb = zzazuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc(this.zza);
    }
}
