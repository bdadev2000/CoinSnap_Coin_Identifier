package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzedc {
    public int zza = 0;
    public Map zzb = new HashMap();
    public String zzc = "";
    public long zzd = -1;

    public static zzedc zza(Reader reader) throws zzfgl {
        try {
            try {
                JsonReader jsonReader = new JsonReader(reader);
                HashMap hashMap = new HashMap();
                String str = "";
                jsonReader.beginObject();
                long j2 = -1;
                int i2 = 0;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if ("response".equals(nextName)) {
                        i2 = jsonReader.nextInt();
                    } else if ("body".equals(nextName)) {
                        str = jsonReader.nextString();
                    } else if ("latency".equals(nextName)) {
                        j2 = jsonReader.nextLong();
                    } else if ("headers".equals(nextName)) {
                        hashMap = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            hashMap.put(jsonReader.nextName(), com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader));
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                zzedc zzedcVar = new zzedc();
                zzedcVar.zza = i2;
                if (str != null) {
                    zzedcVar.zzc = str;
                }
                zzedcVar.zzd = j2;
                zzedcVar.zzb = hashMap;
                IOUtils.closeQuietly(reader);
                return zzedcVar;
            } catch (IOException e) {
                e = e;
                throw new zzfgl("Unable to parse Response", e);
            } catch (AssertionError e2) {
                e = e2;
                throw new zzfgl("Unable to parse Response", e);
            } catch (IllegalStateException e3) {
                e = e3;
                throw new zzfgl("Unable to parse Response", e);
            } catch (NumberFormatException e4) {
                e = e4;
                throw new zzfgl("Unable to parse Response", e);
            }
        } catch (Throwable th) {
            IOUtils.closeQuietly(reader);
            throw th;
        }
    }
}
