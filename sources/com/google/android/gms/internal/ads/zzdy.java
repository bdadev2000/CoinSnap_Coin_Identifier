package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdy {
    public final Object zza;
    private zzz zzb = new zzz();
    private boolean zzc;
    private boolean zzd;

    public zzdy(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzdy.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzdy) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i2, zzdw zzdwVar) {
        if (this.zzd) {
            return;
        }
        if (i2 != -1) {
            this.zzb.zza(i2);
        }
        this.zzc = true;
        zzdwVar.zza(this.zza);
    }

    public final void zzb(zzdx zzdxVar) {
        if (this.zzd || !this.zzc) {
            return;
        }
        zzab zzb = this.zzb.zzb();
        this.zzb = new zzz();
        this.zzc = false;
        zzdxVar.zza(this.zza, zzb);
    }

    public final void zzc(zzdx zzdxVar) {
        this.zzd = true;
        if (this.zzc) {
            this.zzc = false;
            zzdxVar.zza(this.zza, this.zzb.zzb());
        }
    }
}
