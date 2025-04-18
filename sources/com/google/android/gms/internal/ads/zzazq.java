package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* loaded from: classes3.dex */
public final class zzazq {
    private final int zza;
    private final zzazn zzb = new zzazs();

    public zzazq(int i10) {
        this.zza = i10;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(((String) arrayList.get(i10)).toLowerCase(Locale.US));
            sb2.append('\n');
        }
        String[] split = sb2.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        zzazp zzazpVar = new zzazp();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzazo(this));
        for (String str : split) {
            String[] zzb = zzazr.zzb(str, false);
            if (zzb.length != 0) {
                zzazv.zzc(zzb, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzazpVar.zzb.write(this.zzb.zzb(((zzazu) it.next()).zzb));
            } catch (IOException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Error while writing hash to byteStream", e2);
            }
        }
        return zzazpVar.toString();
    }
}
