package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzfev {
    private String zza;

    public zzfev(JsonReader jsonReader) throws IOException {
        char c10;
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != -1724546052) {
                if (hashCode == 3059181 && nextName.equals("code")) {
                    c10 = 0;
                }
                c10 = 65535;
            } else {
                if (nextName.equals("description")) {
                    c10 = 1;
                }
                c10 = 65535;
            }
            if (c10 != 0) {
                if (c10 != 1) {
                    jsonReader.skipValue();
                } else {
                    str = jsonReader.nextString();
                }
            } else {
                jsonReader.nextInt();
            }
        }
        jsonReader.endObject();
        this.zza = str;
    }

    public final String zza() {
        return this.zza;
    }
}
