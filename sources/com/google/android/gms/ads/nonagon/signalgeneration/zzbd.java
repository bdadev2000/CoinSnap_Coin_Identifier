package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzdtm;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzbd {
    public final String zza;
    public String zzb;
    public zzbwa zzc;
    public Bundle zzd = new Bundle();
    private long zze;
    private long zzf;

    public zzbd(JsonReader jsonReader, zzbwa zzbwaVar) throws IOException {
        zzbwa zzbwaVar2;
        Bundle bundle;
        char c2;
        this.zze = -1L;
        this.zzf = -1L;
        this.zzc = zzbwaVar;
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            switch (nextName.hashCode()) {
                case -1573145462:
                    if (nextName.equals("start_time")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -995427962:
                    if (nextName.equals(NativeProtocol.WEB_DIALOG_PARAMS)) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -271442291:
                    if (nextName.equals("signal_dictionary")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 1725551537:
                    if (nextName.equals(SDKConstants.PARAM_TOURNAMENTS_END_TIME)) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            c2 = 65535;
            if (c2 == 0) {
                str = jsonReader.nextString();
            } else if (c2 == 1) {
                hashMap = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    hashMap.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
            } else if (c2 == 2) {
                this.zze = jsonReader.nextLong();
            } else if (c2 != 3) {
                jsonReader.skipValue();
            } else {
                this.zzf = jsonReader.nextLong();
            }
        }
        this.zza = str;
        jsonReader.endObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.zzd.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcf)).booleanValue() || (zzbwaVar2 = this.zzc) == null || (bundle = zzbwaVar2.zzm) == null) {
            return;
        }
        bundle.putLong(zzdtm.GET_SIGNALS_SDKCORE_START.zza(), this.zze);
        this.zzc.zzm.putLong(zzdtm.GET_SIGNALS_SDKCORE_END.zza(), this.zzf);
    }
}
