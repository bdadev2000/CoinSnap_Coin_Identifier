package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import x.l;

/* loaded from: classes2.dex */
public final class zzdqa extends zzbio {
    private final Context zza;
    private final zzdlt zzb;
    private zzdmt zzc;
    private zzdlo zzd;

    public zzdqa(Context context, zzdlt zzdltVar, zzdmt zzdmtVar, zzdlo zzdloVar) {
        this.zza = context;
        this.zzb = zzdltVar;
        this.zzc = zzdmtVar;
        this.zzd = zzdloVar;
    }

    private final zzbhj zzd(String str) {
        return new zzdpz(this, NativeCustomFormatAd.ASSET_NAME_VIDEO);
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final com.google.android.gms.ads.internal.client.zzdq zze() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final zzbhs zzf() throws RemoteException {
        try {
            return this.zzd.zzc().zza();
        } catch (NullPointerException e4) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final zzbhv zzg(String str) {
        return (zzbhv) this.zzb.zzh().getOrDefault(str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final String zzi() {
        return this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final String zzj(String str) {
        return (String) this.zzb.zzi().getOrDefault(str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final List zzk() {
        try {
            l zzh = this.zzb.zzh();
            l zzi = this.zzb.zzi();
            String[] strArr = new String[zzh.f24086d + zzi.f24086d];
            int i9 = 0;
            for (int i10 = 0; i10 < zzh.f24086d; i10++) {
                strArr[i9] = (String) zzh.h(i10);
                i9++;
            }
            for (int i11 = 0; i11 < zzi.f24086d; i11++) {
                strArr[i9] = (String) zzi.h(i11);
                i9++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e4) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final void zzl() {
        zzdlo zzdloVar = this.zzd;
        if (zzdloVar != null) {
            zzdloVar.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final void zzm() {
        try {
            String zzC = this.zzb.zzC();
            if (Objects.equals(zzC, "Google")) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Illegal argument specified for omid partner name.");
                return;
            }
            if (TextUtils.isEmpty(zzC)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Not starting OMID session. OM partner name has not been configured.");
                return;
            }
            zzdlo zzdloVar = this.zzd;
            if (zzdloVar != null) {
                zzdloVar.zzf(zzC, false);
            }
        } catch (NullPointerException e4) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final void zzn(String str) {
        zzdlo zzdloVar = this.zzd;
        if (zzdloVar != null) {
            zzdloVar.zzF(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final void zzo() {
        zzdlo zzdloVar = this.zzd;
        if (zzdloVar != null) {
            zzdloVar.zzI();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final void zzp(IObjectWrapper iObjectWrapper) {
        zzdlo zzdloVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((unwrap instanceof View) && this.zzb.zzu() != null && (zzdloVar = this.zzd) != null) {
            zzdloVar.zzJ((View) unwrap);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final boolean zzq() {
        zzdlo zzdloVar = this.zzd;
        if ((zzdloVar != null && !zzdloVar.zzW()) || this.zzb.zzr() == null || this.zzb.zzs() != null) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        zzdmt zzdmtVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((unwrap instanceof ViewGroup) && (zzdmtVar = this.zzc) != null && zzdmtVar.zzf((ViewGroup) unwrap)) {
            this.zzb.zzq().zzar(zzd(NativeCustomFormatAd.ASSET_NAME_VIDEO));
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final boolean zzs(IObjectWrapper iObjectWrapper) {
        zzdmt zzdmtVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((unwrap instanceof ViewGroup) && (zzdmtVar = this.zzc) != null && zzdmtVar.zzg((ViewGroup) unwrap)) {
            this.zzb.zzs().zzar(zzd(NativeCustomFormatAd.ASSET_NAME_VIDEO));
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [x.l, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.zzbip
    public final boolean zzt() {
        zzehg zzu = this.zzb.zzu();
        if (zzu != null) {
            com.google.android.gms.ads.internal.zzu.zzA().zzk(zzu.zza());
            if (this.zzb.zzr() != null) {
                this.zzb.zzr().zzd("onSdkLoaded", new l());
                return true;
            }
            return true;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Trying to start OMID session before creation.");
        return false;
    }
}
