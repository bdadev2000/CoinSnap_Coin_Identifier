package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzekf implements zzejz {
    private final zzdkd zza;
    private final zzgge zzb;
    private final zzdoj zzc;
    private final zzfin zzd;
    private final zzdqy zze;

    public zzekf(zzdkd zzdkdVar, zzgge zzggeVar, zzdoj zzdojVar, zzfin zzfinVar, zzdqy zzdqyVar) {
        this.zza = zzdkdVar;
        this.zzb = zzggeVar;
        this.zzc = zzdojVar;
        this.zzd = zzfinVar;
        this.zze = zzdqyVar;
    }

    private final f4.c zzg(final zzfhf zzfhfVar, final zzfgt zzfgtVar, final JSONObject jSONObject) {
        zzdoj zzdojVar = this.zzc;
        final f4.c zza = this.zzd.zza();
        final f4.c zza2 = zzdojVar.zza(zzfhfVar, zzfgtVar, jSONObject);
        return zzgft.zzc(zza, zza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeka
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzekf.this.zzc(zza2, zza, zzfhfVar, zzfgtVar, jSONObject);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final f4.c zza(final zzfhf zzfhfVar, final zzfgt zzfgtVar) {
        return zzgft.zzn(zzgft.zzn(this.zzd.zza(), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzekc
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzekf.this.zze(zzfgtVar, (zzdqs) obj);
            }
        }, this.zzb), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzekd
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzekf.this.zzf(zzfhfVar, zzfgtVar, (JSONArray) obj);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final boolean zzb(zzfhf zzfhfVar, zzfgt zzfgtVar) {
        zzfgy zzfgyVar = zzfgtVar.zzt;
        if (zzfgyVar != null && zzfgyVar.zzc != null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ zzdlo zzc(f4.c cVar, f4.c cVar2, zzfhf zzfhfVar, zzfgt zzfgtVar, JSONObject jSONObject) throws Exception {
        zzdlt zzdltVar = (zzdlt) cVar.get();
        zzdqs zzdqsVar = (zzdqs) cVar2.get();
        zzdlu zzd = this.zza.zzd(new zzcvf(zzfhfVar, zzfgtVar, null), new zzdmf(zzdltVar), new zzdks(jSONObject, zzdqsVar));
        zzd.zzh().zzb();
        zzd.zzi().zza(zzdqsVar);
        zzd.zzg().zza(zzdltVar.zzs());
        zzd.zzl().zza(this.zze, zzdltVar.zzq());
        return zzd.zza();
    }

    public final /* synthetic */ f4.c zzd(zzdqs zzdqsVar, JSONObject jSONObject) throws Exception {
        this.zzd.zzb(zzgft.zzh(zzdqsVar));
        if (jSONObject.optBoolean("success")) {
            return zzgft.zzh(jSONObject.getJSONObject("json").getJSONArray(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS));
        }
        throw new zzbpw("process json failed");
    }

    public final /* synthetic */ f4.c zze(zzfgt zzfgtVar, final zzdqs zzdqsVar) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziH)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfgtVar.zzt.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzgft.zzn(zzdqsVar.zzg("google.afma.nativeAds.preProcessJson", jSONObject2), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzekb
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzekf.this.zzd(zzdqsVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ f4.c zzf(zzfhf zzfhfVar, zzfgt zzfgtVar, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzgft.zzg(new zzdzd(3));
        }
        if (zzfhfVar.zza.zza.zzk > 1) {
            int length = jSONArray.length();
            this.zzd.zzc(Math.min(length, zzfhfVar.zza.zza.zzk));
            ArrayList arrayList = new ArrayList(zzfhfVar.zza.zza.zzk);
            for (int i9 = 0; i9 < zzfhfVar.zza.zza.zzk; i9++) {
                if (i9 < length) {
                    arrayList.add(zzg(zzfhfVar, zzfgtVar, jSONArray.getJSONObject(i9)));
                } else {
                    arrayList.add(zzgft.zzg(new zzdzd(3)));
                }
            }
            return zzgft.zzh(arrayList);
        }
        return zzgft.zzm(zzg(zzfhfVar, zzfgtVar, jSONArray.getJSONObject(0)), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzeke
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                return Collections.singletonList(zzgft.zzh((zzdlo) obj));
            }
        }, this.zzb);
    }
}
