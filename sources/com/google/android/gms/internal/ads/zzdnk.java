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
import r.k;

/* loaded from: classes3.dex */
public final class zzdnk extends zzbgr {
    private final Context zza;
    private final zzdiy zzb;
    private zzdjy zzc;
    private zzdit zzd;

    public zzdnk(Context context, zzdiy zzdiyVar, zzdjy zzdjyVar, zzdit zzditVar) {
        this.zza = context;
        this.zzb = zzdiyVar;
        this.zzc = zzdjyVar;
        this.zzd = zzditVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final com.google.android.gms.ads.internal.client.zzeb zze() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final zzbfv zzf() throws RemoteException {
        try {
            return this.zzd.zzc().zza();
        } catch (NullPointerException e2) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final zzbfy zzg(String str) {
        return (zzbfy) this.zzb.zzh().getOrDefault(str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final String zzi() {
        return this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final String zzj(String str) {
        return (String) this.zzb.zzi().getOrDefault(str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final List zzk() {
        try {
            k zzh = this.zzb.zzh();
            k zzi = this.zzb.zzi();
            String[] strArr = new String[zzh.f23955d + zzi.f23955d];
            int i10 = 0;
            for (int i11 = 0; i11 < zzh.f23955d; i11++) {
                strArr[i10] = (String) zzh.h(i11);
                i10++;
            }
            for (int i12 = 0; i12 < zzi.f23955d; i12++) {
                strArr[i10] = (String) zzi.h(i12);
                i10++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e2) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzl() {
        zzdit zzditVar = this.zzd;
        if (zzditVar != null) {
            zzditVar.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
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
            zzdit zzditVar = this.zzd;
            if (zzditVar != null) {
                zzditVar.zzf(zzC, false);
            }
        } catch (NullPointerException e2) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzn(String str) {
        zzdit zzditVar = this.zzd;
        if (zzditVar != null) {
            zzditVar.zzF(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzo() {
        zzdit zzditVar = this.zzd;
        if (zzditVar != null) {
            zzditVar.zzJ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzp(IObjectWrapper iObjectWrapper) {
        zzdit zzditVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((unwrap instanceof View) && this.zzb.zzu() != null && (zzditVar = this.zzd) != null) {
            zzditVar.zzK((View) unwrap);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final boolean zzq() {
        zzdit zzditVar = this.zzd;
        if ((zzditVar != null && !zzditVar.zzX()) || this.zzb.zzr() == null || this.zzb.zzs() != null) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        zzdjy zzdjyVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((unwrap instanceof ViewGroup) && (zzdjyVar = this.zzc) != null && zzdjyVar.zzf((ViewGroup) unwrap)) {
            this.zzb.zzq().zzar(new zzdnj(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final boolean zzs(IObjectWrapper iObjectWrapper) {
        zzdjy zzdjyVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((unwrap instanceof ViewGroup) && (zzdjyVar = this.zzc) != null && zzdjyVar.zzg((ViewGroup) unwrap)) {
            this.zzb.zzs().zzar(new zzdnj(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final boolean zzt() {
        zzeew zzu = this.zzb.zzu();
        if (zzu != null) {
            com.google.android.gms.ads.internal.zzv.zzB().zzk(zzu.zza());
            if (this.zzb.zzr() != null) {
                this.zzb.zzr().zzd("onSdkLoaded", new r.b());
                return true;
            }
            return true;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Trying to start OMID session before creation.");
        return false;
    }
}
