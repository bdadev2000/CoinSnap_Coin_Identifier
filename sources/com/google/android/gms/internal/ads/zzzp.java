package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzzp {
    private final Context zza;
    private final zzaap zzb;
    private zzcf zzc;
    private zzbq zzd;
    private zzdc zze = zzdc.zza;
    private boolean zzf;

    public zzzp(Context context, zzaap zzaapVar) {
        this.zza = context.getApplicationContext();
        this.zzb = zzaapVar;
    }

    public final zzzp zzd(zzdc zzdcVar) {
        this.zze = zzdcVar;
        return this;
    }

    public final zzaaa zze() {
        zzdb.zzf(!this.zzf);
        zzzz zzzzVar = null;
        if (this.zzd == null) {
            if (this.zzc == null) {
                this.zzc = new zzzt(zzzzVar);
            }
            this.zzd = new zzzu(this.zzc);
        }
        zzaaa zzaaaVar = new zzaaa(this, zzzzVar);
        this.zzf = true;
        return zzaaaVar;
    }
}
