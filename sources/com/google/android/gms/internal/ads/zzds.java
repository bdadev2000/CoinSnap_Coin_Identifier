package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final class zzds {
    private final zzdc zza;
    private final zzdm zzb;
    private final zzdq zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private final Object zzg;
    private boolean zzh;
    private boolean zzi;

    public zzds(Looper looper, zzdc zzdcVar, zzdq zzdqVar) {
        this(new CopyOnWriteArraySet(), looper, zzdcVar, zzdqVar, true);
    }

    public static /* synthetic */ boolean zzg(zzds zzdsVar, Message message) {
        Iterator it = zzdsVar.zzd.iterator();
        while (it.hasNext()) {
            ((zzdr) it.next()).zzb(zzdsVar.zzc);
            if (zzdsVar.zzb.zzg(1)) {
                break;
            }
        }
        return true;
    }

    private final void zzh() {
        if (this.zzi) {
            zzdb.zzf(Thread.currentThread() == this.zzb.zza().getThread());
        }
    }

    @CheckResult
    public final zzds zza(Looper looper, zzdq zzdqVar) {
        return new zzds(this.zzd, looper, this.zza, zzdqVar, this.zzi);
    }

    public final void zzb(Object obj) {
        synchronized (this.zzg) {
            if (this.zzh) {
                return;
            }
            this.zzd.add(new zzdr(obj));
        }
    }

    public final void zzc() {
        zzh();
        if (!this.zzf.isEmpty()) {
            if (!this.zzb.zzg(1)) {
                zzdm zzdmVar = this.zzb;
                zzdmVar.zzk(zzdmVar.zzb(1));
            }
            boolean z10 = !this.zze.isEmpty();
            this.zze.addAll(this.zzf);
            this.zzf.clear();
            if (!z10) {
                while (!this.zze.isEmpty()) {
                    ((Runnable) this.zze.peekFirst()).run();
                    this.zze.removeFirst();
                }
            }
        }
    }

    public final void zzd(final int i10, final zzdp zzdpVar) {
        zzh();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.zzd);
        this.zzf.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdo
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    zzdp zzdpVar2 = zzdpVar;
                    ((zzdr) it.next()).zza(i10, zzdpVar2);
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
            ((zzdr) it.next()).zzc(this.zzc);
        }
        this.zzd.clear();
    }

    public final void zzf(Object obj) {
        zzh();
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            zzdr zzdrVar = (zzdr) it.next();
            if (zzdrVar.zza.equals(obj)) {
                zzdrVar.zzc(this.zzc);
                this.zzd.remove(zzdrVar);
            }
        }
    }

    private zzds(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, zzdc zzdcVar, zzdq zzdqVar, boolean z10) {
        this.zza = zzdcVar;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzdqVar;
        this.zzg = new Object();
        this.zze = new ArrayDeque();
        this.zzf = new ArrayDeque();
        this.zzb = zzdcVar.zzd(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzdn
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                zzds.zzg(zzds.this, message);
                return true;
            }
        });
        this.zzi = z10;
    }
}
