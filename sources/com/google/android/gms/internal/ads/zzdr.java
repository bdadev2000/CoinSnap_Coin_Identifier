package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdr {
    public final Object zza;
    private zzx zzb = new zzx();
    private boolean zzc;
    private boolean zzd;

    public zzdr(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzdr.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzdr) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i10, zzdp zzdpVar) {
        if (!this.zzd) {
            if (i10 != -1) {
                this.zzb.zza(i10);
            }
            this.zzc = true;
            zzdpVar.zza(this.zza);
        }
    }

    public final void zzb(zzdq zzdqVar) {
        if (!this.zzd && this.zzc) {
            zzz zzb = this.zzb.zzb();
            this.zzb = new zzx();
            this.zzc = false;
            zzdqVar.zza(this.zza, zzb);
        }
    }

    public final void zzc(zzdq zzdqVar) {
        this.zzd = true;
        if (this.zzc) {
            this.zzc = false;
            zzdqVar.zza(this.zza, this.zzb.zzb());
        }
    }
}
