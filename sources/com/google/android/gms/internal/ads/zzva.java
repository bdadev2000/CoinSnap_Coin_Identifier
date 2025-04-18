package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class zzva {
    public final int zza;

    @Nullable
    public final zzur zzb;
    private final CopyOnWriteArrayList zzc;

    private zzva(CopyOnWriteArrayList copyOnWriteArrayList, int i10, @Nullable zzur zzurVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzurVar;
    }

    @CheckResult
    public final zzva zza(int i10, @Nullable zzur zzurVar) {
        return new zzva(this.zzc, 0, zzurVar);
    }

    public final void zzb(Handler handler, zzvb zzvbVar) {
        this.zzc.add(new zzuz(handler, zzvbVar));
    }

    public final void zzc(final zzun zzunVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzuz zzuzVar = (zzuz) it.next();
            final zzvb zzvbVar = zzuzVar.zzb;
            zzen.zzN(zzuzVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzuu
                @Override // java.lang.Runnable
                public final void run() {
                    zzvbVar.zzaf(0, zzva.this.zzb, zzunVar);
                }
            });
        }
    }

    public final void zzd(final zzui zzuiVar, final zzun zzunVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzuz zzuzVar = (zzuz) it.next();
            final zzvb zzvbVar = zzuzVar.zzb;
            zzen.zzN(zzuzVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzuy
                @Override // java.lang.Runnable
                public final void run() {
                    zzvbVar.zzag(0, zzva.this.zzb, zzuiVar, zzunVar);
                }
            });
        }
    }

    public final void zze(final zzui zzuiVar, final zzun zzunVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzuz zzuzVar = (zzuz) it.next();
            final zzvb zzvbVar = zzuzVar.zzb;
            zzen.zzN(zzuzVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzuw
                @Override // java.lang.Runnable
                public final void run() {
                    zzvbVar.zzah(0, zzva.this.zzb, zzuiVar, zzunVar);
                }
            });
        }
    }

    public final void zzf(final zzui zzuiVar, final zzun zzunVar, final IOException iOException, final boolean z10) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzuz zzuzVar = (zzuz) it.next();
            final zzvb zzvbVar = zzuzVar.zzb;
            zzen.zzN(zzuzVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzux
                @Override // java.lang.Runnable
                public final void run() {
                    zzvbVar.zzai(0, zzva.this.zzb, zzuiVar, zzunVar, iOException, z10);
                }
            });
        }
    }

    public final void zzg(final zzui zzuiVar, final zzun zzunVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzuz zzuzVar = (zzuz) it.next();
            final zzvb zzvbVar = zzuzVar.zzb;
            zzen.zzN(zzuzVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzuv
                @Override // java.lang.Runnable
                public final void run() {
                    zzvbVar.zzaj(0, zzva.this.zzb, zzuiVar, zzunVar);
                }
            });
        }
    }

    public final void zzh(zzvb zzvbVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzuz zzuzVar = (zzuz) it.next();
            if (zzuzVar.zzb == zzvbVar) {
                this.zzc.remove(zzuzVar);
            }
        }
    }

    public zzva() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
