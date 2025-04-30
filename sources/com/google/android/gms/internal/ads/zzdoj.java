package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdoj {
    private final zzgge zza;
    private final zzdow zzb;
    private final zzdpb zzc;

    public zzdoj(zzgge zzggeVar, zzdow zzdowVar, zzdpb zzdpbVar) {
        this.zza = zzggeVar;
        this.zzb = zzdowVar;
        this.zzc = zzdpbVar;
    }

    public final f4.c zza(final zzfhf zzfhfVar, final zzfgt zzfgtVar, final JSONObject jSONObject) {
        f4.c zzn;
        final f4.c zzb = this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdoh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                zzdlt zzdltVar = new zzdlt();
                JSONObject jSONObject2 = jSONObject;
                zzdltVar.zzaa(jSONObject2.optInt("template_id", -1));
                zzdltVar.zzK(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
                if (optJSONObject != null) {
                    str = optJSONObject.optString("omid_partner_name");
                } else {
                    str = null;
                }
                zzfhf zzfhfVar2 = zzfhfVar;
                zzdltVar.zzV(str);
                zzfho zzfhoVar = zzfhfVar2.zza.zza;
                if (zzfhoVar.zzg.contains(Integer.toString(zzdltVar.zzc()))) {
                    if (zzdltVar.zzc() == 3) {
                        if (zzdltVar.zzA() != null) {
                            if (!zzfhoVar.zzh.contains(zzdltVar.zzA())) {
                                throw new zzelj(1, "Unexpected custom template id in the response.");
                            }
                        } else {
                            throw new zzelj(1, "No custom template id for custom template ad response.");
                        }
                    }
                    zzfgt zzfgtVar2 = zzfgtVar;
                    zzdltVar.zzY(jSONObject2.optDouble(CampaignEx.JSON_KEY_STAR, -1.0d));
                    String optString = jSONObject2.optString("headline", null);
                    if (zzfgtVar2.zzN) {
                        com.google.android.gms.ads.internal.zzu.zzp();
                        optString = o.k(com.google.android.gms.ads.internal.util.zzt.zzy(), " : ", optString);
                    }
                    zzdltVar.zzZ("headline", optString);
                    zzdltVar.zzZ(TtmlNode.TAG_BODY, jSONObject2.optString(TtmlNode.TAG_BODY, null));
                    zzdltVar.zzZ("call_to_action", jSONObject2.optString("call_to_action", null));
                    zzdltVar.zzZ("store", jSONObject2.optString("store", null));
                    zzdltVar.zzZ(BidResponsed.KEY_PRICE, jSONObject2.optString(BidResponsed.KEY_PRICE, null));
                    zzdltVar.zzZ("advertiser", jSONObject2.optString("advertiser", null));
                    return zzdltVar;
                }
                throw new zzelj(1, o.h(zzdltVar.zzc(), "Invalid template ID: "));
            }
        });
        final f4.c zzf = this.zzb.zzf(jSONObject, "images");
        zzfgw zzfgwVar = zzfhfVar.zzb.zzb;
        zzdow zzdowVar = this.zzb;
        final f4.c zzg = zzdowVar.zzg(jSONObject, "images", zzfgtVar, zzfgwVar);
        final f4.c zze = zzdowVar.zze(jSONObject, "secondary_image");
        final f4.c zze2 = zzdowVar.zze(jSONObject, "app_icon");
        final f4.c zzd = zzdowVar.zzd(jSONObject, "attribution");
        final f4.c zzh = this.zzb.zzh(jSONObject, zzfgtVar, zzfhfVar.zzb.zzb);
        final f4.c zza = this.zzc.zza(jSONObject, "custom_assets");
        if (!jSONObject.optBoolean("enable_omid")) {
            zzn = zzgft.zzh(null);
        } else {
            JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zzn = zzgft.zzh(null);
            } else {
                final String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    zzn = zzgft.zzh(null);
                } else {
                    final zzdow zzdowVar2 = this.zzb;
                    zzn = zzgft.zzn(zzgft.zzh(null), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzdol
                        @Override // com.google.android.gms.internal.ads.zzgfa
                        public final f4.c zza(Object obj) {
                            return zzdow.this.zzc(optString, obj);
                        }
                    }, zzcci.zze);
                }
            }
        }
        final f4.c cVar = zzn;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzb);
        arrayList.add(zzf);
        arrayList.add(zzg);
        arrayList.add(zze);
        arrayList.add(zze2);
        arrayList.add(zzd);
        arrayList.add(zzh);
        arrayList.add(zza);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfi)).booleanValue()) {
            arrayList.add(cVar);
        }
        return zzgft.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdoi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdlt zzdltVar = (zzdlt) zzb.get();
                zzdltVar.zzP((List) zzf.get());
                zzdltVar.zzM((zzbhv) zze2.get());
                zzdltVar.zzQ((zzbhv) zze.get());
                zzdltVar.zzJ((zzbho) zzd.get());
                JSONObject jSONObject2 = jSONObject;
                zzdltVar.zzS(zzdow.zzj(jSONObject2));
                zzdltVar.zzL(zzdow.zzi(jSONObject2));
                zzchd zzchdVar = (zzchd) zzh.get();
                if (zzchdVar != null) {
                    zzdltVar.zzad(zzchdVar);
                    zzdltVar.zzac(zzchdVar.zzF());
                    zzdltVar.zzab(zzchdVar.zzq());
                }
                zzchd zzchdVar2 = (zzchd) zzg.get();
                if (zzchdVar2 != null) {
                    zzdltVar.zzO(zzchdVar2);
                    zzdltVar.zzae(zzchdVar2.zzF());
                }
                f4.c cVar2 = cVar;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfi)).booleanValue()) {
                    zzdltVar.zzU(cVar2);
                    zzdltVar.zzX(new zzccn());
                } else {
                    zzchd zzchdVar3 = (zzchd) cVar2.get();
                    if (zzchdVar3 != null) {
                        zzdltVar.zzT(zzchdVar3);
                    }
                }
                for (zzdpa zzdpaVar : (List) zza.get()) {
                    if (zzdpaVar.zza != 1) {
                        zzdltVar.zzN(zzdpaVar.zzb, zzdpaVar.zzd);
                    } else {
                        zzdltVar.zzZ(zzdpaVar.zzb, zzdpaVar.zzc);
                    }
                }
                return zzdltVar;
            }
        }, this.zza);
    }
}
