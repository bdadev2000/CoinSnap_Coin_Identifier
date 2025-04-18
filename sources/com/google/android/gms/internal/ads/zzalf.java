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
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes3.dex */
final class zzalf {

    @Nullable
    public final String zza;

    @Nullable
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;

    @Nullable
    public final zzall zzf;
    public final String zzg;

    @Nullable
    public final String zzh;

    @Nullable
    public final zzalf zzi;

    @Nullable
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    private zzalf(@Nullable String str, @Nullable String str2, long j3, long j10, @Nullable zzall zzallVar, @Nullable String[] strArr, String str3, @Nullable String str4, @Nullable zzalf zzalfVar) {
        boolean z10;
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzallVar;
        this.zzj = strArr;
        if (str2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzc = z10;
        this.zzd = j3;
        this.zze = j10;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzalfVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }

    public static zzalf zzb(@Nullable String str, long j3, long j10, @Nullable zzall zzallVar, @Nullable String[] strArr, String str2, @Nullable String str3, @Nullable zzalf zzalfVar) {
        return new zzalf(str, null, j3, j10, zzallVar, strArr, str2, str3, zzalfVar);
    }

    public static zzalf zzc(String str) {
        return new zzalf(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), C.TIME_UNSET, C.TIME_UNSET, null, null, "", null, null);
    }

    private static SpannableStringBuilder zzi(String str, Map map) {
        if (!map.containsKey(str)) {
            zzcr zzcrVar = new zzcr();
            zzcrVar.zzl(new SpannableStringBuilder());
            map.put(str, zzcrVar);
        }
        CharSequence zzq = ((zzcr) map.get(str)).zzq();
        zzq.getClass();
        return (SpannableStringBuilder) zzq;
    }

    private final void zzj(TreeSet treeSet, boolean z10) {
        String str = this.zza;
        boolean equals = TtmlNode.TAG_P.equals(str);
        boolean equals2 = TtmlNode.TAG_DIV.equals(str);
        if (z10 || equals || (equals2 && this.zzh != null)) {
            long j3 = this.zzd;
            if (j3 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j3));
            }
            long j10 = this.zze;
            if (j10 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j10));
            }
        }
        if (this.zzm != null) {
            for (int i10 = 0; i10 < this.zzm.size(); i10++) {
                zzalf zzalfVar = (zzalf) this.zzm.get(i10);
                boolean z11 = true;
                if (!z10 && !equals) {
                    z11 = false;
                }
                zzalfVar.zzj(treeSet, z11);
            }
        }
    }

    private final void zzk(long j3, String str, List list) {
        String str2;
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (zzg(j3) && TtmlNode.TAG_DIV.equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < zza(); i10++) {
            zzd(i10).zzk(j3, str, list);
        }
    }

    private final void zzl(long j3, Map map, Map map2, String str, Map map3) {
        String str2;
        int i10;
        Iterator it;
        zzalf zzalfVar;
        int i11;
        zzall zza;
        int i12;
        int i13;
        if (zzg(j3)) {
            if (!"".equals(this.zzg)) {
                str2 = this.zzg;
            } else {
                str2 = str;
            }
            Iterator it2 = this.zzl.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str3 = (String) entry.getKey();
                if (this.zzk.containsKey(str3)) {
                    i10 = ((Integer) this.zzk.get(str3)).intValue();
                } else {
                    i10 = 0;
                }
                int intValue = ((Integer) entry.getValue()).intValue();
                if (i10 != intValue) {
                    zzcr zzcrVar = (zzcr) map3.get(str3);
                    zzcrVar.getClass();
                    zzalj zzaljVar = (zzalj) map2.get(str2);
                    zzaljVar.getClass();
                    int i14 = zzaljVar.zzj;
                    zzall zza2 = zzalk.zza(this.zzf, this.zzj, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzcrVar.zzq();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzcrVar.zzl(spannableStringBuilder);
                    }
                    if (zza2 != null) {
                        zzalf zzalfVar2 = this.zzi;
                        if (zza2.zzh() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(zza2.zzh()), i10, intValue, 33);
                        }
                        if (zza2.zzI()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, intValue, 33);
                        }
                        if (zza2.zzJ()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, intValue, 33);
                        }
                        if (zza2.zzH()) {
                            zzcy.zzb(spannableStringBuilder, new ForegroundColorSpan(zza2.zzd()), i10, intValue, 33);
                        }
                        if (zza2.zzG()) {
                            zzcy.zzb(spannableStringBuilder, new BackgroundColorSpan(zza2.zzc()), i10, intValue, 33);
                        }
                        if (zza2.zzD() != null) {
                            zzcy.zzb(spannableStringBuilder, new TypefaceSpan(zza2.zzD()), i10, intValue, 33);
                        }
                        if (zza2.zzk() != null) {
                            zzale zzk = zza2.zzk();
                            zzk.getClass();
                            int i15 = zzk.zza;
                            it = it2;
                            if (i15 == -1) {
                                if (i14 != 2 && i14 != 1) {
                                    i13 = 1;
                                } else {
                                    i13 = 3;
                                }
                                i15 = i13;
                                i12 = 1;
                            } else {
                                i12 = zzk.zzb;
                            }
                            int i16 = zzk.zzc;
                            if (i16 == -2) {
                                i16 = 1;
                            }
                            zzcy.zzb(spannableStringBuilder, new zzcz(i15, i12, i16), i10, intValue, 33);
                        } else {
                            it = it2;
                        }
                        int zzg = zza2.zzg();
                        if (zzg != 2) {
                            if (zzg == 3 || zzg == 4) {
                                spannableStringBuilder.setSpan(new zzald(), i10, intValue, 33);
                            }
                        } else {
                            while (true) {
                                if (zzalfVar2 != null) {
                                    zzall zza3 = zzalk.zza(zzalfVar2.zzf, zzalfVar2.zzj, map);
                                    if (zza3 != null && zza3.zzg() == 1) {
                                        break;
                                    } else {
                                        zzalfVar2 = zzalfVar2.zzi;
                                    }
                                } else {
                                    zzalfVar2 = null;
                                    break;
                                }
                            }
                            if (zzalfVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzalfVar2);
                                while (true) {
                                    if (!arrayDeque.isEmpty()) {
                                        zzalf zzalfVar3 = (zzalf) arrayDeque.pop();
                                        zzall zza4 = zzalk.zza(zzalfVar3.zzf, zzalfVar3.zzj, map);
                                        if (zza4 != null && zza4.zzg() == 3) {
                                            zzalfVar = zzalfVar3;
                                            break;
                                        }
                                        for (int zza5 = zzalfVar3.zza() - 1; zza5 >= 0; zza5--) {
                                            arrayDeque.push(zzalfVar3.zzd(zza5));
                                        }
                                    } else {
                                        zzalfVar = null;
                                        break;
                                    }
                                }
                                if (zzalfVar != null) {
                                    if (zzalfVar.zza() == 1 && zzalfVar.zzd(0).zzb != null) {
                                        String str4 = zzalfVar.zzd(0).zzb;
                                        int i17 = zzen.zza;
                                        zzall zza6 = zzalk.zza(zzalfVar.zzf, zzalfVar.zzj, map);
                                        if (zza6 != null) {
                                            i11 = zza6.zzf();
                                        } else {
                                            i11 = -1;
                                        }
                                        if (i11 == -1 && (zza = zzalk.zza(zzalfVar2.zzf, zzalfVar2.zzj, map)) != null) {
                                            i11 = zza.zzf();
                                        }
                                        spannableStringBuilder.setSpan(new zzcx(str4, i11), i10, intValue, 33);
                                    } else {
                                        zzdt.zze("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    }
                                }
                            }
                        }
                        if (zza2.zzF()) {
                            zzcy.zzb(spannableStringBuilder, new zzcw(), i10, intValue, 33);
                        }
                        int zze = zza2.zze();
                        if (zze != 1) {
                            if (zze != 2) {
                                if (zze == 3) {
                                    zzcy.zza(spannableStringBuilder, zza2.zza() / 100.0f, i10, intValue, 33);
                                }
                            } else {
                                zzcy.zzb(spannableStringBuilder, new RelativeSizeSpan(zza2.zza()), i10, intValue, 33);
                            }
                        } else {
                            zzcy.zzb(spannableStringBuilder, new AbsoluteSizeSpan((int) zza2.zza(), true), i10, intValue, 33);
                        }
                        if (TtmlNode.TAG_P.equals(this.zza)) {
                            if (zza2.zzb() != Float.MAX_VALUE) {
                                zzcrVar.zzj((zza2.zzb() * (-90.0f)) / 100.0f);
                            }
                            if (zza2.zzj() != null) {
                                zzcrVar.zzm(zza2.zzj());
                            }
                            if (zza2.zzi() != null) {
                                zzcrVar.zzg(zza2.zzi());
                            }
                        }
                        it2 = it;
                    }
                }
            }
            for (int i18 = 0; i18 < zza(); i18++) {
                zzd(i18).zzl(j3, map, map2, str2, map3);
            }
        }
    }

    private final void zzm(long j3, boolean z10, String str, Map map) {
        boolean z11;
        this.zzk.clear();
        this.zzl.clear();
        if (!TtmlNode.TAG_METADATA.equals(this.zza)) {
            if (!"".equals(this.zzg)) {
                str = this.zzg;
            }
            if (this.zzc && z10) {
                SpannableStringBuilder zzi = zzi(str, map);
                String str2 = this.zzb;
                str2.getClass();
                zzi.append((CharSequence) str2);
                return;
            }
            if (TtmlNode.TAG_BR.equals(this.zza) && z10) {
                zzi(str, map).append('\n');
                return;
            }
            if (zzg(j3)) {
                for (Map.Entry entry : map.entrySet()) {
                    HashMap hashMap = this.zzk;
                    String str3 = (String) entry.getKey();
                    CharSequence zzq = ((zzcr) entry.getValue()).zzq();
                    zzq.getClass();
                    hashMap.put(str3, Integer.valueOf(zzq.length()));
                }
                boolean equals = TtmlNode.TAG_P.equals(this.zza);
                for (int i10 = 0; i10 < zza(); i10++) {
                    zzalf zzd = zzd(i10);
                    if (!z10 && !equals) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    zzd.zzm(j3, z11, str, map);
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
                    CharSequence zzq2 = ((zzcr) entry2.getValue()).zzq();
                    zzq2.getClass();
                    hashMap2.put(str4, Integer.valueOf(zzq2.length()));
                }
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

    public final zzalf zzd(int i10) {
        List list = this.zzm;
        if (list != null) {
            return (zzalf) list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List zze(long j3, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        zzk(j3, this.zzg, arrayList);
        TreeMap treeMap = new TreeMap();
        zzm(j3, false, this.zzg, treeMap);
        zzl(j3, map, map2, this.zzg, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                zzalj zzaljVar = (zzalj) map2.get(pair.first);
                zzaljVar.getClass();
                zzcr zzcrVar = new zzcr();
                zzcrVar.zzc(decodeByteArray);
                zzcrVar.zzh(zzaljVar.zzb);
                zzcrVar.zzi(0);
                zzcrVar.zze(zzaljVar.zzc, 0);
                zzcrVar.zzf(zzaljVar.zze);
                zzcrVar.zzk(zzaljVar.zzf);
                zzcrVar.zzd(zzaljVar.zzg);
                zzcrVar.zzo(zzaljVar.zzj);
                arrayList2.add(zzcrVar.zzp());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzalj zzaljVar2 = (zzalj) map2.get(entry.getKey());
            zzaljVar2.getClass();
            zzcr zzcrVar2 = (zzcr) entry.getValue();
            CharSequence zzq = zzcrVar2.zzq();
            zzq.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzq;
            for (zzald zzaldVar : (zzald[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzald.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzaldVar), spannableStringBuilder.getSpanEnd(zzaldVar), (CharSequence) "");
            }
            int i11 = 0;
            while (i11 < spannableStringBuilder.length()) {
                int i12 = i11 + 1;
                if (spannableStringBuilder.charAt(i11) == ' ') {
                    int i13 = i12;
                    while (i13 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i13) == ' ') {
                        i13++;
                    }
                    int i14 = i13 - i12;
                    if (i14 > 0) {
                        spannableStringBuilder.delete(i11, i14 + i11);
                    }
                }
                i11 = i12;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i15 = 0;
            while (i15 < spannableStringBuilder.length() - 1) {
                int i16 = i15 + 1;
                if (spannableStringBuilder.charAt(i15) == '\n' && spannableStringBuilder.charAt(i16) == ' ') {
                    spannableStringBuilder.delete(i16, i15 + 2);
                }
                i15 = i16;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i17 = 0;
            while (i17 < spannableStringBuilder.length() - 1) {
                int i18 = i17 + 1;
                if (spannableStringBuilder.charAt(i17) == ' ' && spannableStringBuilder.charAt(i18) == '\n') {
                    spannableStringBuilder.delete(i17, i18);
                }
                i17 = i18;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzcrVar2.zze(zzaljVar2.zzc, zzaljVar2.zzd);
            zzcrVar2.zzf(zzaljVar2.zze);
            zzcrVar2.zzh(zzaljVar2.zzb);
            zzcrVar2.zzk(zzaljVar2.zzf);
            zzcrVar2.zzn(zzaljVar2.zzi, zzaljVar2.zzh);
            zzcrVar2.zzo(zzaljVar2.zzj);
            arrayList2.add(zzcrVar2.zzp());
        }
        return arrayList2;
    }

    public final void zzf(zzalf zzalfVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzalfVar);
    }

    public final boolean zzg(long j3) {
        long j10 = this.zzd;
        if (j10 == C.TIME_UNSET) {
            if (this.zze == C.TIME_UNSET) {
                return true;
            }
            j10 = -9223372036854775807L;
        }
        if (j10 <= j3 && this.zze == C.TIME_UNSET) {
            return true;
        }
        if (j10 != C.TIME_UNSET || j3 >= this.zze) {
            return j10 <= j3 && j3 < this.zze;
        }
        return true;
    }

    public final long[] zzh() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        zzj(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }
}
