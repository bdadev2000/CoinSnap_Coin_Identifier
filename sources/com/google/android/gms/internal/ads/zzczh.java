package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
public final class zzczh implements zzhkp {
    private final zzczg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;

    public zzczh(zzczg zzczgVar, zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4) {
        this.zza = zzczgVar;
        this.zzb = zzhlgVar;
        this.zzc = zzhlgVar2;
        this.zzd = zzhlgVar3;
        this.zze = zzhlgVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    @Nullable
    public final /* synthetic */ Object zzb() {
        String str;
        Context context = (Context) this.zzb.zzb();
        VersionInfoParcel zza = ((zzcjv) this.zzc).zza();
        zzfgt zza2 = ((zzcvg) this.zzd).zza();
        zzcab zzcabVar = new zzcab();
        zzcac zzcacVar = zza2.zzB;
        if (zzcacVar == null) {
            return null;
        }
        zzfgy zzfgyVar = zza2.zzt;
        if (zzfgyVar == null) {
            str = null;
        } else {
            str = zzfgyVar.zzb;
        }
        return new zzcaa(context, zza, zzcacVar, str, zzcabVar);
    }
}
