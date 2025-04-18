package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
final class zzeip implements zzdik {
    private final zzfgh zza;
    private final zzbrk zzb;
    private final AdFormat zzc;

    @Nullable
    private zzcys zzd = null;

    public zzeip(zzfgh zzfghVar, zzbrk zzbrkVar, AdFormat adFormat) {
        this.zza = zzfghVar;
        this.zzb = zzbrkVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zza(boolean z2, Context context, zzcyn zzcynVar) throws zzdij {
        boolean zzs;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int ordinal = this.zzc.ordinal();
            if (ordinal == 1) {
                zzs = this.zzb.zzs(ObjectWrapper.wrap(context));
            } else {
                if (ordinal != 2) {
                    if (ordinal == 5) {
                        zzs = this.zzb.zzr(ObjectWrapper.wrap(context));
                    }
                    throw new zzdij("Adapter failed to show.");
                }
                zzs = this.zzb.zzt(ObjectWrapper.wrap(context));
            }
            if (zzs) {
                if (this.zzd == null) {
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbz)).booleanValue() || this.zza.zzY != 2) {
                    return;
                }
                this.zzd.zza();
                return;
            }
            throw new zzdij("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdij(th);
        }
    }

    public final void zzb(zzcys zzcysVar) {
        this.zzd = zzcysVar;
    }
}
