package com.google.android.gms.internal.ads;

import com.applovin.impl.adview.t;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzeje implements zzeiy {
    private final zzdiy zza;
    private final zzgfz zzb;
    private final zzdni zzc;
    private final zzfib zzd;
    private final zzdpz zze;
    private final zzdty zzf;

    public zzeje(zzdiy zzdiyVar, zzgfz zzgfzVar, zzdni zzdniVar, zzfib zzfibVar, zzdpz zzdpzVar, zzdty zzdtyVar) {
        this.zza = zzdiyVar;
        this.zzb = zzgfzVar;
        this.zzc = zzdniVar;
        this.zzd = zzfibVar;
        this.zze = zzdpzVar;
        this.zzf = zzdtyVar;
    }

    private final ListenableFuture zzg(final zzfgt zzfgtVar, final zzfgh zzfghVar, final JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzch)).booleanValue()) {
            t.t(this.zzf.zza(), zzdtm.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        zzfib zzfibVar = this.zzd;
        zzdni zzdniVar = this.zzc;
        final ListenableFuture zza = zzfibVar.zza();
        final ListenableFuture zza2 = zzdniVar.zza(zzfgtVar, zzfghVar, jSONObject);
        return zzgfo.zzc(zza, zza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeiz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeje.this.zzc(zza2, zza, zzfgtVar, zzfghVar, jSONObject);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final ListenableFuture zza(final zzfgt zzfgtVar, final zzfgh zzfghVar) {
        return zzgfo.zzn(zzgfo.zzn(this.zzd.zza(), new zzgev() { // from class: com.google.android.gms.internal.ads.zzejb
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzeje.this.zze(zzfghVar, (zzdpt) obj);
            }
        }, this.zzb), new zzgev() { // from class: com.google.android.gms.internal.ads.zzejc
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzeje.this.zzf(zzfgtVar, zzfghVar, (JSONArray) obj);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(zzfgt zzfgtVar, zzfgh zzfghVar) {
        zzfgm zzfgmVar = zzfghVar.zzs;
        return (zzfgmVar == null || zzfgmVar.zzc == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzdkk zzc(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzfgt zzfgtVar, zzfgh zzfghVar, JSONObject jSONObject) throws Exception {
        zzdkp zzdkpVar = (zzdkp) listenableFuture.get();
        zzdpt zzdptVar = (zzdpt) listenableFuture2.get();
        zzbcm zzbcmVar = zzbcv.zzch;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).booleanValue()) {
            t.t(this.zzf.zza(), zzdtm.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzdkq zzd = this.zza.zzd(new zzctu(zzfgtVar, zzfghVar, null), new zzdlb(zzdkpVar), new zzdjn(jSONObject, zzdptVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).booleanValue()) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            this.zzf.zza().putLong(zzdtm.RENDERING_AD_COMPONENT_CREATION_END.zza(), currentTimeMillis);
            this.zzf.zza().putLong(zzdtm.RENDERING_CONFIGURE_WEBVIEW_START.zza(), currentTimeMillis);
        }
        zzd.zzh().zzb();
        zzd.zzi().zza(zzdptVar);
        zzd.zzg().zza(zzdkpVar.zzs());
        zzd.zzl().zza(this.zze, zzdkpVar.zzq());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).booleanValue()) {
            t.t(this.zzf.zza(), zzdtm.RENDERING_CONFIGURE_WEBVIEW_END.zza());
        }
        return zzd.zza();
    }

    public final /* synthetic */ ListenableFuture zzd(zzdpt zzdptVar, JSONObject jSONObject) throws Exception {
        this.zzd.zzb(zzgfo.zzh(zzdptVar));
        if (jSONObject.optBoolean("success")) {
            return zzgfo.zzh(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzboc("process json failed");
    }

    public final /* synthetic */ ListenableFuture zze(zzfgh zzfghVar, final zzdpt zzdptVar) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzik)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfghVar.zzs.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzgfo.zzn(zzdptVar.zzg("google.afma.nativeAds.preProcessJson", jSONObject2), new zzgev() { // from class: com.google.android.gms.internal.ads.zzeja
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzeje.this.zzd(zzdptVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ ListenableFuture zzf(zzfgt zzfgtVar, zzfgh zzfghVar, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzgfo.zzg(new zzdye(3));
        }
        if (zzfgtVar.zza.zza.zzk <= 1) {
            return zzgfo.zzm(zzg(zzfgtVar, zzfghVar, jSONArray.getJSONObject(0)), new zzfxq() { // from class: com.google.android.gms.internal.ads.zzejd
                @Override // com.google.android.gms.internal.ads.zzfxq
                public final Object apply(Object obj) {
                    return Collections.singletonList(zzgfo.zzh((zzdkk) obj));
                }
            }, this.zzb);
        }
        int length = jSONArray.length();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzci)).booleanValue()) {
            this.zzf.zzc("nsl", String.valueOf(length));
        }
        this.zzd.zzc(Math.min(length, zzfgtVar.zza.zza.zzk));
        ArrayList arrayList = new ArrayList(zzfgtVar.zza.zza.zzk);
        for (int i2 = 0; i2 < zzfgtVar.zza.zza.zzk; i2++) {
            if (i2 < length) {
                arrayList.add(zzg(zzfgtVar, zzfghVar, jSONArray.getJSONObject(i2)));
            } else {
                arrayList.add(zzgfo.zzg(new zzdye(3)));
            }
        }
        return zzgfo.zzh(arrayList);
    }
}
