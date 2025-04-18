package com.google.android.gms.internal.ads;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.applovin.impl.adview.t;

/* loaded from: classes2.dex */
final class zzalo {
    public final String zza;
    public final int zzb;

    @Nullable
    @ColorInt
    public final Integer zzc;

    @Nullable
    @ColorInt
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzalo(String str, int i2, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2, float f2, boolean z2, boolean z3, boolean z4, boolean z5, int i3) {
        this.zza = str;
        this.zzb = i2;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f2;
        this.zzf = z2;
        this.zzg = z3;
        this.zzh = z4;
        this.zzi = z5;
        this.zzj = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x010c, code lost:
    
        if (r5 != 3) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb A[Catch: RuntimeException -> 0x0057, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0057, blocks: (B:7:0x003c, B:9:0x004b, B:10:0x005b, B:12:0x005f, B:13:0x006c, B:15:0x0070, B:16:0x007d, B:18:0x0081, B:20:0x0087, B:22:0x00a4, B:24:0x00a9, B:27:0x00b8, B:29:0x00bc, B:32:0x00cd, B:34:0x00d1, B:37:0x00e2, B:39:0x00e6, B:42:0x00f7, B:44:0x00fb, B:46:0x0101, B:51:0x011c, B:50:0x010e, B:64:0x008f), top: B:6:0x003c, inners: #1 }] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzalo zzb(java.lang.String r20, com.google.android.gms.internal.ads.zzalm r21) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalo.zzb(java.lang.String, com.google.android.gms.internal.ads.zzalm):com.google.android.gms.internal.ads.zzalo");
    }

    @Nullable
    @ColorInt
    public static Integer zzc(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzdi.zzd(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(zzgdu.zzb(((parseLong >> 24) & 255) ^ 255), zzgdu.zzb(parseLong & 255), zzgdu.zzb((parseLong >> 8) & 255), zzgdu.zzb((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            zzea.zzg("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
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
                t.w(str, "Ignoring unknown alignment: ", "SsaStyle");
                return -1;
        }
    }

    private static boolean zze(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            zzea.zzg("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }
}
