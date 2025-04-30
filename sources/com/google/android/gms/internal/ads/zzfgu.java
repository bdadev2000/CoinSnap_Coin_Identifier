package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzfgu {
    public final int zza;
    public final int zzb;
    public final boolean zzc;

    public zzfgu(int i9, int i10, boolean z8) {
        this.zza = i9;
        this.zzb = i10;
        this.zzc = z8;
    }

    public static List zza(JsonReader jsonReader) throws IllegalStateException, IOException, NumberFormatException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i9 = 0;
            int i10 = 0;
            boolean z8 = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i9 = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i10 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z8 = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new zzfgu(i9, i10, z8));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
