package com.google.android.gms.internal.play_billing;

import android.os.Build;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class zzce extends zzby {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicLong zzb = new AtomicLong();
    private static final ConcurrentLinkedQueue zzc = new ConcurrentLinkedQueue();
    private volatile zzbf zzd;

    private zzce(String str) {
        super(str);
        String str2 = Build.FINGERPRINT;
        boolean z2 = true;
        boolean z3 = str2 == null || "robolectric".equals(str2);
        String str3 = Build.HARDWARE;
        boolean z4 = "goldfish".equals(str3) || "ranchu".equals(str3);
        String str4 = Build.TYPE;
        if (!"eng".equals(str4) && !"userdebug".equals(str4)) {
            z2 = false;
        }
        if (z3 || z4) {
            this.zzd = new zzbz().zza(zza());
        } else if (z2) {
            this.zzd = zzck.zzc().zzb(false).zza(zza());
        } else {
            this.zzd = null;
        }
    }

    public static zzbf zzb(String str) {
        AtomicReference atomicReference = zza;
        if (atomicReference.get() != null) {
            return ((zzca) atomicReference.get()).zza(str);
        }
        zzce zzceVar = new zzce(str.replace('$', '.'));
        zzcc.zza.offer(zzceVar);
        if (atomicReference.get() != null) {
            while (true) {
                zzce zzceVar2 = (zzce) zzcc.zza.poll();
                if (zzceVar2 == null) {
                    break;
                }
                zzceVar2.zzd = ((zzca) zza.get()).zza(zzceVar2.zza());
            }
            if (((zzcd) zzc.poll()) != null) {
                zzb.getAndDecrement();
                throw null;
            }
        }
        return zzceVar;
    }
}
