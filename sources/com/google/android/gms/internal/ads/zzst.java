package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface zzst {
    int zza();

    int zzb(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzc();

    @Nullable
    ByteBuffer zzf(int i2);

    @Nullable
    ByteBuffer zzg(int i2);

    @RequiresApi
    void zzi();

    void zzj();

    void zzk(int i2, int i3, int i4, long j2, int i5);

    void zzl(int i2, int i3, zzhn zzhnVar, long j2, int i4);

    void zzm();

    void zzn(int i2, long j2);

    void zzo(int i2, boolean z2);

    @RequiresApi
    void zzp(Surface surface);

    void zzq(Bundle bundle);

    void zzr(int i2);

    boolean zzs(zzss zzssVar);
}
