package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class zzyj {

    @Nullable
    private zzyi zza;

    @Nullable
    private zzyr zzb;

    @Nullable
    public zzlp zze() {
        throw null;
    }

    @CallSuper
    public void zzj() {
        this.zza = null;
        this.zzb = null;
    }

    public void zzk(zzg zzgVar) {
        throw null;
    }

    public boolean zzn() {
        throw null;
    }

    public abstract zzyk zzo(zzlq[] zzlqVarArr, zzwr zzwrVar, zzur zzurVar, zzbv zzbvVar) throws zzig;

    public abstract void zzp(@Nullable Object obj);

    public final zzyr zzq() {
        zzyr zzyrVar = this.zzb;
        zzdb.zzb(zzyrVar);
        return zzyrVar;
    }

    @CallSuper
    public final void zzr(zzyi zzyiVar, zzyr zzyrVar) {
        this.zza = zzyiVar;
        this.zzb = zzyrVar;
    }

    public final void zzs() {
        zzyi zzyiVar = this.zza;
        if (zzyiVar != null) {
            zzyiVar.zzj();
        }
    }
}
