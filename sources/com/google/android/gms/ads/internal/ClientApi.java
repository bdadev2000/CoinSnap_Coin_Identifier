package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzcz;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzab;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzah;
import com.google.android.gms.ads.internal.overlay.zzai;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzbkt;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbsz;
import com.google.android.gms.internal.ads.zzbtg;
import com.google.android.gms.internal.ads.zzbwm;
import com.google.android.gms.internal.ads.zzbxc;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzchk;
import com.google.android.gms.internal.ads.zzdjs;
import com.google.android.gms.internal.ads.zzdju;
import com.google.android.gms.internal.ads.zzdtv;
import com.google.android.gms.internal.ads.zzelv;
import com.google.android.gms.internal.ads.zzezt;
import com.google.android.gms.internal.ads.zzfbh;
import com.google.android.gms.internal.ads.zzfcy;
import com.google.android.gms.internal.ads.zzfem;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class ClientApi extends zzco {
    @KeepForSdk
    public ClientApi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbu zzb(IObjectWrapper iObjectWrapper, String str, zzbpg zzbpgVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzelv(zzchk.zzb(context, zzbpgVar, i10), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzc(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, String str, zzbpg zzbpgVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzezt zzt = zzchk.zzb(context, zzbpgVar, i10).zzt();
        zzt.zza(str);
        zzt.zzb(context);
        return zzt.zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzd(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, String str, zzbpg zzbpgVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfbh zzu = zzchk.zzb(context, zzbpgVar, i10).zzu();
        zzu.zzc(context);
        zzu.zza(zzsVar);
        zzu.zzb(str);
        return zzu.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, String str, zzbpg zzbpgVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfcy zzv = zzchk.zzb(context, zzbpgVar, i10).zzv();
        zzv.zzc(context);
        zzv.zza(zzsVar);
        zzv.zzb(str);
        return zzv.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzf(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, String str, int i10) {
        return new zzu((Context) ObjectWrapper.unwrap(iObjectWrapper), zzsVar, str, new VersionInfoParcel(243799000, i10, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzci zzg(IObjectWrapper iObjectWrapper, zzbpg zzbpgVar, int i10) {
        return zzchk.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbpgVar, i10).zzA();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzcz zzh(IObjectWrapper iObjectWrapper, int i10) {
        return zzchk.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), null, i10).zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzdu zzi(IObjectWrapper iObjectWrapper, zzbpg zzbpgVar, int i10) {
        return zzchk.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbpgVar, i10).zzm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbgc zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdju((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), 243799000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbgi zzk(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdjs((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbkt zzl(IObjectWrapper iObjectWrapper, zzbpg zzbpgVar, int i10, zzbkq zzbkqVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzdtv zzk = zzchk.zzb(context, zzbpgVar, i10).zzk();
        zzk.zzb(context);
        zzk.zza(zzbkqVar);
        return zzk.zzc().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbsz zzm(IObjectWrapper iObjectWrapper, zzbpg zzbpgVar, int i10) {
        return zzchk.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbpgVar, i10).zzn();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbtg zzn(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel zza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (zza == null) {
            return new zzw(activity);
        }
        int i10 = zza.zzk;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return new zzw(activity);
                        }
                        return new zzaf(activity);
                    }
                    return new zzab(activity, zza);
                }
                return new zzai(activity);
            }
            return new zzah(activity);
        }
        return new com.google.android.gms.ads.internal.overlay.zzv(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbwm zzo(IObjectWrapper iObjectWrapper, zzbpg zzbpgVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfem zzw = zzchk.zzb(context, zzbpgVar, i10).zzw();
        zzw.zzb(context);
        return zzw.zzc().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbxc zzp(IObjectWrapper iObjectWrapper, String str, zzbpg zzbpgVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfem zzw = zzchk.zzb(context, zzbpgVar, i10).zzw();
        zzw.zzb(context);
        zzw.zza(str);
        return zzw.zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbzh zzq(IObjectWrapper iObjectWrapper, zzbpg zzbpgVar, int i10) {
        return zzchk.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbpgVar, i10).zzq();
    }
}
