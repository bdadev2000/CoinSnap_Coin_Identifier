package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
public final class zzcyf implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzcyf(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final VersionInfoParcel zza = ((zzcjv) this.zzb).zza();
        final zzfho zza2 = ((zzczc) this.zzc).zza();
        return new zzfxu() { // from class: com.google.android.gms.internal.ads.zzcye
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                zzfgt zzfgtVar = (zzfgt) obj;
                com.google.android.gms.ads.internal.util.zzau zzauVar = new com.google.android.gms.ads.internal.util.zzau(context);
                zzauVar.zzp(zzfgtVar.zzC);
                zzauVar.zzq(zzfgtVar.zzD.toString());
                zzauVar.zzo(zza.afmaVersion);
                zzauVar.zzn(zza2.zzf);
                return zzauVar;
            }
        };
    }
}
