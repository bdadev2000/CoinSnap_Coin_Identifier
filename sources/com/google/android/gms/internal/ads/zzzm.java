package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public abstract class zzzm {

    @Nullable
    private zzzl zza;

    @Nullable
    private zzzu zzb;

    @Nullable
    public zzmo zze() {
        throw null;
    }

    @CallSuper
    public void zzj() {
        this.zza = null;
        this.zzb = null;
    }

    public void zzk(zzk zzkVar) {
        throw null;
    }

    public boolean zzn() {
        throw null;
    }

    public abstract zzzn zzp(zzmp[] zzmpVarArr, zzxr zzxrVar, zzvo zzvoVar, zzdc zzdcVar) throws zzjh;

    public abstract void zzq(@Nullable Object obj);

    public final zzzu zzr() {
        zzzu zzzuVar = this.zzb;
        zzeq.zzb(zzzuVar);
        return zzzuVar;
    }

    @CallSuper
    public final void zzs(zzzl zzzlVar, zzzu zzzuVar) {
        this.zza = zzzlVar;
        this.zzb = zzzuVar;
    }

    public final void zzt() {
        zzzl zzzlVar = this.zza;
        if (zzzlVar != null) {
            zzzlVar.zzj();
        }
    }
}
