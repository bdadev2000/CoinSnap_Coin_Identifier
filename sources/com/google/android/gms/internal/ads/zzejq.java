package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
final class zzejq implements zzdjp {
    private final zzfgt zza;
    private final zzbte zzb;
    private final AdFormat zzc;

    @Nullable
    private zzdad zzd = null;

    public zzejq(zzfgt zzfgtVar, zzbte zzbteVar, AdFormat adFormat) {
        this.zza = zzfgtVar;
        this.zzb = zzbteVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdjp
    public final void zza(boolean z8, Context context, zzczy zzczyVar) throws zzdjo {
        boolean zzs;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int ordinal = this.zzc.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 5) {
                        zzs = this.zzb.zzr(ObjectWrapper.wrap(context));
                    }
                    throw new zzdjo("Adapter failed to show.");
                }
                zzs = this.zzb.zzt(ObjectWrapper.wrap(context));
            } else {
                zzs = this.zzb.zzs(ObjectWrapper.wrap(context));
            }
            if (zzs) {
                if (this.zzd != null) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbx)).booleanValue() && this.zza.zzZ == 2) {
                        this.zzd.zza();
                        return;
                    }
                    return;
                }
                return;
            }
            throw new zzdjo("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdjo(th);
        }
    }

    public final void zzb(zzdad zzdadVar) {
        this.zzd = zzdadVar;
    }
}
