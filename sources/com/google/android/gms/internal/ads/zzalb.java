package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.ads.e;
import java.util.Locale;

/* loaded from: classes3.dex */
final class zzalb {
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

    private zzalb(String str, int i10, @Nullable Integer num, @Nullable Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f10;
        this.zzf = z10;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = z13;
        this.zzj = i11;
    }

    @Nullable
    public static zzalb zzb(String str, zzakz zzakzVar) {
        int i10;
        Integer num;
        Integer num2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        int parseInt;
        zzdb.zzd(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i12 = zzakzVar.zzk;
        if (length != i12) {
            zzdt.zzf("SsaStyle", String.format(Locale.US, "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i12), Integer.valueOf(length), str));
            return null;
        }
        try {
            String trim = split[zzakzVar.zza].trim();
            int i13 = zzakzVar.zzb;
            if (i13 != -1) {
                i10 = zzd(split[i13].trim());
            } else {
                i10 = -1;
            }
            int i14 = zzakzVar.zzc;
            if (i14 != -1) {
                num = zzc(split[i14].trim());
            } else {
                num = null;
            }
            int i15 = zzakzVar.zzd;
            if (i15 != -1) {
                num2 = zzc(split[i15].trim());
            } else {
                num2 = null;
            }
            int i16 = zzakzVar.zze;
            float f10 = -3.4028235E38f;
            if (i16 != -1) {
                String trim2 = split[i16].trim();
                try {
                    f10 = Float.parseFloat(trim2);
                } catch (NumberFormatException e2) {
                    zzdt.zzg("SsaStyle", "Failed to parse font size: '" + trim2 + "'", e2);
                }
            }
            int i17 = zzakzVar.zzf;
            if (i17 != -1 && zze(split[i17].trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i18 = zzakzVar.zzg;
            if (i18 != -1 && zze(split[i18].trim())) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i19 = zzakzVar.zzh;
            if (i19 != -1 && zze(split[i19].trim())) {
                z12 = true;
            } else {
                z12 = false;
            }
            int i20 = zzakzVar.zzi;
            if (i20 != -1 && zze(split[i20].trim())) {
                z13 = true;
            } else {
                z13 = false;
            }
            int i21 = zzakzVar.zzj;
            if (i21 != -1) {
                String trim3 = split[i21].trim();
                try {
                    parseInt = Integer.parseInt(trim3.trim());
                } catch (NumberFormatException unused) {
                }
                if (parseInt == 1 || parseInt == 3) {
                    i11 = parseInt;
                    return new zzalb(trim, i10, num, num2, f10, z10, z11, z12, z13, i11);
                }
                zzdt.zzf("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(trim3)));
            }
            i11 = -1;
            return new zzalb(trim, i10, num, num2, f10, z10, z11, z12, z13, i11);
        } catch (RuntimeException e10) {
            zzdt.zzg("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e10);
            return null;
        }
    }

    @Nullable
    public static Integer zzc(String str) {
        long parseLong;
        boolean z10;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z10 = true;
            } else {
                z10 = false;
            }
            zzdb.zzd(z10);
            return Integer.valueOf(Color.argb(zzgcr.zzb(((parseLong >> 24) & 255) ^ 255), zzgcr.zzb(parseLong & 255), zzgcr.zzb((parseLong >> 8) & 255), zzgcr.zzb((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e2) {
            zzdt.zzg("SsaStyle", "Failed to parse color expression: '" + str + "'", e2);
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
                e.s(str, "Ignoring unknown alignment: ", "SsaStyle");
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
        } catch (NumberFormatException e2) {
            zzdt.zzg("SsaStyle", "Failed to parse boolean value: '" + str + "'", e2);
            return false;
        }
    }
}
