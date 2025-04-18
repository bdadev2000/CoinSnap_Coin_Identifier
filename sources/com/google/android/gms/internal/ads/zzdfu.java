package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes3.dex */
public final class zzdfu implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;

    public zzdfu(zzdfn zzdfnVar, zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
        this.zzd = zzhgpVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final VersionInfoParcel zza = ((zzcid) this.zzb).zza();
        final zzfet zza2 = ((zzcsh) this.zzc).zza();
        final zzffo zza3 = ((zzcwd) this.zzd).zza();
        return new zzded(new zzcya() { // from class: com.google.android.gms.internal.ads.zzdfl
            @Override // com.google.android.gms.internal.ads.zzcya
            public final void zzs() {
                com.google.android.gms.ads.internal.util.zzax zzt = com.google.android.gms.ads.internal.zzv.zzt();
                Context context2 = context;
                zzffo zzffoVar = zza3;
                zzt.zzn(context2, zza.afmaVersion, zza2.zzC.toString(), zzffoVar.zzf);
            }
        }, zzcaj.zzf);
    }
}
