package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.ads.e;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfxh implements Serializable, zzfxg {
    final zzfxg zza;
    volatile transient boolean zzb;
    transient Object zzc;
    private final transient zzfxn zzd = new zzfxn();

    public zzfxh(zzfxg zzfxgVar) {
        this.zza = zzfxgVar;
    }

    public final String toString() {
        Object obj;
        if (this.zzb) {
            obj = e.f("<supplier that returned ", String.valueOf(this.zzc), ">");
        } else {
            obj = this.zza;
        }
        return e.f("Suppliers.memoize(", obj.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
                if (!this.zzb) {
                    Object zza = this.zza.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
