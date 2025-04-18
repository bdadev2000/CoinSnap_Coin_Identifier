package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import eb.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Function;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdlr {
    private final zzges zza;
    private final zzdmg zzb;
    private final zzdml zzc;

    public zzdlr(zzges zzgesVar, zzdmg zzdmgVar, zzdml zzdmlVar) {
        this.zza = zzgesVar;
        this.zzb = zzdmgVar;
        this.zzc = zzdmlVar;
    }

    public final ua.b zza(final zzfff zzfffVar, final zzfet zzfetVar, final JSONObject jSONObject) {
        final ua.b zzh;
        ua.b zzn;
        final ua.b zzb = this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdlm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                zzdiy zzdiyVar = new zzdiy();
                JSONObject jSONObject2 = jSONObject;
                zzdiyVar.zzaa(jSONObject2.optInt("template_id", -1));
                zzdiyVar.zzK(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
                if (optJSONObject != null) {
                    str = optJSONObject.optString("omid_partner_name");
                } else {
                    str = null;
                }
                zzfff zzfffVar2 = zzfffVar;
                zzdiyVar.zzV(str);
                zzffo zzffoVar = zzfffVar2.zza.zza;
                if (zzffoVar.zzg.contains(Integer.toString(zzdiyVar.zzc()))) {
                    if (zzdiyVar.zzc() == 3) {
                        if (zzdiyVar.zzA() != null) {
                            if (!zzffoVar.zzh.contains(zzdiyVar.zzA())) {
                                throw new zzeiz(1, "Unexpected custom template id in the response.");
                            }
                        } else {
                            throw new zzeiz(1, "No custom template id for custom template ad response.");
                        }
                    }
                    zzfet zzfetVar2 = zzfetVar;
                    zzdiyVar.zzY(jSONObject2.optDouble(CampaignEx.JSON_KEY_STAR, -1.0d));
                    String optString = jSONObject2.optString("headline", null);
                    if (zzfetVar2.zzM) {
                        com.google.android.gms.ads.internal.zzv.zzq();
                        optString = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(com.google.android.gms.ads.internal.util.zzs.zzy(), " : ", optString);
                    }
                    zzdiyVar.zzZ("headline", optString);
                    zzdiyVar.zzZ(TtmlNode.TAG_BODY, jSONObject2.optString(TtmlNode.TAG_BODY, null));
                    zzdiyVar.zzZ("call_to_action", jSONObject2.optString("call_to_action", null));
                    zzdiyVar.zzZ("store", jSONObject2.optString("store", null));
                    zzdiyVar.zzZ(BidResponsed.KEY_PRICE, jSONObject2.optString(BidResponsed.KEY_PRICE, null));
                    zzdiyVar.zzZ("advertiser", jSONObject2.optString("advertiser", null));
                    return zzdiyVar;
                }
                throw new zzeiz(1, j.i("Invalid template ID: ", zzdiyVar.zzc()));
            }
        });
        final ua.b zzf = this.zzb.zzf(jSONObject, "images");
        zzfew zzfewVar = zzfffVar.zzb.zzb;
        zzdmg zzdmgVar = this.zzb;
        final ua.b zzg = zzdmgVar.zzg(jSONObject, "images", zzfetVar, zzfewVar);
        final ua.b zze = zzdmgVar.zze(jSONObject, "secondary_image");
        final ua.b zze2 = zzdmgVar.zze(jSONObject, "app_icon");
        final ua.b zzd = zzdmgVar.zzd(jSONObject, "attribution");
        final ua.b zzh2 = this.zzb.zzh(jSONObject, zzfetVar, zzfffVar.zzb.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzmF)).booleanValue() && ((Integer) Optional.ofNullable(jSONObject.optJSONObject(MimeTypes.BASE_TYPE_VIDEO)).map(new Function() { // from class: com.google.android.gms.internal.ads.zzdln
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((JSONObject) obj).optJSONArray("flags");
            }
        }).map(new Function() { // from class: com.google.android.gms.internal.ads.zzdlo
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                JSONArray jSONArray = (JSONArray) obj;
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    if (optJSONObject.optString("key").equals("afma_video_player_type")) {
                        return optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                    }
                }
                return null;
            }
        }).map(new Function() { // from class: com.google.android.gms.internal.ads.zzdlp
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(Integer.parseInt((String) obj));
            }
        }).orElse(0)).intValue() == 3) {
            zzdmg zzdmgVar2 = this.zzb;
            zzcao zzcaoVar = new zzcao();
            zzgei.zzr(zzh2, new zzdmf(zzdmgVar2, zzcaoVar), zzcaj.zze);
            zzh = zzcaoVar;
        } else {
            zzh = zzgei.zzh(new Bundle());
        }
        final ua.b zza = this.zzc.zza(jSONObject, "custom_assets");
        final zzdmg zzdmgVar3 = this.zzb;
        if (!jSONObject.optBoolean("enable_omid")) {
            zzn = zzgei.zzh(null);
        } else {
            JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zzn = zzgei.zzh(null);
            } else {
                final String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    zzn = zzgei.zzh(null);
                } else {
                    zzn = zzgei.zzn(zzgei.zzh(null), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdlt
                        @Override // com.google.android.gms.internal.ads.zzgdp
                        public final ua.b zza(Object obj) {
                            return zzdmg.this.zzc(optString, obj);
                        }
                    }, zzcaj.zze);
                }
            }
        }
        final ua.b bVar = zzn;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzb);
        arrayList.add(zzf);
        arrayList.add(zzg);
        arrayList.add(zze);
        arrayList.add(zze2);
        arrayList.add(zzd);
        arrayList.add(zzh2);
        arrayList.add(zzh);
        arrayList.add(zza);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfk)).booleanValue()) {
            arrayList.add(bVar);
        }
        return zzgei.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdlq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdiy zzdiyVar = (zzdiy) zzb.get();
                zzdiyVar.zzP((List) zzf.get());
                zzdiyVar.zzM((zzbfy) zze2.get());
                zzdiyVar.zzQ((zzbfy) zze.get());
                zzdiyVar.zzJ((zzbfr) zzd.get());
                JSONObject jSONObject2 = jSONObject;
                zzdiyVar.zzS(zzdmg.zzj(jSONObject2));
                zzdiyVar.zzL(zzdmg.zzi(jSONObject2));
                zzcfk zzcfkVar = (zzcfk) zzh2.get();
                if (zzcfkVar != null) {
                    zzdiyVar.zzad(zzcfkVar);
                    zzdiyVar.zzac(zzcfkVar.zzF());
                    zzdiyVar.zzab(zzcfkVar.zzq());
                }
                ua.b bVar2 = zzh;
                ua.b bVar3 = zzg;
                zzdiyVar.zzd().putAll((Bundle) bVar2.get());
                zzcfk zzcfkVar2 = (zzcfk) bVar3.get();
                if (zzcfkVar2 != null) {
                    zzdiyVar.zzO(zzcfkVar2);
                    zzdiyVar.zzae(zzcfkVar2.zzF());
                }
                ua.b bVar4 = bVar;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfk)).booleanValue()) {
                    zzdiyVar.zzU(bVar4);
                    zzdiyVar.zzX(new zzcao());
                } else {
                    zzcfk zzcfkVar3 = (zzcfk) bVar4.get();
                    if (zzcfkVar3 != null) {
                        zzdiyVar.zzT(zzcfkVar3);
                    }
                }
                for (zzdmk zzdmkVar : (List) zza.get()) {
                    if (zzdmkVar.zza != 1) {
                        zzdiyVar.zzN(zzdmkVar.zzb, zzdmkVar.zzd);
                    } else {
                        zzdiyVar.zzZ(zzdmkVar.zzb, zzdmkVar.zzc);
                    }
                }
                return zzdiyVar;
            }
        }, this.zza);
    }
}
