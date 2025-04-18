package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdhu implements zzdjg {
    private com.google.android.gms.ads.internal.client.zzdd zzC;
    private final Context zza;
    private final zzdjj zzb;
    private final JSONObject zzc;
    private final zzdoc zzd;
    private final zzdiy zze;
    private final zzavc zzf;
    private final zzcxe zzg;
    private final zzcwk zzh;
    private final zzdej zzi;
    private final zzfet zzj;
    private final VersionInfoParcel zzk;
    private final zzffo zzl;
    private final zzcny zzm;
    private final zzdkc zzn;
    private final Clock zzo;
    private final zzdef zzp;
    private final zzflr zzq;
    private final zzdps zzr;
    private final zzfkl zzs;
    private final zzeea zzt;
    private boolean zzv;
    private boolean zzu = false;
    private boolean zzw = false;
    private boolean zzx = false;
    private Point zzy = new Point();
    private Point zzz = new Point();
    private long zzA = 0;
    private long zzB = 0;

    public zzdhu(Context context, zzdjj zzdjjVar, JSONObject jSONObject, zzdoc zzdocVar, zzdiy zzdiyVar, zzavc zzavcVar, zzcxe zzcxeVar, zzcwk zzcwkVar, zzdej zzdejVar, zzfet zzfetVar, VersionInfoParcel versionInfoParcel, zzffo zzffoVar, zzcny zzcnyVar, zzdkc zzdkcVar, Clock clock, zzdef zzdefVar, zzflr zzflrVar, zzfkl zzfklVar, zzeea zzeeaVar, zzdps zzdpsVar) {
        this.zza = context;
        this.zzb = zzdjjVar;
        this.zzc = jSONObject;
        this.zzd = zzdocVar;
        this.zze = zzdiyVar;
        this.zzf = zzavcVar;
        this.zzg = zzcxeVar;
        this.zzh = zzcwkVar;
        this.zzi = zzdejVar;
        this.zzj = zzfetVar;
        this.zzk = versionInfoParcel;
        this.zzl = zzffoVar;
        this.zzm = zzcnyVar;
        this.zzn = zzdkcVar;
        this.zzo = clock;
        this.zzp = zzdefVar;
        this.zzq = zzflrVar;
        this.zzs = zzfklVar;
        this.zzt = zzeeaVar;
        this.zzr = zzdpsVar;
    }

    @Nullable
    private final String zzD(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdD)).booleanValue()) {
            return null;
        }
        try {
            return this.zzf.zzc().zzh(this.zza, view, null);
        } catch (Exception unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Exception getting data.");
            return null;
        }
    }

    @Nullable
    private final String zzE(@Nullable View view, @Nullable Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int zzc = this.zze.zzc();
        if (zzc != 1) {
            if (zzc != 2) {
                if (zzc != 6) {
                    return null;
                }
                return "3099";
            }
            return "2099";
        }
        return "1099";
    }

    private final boolean zzF(String str) {
        JSONObject optJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null || !optJSONObject.optBoolean(str, false)) {
            return false;
        }
        return true;
    }

    private final boolean zzG() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean zzH(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4, @Nullable String str, @Nullable JSONObject jSONObject5, boolean z10) {
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdD)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z10);
            Context context = this.zza;
            JSONObject jSONObject7 = new JSONObject();
            com.google.android.gms.ads.internal.zzv.zzq();
            DisplayMetrics zzt = com.google.android.gms.ads.internal.util.zzs.zzt((WindowManager) context.getSystemService("window"));
            zzdht zzdhtVar = null;
            try {
                jSONObject7.put("width", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, zzt.widthPixels));
                jSONObject7.put("height", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, zzt.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzij)).booleanValue()) {
                this.zzd.zzl("/clickRecorded", new zzdhr(this, null));
            } else {
                this.zzd.zzl("/logScionEvent", new zzdhq(this, null));
            }
            this.zzd.zzl("/nativeImpression", new zzdhs(this, zzdhtVar));
            zzcam.zza(this.zzd.zzg("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (!this.zzu) {
                zzfet zzfetVar = this.zzj;
                this.zzu = com.google.android.gms.ads.internal.zzv.zzt().zzn(this.zza, this.zzk.afmaVersion, zzfetVar.zzC.toString(), this.zzl.zzf);
                return true;
            }
            return true;
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to create impression JSON.", e2);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final boolean zzA() {
        if (zza() != 0) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlh)).booleanValue()) {
                return this.zzl.zzi.zzj;
            }
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final boolean zzB() {
        return zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final boolean zzC(Bundle bundle) {
        if (!zzF("impression_reporting")) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        String str = null;
        JSONObject zzk = com.google.android.gms.ads.internal.client.zzbc.zzb().zzk(bundle, null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzld)).booleanValue()) {
            str = zzD(null);
        }
        return zzH(null, null, null, null, str, zzk, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final int zza() {
        if (this.zzl.zzi != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlh)).booleanValue()) {
                return this.zzl.zzi.zzi;
            }
            return 0;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    @Nullable
    public final JSONObject zze(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbu.zzd(context, map, map2, view, scaleType);
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbu.zzg(context, view);
        JSONObject zzf = com.google.android.gms.ads.internal.util.zzbu.zzf(view);
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbu.zze(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", zzd);
            jSONObject.put("ad_view_signal", zzg);
            jSONObject.put("scroll_view_signal", zzf);
            jSONObject.put("lock_screen_signal", zze);
            return jSONObject;
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to create native ad view signals JSON.", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    @Nullable
    public final JSONObject zzf(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        JSONObject zze = zze(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzx && zzG()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (zze != null) {
                jSONObject.put("nas", zze);
            }
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to create native click meta data JSON.", e2);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzg() {
        try {
            com.google.android.gms.ads.internal.client.zzdd zzddVar = this.zzC;
            if (zzddVar != null) {
                zzddVar.zze();
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzh() {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            return;
        }
        this.zzn.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzi() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzj(@Nullable com.google.android.gms.ads.internal.client.zzdh zzdhVar) {
        try {
            if (this.zzw) {
                return;
            }
            if (zzdhVar == null) {
                zzdiy zzdiyVar = this.zze;
                if (zzdiyVar.zzk() != null) {
                    this.zzw = true;
                    this.zzq.zzc(zzdiyVar.zzk().zzf(), this.zzs);
                    zzg();
                    return;
                }
            }
            this.zzw = true;
            this.zzq.zzc(zzdhVar.zzf(), this.zzs);
            zzg();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzk(View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z10, @Nullable ImageView.ScaleType scaleType) {
        View view3;
        Context context = this.zza;
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbu.zzd(context, map, map2, view2, scaleType);
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbu.zzg(context, view2);
        JSONObject zzf = com.google.android.gms.ads.internal.util.zzbu.zzf(view2);
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbu.zze(context, view2);
        String zzE = zzE(view, map);
        JSONObject zzc = com.google.android.gms.ads.internal.util.zzbu.zzc(zzE, context, this.zzz, this.zzy);
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdK)).booleanValue()) {
            view3 = view2;
        } else {
            view3 = view;
        }
        zzn(view3, zzg, zzd, zzf, zze, zzE, zzc, null, z10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzl(String str) {
        zzn(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzm(@Nullable Bundle bundle) {
        String str;
        if (bundle == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Click data is null. No click is reported.");
            return;
        }
        if (!zzF("click_reporting")) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
            return;
        }
        Bundle bundle2 = bundle.getBundle("click_signal");
        if (bundle2 != null) {
            str = bundle2.getString("asset_id");
        } else {
            str = null;
        }
        zzn(null, null, null, null, null, str, null, com.google.android.gms.ads.internal.client.zzbc.zzb().zzk(bundle, null), false, false);
    }

    public final void zzn(@Nullable View view, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4, @Nullable String str, @Nullable JSONObject jSONObject5, @Nullable JSONObject jSONObject6, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        String str2;
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.zzc);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            boolean z15 = false;
            if (this.zzb.zzc(this.zze.zzA()) != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            jSONObject7.put("has_custom_click_handler", z12);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.zze.zzc());
            jSONObject8.put("view_aware_api_used", z10);
            zzbfn zzbfnVar = this.zzl.zzi;
            if (zzbfnVar != null && zzbfnVar.zzg) {
                z13 = true;
            } else {
                z13 = false;
            }
            jSONObject8.put("custom_mute_requested", z13);
            if (!this.zze.zzH().isEmpty() && this.zze.zzk() != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            jSONObject8.put("custom_mute_enabled", z14);
            if (this.zzn.zza() != null && this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put(CampaignEx.JSON_KEY_TIMESTAMP, this.zzo.currentTimeMillis());
            if (this.zzx && zzG()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z11) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            if (this.zzb.zzc(this.zze.zzA()) != null) {
                z15 = true;
            }
            jSONObject8.put("has_custom_click_handler", z15);
            String str3 = null;
            try {
                JSONObject optJSONObject = this.zzc.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.zzf.zzc().zzd(this.zza, optJSONObject.optString("click_string"), view);
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception obtaining click signals", e2);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            jSONObject8.put("open_chrome_custom_tab", true);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzin)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzio)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put(CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long currentTimeMillis = this.zzo.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", currentTimeMillis - this.zzA);
            jSONObject9.put("time_from_last_touch", currentTimeMillis - this.zzB);
            jSONObject7.put("touch_signal", jSONObject9);
            if (this.zzj.zzai) {
                JSONObject jSONObject10 = (JSONObject) this.zzc.get("tracking_urls_and_actions");
                if (jSONObject10 != null) {
                    str3 = jSONObject10.getString("gws_query_id");
                }
                if (str3 != null) {
                    this.zzt.zzq(str3, this.zze);
                }
            }
            zzcam.zza(this.zzd.zzg("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to create click JSON.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzo(@Nullable View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z10, @Nullable ImageView.ScaleType scaleType, int i10) {
        JSONObject jSONObject;
        boolean z11 = false;
        if (this.zzc.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlh)).booleanValue()) {
                z11 = true;
            }
        }
        if (!z11) {
            if (!this.zzx) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzG()) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbu.zzd(this.zza, map, map2, view2, scaleType);
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbu.zzg(this.zza, view2);
        JSONObject zzf = com.google.android.gms.ads.internal.util.zzbu.zzf(view2);
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbu.zze(this.zza, view2);
        String zzE = zzE(view, map);
        JSONObject zzc = com.google.android.gms.ads.internal.util.zzbu.zzc(zzE, this.zza, this.zzz, this.zzy);
        if (z11) {
            try {
                JSONObject jSONObject2 = this.zzc;
                Point point = this.zzz;
                Point point2 = this.zzy;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i10);
                    } catch (Exception e2) {
                        e = e2;
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while grabbing custom click gesture signals.", e);
                        jSONObject2.put("custom_click_gesture_signal", jSONObject);
                        zzn(view2, zzg, zzd, zzf, zze, zzE, zzc, null, z10, true);
                    }
                } catch (Exception e10) {
                    e = e10;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e11) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while adding CustomClickGestureSignals to adJson.", e11);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e11, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzn(view2, zzg, zzd, zzf, zze, zzE, zzc, null, z10, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzp() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzcam.zza(this.zzd.zzg("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzq(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        Context context = this.zza;
        zzH(com.google.android.gms.ads.internal.util.zzbu.zzg(context, view), com.google.android.gms.ads.internal.util.zzbu.zzd(context, map, map2, view, scaleType), com.google.android.gms.ads.internal.util.zzbu.zzf(view), com.google.android.gms.ads.internal.util.zzbu.zze(context, view), zzD(view), null, com.google.android.gms.ads.internal.util.zzbu.zzh(context, this.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzr() {
        zzH(null, null, null, null, null, null, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzs(@Nullable View view, MotionEvent motionEvent, @Nullable View view2) {
        this.zzy = com.google.android.gms.ads.internal.util.zzbu.zza(motionEvent, view2);
        long currentTimeMillis = this.zzo.currentTimeMillis();
        this.zzB = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzr.zzb(motionEvent);
            this.zzA = currentTimeMillis;
            this.zzz = this.zzy;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzy;
        obtain.setLocation(point.x, point.y);
        this.zzf.zzd(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzt(@Nullable Bundle bundle) {
        if (bundle == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!zzF("touch_reporting")) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.zzf.zzc().zzl((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzu(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdkc zzdkcVar = this.zzn;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdkcVar);
        view.setClickable(true);
        zzdkcVar.zzc = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzv() {
        this.zzx = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzw(com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        this.zzC = zzddVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzx(zzbhs zzbhsVar) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            this.zzn.zzc(zzbhsVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzy(View view, @Nullable Map map, @Nullable Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (!this.zzv) {
            this.zzp.zza(view);
            this.zzv = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzi(this);
        boolean zzi = com.google.android.gms.ads.internal.util.zzbu.zzi(this.zzk.clientJarVersion);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zzi) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zzi) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzz(@Nullable View view, @Nullable Map map) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzv = false;
    }
}
