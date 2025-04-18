package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class zzddr {
    protected final Map zza = new HashMap();

    public zzddr(Set set) {
        zzp(set);
    }

    public final synchronized void zzk(zzdfs zzdfsVar) {
        zzo(zzdfsVar.zza, zzdfsVar.zzb);
    }

    public final synchronized void zzo(Object obj, Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzp(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzk((zzdfs) it.next());
        }
    }

    public final synchronized void zzq(final zzddq zzddqVar) {
        for (Map.Entry entry : this.zza.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzddp
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzddq.this.zza(key);
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzu.zzo().zzv(th, "EventEmitter.notify");
                        com.google.android.gms.ads.internal.util.zze.zzb("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
