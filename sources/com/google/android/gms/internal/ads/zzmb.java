package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzmb implements zzvy, zzsp {
    final /* synthetic */ zzmf zza;
    private final zzmd zzb;

    public zzmb(zzmf zzmfVar, zzmd zzmdVar) {
        this.zza = zzmfVar;
        this.zzb = zzmdVar;
    }

    @Nullable
    private final Pair zzf(int i9, @Nullable zzvo zzvoVar) {
        zzvo zzvoVar2;
        zzvo zzvoVar3 = null;
        if (zzvoVar != null) {
            zzmd zzmdVar = this.zzb;
            int i10 = 0;
            while (true) {
                if (i10 < zzmdVar.zzc.size()) {
                    if (((zzvo) zzmdVar.zzc.get(i10)).zzd == zzvoVar.zzd) {
                        zzvoVar2 = zzvoVar.zza(Pair.create(zzmdVar.zzb, zzvoVar.zza));
                        break;
                    }
                    i10++;
                } else {
                    zzvoVar2 = null;
                    break;
                }
            }
            if (zzvoVar2 == null) {
                return null;
            }
            zzvoVar3 = zzvoVar2;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzvoVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzae(int i9, @Nullable zzvo zzvoVar, final zzvk zzvkVar) {
        zzfb zzfbVar;
        final Pair zzf = zzf(0, zzvoVar);
        if (zzf != null) {
            zzfbVar = this.zza.zzi;
            zzfbVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlz
                @Override // java.lang.Runnable
                public final void run() {
                    zzmx zzmxVar;
                    Pair pair = zzf;
                    zzmxVar = zzmb.this.zza.zzh;
                    zzmxVar.zzae(((Integer) pair.first).intValue(), (zzvo) pair.second, zzvkVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzaf(int i9, @Nullable zzvo zzvoVar, final zzvf zzvfVar, final zzvk zzvkVar) {
        zzfb zzfbVar;
        final Pair zzf = zzf(0, zzvoVar);
        if (zzf != null) {
            zzfbVar = this.zza.zzi;
            zzfbVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlx
                @Override // java.lang.Runnable
                public final void run() {
                    zzmx zzmxVar;
                    Pair pair = zzf;
                    zzmxVar = zzmb.this.zza.zzh;
                    zzmxVar.zzaf(((Integer) pair.first).intValue(), (zzvo) pair.second, zzvfVar, zzvkVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzag(int i9, @Nullable zzvo zzvoVar, final zzvf zzvfVar, final zzvk zzvkVar) {
        zzfb zzfbVar;
        final Pair zzf = zzf(0, zzvoVar);
        if (zzf != null) {
            zzfbVar = this.zza.zzi;
            zzfbVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzma
                @Override // java.lang.Runnable
                public final void run() {
                    zzmx zzmxVar;
                    Pair pair = zzf;
                    zzmxVar = zzmb.this.zza.zzh;
                    zzmxVar.zzag(((Integer) pair.first).intValue(), (zzvo) pair.second, zzvfVar, zzvkVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzah(int i9, @Nullable zzvo zzvoVar, final zzvf zzvfVar, final zzvk zzvkVar, final IOException iOException, final boolean z8) {
        zzfb zzfbVar;
        final Pair zzf = zzf(0, zzvoVar);
        if (zzf != null) {
            zzfbVar = this.zza.zzi;
            zzfbVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlw
                @Override // java.lang.Runnable
                public final void run() {
                    zzmx zzmxVar;
                    Pair pair = zzf;
                    zzmxVar = zzmb.this.zza.zzh;
                    zzmxVar.zzah(((Integer) pair.first).intValue(), (zzvo) pair.second, zzvfVar, zzvkVar, iOException, z8);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzai(int i9, @Nullable zzvo zzvoVar, final zzvf zzvfVar, final zzvk zzvkVar) {
        zzfb zzfbVar;
        final Pair zzf = zzf(0, zzvoVar);
        if (zzf != null) {
            zzfbVar = this.zza.zzi;
            zzfbVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzly
                @Override // java.lang.Runnable
                public final void run() {
                    zzmx zzmxVar;
                    Pair pair = zzf;
                    zzmxVar = zzmb.this.zza.zzh;
                    zzmxVar.zzai(((Integer) pair.first).intValue(), (zzvo) pair.second, zzvfVar, zzvkVar);
                }
            });
        }
    }
}
