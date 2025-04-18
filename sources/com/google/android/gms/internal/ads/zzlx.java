package com.google.android.gms.internal.ads;

import android.content.Context;

@Deprecated
/* loaded from: classes3.dex */
public final class zzlx {
    private final zzis zza;

    @Deprecated
    public zzlx(Context context, zzcet zzcetVar) {
        this.zza = new zzis(context, zzcetVar);
    }

    @Deprecated
    public final zzlx zza(final zzko zzkoVar) {
        zzis zzisVar = this.zza;
        zzdi.zzf(!zzisVar.zzr);
        zzkoVar.getClass();
        zzisVar.zzf = new zzfyp() { // from class: com.google.android.gms.internal.ads.zzik
            @Override // com.google.android.gms.internal.ads.zzfyp
            public final Object zza() {
                return zzko.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzlx zzb(final zzyr zzyrVar) {
        zzis zzisVar = this.zza;
        zzdi.zzf(!zzisVar.zzr);
        zzyrVar.getClass();
        zzisVar.zze = new zzfyp() { // from class: com.google.android.gms.internal.ads.zzir
            @Override // com.google.android.gms.internal.ads.zzfyp
            public final Object zza() {
                return zzyr.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzly zzc() {
        zzis zzisVar = this.zza;
        zzdi.zzf(!zzisVar.zzr);
        zzisVar.zzr = true;
        return new zzly(zzisVar);
    }
}
