package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public class zzgzt {
    protected volatile zzhai zza;
    private volatile zzgxp zzb;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgzt)) {
            return false;
        }
        zzgzt zzgztVar = (zzgzt) obj;
        zzhai zzhaiVar = this.zza;
        zzhai zzhaiVar2 = zzgztVar.zza;
        if (zzhaiVar == null && zzhaiVar2 == null) {
            return zzb().equals(zzgztVar.zzb());
        }
        if (zzhaiVar != null && zzhaiVar2 != null) {
            return zzhaiVar.equals(zzhaiVar2);
        }
        if (zzhaiVar != null) {
            zzgztVar.zzd(zzhaiVar.zzbt());
            return zzhaiVar.equals(zzgztVar.zza);
        }
        zzd(zzhaiVar2.zzbt());
        return this.zza.equals(zzhaiVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((zzgxm) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzaY();
        }
        return 0;
    }

    public final zzgxp zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            if (this.zzb != null) {
                return this.zzb;
            }
            if (this.zza == null) {
                this.zzb = zzgxp.zzb;
            } else {
                this.zzb = this.zza.zzaN();
            }
            return this.zzb;
        }
    }

    public final zzhai zzc(zzhai zzhaiVar) {
        zzhai zzhaiVar2 = this.zza;
        this.zzb = null;
        this.zza = zzhaiVar;
        return zzhaiVar2;
    }

    public final void zzd(zzhai zzhaiVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzhaiVar;
                this.zzb = zzgxp.zzb;
            } catch (zzgzm unused) {
                this.zza = zzhaiVar;
                this.zzb = zzgxp.zzb;
            }
        }
    }
}
