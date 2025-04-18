package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzepi implements zzevz {
    private final Executor zza;
    private final zzbzz zzb;

    public zzepi(Executor executor, zzbzz zzbzzVar) {
        this.zza = executor;
        this.zzb = zzbzzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcV)).booleanValue()) {
            return zzgei.zzh(null);
        }
        return zzgei.zzm(this.zzb.zzk(), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzeph
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new zzepj(arrayList);
            }
        }, this.zza);
    }
}
