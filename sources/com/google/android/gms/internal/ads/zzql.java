package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes3.dex */
final class zzql {
    @DoNotInline
    public static void zza(AudioTrack audioTrack, @Nullable zzpa zzpaVar) {
        audioTrack.setPreferredDevice(zzpaVar == null ? null : zzpaVar.zza);
    }
}
