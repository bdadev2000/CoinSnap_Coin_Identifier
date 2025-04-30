package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* loaded from: classes2.dex */
public final class zzbbr {
    private final int zza;
    private final zzbbo zzb = new zzbbt();

    public zzbbr(int i9) {
        this.zza = i9;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            sb.append(((String) arrayList.get(i9)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        zzbbq zzbbqVar = new zzbbq();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzbbp(this));
        for (String str : split) {
            String[] zzb = zzbbs.zzb(str, false);
            if (zzb.length != 0) {
                zzbbw.zzc(zzb, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzbbqVar.zzb.write(this.zzb.zzb(((zzbbv) it.next()).zzb));
            } catch (IOException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Error while writing hash to byteStream", e4);
            }
        }
        return zzbbqVar.toString();
    }
}
