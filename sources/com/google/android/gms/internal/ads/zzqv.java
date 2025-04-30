package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface zzqv {
    boolean zzA(zzan zzanVar);

    int zza(zzan zzanVar);

    long zzb(boolean z8);

    zzcl zzc();

    zzqa zzd(zzan zzanVar);

    void zze(zzan zzanVar, int i9, @Nullable int[] iArr) throws zzqq;

    void zzf();

    void zzg();

    void zzh();

    void zzi();

    void zzj() throws zzqu;

    void zzk();

    void zzl();

    void zzm(zzk zzkVar);

    void zzn(int i9);

    void zzo(zzl zzlVar);

    void zzp(zzer zzerVar);

    void zzq(zzqs zzqsVar);

    @RequiresApi(29)
    void zzr(int i9, int i10);

    void zzs(zzcl zzclVar);

    void zzt(@Nullable zzpj zzpjVar);

    @RequiresApi(23)
    void zzu(@Nullable AudioDeviceInfo audioDeviceInfo);

    void zzv(boolean z8);

    void zzw(float f9);

    boolean zzx(ByteBuffer byteBuffer, long j7, int i9) throws zzqr, zzqu;

    boolean zzy();

    boolean zzz();
}
