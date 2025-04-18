package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.vungle.ads.internal.protos.n;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface zzpu {
    boolean zzA(zzad zzadVar);

    int zza(zzad zzadVar);

    long zzb(boolean z10);

    zzbj zzc();

    zzoz zzd(zzad zzadVar);

    void zze(zzad zzadVar, int i10, @Nullable int[] iArr) throws zzpp;

    void zzf();

    void zzg();

    void zzh();

    void zzi();

    void zzj() throws zzpt;

    void zzk();

    void zzl();

    void zzm(zzg zzgVar);

    void zzn(int i10);

    void zzo(zzh zzhVar);

    void zzp(zzdc zzdcVar);

    void zzq(zzpr zzprVar);

    @RequiresApi(n.NOTIFICATION_REDIRECT_VALUE)
    void zzr(int i10, int i11);

    void zzs(zzbj zzbjVar);

    void zzt(@Nullable zzoj zzojVar);

    @RequiresApi(23)
    void zzu(@Nullable AudioDeviceInfo audioDeviceInfo);

    void zzv(boolean z10);

    void zzw(float f10);

    boolean zzx(ByteBuffer byteBuffer, long j3, int i10) throws zzpq, zzpt;

    boolean zzy();

    boolean zzz();
}
