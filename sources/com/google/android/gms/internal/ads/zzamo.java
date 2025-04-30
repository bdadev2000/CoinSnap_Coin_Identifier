package com.google.android.gms.internal.ads;

import android.graphics.Color;
import androidx.annotation.Nullable;
import com.applovin.impl.L;

/* loaded from: classes2.dex */
final class zzamo {
    public final String zza;
    public final int zzb;

    @Nullable
    public final Integer zzc;

    @Nullable
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzamo(String str, int i9, @Nullable Integer num, @Nullable Integer num2, float f9, boolean z8, boolean z9, boolean z10, boolean z11, int i10) {
        this.zza = str;
        this.zzb = i9;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f9;
        this.zzf = z8;
        this.zzg = z9;
        this.zzh = z10;
        this.zzi = z11;
        this.zzj = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x010e, code lost:
    
        if (r4 != 3) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd A[Catch: RuntimeException -> 0x0059, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x0059, blocks: (B:7:0x003e, B:9:0x004d, B:10:0x005d, B:12:0x0061, B:13:0x006e, B:15:0x0072, B:16:0x007f, B:18:0x0083, B:20:0x0089, B:22:0x00a6, B:24:0x00ab, B:27:0x00ba, B:29:0x00be, B:32:0x00cf, B:34:0x00d3, B:37:0x00e4, B:39:0x00e8, B:42:0x00f9, B:44:0x00fd, B:46:0x0103, B:51:0x011e, B:50:0x0110, B:64:0x0091), top: B:6:0x003e, inners: #0 }] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzamo zzb(java.lang.String r20, com.google.android.gms.internal.ads.zzamm r21) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamo.zzb(java.lang.String, com.google.android.gms.internal.ads.zzamm):com.google.android.gms.internal.ads.zzamo");
    }

    @Nullable
    public static Integer zzc(String str) {
        long parseLong;
        boolean z8;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z8 = true;
            } else {
                z8 = false;
            }
            zzeq.zzd(z8);
            return Integer.valueOf(Color.argb(zzgea.zzb(((parseLong >> 24) & 255) ^ 255), zzgea.zzb(parseLong & 255), zzgea.zzb((parseLong >> 8) & 255), zzgea.zzb((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e4) {
            zzfk.zzg("SsaStyle", "Failed to parse color expression: '" + str + "'", e4);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) {
        int parseInt;
        try {
            parseInt = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (parseInt) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return parseInt;
            default:
                L.A(str, "Ignoring unknown alignment: ", "SsaStyle");
                return -1;
        }
    }

    private static boolean zze(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e4) {
            zzfk.zzg("SsaStyle", "Failed to parse boolean value: '" + str + "'", e4);
            return false;
        }
    }
}
