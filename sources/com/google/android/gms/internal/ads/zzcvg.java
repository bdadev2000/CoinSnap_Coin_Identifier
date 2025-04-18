package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes3.dex */
public final class zzcvg implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;

    public zzcvg(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final VersionInfoParcel zza = ((zzcid) this.zzb).zza();
        final zzffo zza2 = ((zzcwd) this.zzc).zza();
        return new zzfwh() { // from class: com.google.android.gms.internal.ads.zzcvf
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                zzfet zzfetVar = (zzfet) obj;
                com.google.android.gms.ads.internal.util.zzat zzatVar = new com.google.android.gms.ads.internal.util.zzat(context);
                zzatVar.zzp(zzfetVar.zzB);
                zzatVar.zzq(zzfetVar.zzC.toString());
                zzatVar.zzo(zza.afmaVersion);
                zzatVar.zzn(zza2.zzf);
                return zzatVar;
            }
        };
    }
}
