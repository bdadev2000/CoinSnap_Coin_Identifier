package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class zzl {
    public static final /* synthetic */ int zza = 0;
    private static boolean zzc = false;
    private static boolean zzd = false;
    private final List zzg;
    private static final Object zzb = new Object();
    private static final Clock zze = DefaultClock.getInstance();
    private static final Set zzf = new HashSet(Arrays.asList(new String[0]));

    public zzl() {
        throw null;
    }

    public static /* synthetic */ void zza(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zzr(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name(TtmlNode.TAG_BODY).value(Base64Utils.encode(bArr));
        }
        jsonWriter.endObject();
    }

    public static /* synthetic */ void zzb(int i10, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i10);
        jsonWriter.endObject();
        zzr(jsonWriter, map);
        jsonWriter.endObject();
    }

    public static void zzi() {
        synchronized (zzb) {
            zzc = false;
            zzd = false;
            zzm.zzj("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzj(boolean z10) {
        synchronized (zzb) {
            zzc = true;
            zzd = z10;
        }
    }

    public static boolean zzk() {
        boolean z10;
        synchronized (zzb) {
            z10 = false;
            if (zzc && zzd) {
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean zzl() {
        boolean z10;
        synchronized (zzb) {
            z10 = zzc;
        }
        return z10;
    }

    private static synchronized void zzm(String str) {
        synchronized (zzl.class) {
            zzm.zzi("GMA Debug BEGIN");
            int i10 = 0;
            while (i10 < str.length()) {
                int i11 = i10 + 4000;
                zzm.zzi("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i10, Math.min(i11, str.length())))));
                i10 = i11;
            }
            zzm.zzi("GMA Debug FINISH");
        }
    }

    private final void zzn(String str, zzk zzkVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name(CampaignEx.JSON_KEY_TIMESTAMP).value(zze.currentTimeMillis());
            jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            zzkVar.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e2) {
            zzm.zzh("unable to log", e2);
        }
        zzm(stringWriter.toString());
    }

    private final void zzo(@Nullable final String str) {
        zzn("onNetworkRequestError", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzi
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final void zza(JsonWriter jsonWriter) {
                int i10 = zzl.zza;
                jsonWriter.name("params").beginObject();
                String str2 = str;
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private final void zzp(final String str, final String str2, @Nullable final Map map, @Nullable final byte[] bArr) {
        zzn("onNetworkRequest", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzg
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final void zza(JsonWriter jsonWriter) {
                zzl.zza(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    private final void zzq(@Nullable final Map map, final int i10) {
        zzn("onNetworkResponse", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzj
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final void zza(JsonWriter jsonWriter) {
                zzl.zzb(i10, map, jsonWriter);
            }
        });
    }

    private static void zzr(JsonWriter jsonWriter, @Nullable Map map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!zzf.contains(str)) {
                if (entry.getValue() instanceof List) {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.VALUE).value(str2);
                        jsonWriter.endObject();
                    }
                } else if (entry.getValue() instanceof String) {
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.VALUE).value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    zzm.zzg("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                    break;
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void zzc(HttpURLConnection httpURLConnection, @Nullable byte[] bArr) {
        HashMap hashMap;
        if (!zzk()) {
            return;
        }
        if (httpURLConnection.getRequestProperties() == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap(httpURLConnection.getRequestProperties());
        }
        zzp(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), hashMap, bArr);
    }

    public final void zzd(String str, String str2, @Nullable Map map, @Nullable byte[] bArr) {
        if (!zzk()) {
            return;
        }
        zzp(str, "GET", map, bArr);
    }

    public final void zze(HttpURLConnection httpURLConnection, int i10) {
        HashMap hashMap;
        if (zzk()) {
            String str = null;
            if (httpURLConnection.getHeaderFields() == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(httpURLConnection.getHeaderFields());
            }
            zzq(hashMap, i10);
            if (i10 >= 200 && i10 < 300) {
                return;
            }
            try {
                str = httpURLConnection.getResponseMessage();
            } catch (IOException e2) {
                zzm.zzj("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e2.getMessage())));
            }
            zzo(str);
        }
    }

    public final void zzf(@Nullable Map map, int i10) {
        if (zzk()) {
            zzq(map, i10);
            if (i10 >= 200 && i10 < 300) {
                return;
            }
            zzo(null);
        }
    }

    public final void zzg(@Nullable String str) {
        if (zzk() && str != null) {
            zzh(str.getBytes());
        }
    }

    public final void zzh(final byte[] bArr) {
        zzn("onNetworkResponseBody", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzh
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final void zza(JsonWriter jsonWriter) {
                int i10 = zzl.zza;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                String encode = Base64Utils.encode(bArr2);
                if (length < 10000) {
                    jsonWriter.name(TtmlNode.TAG_BODY).value(encode);
                } else {
                    String zzf2 = zzf.zzf(encode);
                    if (zzf2 != null) {
                        jsonWriter.name("bodydigest").value(zzf2);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }

    public zzl(@Nullable String str) {
        List asList;
        if (!zzk()) {
            asList = new ArrayList();
        } else {
            asList = Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
        }
        this.zzg = asList;
    }
}
