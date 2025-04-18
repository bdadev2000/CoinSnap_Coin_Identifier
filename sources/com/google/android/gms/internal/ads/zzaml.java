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
import com.applovin.impl.adview.t;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzaml {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap hashMap = new HashMap();
        t.r(255, 255, 255, hashMap, "white");
        t.r(0, 255, 0, hashMap, "lime");
        t.r(0, 255, 255, hashMap, "cyan");
        t.r(255, 0, 0, hashMap, "red");
        t.r(255, 255, 0, hashMap, "yellow");
        t.r(255, 0, 255, hashMap, "magenta");
        t.r(0, 0, 255, hashMap, "blue");
        t.r(0, 0, 0, hashMap, "black");
        zzc = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        t.r(255, 255, 255, hashMap2, "bg_white");
        t.r(0, 255, 0, hashMap2, "bg_lime");
        t.r(0, 255, 255, hashMap2, "bg_cyan");
        t.r(255, 0, 0, hashMap2, "bg_red");
        t.r(255, 255, 0, hashMap2, "bg_yellow");
        t.r(255, 0, 255, hashMap2, "bg_magenta");
        t.r(0, 0, 255, hashMap2, "bg_blue");
        t.r(0, 0, 0, hashMap2, "bg_black");
        zzd = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x016b A[FALL_THROUGH, PHI: r8
      0x016b: PHI (r8v5 int) = (r8v1 int), (r8v1 int), (r8v8 int), (r8v8 int), (r8v8 int), (r8v8 int), (r8v8 int), (r8v8 int), (r8v1 int) binds: [B:125:0x0208, B:12:0x0059, B:25:0x0095, B:45:0x0128, B:58:0x015e, B:59:0x0160, B:57:0x016b, B:54:0x016b, B:7:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString zza(@androidx.annotation.Nullable java.lang.String r17, java.lang.String r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaml.zza(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static zzcz zzb(String str) {
        zzamk zzamkVar = new zzamk();
        zzh(str, zzamkVar);
        return zzamkVar.zza();
    }

    @Nullable
    public static zzame zzc(zzek zzekVar, List list) {
        Charset charset = StandardCharsets.UTF_8;
        String zzz = zzekVar.zzz(charset);
        if (zzz != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(zzz);
            if (matcher.matches()) {
                return zze(null, matcher, zzekVar, list);
            }
            String zzz2 = zzekVar.zzz(charset);
            if (zzz2 != null) {
                Matcher matcher2 = pattern.matcher(zzz2);
                if (matcher2.matches()) {
                    return zze(zzz.trim(), matcher2, zzekVar, list);
                }
            }
        }
        return null;
    }

    private static int zzd(List list, @Nullable String str, zzami zzamiVar) {
        List zzf = zzf(list, str, zzamiVar);
        for (int i2 = 0; i2 < zzf.size(); i2++) {
            zzamd zzamdVar = ((zzamj) zzf.get(i2)).zzb;
            if (zzamdVar.zze() != -1) {
                return zzamdVar.zze();
            }
        }
        return -1;
    }

    @Nullable
    private static zzame zze(@Nullable String str, Matcher matcher, zzek zzekVar, List list) {
        zzamk zzamkVar = new zzamk();
        try {
            String group = matcher.group(1);
            group.getClass();
            zzamkVar.zza = zzamn.zzb(group);
            String group2 = matcher.group(2);
            group2.getClass();
            zzamkVar.zzb = zzamn.zzb(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            zzh(group3, zzamkVar);
            StringBuilder sb = new StringBuilder();
            String zzz = zzekVar.zzz(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(zzz)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(zzz.trim());
                zzz = zzekVar.zzz(StandardCharsets.UTF_8);
            }
            zzamkVar.zzc = zza(str, sb.toString(), list);
            return new zzame(zzamkVar.zza().zzp(), zzamkVar.zza, zzamkVar.zzb);
        } catch (NumberFormatException unused) {
            zzea.zzf("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    private static List zzf(List list, @Nullable String str, zzami zzamiVar) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzamd zzamdVar = (zzamd) list.get(i2);
            int zzf = zzamdVar.zzf(str, zzamiVar.zza, zzamiVar.zzd, zzamiVar.zzc);
            if (zzf > 0) {
                arrayList.add(new zzamj(zzf, zzamdVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void zzg(@Nullable String str, zzami zzamiVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c2;
        Comparator comparator;
        zzami zzamiVar2;
        zzami zzamiVar3;
        zzami zzamiVar4;
        int i2;
        int i3 = zzamiVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzamiVar.zza;
        int hashCode = str2.hashCode();
        int i4 = -1;
        if (hashCode == 0) {
            if (str2.equals("")) {
                c2 = 7;
            }
            c2 = 65535;
        } else if (hashCode == 105) {
            if (str2.equals("i")) {
                c2 = 1;
            }
            c2 = 65535;
        } else if (hashCode == 3314158) {
            if (str2.equals("lang")) {
                c2 = 5;
            }
            c2 = 65535;
        } else if (hashCode == 3511770) {
            if (str2.equals("ruby")) {
                c2 = 2;
            }
            c2 = 65535;
        } else if (hashCode == 98) {
            if (str2.equals("b")) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode == 99) {
            if (str2.equals("c")) {
                c2 = 4;
            }
            c2 = 65535;
        } else if (hashCode != 117) {
            if (hashCode == 118 && str2.equals("v")) {
                c2 = 6;
            }
            c2 = 65535;
        } else {
            if (str2.equals("u")) {
                c2 = 3;
            }
            c2 = 65535;
        }
        switch (c2) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i3, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, length, 33);
                break;
            case 2:
                int zzd2 = zzd(list2, str, zzamiVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                comparator = zzamh.zza;
                Collections.sort(arrayList, comparator);
                int i5 = zzamiVar.zzb;
                int i6 = 0;
                int i7 = 0;
                while (i6 < arrayList.size()) {
                    zzamiVar2 = ((zzamh) arrayList.get(i6)).zzb;
                    if ("rt".equals(zzamiVar2.zza)) {
                        zzamh zzamhVar = (zzamh) arrayList.get(i6);
                        zzamiVar3 = zzamhVar.zzb;
                        int zzd3 = zzd(list2, str, zzamiVar3);
                        if (zzd3 == i4) {
                            zzd3 = zzd2 != i4 ? zzd2 : 1;
                        }
                        zzamiVar4 = zzamhVar.zzb;
                        int i8 = zzamiVar4.zzb - i7;
                        i2 = zzamhVar.zzc;
                        int i9 = i2 - i7;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i8, i9);
                        spannableStringBuilder.delete(i8, i9);
                        spannableStringBuilder.setSpan(new zzdf(subSequence.toString(), zzd3), i5, i8, 33);
                        i7 = subSequence.length() + i7;
                        i5 = i8;
                    }
                    i6++;
                    i4 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, length, 33);
                break;
            case 4:
                for (String str3 : zzamiVar.zzd) {
                    Map map = zzc;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i3, length, 33);
                    } else {
                        Map map2 = zzd;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i3, length, 33);
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
        List zzf = zzf(list2, str, zzamiVar);
        for (int i10 = 0; i10 < zzf.size(); i10++) {
            zzamd zzamdVar = ((zzamj) zzf.get(i10)).zzb;
            if (zzamdVar != null) {
                if (zzamdVar.zzg() != -1) {
                    zzdg.zzb(spannableStringBuilder, new StyleSpan(zzamdVar.zzg()), i3, length, 33);
                }
                if (zzamdVar.zzz()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i3, length, 33);
                }
                if (zzamdVar.zzy()) {
                    zzdg.zzb(spannableStringBuilder, new ForegroundColorSpan(zzamdVar.zzc()), i3, length, 33);
                }
                if (zzamdVar.zzx()) {
                    zzdg.zzb(spannableStringBuilder, new BackgroundColorSpan(zzamdVar.zzb()), i3, length, 33);
                }
                if (zzamdVar.zzr() != null) {
                    zzdg.zzb(spannableStringBuilder, new TypefaceSpan(zzamdVar.zzr()), i3, length, 33);
                }
                int zzd4 = zzamdVar.zzd();
                if (zzd4 == 1) {
                    zzdg.zzb(spannableStringBuilder, new AbsoluteSizeSpan((int) zzamdVar.zza(), true), i3, length, 33);
                } else if (zzd4 == 2) {
                    zzdg.zzb(spannableStringBuilder, new RelativeSizeSpan(zzamdVar.zza()), i3, length, 33);
                } else if (zzd4 == 3) {
                    zzdg.zzb(spannableStringBuilder, new RelativeSizeSpan(zzamdVar.zza() / 100.0f), i3, length, 33);
                }
                if (zzamdVar.zzw()) {
                    spannableStringBuilder.setSpan(new zzde(), i3, length, 33);
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
    
        com.google.android.gms.internal.ads.zzea.zzf("WebvttCueParser", "Invalid alignment value: ".concat(r6));
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
    private static void zzh(java.lang.String r16, com.google.android.gms.internal.ads.zzamk r17) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaml.zzh(java.lang.String, com.google.android.gms.internal.ads.zzamk):void");
    }
}
