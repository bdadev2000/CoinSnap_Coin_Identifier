package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.support.v4.media.d;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Function;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdni {
    private final zzgfz zza;
    private final zzdnx zzb;
    private final zzdoc zzc;

    public zzdni(zzgfz zzgfzVar, zzdnx zzdnxVar, zzdoc zzdocVar) {
        this.zza = zzgfzVar;
        this.zzb = zzdnxVar;
        this.zzc = zzdocVar;
    }

    public final ListenableFuture zza(final zzfgt zzfgtVar, final zzfgh zzfghVar, final JSONObject jSONObject) {
        final ListenableFuture zzh;
        ListenableFuture zzh2;
        final ListenableFuture zzb = this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdnd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdkp zzdkpVar = new zzdkp();
                JSONObject jSONObject2 = jSONObject;
                zzdkpVar.zzaa(jSONObject2.optInt("template_id", -1));
                zzdkpVar.zzK(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
                String optString = optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null;
                zzfgt zzfgtVar2 = zzfgtVar;
                zzdkpVar.zzV(optString);
                zzfhc zzfhcVar = zzfgtVar2.zza.zza;
                if (!zzfhcVar.zzg.contains(Integer.toString(zzdkpVar.zzc()))) {
                    throw new zzeki(1, d.i("Invalid template ID: ", zzdkpVar.zzc()));
                }
                if (zzdkpVar.zzc() == 3) {
                    if (zzdkpVar.zzA() == null) {
                        throw new zzeki(1, "No custom template id for custom template ad response.");
                    }
                    if (!zzfhcVar.zzh.contains(zzdkpVar.zzA())) {
                        throw new zzeki(1, "Unexpected custom template id in the response.");
                    }
                }
                zzfgh zzfghVar2 = zzfghVar;
                zzdkpVar.zzY(jSONObject2.optDouble("rating", -1.0d));
                String optString2 = jSONObject2.optString("headline", null);
                if (zzfghVar2.zzM) {
                    com.google.android.gms.ads.internal.zzu.zzp();
                    optString2 = androidx.compose.foundation.text.input.a.k(com.google.android.gms.ads.internal.util.zzt.zzy(), " : ", optString2);
                }
                zzdkpVar.zzZ("headline", optString2);
                zzdkpVar.zzZ("body", jSONObject2.optString("body", null));
                zzdkpVar.zzZ("call_to_action", jSONObject2.optString("call_to_action", null));
                zzdkpVar.zzZ("store", jSONObject2.optString("store", null));
                zzdkpVar.zzZ(FirebaseAnalytics.Param.PRICE, jSONObject2.optString(FirebaseAnalytics.Param.PRICE, null));
                zzdkpVar.zzZ("advertiser", jSONObject2.optString("advertiser", null));
                return zzdkpVar;
            }
        });
        final ListenableFuture zzf = this.zzb.zzf(jSONObject, "images");
        zzfgk zzfgkVar = zzfgtVar.zzb.zzb;
        zzdnx zzdnxVar = this.zzb;
        final ListenableFuture zzg = zzdnxVar.zzg(jSONObject, "images", zzfghVar, zzfgkVar);
        final ListenableFuture zze = zzdnxVar.zze(jSONObject, "secondary_image");
        final ListenableFuture zze2 = zzdnxVar.zze(jSONObject, "app_icon");
        final ListenableFuture zzd = zzdnxVar.zzd(jSONObject, "attribution");
        final ListenableFuture zzh3 = this.zzb.zzh(jSONObject, zzfghVar, zzfgtVar.zzb.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzmz)).booleanValue() && ((Integer) Optional.ofNullable(jSONObject.optJSONObject("video")).map(new Function() { // from class: com.google.android.gms.internal.ads.zzdne
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((JSONObject) obj).optJSONArray("flags");
            }
        }).map(new Function() { // from class: com.google.android.gms.internal.ads.zzdnf
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                JSONArray jSONArray = (JSONArray) obj;
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                    if (optJSONObject.optString(SDKConstants.PARAM_KEY).equals("afma_video_player_type")) {
                        return optJSONObject.optString("value");
                    }
                }
                return null;
            }
        }).map(new Function() { // from class: com.google.android.gms.internal.ads.zzdng
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(Integer.parseInt((String) obj));
            }
        }).orElse(0)).intValue() == 3) {
            zzdnx zzdnxVar2 = this.zzb;
            zzcas zzcasVar = new zzcas();
            zzgfo.zzr(zzh3, new zzdnw(zzdnxVar2, zzcasVar), zzcan.zze);
            zzh = zzcasVar;
        } else {
            zzh = zzgfo.zzh(new Bundle());
        }
        final ListenableFuture zza = this.zzc.zza(jSONObject, "custom_assets");
        final zzdnx zzdnxVar3 = this.zzb;
        if (jSONObject.optBoolean("enable_omid")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zzh2 = zzgfo.zzh(null);
            } else {
                final String optString = optJSONObject.optString("omid_html");
                zzh2 = TextUtils.isEmpty(optString) ? zzgfo.zzh(null) : zzgfo.zzn(zzgfo.zzh(null), new zzgev() { // from class: com.google.android.gms.internal.ads.zzdnk
                    @Override // com.google.android.gms.internal.ads.zzgev
                    public final ListenableFuture zza(Object obj) {
                        return zzdnx.this.zzc(optString, obj);
                    }
                }, zzcan.zze);
            }
        } else {
            zzh2 = zzgfo.zzh(null);
        }
        final ListenableFuture listenableFuture = zzh2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzb);
        arrayList.add(zzf);
        arrayList.add(zzg);
        arrayList.add(zze);
        arrayList.add(zze2);
        arrayList.add(zzd);
        arrayList.add(zzh3);
        arrayList.add(zzh);
        arrayList.add(zza);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfd)).booleanValue()) {
            arrayList.add(listenableFuture);
        }
        return zzgfo.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdnh
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdkp zzdkpVar = (zzdkp) zzb.get();
                zzdkpVar.zzP((List) zzf.get());
                zzdkpVar.zzM((zzbgc) zze2.get());
                zzdkpVar.zzQ((zzbgc) zze.get());
                zzdkpVar.zzJ((zzbfv) zzd.get());
                JSONObject jSONObject2 = jSONObject;
                zzdkpVar.zzS(zzdnx.zzj(jSONObject2));
                zzdkpVar.zzL(zzdnx.zzi(jSONObject2));
                zzcfo zzcfoVar = (zzcfo) zzh3.get();
                if (zzcfoVar != null) {
                    zzdkpVar.zzad(zzcfoVar);
                    zzdkpVar.zzac(zzcfoVar.zzF());
                    zzdkpVar.zzab(zzcfoVar.zzq());
                }
                ListenableFuture listenableFuture2 = zzh;
                ListenableFuture listenableFuture3 = zzg;
                zzdkpVar.zzd().putAll((Bundle) listenableFuture2.get());
                zzcfo zzcfoVar2 = (zzcfo) listenableFuture3.get();
                if (zzcfoVar2 != null) {
                    zzdkpVar.zzO(zzcfoVar2);
                    zzdkpVar.zzae(zzcfoVar2.zzF());
                }
                ListenableFuture listenableFuture4 = listenableFuture;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfd)).booleanValue()) {
                    zzdkpVar.zzU(listenableFuture4);
                    zzdkpVar.zzX(new zzcas());
                } else {
                    zzcfo zzcfoVar3 = (zzcfo) listenableFuture4.get();
                    if (zzcfoVar3 != null) {
                        zzdkpVar.zzT(zzcfoVar3);
                    }
                }
                for (zzdob zzdobVar : (List) zza.get()) {
                    if (zzdobVar.zza != 1) {
                        zzdkpVar.zzN(zzdobVar.zzb, zzdobVar.zzd);
                    } else {
                        zzdkpVar.zzZ(zzdobVar.zzb, zzdobVar.zzc);
                    }
                }
                return zzdkpVar;
            }
        }, this.zza);
    }
}
