package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes3.dex */
final class zzaix {
    public final zzaje zza;
    public final zzajh zzb;
    public final zzadx zzc;

    @Nullable
    public final zzady zzd;
    public int zze;

    public zzaix(zzaje zzajeVar, zzajh zzajhVar, zzadx zzadxVar) {
        zzady zzadyVar;
        this.zza = zzajeVar;
        this.zzb = zzajhVar;
        this.zzc = zzadxVar;
        if (MimeTypes.AUDIO_TRUEHD.equals(zzajeVar.zzf.zzo)) {
            zzadyVar = new zzady();
        } else {
            zzadyVar = null;
        }
        this.zzd = zzadyVar;
    }
}
