package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzedo implements zzgee {
    final /* synthetic */ zzfiv zza;

    public zzedo(zzedp zzedpVar, zzfiv zzfivVar) {
        this.zza = zzfivVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to get offline buffered ping database: ".concat(String.valueOf(th2.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Error executing function on offline buffered ping database: ".concat(String.valueOf(e2.getMessage())));
        }
    }
}
