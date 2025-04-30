package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes2.dex */
final class zzams {

    @Nullable
    public final String zza;

    @Nullable
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;

    @Nullable
    public final zzamy zzf;
    public final String zzg;

    @Nullable
    public final String zzh;

    @Nullable
    public final zzams zzi;

    @Nullable
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    private zzams(@Nullable String str, @Nullable String str2, long j7, long j9, @Nullable zzamy zzamyVar, @Nullable String[] strArr, String str3, @Nullable String str4, @Nullable zzams zzamsVar) {
        boolean z8;
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzamyVar;
        this.zzj = strArr;
        if (str2 != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.zzc = z8;
        this.zzd = j7;
        this.zze = j9;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzamsVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }

    public static zzams zzb(@Nullable String str, long j7, long j9, @Nullable zzamy zzamyVar, @Nullable String[] strArr, String str2, @Nullable String str3, @Nullable zzams zzamsVar) {
        return new zzams(str, null, j7, j9, zzamyVar, strArr, str2, str3, zzamsVar);
    }

    public static zzams zzc(String str) {
        return new zzams(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), C.TIME_UNSET, C.TIME_UNSET, null, null, "", null, null);
    }

    private static SpannableStringBuilder zzi(String str, Map map) {
        if (!map.containsKey(str)) {
            zzeg zzegVar = new zzeg();
            zzegVar.zzl(new SpannableStringBuilder());
            map.put(str, zzegVar);
        }
        CharSequence zzq = ((zzeg) map.get(str)).zzq();
        zzq.getClass();
        return (SpannableStringBuilder) zzq;
    }

    private final void zzj(TreeSet treeSet, boolean z8) {
        String str = this.zza;
        boolean equals = TtmlNode.TAG_P.equals(str);
        boolean equals2 = TtmlNode.TAG_DIV.equals(str);
        if (z8 || equals || (equals2 && this.zzh != null)) {
            long j7 = this.zzd;
            if (j7 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j7));
            }
            long j9 = this.zze;
            if (j9 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j9));
            }
        }
        if (this.zzm != null) {
            for (int i9 = 0; i9 < this.zzm.size(); i9++) {
                zzams zzamsVar = (zzams) this.zzm.get(i9);
                boolean z9 = true;
                if (!z8 && !equals) {
                    z9 = false;
                }
                zzamsVar.zzj(treeSet, z9);
            }
        }
    }

    private final void zzk(long j7, String str, List list) {
        String str2;
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (zzg(j7) && TtmlNode.TAG_DIV.equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i9 = 0; i9 < zza(); i9++) {
            zzd(i9).zzk(j7, str, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzl(long r18, java.util.Map r20, java.util.Map r21, java.lang.String r22, java.util.Map r23) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzams.zzl(long, java.util.Map, java.util.Map, java.lang.String, java.util.Map):void");
    }

    private final void zzm(long j7, boolean z8, String str, Map map) {
        boolean z9;
        this.zzk.clear();
        this.zzl.clear();
        if (!TtmlNode.TAG_METADATA.equals(this.zza)) {
            if (!"".equals(this.zzg)) {
                str = this.zzg;
            }
            if (this.zzc && z8) {
                SpannableStringBuilder zzi = zzi(str, map);
                String str2 = this.zzb;
                str2.getClass();
                zzi.append((CharSequence) str2);
                return;
            }
            if (TtmlNode.TAG_BR.equals(this.zza) && z8) {
                zzi(str, map).append('\n');
                return;
            }
            if (zzg(j7)) {
                for (Map.Entry entry : map.entrySet()) {
                    HashMap hashMap = this.zzk;
                    String str3 = (String) entry.getKey();
                    CharSequence zzq = ((zzeg) entry.getValue()).zzq();
                    zzq.getClass();
                    hashMap.put(str3, Integer.valueOf(zzq.length()));
                }
                boolean equals = TtmlNode.TAG_P.equals(this.zza);
                for (int i9 = 0; i9 < zza(); i9++) {
                    zzams zzd = zzd(i9);
                    if (z8 || equals) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    zzd.zzm(j7, z9, str, map);
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
                    CharSequence zzq2 = ((zzeg) entry2.getValue()).zzq();
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

    public final zzams zzd(int i9) {
        List list = this.zzm;
        if (list != null) {
            return (zzams) list.get(i9);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List zze(long j7, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        zzk(j7, this.zzg, arrayList);
        TreeMap treeMap = new TreeMap();
        zzm(j7, false, this.zzg, treeMap);
        zzl(j7, map, map2, this.zzg, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            Pair pair = (Pair) arrayList.get(i9);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                zzamw zzamwVar = (zzamw) map2.get(pair.first);
                zzamwVar.getClass();
                zzeg zzegVar = new zzeg();
                zzegVar.zzc(decodeByteArray);
                zzegVar.zzh(zzamwVar.zzb);
                zzegVar.zzi(0);
                zzegVar.zze(zzamwVar.zzc, 0);
                zzegVar.zzf(zzamwVar.zze);
                zzegVar.zzk(zzamwVar.zzf);
                zzegVar.zzd(zzamwVar.zzg);
                zzegVar.zzo(zzamwVar.zzj);
                arrayList2.add(zzegVar.zzp());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzamw zzamwVar2 = (zzamw) map2.get(entry.getKey());
            zzamwVar2.getClass();
            zzeg zzegVar2 = (zzeg) entry.getValue();
            CharSequence zzq = zzegVar2.zzq();
            zzq.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzq;
            for (zzamq zzamqVar : (zzamq[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzamq.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzamqVar), spannableStringBuilder.getSpanEnd(zzamqVar), (CharSequence) "");
            }
            int i10 = 0;
            while (i10 < spannableStringBuilder.length()) {
                int i11 = i10 + 1;
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
                i10 = i11;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i14 = 0;
            while (i14 < spannableStringBuilder.length() - 1) {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i14) == '\n' && spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
                i14 = i15;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i16 = 0;
            while (i16 < spannableStringBuilder.length() - 1) {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i16) == ' ' && spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
                i16 = i17;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzegVar2.zze(zzamwVar2.zzc, zzamwVar2.zzd);
            zzegVar2.zzf(zzamwVar2.zze);
            zzegVar2.zzh(zzamwVar2.zzb);
            zzegVar2.zzk(zzamwVar2.zzf);
            zzegVar2.zzn(zzamwVar2.zzi, zzamwVar2.zzh);
            zzegVar2.zzo(zzamwVar2.zzj);
            arrayList2.add(zzegVar2.zzp());
        }
        return arrayList2;
    }

    public final void zzf(zzams zzamsVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzamsVar);
    }

    public final boolean zzg(long j7) {
        long j9 = this.zzd;
        if (j9 == C.TIME_UNSET) {
            if (this.zze == C.TIME_UNSET) {
                return true;
            }
            j9 = -9223372036854775807L;
        }
        if (j9 <= j7 && this.zze == C.TIME_UNSET) {
            return true;
        }
        if (j9 != C.TIME_UNSET || j7 >= this.zze) {
            return j9 <= j7 && j7 < this.zze;
        }
        return true;
    }

    public final long[] zzh() {
        TreeSet treeSet = new TreeSet();
        int i9 = 0;
        zzj(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i9] = ((Long) it.next()).longValue();
            i9++;
        }
        return jArr;
    }
}
