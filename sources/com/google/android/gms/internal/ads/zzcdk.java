package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public abstract class zzcdk extends TextureView implements zzceh {
    protected final zzcdy zza;
    protected final zzcei zzb;

    public zzcdk(Context context) {
        super(context);
        this.zza = new zzcdy();
        this.zzb = new zzcei(context, this);
    }

    public void zzA(int i9) {
    }

    public void zzB(int i9) {
    }

    public void zzC(@Nullable String str, @Nullable String[] strArr, @Nullable Integer num) {
        zzs(str);
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract int zzc();

    public abstract int zzd();

    public abstract int zze();

    public abstract long zzf();

    public abstract long zzg();

    public abstract long zzh();

    public abstract String zzj();

    public abstract void zzn();

    public abstract void zzo();

    public abstract void zzp();

    public abstract void zzq(int i9);

    public abstract void zzr(zzcdj zzcdjVar);

    public abstract void zzs(@Nullable String str);

    public abstract void zzt();

    public abstract void zzu(float f9, float f10);

    @Nullable
    public Integer zzw() {
        return null;
    }

    public void zzx(int i9) {
    }

    public void zzy(int i9) {
    }

    public void zzz(int i9) {
    }
}
