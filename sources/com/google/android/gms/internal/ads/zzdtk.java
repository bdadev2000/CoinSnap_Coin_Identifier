package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.webkit.WebViewFeature;
import com.applovin.impl.adview.t;
import com.facebook.appevents.AppEventsConstants;
import org.chromium.support_lib_boundary.util.Features;

/* loaded from: classes3.dex */
public final class zzdtk implements zzday, zzczo, zzcyd, zzdgm {
    private final zzdty zza;
    private final zzdui zzb;

    public zzdtk(zzdty zzdtyVar, zzdui zzduiVar) {
        this.zza = zzdtyVar;
        this.zzb = zzduiVar;
    }

    private final void zzc(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j2 = bundle.getLong(str);
            if (j2 >= 0) {
                this.zza.zzc(str, String.valueOf(j2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzd(Bundle bundle, zzgax zzgaxVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcf)).booleanValue() || bundle == null) {
            return;
        }
        t.t(bundle, zzdtm.PUBLIC_API_CALLBACK.zza());
        this.zza.zzc("ls", true != bundle.getBoolean("ls") ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        int size = zzgaxVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzdtn zzdtnVar = (zzdtn) zzgaxVar.get(i2);
            long j2 = bundle.getLong(zzdtnVar.zza().zza(), -1L);
            long j3 = bundle.getLong(zzdtnVar.zzb().zza(), -1L);
            if (j2 > 0 && j3 > 0) {
                this.zza.zzc(zzdtnVar.zzc(), String.valueOf(j3 - j2));
            }
        }
        zzc(bundle.getBundle("client_sig_latency_key"));
        zzc(bundle.getBundle("gms_sig_latency_key"));
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza.zzb().put("action", "ftl");
        this.zza.zzc("ftl", String.valueOf(zzeVar.zza));
        this.zza.zzc("ed", zzeVar.zzc);
        this.zzb.zzf(this.zza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final void zzdn(zzbwa zzbwaVar) {
        this.zza.zze(zzbwaVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final void zzdo(zzfgt zzfgtVar) {
        this.zza.zzd(zzfgtVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    @Override // com.google.android.gms.internal.ads.zzdgm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(@androidx.annotation.Nullable com.google.android.gms.ads.nonagon.signalgeneration.zzbd r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzgK
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            return
        L13:
            java.lang.String r0 = "sgs"
            java.lang.String r1 = "action"
            if (r5 != 0) goto L3b
            com.google.android.gms.internal.ads.zzdty r5 = r4.zza
            java.util.Map r5 = r5.zzb()
            r5.put(r1, r0)
            com.google.android.gms.internal.ads.zzdty r5 = r4.zza
            java.util.Map r5 = r5.zzb()
            java.lang.String r0 = "request_id"
            java.lang.String r1 = "-1"
            r5.put(r0, r1)
            com.google.android.gms.internal.ads.zzdui r5 = r4.zzb
            com.google.android.gms.internal.ads.zzdty r0 = r4.zza
            java.util.Map r0 = r0.zzb()
            r5.zzf(r0)
            return
        L3b:
            com.google.android.gms.internal.ads.zzbwa r2 = r5.zzc
            if (r2 == 0) goto L46
            android.os.Bundle r2 = r2.zzm
            com.google.android.gms.internal.ads.zzgax r3 = com.google.android.gms.internal.ads.zzdtn.zza
            r4.zzd(r2, r3)
        L46:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> La8
            java.lang.String r3 = r5.zzb     // Catch: org.json.JSONException -> La8
            r2.<init>(r3)     // Catch: org.json.JSONException -> La8
            com.google.android.gms.internal.ads.zzdty r3 = r4.zza
            java.util.Map r3 = r3.zzb()
            r3.put(r1, r0)
            com.google.android.gms.internal.ads.zzdty r0 = r4.zza
            java.util.Map r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzjj
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r3.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L6f
            goto L8a
        L6f:
            java.lang.String r1 = "extras"
            org.json.JSONObject r1 = r2.getJSONObject(r1)     // Catch: org.json.JSONException -> L80
            java.lang.String r2 = "accept_3p_cookie"
            boolean r1 = r1.getBoolean(r2)     // Catch: org.json.JSONException -> L80
            if (r1 == 0) goto L82
            java.lang.String r1 = "1"
            goto L8c
        L80:
            r1 = move-exception
            goto L85
        L82:
            java.lang.String r1 = "0"
            goto L8c
        L85:
            java.lang.String r2 = "Error retrieving JSONObject from the requestJson, "
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r1)
        L8a:
            java.lang.String r1 = "na"
        L8c:
            java.lang.String r2 = "tpc"
            r0.put(r2, r1)
            com.google.android.gms.internal.ads.zzbwa r5 = r5.zzc
            if (r5 == 0) goto L9c
            com.google.android.gms.internal.ads.zzdty r0 = r4.zza
            android.os.Bundle r5 = r5.zza
            r0.zze(r5)
        L9c:
            com.google.android.gms.internal.ads.zzdui r5 = r4.zzb
            com.google.android.gms.internal.ads.zzdty r0 = r4.zza
            java.util.Map r0 = r0.zzb()
            r5.zzf(r0)
            return
        La8:
            com.google.android.gms.internal.ads.zzdty r5 = r4.zza
            java.util.Map r5 = r5.zzb()
            java.lang.String r0 = "sgf"
            r5.put(r1, r0)
            com.google.android.gms.internal.ads.zzdty r5 = r4.zza
            java.util.Map r5 = r5.zzb()
            java.lang.String r0 = "sgf_reason"
            java.lang.String r1 = "request_invalid"
            r5.put(r0, r1)
            com.google.android.gms.internal.ads.zzdui r5 = r4.zzb
            com.google.android.gms.internal.ads.zzdty r0 = r4.zza
            java.util.Map r0 = r0.zzb()
            r5.zzf(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdtk.zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbd):void");
    }

    @Override // com.google.android.gms.internal.ads.zzdgm
    public final void zzf(@Nullable String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgK)).booleanValue()) {
            this.zza.zzb().put("action", "sgf");
            this.zza.zzc("sgf_reason", str);
            this.zzb.zzf(this.zza.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzs() {
        this.zza.zzb().put("action", "loaded");
        zzd(this.zza.zza(), zzdtn.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzmi)).booleanValue()) {
            this.zza.zzb().put("mafe", true != WebViewFeature.a(Features.MUTE_AUDIO) ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        }
        this.zzb.zzf(this.zza.zzb());
    }
}
