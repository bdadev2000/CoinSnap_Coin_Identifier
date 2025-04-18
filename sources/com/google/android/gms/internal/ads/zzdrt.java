package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.ads.e;
import d6.g;

/* loaded from: classes3.dex */
public final class zzdrt implements zzczj, zzcya, zzcwp, zzdex {
    private final zzdsh zza;
    private final zzdsr zzb;

    public zzdrt(zzdsh zzdshVar, zzdsr zzdsrVar) {
        this.zza = zzdshVar;
        this.zzb = zzdsrVar;
    }

    private final void zzc(@Nullable Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                long j3 = bundle.getLong(str);
                if (j3 >= 0) {
                    this.zza.zzc(str, String.valueOf(j3));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzd(Bundle bundle, zzfzo zzfzoVar) {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzci)).booleanValue() && bundle != null) {
            e.m(bundle, zzdrv.PUBLIC_API_CALLBACK.zza());
            zzdsh zzdshVar = this.zza;
            if (true != bundle.getBoolean("ls")) {
                str = "0";
            } else {
                str = "1";
            }
            zzdshVar.zzc("ls", str);
            int size = zzfzoVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                zzdrw zzdrwVar = (zzdrw) zzfzoVar.get(i10);
                long j3 = bundle.getLong(zzdrwVar.zza().zza(), -1L);
                long j10 = bundle.getLong(zzdrwVar.zzb().zza(), -1L);
                if (j3 > 0 && j10 > 0) {
                    this.zza.zzc(zzdrwVar.zzc(), String.valueOf(j10 - j3));
                }
            }
            zzc(bundle.getBundle("client_sig_latency_key"));
            zzc(bundle.getBundle("gms_sig_latency_key"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza.zzb().put("action", "ftl");
        this.zza.zzc("ftl", String.valueOf(zzeVar.zza));
        this.zza.zzc("ed", zzeVar.zzc);
        this.zzb.zzf(this.zza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdn(zzbvx zzbvxVar) {
        this.zza.zze(zzbvxVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdo(zzfff zzfffVar) {
        this.zza.zzd(zzfffVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
    @Override // com.google.android.gms.internal.ads.zzdex
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(@androidx.annotation.Nullable com.google.android.gms.ads.nonagon.signalgeneration.zzbd r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzbce r0 = com.google.android.gms.internal.ads.zzbcn.zzgO
            com.google.android.gms.internal.ads.zzbcl r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            return
        L13:
            java.lang.String r0 = "sgs"
            java.lang.String r1 = "action"
            if (r5 != 0) goto L3b
            com.google.android.gms.internal.ads.zzdsh r5 = r4.zza
            java.util.Map r5 = r5.zzb()
            r5.put(r1, r0)
            com.google.android.gms.internal.ads.zzdsh r5 = r4.zza
            java.util.Map r5 = r5.zzb()
            java.lang.String r0 = "request_id"
            java.lang.String r1 = "-1"
            r5.put(r0, r1)
            com.google.android.gms.internal.ads.zzdsr r5 = r4.zzb
            com.google.android.gms.internal.ads.zzdsh r0 = r4.zza
            java.util.Map r0 = r0.zzb()
            r5.zzf(r0)
            return
        L3b:
            com.google.android.gms.internal.ads.zzbvx r2 = r5.zzc
            if (r2 == 0) goto L46
            android.os.Bundle r2 = r2.zzm
            com.google.android.gms.internal.ads.zzfzo r3 = com.google.android.gms.internal.ads.zzdrw.zza
            r4.zzd(r2, r3)
        L46:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> La7
            java.lang.String r3 = r5.zzb     // Catch: org.json.JSONException -> La7
            r2.<init>(r3)     // Catch: org.json.JSONException -> La7
            com.google.android.gms.internal.ads.zzdsh r3 = r4.zza
            java.util.Map r3 = r3.zzb()
            r3.put(r1, r0)
            com.google.android.gms.internal.ads.zzdsh r0 = r4.zza
            java.util.Map r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzbce r1 = com.google.android.gms.internal.ads.zzbcn.zzjl
            com.google.android.gms.internal.ads.zzbcl r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r3.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L6f
            goto L89
        L6f:
            java.lang.String r1 = "extras"
            org.json.JSONObject r1 = r2.getJSONObject(r1)     // Catch: org.json.JSONException -> L83
            java.lang.String r2 = "accept_3p_cookie"
            boolean r1 = r1.getBoolean(r2)     // Catch: org.json.JSONException -> L83
            if (r1 == 0) goto L80
            java.lang.String r1 = "1"
            goto L8b
        L80:
            java.lang.String r1 = "0"
            goto L8b
        L83:
            r1 = move-exception
            java.lang.String r2 = "Error retrieving JSONObject from the requestJson, "
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r1)
        L89:
            java.lang.String r1 = "na"
        L8b:
            java.lang.String r2 = "tpc"
            r0.put(r2, r1)
            com.google.android.gms.internal.ads.zzbvx r5 = r5.zzc
            if (r5 == 0) goto L9b
            com.google.android.gms.internal.ads.zzdsh r0 = r4.zza
            android.os.Bundle r5 = r5.zza
            r0.zze(r5)
        L9b:
            com.google.android.gms.internal.ads.zzdsr r5 = r4.zzb
            com.google.android.gms.internal.ads.zzdsh r0 = r4.zza
            java.util.Map r0 = r0.zzb()
            r5.zzf(r0)
            return
        La7:
            com.google.android.gms.internal.ads.zzdsh r5 = r4.zza
            java.util.Map r5 = r5.zzb()
            java.lang.String r0 = "sgf"
            r5.put(r1, r0)
            com.google.android.gms.internal.ads.zzdsh r5 = r4.zza
            java.util.Map r5 = r5.zzb()
            java.lang.String r0 = "sgf_reason"
            java.lang.String r1 = "request_invalid"
            r5.put(r0, r1)
            com.google.android.gms.internal.ads.zzdsr r5 = r4.zzb
            com.google.android.gms.internal.ads.zzdsh r0 = r4.zza
            java.util.Map r0 = r0.zzb()
            r5.zzf(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdrt.zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbd):void");
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void zzf(@Nullable String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgO)).booleanValue()) {
            return;
        }
        this.zza.zzb().put("action", "sgf");
        this.zza.zzc("sgf_reason", str);
        this.zzb.zzf(this.zza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzs() {
        String str;
        this.zza.zzb().put("action", "loaded");
        zzd(this.zza.zza(), zzdrw.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzmn)).booleanValue()) {
            zzdsh zzdshVar = this.zza;
            if (true != g.s("MUTE_AUDIO")) {
                str = "0";
            } else {
                str = "1";
            }
            zzdshVar.zzb().put("mafe", str);
        }
        this.zzb.zzf(this.zza.zzb());
    }
}
