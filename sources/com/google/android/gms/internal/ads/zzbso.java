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
public final class zzbso extends zzbsp implements zzbjw {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcfo zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbcd zzk;
    private float zzl;
    private int zzm;

    public zzbso(zzcfo zzcfoVar, Context context, zzbcd zzbcdVar) {
        super(zzcfoVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcfoVar;
        this.zzi = context;
        this.zzk = zzbcdVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* synthetic */ void zza(Object obj, Map map) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
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
        if (zzi == null || zzi.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            com.google.android.gms.ads.internal.zzu.zzp();
            int[] zzQ = com.google.android.gms.ads.internal.util.zzt.zzQ(zzi);
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            this.zzd = com.google.android.gms.ads.internal.util.client.zzf.zzw(this.zza, zzQ[0]);
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            this.zze = com.google.android.gms.ads.internal.util.client.zzf.zzw(this.zza, zzQ[1]);
        }
        if (this.zzh.zzO().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzj(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbsn zzbsnVar = new zzbsn();
        zzbcd zzbcdVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbsnVar.zze(zzbcdVar.zza(intent));
        zzbcd zzbcdVar2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbsnVar.zzc(zzbcdVar2.zza(intent2));
        zzbsnVar.zza(this.zzk.zzb());
        zzbsnVar.zzd(this.zzk.zzc());
        zzbsnVar.zzb(true);
        z2 = zzbsnVar.zza;
        z3 = zzbsnVar.zzb;
        z4 = zzbsnVar.zzc;
        z5 = zzbsnVar.zzd;
        z6 = zzbsnVar.zze;
        zzcfo zzcfoVar = this.zzh;
        try {
            jSONObject = new JSONObject().put("sms", z2).put("tel", z3).put("calendar", z4).put("storePicture", z5).put("inlineVideo", z6);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        zzcfoVar.zze("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        zzb(com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(this.zzi, iArr[0]), com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(this.zzi, iArr[1]));
        if (com.google.android.gms.ads.internal.util.client.zzm.zzm(2)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzi("Dispatching Ready Event.");
        }
        zzi(this.zzh.zzn().afmaVersion);
    }

    public final void zzb(int i2, int i3) {
        int i4;
        Context context = this.zzi;
        int i5 = 0;
        if (context instanceof Activity) {
            com.google.android.gms.ads.internal.zzu.zzp();
            i4 = com.google.android.gms.ads.internal.util.zzt.zzR((Activity) context)[0];
        } else {
            i4 = 0;
        }
        if (this.zzh.zzO() == null || !this.zzh.zzO().zzi()) {
            zzcfo zzcfoVar = this.zzh;
            int width = zzcfoVar.getWidth();
            int height = zzcfoVar.getHeight();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzX)).booleanValue()) {
                if (width == 0) {
                    width = this.zzh.zzO() != null ? this.zzh.zzO().zzb : 0;
                }
                if (height == 0) {
                    if (this.zzh.zzO() != null) {
                        i5 = this.zzh.zzO().zza;
                    }
                    this.zzf = com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(this.zzi, width);
                    this.zzg = com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(this.zzi, i5);
                }
            }
            i5 = height;
            this.zzf = com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(this.zzi, width);
            this.zzg = com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(this.zzi, i5);
        }
        zzg(i2, i3 - i4, this.zzf, this.zzg);
        this.zzh.zzN().zzC(i2, i3);
    }
}
