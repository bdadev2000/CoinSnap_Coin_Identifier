package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes3.dex */
final class zzecg implements zzgee {
    final /* synthetic */ zzfiv zza;

    public zzecg(zzech zzechVar, zzfiv zzfivVar) {
        this.zza = zzfivVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to get offline signal database: ".concat(String.valueOf(th2.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Error executing function on offline signal database: ".concat(String.valueOf(e2.getMessage())));
        }
    }
}
