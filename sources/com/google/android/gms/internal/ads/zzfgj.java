package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class zzfgj {
    private String zza;

    public zzfgj(JsonReader jsonReader) throws IOException {
        char c2;
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != -1724546052) {
                if (hashCode == 3059181 && nextName.equals("code")) {
                    c2 = 0;
                }
                c2 = 65535;
            } else {
                if (nextName.equals("description")) {
                    c2 = 1;
                }
                c2 = 65535;
            }
            if (c2 == 0) {
                jsonReader.nextInt();
            } else if (c2 != 1) {
                jsonReader.skipValue();
            } else {
                str = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
        this.zza = str;
    }

    public final String zza() {
        return this.zza;
    }
}
