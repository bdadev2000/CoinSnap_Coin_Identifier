package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.ads.e;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzehv implements zzehp {
    private final zzdhj zza;
    private final zzges zzb;
    private final zzdlr zzc;
    private final zzfgn zzd;
    private final zzdoi zze;
    private final zzdsh zzf;

    public zzehv(zzdhj zzdhjVar, zzges zzgesVar, zzdlr zzdlrVar, zzfgn zzfgnVar, zzdoi zzdoiVar, zzdsh zzdshVar) {
        this.zza = zzdhjVar;
        this.zzb = zzgesVar;
        this.zzc = zzdlrVar;
        this.zzd = zzfgnVar;
        this.zze = zzdoiVar;
        this.zzf = zzdshVar;
    }

    private final ua.b zzg(final zzfff zzfffVar, final zzfet zzfetVar, final JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzck)).booleanValue()) {
            e.m(this.zzf.zza(), zzdrv.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        zzfgn zzfgnVar = this.zzd;
        zzdlr zzdlrVar = this.zzc;
        final ua.b zza = zzfgnVar.zza();
        final ua.b zza2 = zzdlrVar.zza(zzfffVar, zzfetVar, jSONObject);
        return zzgei.zzc(zza, zza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzehq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzehv.this.zzc(zza2, zza, zzfffVar, zzfetVar, jSONObject);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final ua.b zza(final zzfff zzfffVar, final zzfet zzfetVar) {
        return zzgei.zzn(zzgei.zzn(this.zzd.zza(), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzehs
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzehv.this.zze(zzfetVar, (zzdoc) obj);
            }
        }, this.zzb), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzeht
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzehv.this.zzf(zzfffVar, zzfetVar, (JSONArray) obj);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final boolean zzb(zzfff zzfffVar, zzfet zzfetVar) {
        zzfey zzfeyVar = zzfetVar.zzs;
        return (zzfeyVar == null || zzfeyVar.zzc == null) ? false : true;
    }

    public final /* synthetic */ zzdit zzc(ua.b bVar, ua.b bVar2, zzfff zzfffVar, zzfet zzfetVar, JSONObject jSONObject) throws Exception {
        zzdiy zzdiyVar = (zzdiy) bVar.get();
        zzdoc zzdocVar = (zzdoc) bVar2.get();
        zzbce zzbceVar = zzbcn.zzck;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue()) {
            e.m(this.zzf.zza(), zzdrv.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzdiz zzd = this.zza.zzd(new zzcsg(zzfffVar, zzfetVar, null), new zzdjk(zzdiyVar), new zzdhw(jSONObject, zzdocVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue()) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            this.zzf.zza().putLong(zzdrv.RENDERING_AD_COMPONENT_CREATION_END.zza(), currentTimeMillis);
            this.zzf.zza().putLong(zzdrv.RENDERING_CONFIGURE_WEBVIEW_START.zza(), currentTimeMillis);
        }
        zzd.zzh().zzb();
        zzd.zzi().zza(zzdocVar);
        zzd.zzg().zza(zzdiyVar.zzs());
        zzd.zzl().zza(this.zze, zzdiyVar.zzq());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue()) {
            e.m(this.zzf.zza(), zzdrv.RENDERING_CONFIGURE_WEBVIEW_END.zza());
        }
        return zzd.zza();
    }

    public final /* synthetic */ ua.b zzd(zzdoc zzdocVar, JSONObject jSONObject) throws Exception {
        this.zzd.zzb(zzgei.zzh(zzdocVar));
        if (jSONObject.optBoolean("success")) {
            return zzgei.zzh(jSONObject.getJSONObject("json").getJSONArray(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS));
        }
        throw new zzbnx("process json failed");
    }

    public final /* synthetic */ ua.b zze(zzfet zzfetVar, final zzdoc zzdocVar) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzim)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfetVar.zzs.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzgei.zzn(zzdocVar.zzg("google.afma.nativeAds.preProcessJson", jSONObject2), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzehr
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzehv.this.zzd(zzdocVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ ua.b zzf(zzfff zzfffVar, zzfet zzfetVar, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzgei.zzg(new zzdwn(3));
        }
        if (zzfffVar.zza.zza.zzk > 1) {
            int length = jSONArray.length();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcl)).booleanValue()) {
                this.zzf.zzc("nsl", String.valueOf(length));
            }
            this.zzd.zzc(Math.min(length, zzfffVar.zza.zza.zzk));
            ArrayList arrayList = new ArrayList(zzfffVar.zza.zza.zzk);
            for (int i10 = 0; i10 < zzfffVar.zza.zza.zzk; i10++) {
                if (i10 < length) {
                    arrayList.add(zzg(zzfffVar, zzfetVar, jSONArray.getJSONObject(i10)));
                } else {
                    arrayList.add(zzgei.zzg(new zzdwn(3)));
                }
            }
            return zzgei.zzh(arrayList);
        }
        return zzgei.zzm(zzg(zzfffVar, zzfetVar, jSONArray.getJSONObject(0)), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzehu
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                return Collections.singletonList(zzgei.zzh((zzdit) obj));
            }
        }, this.zzb);
    }
}
