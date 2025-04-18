package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzecz extends zzbvm {
    private final Context zza;
    private final zzeza zzb;
    private final zzeyy zzc;
    private final zzedh zzd;
    private final zzgfz zze;
    private final zzbwi zzf;

    public zzecz(Context context, zzeza zzezaVar, zzeyy zzeyyVar, zzede zzedeVar, zzedh zzedhVar, zzgfz zzgfzVar, zzbwi zzbwiVar) {
        this.zza = context;
        this.zzb = zzezaVar;
        this.zzc = zzeyyVar;
        this.zzd = zzedhVar;
        this.zze = zzgfzVar;
        this.zzf = zzbwiVar;
    }

    private final void zzc(ListenableFuture listenableFuture, zzbvq zzbvqVar) {
        zzgfo.zzr((zzgff) zzgfo.zzn(zzgff.zzu(listenableFuture), new zzgev(this) { // from class: com.google.android.gms.internal.ads.zzecw
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzgfo.zzh(zzfid.zza((InputStream) obj));
            }
        }, zzcan.zza), new zzecy(this, zzbvqVar), zzcan.zzf);
    }

    public final ListenableFuture zzb(zzbvf zzbvfVar, int i2) {
        ListenableFuture zzh;
        HashMap hashMap = new HashMap();
        Bundle bundle = zzbvfVar.zzc;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    hashMap.put(str, string);
                }
            }
        }
        final zzedb zzedbVar = new zzedb(zzbvfVar.zza, zzbvfVar.zzb, hashMap, zzbvfVar.zzd, "", zzbvfVar.zze);
        zzeyz zzb = this.zzc.zza(new zzfac(zzbvfVar)).zzb();
        if (zzedbVar.zzf) {
            String str2 = zzbvfVar.zza;
            String str3 = (String) zzbey.zzb.zze();
            if (!TextUtils.isEmpty(str3)) {
                String host = Uri.parse(str2).getHost();
                if (!TextUtils.isEmpty(host)) {
                    Iterator it = zzfym.zzb(zzfxn.zzc(';')).zzc(str3).iterator();
                    while (it.hasNext()) {
                        if (host.endsWith((String) it.next())) {
                            zzh = zzgfo.zzm(zzb.zza().zza(new JSONObject(), new Bundle()), new zzfxq() { // from class: com.google.android.gms.internal.ads.zzecr
                                @Override // com.google.android.gms.internal.ads.zzfxq
                                public final Object apply(Object obj) {
                                    zzedb zzedbVar2 = zzedb.this;
                                    zzedh.zza(zzedbVar2.zzc, (JSONObject) obj);
                                    return zzedbVar2;
                                }
                            }, this.zze);
                            break;
                        }
                    }
                }
            }
        }
        zzh = zzgfo.zzh(zzedbVar);
        zzflg zzb2 = zzb.zzb();
        return zzgfo.zzn(zzb2.zzb(zzfla.HTTP, zzh).zze(new zzedd(this.zza, "", this.zzf, i2)).zza(), new zzgev() { // from class: com.google.android.gms.internal.ads.zzecs
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                zzedc zzedcVar = (zzedc) obj;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("response", zzedcVar.zza);
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str4 : zzedcVar.zzb.keySet()) {
                        if (str4 != null) {
                            List<String> list = (List) zzedcVar.zzb.get(str4);
                            JSONArray jSONArray = new JSONArray();
                            for (String str5 : list) {
                                if (str5 != null) {
                                    jSONArray.put(str5);
                                }
                            }
                            jSONObject2.put(str4, jSONArray);
                        }
                    }
                    jSONObject.put("headers", jSONObject2);
                    Object obj2 = zzedcVar.zzc;
                    if (obj2 != null) {
                        jSONObject.put("body", obj2);
                    }
                    jSONObject.put("latency", zzedcVar.zzd);
                    return zzgfo.zzh(new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Error converting response to JSONObject: ".concat(String.valueOf(e.getMessage())));
                    throw new JSONException("Parsing HTTP Response: ".concat(String.valueOf(e.getCause())));
                }
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zze(zzbvf zzbvfVar, zzbvq zzbvqVar) {
        zzc(zzb(zzbvfVar, Binder.getCallingUid()), zzbvqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzf(zzbvb zzbvbVar, zzbvq zzbvqVar) {
        final zzezb zzb = this.zzb.zza(new zzeyp(zzbvbVar, Binder.getCallingUid())).zzb();
        zzflg zzb2 = zzb.zzb();
        zzfkl zza = zzb2.zzb(zzfla.GMS_SIGNALS, zzgfo.zzi()).zzf(new zzgev() { // from class: com.google.android.gms.internal.ads.zzecv
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzezb.this.zza().zza(new JSONObject(), new Bundle());
            }
        }).zze(new zzfkj() { // from class: com.google.android.gms.internal.ads.zzecu
            @Override // com.google.android.gms.internal.ads.zzfkj
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("GMS AdRequest Signals: ");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zzf(new zzgev() { // from class: com.google.android.gms.internal.ads.zzect
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzgfo.zzh(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).zza();
        zzc(zza, zzbvqVar);
        if (((Boolean) zzber.zzf.zze()).booleanValue()) {
            final zzedh zzedhVar = this.zzd;
            Objects.requireNonNull(zzedhVar);
            zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecx
                @Override // java.lang.Runnable
                public final void run() {
                    zzedh.this.zzb();
                }
            }, this.zze);
        }
    }
}
