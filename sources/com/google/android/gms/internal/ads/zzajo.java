package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
class zzajo {
    public final int zzd;

    public zzajo(int i9) {
        this.zzd = i9;
    }

    public static int zze(int i9) {
        return (i9 >> 24) & 255;
    }

    public static String zzf(int i9) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i9 >> 24) & 255));
        sb.append((char) ((i9 >> 16) & 255));
        sb.append((char) ((i9 >> 8) & 255));
        sb.append((char) (i9 & 255));
        return sb.toString();
    }

    public String toString() {
        return zzf(this.zzd);
    }
}
