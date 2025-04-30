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

/* loaded from: classes2.dex */
public final class zzdow {
    private final Context zza;
    private final zzdof zzb;
    private final zzaxd zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbdm zzf;
    private final Executor zzg;
    private final zzbhk zzh;
    private final zzdpo zzi;
    private final zzdsd zzj;
    private final ScheduledExecutorService zzk;
    private final zzdqy zzl;
    private final zzdvc zzm;
    private final zzfoe zzn;
    private final zzefz zzo;
    private final zzegk zzp;
    private final zzfhs zzq;

    public zzdow(Context context, zzdof zzdofVar, zzaxd zzaxdVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbdm zzbdmVar, Executor executor, zzfho zzfhoVar, zzdpo zzdpoVar, zzdsd zzdsdVar, ScheduledExecutorService scheduledExecutorService, zzdvc zzdvcVar, zzfoe zzfoeVar, zzefz zzefzVar, zzdqy zzdqyVar, zzegk zzegkVar, zzfhs zzfhsVar) {
        this.zza = context;
        this.zzb = zzdofVar;
        this.zzc = zzaxdVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbdmVar;
        this.zzg = executor;
        this.zzh = zzfhoVar.zzi;
        this.zzi = zzdpoVar;
        this.zzj = zzdsdVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdvcVar;
        this.zzn = zzfoeVar;
        this.zzo = zzefzVar;
        this.zzl = zzdqyVar;
        this.zzp = zzegkVar;
        this.zzq = zzfhsVar;
    }

    @Nullable
    public static final com.google.android.gms.ads.internal.client.zzel zzi(JSONObject jSONObject) {
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
            return zzgbc.zzm();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                com.google.android.gms.ads.internal.client.zzel zzr = zzr(optJSONArray.optJSONObject(i9));
                if (zzr != null) {
                    arrayList.add(zzr);
                }
            }
            return zzgbc.zzk(arrayList);
        }
        return zzgbc.zzm();
    }

    private final com.google.android.gms.ads.internal.client.zzq zzk(int i9, int i10) {
        if (i9 == 0) {
            if (i10 != 0) {
                i9 = 0;
            } else {
                return com.google.android.gms.ads.internal.client.zzq.zzc();
            }
        }
        return new com.google.android.gms.ads.internal.client.zzq(this.zza, new AdSize(i9, i10));
    }

    private static f4.c zzl(f4.c cVar, Object obj) {
        final Object obj2 = null;
        return zzgft.zzf(cVar, Exception.class, new zzgfa(obj2) { // from class: com.google.android.gms.internal.ads.zzdou
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzgft.zzh(null);
            }
        }, zzcci.zzf);
    }

    private static f4.c zzm(boolean z8, final f4.c cVar, Object obj) {
        if (z8) {
            return zzgft.zzn(cVar, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzdov
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final f4.c zza(Object obj2) {
                    if (obj2 != null) {
                        return f4.c.this;
                    }
                    return zzgft.zzg(new zzelj(1, "Retrieve required value in native ad response failed."));
                }
            }, zzcci.zzf);
        }
        return zzl(cVar, null);
    }

    private final f4.c zzn(@Nullable JSONObject jSONObject, boolean z8) {
        if (jSONObject == null) {
            return zzgft.zzh(null);
        }
        final String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return zzgft.zzh(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z8) {
            return zzgft.zzh(new zzbhi(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzgft.zzm(this.zzb.zzb(optString, optDouble, optBoolean), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzdom
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                return new zzbhi(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(optString), optDouble, optInt, optInt2);
            }
        }, this.zzg), null);
    }

    private final f4.c zzo(@Nullable JSONArray jSONArray, boolean z8, boolean z9) {
        int i9;
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            if (z9) {
                i9 = jSONArray.length();
            } else {
                i9 = 1;
            }
            for (int i10 = 0; i10 < i9; i10++) {
                arrayList.add(zzn(jSONArray.optJSONObject(i10), z8));
            }
            return zzgft.zzm(zzgft.zzd(arrayList), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzdor
                @Override // com.google.android.gms.internal.ads.zzfxu
                public final Object apply(Object obj) {
                    ArrayList arrayList2 = new ArrayList();
                    for (zzbhi zzbhiVar : (List) obj) {
                        if (zzbhiVar != null) {
                            arrayList2.add(zzbhiVar);
                        }
                    }
                    return arrayList2;
                }
            }, this.zzg);
        }
        return zzgft.zzh(Collections.emptyList());
    }

    private final f4.c zzp(JSONObject jSONObject, zzfgt zzfgtVar, zzfgw zzfgwVar) {
        final f4.c zzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfgtVar, zzfgwVar, zzk(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzgft.zzn(zzb, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzdon
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                zzchd zzchdVar = (zzchd) obj;
                if (zzchdVar != null && zzchdVar.zzq() != null) {
                    return f4.c.this;
                }
                throw new zzelj(1, "Retrieve video view in html5 ad response failed.");
            }
        }, zzcci.zzf);
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
    private static final com.google.android.gms.ads.internal.client.zzel zzr(@Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("reason");
            String optString2 = jSONObject.optString("ping_url");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                return new com.google.android.gms.ads.internal.client.zzel(optString, optString2);
            }
            return null;
        }
        return null;
    }

    public final /* synthetic */ zzbhf zza(JSONObject jSONObject, List list) {
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
        return new zzbhf(optString, list, zzq, zzq2, num, optInt3 + optInt2, this.zzh.zze, optBoolean);
    }

    public final /* synthetic */ f4.c zzb(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfgt zzfgtVar, zzfgw zzfgwVar, String str, String str2, Object obj) throws Exception {
        zzchd zza = this.zzj.zza(zzqVar, zzfgtVar, zzfgwVar);
        final zzccm zza2 = zzccm.zza(zza);
        zzdqv zzb = this.zzl.zzb();
        zza.zzN().zzR(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zza, null, null), null, null, this.zzo, this.zzn, this.zzm, null, zzb, null, null, null, null);
        zza.zzag("/getNativeAdViewSignals", zzblo.zzs);
        zza.zzag("/getNativeClickMeta", zzblo.zzt);
        zza.zzN().zzB(new zzcit() { // from class: com.google.android.gms.internal.ads.zzdoq
            @Override // com.google.android.gms.internal.ads.zzcit
            public final void zza(boolean z8, int i9, String str3, String str4) {
                zzccm zzccmVar = zzccm.this;
                if (z8) {
                    zzccmVar.zzb();
                    return;
                }
                zzccmVar.zzd(new zzelj(1, "Image Web View failed to load. Error code: " + i9 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zza.zzae(str, str2, null);
        return zza2;
    }

    public final /* synthetic */ f4.c zzc(String str, Object obj) throws Exception {
        com.google.android.gms.ads.internal.zzu.zzz();
        zzchd zza = zzchq.zza(this.zza, zzcix.zza(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, this.zzp, this.zzq);
        final zzccm zza2 = zzccm.zza(zza);
        zza.zzN().zzB(new zzcit() { // from class: com.google.android.gms.internal.ads.zzdos
            @Override // com.google.android.gms.internal.ads.zzcit
            public final void zza(boolean z8, int i9, String str2, String str3) {
                zzccm.this.zzb();
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzff)).booleanValue()) {
            zza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zza.loadData(str, "text/html", "UTF-8");
        }
        return zza2;
    }

    public final f4.c zzd(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzgft.zzh(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzm(optJSONObject.optBoolean("require"), zzgft.zzm(zzo(optJSONArray, false, true), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzdot
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                return zzdow.this.zza(optJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final f4.c zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final f4.c zzf(JSONObject jSONObject, String str) {
        zzbhk zzbhkVar = this.zzh;
        return zzo(jSONObject.optJSONArray("images"), zzbhkVar.zzb, zzbhkVar.zzd);
    }

    public final f4.c zzg(JSONObject jSONObject, String str, final zzfgt zzfgtVar, final zzfgw zzfgwVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjZ)).booleanValue()) {
            return zzgft.zzh(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(0);
            if (optJSONObject == null) {
                return zzgft.zzh(null);
            }
            final String optString = optJSONObject.optString("base_url");
            final String optString2 = optJSONObject.optString("html");
            final com.google.android.gms.ads.internal.client.zzq zzk = zzk(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
            if (TextUtils.isEmpty(optString2)) {
                return zzgft.zzh(null);
            }
            final f4.c zzn = zzgft.zzn(zzgft.zzh(null), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzdoo
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final f4.c zza(Object obj) {
                    return zzdow.this.zzb(zzk, zzfgtVar, zzfgwVar, optString, optString2, obj);
                }
            }, zzcci.zze);
            return zzgft.zzn(zzn, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzdop
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final f4.c zza(Object obj) {
                    if (((zzchd) obj) != null) {
                        return f4.c.this;
                    }
                    throw new zzelj(1, "Retrieve Web View from image ad response failed.");
                }
            }, zzcci.zzf);
        }
        return zzgft.zzh(null);
    }

    public final f4.c zzh(JSONObject jSONObject, zzfgt zzfgtVar, zzfgw zzfgwVar) {
        f4.c zza;
        JSONObject zzh = com.google.android.gms.ads.internal.util.zzbw.zzh(jSONObject, "html_containers", "instream");
        if (zzh == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject(MimeTypes.BASE_TYPE_VIDEO);
            if (optJSONObject == null) {
                return zzgft.zzh(null);
            }
            String optString = optJSONObject.optString("vast_xml");
            boolean z8 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjY)).booleanValue() && optJSONObject.has("html")) {
                z8 = true;
            }
            if (TextUtils.isEmpty(optString)) {
                if (!z8) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Required field 'vast_xml' or 'html' is missing");
                    return zzgft.zzh(null);
                }
            } else if (!z8) {
                zza = this.zzi.zza(optJSONObject);
                return zzl(zzgft.zzo(zza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdN)).intValue(), TimeUnit.SECONDS, this.zzk), null);
            }
            zza = zzp(optJSONObject, zzfgtVar, zzfgwVar);
            return zzl(zzgft.zzo(zza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdN)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        return zzp(zzh, zzfgtVar, zzfgwVar);
    }
}
