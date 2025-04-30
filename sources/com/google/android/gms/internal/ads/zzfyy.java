package com.google.android.gms.internal.ads;

import x0.AbstractC2914a;

/* loaded from: classes2.dex */
final class zzfyy implements zzfyw {
    private static final zzfyw zza = new zzfyw() { // from class: com.google.android.gms.internal.ads.zzfyx
        @Override // com.google.android.gms.internal.ads.zzfyw
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private volatile zzfyw zzb;
    private Object zzc;

    public zzfyy(zzfyw zzfywVar) {
        this.zzb = zzfywVar;
    }

    public final String toString() {
        Object obj = this.zzb;
        if (obj == zza) {
            obj = AbstractC2914a.e("<supplier that returned ", String.valueOf(this.zzc), ">");
        }
        return AbstractC2914a.e("Suppliers.memoize(", String.valueOf(obj), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfyw
    public final Object zza() {
        zzfyw zzfywVar = this.zzb;
        zzfyw zzfywVar2 = zza;
        if (zzfywVar != zzfywVar2) {
            synchronized (this) {
                try {
                    if (this.zzb != zzfywVar2) {
                        Object zza2 = this.zzb.zza();
                        this.zzc = zza2;
                        this.zzb = zzfywVar2;
                        return zza2;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
