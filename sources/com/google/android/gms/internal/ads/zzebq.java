package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
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
public final class zzebq extends zzbvi {
    private final Context zza;
    private final zzexs zzb;
    private final zzexq zzc;
    private final zzeby zzd;
    private final zzges zze;
    private final zzbwf zzf;

    public zzebq(Context context, zzexs zzexsVar, zzexq zzexqVar, zzebv zzebvVar, zzeby zzebyVar, zzges zzgesVar, zzbwf zzbwfVar) {
        this.zza = context;
        this.zzb = zzexsVar;
        this.zzc = zzexqVar;
        this.zzd = zzebyVar;
        this.zze = zzgesVar;
        this.zzf = zzbwfVar;
    }

    private final void zzc(ua.b bVar, zzbvm zzbvmVar) {
        zzgei.zzr((zzgdz) zzgei.zzn(zzgdz.zzu(bVar), new zzgdp(this) { // from class: com.google.android.gms.internal.ads.zzebn
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzgei.zzh(zzfgp.zza((InputStream) obj));
            }
        }, zzcaj.zza), new zzebp(this, zzbvmVar), zzcaj.zzf);
    }

    public final ua.b zzb(zzbvb zzbvbVar, int i10) {
        ua.b zzh;
        HashMap hashMap = new HashMap();
        Bundle bundle = zzbvbVar.zzc;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    hashMap.put(str, string);
                }
            }
        }
        final zzebs zzebsVar = new zzebs(zzbvbVar.zza, zzbvbVar.zzb, hashMap, zzbvbVar.zzd, "", zzbvbVar.zze);
        zzexr zzb = this.zzc.zza(new zzeyo(zzbvbVar)).zzb();
        if (zzebsVar.zzf) {
            String str2 = zzbvbVar.zza;
            String str3 = (String) zzbeu.zzb.zze();
            if (!TextUtils.isEmpty(str3)) {
                String host = Uri.parse(str2).getHost();
                if (!TextUtils.isEmpty(host)) {
                    Iterator it = zzfxd.zzb(zzfwf.zzc(';')).zzc(str3).iterator();
                    while (it.hasNext()) {
                        if (host.endsWith((String) it.next())) {
                            zzh = zzgei.zzm(zzb.zza().zza(new JSONObject(), new Bundle()), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzebi
                                @Override // com.google.android.gms.internal.ads.zzfwh
                                public final Object apply(Object obj) {
                                    zzebs zzebsVar2 = zzebs.this;
                                    zzeby.zza(zzebsVar2.zzc, (JSONObject) obj);
                                    return zzebsVar2;
                                }
                            }, this.zze);
                            break;
                        }
                    }
                }
            }
        }
        zzh = zzgei.zzh(zzebsVar);
        zzfjr zzb2 = zzb.zzb();
        return zzgei.zzn(zzb2.zzb(zzfjl.HTTP, zzh).zze(new zzebu(this.zza, "", this.zzf, i10)).zza(), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzebj
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                zzebt zzebtVar = (zzebt) obj;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("response", zzebtVar.zza);
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str4 : zzebtVar.zzb.keySet()) {
                        if (str4 != null) {
                            List<String> list = (List) zzebtVar.zzb.get(str4);
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
                    Object obj2 = zzebtVar.zzc;
                    if (obj2 != null) {
                        jSONObject.put(TtmlNode.TAG_BODY, obj2);
                    }
                    jSONObject.put("latency", zzebtVar.zzd);
                    return zzgei.zzh(new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
                } catch (JSONException e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Error converting response to JSONObject: ".concat(String.valueOf(e2.getMessage())));
                    throw new JSONException("Parsing HTTP Response: ".concat(String.valueOf(e2.getCause())));
                }
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zze(zzbvb zzbvbVar, zzbvm zzbvmVar) {
        zzc(zzb(zzbvbVar, Binder.getCallingUid()), zzbvmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzf(zzbuv zzbuvVar, zzbvm zzbvmVar) {
        final zzext zzb = this.zzb.zza(new zzexh(zzbuvVar, Binder.getCallingUid())).zzb();
        zzfjr zzb2 = zzb.zzb();
        zzfix zza = zzb2.zzb(zzfjl.GMS_SIGNALS, zzgei.zzi()).zzf(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzebm
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzext.this.zza().zza(new JSONObject(), new Bundle());
            }
        }).zze(new zzfiv() { // from class: com.google.android.gms.internal.ads.zzebl
            @Override // com.google.android.gms.internal.ads.zzfiv
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("GMS AdRequest Signals: ");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zzf(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzebk
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzgei.zzh(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).zza();
        zzc(zza, zzbvmVar);
        if (((Boolean) zzben.zzf.zze()).booleanValue()) {
            final zzeby zzebyVar = this.zzd;
            Objects.requireNonNull(zzebyVar);
            zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebo
                @Override // java.lang.Runnable
                public final void run() {
                    zzeby.this.zzb();
                }
            }, this.zze);
        }
    }
}
