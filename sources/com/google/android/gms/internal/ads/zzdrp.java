package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
public final class zzdrp implements zzfjs {
    private final Map zza;
    private final zzbbl zzb;

    public zzdrp(zzbbl zzbblVar, Map map) {
        this.zza = map;
        this.zzb = zzbblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzd(zzfjl zzfjlVar, String str) {
        if (this.zza.containsKey(zzfjlVar)) {
            this.zzb.zzc(((zzdro) this.zza.get(zzfjlVar)).zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzdC(zzfjl zzfjlVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzdD(zzfjl zzfjlVar, String str, Throwable th2) {
        if (this.zza.containsKey(zzfjlVar)) {
            this.zzb.zzc(((zzdro) this.zza.get(zzfjlVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzdE(zzfjl zzfjlVar, String str) {
        if (this.zza.containsKey(zzfjlVar)) {
            this.zzb.zzc(((zzdro) this.zza.get(zzfjlVar)).zza);
        }
    }
}
