package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.ads.e;
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

/* loaded from: classes3.dex */
public final class zzffe {
    public final List zza;
    public final zzfew zzb;
    public final List zzc;

    @Nullable
    public final zzbvx zzd;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public zzffe(JsonReader jsonReader, @Nullable zzbvx zzbvxVar) throws IllegalStateException, IOException, JSONException, NumberFormatException, AssertionError {
        Bundle bundle;
        Bundle bundle2;
        this.zzd = zzbvxVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzci)).booleanValue() && zzbvxVar != null && (bundle2 = zzbvxVar.zzm) != null) {
            e.m(bundle2, zzdrv.SERVER_RESPONSE_PARSE_START.zza());
        }
        ?? emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        zzfew zzfewVar = null;
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
                            emptyList.add(new zzfet(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        zzfewVar = new zzfew(jsonReader);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcj)).booleanValue() && zzbvxVar != null && (bundle = zzbvxVar.zzm) != null) {
                            bundle.putLong(zzdrv.NORMALIZATION_AD_RESPONSE_START.zza(), zzfewVar.zzs);
                            zzbvxVar.zzm.putLong(zzdrv.NORMALIZATION_AD_RESPONSE_END.zza(), zzfewVar.zzt);
                        }
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
                            jSONObject = com.google.android.gms.ads.internal.util.zzbr.zzi(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new zzffd(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.zzc = arrayList;
        this.zza = emptyList;
        this.zzb = zzfewVar == null ? new zzfew(new JsonReader(new StringReader(JsonUtils.EMPTY_JSON))) : zzfewVar;
    }

    public static zzffe zza(Reader reader, @Nullable zzbvx zzbvxVar) throws zzfex {
        try {
            try {
                return new zzffe(new JsonReader(reader), zzbvxVar);
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e2) {
                throw new zzfex("unable to parse ServerResponse", e2);
            }
        } finally {
            IOUtils.closeQuietly(reader);
        }
    }
}
