package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzdvj;
import com.google.android.gms.internal.ads.zzdvk;
import com.mbridge.msdk.foundation.download.Command;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import ua.b;

/* loaded from: classes3.dex */
public final class zzax {
    private zzdvk zzg;
    private final Object zzb = new Object();
    private String zzc = "";
    private String zzd = "";
    private boolean zze = false;
    private boolean zzf = false;
    protected String zza = "";

    @Nullable
    public static final String zzo(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(Command.HTTP_HEADER_USER_AGENT, com.google.android.gms.ads.internal.zzv.zzq().zzc(context, str2));
        b zzb = new zzbn(context).zzb(0, str, hashMap, null);
        try {
            return (String) zzb.get(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzeN)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e2);
            zzb.cancel(true);
            return null;
        } catch (TimeoutException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e10);
            zzb.cancel(true);
            return null;
        } catch (Exception e11) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error retrieving a response from: ".concat(String.valueOf(str)), e11);
            return null;
        }
    }

    private final Uri zzp(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.zzb) {
            if (TextUtils.isEmpty(this.zzc)) {
                com.google.android.gms.ads.internal.zzv.zzq();
                try {
                    str5 = new String(IOUtils.readInputStreamFully(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (IOException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zze("Error reading from internal storage.");
                    str5 = "";
                }
                this.zzc = str5;
                if (TextUtils.isEmpty(str5)) {
                    com.google.android.gms.ads.internal.zzv.zzq();
                    this.zzc = UUID.randomUUID().toString();
                    com.google.android.gms.ads.internal.zzv.zzq();
                    String str6 = this.zzc;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e2) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Error writing to file in internal storage.", e2);
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

    public final zzdvk zza() {
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
        zzdvk zzdvkVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziO)).booleanValue() && (zzdvkVar = this.zzg) != null) {
            zzdvkVar.zzh(new zzau(this, context), zzdvj.DEBUG_MENU);
        }
    }

    public final void zzd(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzv.zzq();
        zzs.zzU(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzeJ), str, str2));
    }

    public final void zze(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = zzp(context, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzeM), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzv.zzq();
        zzs.zzL(context, str, buildUpon.build().toString());
    }

    public final void zzf(boolean z10) {
        synchronized (this.zzb) {
            this.zzf = z10;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziO)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzi().zzx(z10);
                zzdvk zzdvkVar = this.zzg;
                if (zzdvkVar != null) {
                    zzdvkVar.zzl(z10);
                }
            }
        }
    }

    public final void zzg(zzdvk zzdvkVar) {
        this.zzg = zzdvkVar;
    }

    public final void zzh(boolean z10) {
        synchronized (this.zzb) {
            this.zze = z10;
        }
    }

    public final void zzi(Context context, String str, boolean z10, boolean z11) {
        if (!(context instanceof Activity)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzi("Can not create dialog without Activity Context");
        } else {
            zzs.zza.post(new zzaw(this, context, str, z10, z11));
        }
    }

    public final boolean zzj(Context context, String str, String str2) {
        String zzo = zzo(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzeL), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzo)) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(zzo.trim()).optString("debug_mode"));
            zzf(equals);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziO)).booleanValue()) {
                zzg zzi = com.google.android.gms.ads.internal.zzv.zzp().zzi();
                if (true != equals) {
                    str = "";
                }
                zzi.zzw(str);
            }
            return equals;
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Fail to get debug mode response json.", e2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzk(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbce r0 = com.google.android.gms.internal.ads.zzbcn.zzeK
            com.google.android.gms.internal.ads.zzbcl r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = r3.zzp(r4, r0, r5, r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = zzo(r4, r0, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            r0 = 0
            if (r6 == 0) goto L25
            java.lang.String r4 = "Not linked for in app preview."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r4)
            return r0
        L25:
            java.lang.String r4 = r4.trim()
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L83
            r6.<init>(r4)     // Catch: org.json.JSONException -> L83
            java.lang.String r4 = "gct"
            java.lang.String r4 = r6.optString(r4)     // Catch: org.json.JSONException -> L83
            java.lang.String r1 = "status"
            java.lang.String r6 = r6.optString(r1)     // Catch: org.json.JSONException -> L83
            r3.zza = r6     // Catch: org.json.JSONException -> L83
            com.google.android.gms.internal.ads.zzbce r6 = com.google.android.gms.internal.ads.zzbcn.zziO     // Catch: org.json.JSONException -> L83
            com.google.android.gms.internal.ads.zzbcl r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L83
            java.lang.Object r6 = r1.zza(r6)     // Catch: org.json.JSONException -> L83
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: org.json.JSONException -> L83
            boolean r6 = r6.booleanValue()     // Catch: org.json.JSONException -> L83
            r1 = 1
            if (r6 == 0) goto L79
            java.lang.String r6 = "0"
            java.lang.String r2 = r3.zza     // Catch: org.json.JSONException -> L83
            boolean r6 = r6.equals(r2)     // Catch: org.json.JSONException -> L83
            if (r6 != 0) goto L66
            java.lang.String r6 = "2"
            java.lang.String r2 = r3.zza     // Catch: org.json.JSONException -> L83
            boolean r6 = r6.equals(r2)     // Catch: org.json.JSONException -> L83
            if (r6 == 0) goto L64
            goto L66
        L64:
            r6 = r0
            goto L67
        L66:
            r6 = r1
        L67:
            r3.zzf(r6)     // Catch: org.json.JSONException -> L83
            com.google.android.gms.internal.ads.zzbzz r2 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch: org.json.JSONException -> L83
            com.google.android.gms.ads.internal.util.zzg r2 = r2.zzi()     // Catch: org.json.JSONException -> L83
            if (r6 != 0) goto L76
            java.lang.String r5 = ""
        L76:
            r2.zzw(r5)     // Catch: org.json.JSONException -> L83
        L79:
            java.lang.Object r5 = r3.zzb
            monitor-enter(r5)
            r3.zzd = r4     // Catch: java.lang.Throwable -> L80
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L80
            return r1
        L80:
            r4 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L80
            throw r4
        L83:
            r4 = move-exception
            java.lang.String r5 = "Fail to get in app preview response json."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzax.zzk(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public final boolean zzl() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = this.zzf;
        }
        return z10;
    }

    public final boolean zzm() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = this.zze;
        }
        return z10;
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
