package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class zzfh {
    private final zzer zza;
    private final zzfb zzb;
    private final zzff zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private final Object zzg;
    private boolean zzh;
    private boolean zzi;

    public zzfh(Looper looper, zzer zzerVar, zzff zzffVar) {
        this(new CopyOnWriteArraySet(), looper, zzerVar, zzffVar, true);
    }

    public static /* synthetic */ boolean zzg(zzfh zzfhVar, Message message) {
        Iterator it = zzfhVar.zzd.iterator();
        while (it.hasNext()) {
            ((zzfg) it.next()).zzb(zzfhVar.zzc);
            if (zzfhVar.zzb.zzg(0)) {
                return true;
            }
        }
        return true;
    }

    private final void zzh() {
        boolean z8;
        if (!this.zzi) {
            return;
        }
        if (Thread.currentThread() == this.zzb.zza().getThread()) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzf(z8);
    }

    @CheckResult
    public final zzfh zza(Looper looper, zzff zzffVar) {
        return new zzfh(this.zzd, looper, this.zza, zzffVar, this.zzi);
    }

    public final void zzb(Object obj) {
        synchronized (this.zzg) {
            try {
                if (this.zzh) {
                    return;
                }
                this.zzd.add(new zzfg(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc() {
        zzh();
        if (!this.zzf.isEmpty()) {
            if (!this.zzb.zzg(0)) {
                zzfb zzfbVar = this.zzb;
                zzfbVar.zzk(zzfbVar.zzb(0));
            }
            boolean z8 = !this.zze.isEmpty();
            this.zze.addAll(this.zzf);
            this.zzf.clear();
            if (!z8) {
                while (!this.zze.isEmpty()) {
                    ((Runnable) this.zze.peekFirst()).run();
                    this.zze.removeFirst();
                }
            }
        }
    }

    public final void zzd(final int i9, final zzfe zzfeVar) {
        zzh();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.zzd);
        this.zzf.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfd
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    zzfe zzfeVar2 = zzfeVar;
                    ((zzfg) it.next()).zza(i9, zzfeVar2);
                }
            }
        });
    }

    public final void zze() {
        zzh();
        synchronized (this.zzg) {
            this.zzh = true;
        }
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzfg) it.next()).zzc(this.zzc);
        }
        this.zzd.clear();
    }

    public final void zzf(Object obj) {
        zzh();
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            zzfg zzfgVar = (zzfg) it.next();
            if (zzfgVar.zza.equals(obj)) {
                zzfgVar.zzc(this.zzc);
                this.zzd.remove(zzfgVar);
            }
        }
    }

    private zzfh(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, zzer zzerVar, zzff zzffVar, boolean z8) {
        this.zza = zzerVar;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzffVar;
        this.zzg = new Object();
        this.zze = new ArrayDeque();
        this.zzf = new ArrayDeque();
        this.zzb = zzerVar.zzb(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzfc
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                zzfh.zzg(zzfh.this, message);
                return true;
            }
        });
        this.zzi = z8;
    }
}
