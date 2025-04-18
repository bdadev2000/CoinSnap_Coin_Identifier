package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.common.util.IOUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzebt {
    public int zza = 0;
    public Map zzb = new HashMap();
    public String zzc = "";
    public long zzd = -1;

    public static zzebt zza(Reader reader) throws zzfex {
        try {
            try {
                JsonReader jsonReader = new JsonReader(reader);
                HashMap hashMap = new HashMap();
                String str = "";
                jsonReader.beginObject();
                long j3 = -1;
                int i10 = 0;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if ("response".equals(nextName)) {
                        i10 = jsonReader.nextInt();
                    } else if (TtmlNode.TAG_BODY.equals(nextName)) {
                        str = jsonReader.nextString();
                    } else if ("latency".equals(nextName)) {
                        j3 = jsonReader.nextLong();
                    } else if ("headers".equals(nextName)) {
                        hashMap = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            hashMap.put(jsonReader.nextName(), com.google.android.gms.ads.internal.util.zzbr.zzd(jsonReader));
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                zzebt zzebtVar = new zzebt();
                zzebtVar.zza = i10;
                if (str != null) {
                    zzebtVar.zzc = str;
                }
                zzebtVar.zzd = j3;
                zzebtVar.zzb = hashMap;
                return zzebtVar;
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException e2) {
                throw new zzfex("Unable to parse Response", e2);
            }
        } finally {
            IOUtils.closeQuietly(reader);
        }
    }
}
