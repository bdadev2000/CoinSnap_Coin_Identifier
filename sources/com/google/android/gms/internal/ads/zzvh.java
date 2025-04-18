package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class zzvh {
    public final int zza;

    @Nullable
    public final zzuy zzb;
    private final CopyOnWriteArrayList zzc;

    private zzvh(CopyOnWriteArrayList copyOnWriteArrayList, int i2, @Nullable zzuy zzuyVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzuyVar;
    }

    @CheckResult
    public final zzvh zza(int i2, @Nullable zzuy zzuyVar) {
        return new zzvh(this.zzc, 0, zzuyVar);
    }

    public final void zzb(Handler handler, zzvi zzviVar) {
        this.zzc.add(new zzvg(handler, zzviVar));
    }

    public final void zzc(final zzuu zzuuVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzvg zzvgVar = (zzvg) it.next();
            final zzvi zzviVar = zzvgVar.zzb;
            zzeu.zzM(zzvgVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzvb
                @Override // java.lang.Runnable
                public final void run() {
                    zzviVar.zzae(0, zzvh.this.zzb, zzuuVar);
                }
            });
        }
    }

    public final void zzd(final zzup zzupVar, final zzuu zzuuVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzvg zzvgVar = (zzvg) it.next();
            final zzvi zzviVar = zzvgVar.zzb;
            zzeu.zzM(zzvgVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzvf
                @Override // java.lang.Runnable
                public final void run() {
                    zzviVar.zzaf(0, zzvh.this.zzb, zzupVar, zzuuVar);
                }
            });
        }
    }

    public final void zze(final zzup zzupVar, final zzuu zzuuVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzvg zzvgVar = (zzvg) it.next();
            final zzvi zzviVar = zzvgVar.zzb;
            zzeu.zzM(zzvgVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzvd
                @Override // java.lang.Runnable
                public final void run() {
                    zzviVar.zzag(0, zzvh.this.zzb, zzupVar, zzuuVar);
                }
            });
        }
    }

    public final void zzf(final zzup zzupVar, final zzuu zzuuVar, final IOException iOException, final boolean z2) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzvg zzvgVar = (zzvg) it.next();
            final zzvi zzviVar = zzvgVar.zzb;
            zzeu.zzM(zzvgVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzve
                @Override // java.lang.Runnable
                public final void run() {
                    zzviVar.zzah(0, zzvh.this.zzb, zzupVar, zzuuVar, iOException, z2);
                }
            });
        }
    }

    public final void zzg(final zzup zzupVar, final zzuu zzuuVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzvg zzvgVar = (zzvg) it.next();
            final zzvi zzviVar = zzvgVar.zzb;
            zzeu.zzM(zzvgVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzvc
                @Override // java.lang.Runnable
                public final void run() {
                    zzviVar.zzai(0, zzvh.this.zzb, zzupVar, zzuuVar);
                }
            });
        }
    }

    public final void zzh(zzvi zzviVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzvg zzvgVar = (zzvg) it.next();
            if (zzvgVar.zzb == zzviVar) {
                this.zzc.remove(zzvgVar);
            }
        }
    }

    public zzvh() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
