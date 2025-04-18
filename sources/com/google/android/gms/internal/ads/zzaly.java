package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.report.i;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class zzaly {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzc = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzd = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x020b A[FALL_THROUGH, PHI: r8
      0x020b: PHI (r8v5 int) = (r8v1 int), (r8v1 int), (r8v8 int), (r8v8 int), (r8v8 int), (r8v8 int), (r8v8 int), (r8v8 int), (r8v1 int) binds: [B:125:0x0208, B:12:0x0059, B:25:0x0095, B:45:0x0128, B:58:0x0161, B:59:0x0163, B:57:0x020b, B:54:0x020b, B:7:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString zza(@androidx.annotation.Nullable java.lang.String r17, java.lang.String r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaly.zza(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static zzcr zzb(String str) {
        zzalw zzalwVar = new zzalw();
        zzh(str, zzalwVar);
        return zzalwVar.zza();
    }

    @Nullable
    public static zzalr zzc(zzed zzedVar, List list) {
        String zzz = zzedVar.zzz(StandardCharsets.UTF_8);
        if (zzz != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(zzz);
            if (!matcher.matches()) {
                String zzz2 = zzedVar.zzz(StandardCharsets.UTF_8);
                if (zzz2 != null) {
                    Matcher matcher2 = pattern.matcher(zzz2);
                    if (matcher2.matches()) {
                        return zze(zzz.trim(), matcher2, zzedVar, list);
                    }
                }
            } else {
                return zze(null, matcher, zzedVar, list);
            }
        }
        return null;
    }

    private static int zzd(List list, @Nullable String str, zzalu zzaluVar) {
        List zzf = zzf(list, str, zzaluVar);
        for (int i10 = 0; i10 < zzf.size(); i10++) {
            zzalq zzalqVar = ((zzalv) zzf.get(i10)).zzb;
            if (zzalqVar.zze() != -1) {
                return zzalqVar.zze();
            }
        }
        return -1;
    }

    @Nullable
    private static zzalr zze(@Nullable String str, Matcher matcher, zzed zzedVar, List list) {
        zzalw zzalwVar = new zzalw();
        try {
            String group = matcher.group(1);
            group.getClass();
            zzalwVar.zza = zzama.zzb(group);
            String group2 = matcher.group(2);
            group2.getClass();
            zzalwVar.zzb = zzama.zzb(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            zzh(group3, zzalwVar);
            StringBuilder sb2 = new StringBuilder();
            String zzz = zzedVar.zzz(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(zzz)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(zzz.trim());
                zzz = zzedVar.zzz(StandardCharsets.UTF_8);
            }
            zzalwVar.zzc = zza(str, sb2.toString(), list);
            return new zzalr(zzalwVar.zza().zzp(), zzalwVar.zza, zzalwVar.zzb);
        } catch (NumberFormatException unused) {
            zzdt.zzf("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    private static List zzf(List list, @Nullable String str, zzalu zzaluVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzalq zzalqVar = (zzalq) list.get(i10);
            int zzf = zzalqVar.zzf(str, zzaluVar.zza, zzaluVar.zzd, zzaluVar.zzc);
            if (zzf > 0) {
                arrayList.add(new zzalv(zzf, zzalqVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void zzg(@Nullable String str, zzalu zzaluVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c10;
        Comparator comparator;
        zzalu zzaluVar2;
        zzalu zzaluVar3;
        zzalu zzaluVar4;
        int i10;
        int i11 = zzaluVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzaluVar.zza;
        int hashCode = str2.hashCode();
        int i12 = -1;
        if (hashCode != 0) {
            if (hashCode != 105) {
                if (hashCode != 3314158) {
                    if (hashCode != 3511770) {
                        if (hashCode != 98) {
                            if (hashCode != 99) {
                                if (hashCode != 117) {
                                    if (hashCode == 118 && str2.equals("v")) {
                                        c10 = 5;
                                    }
                                    c10 = 65535;
                                } else {
                                    if (str2.equals("u")) {
                                        c10 = 3;
                                    }
                                    c10 = 65535;
                                }
                            } else {
                                if (str2.equals(com.mbridge.msdk.foundation.controller.a.a)) {
                                    c10 = 4;
                                }
                                c10 = 65535;
                            }
                        } else {
                            if (str2.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                                c10 = 0;
                            }
                            c10 = 65535;
                        }
                    } else {
                        if (str2.equals("ruby")) {
                            c10 = 2;
                        }
                        c10 = 65535;
                    }
                } else {
                    if (str2.equals("lang")) {
                        c10 = 6;
                    }
                    c10 = 65535;
                }
            } else {
                if (str2.equals(i.a)) {
                    c10 = 1;
                }
                c10 = 65535;
            }
        } else {
            if (str2.equals("")) {
                c10 = 7;
            }
            c10 = 65535;
        }
        switch (c10) {
            case 0:
                e.k(1, spannableStringBuilder, i11, length, 33);
                break;
            case 1:
                e.k(2, spannableStringBuilder, i11, length, 33);
                break;
            case 2:
                int zzd2 = zzd(list2, str, zzaluVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                comparator = zzalt.zza;
                Collections.sort(arrayList, comparator);
                int i13 = zzaluVar.zzb;
                int i14 = 0;
                int i15 = 0;
                while (i14 < arrayList.size()) {
                    zzaluVar2 = ((zzalt) arrayList.get(i14)).zzb;
                    if ("rt".equals(zzaluVar2.zza)) {
                        zzalt zzaltVar = (zzalt) arrayList.get(i14);
                        zzaluVar3 = zzaltVar.zzb;
                        int zzd3 = zzd(list2, str, zzaluVar3);
                        if (zzd3 == i12) {
                            if (zzd2 != i12) {
                                zzd3 = zzd2;
                            } else {
                                zzd3 = 1;
                            }
                        }
                        zzaluVar4 = zzaltVar.zzb;
                        int i16 = zzaluVar4.zzb - i15;
                        i10 = zzaltVar.zzc;
                        int i17 = i10 - i15;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i16, i17);
                        spannableStringBuilder.delete(i16, i17);
                        spannableStringBuilder.setSpan(new zzcx(subSequence.toString(), zzd3), i13, i16, 33);
                        i15 = subSequence.length() + i15;
                        i13 = i16;
                    }
                    i14++;
                    i12 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
                break;
            case 4:
                for (String str3 : zzaluVar.zzd) {
                    Map map = zzc;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i11, length, 33);
                    } else {
                        Map map2 = zzd;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i11, length, 33);
                        }
                    }
                }
                break;
            case 5:
                spannableStringBuilder.setSpan(new zzda(zzaluVar.zzc), i11, length, 33);
                break;
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List zzf = zzf(list2, str, zzaluVar);
        for (int i18 = 0; i18 < zzf.size(); i18++) {
            zzalq zzalqVar = ((zzalv) zzf.get(i18)).zzb;
            if (zzalqVar != null) {
                if (zzalqVar.zzg() != -1) {
                    zzcy.zzb(spannableStringBuilder, new StyleSpan(zzalqVar.zzg()), i11, length, 33);
                }
                if (zzalqVar.zzz()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
                }
                if (zzalqVar.zzy()) {
                    zzcy.zzb(spannableStringBuilder, new ForegroundColorSpan(zzalqVar.zzc()), i11, length, 33);
                }
                if (zzalqVar.zzx()) {
                    zzcy.zzb(spannableStringBuilder, new BackgroundColorSpan(zzalqVar.zzb()), i11, length, 33);
                }
                if (zzalqVar.zzr() != null) {
                    zzcy.zzb(spannableStringBuilder, new TypefaceSpan(zzalqVar.zzr()), i11, length, 33);
                }
                int zzd4 = zzalqVar.zzd();
                if (zzd4 != 1) {
                    if (zzd4 != 2) {
                        if (zzd4 == 3) {
                            zzcy.zzb(spannableStringBuilder, new RelativeSizeSpan(zzalqVar.zza() / 100.0f), i11, length, 33);
                        }
                    } else {
                        zzcy.zzb(spannableStringBuilder, new RelativeSizeSpan(zzalqVar.zza()), i11, length, 33);
                    }
                } else {
                    zzcy.zzb(spannableStringBuilder, new AbsoluteSizeSpan((int) zzalqVar.zza(), true), i11, length, 33);
                }
                if (zzalqVar.zzw()) {
                    spannableStringBuilder.setSpan(new zzcw(), i11, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015d, code lost:
    
        if (r15 == 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015f, code lost:
    
        if (r15 == 1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0161, code lost:
    
        if (r15 == 2) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0164, code lost:
    
        if (r15 == 3) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0166, code lost:
    
        if (r15 == 4) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0168, code lost:
    
        r3 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0169, code lost:
    
        if (r15 == 5) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016b, code lost:
    
        com.google.android.gms.internal.ads.zzdt.zzf("WebvttCueParser", "Invalid alignment value: ".concat(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0175, code lost:
    
        r3 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0177, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0179, code lost:
    
        r3 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017a, code lost:
    
        r17.zzd = r3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x018e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:91:0x00c1. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzh(java.lang.String r16, com.google.android.gms.internal.ads.zzalw r17) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaly.zzh(java.lang.String, com.google.android.gms.internal.ads.zzalw):void");
    }
}
