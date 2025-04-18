package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzo extends LinkedHashMap {
    final /* synthetic */ zzq zza;

    public zzo(zzq zzqVar) {
        this.zza = zzqVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        int i2;
        ArrayDeque arrayDeque;
        int i3;
        synchronized (this.zza) {
            try {
                int size = size();
                zzq zzqVar = this.zza;
                i2 = zzqVar.zza;
                if (size <= i2) {
                    return false;
                }
                arrayDeque = zzqVar.zzf;
                arrayDeque.add(new Pair((String) entry.getKey(), ((zzp) entry.getValue()).zzb));
                int size2 = size();
                i3 = this.zza.zza;
                return size2 > i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
