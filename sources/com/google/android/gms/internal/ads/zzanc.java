package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class zzanc {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzfu zzc = new zzfu();
    private final StringBuilder zzd = new StringBuilder();

    @Nullable
    public static String zza(zzfu zzfuVar, StringBuilder sb) {
        zzc(zzfuVar);
        if (zzfuVar.zzb() == 0) {
            return null;
        }
        String zzd = zzd(zzfuVar, sb);
        if (!"".equals(zzd)) {
            return zzd;
        }
        char zzm = (char) zzfuVar.zzm();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(zzm);
        return sb2.toString();
    }

    public static void zzc(zzfu zzfuVar) {
        while (true) {
            for (boolean z8 = true; zzfuVar.zzb() > 0 && z8; z8 = false) {
                char c9 = (char) zzfuVar.zzM()[zzfuVar.zzd()];
                if (c9 != '\t' && c9 != '\n' && c9 != '\f' && c9 != '\r' && c9 != ' ') {
                    int zzd = zzfuVar.zzd();
                    int zze = zzfuVar.zze();
                    byte[] zzM = zzfuVar.zzM();
                    if (zzd + 2 <= zze) {
                        int i9 = zzd + 1;
                        if (zzM[zzd] == 47) {
                            int i10 = zzd + 2;
                            if (zzM[i9] == 42) {
                                while (true) {
                                    int i11 = i10 + 1;
                                    if (i11 >= zze) {
                                        break;
                                    }
                                    if (((char) zzM[i10]) == '*' && ((char) zzM[i11]) == '/') {
                                        zze = i10 + 2;
                                        i10 = zze;
                                    } else {
                                        i10 = i11;
                                    }
                                }
                                zzfuVar.zzL(zze - zzfuVar.zzd());
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    zzfuVar.zzL(1);
                }
            }
            return;
        }
    }

    private static String zzd(zzfu zzfuVar, StringBuilder sb) {
        sb.setLength(0);
        int zzd = zzfuVar.zzd();
        int zze = zzfuVar.zze();
        loop0: while (true) {
            for (boolean z8 = false; zzd < zze && !z8; z8 = true) {
                char c9 = (char) zzfuVar.zzM()[zzd];
                if ((c9 >= 'A' && c9 <= 'Z') || ((c9 >= 'a' && c9 <= 'z') || ((c9 >= '0' && c9 <= '9') || c9 == '#' || c9 == '-' || c9 == '.' || c9 == '_'))) {
                    sb.append(c9);
                    zzd++;
                }
            }
        }
        zzfuVar.zzL(zzd - zzfuVar.zzd());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0314, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x00b0, code lost:
    
        if (")".equals(zza(r5, r6)) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzb(com.google.android.gms.internal.ads.zzfu r18) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanc.zzb(com.google.android.gms.internal.ads.zzfu):java.util.List");
    }
}
