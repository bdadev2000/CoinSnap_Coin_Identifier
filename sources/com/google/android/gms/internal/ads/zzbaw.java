package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* loaded from: classes4.dex */
public final class zzbaw {
    private com.google.android.gms.ads.internal.client.zzby zza;
    private final Context zzb;
    private final String zzc;
    private final com.google.android.gms.ads.internal.client.zzei zzd;

    @AppOpenAd.AppOpenAdOrientation
    private final int zze;
    private final AppOpenAd.AppOpenAdLoadCallback zzf;
    private final zzbph zzg = new zzbph();
    private final com.google.android.gms.ads.internal.client.zzr zzh = com.google.android.gms.ads.internal.client.zzr.zza;

    public zzbaw(Context context, String str, com.google.android.gms.ads.internal.client.zzei zzeiVar, @AppOpenAd.AppOpenAdOrientation int i2, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.zzb = context;
        this.zzc = str;
        this.zzd = zzeiVar;
        this.zze = i2;
        this.zzf = appOpenAdLoadCallback;
    }

    public final void zza() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            com.google.android.gms.ads.internal.client.zzby zze = com.google.android.gms.ads.internal.client.zzbc.zza().zze(this.zzb, com.google.android.gms.ads.internal.client.zzs.zzb(), this.zzc, this.zzg);
            this.zza = zze;
            if (zze != null) {
                if (this.zze != 3) {
                    this.zza.zzI(new com.google.android.gms.ads.internal.client.zzy(this.zze));
                }
                this.zzd.zzq(currentTimeMillis);
                this.zza.zzH(new zzbaj(this.zzf, this.zzc));
                this.zza.zzab(this.zzh.zza(this.zzb, this.zzd));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }
}
