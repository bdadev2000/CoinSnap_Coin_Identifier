package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.common.util.IOUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzeed {
    public int zza = 0;
    public Map zzb = new HashMap();
    public String zzc = "";
    public long zzd = -1;

    public static zzeed zza(Reader reader) throws zzfgx {
        try {
            try {
                JsonReader jsonReader = new JsonReader(reader);
                HashMap hashMap = new HashMap();
                String str = "";
                jsonReader.beginObject();
                long j7 = -1;
                int i9 = 0;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if ("response".equals(nextName)) {
                        i9 = jsonReader.nextInt();
                    } else if (TtmlNode.TAG_BODY.equals(nextName)) {
                        str = jsonReader.nextString();
                    } else if ("latency".equals(nextName)) {
                        j7 = jsonReader.nextLong();
                    } else if ("headers".equals(nextName)) {
                        hashMap = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            hashMap.put(jsonReader.nextName(), com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader));
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                zzeed zzeedVar = new zzeed();
                zzeedVar.zza = i9;
                if (str != null) {
                    zzeedVar.zzc = str;
                }
                zzeedVar.zzd = j7;
                zzeedVar.zzb = hashMap;
                IOUtils.closeQuietly(reader);
                return zzeedVar;
            } catch (IOException e4) {
                e = e4;
                throw new zzfgx("Unable to parse Response", e);
            } catch (AssertionError e9) {
                e = e9;
                throw new zzfgx("Unable to parse Response", e);
            } catch (IllegalStateException e10) {
                e = e10;
                throw new zzfgx("Unable to parse Response", e);
            } catch (NumberFormatException e11) {
                e = e11;
                throw new zzfgx("Unable to parse Response", e);
            }
        } catch (Throwable th) {
            IOUtils.closeQuietly(reader);
            throw th;
        }
    }
}
