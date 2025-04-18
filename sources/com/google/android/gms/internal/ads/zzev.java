package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public class zzev {
    public final int zzd;

    public static String zze(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) ((i10 >> 24) & 255));
        sb2.append((char) ((i10 >> 16) & 255));
        sb2.append((char) ((i10 >> 8) & 255));
        sb2.append((char) (i10 & 255));
        return sb2.toString();
    }

    public String toString() {
        return zze(this.zzd);
    }
}
