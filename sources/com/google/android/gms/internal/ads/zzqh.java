package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
/* loaded from: classes3.dex */
final class zzqh {
    public static void zza(AudioTrack audioTrack, @Nullable zzow zzowVar) {
        audioTrack.setPreferredDevice(zzowVar == null ? null : zzowVar.zza);
    }
}
