package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class zzegm implements zzefh {
    private final Context zza;
    private final zzcqh zzb;
    private View zzc;
    private zzbpp zzd;

    public zzegm(Context context, zzcqh zzcqhVar) {
        this.zza = context;
        this.zzb = zzcqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final /* bridge */ /* synthetic */ Object zza(zzfff zzfffVar, final zzfet zzfetVar, final zzefe zzefeVar) throws zzffv, zzeiz {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhy)).booleanValue() && zzfetVar.zzag) {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view != null) {
                    if (zzf) {
                        try {
                            view = (View) zzgei.zzn(zzgei.zzh(null), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzegj
                                @Override // com.google.android.gms.internal.ads.zzgdp
                                public final ua.b zza(Object obj) {
                                    return zzegm.this.zzc(view, zzfetVar, obj);
                                }
                            }, zzcaj.zze).get();
                        } catch (InterruptedException | ExecutionException e2) {
                            throw new zzffv(e2);
                        }
                    }
                } else {
                    throw new zzffv(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
            } catch (RemoteException e10) {
                throw new zzffv(e10);
            }
        } else {
            view = this.zzc;
        }
        zzcpe zza = this.zzb.zza(new zzcsg(zzfffVar, zzfetVar, zzefeVar.zza), new zzcpk(view, null, new zzcro() { // from class: com.google.android.gms.internal.ads.zzegi
            @Override // com.google.android.gms.internal.ads.zzcro
            public final com.google.android.gms.ads.internal.client.zzeb zza() {
                try {
                    return ((zzbrf) zzefe.this.zzb).zze();
                } catch (RemoteException e11) {
                    throw new zzffv(e11);
                }
            }
        }, (zzfeu) zzfetVar.zzu.get(0)));
        zza.zzg().zza(view);
        ((zzegx) zzefeVar.zzc).zzc(zza.zzj());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final void zzb(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv {
        try {
            ((zzbrf) zzefeVar.zzb).zzq(zzfetVar.zzZ);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhy)).booleanValue() && zzfetVar.zzag) {
                ((zzbrf) zzefeVar.zzb).zzk(zzfetVar.zzU, zzfetVar.zzv.toString(), zzfffVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzegk(this, zzefeVar, null), (zzbpm) zzefeVar.zzc, zzfffVar.zza.zza.zze);
            } else {
                ((zzbrf) zzefeVar.zzb).zzj(zzfetVar.zzU, zzfetVar.zzv.toString(), zzfffVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzegk(this, zzefeVar, null), (zzbpm) zzefeVar.zzc, zzfffVar.zza.zza.zze);
            }
        } catch (RemoteException e2) {
            throw new zzffv(e2);
        }
    }

    public final /* synthetic */ ua.b zzc(View view, zzfet zzfetVar, Object obj) throws Exception {
        return zzgei.zzh(zzcrc.zza(this.zza, view, zzfetVar));
    }
}
