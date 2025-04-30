package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import x.l;

/* loaded from: classes2.dex */
public final class zzdlo extends zzcup {
    public static final zzgbc zzc = zzgbc.zzr("3010", "3008", "1005", "1009", "2011", "2007");
    private final zzbap zzA;
    private final Executor zzd;
    private final zzdlt zze;
    private final zzdmb zzf;
    private final zzdmt zzg;
    private final zzdly zzh;
    private final zzdme zzi;
    private final zzhkj zzj;
    private final zzhkj zzk;
    private final zzhkj zzl;
    private final zzhkj zzm;
    private final zzhkj zzn;
    private zzdnp zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final zzcaq zzs;
    private final zzaxd zzt;
    private final VersionInfoParcel zzu;
    private final Context zzv;
    private final zzdlq zzw;
    private final zzepf zzx;
    private final Map zzy;
    private final List zzz;

    public zzdlo(zzcuo zzcuoVar, Executor executor, zzdlt zzdltVar, zzdmb zzdmbVar, zzdmt zzdmtVar, zzdly zzdlyVar, zzdme zzdmeVar, zzhkj zzhkjVar, zzhkj zzhkjVar2, zzhkj zzhkjVar3, zzhkj zzhkjVar4, zzhkj zzhkjVar5, zzcaq zzcaqVar, zzaxd zzaxdVar, VersionInfoParcel versionInfoParcel, Context context, zzdlq zzdlqVar, zzepf zzepfVar, zzbap zzbapVar) {
        super(zzcuoVar);
        this.zzd = executor;
        this.zze = zzdltVar;
        this.zzf = zzdmbVar;
        this.zzg = zzdmtVar;
        this.zzh = zzdlyVar;
        this.zzi = zzdmeVar;
        this.zzj = zzhkjVar;
        this.zzk = zzhkjVar2;
        this.zzl = zzhkjVar3;
        this.zzm = zzhkjVar4;
        this.zzn = zzhkjVar5;
        this.zzs = zzcaqVar;
        this.zzt = zzaxdVar;
        this.zzu = versionInfoParcel;
        this.zzv = context;
        this.zzw = zzdlqVar;
        this.zzx = zzepfVar;
        this.zzy = new HashMap();
        this.zzz = new ArrayList();
        this.zzA = zzbapVar;
    }

    public static boolean zzX(View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkE)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzp();
            long zzw = com.google.android.gms.ads.internal.util.zzt.zzw(view);
            if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
                if (zzw >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkF)).intValue()) {
                    return true;
                }
            }
            return false;
        }
        if (!view.isShown() || !view.getGlobalVisibleRect(new Rect(), null)) {
            return false;
        }
        return true;
    }

    @Nullable
    private final synchronized ImageView.ScaleType zzZ() {
        zzdnp zzdnpVar = this.zzo;
        if (zzdnpVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper zzj = zzdnpVar.zzj();
        if (zzj != null) {
            return (ImageView.ScaleType) ObjectWrapper.unwrap(zzj);
        }
        return zzdmt.zza;
    }

    private final void zzaa(String str, boolean z8) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfi)).booleanValue()) {
            f4.c zzw = this.zze.zzw();
            if (zzw == null) {
                return;
            }
            zzgft.zzr(zzw, new zzdlm(this, "Google", true), this.zzd);
            return;
        }
        zzf("Google", true);
    }

    private final synchronized void zzab(View view, Map map, Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzq(view, map, map2, zzZ());
        this.zzq = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzac(View view, @Nullable zzehg zzehgVar) {
        zzchd zzr = this.zze.zzr();
        if (this.zzh.zzd() && zzehgVar != null && zzr != null && view != null) {
            com.google.android.gms.ads.internal.zzu.zzA().zzj(zzehgVar.zza(), view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzad, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzz(zzdnp zzdnpVar) {
        Iterator<String> keys;
        View view;
        zzawz zzc2;
        try {
            if (!this.zzp) {
                this.zzo = zzdnpVar;
                this.zzg.zze(zzdnpVar);
                this.zzf.zzy(zzdnpVar.zzf(), zzdnpVar.zzm(), zzdnpVar.zzn(), zzdnpVar, zzdnpVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcD)).booleanValue() && (zzc2 = this.zzt.zzc()) != null) {
                    zzc2.zzo(zzdnpVar.zzf());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbL)).booleanValue()) {
                    zzfgt zzfgtVar = this.zzb;
                    if (zzfgtVar.zzal && (keys = zzfgtVar.zzak.keys()) != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            WeakReference weakReference = (WeakReference) this.zzo.zzl().get(next);
                            this.zzy.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                zzbao zzbaoVar = new zzbao(this.zzv, view);
                                this.zzz.add(zzbaoVar);
                                zzbaoVar.zzc(new zzdll(this, next));
                            }
                        }
                    }
                }
                if (zzdnpVar.zzi() != null) {
                    zzdnpVar.zzi().zzc(this.zzs);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzae, reason: merged with bridge method [inline-methods] */
    public final void zzA(zzdnp zzdnpVar) {
        this.zzf.zzz(zzdnpVar.zzf(), zzdnpVar.zzl());
        if (zzdnpVar.zzh() != null) {
            zzdnpVar.zzh().setClickable(false);
            zzdnpVar.zzh().removeAllViews();
        }
        if (zzdnpVar.zzi() != null) {
            zzdnpVar.zzi().zze(this.zzs);
        }
        this.zzo = null;
    }

    public static /* synthetic */ void zzs(zzdlo zzdloVar) {
        try {
            zzdlt zzdltVar = zzdloVar.zze;
            int zzc2 = zzdltVar.zzc();
            if (zzc2 != 1) {
                if (zzc2 != 2) {
                    if (zzc2 != 3) {
                        if (zzc2 != 6) {
                            if (zzc2 != 7) {
                                com.google.android.gms.ads.internal.util.client.zzm.zzg("Wrong native template id!");
                                return;
                            }
                            zzdme zzdmeVar = zzdloVar.zzi;
                            if (zzdmeVar.zzg() != null) {
                                zzdmeVar.zzg().zzg((zzboc) zzdloVar.zzm.zzb());
                                return;
                            }
                            return;
                        }
                        if (zzdloVar.zzi.zzf() != null) {
                            zzdloVar.zzaa("Google", true);
                            zzdloVar.zzi.zzf().zze((zzbjs) zzdloVar.zzl.zzb());
                            return;
                        }
                        return;
                    }
                    if (zzdloVar.zzi.zzd(zzdltVar.zzA()) != null) {
                        if (zzdloVar.zze.zzs() != null) {
                            zzdloVar.zzf("Google", true);
                        }
                        zzdloVar.zzi.zzd(zzdloVar.zze.zzA()).zze((zzbip) zzdloVar.zzn.zzb());
                        return;
                    }
                    return;
                }
                if (zzdloVar.zzi.zza() != null) {
                    zzdloVar.zzaa("Google", true);
                    zzdloVar.zzi.zza().zze((zzbik) zzdloVar.zzk.zzb());
                    return;
                }
                return;
            }
            if (zzdloVar.zzi.zzb() != null) {
                zzdloVar.zzaa("Google", true);
                zzdloVar.zzi.zzb().zze((zzbim) zzdloVar.zzj.zzb());
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("RemoteException when notifyAdLoad is called", e4);
        }
    }

    public final synchronized void zzB(View view, Map map, Map map2, boolean z8) {
        try {
            if (!this.zzq) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbL)).booleanValue() && this.zzb.zzal) {
                    Iterator it = this.zzy.keySet().iterator();
                    while (it.hasNext()) {
                        if (!((Boolean) this.zzy.get((String) it.next())).booleanValue()) {
                            break;
                        }
                    }
                }
                if (!z8) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdS)).booleanValue() && map != null) {
                        Iterator it2 = map.entrySet().iterator();
                        while (it2.hasNext()) {
                            View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                            if (view2 != null && zzX(view2)) {
                                zzab(view, map, map2);
                                return;
                            }
                        }
                    }
                } else {
                    zzab(view, map, map2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzC(@Nullable com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        this.zzf.zzj(zzcwVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [x.l, java.util.Map] */
    public final synchronized void zzD(View view, View view2, Map map, Map map2, boolean z8) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzk(view, view2, map, map2, z8, zzZ());
        if (this.zzr) {
            zzdlt zzdltVar = this.zze;
            if (zzdltVar.zzs() != null) {
                zzdltVar.zzs().zzd("onSdkAdUserInteractionClick", new l());
            }
        }
    }

    public final synchronized void zzE(@Nullable final View view, final int i9) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlA)).booleanValue()) {
            return;
        }
        zzdnp zzdnpVar = this.zzo;
        if (zzdnpVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        } else {
            final boolean z8 = zzdnpVar instanceof zzdmn;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdli
                @Override // java.lang.Runnable
                public final void run() {
                    zzdlo.this.zzx(view, z8, i9);
                }
            });
        }
    }

    public final synchronized void zzF(String str) {
        this.zzf.zzl(str);
    }

    public final synchronized void zzG(Bundle bundle) {
        this.zzf.zzm(bundle);
    }

    public final synchronized void zzH() {
        zzdnp zzdnpVar = this.zzo;
        if (zzdnpVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z8 = zzdnpVar instanceof zzdmn;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdlk
                @Override // java.lang.Runnable
                public final void run() {
                    zzdlo.this.zzy(z8);
                }
            });
        }
    }

    public final synchronized void zzI() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzr();
    }

    public final void zzJ(View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfi)).booleanValue()) {
            zzccn zzp = this.zze.zzp();
            if (zzp == null) {
                return;
            }
            zzgft.zzr(zzp, new zzdln(this, view), this.zzd);
            return;
        }
        zzac(view, this.zze.zzu());
    }

    public final synchronized void zzK(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzs(view, motionEvent, view2);
    }

    public final synchronized void zzL(Bundle bundle) {
        this.zzf.zzt(bundle);
    }

    public final synchronized void zzM(View view) {
        this.zzf.zzu(view);
    }

    public final synchronized void zzN() {
        this.zzf.zzv();
    }

    public final synchronized void zzO(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzf.zzw(zzcsVar);
    }

    public final synchronized void zzP(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzx.zza(zzdgVar);
    }

    public final synchronized void zzQ(zzbjp zzbjpVar) {
        this.zzf.zzx(zzbjpVar);
    }

    public final synchronized void zzR(final zzdnp zzdnpVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbJ)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdle
                @Override // java.lang.Runnable
                public final void run() {
                    zzdlo.this.zzz(zzdnpVar);
                }
            });
        } else {
            zzz(zzdnpVar);
        }
    }

    public final synchronized void zzS(final zzdnp zzdnpVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbJ)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdlf
                @Override // java.lang.Runnable
                public final void run() {
                    zzdlo.this.zzA(zzdnpVar);
                }
            });
        } else {
            zzA(zzdnpVar);
        }
    }

    public final boolean zzT() {
        return this.zzh.zze();
    }

    public final synchronized boolean zzU() {
        return this.zzf.zzA();
    }

    public final synchronized boolean zzV() {
        return this.zzf.zzB();
    }

    public final boolean zzW() {
        return this.zzh.zzd();
    }

    public final synchronized boolean zzY(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zzC = this.zzf.zzC(bundle);
        this.zzq = zzC;
        return zzC;
    }

    public final synchronized int zza() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcup
    public final synchronized void zzb() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdlj
            @Override // java.lang.Runnable
            public final void run() {
                zzdlo.this.zzw();
            }
        });
        super.zzb();
    }

    public final zzdlq zzc() {
        return this.zzw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [x.l, java.util.Map] */
    @Nullable
    public final zzehg zzf(String str, boolean z8) {
        boolean z9;
        boolean z10;
        String str2;
        zzchd zzchdVar;
        zzehd zzehdVar;
        zzehd zzehdVar2;
        zzehc zzehcVar;
        String str3;
        if (!this.zzh.zzd() || TextUtils.isEmpty(str)) {
            return null;
        }
        zzdlt zzdltVar = this.zze;
        zzchd zzr = zzdltVar.zzr();
        zzchd zzs = zzdltVar.zzs();
        if (zzr == null && zzs == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid display and video webview are null. Skipping initialization.");
            return null;
        }
        boolean z11 = false;
        if (zzr != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (zzs != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfg)).booleanValue()) {
            this.zzh.zza();
            int zzc2 = this.zzh.zza().zzc();
            int i9 = zzc2 - 1;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (zzc2 != 1) {
                        if (zzc2 != 2) {
                            str3 = "UNKNOWN";
                        } else {
                            str3 = "DISPLAY";
                        }
                    } else {
                        str3 = "VIDEO";
                    }
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Unknown omid media type: " + str3 + ". Not initializing Omid.");
                    return null;
                }
                if (zzr != null) {
                    z10 = false;
                    z11 = true;
                } else {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid media type was display but there was no display webview.");
                    return null;
                }
            } else if (zzs != null) {
                z10 = true;
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid media type was video but there was no video webview.");
                return null;
            }
        } else {
            z11 = z9;
        }
        if (z11) {
            str2 = null;
            zzchdVar = zzr;
        } else {
            str2 = "javascript";
            zzchdVar = zzs;
        }
        zzchdVar.zzG();
        if (!com.google.android.gms.ads.internal.zzu.zzA().zzl(this.zzv)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to initialize omid in InternalNativeAd");
            return null;
        }
        VersionInfoParcel versionInfoParcel = this.zzu;
        String str4 = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
        if (z10) {
            zzehcVar = zzehc.VIDEO;
            zzehdVar2 = zzehd.DEFINED_BY_JAVASCRIPT;
        } else {
            zzdlt zzdltVar2 = this.zze;
            zzehc zzehcVar2 = zzehc.NATIVE_DISPLAY;
            if (zzdltVar2.zzc() == 3) {
                zzehdVar = zzehd.UNSPECIFIED;
            } else {
                zzehdVar = zzehd.ONE_PIXEL;
            }
            zzehdVar2 = zzehdVar;
            zzehcVar = zzehcVar2;
        }
        zzehg zzb = com.google.android.gms.ads.internal.zzu.zzA().zzb(str4, zzchdVar.zzG(), "", "javascript", str2, str, zzehdVar2, zzehcVar, this.zzb.zzam);
        if (zzb == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to create omid session in InternalNativeAd");
            return null;
        }
        this.zze.zzW(zzb);
        zzchdVar.zzat(zzb);
        if (z10) {
            com.google.android.gms.ads.internal.zzu.zzA().zzj(zzb.zza(), zzs.zzF());
            this.zzr = true;
        }
        if (z8) {
            com.google.android.gms.ads.internal.zzu.zzA().zzk(zzb.zza());
            zzchdVar.zzd("onSdkLoaded", new l());
        }
        return zzb;
    }

    public final String zzg() {
        return this.zzh.zzb();
    }

    public final synchronized JSONObject zzi(View view, Map map, Map map2) {
        return this.zzf.zze(view, map, map2, zzZ());
    }

    @Override // com.google.android.gms.internal.ads.zzcup
    public final void zzj() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdlg
            @Override // java.lang.Runnable
            public final void run() {
                zzdlo.zzs(zzdlo.this);
            }
        });
        if (this.zze.zzc() != 7) {
            Executor executor = this.zzd;
            final zzdmb zzdmbVar = this.zzf;
            Objects.requireNonNull(zzdmbVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdlh
                @Override // java.lang.Runnable
                public final void run() {
                    zzdmb.this.zzp();
                }
            });
        }
        super.zzj();
    }

    public final synchronized JSONObject zzk(View view, Map map, Map map2) {
        return this.zzf.zzf(view, map, map2, zzZ());
    }

    public final void zzu(View view) {
        zzehg zzu = this.zze.zzu();
        if (this.zzh.zzd() && zzu != null && view != null) {
            com.google.android.gms.ads.internal.zzu.zzA().zzg(zzu.zza(), view);
        }
    }

    public final synchronized void zzv() {
        this.zzf.zzh();
    }

    public final /* synthetic */ void zzw() {
        this.zzf.zzi();
        this.zze.zzI();
    }

    public final /* synthetic */ void zzx(View view, boolean z8, int i9) {
        this.zzf.zzo(view, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z8, zzZ(), i9);
    }

    public final /* synthetic */ void zzy(boolean z8) {
        this.zzf.zzo(null, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z8, zzZ(), 0);
    }
}
