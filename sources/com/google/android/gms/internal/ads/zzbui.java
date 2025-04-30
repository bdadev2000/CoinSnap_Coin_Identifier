package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbui extends zzbuj implements zzblp {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzchd zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbdx zzk;
    private float zzl;
    private int zzm;

    public zzbui(zzchd zzchdVar, Context context, zzbdx zzbdxVar) {
        super(zzchdVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzchdVar;
        this.zzi = context;
        this.zzk = zzbdxVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* synthetic */ void zza(Object obj, Map map) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        JSONObject jSONObject;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzi = this.zzh.zzi();
        if (zzi != null && zzi.getWindow() != null) {
            com.google.android.gms.ads.internal.zzu.zzp();
            int[] zzQ = com.google.android.gms.ads.internal.util.zzt.zzQ(zzi);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            this.zzd = com.google.android.gms.ads.internal.util.client.zzf.zzw(this.zza, zzQ[0]);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            this.zze = com.google.android.gms.ads.internal.util.client.zzf.zzw(this.zza, zzQ[1]);
        } else {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        }
        if (this.zzh.zzO().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzj(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbuh zzbuhVar = new zzbuh();
        zzbdx zzbdxVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbuhVar.zze(zzbdxVar.zza(intent));
        zzbdx zzbdxVar2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbuhVar.zzc(zzbdxVar2.zza(intent2));
        zzbuhVar.zza(this.zzk.zzb());
        zzbuhVar.zzd(this.zzk.zzc());
        zzbuhVar.zzb(true);
        z8 = zzbuhVar.zza;
        z9 = zzbuhVar.zzb;
        z10 = zzbuhVar.zzc;
        z11 = zzbuhVar.zzd;
        z12 = zzbuhVar.zze;
        zzchd zzchdVar = this.zzh;
        try {
            jSONObject = new JSONObject().put("sms", z8).put("tel", z9).put("calendar", z10).put("storePicture", z11).put("inlineVideo", z12);
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while obtaining the MRAID capabilities.", e4);
            jSONObject = null;
        }
        zzchdVar.zze("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        zzb(com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, iArr[0]), com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, iArr[1]));
        if (com.google.android.gms.ads.internal.util.client.zzm.zzm(2)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzi("Dispatching Ready Event.");
        }
        zzi(this.zzh.zzn().afmaVersion);
    }

    public final void zzb(int i9, int i10) {
        int i11;
        Context context = this.zzi;
        int i12 = 0;
        if (context instanceof Activity) {
            com.google.android.gms.ads.internal.zzu.zzp();
            i11 = com.google.android.gms.ads.internal.util.zzt.zzR((Activity) context)[0];
        } else {
            i11 = 0;
        }
        if (this.zzh.zzO() == null || !this.zzh.zzO().zzi()) {
            zzchd zzchdVar = this.zzh;
            int width = zzchdVar.getWidth();
            int height = zzchdVar.getHeight();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzQ)).booleanValue()) {
                if (width == 0) {
                    if (this.zzh.zzO() != null) {
                        width = this.zzh.zzO().zzb;
                    } else {
                        width = 0;
                    }
                }
                if (height == 0) {
                    if (this.zzh.zzO() != null) {
                        i12 = this.zzh.zzO().zza;
                    }
                    this.zzf = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, width);
                    this.zzg = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, i12);
                }
            }
            i12 = height;
            this.zzf = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, width);
            this.zzg = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, i12);
        }
        zzg(i9, i10 - i11, this.zzf, this.zzg);
        this.zzh.zzN().zzC(i9, i10);
    }
}
