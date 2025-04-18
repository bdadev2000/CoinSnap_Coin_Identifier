package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgec;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* loaded from: classes2.dex */
abstract class zzget extends zzgec.zzi {
    private static final zzgep zzbd;
    private static final zzgfy zzbe = new zzgfy(zzget.class);
    private volatile int remaining;
    private volatile Set<Throwable> seenExceptions = null;

    static {
        zzgep zzgesVar;
        Throwable th;
        zzger zzgerVar = null;
        try {
            zzgesVar = new zzgeq(AtomicReferenceFieldUpdater.newUpdater(zzget.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzget.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            zzgesVar = new zzges(zzgerVar);
            th = th2;
        }
        zzbd = zzgesVar;
        if (th != null) {
            zzbe.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public zzget(int i2) {
        this.remaining = i2;
    }

    public final int zzA() {
        return zzbd.zza(this);
    }

    public final Set zzC() {
        Set<Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zze(newSetFromMap);
        zzbd.zzb(this, null, newSetFromMap);
        Set<Throwable> set2 = this.seenExceptions;
        Objects.requireNonNull(set2);
        return set2;
    }

    public final void zzF() {
        this.seenExceptions = null;
    }

    public abstract void zze(Set set);
}
