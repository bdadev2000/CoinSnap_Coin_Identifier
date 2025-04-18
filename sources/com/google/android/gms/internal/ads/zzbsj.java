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

/* loaded from: classes3.dex */
public final class zzbsj extends zzbsk implements zzbjr {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcfk zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbbv zzk;
    private float zzl;
    private int zzm;

    public zzbsj(zzcfk zzcfkVar, Context context, zzbbv zzbbvVar) {
        super(zzcfkVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcfkVar;
        this.zzi = context;
        this.zzk = zzbbvVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObject;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzi = this.zzh.zzi();
        if (zzi != null && zzi.getWindow() != null) {
            com.google.android.gms.ads.internal.zzv.zzq();
            int[] zzQ = com.google.android.gms.ads.internal.util.zzs.zzQ(zzi);
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            this.zzd = com.google.android.gms.ads.internal.util.client.zzf.zzw(this.zza, zzQ[0]);
            com.google.android.gms.ads.internal.client.zzbc.zzb();
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
        zzbsi zzbsiVar = new zzbsi();
        zzbbv zzbbvVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbsiVar.zze(zzbbvVar.zza(intent));
        zzbbv zzbbvVar2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbsiVar.zzc(zzbbvVar2.zza(intent2));
        zzbsiVar.zza(this.zzk.zzb());
        zzbsiVar.zzd(this.zzk.zzc());
        zzbsiVar.zzb(true);
        boolean zzh = zzbsi.zzh(zzbsiVar);
        boolean zzj = zzbsi.zzj(zzbsiVar);
        boolean zzf = zzbsi.zzf(zzbsiVar);
        boolean zzi2 = zzbsi.zzi(zzbsiVar);
        boolean zzg = zzbsi.zzg(zzbsiVar);
        zzcfk zzcfkVar = this.zzh;
        try {
            jSONObject = new JSONObject().put("sms", zzh).put("tel", zzj).put("calendar", zzf).put("storePicture", zzi2).put("inlineVideo", zzg);
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while obtaining the MRAID capabilities.", e2);
            jSONObject = null;
        }
        zzcfkVar.zze("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        zzb(com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(this.zzi, iArr[0]), com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(this.zzi, iArr[1]));
        if (com.google.android.gms.ads.internal.util.client.zzm.zzm(2)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzi("Dispatching Ready Event.");
        }
        zzi(this.zzh.zzn().afmaVersion);
    }

    public final void zzb(int i10, int i11) {
        int i12;
        Context context = this.zzi;
        int i13 = 0;
        if (context instanceof Activity) {
            com.google.android.gms.ads.internal.zzv.zzq();
            i12 = com.google.android.gms.ads.internal.util.zzs.zzR((Activity) context)[0];
        } else {
            i12 = 0;
        }
        if (this.zzh.zzO() == null || !this.zzh.zzO().zzi()) {
            zzcfk zzcfkVar = this.zzh;
            int width = zzcfkVar.getWidth();
            int height = zzcfkVar.getHeight();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaa)).booleanValue()) {
                if (width == 0) {
                    if (this.zzh.zzO() != null) {
                        width = this.zzh.zzO().zzb;
                    } else {
                        width = 0;
                    }
                }
                if (height == 0) {
                    if (this.zzh.zzO() != null) {
                        i13 = this.zzh.zzO().zza;
                    }
                    this.zzf = com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(this.zzi, width);
                    this.zzg = com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(this.zzi, i13);
                }
            }
            i13 = height;
            this.zzf = com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(this.zzi, width);
            this.zzg = com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(this.zzi, i13);
        }
        zzg(i10, i11 - i12, this.zzf, this.zzg);
        this.zzh.zzN().zzC(i10, i11);
    }
}
