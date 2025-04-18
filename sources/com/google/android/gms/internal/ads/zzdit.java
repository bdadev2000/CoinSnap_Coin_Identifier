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
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdit extends zzcrq {
    public static final /* synthetic */ int zzc = 0;
    private final Executor zzd;
    private final zzdiy zze;
    private final zzdjg zzf;
    private final zzdjy zzg;
    private final zzdjd zzh;
    private final zzdjj zzi;
    private final zzhfr zzj;
    private final zzhfr zzk;
    private final zzhfr zzl;
    private final zzhfr zzm;
    private final zzhfr zzn;
    private zzdku zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final zzbyr zzs;
    private final zzavc zzt;
    private final VersionInfoParcel zzu;
    private final Context zzv;
    private final zzdiv zzw;
    private final zzemv zzx;
    private final Map zzy;
    private final List zzz;

    static {
        zzfzo.zzs("3010", "3008", "1005", "1009", "2011", "2007");
    }

    public zzdit(zzcrp zzcrpVar, Executor executor, zzdiy zzdiyVar, zzdjg zzdjgVar, zzdjy zzdjyVar, zzdjd zzdjdVar, zzdjj zzdjjVar, zzhfr zzhfrVar, zzhfr zzhfrVar2, zzhfr zzhfrVar3, zzhfr zzhfrVar4, zzhfr zzhfrVar5, zzbyr zzbyrVar, zzavc zzavcVar, VersionInfoParcel versionInfoParcel, Context context, zzdiv zzdivVar, zzemv zzemvVar, zzayo zzayoVar) {
        super(zzcrpVar);
        this.zzd = executor;
        this.zze = zzdiyVar;
        this.zzf = zzdjgVar;
        this.zzg = zzdjyVar;
        this.zzh = zzdjdVar;
        this.zzi = zzdjjVar;
        this.zzj = zzhfrVar;
        this.zzk = zzhfrVar2;
        this.zzl = zzhfrVar3;
        this.zzm = zzhfrVar4;
        this.zzn = zzhfrVar5;
        this.zzs = zzbyrVar;
        this.zzt = zzavcVar;
        this.zzu = versionInfoParcel;
        this.zzv = context;
        this.zzw = zzdivVar;
        this.zzx = zzemvVar;
        this.zzy = new HashMap();
        this.zzz = new ArrayList();
    }

    public static boolean zzY(View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkl)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            long zzw = com.google.android.gms.ads.internal.util.zzs.zzw(view);
            if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
                if (zzw >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkm)).intValue()) {
                    return true;
                }
            }
            return false;
        }
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            return true;
        }
        return false;
    }

    @Nullable
    private final synchronized ImageView.ScaleType zzaa() {
        zzdku zzdkuVar = this.zzo;
        if (zzdkuVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper zzj = zzdkuVar.zzj();
        if (zzj != null) {
            return (ImageView.ScaleType) ObjectWrapper.unwrap(zzj);
        }
        return zzdjy.zza;
    }

    private final void zzab(String str, boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfk)).booleanValue()) {
            ua.b zzw = this.zze.zzw();
            if (zzw == null) {
                return;
            }
            zzgei.zzr(zzw, new zzdir(this, "Google", true), this.zzd);
            return;
        }
        zzf("Google", true);
    }

    private final synchronized void zzac(View view, Map map, Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzq(view, map, map2, zzaa());
        this.zzq = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzad(View view, @Nullable zzeew zzeewVar) {
        zzcfk zzr = this.zze.zzr();
        if (this.zzh.zzd() && zzeewVar != null && zzr != null && view != null) {
            com.google.android.gms.ads.internal.zzv.zzB().zzj(zzeewVar.zza(), view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzae, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzz(zzdku zzdkuVar) {
        Iterator<String> keys;
        View view;
        zzaux zzc2;
        if (!this.zzp) {
            this.zzo = zzdkuVar;
            this.zzg.zze(zzdkuVar);
            this.zzf.zzy(zzdkuVar.zzf(), zzdkuVar.zzm(), zzdkuVar.zzn(), zzdkuVar, zzdkuVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcJ)).booleanValue() && (zzc2 = this.zzt.zzc()) != null) {
                zzc2.zzo(zzdkuVar.zzf());
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbQ)).booleanValue()) {
                zzfet zzfetVar = this.zzb;
                if (zzfetVar.zzak && (keys = zzfetVar.zzaj.keys()) != null) {
                    while (keys.hasNext()) {
                        String next = keys.next();
                        WeakReference weakReference = (WeakReference) this.zzo.zzl().get(next);
                        this.zzy.put(next, Boolean.FALSE);
                        if (weakReference != null && (view = (View) weakReference.get()) != null) {
                            zzayn zzaynVar = new zzayn(this.zzv, view);
                            this.zzz.add(zzaynVar);
                            zzaynVar.zzc(new zzdiq(this, next));
                        }
                    }
                }
            }
            if (zzdkuVar.zzi() != null) {
                zzdkuVar.zzi().zzc(this.zzs);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaf, reason: merged with bridge method [inline-methods] */
    public final void zzA(zzdku zzdkuVar) {
        this.zzf.zzz(zzdkuVar.zzf(), zzdkuVar.zzl());
        if (zzdkuVar.zzh() != null) {
            zzdkuVar.zzh().setClickable(false);
            zzdkuVar.zzh().removeAllViews();
        }
        if (zzdkuVar.zzi() != null) {
            zzdkuVar.zzi().zze(this.zzs);
        }
        this.zzo = null;
    }

    public static /* synthetic */ void zzl(zzdit zzditVar) {
        try {
            zzdiy zzdiyVar = zzditVar.zze;
            int zzc2 = zzdiyVar.zzc();
            if (zzc2 != 1) {
                if (zzc2 != 2) {
                    if (zzc2 != 3) {
                        if (zzc2 != 6) {
                            if (zzc2 != 7) {
                                com.google.android.gms.ads.internal.util.client.zzm.zzg("Wrong native template id!");
                                return;
                            }
                            zzdjj zzdjjVar = zzditVar.zzi;
                            if (zzdjjVar.zzg() != null) {
                                zzdjjVar.zzg().zzg((zzbme) zzditVar.zzm.zzb());
                                return;
                            }
                            return;
                        }
                        if (zzditVar.zzi.zzf() != null) {
                            zzditVar.zzab("Google", true);
                            zzditVar.zzi.zzf().zze((zzbhv) zzditVar.zzl.zzb());
                            return;
                        }
                        return;
                    }
                    if (zzditVar.zzi.zzd(zzdiyVar.zzA()) != null) {
                        if (zzditVar.zze.zzs() != null) {
                            zzditVar.zzf("Google", true);
                        }
                        zzditVar.zzi.zzd(zzditVar.zze.zzA()).zze((zzbgs) zzditVar.zzn.zzb());
                        return;
                    }
                    return;
                }
                if (zzditVar.zzi.zza() != null) {
                    zzditVar.zzab("Google", true);
                    zzditVar.zzi.zza().zze((zzbgn) zzditVar.zzk.zzb());
                    return;
                }
                return;
            }
            if (zzditVar.zzi.zzb() != null) {
                zzditVar.zzab("Google", true);
                zzditVar.zzi.zzb().zze((zzbgp) zzditVar.zzj.zzb());
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("RemoteException when notifyAdLoad is called", e2);
        }
    }

    public final synchronized void zzB(View view, Map map, Map map2, boolean z10) {
        if (!this.zzq) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbQ)).booleanValue() && this.zzb.zzak) {
                Iterator it = this.zzy.keySet().iterator();
                while (it.hasNext()) {
                    if (!((Boolean) this.zzy.get((String) it.next())).booleanValue()) {
                        break;
                    }
                }
            }
            if (!z10) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdW)).booleanValue() && map != null) {
                    Iterator it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                        if (view2 != null && zzY(view2)) {
                            zzac(view, map, map2);
                            return;
                        }
                    }
                }
            } else {
                zzac(view, map, map2);
            }
        }
    }

    public final synchronized void zzC(@Nullable com.google.android.gms.ads.internal.client.zzdh zzdhVar) {
        this.zzf.zzj(zzdhVar);
    }

    public final synchronized void zzD(View view, View view2, Map map, Map map2, boolean z10) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzk(view, view2, map, map2, z10, zzaa());
        if (this.zzr) {
            zzdiy zzdiyVar = this.zze;
            if (zzdiyVar.zzs() != null) {
                zzdiyVar.zzs().zzd("onSdkAdUserInteractionClick", new r.b());
            }
        }
    }

    public final synchronized void zzE(@Nullable final View view, final int i10) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlh)).booleanValue()) {
            return;
        }
        zzdku zzdkuVar = this.zzo;
        if (zzdkuVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        } else {
            final boolean z10 = zzdkuVar instanceof zzdjs;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdin
                @Override // java.lang.Runnable
                public final void run() {
                    zzdit.this.zzx(view, z10, i10);
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
        zzdku zzdkuVar = this.zzo;
        if (zzdkuVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z10 = zzdkuVar instanceof zzdjs;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdip
                @Override // java.lang.Runnable
                public final void run() {
                    zzdit.this.zzy(z10);
                }
            });
        }
    }

    public final void zzI(Bundle bundle) {
        final zzcfk zzs = this.zze.zzs();
        if (zzs == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Video webview is null");
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdim
                @Override // java.lang.Runnable
                public final void run() {
                    int i10 = zzdit.zzc;
                    zzcfk.this.zze("onVideoEvent", jSONObject);
                }
            });
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error reading event signals", e2);
        }
    }

    public final synchronized void zzJ() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzr();
    }

    public final void zzK(View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfk)).booleanValue()) {
            zzcao zzp = this.zze.zzp();
            if (zzp == null) {
                return;
            }
            zzgei.zzr(zzp, new zzdis(this, view), this.zzd);
            return;
        }
        zzad(view, this.zze.zzu());
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

    public final synchronized void zzR(zzbhs zzbhsVar) {
        this.zzf.zzx(zzbhsVar);
    }

    public final synchronized void zzS(final zzdku zzdkuVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbO)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdii
                @Override // java.lang.Runnable
                public final void run() {
                    zzdit.this.zzz(zzdkuVar);
                }
            });
        } else {
            zzz(zzdkuVar);
        }
    }

    public final synchronized void zzT(final zzdku zzdkuVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbO)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdij
                @Override // java.lang.Runnable
                public final void run() {
                    zzdit.this.zzA(zzdkuVar);
                }
            });
        } else {
            zzA(zzdkuVar);
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

    @Override // com.google.android.gms.internal.ads.zzcrq
    public final synchronized void zzb() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdio
            @Override // java.lang.Runnable
            public final void run() {
                zzdit.this.zzw();
            }
        });
        super.zzb();
    }

    public final zzdiv zzc() {
        return this.zzw;
    }

    @Nullable
    public final zzeew zzf(String str, boolean z10) {
        boolean z11;
        boolean z12;
        String str2;
        zzeet zzeetVar;
        zzeet zzeetVar2;
        zzees zzeesVar;
        String str3;
        if (!this.zzh.zzd() || TextUtils.isEmpty(str)) {
            return null;
        }
        zzdiy zzdiyVar = this.zze;
        zzcfk zzr = zzdiyVar.zzr();
        zzcfk zzs = zzdiyVar.zzs();
        if (zzr == null && zzs == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid display and video webview are null. Skipping initialization.");
            return null;
        }
        boolean z13 = false;
        if (zzr != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (zzs != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfi)).booleanValue()) {
            this.zzh.zza();
            int zzc2 = this.zzh.zza().zzc();
            int i10 = zzc2 - 1;
            if (i10 != 0) {
                if (i10 != 1) {
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
                    z12 = false;
                    z13 = true;
                } else {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid media type was display but there was no display webview.");
                    return null;
                }
            } else if (zzs != null) {
                z12 = true;
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid media type was video but there was no video webview.");
                return null;
            }
        } else {
            z13 = z11;
        }
        if (z13) {
            str2 = null;
        } else {
            str2 = "javascript";
            zzr = zzs;
        }
        zzr.zzG();
        if (!com.google.android.gms.ads.internal.zzv.zzB().zzl(this.zzv)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to initialize omid in InternalNativeAd");
            return null;
        }
        VersionInfoParcel versionInfoParcel = this.zzu;
        String str4 = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
        if (z12) {
            zzeesVar = zzees.VIDEO;
            zzeetVar2 = zzeet.DEFINED_BY_JAVASCRIPT;
        } else {
            zzdiy zzdiyVar2 = this.zze;
            zzees zzeesVar2 = zzees.NATIVE_DISPLAY;
            if (zzdiyVar2.zzc() == 3) {
                zzeetVar = zzeet.UNSPECIFIED;
            } else {
                zzeetVar = zzeet.ONE_PIXEL;
            }
            zzeetVar2 = zzeetVar;
            zzeesVar = zzeesVar2;
        }
        zzeew zzb = com.google.android.gms.ads.internal.zzv.zzB().zzb(str4, zzr.zzG(), "", "javascript", str2, str, zzeetVar2, zzeesVar, this.zzb.zzal);
        if (zzb == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to create omid session in InternalNativeAd");
            return null;
        }
        this.zze.zzW(zzb);
        zzr.zzat(zzb);
        if (z12) {
            com.google.android.gms.ads.internal.zzv.zzB().zzj(zzb.zza(), zzs.zzF());
            this.zzr = true;
        }
        if (z10) {
            com.google.android.gms.ads.internal.zzv.zzB().zzk(zzb.zza());
            zzr.zzd("onSdkLoaded", new r.b());
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

    @Override // com.google.android.gms.internal.ads.zzcrq
    public final void zzk() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdik
            @Override // java.lang.Runnable
            public final void run() {
                zzdit.zzl(zzdit.this);
            }
        });
        if (this.zze.zzc() != 7) {
            Executor executor = this.zzd;
            final zzdjg zzdjgVar = this.zzf;
            Objects.requireNonNull(zzdjgVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdil
                @Override // java.lang.Runnable
                public final void run() {
                    zzdjg.this.zzp();
                }
            });
        }
        super.zzk();
    }

    public final void zzu(View view) {
        zzeew zzu = this.zze.zzu();
        if (this.zzh.zzd() && zzu != null && view != null) {
            com.google.android.gms.ads.internal.zzv.zzB().zzg(zzu.zza(), view);
        }
    }

    public final synchronized void zzv() {
        this.zzf.zzh();
    }

    public final /* synthetic */ void zzw() {
        this.zzf.zzi();
        this.zze.zzI();
    }

    public final /* synthetic */ void zzx(View view, boolean z10, int i10) {
        this.zzf.zzo(view, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z10, zzaa(), i10);
    }

    public final /* synthetic */ void zzy(boolean z10) {
        this.zzf.zzo(null, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z10, zzaa(), 0);
    }
}
