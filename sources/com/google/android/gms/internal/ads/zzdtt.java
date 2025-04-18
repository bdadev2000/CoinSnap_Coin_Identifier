package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzdtt extends zzbks {
    private final zzdtw zza;
    private final zzdtr zzb;
    private final Map zzc = new HashMap();

    public zzdtt(zzdtw zzdtwVar, zzdtr zzdtrVar) {
        this.zza = zzdtwVar;
        this.zzb = zzdtrVar;
    }

    private static com.google.android.gms.ads.internal.client.zzm zzc(Map map) {
        char c10;
        com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return zznVar.zza();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                switch (nextName.hashCode()) {
                    case -1289032093:
                        if (nextName.equals("extras")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -839117230:
                        if (nextName.equals("isTestDevice")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -733436947:
                        if (nextName.equals("tagForUnderAgeOfConsent")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case -99890337:
                        if (nextName.equals("httpTimeoutMillis")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 523149226:
                        if (nextName.equals("keywords")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 597632527:
                        if (nextName.equals("maxAdContentRating")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 1411582723:
                        if (nextName.equals("tagForChildDirectedTreatment")) {
                            c10 = 3;
                            break;
                        }
                        break;
                }
                c10 = 65535;
                switch (c10) {
                    case 0:
                        jsonReader.beginObject();
                        Bundle bundle = new Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        zznVar.zzb(bundle);
                        break;
                    case 1:
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        zznVar.zze(arrayList);
                        break;
                    case 2:
                        zznVar.zzd(jsonReader.nextBoolean());
                        break;
                    case 3:
                        if (jsonReader.nextBoolean()) {
                            zznVar.zzh(1);
                            break;
                        } else {
                            zznVar.zzh(0);
                            break;
                        }
                    case 4:
                        if (jsonReader.nextBoolean()) {
                            zznVar.zzi(1);
                            break;
                        } else {
                            zznVar.zzi(0);
                            break;
                        }
                    case 5:
                        String nextString = jsonReader.nextString();
                        if (!RequestConfiguration.zza.contains(nextString)) {
                            break;
                        } else {
                            zznVar.zzf(nextString);
                            break;
                        }
                    case 6:
                        zznVar.zzc(jsonReader.nextInt());
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Ad Request json was malformed, parsing ended early.");
        }
        com.google.android.gms.ads.internal.client.zzm zza = zznVar.zza();
        Bundle bundle2 = zza.zzm.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 == null) {
            bundle2 = zza.zzc;
            zza.zzm.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle2);
        }
        return new com.google.android.gms.ads.internal.client.zzm(zza.zza, zza.zzb, bundle2, zza.zzd, zza.zze, zza.zzf, zza.zzg, zza.zzh, zza.zzi, zza.zzj, zza.zzk, zza.zzl, zza.zzm, zza.zzn, zza.zzo, zza.zzp, zza.zzq, zza.zzr, zza.zzs, zza.zzt, zza.zzu, zza.zzv, zza.zzw, zza.zzx, zza.zzy, zza.zzz);
    }

    @Override // com.google.android.gms.internal.ads.zzbkt
    public final void zze() {
        this.zzc.clear();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00a5, code lost:
    
        if (r0.equals("create_interstitial_ad") != false) goto L50;
     */
    @Override // com.google.android.gms.internal.ads.zzbkt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.String r12) throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdtt.zzf(java.lang.String):void");
    }
}
