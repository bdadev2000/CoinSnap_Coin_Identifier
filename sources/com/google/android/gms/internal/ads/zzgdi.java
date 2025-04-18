package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzgdi extends zzgdn {
    private static final zzger zza = new zzger(zzgdi.class);
    private zzfzj zzb;
    private final boolean zzc;
    private final boolean zzf;

    public zzgdi(zzfzj zzfzjVar, boolean z10, boolean z11) {
        super(zzfzjVar.size());
        this.zzb = zzfzjVar;
        this.zzc = z10;
        this.zzf = z11;
    }

    private final void zzG(int i10, Future future) {
        try {
            zzf(i10, zzgfj.zza(future));
        } catch (ExecutionException e2) {
            zzI(e2.getCause());
        } catch (Throwable th2) {
            zzI(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzx(zzfzj zzfzjVar) {
        boolean z10;
        int zzA = zzA();
        int i10 = 0;
        if (zzA >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfwq.zzl(z10, "Less than 0 remaining futures");
        if (zzA == 0) {
            if (zzfzjVar != null) {
                zzgbu it = zzfzjVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i10, future);
                    }
                    i10++;
                }
            }
            zzF();
            zzu();
            zzy(2);
        }
    }

    private final void zzI(Throwable th2) {
        th2.getClass();
        if (this.zzc && !zzd(th2) && zzL(zzC(), th2)) {
            zzJ(th2);
        } else if (th2 instanceof Error) {
            zzJ(th2);
        }
    }

    private static void zzJ(Throwable th2) {
        String str;
        if (true != (th2 instanceof Error)) {
            str = "Got more than one input Future failure. Logging failures after the first";
        } else {
            str = "Input Future failed with Error";
        }
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", str, th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzK, reason: merged with bridge method [inline-methods] */
    public final void zzw(int i10, ua.b bVar) {
        try {
            if (bVar.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i10, bVar);
            }
        } finally {
            zzx(null);
        }
    }

    private static boolean zzL(Set set, Throwable th2) {
        while (th2 != null) {
            if (!set.add(th2)) {
                return false;
            }
            th2 = th2.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final String zza() {
        zzfzj zzfzjVar = this.zzb;
        if (zzfzjVar != null) {
            return "futures=".concat(zzfzjVar.toString());
        }
        return super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final void zzb() {
        zzfzj zzfzjVar = this.zzb;
        boolean z10 = true;
        zzy(1);
        boolean isCancelled = isCancelled();
        if (zzfzjVar == null) {
            z10 = false;
        }
        if (z10 & isCancelled) {
            boolean zzt = zzt();
            zzgbu it = zzfzjVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zzt);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdn
    public final void zze(Set set) {
        set.getClass();
        if (!isCancelled()) {
            Throwable zzl = zzl();
            Objects.requireNonNull(zzl);
            zzL(set, zzl);
        }
    }

    public abstract void zzf(int i10, Object obj);

    public abstract void zzu();

    public final void zzv() {
        final zzfzj zzfzjVar;
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzu();
            return;
        }
        if (this.zzc) {
            zzgbu it = this.zzb.iterator();
            final int i10 = 0;
            while (it.hasNext()) {
                final ua.b bVar = (ua.b) it.next();
                int i11 = i10 + 1;
                if (bVar.isDone()) {
                    zzw(i10, bVar);
                } else {
                    bVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgdg
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzgdi.this.zzw(i10, bVar);
                        }
                    }, zzgdw.INSTANCE);
                }
                i10 = i11;
            }
            return;
        }
        if (this.zzf) {
            zzfzjVar = this.zzb;
        } else {
            zzfzjVar = null;
        }
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgdh
            @Override // java.lang.Runnable
            public final void run() {
                zzgdi.this.zzx(zzfzjVar);
            }
        };
        zzgbu it2 = this.zzb.iterator();
        while (it2.hasNext()) {
            ua.b bVar2 = (ua.b) it2.next();
            if (bVar2.isDone()) {
                zzx(zzfzjVar);
            } else {
                bVar2.addListener(runnable, zzgdw.INSTANCE);
            }
        }
    }

    public void zzy(int i10) {
        this.zzb = null;
    }
}
