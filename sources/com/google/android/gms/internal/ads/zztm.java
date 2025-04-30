package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface zztm {
    int zza();

    int zzb(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzc();

    @Nullable
    ByteBuffer zzf(int i9);

    @Nullable
    ByteBuffer zzg(int i9);

    void zzi();

    void zzj(int i9, int i10, int i11, long j7, int i12);

    void zzk(int i9, int i10, zzik zzikVar, long j7, int i11);

    void zzl();

    @RequiresApi(21)
    void zzm(int i9, long j7);

    void zzn(int i9, boolean z8);

    @RequiresApi(23)
    void zzo(Surface surface);

    void zzp(Bundle bundle);

    void zzq(int i9);
}
