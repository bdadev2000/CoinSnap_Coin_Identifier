package com.google.android.gms.internal.ads;

import android.content.Context;

@Deprecated
/* loaded from: classes2.dex */
public final class zzms {
    private final zzjq zza;

    @Deprecated
    public zzms(Context context, zzcgn zzcgnVar) {
        this.zza = new zzjq(context, zzcgnVar);
    }

    @Deprecated
    public final zzms zza(final zzlk zzlkVar) {
        zzjq zzjqVar = this.zza;
        zzeq.zzf(!zzjqVar.zzq);
        zzlkVar.getClass();
        zzjqVar.zzf = new zzfyw() { // from class: com.google.android.gms.internal.ads.zzji
            @Override // com.google.android.gms.internal.ads.zzfyw
            public final Object zza() {
                return zzlk.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzms zzb(final zzzm zzzmVar) {
        zzjq zzjqVar = this.zza;
        zzeq.zzf(!zzjqVar.zzq);
        zzzmVar.getClass();
        zzjqVar.zze = new zzfyw() { // from class: com.google.android.gms.internal.ads.zzjp
            @Override // com.google.android.gms.internal.ads.zzfyw
            public final Object zza() {
                return zzzm.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzmt zzc() {
        zzjq zzjqVar = this.zza;
        zzeq.zzf(!zzjqVar.zzq);
        zzjqVar.zzq = true;
        return new zzmt(zzjqVar);
    }
}
