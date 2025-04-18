package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
final class zzalm {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;

    private zzalm(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
        this.zzf = i7;
        this.zzg = i8;
        this.zzh = i9;
        this.zzi = i10;
        this.zzj = i11;
        this.zzk = i12;
    }

    @Nullable
    public static zzalm zza(String str) {
        char c2;
        String[] split = TextUtils.split(str.substring(7), ",");
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            int length = split.length;
            if (i2 >= length) {
                if (i3 != -1) {
                    return new zzalm(i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, length);
                }
                return null;
            }
            String zza = zzfxi.zza(split[i2].trim());
            switch (zza.hashCode()) {
                case -1178781136:
                    if (zza.equals("italic")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case -1026963764:
                    if (zza.equals("underline")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case -192095652:
                    if (zza.equals("strikeout")) {
                        c2 = '\b';
                        break;
                    }
                    break;
                case -70925746:
                    if (zza.equals("primarycolour")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 3029637:
                    if (zza.equals("bold")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 3373707:
                    if (zza.equals("name")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 366554320:
                    if (zza.equals("fontsize")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 767321349:
                    if (zza.equals("borderstyle")) {
                        c2 = '\t';
                        break;
                    }
                    break;
                case 1767875043:
                    if (zza.equals("alignment")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 1988365454:
                    if (zza.equals("outlinecolour")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            c2 = 65535;
            switch (c2) {
                case 0:
                    i3 = i2;
                    break;
                case 1:
                    i4 = i2;
                    break;
                case 2:
                    i5 = i2;
                    break;
                case 3:
                    i6 = i2;
                    break;
                case 4:
                    i7 = i2;
                    break;
                case 5:
                    i8 = i2;
                    break;
                case 6:
                    i9 = i2;
                    break;
                case 7:
                    i10 = i2;
                    break;
                case '\b':
                    i11 = i2;
                    break;
                case '\t':
                    i12 = i2;
                    break;
            }
            i2++;
        }
    }
}
