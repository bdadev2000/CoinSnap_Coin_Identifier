package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
final class zzanp implements zzalq {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzanp(List list) {
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i9 = 0; i9 < list.size(); i9++) {
            zzane zzaneVar = (zzane) list.get(i9);
            long[] jArr = this.zzb;
            int i10 = i9 + i9;
            jArr[i10] = zzaneVar.zzb;
            jArr[i10 + 1] = zzaneVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final int zza() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final long zzb(int i9) {
        boolean z8;
        boolean z9 = false;
        if (i9 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzd(z8);
        if (i9 < this.zzc.length) {
            z9 = true;
        }
        zzeq.zzd(z9);
        return this.zzc[i9];
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final List zzc(long j7) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i9 = 0; i9 < this.zza.size(); i9++) {
            long[] jArr = this.zzb;
            int i10 = i9 + i9;
            if (jArr[i10] <= j7 && j7 < jArr[i10 + 1]) {
                zzane zzaneVar = (zzane) this.zza.get(i9);
                zzei zzeiVar = zzaneVar.zza;
                if (zzeiVar.zzg == -3.4028235E38f) {
                    arrayList2.add(zzaneVar);
                } else {
                    arrayList.add(zzeiVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzano
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((zzane) obj).zzb, ((zzane) obj2).zzb);
            }
        });
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            zzeg zzb = ((zzane) arrayList2.get(i11)).zza.zzb();
            zzb.zze((-1) - i11, 1);
            arrayList.add(zzb.zzp());
        }
        return arrayList;
    }
}
