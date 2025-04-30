package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class zzvx {
    public final int zza;

    @Nullable
    public final zzvo zzb;
    private final CopyOnWriteArrayList zzc;

    private zzvx(CopyOnWriteArrayList copyOnWriteArrayList, int i9, @Nullable zzvo zzvoVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzvoVar;
    }

    @CheckResult
    public final zzvx zza(int i9, @Nullable zzvo zzvoVar) {
        return new zzvx(this.zzc, 0, zzvoVar);
    }

    public final void zzb(Handler handler, zzvy zzvyVar) {
        this.zzc.add(new zzvw(handler, zzvyVar));
    }

    public final void zzc(final zzvk zzvkVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzvw zzvwVar = (zzvw) it.next();
            final zzvy zzvyVar = zzvwVar.zzb;
            zzgd.zzO(zzvwVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzvr
                @Override // java.lang.Runnable
                public final void run() {
                    zzvyVar.zzae(0, zzvx.this.zzb, zzvkVar);
                }
            });
        }
    }

    public final void zzd(final zzvf zzvfVar, final zzvk zzvkVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzvw zzvwVar = (zzvw) it.next();
            final zzvy zzvyVar = zzvwVar.zzb;
            zzgd.zzO(zzvwVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzvv
                @Override // java.lang.Runnable
                public final void run() {
                    zzvyVar.zzaf(0, zzvx.this.zzb, zzvfVar, zzvkVar);
                }
            });
        }
    }

    public final void zze(final zzvf zzvfVar, final zzvk zzvkVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzvw zzvwVar = (zzvw) it.next();
            final zzvy zzvyVar = zzvwVar.zzb;
            zzgd.zzO(zzvwVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzvt
                @Override // java.lang.Runnable
                public final void run() {
                    zzvyVar.zzag(0, zzvx.this.zzb, zzvfVar, zzvkVar);
                }
            });
        }
    }

    public final void zzf(final zzvf zzvfVar, final zzvk zzvkVar, final IOException iOException, final boolean z8) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzvw zzvwVar = (zzvw) it.next();
            final zzvy zzvyVar = zzvwVar.zzb;
            zzgd.zzO(zzvwVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzvu
                @Override // java.lang.Runnable
                public final void run() {
                    zzvyVar.zzah(0, zzvx.this.zzb, zzvfVar, zzvkVar, iOException, z8);
                }
            });
        }
    }

    public final void zzg(final zzvf zzvfVar, final zzvk zzvkVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzvw zzvwVar = (zzvw) it.next();
            final zzvy zzvyVar = zzvwVar.zzb;
            zzgd.zzO(zzvwVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzvs
                @Override // java.lang.Runnable
                public final void run() {
                    zzvyVar.zzai(0, zzvx.this.zzb, zzvfVar, zzvkVar);
                }
            });
        }
    }

    public final void zzh(zzvy zzvyVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzvw zzvwVar = (zzvw) it.next();
            if (zzvwVar.zzb == zzvyVar) {
                this.zzc.remove(zzvwVar);
            }
        }
    }

    public zzvx() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
