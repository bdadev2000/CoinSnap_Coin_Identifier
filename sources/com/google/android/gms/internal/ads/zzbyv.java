package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class zzbyv implements zzayv {
    private final Context zza;
    private final Object zzb;
    private final String zzc;
    private boolean zzd;

    public zzbyv(Context context, String str) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = str;
        this.zzd = false;
        this.zzb = new Object();
    }

    public final String zza() {
        return this.zzc;
    }

    public final void zzb(boolean z2) {
        if (com.google.android.gms.ads.internal.zzu.zzn().zzp(this.zza)) {
            synchronized (this.zzb) {
                try {
                    if (this.zzd == z2) {
                        return;
                    }
                    this.zzd = z2;
                    if (TextUtils.isEmpty(this.zzc)) {
                        return;
                    }
                    if (this.zzd) {
                        com.google.android.gms.ads.internal.zzu.zzn().zzf(this.zza, this.zzc);
                    } else {
                        com.google.android.gms.ads.internal.zzu.zzn().zzg(this.zza, this.zzc);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayv
    public final void zzdp(zzayu zzayuVar) {
        zzb(zzayuVar.zzj);
    }
}
