package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final class zzeiw implements zzehr {
    private final Context zza;
    private final zzctg zzb;
    private View zzc;
    private zzbro zzd;

    public zzeiw(Context context, zzctg zzctgVar) {
        this.zza = context;
        this.zzb = zzctgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final /* bridge */ /* synthetic */ Object zza(zzfhf zzfhfVar, final zzfgt zzfgtVar, final zzeho zzehoVar) throws zzfhv, zzelj {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhU)).booleanValue() && zzfgtVar.zzah) {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view != null) {
                    if (zzf) {
                        try {
                            view = (View) zzgft.zzn(zzgft.zzh(null), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeit
                                @Override // com.google.android.gms.internal.ads.zzgfa
                                public final f4.c zza(Object obj) {
                                    return zzeiw.this.zzc(view, zzfgtVar, obj);
                                }
                            }, zzcci.zze).get();
                        } catch (InterruptedException | ExecutionException e4) {
                            throw new zzfhv(e4);
                        }
                    }
                } else {
                    throw new zzfhv(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
            } catch (RemoteException e9) {
                throw new zzfhv(e9);
            }
        } else {
            view = this.zzc;
        }
        zzcsg zza = this.zzb.zza(new zzcvf(zzfhfVar, zzfgtVar, zzehoVar.zza), new zzcsm(view, null, new zzcun() { // from class: com.google.android.gms.internal.ads.zzeis
            @Override // com.google.android.gms.internal.ads.zzcun
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                try {
                    return ((zzbte) zzeho.this.zzb).zze();
                } catch (RemoteException e10) {
                    throw new zzfhv(e10);
                }
            }
        }, (zzfgu) zzfgtVar.zzv.get(0)));
        zza.zzg().zza(view);
        ((zzejh) zzehoVar.zzc).zzc(zza.zzj());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final void zzb(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv {
        try {
            ((zzbte) zzehoVar.zzb).zzq(zzfgtVar.zzaa);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhU)).booleanValue() && zzfgtVar.zzah) {
                ((zzbte) zzehoVar.zzb).zzk(zzfgtVar.zzV, zzfgtVar.zzw.toString(), zzfhfVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeiv(this, zzehoVar, null), (zzbrl) zzehoVar.zzc, zzfhfVar.zza.zza.zze);
            } else {
                ((zzbte) zzehoVar.zzb).zzj(zzfgtVar.zzV, zzfgtVar.zzw.toString(), zzfhfVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeiv(this, zzehoVar, null), (zzbrl) zzehoVar.zzc, zzfhfVar.zza.zza.zze);
            }
        } catch (RemoteException e4) {
            throw new zzfhv(e4);
        }
    }

    public final /* synthetic */ f4.c zzc(View view, zzfgt zzfgtVar, Object obj) throws Exception {
        return zzgft.zzh(zzcub.zza(this.zza, view, zzfgtVar));
    }
}
