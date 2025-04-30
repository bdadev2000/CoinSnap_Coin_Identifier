package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzaar {
    private final Context zza;
    private zzdr zzb;
    private zzcu zzc;
    private boolean zzd;

    public zzaar(Context context) {
        this.zza = context.getApplicationContext();
    }

    public final zzabc zzc() {
        zzeq.zzf(!this.zzd);
        zzabb zzabbVar = null;
        if (this.zzc == null) {
            if (this.zzb == null) {
                this.zzb = new zzaav(null);
            }
            this.zzc = new zzaaw(this.zzb);
        }
        zzabc zzabcVar = new zzabc(this, zzabbVar);
        this.zzd = true;
        return zzabcVar;
    }
}
