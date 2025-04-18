package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class zzhca {
    protected volatile zzhcp zza;
    private volatile zzgzs zzb;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhca)) {
            return false;
        }
        zzhca zzhcaVar = (zzhca) obj;
        zzhcp zzhcpVar = this.zza;
        zzhcp zzhcpVar2 = zzhcaVar.zza;
        if (zzhcpVar == null && zzhcpVar2 == null) {
            return zzb().equals(zzhcaVar.zzb());
        }
        if (zzhcpVar != null && zzhcpVar2 != null) {
            return zzhcpVar.equals(zzhcpVar2);
        }
        if (zzhcpVar != null) {
            zzhcaVar.zzd(zzhcpVar.zzbt());
            return zzhcpVar.equals(zzhcaVar.zza);
        }
        zzd(zzhcpVar2.zzbt());
        return this.zza.equals(zzhcpVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((zzgzq) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzaY();
        }
        return 0;
    }

    public final zzgzs zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    return this.zzb;
                }
                if (this.zza == null) {
                    this.zzb = zzgzs.zzb;
                } else {
                    this.zzb = this.zza.zzaN();
                }
                return this.zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzhcp zzc(zzhcp zzhcpVar) {
        zzhcp zzhcpVar2 = this.zza;
        this.zzb = null;
        this.zza = zzhcpVar;
        return zzhcpVar2;
    }

    public final void zzd(zzhcp zzhcpVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzhcpVar;
                this.zzb = zzgzs.zzb;
            } catch (zzhbt unused) {
                this.zza = zzhcpVar;
                this.zzb = zzgzs.zzb;
            }
        }
    }
}
