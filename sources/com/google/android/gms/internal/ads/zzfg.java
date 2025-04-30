package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfg {
    public final Object zza;
    private zzaf zzb = new zzaf();
    private boolean zzc;
    private boolean zzd;

    public zzfg(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfg.class == obj.getClass()) {
            return this.zza.equals(((zzfg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i9, zzfe zzfeVar) {
        if (!this.zzd) {
            if (i9 != -1) {
                this.zzb.zza(i9);
            }
            this.zzc = true;
            zzfeVar.zza(this.zza);
        }
    }

    public final void zzb(zzff zzffVar) {
        if (!this.zzd && this.zzc) {
            zzah zzb = this.zzb.zzb();
            this.zzb = new zzaf();
            this.zzc = false;
            zzffVar.zza(this.zza, zzb);
        }
    }

    public final void zzc(zzff zzffVar) {
        this.zzd = true;
        if (this.zzc) {
            this.zzc = false;
            zzffVar.zza(this.zza, this.zzb.zzb());
        }
    }
}
