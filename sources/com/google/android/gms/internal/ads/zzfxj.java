package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.ads.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfxj implements zzfxg {
    private static final zzfxg zza = new zzfxg() { // from class: com.google.android.gms.internal.ads.zzfxi
        @Override // com.google.android.gms.internal.ads.zzfxg
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private final zzfxn zzb = new zzfxn();
    private volatile zzfxg zzc;
    private Object zzd;

    public zzfxj(zzfxg zzfxgVar) {
        this.zzc = zzfxgVar;
    }

    public final String toString() {
        Object obj = this.zzc;
        if (obj == zza) {
            obj = e.f("<supplier that returned ", String.valueOf(this.zzd), ">");
        }
        return e.f("Suppliers.memoize(", String.valueOf(obj), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final Object zza() {
        zzfxg zzfxgVar = this.zzc;
        zzfxg zzfxgVar2 = zza;
        if (zzfxgVar != zzfxgVar2) {
            synchronized (this.zzb) {
                if (this.zzc != zzfxgVar2) {
                    Object zza2 = this.zzc.zza();
                    this.zzd = zza2;
                    this.zzc = zzfxgVar2;
                    return zza2;
                }
            }
        }
        return this.zzd;
    }
}
