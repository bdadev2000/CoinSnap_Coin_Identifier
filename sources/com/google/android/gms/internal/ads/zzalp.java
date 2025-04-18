package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class zzalp {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzed zzc = new zzed();
    private final StringBuilder zzd = new StringBuilder();

    @Nullable
    public static String zza(zzed zzedVar, StringBuilder sb2) {
        zzc(zzedVar);
        if (zzedVar.zzb() == 0) {
            return null;
        }
        String zzd = zzd(zzedVar, sb2);
        if (!"".equals(zzd)) {
            return zzd;
        }
        char zzm = (char) zzedVar.zzm();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(zzm);
        return sb3.toString();
    }

    public static void zzc(zzed zzedVar) {
        while (true) {
            for (boolean z10 = true; zzedVar.zzb() > 0 && z10; z10 = false) {
                char c10 = (char) zzedVar.zzN()[zzedVar.zzd()];
                if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                    int zzd = zzedVar.zzd();
                    int zze = zzedVar.zze();
                    byte[] zzN = zzedVar.zzN();
                    if (zzd + 2 <= zze) {
                        int i10 = zzd + 1;
                        if (zzN[zzd] == 47) {
                            int i11 = i10 + 1;
                            if (zzN[i10] == 42) {
                                while (true) {
                                    int i12 = i11 + 1;
                                    if (i12 >= zze) {
                                        break;
                                    }
                                    if (((char) zzN[i11]) == '*' && ((char) zzN[i12]) == '/') {
                                        zze = i12 + 1;
                                        i11 = zze;
                                    } else {
                                        i11 = i12;
                                    }
                                }
                                zzedVar.zzM(zze - zzedVar.zzd());
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    zzedVar.zzM(1);
                }
            }
            return;
        }
    }

    private static String zzd(zzed zzedVar, StringBuilder sb2) {
        sb2.setLength(0);
        int zzd = zzedVar.zzd();
        int zze = zzedVar.zze();
        loop0: while (true) {
            for (boolean z10 = false; zzd < zze && !z10; z10 = true) {
                char c10 = (char) zzedVar.zzN()[zzd];
                if ((c10 >= 'A' && c10 <= 'Z') || ((c10 >= 'a' && c10 <= 'z') || ((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                    sb2.append(c10);
                    zzd++;
                }
            }
        }
        zzedVar.zzM(zzd - zzedVar.zzd());
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0317, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x00b0, code lost:
    
        if (")".equals(zza(r3, r4)) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzb(com.google.android.gms.internal.ads.zzed r18) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalp.zzb(com.google.android.gms.internal.ads.zzed):java.util.List");
    }
}
