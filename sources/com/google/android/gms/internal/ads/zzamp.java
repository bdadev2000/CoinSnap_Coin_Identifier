package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
final class zzamp implements zzakq {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzamp(List list) {
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzame zzameVar = (zzame) list.get(i2);
            long[] jArr = this.zzb;
            int i3 = i2 + i2;
            jArr[i3] = zzameVar.zzb;
            jArr[i3 + 1] = zzameVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public final int zza() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public final long zzb(int i2) {
        zzdi.zzd(i2 >= 0);
        zzdi.zzd(i2 < this.zzc.length);
        return this.zzc[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public final List zzc(long j2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < this.zza.size(); i2++) {
            long[] jArr = this.zzb;
            int i3 = i2 + i2;
            if (jArr[i3] <= j2 && j2 < jArr[i3 + 1]) {
                zzame zzameVar = (zzame) this.zza.get(i2);
                zzdb zzdbVar = zzameVar.zza;
                if (zzdbVar.zze == -3.4028235E38f) {
                    arrayList2.add(zzameVar);
                } else {
                    arrayList.add(zzdbVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzamo
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((zzame) obj).zzb, ((zzame) obj2).zzb);
            }
        });
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            zzcz zzb = ((zzame) arrayList2.get(i4)).zza.zzb();
            zzb.zze((-1) - i4, 1);
            arrayList.add(zzb.zzp());
        }
        return arrayList;
    }
}
