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
import androidx.annotation.VisibleForTesting;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzdjl implements zzdkx {
    private com.google.android.gms.ads.internal.client.zzdd zzC;
    private final Context zza;
    private final zzdla zzb;
    private final JSONObject zzc;
    private final zzdpt zzd;
    private final zzdkp zze;
    private final zzavn zzf;
    private final zzcys zzg;
    private final zzcxy zzh;
    private final zzdfy zzi;
    private final zzfgh zzj;
    private final VersionInfoParcel zzk;
    private final zzfhc zzl;
    private final zzcpm zzm;
    private final zzdlt zzn;
    private final Clock zzo;
    private final zzdfu zzp;
    private final zzfng zzq;
    private final zzdrj zzr;
    private final zzfma zzs;
    private final zzefj zzt;
    private boolean zzv;
    private boolean zzu = false;
    private boolean zzw = false;
    private boolean zzx = false;
    private Point zzy = new Point();
    private Point zzz = new Point();
    private long zzA = 0;
    private long zzB = 0;

    public zzdjl(Context context, zzdla zzdlaVar, JSONObject jSONObject, zzdpt zzdptVar, zzdkp zzdkpVar, zzavn zzavnVar, zzcys zzcysVar, zzcxy zzcxyVar, zzdfy zzdfyVar, zzfgh zzfghVar, VersionInfoParcel versionInfoParcel, zzfhc zzfhcVar, zzcpm zzcpmVar, zzdlt zzdltVar, Clock clock, zzdfu zzdfuVar, zzfng zzfngVar, zzfma zzfmaVar, zzefj zzefjVar, zzdrj zzdrjVar) {
        this.zza = context;
        this.zzb = zzdlaVar;
        this.zzc = jSONObject;
        this.zzd = zzdptVar;
        this.zze = zzdkpVar;
        this.zzf = zzavnVar;
        this.zzg = zzcysVar;
        this.zzh = zzcxyVar;
        this.zzi = zzdfyVar;
        this.zzj = zzfghVar;
        this.zzk = versionInfoParcel;
        this.zzl = zzfhcVar;
        this.zzm = zzcpmVar;
        this.zzn = zzdltVar;
        this.zzo = clock;
        this.zzp = zzdfuVar;
        this.zzq = zzfngVar;
        this.zzs = zzfmaVar;
        this.zzt = zzefjVar;
        this.zzr = zzdrjVar;
    }

    @Nullable
    private final String zzD(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdw)).booleanValue()) {
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
        if (zzc == 1) {
            return "1099";
        }
        if (zzc == 2) {
            return "2099";
        }
        if (zzc != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean zzF(String str) {
        JSONObject optJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    private final boolean zzG() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean zzH(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4, @Nullable String str, @Nullable JSONObject jSONObject5, boolean z2) {
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdw)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z2);
            Context context = this.zza;
            JSONObject jSONObject7 = new JSONObject();
            com.google.android.gms.ads.internal.zzu.zzp();
            DisplayMetrics zzt = com.google.android.gms.ads.internal.util.zzt.zzt((WindowManager) context.getSystemService("window"));
            try {
                jSONObject7.put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, zzt.widthPixels));
                jSONObject7.put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, zzt.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzih)).booleanValue()) {
                this.zzd.zzl("/clickRecorded", new zzdji(this, null));
            } else {
                this.zzd.zzl("/logScionEvent", new zzdjg(this, null));
            }
            this.zzd.zzl("/nativeImpression", new zzdjk(this, null));
            zzcaq.zza(this.zzd.zzg("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.zzu) {
                return true;
            }
            zzfgh zzfghVar = this.zzj;
            this.zzu = com.google.android.gms.ads.internal.zzu.zzs().zzn(this.zza, this.zzk.afmaVersion, zzfghVar.zzC.toString(), this.zzl.zzf);
            return true;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to create impression JSON.", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final boolean zzA() {
        if (zza() == 0) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzlg)).booleanValue()) {
            return this.zzl.zzi.zzj;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final boolean zzB() {
        return zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final boolean zzC(Bundle bundle) {
        if (zzF("impression_reporting")) {
            return zzH(null, null, null, null, ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzlc)).booleanValue() ? zzD(null) : null, com.google.android.gms.ads.internal.client.zzbc.zzb().zzk(bundle, null), false);
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final int zza() {
        if (this.zzl.zzi == null) {
            return 0;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzlg)).booleanValue()) {
            return this.zzl.zzi.zzi;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    @Nullable
    public final JSONObject zze(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbv.zzd(context, map, map2, view, scaleType);
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbv.zzg(context, view);
        JSONObject zzf = com.google.android.gms.ads.internal.util.zzbv.zzf(view);
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbv.zze(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", zzd);
            jSONObject.put("ad_view_signal", zzg);
            jSONObject.put("scroll_view_signal", zzf);
            jSONObject.put("lock_screen_signal", zze);
            return jSONObject;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
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
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzg() {
        try {
            com.google.android.gms.ads.internal.client.zzdd zzddVar = this.zzC;
            if (zzddVar != null) {
                zzddVar.zze();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzh() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzi() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzj(@Nullable com.google.android.gms.ads.internal.client.zzdh zzdhVar) {
        try {
            if (this.zzw) {
                return;
            }
            if (zzdhVar == null) {
                zzdkp zzdkpVar = this.zze;
                if (zzdkpVar.zzk() != null) {
                    this.zzw = true;
                    this.zzq.zzc(zzdkpVar.zzk().zzf(), this.zzs);
                    zzg();
                    return;
                }
            }
            this.zzw = true;
            this.zzq.zzc(zzdhVar.zzf(), this.zzs);
            zzg();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzk(View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z2, @Nullable ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbv.zzd(context, map, map2, view2, scaleType);
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbv.zzg(context, view2);
        JSONObject zzf = com.google.android.gms.ads.internal.util.zzbv.zzf(view2);
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbv.zze(context, view2);
        String zzE = zzE(view, map);
        zzn(true == ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdD)).booleanValue() ? view2 : view, zzg, zzd, zzf, zze, zzE, com.google.android.gms.ads.internal.util.zzbv.zzc(zzE, context, this.zzz, this.zzy), null, z2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzl(String str) {
        zzn(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzm(@Nullable Bundle bundle) {
        if (bundle == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Click data is null. No click is reported.");
        } else if (!zzF("click_reporting")) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            zzn(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, com.google.android.gms.ads.internal.client.zzbc.zzb().zzk(bundle, null), false, false);
        }
    }

    @VisibleForTesting
    public final void zzn(@Nullable View view, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4, @Nullable String str, @Nullable JSONObject jSONObject5, @Nullable JSONObject jSONObject6, boolean z2, boolean z3) {
        String str2;
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.zzc);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.zzb.zzc(this.zze.zzA()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.zze.zzc());
            jSONObject8.put("view_aware_api_used", z2);
            zzbfr zzbfrVar = this.zzl.zzi;
            jSONObject8.put("custom_mute_requested", zzbfrVar != null && zzbfrVar.zzg);
            jSONObject8.put("custom_mute_enabled", (this.zze.zzH().isEmpty() || this.zze.zzk() == null) ? false : true);
            if (this.zzn.zza() != null && this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.zzo.currentTimeMillis());
            if (this.zzx && zzG()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z3) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.zzb.zzc(this.zze.zzA()) != null);
            try {
                JSONObject optJSONObject = this.zzc.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.zzf.zzc().zze(this.zza, optJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception obtaining click signals", e);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzez)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzil)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzim)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long currentTimeMillis = this.zzo.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", currentTimeMillis - this.zzA);
            jSONObject9.put("time_from_last_touch", currentTimeMillis - this.zzB);
            jSONObject7.put("touch_signal", jSONObject9);
            if (this.zzj.zzai) {
                JSONObject jSONObject10 = (JSONObject) this.zzc.get("tracking_urls_and_actions");
                String string = jSONObject10 != null ? jSONObject10.getString("gws_query_id") : null;
                if (string != null) {
                    this.zzt.zzq(string, this.zze);
                }
            }
            zzcaq.zza(this.zzd.zzg("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to create click JSON.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzo(@Nullable View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z2, @Nullable ImageView.ScaleType scaleType, int i2) {
        JSONObject jSONObject;
        boolean z3 = false;
        if (this.zzc.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzlg)).booleanValue()) {
                z3 = true;
            }
        }
        if (!z3) {
            if (!this.zzx) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzG()) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbv.zzd(this.zza, map, map2, view2, scaleType);
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbv.zzg(this.zza, view2);
        JSONObject zzf = com.google.android.gms.ads.internal.util.zzbv.zzf(view2);
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbv.zze(this.zza, view2);
        String zzE = zzE(view, map);
        JSONObject zzc = com.google.android.gms.ads.internal.util.zzbv.zzc(zzE, this.zza, this.zzz, this.zzy);
        if (z3) {
            try {
                JSONObject jSONObject2 = this.zzc;
                Point point = this.zzz;
                Point point2 = this.zzy;
                try {
                    jSONObject = new JSONObject();
                } catch (Exception e) {
                    e = e;
                    jSONObject = null;
                }
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
                    jSONObject.put("duration_ms", i2);
                } catch (Exception e2) {
                    e = e2;
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while grabbing custom click gesture signals.", e);
                    jSONObject2.put("custom_click_gesture_signal", jSONObject);
                    zzn(view2, zzg, zzd, zzf, zze, zzE, zzc, null, z2, true);
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e3) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while adding CustomClickGestureSignals to adJson.", e3);
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e3, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzn(view2, zzg, zzd, zzf, zze, zzE, zzc, null, z2, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzp() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzcaq.zza(this.zzd.zzg("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzq(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        Context context = this.zza;
        zzH(com.google.android.gms.ads.internal.util.zzbv.zzg(context, view), com.google.android.gms.ads.internal.util.zzbv.zzd(context, map, map2, view, scaleType), com.google.android.gms.ads.internal.util.zzbv.zzf(view), com.google.android.gms.ads.internal.util.zzbv.zze(context, view), zzD(view), null, com.google.android.gms.ads.internal.util.zzbv.zzh(context, this.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzr() {
        zzH(null, null, null, null, null, null, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzs(@Nullable View view, MotionEvent motionEvent, @Nullable View view2) {
        this.zzy = com.google.android.gms.ads.internal.util.zzbv.zza(motionEvent, view2);
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

    @Override // com.google.android.gms.internal.ads.zzdkx
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

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzu(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdlt zzdltVar = this.zzn;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdltVar);
        view.setClickable(true);
        zzdltVar.zzc = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzv() {
        this.zzx = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzw(com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        this.zzC = zzddVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzx(zzbhw zzbhwVar) {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzc(zzbhwVar);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
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
        boolean zzi = com.google.android.gms.ads.internal.util.zzbv.zzi(this.zzk.clientJarVersion);
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

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzz(@Nullable View view, @Nullable Map map) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzv = false;
    }
}
