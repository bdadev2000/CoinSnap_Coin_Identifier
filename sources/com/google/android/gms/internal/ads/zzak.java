package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzak {

    @Nullable
    private String zza;

    @Nullable
    private Uri zzb;
    private final zzal zzc = new zzal();
    private final List zzd;
    private final zzfzo zze;
    private final zzap zzf;
    private final zzat zzg;

    public zzak() {
        zzfzo.zzn();
        this.zzd = Collections.emptyList();
        this.zze = zzfzo.zzn();
        this.zzf = new zzap();
        this.zzg = zzat.zza;
    }

    public final zzak zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzak zzb(@Nullable Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final zzaw zzc() {
        zzar zzarVar;
        Uri uri = this.zzb;
        zzav zzavVar = null;
        if (uri != null) {
            zzarVar = new zzar(uri, null, null, null, this.zzd, null, this.zze, null, C.TIME_UNSET, null);
        } else {
            zzarVar = null;
        }
        String str = this.zza;
        if (str == null) {
            str = "";
        }
        return new zzaw(str, new zzan(this.zzc, zzavVar), zzarVar, new zzaq(this.zzf, zzavVar), zzba.zza, this.zzg, null);
    }
}
