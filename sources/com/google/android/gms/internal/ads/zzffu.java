package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzffu {
    public static com.google.android.gms.ads.internal.client.zzs zza(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfeu zzfeuVar = (zzfeu) it.next();
            if (zzfeuVar.zzc) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(zzfeuVar.zza, zzfeuVar.zzb));
            }
        }
        return new com.google.android.gms.ads.internal.client.zzs(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static zzfeu zzb(com.google.android.gms.ads.internal.client.zzs zzsVar) {
        return zzsVar.zzi ? new zzfeu(-3, 0, true) : new zzfeu(zzsVar.zze, zzsVar.zzb, false);
    }
}
