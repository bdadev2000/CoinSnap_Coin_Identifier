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
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
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
public final class zzdnx {
    private final Context zza;
    private final zzdnb zzb;
    private final zzavn zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbbu zzf;
    private final Executor zzg;
    private final zzbfr zzh;
    private final zzdop zzi;
    private final zzdre zzj;
    private final ScheduledExecutorService zzk;
    private final zzdpz zzl;
    private final zzdud zzm;
    private final zzfng zzn;
    private final zzeey zzo;
    private final zzefj zzp;
    private final zzfhg zzq;

    public zzdnx(Context context, zzdnb zzdnbVar, zzavn zzavnVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbbu zzbbuVar, Executor executor, zzfhc zzfhcVar, zzdop zzdopVar, zzdre zzdreVar, ScheduledExecutorService scheduledExecutorService, zzdud zzdudVar, zzfng zzfngVar, zzeey zzeeyVar, zzdpz zzdpzVar, zzefj zzefjVar, zzfhg zzfhgVar) {
        this.zza = context;
        this.zzb = zzdnbVar;
        this.zzc = zzavnVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbbuVar;
        this.zzg = executor;
        this.zzh = zzfhcVar.zzi;
        this.zzi = zzdopVar;
        this.zzj = zzdreVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdudVar;
        this.zzn = zzfngVar;
        this.zzo = zzeeyVar;
        this.zzl = zzdpzVar;
        this.zzp = zzefjVar;
        this.zzq = zzfhgVar;
    }

    @Nullable
    public static final com.google.android.gms.ads.internal.client.zzfa zzi(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(optJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzgax.zzn();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzgax.zzn();
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            com.google.android.gms.ads.internal.client.zzfa zzr = zzr(optJSONArray.optJSONObject(i2));
            if (zzr != null) {
                arrayList.add(zzr);
            }
        }
        return zzgax.zzl(arrayList);
    }

    private final com.google.android.gms.ads.internal.client.zzs zzk(int i2, int i3) {
        if (i2 == 0) {
            if (i3 == 0) {
                return com.google.android.gms.ads.internal.client.zzs.zzc();
            }
            i2 = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzs(this.zza, new AdSize(i2, i3));
    }

    private static ListenableFuture zzl(ListenableFuture listenableFuture, Object obj) {
        final Object obj2 = null;
        return zzgfo.zzf(listenableFuture, Exception.class, new zzgev(obj2) { // from class: com.google.android.gms.internal.ads.zzdnt
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzgfo.zzh(null);
            }
        }, zzcan.zzf);
    }

    private static ListenableFuture zzm(boolean z2, final ListenableFuture listenableFuture, Object obj) {
        return z2 ? zzgfo.zzn(listenableFuture, new zzgev() { // from class: com.google.android.gms.internal.ads.zzdnu
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj2) {
                return obj2 != null ? ListenableFuture.this : zzgfo.zzg(new zzeki(1, "Retrieve required value in native ad response failed."));
            }
        }, zzcan.zzf) : zzl(listenableFuture, null);
    }

    private final ListenableFuture zzn(@Nullable JSONObject jSONObject, boolean z2) {
        if (jSONObject == null) {
            return zzgfo.zzh(null);
        }
        final String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return zzgfo.zzh(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, -1);
        final int optInt2 = jSONObject.optInt(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, -1);
        if (z2) {
            return zzgfo.zzh(new zzbfp(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzgfo.zzm(this.zzb.zzb(optString, optDouble, optBoolean), new zzfxq() { // from class: com.google.android.gms.internal.ads.zzdnl
            @Override // com.google.android.gms.internal.ads.zzfxq
            public final Object apply(Object obj) {
                return new zzbfp(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(optString), optDouble, optInt, optInt2);
            }
        }, this.zzg), null);
    }

    private final ListenableFuture zzo(@Nullable JSONArray jSONArray, boolean z2, boolean z3) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzgfo.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z3 ? jSONArray.length() : 1;
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i2), z2));
        }
        return zzgfo.zzm(zzgfo.zzd(arrayList), new zzfxq() { // from class: com.google.android.gms.internal.ads.zzdnq
            @Override // com.google.android.gms.internal.ads.zzfxq
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzbfp zzbfpVar : (List) obj) {
                    if (zzbfpVar != null) {
                        arrayList2.add(zzbfpVar);
                    }
                }
                return arrayList2;
            }
        }, this.zzg);
    }

    private final ListenableFuture zzp(JSONObject jSONObject, zzfgh zzfghVar, zzfgk zzfgkVar) {
        final ListenableFuture zzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString(CreativeInfo.al), zzfghVar, zzfgkVar, zzk(jSONObject.optInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, 0), jSONObject.optInt(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, 0)));
        return zzgfo.zzn(zzb, new zzgev() { // from class: com.google.android.gms.internal.ads.zzdnm
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                zzcfo zzcfoVar = (zzcfo) obj;
                if (zzcfoVar == null || zzcfoVar.zzq() == null) {
                    throw new zzeki(1, "Retrieve video view in html5 ad response failed.");
                }
                return ListenableFuture.this;
            }
        }, zzcan.zzf);
    }

    @Nullable
    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    private static final com.google.android.gms.ads.internal.client.zzfa zzr(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzfa(optString, optString2);
    }

    public final /* synthetic */ zzbfm zza(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzq = zzq(jSONObject, "bg_color");
        Integer zzq2 = zzq(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbfm(optString, list, zzq, zzq2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.zzh.zze, optBoolean);
    }

    public final /* synthetic */ ListenableFuture zzb(com.google.android.gms.ads.internal.client.zzs zzsVar, zzfgh zzfghVar, zzfgk zzfgkVar, String str, String str2, Object obj) throws Exception {
        zzcfo zza = this.zzj.zza(zzsVar, zzfghVar, zzfgkVar);
        final zzcar zza2 = zzcar.zza(zza);
        zzdpw zzb = this.zzl.zzb();
        zza.zzN().zzS(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zza, null, null), null, null, this.zzo, this.zzn, this.zzm, null, zzb, null, null, null, null);
        zza.zzag("/getNativeAdViewSignals", zzbjv.zzs);
        zza.zzag("/getNativeClickMeta", zzbjv.zzt);
        zza.zzN().zzB(new zzche() { // from class: com.google.android.gms.internal.ads.zzdnp
            @Override // com.google.android.gms.internal.ads.zzche
            public final void zza(boolean z2, int i2, String str3, String str4) {
                zzcar zzcarVar = zzcar.this;
                if (z2) {
                    zzcarVar.zzb();
                    return;
                }
                zzcarVar.zzd(new zzeki(1, "Image Web View failed to load. Error code: " + i2 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zza.zzae(str, str2, null);
        return zza2;
    }

    public final /* synthetic */ ListenableFuture zzc(String str, Object obj) throws Exception {
        com.google.android.gms.ads.internal.zzu.zzz();
        zzcfo zza = zzcgb.zza(this.zza, zzchi.zza(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, this.zzp, this.zzq);
        final zzcar zza2 = zzcar.zza(zza);
        zza.zzN().zzB(new zzche() { // from class: com.google.android.gms.internal.ads.zzdnr
            @Override // com.google.android.gms.internal.ads.zzche
            public final void zza(boolean z2, int i2, String str2, String str3) {
                zzcar.this.zzb();
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfa)).booleanValue()) {
            zza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zza.loadData(str, "text/html", "UTF-8");
        }
        return zza2;
    }

    public final ListenableFuture zzd(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzgfo.zzh(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzm(optJSONObject.optBoolean("require"), zzgfo.zzm(zzo(optJSONArray, false, true), new zzfxq() { // from class: com.google.android.gms.internal.ads.zzdns
            @Override // com.google.android.gms.internal.ads.zzfxq
            public final Object apply(Object obj) {
                return zzdnx.this.zza(optJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final ListenableFuture zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final ListenableFuture zzf(JSONObject jSONObject, String str) {
        zzbfr zzbfrVar = this.zzh;
        return zzo(jSONObject.optJSONArray("images"), zzbfrVar.zzb, zzbfrVar.zzd);
    }

    public final ListenableFuture zzg(JSONObject jSONObject, String str, final zzfgh zzfghVar, final zzfgk zzfgkVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjF)).booleanValue()) {
            return zzgfo.zzh(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzgfo.zzh(null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return zzgfo.zzh(null);
        }
        final String optString = optJSONObject.optString("base_url");
        final String optString2 = optJSONObject.optString(CreativeInfo.al);
        final com.google.android.gms.ads.internal.client.zzs zzk = zzk(optJSONObject.optInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, 0), optJSONObject.optInt(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, 0));
        if (TextUtils.isEmpty(optString2)) {
            return zzgfo.zzh(null);
        }
        final ListenableFuture zzn = zzgfo.zzn(zzgfo.zzh(null), new zzgev() { // from class: com.google.android.gms.internal.ads.zzdnn
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzdnx.this.zzb(zzk, zzfghVar, zzfgkVar, optString, optString2, obj);
            }
        }, zzcan.zze);
        return zzgfo.zzn(zzn, new zzgev() { // from class: com.google.android.gms.internal.ads.zzdno
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                if (((zzcfo) obj) != null) {
                    return ListenableFuture.this;
                }
                throw new zzeki(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzcan.zzf);
    }

    public final ListenableFuture zzh(JSONObject jSONObject, zzfgh zzfghVar, zzfgk zzfgkVar) {
        ListenableFuture zza;
        JSONObject zzh = com.google.android.gms.ads.internal.util.zzbs.zzh(jSONObject, "html_containers", "instream");
        if (zzh != null) {
            return zzp(zzh, zzfghVar, zzfgkVar);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject == null) {
            return zzgfo.zzh(null);
        }
        String optString = optJSONObject.optString("vast_xml");
        boolean z2 = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjE)).booleanValue() && optJSONObject.has(CreativeInfo.al)) {
            z2 = true;
        }
        if (TextUtils.isEmpty(optString)) {
            if (!z2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Required field 'vast_xml' or 'html' is missing");
                return zzgfo.zzh(null);
            }
        } else if (!z2) {
            zza = this.zzi.zza(optJSONObject);
            return zzl(zzgfo.zzo(zza, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdK)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        zza = zzp(optJSONObject, zzfghVar, zzfgkVar);
        return zzl(zzgfo.zzo(zza, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdK)).intValue(), TimeUnit.SECONDS, this.zzk), null);
    }
}
