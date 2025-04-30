package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes2.dex */
final class zzaki {
    public final zzakp zza;
    public final zzaks zzb;
    public final zzafa zzc;

    @Nullable
    public final zzafb zzd;
    public int zze;

    public zzaki(zzakp zzakpVar, zzaks zzaksVar, zzafa zzafaVar) {
        zzafb zzafbVar;
        this.zza = zzakpVar;
        this.zzb = zzaksVar;
        this.zzc = zzafaVar;
        if (MimeTypes.AUDIO_TRUEHD.equals(zzakpVar.zzf.zzn)) {
            zzafbVar = new zzafb();
        } else {
            zzafbVar = null;
        }
        this.zzd = zzafbVar;
    }
}
