package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class zzdcc {
    protected final Map zza = new HashMap();

    public zzdcc(Set set) {
        zzp(set);
    }

    public final synchronized void zzk(zzded zzdedVar) {
        zzo(zzdedVar.zza, zzdedVar.zzb);
    }

    public final synchronized void zzo(Object obj, Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzp(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzk((zzded) it.next());
        }
    }

    public final synchronized void zzq(final zzdcb zzdcbVar) {
        for (Map.Entry entry : this.zza.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdca
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdcb.this.zza(key);
                    } catch (Throwable th2) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzv(th2, "EventEmitter.notify");
                        com.google.android.gms.ads.internal.util.zze.zzb("Event emitter exception.", th2);
                    }
                }
            });
        }
    }
}
