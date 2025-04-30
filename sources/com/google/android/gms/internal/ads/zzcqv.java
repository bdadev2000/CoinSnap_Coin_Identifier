package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcqv {
    private final String zza;
    private final zzbqq zzb;
    private final Executor zzc;
    private zzcra zzd;
    private final zzblp zze = new zzcqs(this);
    private final zzblp zzf = new zzcqu(this);

    public zzcqv(String str, zzbqq zzbqqVar, Executor executor) {
        this.zza = str;
        this.zzb = zzbqqVar;
        this.zzc = executor;
    }

    public static /* bridge */ /* synthetic */ boolean zzg(zzcqv zzcqvVar, Map map) {
        if (map != null) {
            String str = (String) map.get("hashCode");
            if (!TextUtils.isEmpty(str) && str.equals(zzcqvVar.zza)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void zzc(zzcra zzcraVar) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcraVar;
    }

    public final void zzd(zzchd zzchdVar) {
        zzchdVar.zzag("/updateActiveView", this.zze);
        zzchdVar.zzag("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzchd zzchdVar) {
        zzchdVar.zzaz("/updateActiveView", this.zze);
        zzchdVar.zzaz("/untrackActiveViewUnit", this.zzf);
    }
}
