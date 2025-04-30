package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzfgv {
    private String zza;

    public zzfgv(JsonReader jsonReader) throws IOException {
        char c9;
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != -1724546052) {
                if (hashCode == 3059181 && nextName.equals("code")) {
                    c9 = 0;
                }
                c9 = 65535;
            } else {
                if (nextName.equals("description")) {
                    c9 = 1;
                }
                c9 = 65535;
            }
            if (c9 != 0) {
                if (c9 != 1) {
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
