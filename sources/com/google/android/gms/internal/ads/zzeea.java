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

/* loaded from: classes2.dex */
public final class zzeea extends zzbxg {
    private final Context zza;
    private final zzezl zzb;
    private final zzezj zzc;
    private final zzeei zzd;
    private final zzgge zze;
    private final zzeef zzf;
    private final zzbyd zzg;

    public zzeea(Context context, zzezl zzezlVar, zzezj zzezjVar, zzeef zzeefVar, zzeei zzeeiVar, zzgge zzggeVar, zzbyd zzbydVar) {
        this.zza = context;
        this.zzb = zzezlVar;
        this.zzc = zzezjVar;
        this.zzf = zzeefVar;
        this.zzd = zzeeiVar;
        this.zze = zzggeVar;
        this.zzg = zzbydVar;
    }

    private final void zzc(f4.c cVar, zzbxk zzbxkVar) {
        zzgft.zzr(zzgft.zzn(zzgfk.zzu(cVar), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzedx
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzgft.zzh(zzfip.zza((InputStream) obj));
            }
        }, zzcci.zza), new zzedz(this, zzbxkVar), zzcci.zzf);
    }

    public final f4.c zzb(zzbwz zzbwzVar, int i9) {
        f4.c zzh;
        HashMap hashMap = new HashMap();
        Bundle bundle = zzbwzVar.zzc;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    hashMap.put(str, string);
                }
            }
        }
        final zzeec zzeecVar = new zzeec(zzbwzVar.zza, zzbwzVar.zzb, hashMap, zzbwzVar.zzd, "", zzbwzVar.zze);
        zzezj zzezjVar = this.zzc;
        zzezjVar.zza(new zzfar(zzbwzVar));
        boolean z8 = zzeecVar.zzf;
        zzezk zzb = zzezjVar.zzb();
        if (z8) {
            String str2 = zzbwzVar.zza;
            String str3 = (String) zzbgr.zzb.zze();
            if (!TextUtils.isEmpty(str3)) {
                String host = Uri.parse(str2).getHost();
                if (!TextUtils.isEmpty(host)) {
                    Iterator it = zzfyt.zzc(zzfxr.zzc(';')).zzd(str3).iterator();
                    while (it.hasNext()) {
                        if (host.endsWith((String) it.next())) {
                            zzh = zzgft.zzm(zzb.zza().zza(new JSONObject(), new Bundle()), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzeds
                                @Override // com.google.android.gms.internal.ads.zzfxu
                                public final Object apply(Object obj) {
                                    zzeec zzeecVar2 = zzeec.this;
                                    zzeei.zza(zzeecVar2.zzc, (JSONObject) obj);
                                    return zzeecVar2;
                                }
                            }, this.zze);
                            break;
                        }
                    }
                }
            }
        }
        zzh = zzgft.zzh(zzeecVar);
        zzflt zzb2 = zzb.zzb();
        return zzgft.zzn(zzb2.zzb(zzfln.HTTP, zzh).zze(new zzeee(this.zza, "", this.zzg, i9)).zza(), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzedt
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                zzeed zzeedVar = (zzeed) obj;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("response", zzeedVar.zza);
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str4 : zzeedVar.zzb.keySet()) {
                        if (str4 != null) {
                            List<String> list = (List) zzeedVar.zzb.get(str4);
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
                    Object obj2 = zzeedVar.zzc;
                    if (obj2 != null) {
                        jSONObject.put(TtmlNode.TAG_BODY, obj2);
                    }
                    jSONObject.put("latency", zzeedVar.zzd);
                    return zzgft.zzh(new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
                } catch (JSONException e4) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Error converting response to JSONObject: ".concat(String.valueOf(e4.getMessage())));
                    throw new JSONException("Parsing HTTP Response: ".concat(String.valueOf(e4.getCause())));
                }
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbxh
    public final void zze(zzbwz zzbwzVar, zzbxk zzbxkVar) {
        zzc(zzb(zzbwzVar, Binder.getCallingUid()), zzbxkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxh
    public final void zzf(zzbwv zzbwvVar, zzbxk zzbxkVar) {
        zzeza zzezaVar = new zzeza(zzbwvVar, Binder.getCallingUid());
        zzezl zzezlVar = this.zzb;
        zzezlVar.zza(zzezaVar);
        final zzezm zzb = zzezlVar.zzb();
        zzflt zzb2 = zzb.zzb();
        zzfky zza = zzb2.zzb(zzfln.GMS_SIGNALS, zzgft.zzi()).zzf(new zzgfa() { // from class: com.google.android.gms.internal.ads.zzedw
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzezm.this.zza().zza(new JSONObject(), new Bundle());
            }
        }).zze(new zzfkw() { // from class: com.google.android.gms.internal.ads.zzedv
            @Override // com.google.android.gms.internal.ads.zzfkw
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("GMS AdRequest Signals: ");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zzf(new zzgfa() { // from class: com.google.android.gms.internal.ads.zzedu
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzgft.zzh(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).zza();
        zzc(zza, zzbxkVar);
        if (((Boolean) zzbgk.zzf.zze()).booleanValue()) {
            final zzeei zzeeiVar = this.zzd;
            Objects.requireNonNull(zzeeiVar);
            zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedy
                @Override // java.lang.Runnable
                public final void run() {
                    zzeei.this.zzb();
                }
            }, this.zze);
        }
    }
}
