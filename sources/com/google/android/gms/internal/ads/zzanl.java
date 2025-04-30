package com.google.android.gms.internal.ads;

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
import com.applovin.impl.L;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.report.i;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzanl {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap hashMap = new HashMap();
        L.n(255, 255, 255, hashMap, "white");
        L.n(0, 255, 0, hashMap, "lime");
        L.n(0, 255, 255, hashMap, "cyan");
        L.n(255, 0, 0, hashMap, "red");
        L.n(255, 255, 0, hashMap, "yellow");
        L.n(255, 0, 255, hashMap, "magenta");
        L.n(0, 0, 255, hashMap, "blue");
        L.n(0, 0, 0, hashMap, "black");
        zzc = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        L.n(255, 255, 255, hashMap2, "bg_white");
        L.n(0, 255, 0, hashMap2, "bg_lime");
        L.n(0, 255, 255, hashMap2, "bg_cyan");
        L.n(255, 0, 0, hashMap2, "bg_red");
        L.n(255, 255, 0, hashMap2, "bg_yellow");
        L.n(255, 0, 255, hashMap2, "bg_magenta");
        L.n(0, 0, 255, hashMap2, "bg_blue");
        L.n(0, 0, 0, hashMap2, "bg_black");
        zzd = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x010e, code lost:
    
        if (r4.equals(com.mbridge.msdk.foundation.same.report.i.f15948a) != false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0169 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString zza(@androidx.annotation.Nullable java.lang.String r17, java.lang.String r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanl.zza(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static zzeg zzb(String str) {
        zzank zzankVar = new zzank();
        zzh(str, zzankVar);
        return zzankVar.zza();
    }

    @Nullable
    public static zzane zzc(zzfu zzfuVar, List list) {
        Charset charset = zzfxs.zzc;
        String zzy = zzfuVar.zzy(charset);
        if (zzy != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(zzy);
            if (!matcher.matches()) {
                String zzy2 = zzfuVar.zzy(charset);
                if (zzy2 != null) {
                    Matcher matcher2 = pattern.matcher(zzy2);
                    if (matcher2.matches()) {
                        return zze(zzy.trim(), matcher2, zzfuVar, list);
                    }
                }
            } else {
                return zze(null, matcher, zzfuVar, list);
            }
        }
        return null;
    }

    private static int zzd(List list, @Nullable String str, zzani zzaniVar) {
        List zzf = zzf(list, str, zzaniVar);
        for (int i9 = 0; i9 < zzf.size(); i9++) {
            zzand zzandVar = ((zzanj) zzf.get(i9)).zzb;
            if (zzandVar.zze() != -1) {
                return zzandVar.zze();
            }
        }
        return -1;
    }

    @Nullable
    private static zzane zze(@Nullable String str, Matcher matcher, zzfu zzfuVar, List list) {
        zzank zzankVar = new zzank();
        try {
            String group = matcher.group(1);
            group.getClass();
            zzankVar.zza = zzann.zzb(group);
            String group2 = matcher.group(2);
            group2.getClass();
            zzankVar.zzb = zzann.zzb(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            zzh(group3, zzankVar);
            StringBuilder sb = new StringBuilder();
            String zzy = zzfuVar.zzy(zzfxs.zzc);
            while (!TextUtils.isEmpty(zzy)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(zzy.trim());
                zzy = zzfuVar.zzy(zzfxs.zzc);
            }
            zzankVar.zzc = zza(str, sb.toString(), list);
            return new zzane(zzankVar.zza().zzp(), zzankVar.zza, zzankVar.zzb);
        } catch (NumberFormatException unused) {
            zzfk.zzf("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    private static List zzf(List list, @Nullable String str, zzani zzaniVar) {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            zzand zzandVar = (zzand) list.get(i9);
            int zzf = zzandVar.zzf(str, zzaniVar.zza, zzaniVar.zzd, zzaniVar.zzc);
            if (zzf > 0) {
                arrayList.add(new zzanj(zzf, zzandVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void zzg(@Nullable String str, zzani zzaniVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c9;
        Comparator comparator;
        zzani zzaniVar2;
        zzani zzaniVar3;
        zzani zzaniVar4;
        int i9;
        int i10 = zzaniVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzaniVar.zza;
        int hashCode = str2.hashCode();
        int i11 = -1;
        if (hashCode != 0) {
            if (hashCode != 105) {
                if (hashCode != 3314158) {
                    if (hashCode != 3511770) {
                        if (hashCode != 98) {
                            if (hashCode != 99) {
                                if (hashCode != 117) {
                                    if (hashCode == 118 && str2.equals("v")) {
                                        c9 = 6;
                                    }
                                    c9 = 65535;
                                } else {
                                    if (str2.equals("u")) {
                                        c9 = 3;
                                    }
                                    c9 = 65535;
                                }
                            } else {
                                if (str2.equals(com.mbridge.msdk.foundation.controller.a.f15376a)) {
                                    c9 = 4;
                                }
                                c9 = 65535;
                            }
                        } else {
                            if (str2.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                                c9 = 0;
                            }
                            c9 = 65535;
                        }
                    } else {
                        if (str2.equals("ruby")) {
                            c9 = 2;
                        }
                        c9 = 65535;
                    }
                } else {
                    if (str2.equals("lang")) {
                        c9 = 5;
                    }
                    c9 = 65535;
                }
            } else {
                if (str2.equals(i.f15948a)) {
                    c9 = 1;
                }
                c9 = 65535;
            }
        } else {
            if (str2.equals("")) {
                c9 = 7;
            }
            c9 = 65535;
        }
        switch (c9) {
            case 0:
                L.o(1, spannableStringBuilder, i10, length, 33);
                break;
            case 1:
                L.o(2, spannableStringBuilder, i10, length, 33);
                break;
            case 2:
                int zzd2 = zzd(list2, str, zzaniVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                comparator = zzanh.zza;
                Collections.sort(arrayList, comparator);
                int i12 = zzaniVar.zzb;
                int i13 = 0;
                int i14 = 0;
                while (i13 < arrayList.size()) {
                    zzaniVar2 = ((zzanh) arrayList.get(i13)).zzb;
                    if ("rt".equals(zzaniVar2.zza)) {
                        zzanh zzanhVar = (zzanh) arrayList.get(i13);
                        zzaniVar3 = zzanhVar.zzb;
                        int zzd3 = zzd(list2, str, zzaniVar3);
                        if (zzd3 == i11) {
                            if (zzd2 != i11) {
                                zzd3 = zzd2;
                            } else {
                                zzd3 = 1;
                            }
                        }
                        zzaniVar4 = zzanhVar.zzb;
                        int i15 = zzaniVar4.zzb - i14;
                        i9 = zzanhVar.zzc;
                        int i16 = i9 - i14;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i15, i16);
                        spannableStringBuilder.delete(i15, i16);
                        spannableStringBuilder.setSpan(new zzen(subSequence.toString(), zzd3), i12, i15, 33);
                        i14 = subSequence.length() + i14;
                        i12 = i15;
                    }
                    i13++;
                    i11 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            case 4:
                for (String str3 : zzaniVar.zzd) {
                    Map map = zzc;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i10, length, 33);
                    } else {
                        Map map2 = zzd;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i10, length, 33);
                        }
                    }
                }
                break;
            case 5:
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List zzf = zzf(list2, str, zzaniVar);
        for (int i17 = 0; i17 < zzf.size(); i17++) {
            zzand zzandVar = ((zzanj) zzf.get(i17)).zzb;
            if (zzandVar != null) {
                if (zzandVar.zzg() != -1) {
                    zzeo.zza(spannableStringBuilder, new StyleSpan(zzandVar.zzg()), i10, length, 33);
                }
                if (zzandVar.zzz()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                }
                if (zzandVar.zzy()) {
                    zzeo.zza(spannableStringBuilder, new ForegroundColorSpan(zzandVar.zzc()), i10, length, 33);
                }
                if (zzandVar.zzx()) {
                    zzeo.zza(spannableStringBuilder, new BackgroundColorSpan(zzandVar.zzb()), i10, length, 33);
                }
                if (zzandVar.zzr() != null) {
                    zzeo.zza(spannableStringBuilder, new TypefaceSpan(zzandVar.zzr()), i10, length, 33);
                }
                int zzd4 = zzandVar.zzd();
                if (zzd4 != 1) {
                    if (zzd4 != 2) {
                        if (zzd4 == 3) {
                            zzeo.zza(spannableStringBuilder, new RelativeSizeSpan(zzandVar.zza() / 100.0f), i10, length, 33);
                        }
                    } else {
                        zzeo.zza(spannableStringBuilder, new RelativeSizeSpan(zzandVar.zza()), i10, length, 33);
                    }
                } else {
                    zzeo.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzandVar.zza(), true), i10, length, 33);
                }
                if (zzandVar.zzw()) {
                    spannableStringBuilder.setSpan(new zzem(), i10, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015d, code lost:
    
        if (r15 == 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015f, code lost:
    
        if (r15 == 1) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0161, code lost:
    
        if (r15 == 2) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0164, code lost:
    
        if (r15 == 3) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0167, code lost:
    
        if (r15 == 4) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0169, code lost:
    
        if (r15 == 5) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016b, code lost:
    
        com.google.android.gms.internal.ads.zzfk.zzf("WebvttCueParser", "Invalid alignment value: ".concat(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0176, code lost:
    
        r3 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0178, code lost:
    
        r3 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0174, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017a, code lost:
    
        r3 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017b, code lost:
    
        r17.zzd = r3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x018f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:92:0x00c1. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzh(java.lang.String r16, com.google.android.gms.internal.ads.zzank r17) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanl.zzh(java.lang.String, com.google.android.gms.internal.ads.zzank):void");
    }
}
