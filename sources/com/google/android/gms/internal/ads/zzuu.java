package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzuu implements zzvy, zzsp {
    final /* synthetic */ zzuw zza;
    private final Object zzb;
    private zzvx zzc;
    private zzso zzd;

    public zzuu(zzuw zzuwVar, Object obj) {
        this.zza = zzuwVar;
        this.zzc = zzuwVar.zze(null);
        this.zzd = zzuwVar.zzc(null);
        this.zzb = obj;
    }

    private final zzvk zzf(zzvk zzvkVar, @Nullable zzvo zzvoVar) {
        zzuw zzuwVar = this.zza;
        Object obj = this.zzb;
        long j7 = zzvkVar.zzc;
        zzuwVar.zzx(obj, j7, zzvoVar);
        zzuw zzuwVar2 = this.zza;
        Object obj2 = this.zzb;
        long j9 = zzvkVar.zzd;
        zzuwVar2.zzx(obj2, j9, zzvoVar);
        if (j7 == zzvkVar.zzc && j9 == zzvkVar.zzd) {
            return zzvkVar;
        }
        return new zzvk(1, zzvkVar.zza, zzvkVar.zzb, 0, null, j7, j9);
    }

    private final boolean zzg(int i9, @Nullable zzvo zzvoVar) {
        zzvo zzvoVar2;
        if (zzvoVar != null) {
            zzvoVar2 = this.zza.zzy(this.zzb, zzvoVar);
            if (zzvoVar2 == null) {
                return false;
            }
        } else {
            zzvoVar2 = null;
        }
        this.zza.zzw(this.zzb, 0);
        zzvx zzvxVar = this.zzc;
        int i10 = zzvxVar.zza;
        if (!zzgd.zzG(zzvxVar.zzb, zzvoVar2)) {
            this.zzc = this.zza.zzf(0, zzvoVar2);
        }
        zzso zzsoVar = this.zzd;
        int i11 = zzsoVar.zza;
        if (!zzgd.zzG(zzsoVar.zzb, zzvoVar2)) {
            this.zzd = this.zza.zzd(0, zzvoVar2);
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzae(int i9, @Nullable zzvo zzvoVar, zzvk zzvkVar) {
        if (zzg(0, zzvoVar)) {
            this.zzc.zzc(zzf(zzvkVar, zzvoVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzaf(int i9, @Nullable zzvo zzvoVar, zzvf zzvfVar, zzvk zzvkVar) {
        if (zzg(0, zzvoVar)) {
            this.zzc.zzd(zzvfVar, zzf(zzvkVar, zzvoVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzag(int i9, @Nullable zzvo zzvoVar, zzvf zzvfVar, zzvk zzvkVar) {
        if (zzg(0, zzvoVar)) {
            this.zzc.zze(zzvfVar, zzf(zzvkVar, zzvoVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzah(int i9, @Nullable zzvo zzvoVar, zzvf zzvfVar, zzvk zzvkVar, IOException iOException, boolean z8) {
        if (zzg(0, zzvoVar)) {
            this.zzc.zzf(zzvfVar, zzf(zzvkVar, zzvoVar), iOException, z8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzai(int i9, @Nullable zzvo zzvoVar, zzvf zzvfVar, zzvk zzvkVar) {
        if (zzg(0, zzvoVar)) {
            this.zzc.zzg(zzvfVar, zzf(zzvkVar, zzvoVar));
        }
    }
}
