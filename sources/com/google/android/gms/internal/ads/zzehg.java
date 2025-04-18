package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
final class zzehg implements zzdgv {
    private final zzfet zza;
    private final zzbrf zzb;
    private final AdFormat zzc;

    @Nullable
    private zzcxe zzd = null;

    public zzehg(zzfet zzfetVar, zzbrf zzbrfVar, AdFormat adFormat) {
        this.zza = zzfetVar;
        this.zzb = zzbrfVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zza(boolean z10, Context context, zzcwz zzcwzVar) throws zzdgu {
        boolean zzs;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int ordinal = this.zzc.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 5) {
                        zzs = this.zzb.zzr(ObjectWrapper.wrap(context));
                    }
                    throw new zzdgu("Adapter failed to show.");
                }
                zzs = this.zzb.zzt(ObjectWrapper.wrap(context));
            } else {
                zzs = this.zzb.zzs(ObjectWrapper.wrap(context));
            }
            if (zzs) {
                if (this.zzd != null) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbC)).booleanValue() && this.zza.zzY == 2) {
                        this.zzd.zza();
                        return;
                    }
                    return;
                }
                return;
            }
            throw new zzdgu("Adapter failed to show.");
        } catch (Throwable th2) {
            throw new zzdgu(th2);
        }
    }

    public final void zzb(zzcxe zzcxeVar) {
        this.zzd = zzcxeVar;
    }
}
