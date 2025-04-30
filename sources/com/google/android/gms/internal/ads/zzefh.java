package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzbdv;

/* loaded from: classes2.dex */
public final class zzefh implements zzflu {
    private final zzeev zza;
    private final zzeez zzb;

    public zzefh(zzeev zzeevVar, zzeez zzeezVar) {
        this.zza = zzeevVar;
        this.zzb = zzeezVar;
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zzd(zzfln zzflnVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgs)).booleanValue() && zzfln.RENDERER == zzflnVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zzdC(zzfln zzflnVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zzdD(zzfln zzflnVar, String str, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgs)).booleanValue() && zzfln.RENDERER == zzflnVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zzdE(zzfln zzflnVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgs)).booleanValue()) {
            if (zzfln.RENDERER == zzflnVar) {
                this.zza.zzg(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime());
                return;
            }
            if (zzfln.PRELOADED_LOADER != zzflnVar && zzfln.SERVER_TRANSACTION != zzflnVar) {
                return;
            }
            this.zza.zzh(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime());
            final zzeez zzeezVar = this.zzb;
            final long zzd = this.zza.zzd();
            zzeezVar.zza.zza(new zzfkw() { // from class: com.google.android.gms.internal.ads.zzeey
                @Override // com.google.android.gms.internal.ads.zzfkw
                public final Object zza(Object obj) {
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                    if (!zzeez.this.zzf()) {
                        long j7 = zzd;
                        zzbdv.zzaf.zza.C0131zza zzn = zzbdv.zzaf.zza.zzn();
                        zzn.zzP(j7);
                        byte[] zzaV = zzn.zzbr().zzaV();
                        zzefg.zzf(sQLiteDatabase, false, false);
                        zzefg.zzc(sQLiteDatabase, j7, zzaV);
                        return null;
                    }
                    return null;
                }
            });
        }
    }
}
