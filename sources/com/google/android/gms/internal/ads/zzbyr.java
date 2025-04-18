package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class zzbyr implements zzaym {
    private final Context zza;
    private final Object zzb;
    private final String zzc;
    private boolean zzd;

    public zzbyr(Context context, String str) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = str;
        this.zzd = false;
        this.zzb = new Object();
    }

    public final String zza() {
        return this.zzc;
    }

    public final void zzb(boolean z10) {
        if (!com.google.android.gms.ads.internal.zzv.zzo().zzp(this.zza)) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzd == z10) {
                return;
            }
            this.zzd = z10;
            if (TextUtils.isEmpty(this.zzc)) {
                return;
            }
            if (this.zzd) {
                com.google.android.gms.ads.internal.zzv.zzo().zzf(this.zza, this.zzc);
            } else {
                com.google.android.gms.ads.internal.zzv.zzo().zzg(this.zza, this.zzc);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final void zzdp(zzayl zzaylVar) {
        zzb(zzaylVar.zzj);
    }
}
