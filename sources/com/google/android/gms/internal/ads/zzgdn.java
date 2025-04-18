package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgcy;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* loaded from: classes3.dex */
abstract class zzgdn extends zzgcy.zzi {
    private static final zzgdj zzbd;
    private static final zzger zzbe = new zzger(zzgdn.class);
    private volatile int remaining;
    private volatile Set<Throwable> seenExceptions = null;

    static {
        zzgdj zzgdlVar;
        Throwable th2;
        zzgdm zzgdmVar = null;
        try {
            zzgdlVar = new zzgdk(AtomicReferenceFieldUpdater.newUpdater(zzgdn.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzgdn.class, "remaining"));
            th2 = null;
        } catch (Throwable th3) {
            zzgdlVar = new zzgdl(zzgdmVar);
            th2 = th3;
        }
        zzbd = zzgdlVar;
        if (th2 != null) {
            zzbe.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    public zzgdn(int i10) {
        this.remaining = i10;
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
