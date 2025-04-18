package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfys implements zzfyp {
    private static final zzfyp zza = new zzfyp() { // from class: com.google.android.gms.internal.ads.zzfyr
        @Override // com.google.android.gms.internal.ads.zzfyp
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private final zzfyw zzb = new zzfyw();
    private volatile zzfyp zzc;
    private Object zzd;

    public zzfys(zzfyp zzfypVar) {
        this.zzc = zzfypVar;
    }

    public final String toString() {
        Object obj = this.zzc;
        if (obj == zza) {
            obj = androidx.compose.foundation.text.input.a.A("<supplier that returned ", String.valueOf(this.zzd), ">");
        }
        return androidx.compose.foundation.text.input.a.A("Suppliers.memoize(", String.valueOf(obj), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfyp
    public final Object zza() {
        zzfyp zzfypVar = this.zzc;
        zzfyp zzfypVar2 = zza;
        if (zzfypVar != zzfypVar2) {
            synchronized (this.zzb) {
                try {
                    if (this.zzc != zzfypVar2) {
                        Object zza2 = this.zzc.zza();
                        this.zzd = zza2;
                        this.zzc = zzfypVar2;
                        return zza2;
                    }
                } finally {
                }
            }
        }
        return this.zzd;
    }
}
