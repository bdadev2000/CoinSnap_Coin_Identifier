package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbhx;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbkt;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbsz;
import com.google.android.gms.internal.ads.zzbtd;
import com.google.android.gms.internal.ads.zzbtg;
import com.google.android.gms.internal.ads.zzbul;
import com.google.android.gms.internal.ads.zzbxc;
import com.google.android.gms.internal.ads.zzbxo;
import com.google.android.gms.internal.ads.zzbzh;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzba {
    private final zzk zza;
    private final zzi zzb;
    private final zzfe zzc;
    private final zzbhx zzd;
    private final zzbtd zze;
    private final zzbhy zzf;
    private zzbul zzg;
    private final zzl zzh;

    public zzba(zzk zzkVar, zzi zziVar, zzfe zzfeVar, zzbhx zzbhxVar, zzbxo zzbxoVar, zzbtd zzbtdVar, zzbhy zzbhyVar, zzl zzlVar) {
        this.zza = zzkVar;
        this.zzb = zziVar;
        this.zzc = zzfeVar;
        this.zzd = zzbhxVar;
        this.zze = zzbtdVar;
        this.zzf = zzbhyVar;
        this.zzh = zzlVar;
    }

    public static /* bridge */ /* synthetic */ void zzv(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzbc.zzb().zzo(context, zzbc.zzc().afmaVersion, "gmob-apps", bundle, true);
    }

    public final zzbu zzd(Context context, String str, zzbpg zzbpgVar) {
        return (zzbu) new zzar(this, context, str, zzbpgVar).zzd(context, false);
    }

    public final zzby zze(Context context, zzs zzsVar, String str, zzbpg zzbpgVar) {
        return (zzby) new zzan(this, context, zzsVar, str, zzbpgVar).zzd(context, false);
    }

    public final zzby zzf(Context context, zzs zzsVar, String str, zzbpg zzbpgVar) {
        return (zzby) new zzap(this, context, zzsVar, str, zzbpgVar).zzd(context, false);
    }

    public final zzci zzg(Context context, zzbpg zzbpgVar) {
        return (zzci) new zzat(this, context, zzbpgVar).zzd(context, false);
    }

    @Nullable
    public final zzdu zzh(Context context, zzbpg zzbpgVar) {
        return (zzdu) new zzaf(this, context, zzbpgVar).zzd(context, false);
    }

    public final zzbgc zzj(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbgc) new zzax(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzbgi zzk(View view, HashMap hashMap, HashMap hashMap2) {
        return (zzbgi) new zzaz(this, view, hashMap, hashMap2).zzd(view.getContext(), false);
    }

    public final zzbkt zzn(Context context, zzbpg zzbpgVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbkt) new zzal(this, context, zzbpgVar, onH5AdsEventListener).zzd(context, false);
    }

    @Nullable
    public final zzbsz zzo(Context context, zzbpg zzbpgVar) {
        return (zzbsz) new zzaj(this, context, zzbpgVar).zzd(context, false);
    }

    @Nullable
    public final zzbtg zzq(Activity activity) {
        zzad zzadVar = new zzad(this, activity);
        Intent intent = activity.getIntent();
        boolean z10 = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("useClientJar flag not found in activity intent extras.");
        } else {
            z10 = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (zzbtg) zzadVar.zzd(activity, z10);
    }

    public final zzbxc zzs(Context context, String str, zzbpg zzbpgVar) {
        return (zzbxc) new zzab(this, context, str, zzbpgVar).zzd(context, false);
    }

    @Nullable
    public final zzbzh zzt(Context context, zzbpg zzbpgVar) {
        return (zzbzh) new zzah(this, context, zzbpgVar).zzd(context, false);
    }
}
