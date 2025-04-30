package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfhe {
    public final List zza;
    public final zzfgw zzb;
    public final List zzc;

    @Nullable
    public final zzbxu zzd;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    public zzfhe(JsonReader jsonReader, @Nullable zzbxu zzbxuVar) throws IllegalStateException, IOException, JSONException, NumberFormatException, AssertionError {
        Bundle bundle;
        this.zzd = zzbxuVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue() && zzbxuVar != null && (bundle = zzbxuVar.zzm) != null) {
            bundle.putLong(zzdul.SERVER_RESPONSE_PARSE_START.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
        }
        ?? emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        zzfgw zzfgwVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        emptyList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            emptyList.add(new zzfgt(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        zzfgwVar = new zzfgw(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if ("name".equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = com.google.android.gms.ads.internal.util.zzbw.zzi(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new zzfhd(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.zzc = arrayList;
        this.zza = emptyList;
        this.zzb = zzfgwVar == null ? new zzfgw(new JsonReader(new StringReader(JsonUtils.EMPTY_JSON))) : zzfgwVar;
    }

    public static zzfhe zza(Reader reader, @Nullable zzbxu zzbxuVar) throws zzfgx {
        try {
            try {
                return new zzfhe(new JsonReader(reader), zzbxuVar);
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e4) {
                throw new zzfgx("unable to parse ServerResponse", e4);
            }
        } finally {
            IOUtils.closeQuietly(reader);
        }
    }
}
