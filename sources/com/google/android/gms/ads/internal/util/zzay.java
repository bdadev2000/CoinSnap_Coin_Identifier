package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzdya;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.Command;
import f4.c;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzay {
    private zzdya zzg;
    private final Object zzb = new Object();
    private String zzc = "";
    private String zzd = "";
    private boolean zze = false;
    private boolean zzf = false;
    protected String zza = "";

    @Nullable
    public static final String zzo(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(Command.HTTP_HEADER_USER_AGENT, com.google.android.gms.ads.internal.zzu.zzp().zzc(context, str2));
        c zzb = new zzbq(context).zzb(0, str, hashMap, null);
        try {
            return (String) zzb.get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeL)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e4);
            zzb.cancel(true);
            return null;
        } catch (TimeoutException e9) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e9);
            zzb.cancel(true);
            return null;
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error retrieving a response from: ".concat(String.valueOf(str)), e10);
            return null;
        }
    }

    private final Uri zzp(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.zzb) {
            if (TextUtils.isEmpty(this.zzc)) {
                com.google.android.gms.ads.internal.zzu.zzp();
                try {
                    str5 = new String(IOUtils.readInputStreamFully(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (IOException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zze("Error reading from internal storage.");
                    str5 = "";
                }
                this.zzc = str5;
                if (TextUtils.isEmpty(str5)) {
                    com.google.android.gms.ads.internal.zzu.zzp();
                    this.zzc = UUID.randomUUID().toString();
                    com.google.android.gms.ads.internal.zzu.zzp();
                    String str6 = this.zzc;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e4) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Error writing to file in internal storage.", e4);
                    }
                }
            }
            str4 = this.zzc;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    public final zzdya zza() {
        return this.zzg;
    }

    public final String zzb() {
        String str;
        synchronized (this.zzb) {
            str = this.zzd;
        }
        return str;
    }

    public final void zzc(Context context) {
        zzdya zzdyaVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjj)).booleanValue() && (zzdyaVar = this.zzg) != null) {
            zzdyaVar.zzh(new zzav(this, context), zzdxz.DEBUG_MENU);
        }
    }

    public final void zzd(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzu.zzp();
        zzt.zzU(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeH), str, str2));
    }

    public final void zze(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = zzp(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeK), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzu.zzp();
        zzt.zzL(context, str, buildUpon.build().toString());
    }

    public final void zzf(boolean z8) {
        synchronized (this.zzb) {
            try {
                this.zzf = z8;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjj)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzi().zzC(z8);
                    zzdya zzdyaVar = this.zzg;
                    if (zzdyaVar != null) {
                        zzdyaVar.zzl(z8);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzg(zzdya zzdyaVar) {
        this.zzg = zzdyaVar;
    }

    public final void zzh(boolean z8) {
        synchronized (this.zzb) {
            this.zze = z8;
        }
    }

    public final void zzi(Context context, String str, boolean z8, boolean z9) {
        if (!(context instanceof Activity)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzi("Can not create dialog without Activity Context");
        } else {
            zzt.zza.post(new zzax(this, context, str, z8, z9));
        }
    }

    public final boolean zzj(Context context, String str, String str2) {
        String zzo = zzo(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeJ), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzo)) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(zzo.trim()).optString("debug_mode"));
            zzf(equals);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjj)).booleanValue()) {
                zzg zzi = com.google.android.gms.ads.internal.zzu.zzo().zzi();
                if (true != equals) {
                    str = "";
                }
                zzi.zzB(str);
            }
            return equals;
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Fail to get debug mode response json.", e4);
            return false;
        }
    }

    public final boolean zzk(Context context, String str, String str2) {
        boolean z8;
        String zzo = zzo(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeI), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzo)) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(zzo.trim());
            String optString = jSONObject.optString("gct");
            this.zza = jSONObject.optString(NotificationCompat.CATEGORY_STATUS);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjj)).booleanValue()) {
                if ("0".equals(this.zza) || MBridgeConstans.API_REUQEST_CATEGORY_APP.equals(this.zza)) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zzf(z8);
                zzg zzi = com.google.android.gms.ads.internal.zzu.zzo().zzi();
                if (!z8) {
                    str = "";
                }
                zzi.zzB(str);
            }
            synchronized (this.zzb) {
                this.zzd = optString;
            }
            return true;
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Fail to get in app preview response json.", e4);
            return false;
        }
    }

    public final boolean zzl() {
        boolean z8;
        synchronized (this.zzb) {
            z8 = this.zzf;
        }
        return z8;
    }

    public final boolean zzm() {
        boolean z8;
        synchronized (this.zzb) {
            z8 = this.zze;
        }
        return z8;
    }

    public final boolean zzn(Context context, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && zzm()) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Sending troubleshooting signals to the server.");
            zze(context, str, str2, str3);
            return true;
        }
        return false;
    }
}
