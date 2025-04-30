package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzges extends zzgey {
    private static final zzggd zza = new zzggd(zzges.class);
    private zzgax zzb;
    private final boolean zzc;
    private final boolean zzf;

    public zzges(zzgax zzgaxVar, boolean z8, boolean z9) {
        super(zzgaxVar.size());
        this.zzb = zzgaxVar;
        this.zzc = z8;
        this.zzf = z9;
    }

    private final void zzG(int i9, Future future) {
        try {
            zzf(i9, zzgft.zzp(future));
        } catch (ExecutionException e4) {
            zzI(e4.getCause());
        } catch (Throwable th) {
            zzI(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzx(zzgax zzgaxVar) {
        boolean z8;
        int zzA = zzA();
        int i9 = 0;
        if (zzA >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzfyg.zzk(z8, "Less than 0 remaining futures");
        if (zzA == 0) {
            if (zzgaxVar != null) {
                zzgdi it = zzgaxVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i9, future);
                    }
                    i9++;
                }
            }
            zzF();
            zzu();
            zzy(2);
        }
    }

    private final void zzI(Throwable th) {
        th.getClass();
        if (this.zzc && !zzd(th) && zzK(zzC(), th)) {
            zzJ(th);
        } else if (th instanceof Error) {
            zzJ(th);
        }
    }

    private static void zzJ(Throwable th) {
        String str;
        if (true != (th instanceof Error)) {
            str = "Got more than one input Future failure. Logging failures after the first";
        } else {
            str = "Input Future failed with Error";
        }
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", str, th);
    }

    private static boolean zzK(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final String zza() {
        zzgax zzgaxVar = this.zzb;
        if (zzgaxVar != null) {
            return "futures=".concat(zzgaxVar.toString());
        }
        return super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final void zzb() {
        zzgax zzgaxVar = this.zzb;
        boolean z8 = true;
        zzy(1);
        boolean isCancelled = isCancelled();
        if (zzgaxVar == null) {
            z8 = false;
        }
        if (z8 & isCancelled) {
            boolean zzt = zzt();
            zzgdi it = zzgaxVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zzt);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgey
    public final void zze(Set set) {
        set.getClass();
        if (!isCancelled()) {
            Throwable zzl = zzl();
            Objects.requireNonNull(zzl);
            zzK(set, zzl);
        }
    }

    public abstract void zzf(int i9, Object obj);

    public abstract void zzu();

    public final void zzv() {
        final zzgax zzgaxVar;
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzu();
            return;
        }
        if (this.zzc) {
            zzgdi it = this.zzb.iterator();
            final int i9 = 0;
            while (it.hasNext()) {
                final f4.c cVar = (f4.c) it.next();
                cVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgeq
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzges.this.zzw(cVar, i9);
                    }
                }, zzgfh.INSTANCE);
                i9++;
            }
            return;
        }
        if (this.zzf) {
            zzgaxVar = this.zzb;
        } else {
            zzgaxVar = null;
        }
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzger
            @Override // java.lang.Runnable
            public final void run() {
                zzges.this.zzx(zzgaxVar);
            }
        };
        zzgdi it2 = this.zzb.iterator();
        while (it2.hasNext()) {
            ((f4.c) it2.next()).addListener(runnable, zzgfh.INSTANCE);
        }
    }

    public final /* synthetic */ void zzw(f4.c cVar, int i9) {
        try {
            if (cVar.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i9, cVar);
            }
            zzx(null);
        } catch (Throwable th) {
            zzx(null);
            throw th;
        }
    }

    public void zzy(int i9) {
        this.zzb = null;
    }
}
