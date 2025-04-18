package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzo extends LinkedHashMap {
    final /* synthetic */ zzq zza;

    public zzo(zzq zzqVar) {
        this.zza = zzqVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        int i10;
        ArrayDeque arrayDeque;
        int i11;
        synchronized (this.zza) {
            int size = size();
            zzq zzqVar = this.zza;
            i10 = zzqVar.zza;
            boolean z10 = false;
            if (size <= i10) {
                return false;
            }
            arrayDeque = zzqVar.zzf;
            arrayDeque.add(new Pair((String) entry.getKey(), ((zzp) entry.getValue()).zzb));
            int size2 = size();
            i11 = this.zza.zza;
            if (size2 > i11) {
                z10 = true;
            }
            return z10;
        }
    }
}
