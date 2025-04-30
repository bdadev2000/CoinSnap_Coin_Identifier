package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzdul;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzax {
    public final String zza;
    public String zzb;
    public zzbxu zzc;
    public Bundle zzd = new Bundle();
    private long zze;
    private long zzf;

    public zzax(JsonReader jsonReader, zzbxu zzbxuVar) throws IOException {
        zzbxu zzbxuVar2;
        Bundle bundle;
        char c9;
        this.zze = -1L;
        this.zzf = -1L;
        this.zzc = zzbxuVar;
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            switch (nextName.hashCode()) {
                case -1573145462:
                    if (nextName.equals("start_time")) {
                        c9 = 2;
                        break;
                    }
                    break;
                case -995427962:
                    if (nextName.equals("params")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case -271442291:
                    if (nextName.equals("signal_dictionary")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case 1725551537:
                    if (nextName.equals("end_time")) {
                        c9 = 3;
                        break;
                    }
                    break;
            }
            c9 = 65535;
            if (c9 != 0) {
                if (c9 != 1) {
                    if (c9 != 2) {
                        if (c9 != 3) {
                            jsonReader.skipValue();
                        } else {
                            this.zzf = jsonReader.nextLong();
                        }
                    } else {
                        this.zze = jsonReader.nextLong();
                    }
                } else {
                    hashMap = new HashMap();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        hashMap.put(jsonReader.nextName(), jsonReader.nextString());
                    }
                    jsonReader.endObject();
                }
            } else {
                str = jsonReader.nextString();
            }
        }
        this.zza = str;
        jsonReader.endObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.zzd.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue() && (zzbxuVar2 = this.zzc) != null && (bundle = zzbxuVar2.zzm) != null) {
            bundle.putLong(zzdul.GET_SIGNALS_SDKCORE_START.zza(), this.zze);
            this.zzc.zzm.putLong(zzdul.GET_SIGNALS_SDKCORE_END.zza(), this.zzf);
        }
    }
}
