package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes2.dex */
final class zzals {

    @Nullable
    public final String zza;

    @Nullable
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;

    @Nullable
    public final zzaly zzf;
    public final String zzg;

    @Nullable
    public final String zzh;

    @Nullable
    public final zzals zzi;

    @Nullable
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    private zzals(@Nullable String str, @Nullable String str2, long j2, long j3, @Nullable zzaly zzalyVar, @Nullable String[] strArr, String str3, @Nullable String str4, @Nullable zzals zzalsVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzalyVar;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j2;
        this.zze = j3;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzalsVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }

    public static zzals zzb(@Nullable String str, long j2, long j3, @Nullable zzaly zzalyVar, @Nullable String[] strArr, String str2, @Nullable String str3, @Nullable zzals zzalsVar) {
        return new zzals(str, null, j2, j3, zzalyVar, strArr, str2, str3, zzalsVar);
    }

    public static zzals zzc(String str) {
        return new zzals(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static SpannableStringBuilder zzi(String str, Map map) {
        if (!map.containsKey(str)) {
            zzcz zzczVar = new zzcz();
            zzczVar.zzl(new SpannableStringBuilder());
            map.put(str, zzczVar);
        }
        CharSequence zzq = ((zzcz) map.get(str)).zzq();
        zzq.getClass();
        return (SpannableStringBuilder) zzq;
    }

    private final void zzj(TreeSet treeSet, boolean z2) {
        String str = this.zza;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z2 || equals || (equals2 && this.zzh != null)) {
            long j2 = this.zzd;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
            long j3 = this.zze;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
        }
        if (this.zzm != null) {
            for (int i2 = 0; i2 < this.zzm.size(); i2++) {
                zzals zzalsVar = (zzals) this.zzm.get(i2);
                boolean z3 = true;
                if (!z2 && !equals) {
                    z3 = false;
                }
                zzalsVar.zzj(treeSet, z3);
            }
        }
    }

    private final void zzk(long j2, String str, List list) {
        String str2;
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (zzg(j2) && "div".equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i2 = 0; i2 < zza(); i2++) {
            zzd(i2).zzk(j2, str, list);
        }
    }

    private final void zzl(long j2, Map map, Map map2, String str, Map map3) {
        Iterator it;
        zzals zzalsVar;
        zzaly zza;
        int i2;
        if (zzg(j2)) {
            String str2 = !"".equals(this.zzg) ? this.zzg : str;
            Iterator it2 = this.zzl.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str3 = (String) entry.getKey();
                int intValue = this.zzk.containsKey(str3) ? ((Integer) this.zzk.get(str3)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    zzcz zzczVar = (zzcz) map3.get(str3);
                    zzczVar.getClass();
                    zzalw zzalwVar = (zzalw) map2.get(str2);
                    zzalwVar.getClass();
                    int i3 = zzalwVar.zzj;
                    zzaly zza2 = zzalx.zza(this.zzf, this.zzj, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzczVar.zzq();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzczVar.zzl(spannableStringBuilder);
                    }
                    if (zza2 != null) {
                        zzals zzalsVar2 = this.zzi;
                        if (zza2.zzh() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(zza2.zzh()), intValue, intValue2, 33);
                        }
                        if (zza2.zzI()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, 33);
                        }
                        if (zza2.zzJ()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, 33);
                        }
                        if (zza2.zzH()) {
                            zzdg.zzb(spannableStringBuilder, new ForegroundColorSpan(zza2.zzd()), intValue, intValue2, 33);
                        }
                        if (zza2.zzG()) {
                            zzdg.zzb(spannableStringBuilder, new BackgroundColorSpan(zza2.zzc()), intValue, intValue2, 33);
                        }
                        if (zza2.zzD() != null) {
                            zzdg.zzb(spannableStringBuilder, new TypefaceSpan(zza2.zzD()), intValue, intValue2, 33);
                        }
                        if (zza2.zzk() != null) {
                            zzalr zzk = zza2.zzk();
                            zzk.getClass();
                            int i4 = zzk.zza;
                            it = it2;
                            if (i4 == -1) {
                                i4 = (i3 == 2 || i3 == 1) ? 3 : 1;
                                i2 = 1;
                            } else {
                                i2 = zzk.zzb;
                            }
                            int i5 = zzk.zzc;
                            if (i5 == -2) {
                                i5 = 1;
                            }
                            zzdg.zzb(spannableStringBuilder, new zzdh(i4, i2, i5), intValue, intValue2, 33);
                        } else {
                            it = it2;
                        }
                        int zzg = zza2.zzg();
                        if (zzg == 2) {
                            while (true) {
                                if (zzalsVar2 == null) {
                                    zzalsVar2 = null;
                                    break;
                                }
                                zzaly zza3 = zzalx.zza(zzalsVar2.zzf, zzalsVar2.zzj, map);
                                if (zza3 != null && zza3.zzg() == 1) {
                                    break;
                                } else {
                                    zzalsVar2 = zzalsVar2.zzi;
                                }
                            }
                            if (zzalsVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzalsVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        zzalsVar = null;
                                        break;
                                    }
                                    zzals zzalsVar3 = (zzals) arrayDeque.pop();
                                    zzaly zza4 = zzalx.zza(zzalsVar3.zzf, zzalsVar3.zzj, map);
                                    if (zza4 != null && zza4.zzg() == 3) {
                                        zzalsVar = zzalsVar3;
                                        break;
                                    }
                                    for (int zza5 = zzalsVar3.zza() - 1; zza5 >= 0; zza5--) {
                                        arrayDeque.push(zzalsVar3.zzd(zza5));
                                    }
                                }
                                if (zzalsVar != null) {
                                    if (zzalsVar.zza() != 1 || zzalsVar.zzd(0).zzb == null) {
                                        zzea.zze("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str4 = zzalsVar.zzd(0).zzb;
                                        int i6 = zzeu.zza;
                                        zzaly zza6 = zzalx.zza(zzalsVar.zzf, zzalsVar.zzj, map);
                                        int zzf = zza6 != null ? zza6.zzf() : -1;
                                        if (zzf == -1 && (zza = zzalx.zza(zzalsVar2.zzf, zzalsVar2.zzj, map)) != null) {
                                            zzf = zza.zzf();
                                        }
                                        spannableStringBuilder.setSpan(new zzdf(str4, zzf), intValue, intValue2, 33);
                                    }
                                }
                            }
                        } else if (zzg == 3 || zzg == 4) {
                            spannableStringBuilder.setSpan(new zzalq(), intValue, intValue2, 33);
                        }
                        if (zza2.zzF()) {
                            zzdg.zzb(spannableStringBuilder, new zzde(), intValue, intValue2, 33);
                        }
                        int zze = zza2.zze();
                        if (zze == 1) {
                            zzdg.zzb(spannableStringBuilder, new AbsoluteSizeSpan((int) zza2.zza(), true), intValue, intValue2, 33);
                        } else if (zze == 2) {
                            zzdg.zzb(spannableStringBuilder, new RelativeSizeSpan(zza2.zza()), intValue, intValue2, 33);
                        } else if (zze == 3) {
                            zzdg.zza(spannableStringBuilder, zza2.zza() / 100.0f, intValue, intValue2, 33);
                        }
                        if ("p".equals(this.zza)) {
                            if (zza2.zzb() != Float.MAX_VALUE) {
                                zzczVar.zzj((zza2.zzb() * (-90.0f)) / 100.0f);
                            }
                            if (zza2.zzj() != null) {
                                zzczVar.zzm(zza2.zzj());
                            }
                            if (zza2.zzi() != null) {
                                zzczVar.zzg(zza2.zzi());
                            }
                        }
                        it2 = it;
                    }
                }
            }
            for (int i7 = 0; i7 < zza(); i7++) {
                zzd(i7).zzl(j2, map, map2, str2, map3);
            }
        }
    }

    private final void zzm(long j2, boolean z2, String str, Map map) {
        this.zzk.clear();
        this.zzl.clear();
        if ("metadata".equals(this.zza)) {
            return;
        }
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (this.zzc && z2) {
            SpannableStringBuilder zzi = zzi(str, map);
            String str2 = this.zzb;
            str2.getClass();
            zzi.append((CharSequence) str2);
            return;
        }
        if ("br".equals(this.zza) && z2) {
            zzi(str, map).append('\n');
            return;
        }
        if (zzg(j2)) {
            for (Map.Entry entry : map.entrySet()) {
                HashMap hashMap = this.zzk;
                String str3 = (String) entry.getKey();
                CharSequence zzq = ((zzcz) entry.getValue()).zzq();
                zzq.getClass();
                hashMap.put(str3, Integer.valueOf(zzq.length()));
            }
            boolean equals = "p".equals(this.zza);
            for (int i2 = 0; i2 < zza(); i2++) {
                zzd(i2).zzm(j2, z2 || equals, str, map);
            }
            if (equals) {
                SpannableStringBuilder zzi2 = zzi(str, map);
                int length = zzi2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (zzi2.charAt(length) == ' ');
                if (length >= 0 && zzi2.charAt(length) != '\n') {
                    zzi2.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                HashMap hashMap2 = this.zzl;
                String str4 = (String) entry2.getKey();
                CharSequence zzq2 = ((zzcz) entry2.getValue()).zzq();
                zzq2.getClass();
                hashMap2.put(str4, Integer.valueOf(zzq2.length()));
            }
        }
    }

    public final int zza() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final zzals zzd(int i2) {
        List list = this.zzm;
        if (list != null) {
            return (zzals) list.get(i2);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List zze(long j2, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        zzk(j2, this.zzg, arrayList);
        TreeMap treeMap = new TreeMap();
        zzm(j2, false, this.zzg, treeMap);
        zzl(j2, map, map2, this.zzg, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Pair pair = (Pair) arrayList.get(i2);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                zzalw zzalwVar = (zzalw) map2.get(pair.first);
                zzalwVar.getClass();
                zzcz zzczVar = new zzcz();
                zzczVar.zzc(decodeByteArray);
                zzczVar.zzh(zzalwVar.zzb);
                zzczVar.zzi(0);
                zzczVar.zze(zzalwVar.zzc, 0);
                zzczVar.zzf(zzalwVar.zze);
                zzczVar.zzk(zzalwVar.zzf);
                zzczVar.zzd(zzalwVar.zzg);
                zzczVar.zzo(zzalwVar.zzj);
                arrayList2.add(zzczVar.zzp());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzalw zzalwVar2 = (zzalw) map2.get(entry.getKey());
            zzalwVar2.getClass();
            zzcz zzczVar2 = (zzcz) entry.getValue();
            CharSequence zzq = zzczVar2.zzq();
            zzq.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzq;
            for (zzalq zzalqVar : (zzalq[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzalq.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzalqVar), spannableStringBuilder.getSpanEnd(zzalqVar), (CharSequence) "");
            }
            int i3 = 0;
            while (i3 < spannableStringBuilder.length()) {
                int i4 = i3 + 1;
                if (spannableStringBuilder.charAt(i3) == ' ') {
                    int i5 = i4;
                    while (i5 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i5) == ' ') {
                        i5++;
                    }
                    int i6 = i5 - i4;
                    if (i6 > 0) {
                        spannableStringBuilder.delete(i3, i6 + i3);
                    }
                }
                i3 = i4;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i7 = 0;
            while (i7 < spannableStringBuilder.length() - 1) {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i7) == '\n' && spannableStringBuilder.charAt(i8) == ' ') {
                    spannableStringBuilder.delete(i8, i7 + 2);
                }
                i7 = i8;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i9 = 0;
            while (i9 < spannableStringBuilder.length() - 1) {
                int i10 = i9 + 1;
                if (spannableStringBuilder.charAt(i9) == ' ' && spannableStringBuilder.charAt(i10) == '\n') {
                    spannableStringBuilder.delete(i9, i10);
                }
                i9 = i10;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzczVar2.zze(zzalwVar2.zzc, zzalwVar2.zzd);
            zzczVar2.zzf(zzalwVar2.zze);
            zzczVar2.zzh(zzalwVar2.zzb);
            zzczVar2.zzk(zzalwVar2.zzf);
            zzczVar2.zzn(zzalwVar2.zzi, zzalwVar2.zzh);
            zzczVar2.zzo(zzalwVar2.zzj);
            arrayList2.add(zzczVar2.zzp());
        }
        return arrayList2;
    }

    public final void zzf(zzals zzalsVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzalsVar);
    }

    public final boolean zzg(long j2) {
        long j3 = this.zzd;
        if (j3 == -9223372036854775807L) {
            if (this.zze == -9223372036854775807L) {
                return true;
            }
            j3 = -9223372036854775807L;
        }
        if (j3 <= j2 && this.zze == -9223372036854775807L) {
            return true;
        }
        if (j3 != -9223372036854775807L || j2 >= this.zze) {
            return j3 <= j2 && j2 < this.zze;
        }
        return true;
    }

    public final long[] zzh() {
        TreeSet treeSet = new TreeSet();
        int i2 = 0;
        zzj(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i2] = ((Long) it.next()).longValue();
            i2++;
        }
        return jArr;
    }
}
