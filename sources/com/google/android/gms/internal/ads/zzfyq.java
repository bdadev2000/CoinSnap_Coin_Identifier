package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfyq implements Serializable, zzfyp {
    final zzfyp zza;
    volatile transient boolean zzb;
    transient Object zzc;
    private final zzfyw zzd = new zzfyw();

    public zzfyq(zzfyp zzfypVar) {
        this.zza = zzfypVar;
    }

    public final String toString() {
        return androidx.compose.foundation.text.input.a.A("Suppliers.memoize(", (this.zzb ? androidx.compose.foundation.text.input.a.A("<supplier that returned ", String.valueOf(this.zzc), ">") : this.zza).toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfyp
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
                try {
                    if (!this.zzb) {
                        Object zza = this.zza.zza();
                        this.zzc = zza;
                        this.zzb = true;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
