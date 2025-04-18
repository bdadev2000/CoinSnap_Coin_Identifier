package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzbbs;

/* loaded from: classes3.dex */
public final class zzecx implements zzfjs {
    private final zzecl zza;
    private final zzecp zzb;

    public zzecx(zzecl zzeclVar, zzecp zzecpVar) {
        this.zza = zzeclVar;
        this.zzb = zzecpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzd(zzfjl zzfjlVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgc)).booleanValue() && zzfjl.RENDERER == zzfjlVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzdC(zzfjl zzfjlVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzdD(zzfjl zzfjlVar, String str, Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgc)).booleanValue() && zzfjl.RENDERER == zzfjlVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzdE(zzfjl zzfjlVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgc)).booleanValue()) {
            if (zzfjl.RENDERER == zzfjlVar) {
                this.zza.zzg(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime());
                return;
            }
            if (zzfjl.PRELOADED_LOADER != zzfjlVar && zzfjl.SERVER_TRANSACTION != zzfjlVar) {
                return;
            }
            this.zza.zzh(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime());
            final zzecp zzecpVar = this.zzb;
            final long zzd = this.zza.zzd();
            zzecpVar.zza.zza(new zzfiv() { // from class: com.google.android.gms.internal.ads.zzeco
                @Override // com.google.android.gms.internal.ads.zzfiv
                public final Object zza(Object obj) {
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                    if (!zzecp.this.zzf()) {
                        long j3 = zzd;
                        zzbbs.zzaf.zza.C0143zza zzn = zzbbs.zzaf.zza.zzn();
                        zzn.zzP(j3);
                        byte[] zzaV = zzn.zzbr().zzaV();
                        zzecw.zzf(sQLiteDatabase, false, false);
                        zzecw.zzc(sQLiteDatabase, j3, zzaV);
                        return null;
                    }
                    return null;
                }
            });
        }
    }
}
