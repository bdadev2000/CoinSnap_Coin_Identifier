package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes3.dex */
public final class zzcwi implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;

    public zzcwi(zzcwh zzcwhVar, zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        String str;
        Context context = (Context) this.zza.zzb();
        VersionInfoParcel zza = ((zzcid) this.zzb).zza();
        zzfet zza2 = ((zzcsh) this.zzc).zza();
        zzbyd zzbydVar = new zzbyd();
        zzbye zzbyeVar = zza2.zzA;
        if (zzbyeVar == null) {
            return null;
        }
        zzfey zzfeyVar = zza2.zzs;
        if (zzfeyVar == null) {
            str = null;
        } else {
            str = zzfeyVar.zzb;
        }
        return new zzbyc(context, zza, zzbyeVar, str, zzbydVar);
    }
}
