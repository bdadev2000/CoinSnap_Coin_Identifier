package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgeh;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* loaded from: classes2.dex */
abstract class zzgey extends zzgeh.zzi {
    private static final zzgeu zzbd;
    private static final zzggd zzbe = new zzggd(zzgey.class);
    private volatile int remaining;
    private volatile Set<Throwable> seenExceptions = null;

    static {
        zzgeu zzgexVar;
        Throwable th;
        zzgew zzgewVar = null;
        try {
            zzgexVar = new zzgev(AtomicReferenceFieldUpdater.newUpdater(zzgey.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzgey.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            zzgexVar = new zzgex(zzgewVar);
            th = th2;
        }
        zzbd = zzgexVar;
        if (th != null) {
            zzbe.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public zzgey(int i9) {
        this.remaining = i9;
    }

    public final int zzA() {
        return zzbd.zza(this);
    }

    public final Set zzC() {
        Set<Throwable> set = this.seenExceptions;
        if (set == null) {
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            zze(newSetFromMap);
            zzbd.zzb(this, null, newSetFromMap);
            Set<Throwable> set2 = this.seenExceptions;
            Objects.requireNonNull(set2);
            return set2;
        }
        return set;
    }

    public final void zzF() {
        this.seenExceptions = null;
    }

    public abstract void zze(Set set);
}
