package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.MotionEventCompat;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface zzsn {
    int zza();

    int zzb(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzc();

    @Nullable
    ByteBuffer zzf(int i10);

    @Nullable
    ByteBuffer zzg(int i10);

    @RequiresApi(MotionEventCompat.AXIS_GENERIC_4)
    void zzi();

    void zzj();

    void zzk(int i10, int i11, int i12, long j3, int i13);

    void zzl(int i10, int i11, zzhj zzhjVar, long j3, int i12);

    void zzm();

    void zzn(int i10, long j3);

    void zzo(int i10, boolean z10);

    @RequiresApi(23)
    void zzp(Surface surface);

    void zzq(Bundle bundle);

    void zzr(int i10);

    boolean zzs(zzsm zzsmVar);
}
