package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzcz;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzab;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzah;
import com.google.android.gms.ads.internal.overlay.zzai;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbgm;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbky;
import com.google.android.gms.internal.ads.zzbpl;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzbtm;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzbxf;
import com.google.android.gms.internal.ads.zzbzl;
import com.google.android.gms.internal.ads.zzcho;
import com.google.android.gms.internal.ads.zzdlj;
import com.google.android.gms.internal.ads.zzdll;
import com.google.android.gms.internal.ads.zzdvm;
import com.google.android.gms.internal.ads.zzene;
import com.google.android.gms.internal.ads.zzfbh;
import com.google.android.gms.internal.ads.zzfcv;
import com.google.android.gms.internal.ads.zzfem;
import com.google.android.gms.internal.ads.zzfga;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class ClientApi extends zzco {
    @KeepForSdk
    public ClientApi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbu zzb(IObjectWrapper iObjectWrapper, String str, zzbpl zzbplVar, int i2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzene(zzcho.zzb(context, zzbplVar, i2), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzc(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, String str, zzbpl zzbplVar, int i2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfbh zzt = zzcho.zzb(context, zzbplVar, i2).zzt();
        zzt.zza(str);
        zzt.zzb(context);
        return i2 >= ((Integer) zzbe.zzc().zza(zzbcv.zzfg)).intValue() ? zzt.zzc().zza() : new zzfl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzd(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, String str, zzbpl zzbplVar, int i2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfcv zzu = zzcho.zzb(context, zzbplVar, i2).zzu();
        zzu.zzc(context);
        zzu.zza(zzsVar);
        zzu.zzb(str);
        return zzu.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, String str, zzbpl zzbplVar, int i2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfem zzv = zzcho.zzb(context, zzbplVar, i2).zzv();
        zzv.zzc(context);
        zzv.zza(zzsVar);
        zzv.zzb(str);
        return zzv.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzf(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, String str, int i2) {
        return new zzt((Context) ObjectWrapper.unwrap(iObjectWrapper), zzsVar, str, new VersionInfoParcel(243220000, i2, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzci zzg(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i2) {
        return zzcho.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbplVar, i2).zzA();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzcz zzh(IObjectWrapper iObjectWrapper, int i2) {
        return zzcho.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), null, i2).zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzdu zzi(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i2) {
        return zzcho.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbplVar, i2).zzm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbgg zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdll((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), 243220000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbgm zzk(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdlj((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbky zzl(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i2, zzbkv zzbkvVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzdvm zzk = zzcho.zzb(context, zzbplVar, i2).zzk();
        zzk.zzb(context);
        zzk.zza(zzbkvVar);
        return zzk.zzc().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbtf zzm(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i2) {
        return zzcho.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbplVar, i2).zzn();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbtm zzn(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel zzb = AdOverlayInfoParcel.zzb(activity.getIntent());
        if (zzb == null) {
            return new zzw(activity);
        }
        int i2 = zzb.zzk;
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? new zzw(activity) : new zzaf(activity) : new zzab(activity, zzb) : new zzai(activity) : new zzah(activity) : new zzv(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbwp zzo(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfga zzw = zzcho.zzb(context, zzbplVar, i2).zzw();
        zzw.zzb(context);
        return zzw.zzc().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbxf zzp(IObjectWrapper iObjectWrapper, String str, zzbpl zzbplVar, int i2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfga zzw = zzcho.zzb(context, zzbplVar, i2).zzw();
        zzw.zzb(context);
        zzw.zza(str);
        return zzw.zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbzl zzq(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i2) {
        return zzcho.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbplVar, i2).zzq();
    }
}
