package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class zzehv implements zzegq {
    private final Context zza;
    private final zzcrv zzb;
    private View zzc;
    private zzbpu zzd;

    public zzehv(Context context, zzcrv zzcrvVar) {
        this.zza = context;
        this.zzb = zzcrvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzegq
    public final /* bridge */ /* synthetic */ Object zza(zzfgt zzfgtVar, final zzfgh zzfghVar, final zzegn zzegnVar) throws zzfhj, zzeki {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhw)).booleanValue() && zzfghVar.zzag) {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfhj(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        view = (View) zzgfo.zzn(zzgfo.zzh(null), new zzgev() { // from class: com.google.android.gms.internal.ads.zzehs
                            @Override // com.google.android.gms.internal.ads.zzgev
                            public final ListenableFuture zza(Object obj) {
                                return zzehv.this.zzc(view, zzfghVar, obj);
                            }
                        }, zzcan.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfhj(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfhj(e2);
            }
        } else {
            view = this.zzc;
        }
        zzcqs zza = this.zzb.zza(new zzctu(zzfgtVar, zzfghVar, zzegnVar.zza), new zzcqy(view, null, new zzctc() { // from class: com.google.android.gms.internal.ads.zzehr
            @Override // com.google.android.gms.internal.ads.zzctc
            public final com.google.android.gms.ads.internal.client.zzeb zza() {
                try {
                    return ((zzbrk) zzegn.this.zzb).zze();
                } catch (RemoteException e3) {
                    throw new zzfhj(e3);
                }
            }
        }, (zzfgi) zzfghVar.zzu.get(0)));
        zza.zzg().zza(view);
        ((zzeig) zzegnVar.zzc).zzc(zza.zzj());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final void zzb(zzfgt zzfgtVar, zzfgh zzfghVar, zzegn zzegnVar) throws zzfhj {
        try {
            ((zzbrk) zzegnVar.zzb).zzq(zzfghVar.zzZ);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhw)).booleanValue() && zzfghVar.zzag) {
                ((zzbrk) zzegnVar.zzb).zzk(zzfghVar.zzU, zzfghVar.zzv.toString(), zzfgtVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehu(this, zzegnVar, null), (zzbpr) zzegnVar.zzc, zzfgtVar.zza.zza.zze);
            } else {
                ((zzbrk) zzegnVar.zzb).zzj(zzfghVar.zzU, zzfghVar.zzv.toString(), zzfgtVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehu(this, zzegnVar, null), (zzbpr) zzegnVar.zzc, zzfgtVar.zza.zza.zze);
            }
        } catch (RemoteException e) {
            throw new zzfhj(e);
        }
    }

    public final /* synthetic */ ListenableFuture zzc(View view, zzfgh zzfghVar, Object obj) throws Exception {
        return zzgfo.zzh(zzcsq.zza(this.zza, view, zzfghVar));
    }
}
