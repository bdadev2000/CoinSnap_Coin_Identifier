package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* loaded from: classes4.dex */
public final class zzazz {
    private final int zza;
    private final zzazw zzb = new zzbab();

    public zzazz(int i2) {
        this.zza = i2;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(((String) arrayList.get(i2)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        zzazy zzazyVar = new zzazy();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzazx(this));
        for (String str : split) {
            String[] zzb = zzbaa.zzb(str, false);
            if (zzb.length != 0) {
                zzbae.zzc(zzb, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzazyVar.zzb.write(this.zzb.zzb(((zzbad) it.next()).zzb));
            } catch (IOException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Error while writing hash to byteStream", e);
            }
        }
        return zzazyVar.toString();
    }
}
