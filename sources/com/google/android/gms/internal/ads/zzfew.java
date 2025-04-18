package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzfew {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final int zzf;
    public final long zzg;
    public final boolean zzh;
    public final String zzi;

    @Nullable
    public final zzfev zzj;
    public final Bundle zzk;
    public final String zzl;
    public final String zzm;
    public final String zzn;
    public final JSONObject zzo;
    public final JSONObject zzp;
    public final String zzq;
    public final int zzr;
    public long zzs;
    public long zzt;

    public zzfew(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List emptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String str = "";
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        zzfev zzfevVar = null;
        long j3 = -1;
        long j10 = -1;
        long j11 = 0;
        int i12 = -1;
        int i13 = 1;
        String str6 = str5;
        String str7 = str6;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (Objects.equals(nextName, "nofill_urls")) {
                emptyList = com.google.android.gms.ads.internal.util.zzbr.zzd(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i10 = jsonReader.nextInt();
            } else if (Objects.equals(nextName, "refresh_load_delay_time_interval")) {
                i12 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str6 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z10 = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i11 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j11 = jsonReader.nextLong();
            } else {
                String str8 = str3;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhV)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    zzfevVar = new zzfev(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str7 = jsonReader.nextString();
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkb)).booleanValue() && Objects.equals(nextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(nextName)) {
                        str3 = jsonReader.nextString();
                    } else if ("response_info_extras".equals(nextName)) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgG)).booleanValue()) {
                            try {
                                try {
                                    Bundle zza = com.google.android.gms.ads.internal.util.zzbr.zza(com.google.android.gms.ads.internal.util.zzbr.zzi(jsonReader));
                                    if (zza != null) {
                                        bundle = zza;
                                    }
                                } catch (IOException | JSONException unused) {
                                }
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(nextName)) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziS)).booleanValue()) {
                            str5 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestUrl".equals(nextName)) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziS)).booleanValue()) {
                            str4 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        zzbce zzbceVar = zzbcn.zziT;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue() && Objects.equals(nextName, "adResponseBody")) {
                            str2 = jsonReader.nextString();
                        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue() && Objects.equals(nextName, "adResponseHeaders")) {
                            jSONObject = com.google.android.gms.ads.internal.util.zzbr.zzi(jsonReader);
                        } else if (Objects.equals(nextName, "max_parallel_renderers")) {
                            i13 = Math.max(1, jsonReader.nextInt());
                        } else {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzja)).booleanValue() && Objects.equals(nextName, "inspector_ad_transaction_extras")) {
                                jSONObject2 = com.google.android.gms.ads.internal.util.zzbr.zzi(jsonReader);
                            } else {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcj)).booleanValue() && Objects.equals(nextName, "latency_extras")) {
                                    try {
                                        Bundle zza2 = com.google.android.gms.ads.internal.util.zzbr.zza(com.google.android.gms.ads.internal.util.zzbr.zzi(jsonReader));
                                        if (zza2 != null) {
                                            j10 = zza(zza2.getDouble("start_time"));
                                            j3 = zza(zza2.getDouble("end_time"));
                                        }
                                    } catch (IllegalStateException unused3) {
                                        jsonReader.skipValue();
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                        }
                    }
                }
                str3 = str8;
            }
        }
        String str9 = str3;
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzc = i10;
        if (((Boolean) zzbet.zzd.zze()).booleanValue()) {
            this.zzd = -1;
        } else {
            zzbdx zzbdxVar = zzbeb.zza;
            if (((Long) zzbdxVar.zze()).longValue() > -1) {
                this.zzd = ((Long) zzbdxVar.zze()).intValue();
            } else {
                this.zzd = i12;
            }
        }
        this.zzb = str;
        this.zze = str6;
        this.zzf = i11;
        this.zzg = j11;
        this.zzj = zzfevVar;
        this.zzh = z10;
        this.zzi = str7;
        this.zzk = bundle;
        this.zzl = str4;
        this.zzm = str5;
        this.zzn = str2;
        this.zzo = jSONObject;
        this.zzp = jSONObject2;
        this.zzq = str9;
        zzbdx zzbdxVar2 = zzber.zza;
        this.zzr = ((Long) zzbdxVar2.zze()).longValue() > 0 ? ((Long) zzbdxVar2.zze()).intValue() : i13;
        this.zzs = j10;
        this.zzt = j3;
    }

    private static final long zza(double d10) {
        if (d10 > 9.223372036854776E18d || d10 < -9.223372036854776E18d) {
            return -1L;
        }
        return (long) d10;
    }
}
