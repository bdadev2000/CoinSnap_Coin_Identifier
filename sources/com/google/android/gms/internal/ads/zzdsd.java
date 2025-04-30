package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
public final class zzdsd {
    private final zzchq zza;
    private final Context zzb;
    private final zzaxd zzc;
    private final zzbfs zzd;
    private final VersionInfoParcel zze;
    private final com.google.android.gms.ads.internal.zza zzf;
    private final zzbdm zzg;
    private final zzdca zzh;
    private final zzegk zzi;
    private final zzfhs zzj;

    public zzdsd(zzchq zzchqVar, Context context, zzaxd zzaxdVar, zzbfs zzbfsVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbdm zzbdmVar, zzdca zzdcaVar, zzegk zzegkVar, zzfhs zzfhsVar) {
        this.zza = zzchqVar;
        this.zzb = context;
        this.zzc = zzaxdVar;
        this.zzd = zzbfsVar;
        this.zze = versionInfoParcel;
        this.zzf = zzaVar;
        this.zzg = zzbdmVar;
        this.zzh = zzdcaVar;
        this.zzi = zzegkVar;
        this.zzj = zzfhsVar;
    }

    public final zzchd zza(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfgt zzfgtVar, zzfgw zzfgwVar) throws zzchp {
        zzcix zzc = zzcix.zzc(zzqVar);
        String str = zzqVar.zza;
        zzdrs zzdrsVar = new zzdrs(this);
        zzegk zzegkVar = this.zzi;
        zzfhs zzfhsVar = this.zzj;
        com.google.android.gms.ads.internal.zza zzaVar = this.zzf;
        zzbdm zzbdmVar = this.zzg;
        return zzchq.zza(this.zzb, zzc, str, false, false, this.zzc, this.zzd, this.zze, null, zzdrsVar, zzaVar, zzbdmVar, zzfgtVar, zzfgwVar, zzegkVar, zzfhsVar);
    }
}
