package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbju;
import com.google.android.gms.internal.ads.zzbjv;
import com.google.android.gms.internal.ads.zzbmr;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzbvd;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzbwl;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzcbg;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzaw {
    private final zzk zza;
    private final zzi zzb;
    private final zzeq zzc;
    private final zzbju zzd;
    private final zzbzm zze;
    private final zzbvd zzf;
    private final zzbjv zzg;
    private zzbwl zzh;

    public zzaw(zzk zzkVar, zzi zziVar, zzeq zzeqVar, zzbju zzbjuVar, zzbzm zzbzmVar, zzbvd zzbvdVar, zzbjv zzbjvVar) {
        this.zza = zzkVar;
        this.zzb = zziVar;
        this.zzc = zzeqVar;
        this.zzd = zzbjuVar;
        this.zze = zzbzmVar;
        this.zzf = zzbvdVar;
        this.zzg = zzbjvVar;
    }

    public static /* bridge */ /* synthetic */ void zzt(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzay.zzb().zzo(context, zzay.zzc().afmaVersion, "gmob-apps", bundle, true);
    }

    public final zzbq zzc(Context context, String str, zzbrf zzbrfVar) {
        return (zzbq) new zzao(this, context, str, zzbrfVar).zzd(context, false);
    }

    public final zzbu zzd(Context context, zzq zzqVar, String str, zzbrf zzbrfVar) {
        return (zzbu) new zzak(this, context, zzqVar, str, zzbrfVar).zzd(context, false);
    }

    public final zzbu zze(Context context, zzq zzqVar, String str, zzbrf zzbrfVar) {
        return (zzbu) new zzam(this, context, zzqVar, str, zzbrfVar).zzd(context, false);
    }

    @Nullable
    public final zzdj zzf(Context context, zzbrf zzbrfVar) {
        return (zzdj) new zzac(this, context, zzbrfVar).zzd(context, false);
    }

    public final zzbhz zzh(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbhz) new zzas(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzbif zzi(View view, HashMap hashMap, HashMap hashMap2) {
        return (zzbif) new zzau(this, view, hashMap, hashMap2).zzd(view.getContext(), false);
    }

    @RequiresApi(api = 21)
    public final zzbmr zzl(Context context, zzbrf zzbrfVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbmr) new zzai(this, context, zzbrfVar, onH5AdsEventListener).zzd(context, false);
    }

    @Nullable
    public final zzbuz zzm(Context context, zzbrf zzbrfVar) {
        return (zzbuz) new zzag(this, context, zzbrfVar).zzd(context, false);
    }

    @Nullable
    public final zzbvg zzo(Activity activity) {
        zzaa zzaaVar = new zzaa(this, activity);
        Intent intent = activity.getIntent();
        boolean z8 = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("useClientJar flag not found in activity intent extras.");
        } else {
            z8 = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (zzbvg) zzaaVar.zzd(activity, z8);
    }

    public final zzbza zzq(Context context, String str, zzbrf zzbrfVar) {
        return (zzbza) new zzav(this, context, str, zzbrfVar).zzd(context, false);
    }

    @Nullable
    public final zzcbg zzr(Context context, zzbrf zzbrfVar) {
        return (zzcbg) new zzae(this, context, zzbrfVar).zzd(context, false);
    }
}
