package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class zzcbl extends TextureView implements zzcci {
    protected final zzcbz zza;
    protected final zzccj zzb;

    public zzcbl(Context context) {
        super(context);
        this.zza = new zzcbz();
        this.zzb = new zzccj(context, this);
    }

    public void zzA(int i10) {
    }

    public void zzB(int i10) {
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

    public abstract void zzq(int i10);

    public abstract void zzr(zzcbk zzcbkVar);

    public abstract void zzs(@Nullable String str);

    public abstract void zzt();

    public abstract void zzu(float f10, float f11);

    @Nullable
    public Integer zzw() {
        return null;
    }

    public void zzx(int i10) {
    }

    public void zzy(int i10) {
    }

    public void zzz(int i10) {
    }
}
