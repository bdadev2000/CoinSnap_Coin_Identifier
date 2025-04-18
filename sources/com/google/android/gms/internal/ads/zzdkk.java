package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzdkk extends zzcte {
    public static final /* synthetic */ int zzc = 0;
    private final Executor zzd;
    private final zzdkp zze;
    private final zzdkx zzf;
    private final zzdlp zzg;
    private final zzdku zzh;
    private final zzdla zzi;
    private final zzhic zzj;
    private final zzhic zzk;
    private final zzhic zzl;
    private final zzhic zzm;
    private final zzhic zzn;
    private zzdml zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final zzbyv zzs;
    private final zzavn zzt;
    private final VersionInfoParcel zzu;
    private final Context zzv;
    private final zzdkm zzw;
    private final zzeoe zzx;
    private final Map zzy;
    private final List zzz;

    static {
        zzgax.zzs("3010", "3008", "1005", "1009", "2011", "2007");
    }

    public zzdkk(zzctd zzctdVar, Executor executor, zzdkp zzdkpVar, zzdkx zzdkxVar, zzdlp zzdlpVar, zzdku zzdkuVar, zzdla zzdlaVar, zzhic zzhicVar, zzhic zzhicVar2, zzhic zzhicVar3, zzhic zzhicVar4, zzhic zzhicVar5, zzbyv zzbyvVar, zzavn zzavnVar, VersionInfoParcel versionInfoParcel, Context context, zzdkm zzdkmVar, zzeoe zzeoeVar, zzayx zzayxVar) {
        super(zzctdVar);
        this.zzd = executor;
        this.zze = zzdkpVar;
        this.zzf = zzdkxVar;
        this.zzg = zzdlpVar;
        this.zzh = zzdkuVar;
        this.zzi = zzdlaVar;
        this.zzj = zzhicVar;
        this.zzk = zzhicVar2;
        this.zzl = zzhicVar3;
        this.zzm = zzhicVar4;
        this.zzn = zzhicVar5;
        this.zzs = zzbyvVar;
        this.zzt = zzavnVar;
        this.zzu = versionInfoParcel;
        this.zzv = context;
        this.zzw = zzdkmVar;
        this.zzx = zzeoeVar;
        this.zzy = new HashMap();
        this.zzz = new ArrayList();
    }

    public static boolean zzY(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkj)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        long zzw = com.google.android.gms.ads.internal.util.zzt.zzw(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (zzw >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkk)).intValue()) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    private final synchronized ImageView.ScaleType zzaa() {
        zzdml zzdmlVar = this.zzo;
        if (zzdmlVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper zzj = zzdmlVar.zzj();
        if (zzj != null) {
            return (ImageView.ScaleType) ObjectWrapper.unwrap(zzj);
        }
        return zzdlp.zza;
    }

    private final void zzab(String str, boolean z2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfd)).booleanValue()) {
            zzf("Google", true);
            return;
        }
        ListenableFuture zzw = this.zze.zzw();
        if (zzw == null) {
            return;
        }
        zzgfo.zzr(zzw, new zzdki(this, "Google", true), this.zzd);
    }

    private final synchronized void zzac(View view, Map map, Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzq(view, map, map2, zzaa());
        this.zzq = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzad(View view, @Nullable zzegf zzegfVar) {
        zzcfo zzr = this.zze.zzr();
        if (!this.zzh.zzd() || zzegfVar == null || zzr == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzA().zzj(zzegfVar.zza(), view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzae, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzz(zzdml zzdmlVar) {
        Iterator<String> keys;
        View view;
        zzavi zzc2;
        try {
            if (!this.zzp) {
                this.zzo = zzdmlVar;
                this.zzg.zze(zzdmlVar);
                this.zzf.zzy(zzdmlVar.zzf(), zzdmlVar.zzm(), zzdmlVar.zzn(), zzdmlVar, zzdmlVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcG)).booleanValue() && (zzc2 = this.zzt.zzc()) != null) {
                    zzc2.zzo(zzdmlVar.zzf());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbN)).booleanValue()) {
                    zzfgh zzfghVar = this.zzb;
                    if (zzfghVar.zzak && (keys = zzfghVar.zzaj.keys()) != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            WeakReference weakReference = (WeakReference) this.zzo.zzl().get(next);
                            this.zzy.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                zzayw zzaywVar = new zzayw(this.zzv, view);
                                this.zzz.add(zzaywVar);
                                zzaywVar.zzc(new zzdkh(this, next));
                            }
                        }
                    }
                }
                if (zzdmlVar.zzi() != null) {
                    zzdmlVar.zzi().zzc(this.zzs);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaf, reason: merged with bridge method [inline-methods] */
    public final void zzA(zzdml zzdmlVar) {
        this.zzf.zzz(zzdmlVar.zzf(), zzdmlVar.zzl());
        if (zzdmlVar.zzh() != null) {
            zzdmlVar.zzh().setClickable(false);
            zzdmlVar.zzh().removeAllViews();
        }
        if (zzdmlVar.zzi() != null) {
            zzdmlVar.zzi().zze(this.zzs);
        }
        this.zzo = null;
    }

    public static /* synthetic */ void zzl(zzdkk zzdkkVar) {
        try {
            zzdkp zzdkpVar = zzdkkVar.zze;
            int zzc2 = zzdkpVar.zzc();
            if (zzc2 == 1) {
                if (zzdkkVar.zzi.zzb() != null) {
                    zzdkkVar.zzab("Google", true);
                    zzdkkVar.zzi.zzb().zze((zzbgt) zzdkkVar.zzj.zzb());
                    return;
                }
                return;
            }
            if (zzc2 == 2) {
                if (zzdkkVar.zzi.zza() != null) {
                    zzdkkVar.zzab("Google", true);
                    zzdkkVar.zzi.zza().zze((zzbgr) zzdkkVar.zzk.zzb());
                    return;
                }
                return;
            }
            if (zzc2 == 3) {
                if (zzdkkVar.zzi.zzd(zzdkpVar.zzA()) != null) {
                    if (zzdkkVar.zze.zzs() != null) {
                        zzdkkVar.zzf("Google", true);
                    }
                    zzdkkVar.zzi.zzd(zzdkkVar.zze.zzA()).zze((zzbgw) zzdkkVar.zzn.zzb());
                    return;
                }
                return;
            }
            if (zzc2 == 6) {
                if (zzdkkVar.zzi.zzf() != null) {
                    zzdkkVar.zzab("Google", true);
                    zzdkkVar.zzi.zzf().zze((zzbhz) zzdkkVar.zzl.zzb());
                    return;
                }
                return;
            }
            if (zzc2 != 7) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Wrong native template id!");
                return;
            }
            zzdla zzdlaVar = zzdkkVar.zzi;
            if (zzdlaVar.zzg() != null) {
                zzdlaVar.zzg().zzg((zzbmj) zzdkkVar.zzm.zzb());
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }

    public final synchronized void zzB(View view, Map map, Map map2, boolean z2) {
        try {
            if (!this.zzq) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbN)).booleanValue() && this.zzb.zzak) {
                    Iterator it = this.zzy.keySet().iterator();
                    while (it.hasNext()) {
                        if (!((Boolean) this.zzy.get((String) it.next())).booleanValue()) {
                            break;
                        }
                    }
                }
                if (z2) {
                    zzac(view, map, map2);
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdP)).booleanValue() && map != null) {
                    Iterator it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                        if (view2 != null && zzY(view2)) {
                            zzac(view, map, map2);
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzC(@Nullable com.google.android.gms.ads.internal.client.zzdh zzdhVar) {
        this.zzf.zzj(zzdhVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Map, androidx.collection.SimpleArrayMap] */
    public final synchronized void zzD(View view, View view2, Map map, Map map2, boolean z2) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzk(view, view2, map, map2, z2, zzaa());
        if (this.zzr) {
            zzdkp zzdkpVar = this.zze;
            if (zzdkpVar.zzs() != null) {
                zzdkpVar.zzs().zzd("onSdkAdUserInteractionClick", new SimpleArrayMap());
            }
        }
    }

    public final synchronized void zzE(@Nullable final View view, final int i2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzlg)).booleanValue()) {
            zzdml zzdmlVar = this.zzo;
            if (zzdmlVar == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z2 = zzdmlVar instanceof zzdlj;
                this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdke
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdkk.this.zzx(view, z2, i2);
                    }
                });
            }
        }
    }

    public final synchronized void zzF(String str) {
        this.zzf.zzl(str);
    }

    public final synchronized void zzG(Bundle bundle) {
        this.zzf.zzm(bundle);
    }

    public final synchronized void zzH() {
        zzdml zzdmlVar = this.zzo;
        if (zzdmlVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z2 = zzdmlVar instanceof zzdlj;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkg
                @Override // java.lang.Runnable
                public final void run() {
                    zzdkk.this.zzy(z2);
                }
            });
        }
    }

    public final void zzI(Bundle bundle) {
        final zzcfo zzs = this.zze.zzs();
        if (zzs == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Video webview is null");
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkd
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = zzdkk.zzc;
                    zzcfo.this.zze("onVideoEvent", jSONObject);
                }
            });
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error reading event signals", e);
        }
    }

    public final synchronized void zzJ() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzr();
    }

    public final void zzK(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfd)).booleanValue()) {
            zzad(view, this.zze.zzu());
            return;
        }
        zzcas zzp = this.zze.zzp();
        if (zzp == null) {
            return;
        }
        zzgfo.zzr(zzp, new zzdkj(this, view), this.zzd);
    }

    public final synchronized void zzL(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzs(view, motionEvent, view2);
    }

    public final synchronized void zzM(Bundle bundle) {
        this.zzf.zzt(bundle);
    }

    public final synchronized void zzN(View view) {
        this.zzf.zzu(view);
    }

    public final synchronized void zzO() {
        this.zzf.zzv();
    }

    public final synchronized void zzP(com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        this.zzf.zzw(zzddVar);
    }

    public final synchronized void zzQ(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        this.zzx.zza(zzdrVar);
    }

    public final synchronized void zzR(zzbhw zzbhwVar) {
        this.zzf.zzx(zzbhwVar);
    }

    public final synchronized void zzS(final zzdml zzdmlVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbL)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjz
                @Override // java.lang.Runnable
                public final void run() {
                    zzdkk.this.zzz(zzdmlVar);
                }
            });
        } else {
            zzz(zzdmlVar);
        }
    }

    public final synchronized void zzT(final zzdml zzdmlVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbL)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdka
                @Override // java.lang.Runnable
                public final void run() {
                    zzdkk.this.zzA(zzdmlVar);
                }
            });
        } else {
            zzA(zzdmlVar);
        }
    }

    public final boolean zzU() {
        return this.zzh.zze();
    }

    public final synchronized boolean zzV() {
        return this.zzf.zzA();
    }

    public final synchronized boolean zzW() {
        return this.zzf.zzB();
    }

    public final boolean zzX() {
        return this.zzh.zzd();
    }

    public final synchronized boolean zzZ(Bundle bundle) {
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

    @Override // com.google.android.gms.internal.ads.zzcte
    public final synchronized void zzb() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkf
            @Override // java.lang.Runnable
            public final void run() {
                zzdkk.this.zzw();
            }
        });
        super.zzb();
    }

    public final zzdkm zzc() {
        return this.zzw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.Map, androidx.collection.SimpleArrayMap] */
    @Nullable
    public final zzegf zzf(String str, boolean z2) {
        String str2;
        zzcfo zzcfoVar;
        zzegc zzegcVar;
        zzegb zzegbVar;
        if (!this.zzh.zzd() || TextUtils.isEmpty(str)) {
            return null;
        }
        zzdkp zzdkpVar = this.zze;
        zzcfo zzr = zzdkpVar.zzr();
        zzcfo zzs = zzdkpVar.zzs();
        if (zzr == null && zzs == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid display and video webview are null. Skipping initialization.");
            return null;
        }
        boolean z3 = false;
        boolean z4 = zzr != null;
        boolean z5 = zzs != null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfb)).booleanValue()) {
            this.zzh.zza();
            int zzc2 = this.zzh.zza().zzc();
            int i2 = zzc2 - 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Unknown omid media type: " + (zzc2 != 1 ? zzc2 != 2 ? "UNKNOWN" : "DISPLAY" : ShareConstants.VIDEO_URL) + ". Not initializing Omid.");
                    return null;
                }
                if (zzr == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid media type was display but there was no display webview.");
                    return null;
                }
                z5 = false;
                z3 = true;
            } else {
                if (zzs == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid media type was video but there was no video webview.");
                    return null;
                }
                z5 = true;
            }
        } else {
            z3 = z4;
        }
        if (z3) {
            str2 = null;
            zzcfoVar = zzr;
        } else {
            str2 = "javascript";
            zzcfoVar = zzs;
        }
        zzcfoVar.zzG();
        if (!com.google.android.gms.ads.internal.zzu.zzA().zzl(this.zzv)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to initialize omid in InternalNativeAd");
            return null;
        }
        VersionInfoParcel versionInfoParcel = this.zzu;
        String str3 = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
        if (z5) {
            zzegbVar = zzegb.VIDEO;
            zzegcVar = zzegc.DEFINED_BY_JAVASCRIPT;
        } else {
            zzdkp zzdkpVar2 = this.zze;
            zzegb zzegbVar2 = zzegb.NATIVE_DISPLAY;
            zzegcVar = zzdkpVar2.zzc() == 3 ? zzegc.UNSPECIFIED : zzegc.ONE_PIXEL;
            zzegbVar = zzegbVar2;
        }
        zzegf zzb = com.google.android.gms.ads.internal.zzu.zzA().zzb(str3, zzcfoVar.zzG(), "", "javascript", str2, str, zzegcVar, zzegbVar, this.zzb.zzal);
        if (zzb == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to create omid session in InternalNativeAd");
            return null;
        }
        this.zze.zzW(zzb);
        zzcfoVar.zzat(zzb);
        if (z5) {
            com.google.android.gms.ads.internal.zzu.zzA().zzj(zzb.zza(), zzs.zzF());
            this.zzr = true;
        }
        if (z2) {
            com.google.android.gms.ads.internal.zzu.zzA().zzk(zzb.zza());
            zzcfoVar.zzd("onSdkLoaded", new SimpleArrayMap());
        }
        return zzb;
    }

    public final String zzg() {
        return this.zzh.zzb();
    }

    public final synchronized JSONObject zzi(View view, Map map, Map map2) {
        return this.zzf.zze(view, map, map2, zzaa());
    }

    public final synchronized JSONObject zzj(View view, Map map, Map map2) {
        return this.zzf.zzf(view, map, map2, zzaa());
    }

    @Override // com.google.android.gms.internal.ads.zzcte
    @AnyThread
    public final void zzk() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkb
            @Override // java.lang.Runnable
            public final void run() {
                zzdkk.zzl(zzdkk.this);
            }
        });
        if (this.zze.zzc() != 7) {
            Executor executor = this.zzd;
            final zzdkx zzdkxVar = this.zzf;
            Objects.requireNonNull(zzdkxVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkc
                @Override // java.lang.Runnable
                public final void run() {
                    zzdkx.this.zzp();
                }
            });
        }
        super.zzk();
    }

    public final void zzu(View view) {
        zzegf zzu = this.zze.zzu();
        if (!this.zzh.zzd() || zzu == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzA().zzg(zzu.zza(), view);
    }

    public final synchronized void zzv() {
        this.zzf.zzh();
    }

    public final /* synthetic */ void zzw() {
        this.zzf.zzi();
        this.zze.zzI();
    }

    public final /* synthetic */ void zzx(View view, boolean z2, int i2) {
        this.zzf.zzo(view, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z2, zzaa(), i2);
    }

    public final /* synthetic */ void zzy(boolean z2) {
        this.zzf.zzo(null, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z2, zzaa(), 0);
    }
}
