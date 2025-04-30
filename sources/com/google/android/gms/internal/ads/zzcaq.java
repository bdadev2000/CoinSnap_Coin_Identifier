package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class zzcaq implements zzban {
    private final Context zza;
    private final Object zzb;
    private final String zzc;
    private boolean zzd;

    public zzcaq(Context context, String str) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = str;
        this.zzd = false;
        this.zzb = new Object();
    }

    public final String zza() {
        return this.zzc;
    }

    public final void zzb(boolean z8) {
        if (!com.google.android.gms.ads.internal.zzu.zzn().zzp(this.zza)) {
            return;
        }
        synchronized (this.zzb) {
            try {
                if (this.zzd == z8) {
                    return;
                }
                this.zzd = z8;
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

    @Override // com.google.android.gms.internal.ads.zzban
    public final void zzdp(zzbam zzbamVar) {
        zzb(zzbamVar.zzj);
    }
}
