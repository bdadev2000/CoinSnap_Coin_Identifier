package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaw {

    @Nullable
    private String zza;

    @Nullable
    private Uri zzb;
    private final zzay zzc = new zzay();
    private final zzbf zzd = new zzbf(null);
    private final List zze = Collections.emptyList();
    private final zzgbc zzf = zzgbc.zzm();
    private final zzbi zzg = new zzbi();
    private final zzbq zzh = zzbq.zza;

    public final zzaw zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzaw zzb(@Nullable Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final zzbu zzc() {
        zzbn zzbnVar;
        Uri uri = this.zzb;
        if (uri != null) {
            zzbnVar = new zzbn(uri, null, null, null, this.zze, null, this.zzf, null, C.TIME_UNSET, null);
        } else {
            zzbnVar = null;
        }
        String str = this.zza;
        if (str == null) {
            str = "";
        }
        return new zzbu(str, new zzbc(this.zzc, null), zzbnVar, new zzbk(this.zzg), zzca.zza, this.zzh, null);
    }
}
