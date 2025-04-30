package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzag;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbmr;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzdmn;
import com.google.android.gms.internal.ads.zzdmp;
import com.google.android.gms.internal.ads.zzdwl;
import com.google.android.gms.internal.ads.zzeof;
import com.google.android.gms.internal.ads.zzfbt;
import com.google.android.gms.internal.ads.zzfbu;
import com.google.android.gms.internal.ads.zzfdh;
import com.google.android.gms.internal.ads.zzfey;
import com.google.android.gms.internal.ads.zzfgm;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class ClientApi extends zzcd {
    @KeepForSdk
    public ClientApi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String str, zzbrf zzbrfVar, int i9) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzeof(zzcjd.zzb(context, zzbrfVar, i9), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbrf zzbrfVar, int i9) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfbt zzt = zzcjd.zzb(context, zzbrfVar, i9).zzt();
        zzt.zza(str);
        zzt.zzb(context);
        zzfbu zzc = zzt.zzc();
        if (i9 >= ((Integer) zzba.zzc().zza(zzbep.zzfp)).intValue()) {
            return zzc.zza();
        }
        return new zzew();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbrf zzbrfVar, int i9) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfdh zzu = zzcjd.zzb(context, zzbrfVar, i9).zzu();
        zzu.zzc(context);
        zzu.zza(zzqVar);
        zzu.zzb(str);
        return zzu.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbrf zzbrfVar, int i9) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfey zzv = zzcjd.zzb(context, zzbrfVar, i9).zzv();
        zzv.zzc(context);
        zzv.zza(zzqVar);
        zzv.zzb(str);
        return zzv.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, int i9) {
        return new zzt((Context) ObjectWrapper.unwrap(iObjectWrapper), zzqVar, str, new VersionInfoParcel(241806000, i9, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper, int i9) {
        return zzcjd.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), null, i9).zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i9) {
        return zzcjd.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbrfVar, i9).zzm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbhz zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdmp((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), 241806000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbif zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdmn((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbmr zzk(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i9, zzbmo zzbmoVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzdwl zzk = zzcjd.zzb(context, zzbrfVar, i9).zzk();
        zzk.zzb(context);
        zzk.zza(zzbmoVar);
        return zzk.zzc().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbuz zzl(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i9) {
        return zzcjd.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbrfVar, i9).zzn();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbvg zzm(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel zza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (zza == null) {
            return new com.google.android.gms.ads.internal.overlay.zzu(activity);
        }
        int i9 = zza.zzk;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            return new com.google.android.gms.ads.internal.overlay.zzu(activity);
                        }
                        return new zzad(activity);
                    }
                    return new zzz(activity, zza);
                }
                return new zzag(activity);
            }
            return new zzaf(activity);
        }
        return new com.google.android.gms.ads.internal.overlay.zzt(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbyk zzn(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i9) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfgm zzw = zzcjd.zzb(context, zzbrfVar, i9).zzw();
        zzw.zzb(context);
        return zzw.zzc().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbza zzo(IObjectWrapper iObjectWrapper, String str, zzbrf zzbrfVar, int i9) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfgm zzw = zzcjd.zzb(context, zzbrfVar, i9).zzw();
        zzw.zzb(context);
        zzw.zza(str);
        return zzw.zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzcbg zzp(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i9) {
        return zzcjd.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbrfVar, i9).zzq();
    }
}
