package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbvx;
import com.google.android.gms.internal.ads.zzdrv;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbd {
    public final String zza;
    public String zzb;
    public zzbvx zzc;
    public Bundle zzd = new Bundle();
    private long zze;
    private long zzf;

    public zzbd(JsonReader jsonReader, zzbvx zzbvxVar) throws IOException {
        zzbvx zzbvxVar2;
        Bundle bundle;
        char c10;
        this.zze = -1L;
        this.zzf = -1L;
        this.zzc = zzbvxVar;
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            switch (nextName.hashCode()) {
                case -1573145462:
                    if (nextName.equals("start_time")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -995427962:
                    if (nextName.equals("params")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -271442291:
                    if (nextName.equals("signal_dictionary")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1725551537:
                    if (nextName.equals("end_time")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            if (c10 != 0) {
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 != 3) {
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
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzci)).booleanValue() && (zzbvxVar2 = this.zzc) != null && (bundle = zzbvxVar2.zzm) != null) {
            bundle.putLong(zzdrv.GET_SIGNALS_SDKCORE_START.zza(), this.zze);
            this.zzc.zzm.putLong(zzdrv.GET_SIGNALS_SDKCORE_END.zza(), this.zzf);
        }
    }
}
