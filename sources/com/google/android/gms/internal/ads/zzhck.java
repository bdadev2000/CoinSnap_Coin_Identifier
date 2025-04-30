package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class zzhck {
    private static final zzhay zzb = zzhay.zza;
    protected volatile zzhde zza;
    private volatile zzhac zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhck)) {
            return false;
        }
        zzhck zzhckVar = (zzhck) obj;
        zzhde zzhdeVar = this.zza;
        zzhde zzhdeVar2 = zzhckVar.zza;
        if (zzhdeVar == null && zzhdeVar2 == null) {
            return zzb().equals(zzhckVar.zzb());
        }
        if (zzhdeVar != null && zzhdeVar2 != null) {
            return zzhdeVar.equals(zzhdeVar2);
        }
        if (zzhdeVar != null) {
            zzhckVar.zzd(zzhdeVar.zzbt());
            return zzhdeVar.equals(zzhckVar.zza);
        }
        zzd(zzhdeVar2.zzbt());
        return this.zza.equals(zzhdeVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzgzy) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzaY();
        }
        return 0;
    }

    public final zzhac zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            try {
                if (this.zzc != null) {
                    return this.zzc;
                }
                if (this.zza == null) {
                    this.zzc = zzhac.zzb;
                } else {
                    this.zzc = this.zza.zzaN();
                }
                return this.zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzhde zzc(zzhde zzhdeVar) {
        zzhde zzhdeVar2 = this.zza;
        this.zzc = null;
        this.zza = zzhdeVar;
        return zzhdeVar2;
    }

    public final void zzd(zzhde zzhdeVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzhdeVar;
                this.zzc = zzhac.zzb;
            } catch (zzhcd unused) {
                this.zza = zzhdeVar;
                this.zzc = zzhac.zzb;
            }
        }
    }
}
