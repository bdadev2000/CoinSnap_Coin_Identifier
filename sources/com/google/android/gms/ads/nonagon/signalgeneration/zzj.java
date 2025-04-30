package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzj extends LinkedHashMap {
    final /* synthetic */ zzk zza;

    public zzj(zzk zzkVar) {
        this.zza = zzkVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        int i9;
        ArrayDeque arrayDeque;
        int i10;
        synchronized (this.zza) {
            try {
                int size = size();
                zzk zzkVar = this.zza;
                i9 = zzkVar.zza;
                boolean z8 = false;
                if (size <= i9) {
                    return false;
                }
                arrayDeque = zzkVar.zzf;
                arrayDeque.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                int size2 = size();
                i10 = this.zza.zza;
                if (size2 > i10) {
                    z8 = true;
                }
                return z8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
