package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhki {
    public static final zzhki zza = new zzhki(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzhki zzb = new zzhki(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzhki zzc = new zzhki(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzhki zzd = new zzhki(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double zze;
    public final double zzf;
    public final double zzg;
    public final double zzh;
    public final double zzi;
    public final double zzj;
    public final double zzk;
    public final double zzl;
    public final double zzm;

    public zzhki(double d2, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.zze = d12;
        this.zzf = d13;
        this.zzg = d14;
        this.zzh = d2;
        this.zzi = d9;
        this.zzj = d10;
        this.zzk = d11;
        this.zzl = d15;
        this.zzm = d16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzhki.class != obj.getClass()) {
            return false;
        }
        zzhki zzhkiVar = (zzhki) obj;
        if (Double.compare(zzhkiVar.zzh, this.zzh) == 0 && Double.compare(zzhkiVar.zzi, this.zzi) == 0 && Double.compare(zzhkiVar.zzj, this.zzj) == 0 && Double.compare(zzhkiVar.zzk, this.zzk) == 0 && Double.compare(zzhkiVar.zzl, this.zzl) == 0 && Double.compare(zzhkiVar.zzm, this.zzm) == 0 && Double.compare(zzhkiVar.zze, this.zze) == 0 && Double.compare(zzhkiVar.zzf, this.zzf) == 0 && Double.compare(zzhkiVar.zzg, this.zzg) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.zze);
        long j7 = doubleToLongBits ^ (doubleToLongBits >>> 32);
        long doubleToLongBits2 = Double.doubleToLongBits(this.zzf);
        long j9 = doubleToLongBits2 ^ (doubleToLongBits2 >>> 32);
        long doubleToLongBits3 = Double.doubleToLongBits(this.zzg);
        long j10 = doubleToLongBits3 ^ (doubleToLongBits3 >>> 32);
        long doubleToLongBits4 = Double.doubleToLongBits(this.zzh);
        long j11 = doubleToLongBits4 ^ (doubleToLongBits4 >>> 32);
        long doubleToLongBits5 = Double.doubleToLongBits(this.zzi);
        long j12 = doubleToLongBits5 ^ (doubleToLongBits5 >>> 32);
        long doubleToLongBits6 = Double.doubleToLongBits(this.zzj);
        long j13 = doubleToLongBits6 ^ (doubleToLongBits6 >>> 32);
        long doubleToLongBits7 = Double.doubleToLongBits(this.zzk);
        long j14 = doubleToLongBits7 ^ (doubleToLongBits7 >>> 32);
        long doubleToLongBits8 = Double.doubleToLongBits(this.zzl);
        long j15 = doubleToLongBits8 ^ (doubleToLongBits8 >>> 32);
        long doubleToLongBits9 = Double.doubleToLongBits(this.zzm);
        return (((((((((((((((((int) j7) * 31) + ((int) j9)) * 31) + ((int) j10)) * 31) + ((int) j11)) * 31) + ((int) j12)) * 31) + ((int) j13)) * 31) + ((int) j14)) * 31) + ((int) j15)) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(zza)) {
            return "Rotate 0°";
        }
        if (equals(zzb)) {
            return "Rotate 90°";
        }
        if (equals(zzc)) {
            return "Rotate 180°";
        }
        if (equals(zzd)) {
            return "Rotate 270°";
        }
        double d2 = this.zze;
        double d9 = this.zzf;
        double d10 = this.zzg;
        double d11 = this.zzh;
        double d12 = this.zzi;
        double d13 = this.zzj;
        double d14 = this.zzk;
        double d15 = this.zzl;
        double d16 = this.zzm;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d2);
        sb.append(", v=");
        sb.append(d9);
        sb.append(", w=");
        sb.append(d10);
        sb.append(", a=");
        sb.append(d11);
        sb.append(", b=");
        sb.append(d12);
        sb.append(", c=");
        sb.append(d13);
        sb.append(", d=");
        sb.append(d14);
        sb.append(", tx=");
        sb.append(d15);
        sb.append(", ty=");
        sb.append(d16);
        sb.append("}");
        return sb.toString();
    }
}
