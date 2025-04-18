package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzdkp {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzeb zzb;
    private zzbfv zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzfa zzg;
    private Bundle zzh;
    private zzcfo zzi;
    private zzcfo zzj;

    @Nullable
    private zzcfo zzk;

    @Nullable
    private zzegf zzl;

    @Nullable
    private ListenableFuture zzm;

    @Nullable
    private zzcas zzn;
    private View zzo;
    private View zzp;
    private IObjectWrapper zzq;
    private double zzr;
    private zzbgc zzs;
    private zzbgc zzt;
    private String zzu;
    private float zzx;

    @Nullable
    private String zzy;
    private final SimpleArrayMap zzv = new SimpleArrayMap();
    private final SimpleArrayMap zzw = new SimpleArrayMap();
    private List zzf = Collections.emptyList();

    @Nullable
    public static zzdkp zzag(zzbpw zzbpwVar) {
        try {
            zzdko zzak = zzak(zzbpwVar.zzg(), null);
            zzbfv zzh = zzbpwVar.zzh();
            View view = (View) zzam(zzbpwVar.zzj());
            String zzo = zzbpwVar.zzo();
            List zzr = zzbpwVar.zzr();
            String zzm = zzbpwVar.zzm();
            Bundle zzf = zzbpwVar.zzf();
            String zzn = zzbpwVar.zzn();
            View view2 = (View) zzam(zzbpwVar.zzk());
            IObjectWrapper zzl = zzbpwVar.zzl();
            String zzq = zzbpwVar.zzq();
            String zzp = zzbpwVar.zzp();
            double zze = zzbpwVar.zze();
            zzbgc zzi = zzbpwVar.zzi();
            zzdkp zzdkpVar = new zzdkp();
            zzdkpVar.zza = 2;
            zzdkpVar.zzb = zzak;
            zzdkpVar.zzc = zzh;
            zzdkpVar.zzd = view;
            zzdkpVar.zzZ("headline", zzo);
            zzdkpVar.zze = zzr;
            zzdkpVar.zzZ("body", zzm);
            zzdkpVar.zzh = zzf;
            zzdkpVar.zzZ("call_to_action", zzn);
            zzdkpVar.zzo = view2;
            zzdkpVar.zzq = zzl;
            zzdkpVar.zzZ("store", zzq);
            zzdkpVar.zzZ(FirebaseAnalytics.Param.PRICE, zzp);
            zzdkpVar.zzr = zze;
            zzdkpVar.zzs = zzi;
            return zzdkpVar;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    @Nullable
    public static zzdkp zzah(zzbpx zzbpxVar) {
        try {
            zzdko zzak = zzak(zzbpxVar.zzf(), null);
            zzbfv zzg = zzbpxVar.zzg();
            View view = (View) zzam(zzbpxVar.zzi());
            String zzo = zzbpxVar.zzo();
            List zzp = zzbpxVar.zzp();
            String zzm = zzbpxVar.zzm();
            Bundle zze = zzbpxVar.zze();
            String zzn = zzbpxVar.zzn();
            View view2 = (View) zzam(zzbpxVar.zzj());
            IObjectWrapper zzk = zzbpxVar.zzk();
            String zzl = zzbpxVar.zzl();
            zzbgc zzh = zzbpxVar.zzh();
            zzdkp zzdkpVar = new zzdkp();
            zzdkpVar.zza = 1;
            zzdkpVar.zzb = zzak;
            zzdkpVar.zzc = zzg;
            zzdkpVar.zzd = view;
            zzdkpVar.zzZ("headline", zzo);
            zzdkpVar.zze = zzp;
            zzdkpVar.zzZ("body", zzm);
            zzdkpVar.zzh = zze;
            zzdkpVar.zzZ("call_to_action", zzn);
            zzdkpVar.zzo = view2;
            zzdkpVar.zzq = zzk;
            zzdkpVar.zzZ("advertiser", zzl);
            zzdkpVar.zzt = zzh;
            return zzdkpVar;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    @Nullable
    public static zzdkp zzai(zzbpw zzbpwVar) {
        try {
            return zzal(zzak(zzbpwVar.zzg(), null), zzbpwVar.zzh(), (View) zzam(zzbpwVar.zzj()), zzbpwVar.zzo(), zzbpwVar.zzr(), zzbpwVar.zzm(), zzbpwVar.zzf(), zzbpwVar.zzn(), (View) zzam(zzbpwVar.zzk()), zzbpwVar.zzl(), zzbpwVar.zzq(), zzbpwVar.zzp(), zzbpwVar.zze(), zzbpwVar.zzi(), null, 0.0f);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    @Nullable
    public static zzdkp zzaj(zzbpx zzbpxVar) {
        try {
            return zzal(zzak(zzbpxVar.zzf(), null), zzbpxVar.zzg(), (View) zzam(zzbpxVar.zzi()), zzbpxVar.zzo(), zzbpxVar.zzp(), zzbpxVar.zzm(), zzbpxVar.zze(), zzbpxVar.zzn(), (View) zzam(zzbpxVar.zzj()), zzbpxVar.zzk(), null, null, -1.0d, zzbpxVar.zzh(), zzbpxVar.zzl(), 0.0f);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    @Nullable
    private static zzdko zzak(com.google.android.gms.ads.internal.client.zzeb zzebVar, @Nullable zzbqa zzbqaVar) {
        if (zzebVar == null) {
            return null;
        }
        return new zzdko(zzebVar, zzbqaVar);
    }

    private static zzdkp zzal(com.google.android.gms.ads.internal.client.zzeb zzebVar, zzbfv zzbfvVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbgc zzbgcVar, String str6, float f2) {
        zzdkp zzdkpVar = new zzdkp();
        zzdkpVar.zza = 6;
        zzdkpVar.zzb = zzebVar;
        zzdkpVar.zzc = zzbfvVar;
        zzdkpVar.zzd = view;
        zzdkpVar.zzZ("headline", str);
        zzdkpVar.zze = list;
        zzdkpVar.zzZ("body", str2);
        zzdkpVar.zzh = bundle;
        zzdkpVar.zzZ("call_to_action", str3);
        zzdkpVar.zzo = view2;
        zzdkpVar.zzq = iObjectWrapper;
        zzdkpVar.zzZ("store", str4);
        zzdkpVar.zzZ(FirebaseAnalytics.Param.PRICE, str5);
        zzdkpVar.zzr = d;
        zzdkpVar.zzs = zzbgcVar;
        zzdkpVar.zzZ("advertiser", str6);
        zzdkpVar.zzR(f2);
        return zzdkpVar;
    }

    private static Object zzam(@Nullable IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    @Nullable
    public static zzdkp zzt(zzbqa zzbqaVar) {
        try {
            return zzal(zzak(zzbqaVar.zzj(), zzbqaVar), zzbqaVar.zzk(), (View) zzam(zzbqaVar.zzm()), zzbqaVar.zzs(), zzbqaVar.zzv(), zzbqaVar.zzq(), zzbqaVar.zzi(), zzbqaVar.zzr(), (View) zzam(zzbqaVar.zzn()), zzbqaVar.zzo(), zzbqaVar.zzu(), zzbqaVar.zzt(), zzbqaVar.zze(), zzbqaVar.zzl(), zzbqaVar.zzp(), zzbqaVar.zzf());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad assets from unified ad mapper", e);
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
        return zzF(FirebaseAnalytics.Param.PRICE);
    }

    public final synchronized String zzE() {
        return zzF("store");
    }

    public final synchronized String zzF(String str) {
        return (String) this.zzw.get(str);
    }

    public final synchronized List zzG() {
        return this.zze;
    }

    public final synchronized List zzH() {
        return this.zzf;
    }

    public final synchronized void zzI() {
        try {
            zzcfo zzcfoVar = this.zzi;
            if (zzcfoVar != null) {
                zzcfoVar.destroy();
                this.zzi = null;
            }
            zzcfo zzcfoVar2 = this.zzj;
            if (zzcfoVar2 != null) {
                zzcfoVar2.destroy();
                this.zzj = null;
            }
            zzcfo zzcfoVar3 = this.zzk;
            if (zzcfoVar3 != null) {
                zzcfoVar3.destroy();
                this.zzk = null;
            }
            ListenableFuture listenableFuture = this.zzm;
            if (listenableFuture != null) {
                listenableFuture.cancel(false);
                this.zzm = null;
            }
            zzcas zzcasVar = this.zzn;
            if (zzcasVar != null) {
                zzcasVar.cancel(false);
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

    public final synchronized void zzJ(zzbfv zzbfvVar) {
        this.zzc = zzbfvVar;
    }

    public final synchronized void zzK(String str) {
        this.zzu = str;
    }

    public final synchronized void zzL(@Nullable com.google.android.gms.ads.internal.client.zzfa zzfaVar) {
        this.zzg = zzfaVar;
    }

    public final synchronized void zzM(zzbgc zzbgcVar) {
        this.zzs = zzbgcVar;
    }

    public final synchronized void zzN(String str, zzbfp zzbfpVar) {
        if (zzbfpVar == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzbfpVar);
        }
    }

    public final synchronized void zzO(zzcfo zzcfoVar) {
        this.zzj = zzcfoVar;
    }

    public final synchronized void zzP(List list) {
        this.zze = list;
    }

    public final synchronized void zzQ(zzbgc zzbgcVar) {
        this.zzt = zzbgcVar;
    }

    public final synchronized void zzR(float f2) {
        this.zzx = f2;
    }

    public final synchronized void zzS(List list) {
        this.zzf = list;
    }

    public final synchronized void zzT(zzcfo zzcfoVar) {
        this.zzk = zzcfoVar;
    }

    public final synchronized void zzU(ListenableFuture listenableFuture) {
        this.zzm = listenableFuture;
    }

    public final synchronized void zzV(@Nullable String str) {
        this.zzy = str;
    }

    public final synchronized void zzW(zzegf zzegfVar) {
        this.zzl = zzegfVar;
    }

    public final synchronized void zzX(zzcas zzcasVar) {
        this.zzn = zzcasVar;
    }

    public final synchronized void zzY(double d) {
        this.zzr = d;
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

    public final synchronized void zzaa(int i2) {
        this.zza = i2;
    }

    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzeb zzebVar) {
        this.zzb = zzebVar;
    }

    public final synchronized void zzac(View view) {
        this.zzo = view;
    }

    public final synchronized void zzad(zzcfo zzcfoVar) {
        this.zzi = zzcfoVar;
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

    public final synchronized SimpleArrayMap zzh() {
        return this.zzv;
    }

    public final synchronized SimpleArrayMap zzi() {
        return this.zzw;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzeb zzj() {
        return this.zzb;
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzfa zzk() {
        return this.zzg;
    }

    public final synchronized zzbfv zzl() {
        return this.zzc;
    }

    @Nullable
    public final zzbgc zzm() {
        List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.zze.get(0);
        if (obj instanceof IBinder) {
            return zzbgb.zzg((IBinder) obj);
        }
        return null;
    }

    public final synchronized zzbgc zzn() {
        return this.zzs;
    }

    public final synchronized zzbgc zzo() {
        return this.zzt;
    }

    @Nullable
    public final synchronized zzcas zzp() {
        return this.zzn;
    }

    public final synchronized zzcfo zzq() {
        return this.zzj;
    }

    @Nullable
    public final synchronized zzcfo zzr() {
        return this.zzk;
    }

    public final synchronized zzcfo zzs() {
        return this.zzi;
    }

    @Nullable
    public final synchronized zzegf zzu() {
        return this.zzl;
    }

    public final synchronized IObjectWrapper zzv() {
        return this.zzq;
    }

    @Nullable
    public final synchronized ListenableFuture zzw() {
        return this.zzm;
    }

    public final synchronized String zzx() {
        return zzF("advertiser");
    }

    public final synchronized String zzy() {
        return zzF("body");
    }

    public final synchronized String zzz() {
        return zzF("call_to_action");
    }
}
