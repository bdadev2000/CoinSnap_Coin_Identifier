package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Collections;
import java.util.List;
import r.k;

/* loaded from: classes3.dex */
public final class zzdiy {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzeb zzb;
    private zzbfr zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzez zzg;
    private Bundle zzh;
    private zzcfk zzi;
    private zzcfk zzj;

    @Nullable
    private zzcfk zzk;

    @Nullable
    private zzeew zzl;

    @Nullable
    private ua.b zzm;

    @Nullable
    private zzcao zzn;
    private View zzo;
    private View zzp;
    private IObjectWrapper zzq;
    private double zzr;
    private zzbfy zzs;
    private zzbfy zzt;
    private String zzu;
    private float zzx;

    @Nullable
    private String zzy;
    private final k zzv = new k();
    private final k zzw = new k();
    private List zzf = Collections.emptyList();

    @Nullable
    public static zzdiy zzag(zzbpr zzbprVar) {
        try {
            zzdix zzak = zzak(zzbprVar.zzg(), null);
            zzbfr zzh = zzbprVar.zzh();
            View view = (View) zzam(zzbprVar.zzj());
            String zzo = zzbprVar.zzo();
            List zzr = zzbprVar.zzr();
            String zzm = zzbprVar.zzm();
            Bundle zzf = zzbprVar.zzf();
            String zzn = zzbprVar.zzn();
            View view2 = (View) zzam(zzbprVar.zzk());
            IObjectWrapper zzl = zzbprVar.zzl();
            String zzq = zzbprVar.zzq();
            String zzp = zzbprVar.zzp();
            double zze = zzbprVar.zze();
            zzbfy zzi = zzbprVar.zzi();
            zzdiy zzdiyVar = new zzdiy();
            zzdiyVar.zza = 2;
            zzdiyVar.zzb = zzak;
            zzdiyVar.zzc = zzh;
            zzdiyVar.zzd = view;
            zzdiyVar.zzZ("headline", zzo);
            zzdiyVar.zze = zzr;
            zzdiyVar.zzZ(TtmlNode.TAG_BODY, zzm);
            zzdiyVar.zzh = zzf;
            zzdiyVar.zzZ("call_to_action", zzn);
            zzdiyVar.zzo = view2;
            zzdiyVar.zzq = zzl;
            zzdiyVar.zzZ("store", zzq);
            zzdiyVar.zzZ(BidResponsed.KEY_PRICE, zzp);
            zzdiyVar.zzr = zze;
            zzdiyVar.zzs = zzi;
            return zzdiyVar;
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad from app install ad mapper", e2);
            return null;
        }
    }

    @Nullable
    public static zzdiy zzah(zzbps zzbpsVar) {
        try {
            zzdix zzak = zzak(zzbpsVar.zzf(), null);
            zzbfr zzg = zzbpsVar.zzg();
            View view = (View) zzam(zzbpsVar.zzi());
            String zzo = zzbpsVar.zzo();
            List zzp = zzbpsVar.zzp();
            String zzm = zzbpsVar.zzm();
            Bundle zze = zzbpsVar.zze();
            String zzn = zzbpsVar.zzn();
            View view2 = (View) zzam(zzbpsVar.zzj());
            IObjectWrapper zzk = zzbpsVar.zzk();
            String zzl = zzbpsVar.zzl();
            zzbfy zzh = zzbpsVar.zzh();
            zzdiy zzdiyVar = new zzdiy();
            zzdiyVar.zza = 1;
            zzdiyVar.zzb = zzak;
            zzdiyVar.zzc = zzg;
            zzdiyVar.zzd = view;
            zzdiyVar.zzZ("headline", zzo);
            zzdiyVar.zze = zzp;
            zzdiyVar.zzZ(TtmlNode.TAG_BODY, zzm);
            zzdiyVar.zzh = zze;
            zzdiyVar.zzZ("call_to_action", zzn);
            zzdiyVar.zzo = view2;
            zzdiyVar.zzq = zzk;
            zzdiyVar.zzZ("advertiser", zzl);
            zzdiyVar.zzt = zzh;
            return zzdiyVar;
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad from content ad mapper", e2);
            return null;
        }
    }

    @Nullable
    public static zzdiy zzai(zzbpr zzbprVar) {
        try {
            return zzal(zzak(zzbprVar.zzg(), null), zzbprVar.zzh(), (View) zzam(zzbprVar.zzj()), zzbprVar.zzo(), zzbprVar.zzr(), zzbprVar.zzm(), zzbprVar.zzf(), zzbprVar.zzn(), (View) zzam(zzbprVar.zzk()), zzbprVar.zzl(), zzbprVar.zzq(), zzbprVar.zzp(), zzbprVar.zze(), zzbprVar.zzi(), null, 0.0f);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad assets from app install ad mapper", e2);
            return null;
        }
    }

    @Nullable
    public static zzdiy zzaj(zzbps zzbpsVar) {
        try {
            return zzal(zzak(zzbpsVar.zzf(), null), zzbpsVar.zzg(), (View) zzam(zzbpsVar.zzi()), zzbpsVar.zzo(), zzbpsVar.zzp(), zzbpsVar.zzm(), zzbpsVar.zze(), zzbpsVar.zzn(), (View) zzam(zzbpsVar.zzj()), zzbpsVar.zzk(), null, null, -1.0d, zzbpsVar.zzh(), zzbpsVar.zzl(), 0.0f);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad assets from content ad mapper", e2);
            return null;
        }
    }

    @Nullable
    private static zzdix zzak(com.google.android.gms.ads.internal.client.zzeb zzebVar, @Nullable zzbpv zzbpvVar) {
        if (zzebVar == null) {
            return null;
        }
        return new zzdix(zzebVar, zzbpvVar);
    }

    private static zzdiy zzal(com.google.android.gms.ads.internal.client.zzeb zzebVar, zzbfr zzbfrVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d10, zzbfy zzbfyVar, String str6, float f10) {
        zzdiy zzdiyVar = new zzdiy();
        zzdiyVar.zza = 6;
        zzdiyVar.zzb = zzebVar;
        zzdiyVar.zzc = zzbfrVar;
        zzdiyVar.zzd = view;
        zzdiyVar.zzZ("headline", str);
        zzdiyVar.zze = list;
        zzdiyVar.zzZ(TtmlNode.TAG_BODY, str2);
        zzdiyVar.zzh = bundle;
        zzdiyVar.zzZ("call_to_action", str3);
        zzdiyVar.zzo = view2;
        zzdiyVar.zzq = iObjectWrapper;
        zzdiyVar.zzZ("store", str4);
        zzdiyVar.zzZ(BidResponsed.KEY_PRICE, str5);
        zzdiyVar.zzr = d10;
        zzdiyVar.zzs = zzbfyVar;
        zzdiyVar.zzZ("advertiser", str6);
        zzdiyVar.zzR(f10);
        return zzdiyVar;
    }

    private static Object zzam(@Nullable IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    @Nullable
    public static zzdiy zzt(zzbpv zzbpvVar) {
        try {
            return zzal(zzak(zzbpvVar.zzj(), zzbpvVar), zzbpvVar.zzk(), (View) zzam(zzbpvVar.zzm()), zzbpvVar.zzs(), zzbpvVar.zzv(), zzbpvVar.zzq(), zzbpvVar.zzi(), zzbpvVar.zzr(), (View) zzam(zzbpvVar.zzn()), zzbpvVar.zzo(), zzbpvVar.zzu(), zzbpvVar.zzt(), zzbpvVar.zze(), zzbpvVar.zzl(), zzbpvVar.zzp(), zzbpvVar.zzf());
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad assets from unified ad mapper", e2);
            return null;
        }
    }

    public final synchronized String zzA() {
        return this.zzu;
    }

    public final synchronized String zzB() {
        return zzF("headline");
    }

    @Nullable
    public final synchronized String zzC() {
        return this.zzy;
    }

    public final synchronized String zzD() {
        return zzF(BidResponsed.KEY_PRICE);
    }

    public final synchronized String zzE() {
        return zzF("store");
    }

    public final synchronized String zzF(String str) {
        return (String) this.zzw.getOrDefault(str, null);
    }

    public final synchronized List zzG() {
        return this.zze;
    }

    public final synchronized List zzH() {
        return this.zzf;
    }

    public final synchronized void zzI() {
        zzcfk zzcfkVar = this.zzi;
        if (zzcfkVar != null) {
            zzcfkVar.destroy();
            this.zzi = null;
        }
        zzcfk zzcfkVar2 = this.zzj;
        if (zzcfkVar2 != null) {
            zzcfkVar2.destroy();
            this.zzj = null;
        }
        zzcfk zzcfkVar3 = this.zzk;
        if (zzcfkVar3 != null) {
            zzcfkVar3.destroy();
            this.zzk = null;
        }
        ua.b bVar = this.zzm;
        if (bVar != null) {
            bVar.cancel(false);
            this.zzm = null;
        }
        zzcao zzcaoVar = this.zzn;
        if (zzcaoVar != null) {
            zzcaoVar.cancel(false);
            this.zzn = null;
        }
        this.zzl = null;
        this.zzv.clear();
        this.zzw.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
    }

    public final synchronized void zzJ(zzbfr zzbfrVar) {
        this.zzc = zzbfrVar;
    }

    public final synchronized void zzK(String str) {
        this.zzu = str;
    }

    public final synchronized void zzL(@Nullable com.google.android.gms.ads.internal.client.zzez zzezVar) {
        this.zzg = zzezVar;
    }

    public final synchronized void zzM(zzbfy zzbfyVar) {
        this.zzs = zzbfyVar;
    }

    public final synchronized void zzN(String str, zzbfl zzbflVar) {
        if (zzbflVar == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzbflVar);
        }
    }

    public final synchronized void zzO(zzcfk zzcfkVar) {
        this.zzj = zzcfkVar;
    }

    public final synchronized void zzP(List list) {
        this.zze = list;
    }

    public final synchronized void zzQ(zzbfy zzbfyVar) {
        this.zzt = zzbfyVar;
    }

    public final synchronized void zzR(float f10) {
        this.zzx = f10;
    }

    public final synchronized void zzS(List list) {
        this.zzf = list;
    }

    public final synchronized void zzT(zzcfk zzcfkVar) {
        this.zzk = zzcfkVar;
    }

    public final synchronized void zzU(ua.b bVar) {
        this.zzm = bVar;
    }

    public final synchronized void zzV(@Nullable String str) {
        this.zzy = str;
    }

    public final synchronized void zzW(zzeew zzeewVar) {
        this.zzl = zzeewVar;
    }

    public final synchronized void zzX(zzcao zzcaoVar) {
        this.zzn = zzcaoVar;
    }

    public final synchronized void zzY(double d10) {
        this.zzr = d10;
    }

    public final synchronized void zzZ(String str, String str2) {
        if (str2 == null) {
            this.zzw.remove(str);
        } else {
            this.zzw.put(str, str2);
        }
    }

    public final synchronized double zza() {
        return this.zzr;
    }

    public final synchronized void zzaa(int i10) {
        this.zza = i10;
    }

    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzeb zzebVar) {
        this.zzb = zzebVar;
    }

    public final synchronized void zzac(View view) {
        this.zzo = view;
    }

    public final synchronized void zzad(zzcfk zzcfkVar) {
        this.zzi = zzcfkVar;
    }

    public final synchronized void zzae(View view) {
        this.zzp = view;
    }

    public final synchronized boolean zzaf() {
        return this.zzj != null;
    }

    public final synchronized float zzb() {
        return this.zzx;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzo;
    }

    public final synchronized View zzg() {
        return this.zzp;
    }

    public final synchronized k zzh() {
        return this.zzv;
    }

    public final synchronized k zzi() {
        return this.zzw;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzeb zzj() {
        return this.zzb;
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzez zzk() {
        return this.zzg;
    }

    public final synchronized zzbfr zzl() {
        return this.zzc;
    }

    @Nullable
    public final zzbfy zzm() {
        List list = this.zze;
        if (list != null && !list.isEmpty()) {
            Object obj = this.zze.get(0);
            if (obj instanceof IBinder) {
                return zzbfx.zzg((IBinder) obj);
            }
            return null;
        }
        return null;
    }

    public final synchronized zzbfy zzn() {
        return this.zzs;
    }

    public final synchronized zzbfy zzo() {
        return this.zzt;
    }

    @Nullable
    public final synchronized zzcao zzp() {
        return this.zzn;
    }

    public final synchronized zzcfk zzq() {
        return this.zzj;
    }

    @Nullable
    public final synchronized zzcfk zzr() {
        return this.zzk;
    }

    public final synchronized zzcfk zzs() {
        return this.zzi;
    }

    @Nullable
    public final synchronized zzeew zzu() {
        return this.zzl;
    }

    public final synchronized IObjectWrapper zzv() {
        return this.zzq;
    }

    @Nullable
    public final synchronized ua.b zzw() {
        return this.zzm;
    }

    public final synchronized String zzx() {
        return zzF("advertiser");
    }

    public final synchronized String zzy() {
        return zzF(TtmlNode.TAG_BODY);
    }

    public final synchronized String zzz() {
        return zzF("call_to_action");
    }
}
