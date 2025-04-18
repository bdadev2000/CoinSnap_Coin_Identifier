package com.google.android.gms.internal.ads;

import android.content.Context;

@Deprecated
/* loaded from: classes3.dex */
public final class zzlt {
    private final zzip zza;

    @Deprecated
    public zzlt(Context context, zzcep zzcepVar) {
        this.zza = new zzip(context, zzcepVar);
    }

    @Deprecated
    public final zzlt zza(final zzkl zzklVar) {
        zzip zzipVar = this.zza;
        zzdb.zzf(!zzipVar.zzr);
        zzklVar.getClass();
        zzipVar.zzf = new zzfxg() { // from class: com.google.android.gms.internal.ads.zzih
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                return zzkl.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzlt zzb(final zzyj zzyjVar) {
        zzip zzipVar = this.zza;
        zzdb.zzf(!zzipVar.zzr);
        zzyjVar.getClass();
        zzipVar.zze = new zzfxg() { // from class: com.google.android.gms.internal.ads.zzio
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                return zzyj.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzlu zzc() {
        zzip zzipVar = this.zza;
        zzdb.zzf(!zzipVar.zzr);
        zzipVar.zzr = true;
        return new zzlu(zzipVar);
    }
}
