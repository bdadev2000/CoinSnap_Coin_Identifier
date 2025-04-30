package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.facebook.appevents.g;

/* loaded from: classes2.dex */
public final class zzduj implements zzdcg, zzdaz, zzczo, zzdhu {
    private final zzdux zza;
    private final zzdvh zzb;

    public zzduj(zzdux zzduxVar, zzdvh zzdvhVar) {
        this.zza = zzduxVar;
        this.zzb = zzdvhVar;
    }

    private final void zzc(@Nullable Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                long j7 = bundle.getLong(str);
                if (j7 >= 0) {
                    this.zza.zzc(str, String.valueOf(j7));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzd(Bundle bundle, zzgbc zzgbcVar) {
        int size = zzgbcVar.size();
        for (int i9 = 0; i9 < size; i9++) {
            zzdum zzdumVar = (zzdum) zzgbcVar.get(i9);
            long j7 = bundle.getLong(zzdumVar.zza().zza(), -1L);
            long j9 = bundle.getLong(zzdumVar.zzb().zza(), -1L);
            if (j7 > 0 && j9 > 0) {
                this.zza.zzc(zzdumVar.zzc(), String.valueOf(j9 - j7));
            }
        }
        zzc(bundle.getBundle("client_sig_latency_key"));
        zzc(bundle.getBundle("gms_sig_latency_key"));
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza.zzb().put("action", "ftl");
        this.zza.zzc("ftl", String.valueOf(zzeVar.zza));
        this.zza.zzc("ed", zzeVar.zzc);
        this.zzb.zzf(this.zza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzdn(zzbxu zzbxuVar) {
        this.zza.zze(zzbxuVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzdo(zzfhf zzfhfVar) {
        this.zza.zzd(zzfhfVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba  */
    @Override // com.google.android.gms.internal.ads.zzdhu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(@androidx.annotation.Nullable com.google.android.gms.ads.nonagon.signalgeneration.zzax r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbeg r0 = com.google.android.gms.internal.ads.zzbep.zzhj
            com.google.android.gms.internal.ads.zzben r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            return
        L13:
            java.lang.String r0 = "sgs"
            java.lang.String r1 = "action"
            if (r7 != 0) goto L3b
            com.google.android.gms.internal.ads.zzdux r7 = r6.zza
            java.util.Map r7 = r7.zzb()
            r7.put(r1, r0)
            com.google.android.gms.internal.ads.zzdux r7 = r6.zza
            java.util.Map r7 = r7.zzb()
            java.lang.String r0 = "request_id"
            java.lang.String r1 = "-1"
            r7.put(r0, r1)
            com.google.android.gms.internal.ads.zzdvh r7 = r6.zzb
            com.google.android.gms.internal.ads.zzdux r0 = r6.zza
            java.util.Map r0 = r0.zzb()
            r7.zzf(r0)
            return
        L3b:
            com.google.android.gms.internal.ads.zzbxu r2 = r7.zzc
            com.google.android.gms.internal.ads.zzbeg r3 = com.google.android.gms.internal.ads.zzbep.zzcd
            com.google.android.gms.internal.ads.zzben r4 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L6b
            if (r2 == 0) goto L6b
            android.os.Bundle r2 = r2.zzm
            if (r2 == 0) goto L6b
            com.google.android.gms.internal.ads.zzdul r3 = com.google.android.gms.internal.ads.zzdul.PUBLIC_API_CALLBACK
            java.lang.String r3 = r3.zza()
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzu.zzB()
            long r4 = r4.currentTimeMillis()
            r2.putLong(r3, r4)
            com.google.android.gms.internal.ads.zzgbc r3 = com.google.android.gms.internal.ads.zzdum.zza
            r6.zzd(r2, r3)
        L6b:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lcd
            java.lang.String r3 = r7.zzb     // Catch: org.json.JSONException -> Lcd
            r2.<init>(r3)     // Catch: org.json.JSONException -> Lcd
            com.google.android.gms.internal.ads.zzdux r3 = r6.zza
            java.util.Map r3 = r3.zzb()
            r3.put(r1, r0)
            com.google.android.gms.internal.ads.zzdux r0 = r6.zza
            java.util.Map r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzbeg r1 = com.google.android.gms.internal.ads.zzbep.zzjG
            com.google.android.gms.internal.ads.zzben r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r3.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L94
            goto Laf
        L94:
            java.lang.String r1 = "extras"
            org.json.JSONObject r1 = r2.getJSONObject(r1)     // Catch: org.json.JSONException -> La5
            java.lang.String r2 = "accept_3p_cookie"
            boolean r1 = r1.getBoolean(r2)     // Catch: org.json.JSONException -> La5
            if (r1 == 0) goto La7
            java.lang.String r1 = "1"
            goto Lb1
        La5:
            r1 = move-exception
            goto Laa
        La7:
            java.lang.String r1 = "0"
            goto Lb1
        Laa:
            java.lang.String r2 = "Error retrieving JSONObject from the requestJson, "
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r1)
        Laf:
            java.lang.String r1 = "na"
        Lb1:
            java.lang.String r2 = "tpc"
            r0.put(r2, r1)
            com.google.android.gms.internal.ads.zzbxu r7 = r7.zzc
            if (r7 == 0) goto Lc1
            com.google.android.gms.internal.ads.zzdux r0 = r6.zza
            android.os.Bundle r7 = r7.zza
            r0.zze(r7)
        Lc1:
            com.google.android.gms.internal.ads.zzdvh r7 = r6.zzb
            com.google.android.gms.internal.ads.zzdux r0 = r6.zza
            java.util.Map r0 = r0.zzb()
            r7.zzf(r0)
            return
        Lcd:
            com.google.android.gms.internal.ads.zzdux r7 = r6.zza
            java.util.Map r7 = r7.zzb()
            java.lang.String r0 = "sgf"
            r7.put(r1, r0)
            com.google.android.gms.internal.ads.zzdux r7 = r6.zza
            java.util.Map r7 = r7.zzb()
            java.lang.String r0 = "sgf_reason"
            java.lang.String r1 = "request_invalid"
            r7.put(r0, r1)
            com.google.android.gms.internal.ads.zzdvh r7 = r6.zzb
            com.google.android.gms.internal.ads.zzdux r0 = r6.zza
            java.util.Map r0 = r0.zzb()
            r7.zzf(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzduj.zze(com.google.android.gms.ads.nonagon.signalgeneration.zzax):void");
    }

    @Override // com.google.android.gms.internal.ads.zzdhu
    public final void zzf(@Nullable String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhj)).booleanValue()) {
            return;
        }
        this.zza.zzb().put("action", "sgf");
        this.zza.zzc("sgf_reason", str);
        this.zzb.zzf(this.zza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzdaz
    public final void zzs() {
        String str;
        this.zza.zzb().put("action", "loaded");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue()) {
            this.zza.zza().putLong(zzdul.PUBLIC_API_CALLBACK.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
            zzd(this.zza.zza(), zzdum.zzb);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzmB)).booleanValue()) {
            zzdux zzduxVar = this.zza;
            if (true != g.r("MUTE_AUDIO")) {
                str = "0";
            } else {
                str = "1";
            }
            zzduxVar.zzb().put("mafe", str);
        }
        this.zzb.zzf(this.zza.zzb());
    }
}
