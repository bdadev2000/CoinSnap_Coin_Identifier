package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class zzamc {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzek zzc = new zzek();
    private final StringBuilder zzd = new StringBuilder();

    @Nullable
    public static String zza(zzek zzekVar, StringBuilder sb) {
        zzc(zzekVar);
        if (zzekVar.zzb() == 0) {
            return null;
        }
        String zzd = zzd(zzekVar, sb);
        if (!"".equals(zzd)) {
            return zzd;
        }
        char zzm = (char) zzekVar.zzm();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(zzm);
        return sb2.toString();
    }

    public static void zzc(zzek zzekVar) {
        while (true) {
            for (boolean z2 = true; zzekVar.zzb() > 0 && z2; z2 = false) {
                char c2 = (char) zzekVar.zzN()[zzekVar.zzd()];
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    zzekVar.zzM(1);
                } else {
                    int zzd = zzekVar.zzd();
                    int zze = zzekVar.zze();
                    byte[] zzN = zzekVar.zzN();
                    if (zzd + 2 <= zze) {
                        int i2 = zzd + 1;
                        if (zzN[zzd] == 47) {
                            int i3 = zzd + 2;
                            if (zzN[i2] == 42) {
                                while (true) {
                                    int i4 = i3 + 1;
                                    if (i4 >= zze) {
                                        break;
                                    }
                                    if (((char) zzN[i3]) == '*' && ((char) zzN[i4]) == '/') {
                                        zze = i3 + 2;
                                        i3 = zze;
                                    } else {
                                        i3 = i4;
                                    }
                                }
                                zzekVar.zzM(zze - zzekVar.zzd());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    private static String zzd(zzek zzekVar, StringBuilder sb) {
        sb.setLength(0);
        int zzd = zzekVar.zzd();
        int zze = zzekVar.zze();
        loop0: while (true) {
            for (boolean z2 = false; zzd < zze && !z2; z2 = true) {
                char c2 = (char) zzekVar.zzN()[zzd];
                if ((c2 >= 'A' && c2 <= 'Z') || ((c2 >= 'a' && c2 <= 'z') || ((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                    sb.append(c2);
                    zzd++;
                }
            }
        }
        zzekVar.zzM(zzd - zzekVar.zzd());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0315, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x00b0, code lost:
    
        if (")".equals(zza(r3, r4)) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzb(com.google.android.gms.internal.ads.zzek r18) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamc.zzb(com.google.android.gms.internal.ads.zzek):java.util.List");
    }
}
