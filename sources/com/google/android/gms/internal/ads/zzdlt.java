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
import x.l;

/* loaded from: classes2.dex */
public final class zzdlt {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzdq zzb;
    private zzbho zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzel zzg;
    private Bundle zzh;
    private zzchd zzi;
    private zzchd zzj;

    @Nullable
    private zzchd zzk;

    @Nullable
    private zzehg zzl;

    @Nullable
    private f4.c zzm;

    @Nullable
    private zzccn zzn;
    private View zzo;
    private View zzp;
    private IObjectWrapper zzq;
    private double zzr;
    private zzbhv zzs;
    private zzbhv zzt;
    private String zzu;
    private float zzx;

    @Nullable
    private String zzy;
    private final l zzv = new l();
    private final l zzw = new l();
    private List zzf = Collections.emptyList();

    @Nullable
    public static zzdlt zzag(zzbrq zzbrqVar) {
        try {
            zzdls zzak = zzak(zzbrqVar.zzg(), null);
            zzbho zzh = zzbrqVar.zzh();
            View view = (View) zzam(zzbrqVar.zzj());
            String zzo = zzbrqVar.zzo();
            List zzr = zzbrqVar.zzr();
            String zzm = zzbrqVar.zzm();
            Bundle zzf = zzbrqVar.zzf();
            String zzn = zzbrqVar.zzn();
            View view2 = (View) zzam(zzbrqVar.zzk());
            IObjectWrapper zzl = zzbrqVar.zzl();
            String zzq = zzbrqVar.zzq();
            String zzp = zzbrqVar.zzp();
            double zze = zzbrqVar.zze();
            zzbhv zzi = zzbrqVar.zzi();
            zzdlt zzdltVar = new zzdlt();
            zzdltVar.zza = 2;
            zzdltVar.zzb = zzak;
            zzdltVar.zzc = zzh;
            zzdltVar.zzd = view;
            zzdltVar.zzZ("headline", zzo);
            zzdltVar.zze = zzr;
            zzdltVar.zzZ(TtmlNode.TAG_BODY, zzm);
            zzdltVar.zzh = zzf;
            zzdltVar.zzZ("call_to_action", zzn);
            zzdltVar.zzo = view2;
            zzdltVar.zzq = zzl;
            zzdltVar.zzZ("store", zzq);
            zzdltVar.zzZ(BidResponsed.KEY_PRICE, zzp);
            zzdltVar.zzr = zze;
            zzdltVar.zzs = zzi;
            return zzdltVar;
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad from app install ad mapper", e4);
            return null;
        }
    }

    @Nullable
    public static zzdlt zzah(zzbrr zzbrrVar) {
        try {
            zzdls zzak = zzak(zzbrrVar.zzf(), null);
            zzbho zzg = zzbrrVar.zzg();
            View view = (View) zzam(zzbrrVar.zzi());
            String zzo = zzbrrVar.zzo();
            List zzp = zzbrrVar.zzp();
            String zzm = zzbrrVar.zzm();
            Bundle zze = zzbrrVar.zze();
            String zzn = zzbrrVar.zzn();
            View view2 = (View) zzam(zzbrrVar.zzj());
            IObjectWrapper zzk = zzbrrVar.zzk();
            String zzl = zzbrrVar.zzl();
            zzbhv zzh = zzbrrVar.zzh();
            zzdlt zzdltVar = new zzdlt();
            zzdltVar.zza = 1;
            zzdltVar.zzb = zzak;
            zzdltVar.zzc = zzg;
            zzdltVar.zzd = view;
            zzdltVar.zzZ("headline", zzo);
            zzdltVar.zze = zzp;
            zzdltVar.zzZ(TtmlNode.TAG_BODY, zzm);
            zzdltVar.zzh = zze;
            zzdltVar.zzZ("call_to_action", zzn);
            zzdltVar.zzo = view2;
            zzdltVar.zzq = zzk;
            zzdltVar.zzZ("advertiser", zzl);
            zzdltVar.zzt = zzh;
            return zzdltVar;
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad from content ad mapper", e4);
            return null;
        }
    }

    @Nullable
    public static zzdlt zzai(zzbrq zzbrqVar) {
        try {
            return zzal(zzak(zzbrqVar.zzg(), null), zzbrqVar.zzh(), (View) zzam(zzbrqVar.zzj()), zzbrqVar.zzo(), zzbrqVar.zzr(), zzbrqVar.zzm(), zzbrqVar.zzf(), zzbrqVar.zzn(), (View) zzam(zzbrqVar.zzk()), zzbrqVar.zzl(), zzbrqVar.zzq(), zzbrqVar.zzp(), zzbrqVar.zze(), zzbrqVar.zzi(), null, 0.0f);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad assets from app install ad mapper", e4);
            return null;
        }
    }

    @Nullable
    public static zzdlt zzaj(zzbrr zzbrrVar) {
        try {
            return zzal(zzak(zzbrrVar.zzf(), null), zzbrrVar.zzg(), (View) zzam(zzbrrVar.zzi()), zzbrrVar.zzo(), zzbrrVar.zzp(), zzbrrVar.zzm(), zzbrrVar.zze(), zzbrrVar.zzn(), (View) zzam(zzbrrVar.zzj()), zzbrrVar.zzk(), null, null, -1.0d, zzbrrVar.zzh(), zzbrrVar.zzl(), 0.0f);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad assets from content ad mapper", e4);
            return null;
        }
    }

    @Nullable
    private static zzdls zzak(com.google.android.gms.ads.internal.client.zzdq zzdqVar, @Nullable zzbru zzbruVar) {
        if (zzdqVar == null) {
            return null;
        }
        return new zzdls(zzdqVar, zzbruVar);
    }

    private static zzdlt zzal(com.google.android.gms.ads.internal.client.zzdq zzdqVar, zzbho zzbhoVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d2, zzbhv zzbhvVar, String str6, float f9) {
        zzdlt zzdltVar = new zzdlt();
        zzdltVar.zza = 6;
        zzdltVar.zzb = zzdqVar;
        zzdltVar.zzc = zzbhoVar;
        zzdltVar.zzd = view;
        zzdltVar.zzZ("headline", str);
        zzdltVar.zze = list;
        zzdltVar.zzZ(TtmlNode.TAG_BODY, str2);
        zzdltVar.zzh = bundle;
        zzdltVar.zzZ("call_to_action", str3);
        zzdltVar.zzo = view2;
        zzdltVar.zzq = iObjectWrapper;
        zzdltVar.zzZ("store", str4);
        zzdltVar.zzZ(BidResponsed.KEY_PRICE, str5);
        zzdltVar.zzr = d2;
        zzdltVar.zzs = zzbhvVar;
        zzdltVar.zzZ("advertiser", str6);
        zzdltVar.zzR(f9);
        return zzdltVar;
    }

    private static Object zzam(@Nullable IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    @Nullable
    public static zzdlt zzt(zzbru zzbruVar) {
        try {
            return zzal(zzak(zzbruVar.zzj(), zzbruVar), zzbruVar.zzk(), (View) zzam(zzbruVar.zzm()), zzbruVar.zzs(), zzbruVar.zzv(), zzbruVar.zzq(), zzbruVar.zzi(), zzbruVar.zzr(), (View) zzam(zzbruVar.zzn()), zzbruVar.zzo(), zzbruVar.zzu(), zzbruVar.zzt(), zzbruVar.zze(), zzbruVar.zzl(), zzbruVar.zzp(), zzbruVar.zzf());
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad assets from unified ad mapper", e4);
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
        try {
            zzchd zzchdVar = this.zzi;
            if (zzchdVar != null) {
                zzchdVar.destroy();
                this.zzi = null;
            }
            zzchd zzchdVar2 = this.zzj;
            if (zzchdVar2 != null) {
                zzchdVar2.destroy();
                this.zzj = null;
            }
            zzchd zzchdVar3 = this.zzk;
            if (zzchdVar3 != null) {
                zzchdVar3.destroy();
                this.zzk = null;
            }
            f4.c cVar = this.zzm;
            if (cVar != null) {
                cVar.cancel(false);
                this.zzm = null;
            }
            zzccn zzccnVar = this.zzn;
            if (zzccnVar != null) {
                zzccnVar.cancel(false);
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
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzJ(zzbho zzbhoVar) {
        this.zzc = zzbhoVar;
    }

    public final synchronized void zzK(String str) {
        this.zzu = str;
    }

    public final synchronized void zzL(@Nullable com.google.android.gms.ads.internal.client.zzel zzelVar) {
        this.zzg = zzelVar;
    }

    public final synchronized void zzM(zzbhv zzbhvVar) {
        this.zzs = zzbhvVar;
    }

    public final synchronized void zzN(String str, zzbhi zzbhiVar) {
        if (zzbhiVar == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzbhiVar);
        }
    }

    public final synchronized void zzO(zzchd zzchdVar) {
        this.zzj = zzchdVar;
    }

    public final synchronized void zzP(List list) {
        this.zze = list;
    }

    public final synchronized void zzQ(zzbhv zzbhvVar) {
        this.zzt = zzbhvVar;
    }

    public final synchronized void zzR(float f9) {
        this.zzx = f9;
    }

    public final synchronized void zzS(List list) {
        this.zzf = list;
    }

    public final synchronized void zzT(zzchd zzchdVar) {
        this.zzk = zzchdVar;
    }

    public final synchronized void zzU(f4.c cVar) {
        this.zzm = cVar;
    }

    public final synchronized void zzV(@Nullable String str) {
        this.zzy = str;
    }

    public final synchronized void zzW(zzehg zzehgVar) {
        this.zzl = zzehgVar;
    }

    public final synchronized void zzX(zzccn zzccnVar) {
        this.zzn = zzccnVar;
    }

    public final synchronized void zzY(double d2) {
        this.zzr = d2;
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

    public final synchronized void zzaa(int i9) {
        this.zza = i9;
    }

    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzb = zzdqVar;
    }

    public final synchronized void zzac(View view) {
        this.zzo = view;
    }

    public final synchronized void zzad(zzchd zzchdVar) {
        this.zzi = zzchdVar;
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
        try {
            if (this.zzh == null) {
                this.zzh = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
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

    public final synchronized l zzh() {
        return this.zzv;
    }

    public final synchronized l zzi() {
        return this.zzw;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzdq zzj() {
        return this.zzb;
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzel zzk() {
        return this.zzg;
    }

    public final synchronized zzbho zzl() {
        return this.zzc;
    }

    @Nullable
    public final zzbhv zzm() {
        List list = this.zze;
        if (list != null && !list.isEmpty()) {
            Object obj = this.zze.get(0);
            if (obj instanceof IBinder) {
                return zzbhu.zzg((IBinder) obj);
            }
            return null;
        }
        return null;
    }

    public final synchronized zzbhv zzn() {
        return this.zzs;
    }

    public final synchronized zzbhv zzo() {
        return this.zzt;
    }

    @Nullable
    public final synchronized zzccn zzp() {
        return this.zzn;
    }

    public final synchronized zzchd zzq() {
        return this.zzj;
    }

    @Nullable
    public final synchronized zzchd zzr() {
        return this.zzk;
    }

    public final synchronized zzchd zzs() {
        return this.zzi;
    }

    @Nullable
    public final synchronized zzehg zzu() {
        return this.zzl;
    }

    public final synchronized IObjectWrapper zzv() {
        return this.zzq;
    }

    @Nullable
    public final synchronized f4.c zzw() {
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
