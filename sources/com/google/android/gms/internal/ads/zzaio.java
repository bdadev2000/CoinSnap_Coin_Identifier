package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
class zzaio {
    public final int zzd;

    public zzaio(int i2) {
        this.zzd = i2;
    }

    public static int zze(int i2) {
        return (i2 >> 24) & 255;
    }

    public static String zzf(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i2 >> 24) & 255));
        sb.append((char) ((i2 >> 16) & 255));
        sb.append((char) ((i2 >> 8) & 255));
        sb.append((char) (i2 & 255));
        return sb.toString();
    }

    public String toString() {
        return zzf(this.zzd);
    }
}
