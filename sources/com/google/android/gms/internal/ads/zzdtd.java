package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbcb;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzdtd implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;
    private final zzhja zzc;

    public zzdtd(zzhja zzhjaVar, zzhja zzhjaVar2, zzhja zzhjaVar3, zzhja zzhjaVar4) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
        this.zzc = zzhjaVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        final String str = (String) this.zza.zzb();
        Context zza = ((zzchu) this.zzb).zza();
        zzgfz zzc = zzfkb.zzc();
        Map zzb = ((zzhim) this.zzc).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeO)).booleanValue()) {
            zzbbu zzbbuVar = new zzbbu(new zzbca(zza));
            zzbbuVar.zzb(new zzbbt() { // from class: com.google.android.gms.internal.ads.zzdte
                @Override // com.google.android.gms.internal.ads.zzbbt
                public final void zza(zzbcb.zzt.zza zzaVar) {
                    zzaVar.zzO(str);
                }
            });
            emptySet = Collections.singleton(new zzdfs(new zzdtg(zzbbuVar, zzb), zzc));
        } else {
            emptySet = Collections.emptySet();
        }
        zzhiq.zzb(emptySet);
        return emptySet;
    }
}
