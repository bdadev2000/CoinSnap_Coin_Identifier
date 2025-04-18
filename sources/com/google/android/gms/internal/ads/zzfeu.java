package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzfeu {
    public final int zza;
    public final int zzb;
    public final boolean zzc;

    public zzfeu(int i10, int i11, boolean z10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = z10;
    }

    public static List zza(JsonReader jsonReader) throws IllegalStateException, IOException, NumberFormatException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i10 = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i11 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z10 = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new zzfeu(i10, i11, z10));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
