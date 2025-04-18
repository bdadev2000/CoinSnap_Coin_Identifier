package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdmg {
    private final Context zza;
    private final zzdlk zzb;
    private final zzavc zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbbl zzf;
    private final Executor zzg;
    private final zzbfn zzh;
    private final zzdmy zzi;
    private final zzdpn zzj;
    private final ScheduledExecutorService zzk;
    private final zzdoi zzl;
    private final zzdsm zzm;
    private final zzflr zzn;
    private final zzedp zzo;
    private final zzeea zzp;
    private final zzffs zzq;

    public zzdmg(Context context, zzdlk zzdlkVar, zzavc zzavcVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbbl zzbblVar, Executor executor, zzffo zzffoVar, zzdmy zzdmyVar, zzdpn zzdpnVar, ScheduledExecutorService scheduledExecutorService, zzdsm zzdsmVar, zzflr zzflrVar, zzedp zzedpVar, zzdoi zzdoiVar, zzeea zzeeaVar, zzffs zzffsVar) {
        this.zza = context;
        this.zzb = zzdlkVar;
        this.zzc = zzavcVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbblVar;
        this.zzg = executor;
        this.zzh = zzffoVar.zzi;
        this.zzi = zzdmyVar;
        this.zzj = zzdpnVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdsmVar;
        this.zzn = zzflrVar;
        this.zzo = zzedpVar;
        this.zzl = zzdoiVar;
        this.zzp = zzeeaVar;
        this.zzq = zzffsVar;
    }

    @Nullable
    public static final com.google.android.gms.ads.internal.client.zzez zzi(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
        if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("default_reason")) != null) {
            return zzr(optJSONObject);
        }
        return null;
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
        if (optJSONObject == null) {
            return zzfzo.zzn();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                com.google.android.gms.ads.internal.client.zzez zzr = zzr(optJSONArray.optJSONObject(i10));
                if (zzr != null) {
                    arrayList.add(zzr);
                }
            }
            return zzfzo.zzl(arrayList);
        }
        return zzfzo.zzn();
    }

    private final com.google.android.gms.ads.internal.client.zzs zzk(int i10, int i11) {
        if (i10 == 0) {
            if (i11 != 0) {
                i10 = 0;
            } else {
                return com.google.android.gms.ads.internal.client.zzs.zzc();
            }
        }
        return new com.google.android.gms.ads.internal.client.zzs(this.zza, new AdSize(i10, i11));
    }

    private static ua.b zzl(ua.b bVar, Object obj) {
        final Object obj2 = null;
        return zzgei.zzf(bVar, Exception.class, new zzgdp(obj2) { // from class: com.google.android.gms.internal.ads.zzdmc
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzgei.zzh(null);
            }
        }, zzcaj.zzf);
    }

    private static ua.b zzm(boolean z10, final ua.b bVar, Object obj) {
        if (z10) {
            return zzgei.zzn(bVar, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdmd
                @Override // com.google.android.gms.internal.ads.zzgdp
                public final ua.b zza(Object obj2) {
                    return obj2 != null ? ua.b.this : zzgei.zzg(new zzeiz(1, "Retrieve required value in native ad response failed."));
                }
            }, zzcaj.zzf);
        }
        return zzl(bVar, null);
    }

    private final ua.b zzn(@Nullable JSONObject jSONObject, boolean z10) {
        if (jSONObject == null) {
            return zzgei.zzh(null);
        }
        final String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return zzgei.zzh(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z10) {
            return zzgei.zzh(new zzbfl(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzgei.zzm(this.zzb.zzb(optString, optDouble, optBoolean), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzdlu
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                return new zzbfl(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(optString), optDouble, optInt, optInt2);
            }
        }, this.zzg), null);
    }

    private final ua.b zzo(@Nullable JSONArray jSONArray, boolean z10, boolean z11) {
        int i10;
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            if (z11) {
                i10 = jSONArray.length();
            } else {
                i10 = 1;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(zzn(jSONArray.optJSONObject(i11), z10));
            }
            return zzgei.zzm(zzgei.zzd(arrayList), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzdlz
                @Override // com.google.android.gms.internal.ads.zzfwh
                public final Object apply(Object obj) {
                    ArrayList arrayList2 = new ArrayList();
                    for (zzbfl zzbflVar : (List) obj) {
                        if (zzbflVar != null) {
                            arrayList2.add(zzbflVar);
                        }
                    }
                    return arrayList2;
                }
            }, this.zzg);
        }
        return zzgei.zzh(Collections.emptyList());
    }

    private final ua.b zzp(JSONObject jSONObject, zzfet zzfetVar, zzfew zzfewVar) {
        final ua.b zzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfetVar, zzfewVar, zzk(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzgei.zzn(zzb, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdlv
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                zzcfk zzcfkVar = (zzcfk) obj;
                if (zzcfkVar != null && zzcfkVar.zzq() != null) {
                    return ua.b.this;
                }
                throw new zzeiz(1, "Retrieve video view in html5 ad response failed.");
            }
        }, zzcaj.zzf);
    }

    @Nullable
    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt(CampaignEx.JSON_KEY_AD_R), jSONObject2.getInt("g"), jSONObject2.getInt(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    private static final com.google.android.gms.ads.internal.client.zzez zzr(@Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("reason");
            String optString2 = jSONObject.optString("ping_url");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                return new com.google.android.gms.ads.internal.client.zzez(optString, optString2);
            }
            return null;
        }
        return null;
    }

    public final /* synthetic */ zzbfi zza(JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString(MimeTypes.BASE_TYPE_TEXT);
        Integer zzq = zzq(jSONObject, "bg_color");
        Integer zzq2 = zzq(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        int optInt3 = jSONObject.optInt("presentation_ms", 4000);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new zzbfi(optString, list, zzq, zzq2, num, optInt3 + optInt2, this.zzh.zze, optBoolean);
    }

    public final /* synthetic */ ua.b zzb(com.google.android.gms.ads.internal.client.zzs zzsVar, zzfet zzfetVar, zzfew zzfewVar, String str, String str2, Object obj) throws Exception {
        zzcfk zza = this.zzj.zza(zzsVar, zzfetVar, zzfewVar);
        final zzcan zza2 = zzcan.zza(zza);
        zzdof zzb = this.zzl.zzb();
        zza.zzN().zzU(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zza, null, null), null, null, this.zzo, this.zzn, this.zzm, null, zzb, null, null, null, null);
        zza.zzag("/getNativeAdViewSignals", zzbjq.zzs);
        zza.zzag("/getNativeClickMeta", zzbjq.zzt);
        zza.zzN().zzE(true);
        zza.zzN().zzB(new zzcha() { // from class: com.google.android.gms.internal.ads.zzdly
            @Override // com.google.android.gms.internal.ads.zzcha
            public final void zza(boolean z10, int i10, String str3, String str4) {
                zzcan zzcanVar = zzcan.this;
                if (z10) {
                    zzcanVar.zzb();
                    return;
                }
                zzcanVar.zzd(new zzeiz(1, "Image Web View failed to load. Error code: " + i10 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zza.zzae(str, str2, null);
        return zza2;
    }

    public final /* synthetic */ ua.b zzc(String str, Object obj) throws Exception {
        com.google.android.gms.ads.internal.zzv.zzA();
        zzcfk zza = zzcfx.zza(this.zza, zzche.zza(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, this.zzp, this.zzq);
        final zzcan zza2 = zzcan.zza(zza);
        zza.zzN().zzB(new zzcha() { // from class: com.google.android.gms.internal.ads.zzdma
            @Override // com.google.android.gms.internal.ads.zzcha
            public final void zza(boolean z10, int i10, String str2, String str3) {
                zzcan.this.zzb();
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfh)).booleanValue()) {
            zza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zza.loadData(str, "text/html", "UTF-8");
        }
        return zza2;
    }

    public final ua.b zzd(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzgei.zzh(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzm(optJSONObject.optBoolean("require"), zzgei.zzm(zzo(optJSONArray, false, true), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzdmb
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                return zzdmg.this.zza(optJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final ua.b zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final ua.b zzf(JSONObject jSONObject, String str) {
        zzbfn zzbfnVar = this.zzh;
        return zzo(jSONObject.optJSONArray("images"), zzbfnVar.zzb, zzbfnVar.zzd);
    }

    public final ua.b zzg(JSONObject jSONObject, String str, final zzfet zzfetVar, final zzfew zzfewVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjH)).booleanValue()) {
            return zzgei.zzh(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(0);
            if (optJSONObject == null) {
                return zzgei.zzh(null);
            }
            final String optString = optJSONObject.optString("base_url");
            final String optString2 = optJSONObject.optString("html");
            final com.google.android.gms.ads.internal.client.zzs zzk = zzk(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
            if (TextUtils.isEmpty(optString2)) {
                return zzgei.zzh(null);
            }
            final ua.b zzn = zzgei.zzn(zzgei.zzh(null), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdlw
                @Override // com.google.android.gms.internal.ads.zzgdp
                public final ua.b zza(Object obj) {
                    return zzdmg.this.zzb(zzk, zzfetVar, zzfewVar, optString, optString2, obj);
                }
            }, zzcaj.zze);
            return zzgei.zzn(zzn, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdlx
                @Override // com.google.android.gms.internal.ads.zzgdp
                public final ua.b zza(Object obj) {
                    if (((zzcfk) obj) != null) {
                        return ua.b.this;
                    }
                    throw new zzeiz(1, "Retrieve Web View from image ad response failed.");
                }
            }, zzcaj.zzf);
        }
        return zzgei.zzh(null);
    }

    public final ua.b zzh(JSONObject jSONObject, zzfet zzfetVar, zzfew zzfewVar) {
        ua.b zza;
        JSONObject zzh = com.google.android.gms.ads.internal.util.zzbr.zzh(jSONObject, "html_containers", "instream");
        if (zzh == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject(MimeTypes.BASE_TYPE_VIDEO);
            if (optJSONObject == null) {
                return zzgei.zzh(null);
            }
            String optString = optJSONObject.optString("vast_xml");
            boolean z10 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjG)).booleanValue() && optJSONObject.has("html")) {
                z10 = true;
            }
            if (TextUtils.isEmpty(optString)) {
                if (!z10) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Required field 'vast_xml' or 'html' is missing");
                    return zzgei.zzh(null);
                }
            } else if (!z10) {
                zza = this.zzi.zza(optJSONObject);
                return zzl(zzgei.zzo(zza, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdR)).intValue(), TimeUnit.SECONDS, this.zzk), null);
            }
            zza = zzp(optJSONObject, zzfetVar, zzfewVar);
            return zzl(zzgei.zzo(zza, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdR)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        return zzp(zzh, zzfetVar, zzfewVar);
    }
}
