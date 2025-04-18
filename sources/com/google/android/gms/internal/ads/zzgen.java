package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzgen extends zzget {
    private static final zzgfy zza = new zzgfy(zzgen.class);
    private zzgas zzb;
    private final boolean zzc;
    private final boolean zzf;

    public zzgen(zzgas zzgasVar, boolean z2, boolean z3) {
        super(zzgasVar.size());
        this.zzb = zzgasVar;
        this.zzc = z2;
        this.zzf = z3;
    }

    private final void zzG(int i2, Future future) {
        try {
            zzf(i2, zzggq.zza(future));
        } catch (ExecutionException e) {
            zzI(e.getCause());
        } catch (Throwable th) {
            zzI(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzx(zzgas zzgasVar) {
        int zzA = zzA();
        int i2 = 0;
        zzfxz.zzk(zzA >= 0, "Less than 0 remaining futures");
        if (zzA == 0) {
            if (zzgasVar != null) {
                zzgdd it = zzgasVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i2, future);
                    }
                    i2++;
                }
            }
            zzF();
            zzu();
            zzy(2);
        }
    }

    private final void zzI(Throwable th) {
        th.getClass();
        if (this.zzc && !zzd(th) && zzL(zzC(), th)) {
            zzJ(th);
        } else if (th instanceof Error) {
            zzJ(th);
        }
    }

    private static void zzJ(Throwable th) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", CreativeInfo.an, true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzK, reason: merged with bridge method [inline-methods] */
    public final void zzw(int i2, ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i2, listenableFuture);
            }
            zzx(null);
        } catch (Throwable th) {
            zzx(null);
            throw th;
        }
    }

    private static boolean zzL(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgec
    public final String zza() {
        zzgas zzgasVar = this.zzb;
        return zzgasVar != null ? "futures=".concat(zzgasVar.toString()) : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgec
    public final void zzb() {
        zzgas zzgasVar = this.zzb;
        zzy(1);
        if ((zzgasVar != null) && isCancelled()) {
            boolean zzt = zzt();
            zzgdd it = zzgasVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zzt);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzget
    public final void zze(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable zzl = zzl();
        Objects.requireNonNull(zzl);
        zzL(set, zzl);
    }

    public abstract void zzf(int i2, Object obj);

    public abstract void zzu();

    public final void zzv() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzu();
            return;
        }
        if (!this.zzc) {
            final zzgas zzgasVar = this.zzf ? this.zzb : null;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgem
                @Override // java.lang.Runnable
                public final void run() {
                    zzgen.this.zzx(zzgasVar);
                }
            };
            zzgdd it = this.zzb.iterator();
            while (it.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture) it.next();
                if (listenableFuture.isDone()) {
                    zzx(zzgasVar);
                } else {
                    listenableFuture.addListener(runnable, zzgfc.INSTANCE);
                }
            }
            return;
        }
        zzgdd it2 = this.zzb.iterator();
        final int i2 = 0;
        while (it2.hasNext()) {
            final ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
            int i3 = i2 + 1;
            if (listenableFuture2.isDone()) {
                zzw(i2, listenableFuture2);
            } else {
                listenableFuture2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgel
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzgen.this.zzw(i2, listenableFuture2);
                    }
                }, zzgfc.INSTANCE);
            }
            i2 = i3;
        }
    }

    public void zzy(int i2) {
        this.zzb = null;
    }
}
