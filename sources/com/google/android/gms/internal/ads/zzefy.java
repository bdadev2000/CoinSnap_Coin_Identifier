package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzefy implements zzgfp {
    final /* synthetic */ zzfkw zza;

    public zzefy(zzefz zzefzVar, zzfkw zzfkwVar) {
        this.zza = zzfkwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Error executing function on offline buffered ping database: ".concat(String.valueOf(e4.getMessage())));
        }
    }
}
