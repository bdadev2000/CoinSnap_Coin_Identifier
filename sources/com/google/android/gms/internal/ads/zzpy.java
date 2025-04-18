package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface zzpy {
    boolean zzA(zzaf zzafVar);

    int zza(zzaf zzafVar);

    long zzb(boolean z2);

    zzbq zzc();

    zzpd zzd(zzaf zzafVar);

    void zze(zzaf zzafVar, int i2, @Nullable int[] iArr) throws zzpt;

    void zzf();

    void zzg();

    void zzh();

    void zzi();

    void zzj() throws zzpx;

    void zzk();

    void zzl();

    void zzm(zzh zzhVar);

    void zzn(int i2);

    void zzo(zzi zziVar);

    void zzp(zzdj zzdjVar);

    void zzq(zzpv zzpvVar);

    @RequiresApi
    void zzr(int i2, int i3);

    void zzs(zzbq zzbqVar);

    void zzt(@Nullable zzom zzomVar);

    @RequiresApi
    void zzu(@Nullable AudioDeviceInfo audioDeviceInfo);

    void zzv(boolean z2);

    void zzw(float f2);

    boolean zzx(ByteBuffer byteBuffer, long j2, int i2) throws zzpu, zzpx;

    boolean zzy();

    boolean zzz();
}
