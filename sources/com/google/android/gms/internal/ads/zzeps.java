package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService;

/* loaded from: classes3.dex */
public final class zzeps implements zzevz {
    private static final Object zzb = new Object();
    final Context zza;
    private final String zzc;
    private final String zzd;
    private final long zze;
    private final zzctk zzf;
    private final zzfgw zzg;
    private final zzffo zzh;
    private final com.google.android.gms.ads.internal.util.zzg zzi = com.google.android.gms.ads.internal.zzv.zzp().zzi();
    private final zzdsh zzj;
    private final zzctx zzk;

    public zzeps(Context context, String str, String str2, zzctk zzctkVar, zzfgw zzfgwVar, zzffo zzffoVar, zzdsh zzdshVar, zzctx zzctxVar, long j3) {
        this.zza = context;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = zzctkVar;
        this.zzg = zzfgwVar;
        this.zzh = zzffoVar;
        this.zzj = zzdshVar;
        this.zzk = zzctxVar;
        this.zze = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        String str;
        final Bundle bundle = new Bundle();
        this.zzj.zzb().put("seq_num", this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzci)).booleanValue()) {
            this.zzj.zzc("tsacc", String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - this.zze));
            zzdsh zzdshVar = this.zzj;
            com.google.android.gms.ads.internal.zzv.zzq();
            if (true != com.google.android.gms.ads.internal.util.zzs.zzG(this.zza)) {
                str = "1";
            } else {
                str = "0";
            }
            zzdshVar.zzc(DownloadService.KEY_FOREGROUND, str);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfA)).booleanValue()) {
            this.zzf.zzk(this.zzh.zzd);
            bundle.putAll(this.zzg.zzb());
        }
        return zzgei.zzh(new zzevy() { // from class: com.google.android.gms.internal.ads.zzepr
            @Override // com.google.android.gms.internal.ads.zzevy
            public final void zzj(Object obj) {
                zzeps.this.zzc(bundle, (Bundle) obj);
            }
        });
    }

    public final /* synthetic */ void zzc(Bundle bundle, Bundle bundle2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfA)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfz)).booleanValue()) {
                synchronized (zzb) {
                    this.zzf.zzk(this.zzh.zzd);
                    bundle2.putBundle("quality_signals", this.zzg.zzb());
                }
            } else {
                this.zzf.zzk(this.zzh.zzd);
                bundle2.putBundle("quality_signals", this.zzg.zzb());
            }
        }
        bundle2.putString("seq_num", this.zzc);
        if (!this.zzi.zzN()) {
            bundle2.putString("session_id", this.zzd);
        }
        bundle2.putBoolean("client_purpose_one", !this.zzi.zzN());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfB)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzv.zzq();
                bundle2.putString("_app_id", com.google.android.gms.ads.internal.util.zzs.zzp(this.zza));
            } catch (RemoteException | RuntimeException e2) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "AppStatsSignal_AppId");
            }
        }
        if (this.zzh.zzf != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("dload", this.zzk.zzb(this.zzh.zzf));
            bundle3.putInt("pcc", this.zzk.zza(this.zzh.zzf));
            bundle2.putBundle("ad_unit_quality_signals", bundle3);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjp)).booleanValue() && com.google.android.gms.ads.internal.zzv.zzp().zza() > 0) {
            bundle2.putInt("nrwv", com.google.android.gms.ads.internal.zzv.zzp().zza());
        }
    }
}
