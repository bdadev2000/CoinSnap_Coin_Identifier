package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public abstract class zzyr {

    @Nullable
    private zzyq zza;

    @Nullable
    private zzyz zzb;

    @Nullable
    public zzlt zze() {
        throw null;
    }

    @CallSuper
    public void zzj() {
        this.zza = null;
        this.zzb = null;
    }

    public void zzk(zzh zzhVar) {
        throw null;
    }

    public boolean zzn() {
        throw null;
    }

    public abstract zzys zzo(zzlu[] zzluVarArr, zzwy zzwyVar, zzuy zzuyVar, zzcc zzccVar) throws zzij;

    public abstract void zzp(@Nullable Object obj);

    public final zzyz zzq() {
        zzyz zzyzVar = this.zzb;
        zzdi.zzb(zzyzVar);
        return zzyzVar;
    }

    @CallSuper
    public final void zzr(zzyq zzyqVar, zzyz zzyzVar) {
        this.zza = zzyqVar;
        this.zzb = zzyzVar;
    }

    public final void zzs() {
        zzyq zzyqVar = this.zza;
        if (zzyqVar != null) {
            zzyqVar.zzi();
        }
    }
}
