package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes2.dex */
final class zzamm {
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

    private zzamm(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.zza = i9;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = i14;
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = i17;
        this.zzj = i18;
        this.zzk = i19;
    }

    @Nullable
    public static zzamm zza(String str) {
        char c9;
        String[] split = TextUtils.split(str.substring(7), ",");
        int i9 = 0;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        while (true) {
            int length = split.length;
            if (i9 < length) {
                String zza = zzfxm.zza(split[i9].trim());
                switch (zza.hashCode()) {
                    case -1178781136:
                        if (zza.equals(TtmlNode.ITALIC)) {
                            c9 = 6;
                            break;
                        }
                        break;
                    case -1026963764:
                        if (zza.equals(TtmlNode.UNDERLINE)) {
                            c9 = 7;
                            break;
                        }
                        break;
                    case -192095652:
                        if (zza.equals("strikeout")) {
                            c9 = '\b';
                            break;
                        }
                        break;
                    case -70925746:
                        if (zza.equals("primarycolour")) {
                            c9 = 2;
                            break;
                        }
                        break;
                    case 3029637:
                        if (zza.equals(TtmlNode.BOLD)) {
                            c9 = 5;
                            break;
                        }
                        break;
                    case 3373707:
                        if (zza.equals("name")) {
                            c9 = 0;
                            break;
                        }
                        break;
                    case 366554320:
                        if (zza.equals("fontsize")) {
                            c9 = 4;
                            break;
                        }
                        break;
                    case 767321349:
                        if (zza.equals("borderstyle")) {
                            c9 = '\t';
                            break;
                        }
                        break;
                    case 1767875043:
                        if (zza.equals("alignment")) {
                            c9 = 1;
                            break;
                        }
                        break;
                    case 1988365454:
                        if (zza.equals("outlinecolour")) {
                            c9 = 3;
                            break;
                        }
                        break;
                }
                c9 = 65535;
                switch (c9) {
                    case 0:
                        i10 = i9;
                        break;
                    case 1:
                        i11 = i9;
                        break;
                    case 2:
                        i12 = i9;
                        break;
                    case 3:
                        i13 = i9;
                        break;
                    case 4:
                        i14 = i9;
                        break;
                    case 5:
                        i15 = i9;
                        break;
                    case 6:
                        i16 = i9;
                        break;
                    case 7:
                        i17 = i9;
                        break;
                    case '\b':
                        i18 = i9;
                        break;
                    case '\t':
                        i19 = i9;
                        break;
                }
                i9++;
            } else {
                if (i10 != -1) {
                    return new zzamm(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, length);
                }
                return null;
            }
        }
    }
}
