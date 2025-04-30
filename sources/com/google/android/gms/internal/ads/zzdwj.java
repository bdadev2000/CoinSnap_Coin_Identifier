package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzdwj extends zzbmq {
    private final zzdwm zza;
    private final zzdwh zzb;
    private final Map zzc = new HashMap();

    public zzdwj(zzdwm zzdwmVar, zzdwh zzdwhVar) {
        this.zza = zzdwmVar;
        this.zzb = zzdwhVar;
    }

    private static com.google.android.gms.ads.internal.client.zzl zzc(Map map) {
        char c9;
        com.google.android.gms.ads.internal.client.zzm zzmVar = new com.google.android.gms.ads.internal.client.zzm();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return zzmVar.zza();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                switch (nextName.hashCode()) {
                    case -1289032093:
                        if (nextName.equals("extras")) {
                            c9 = 0;
                            break;
                        }
                        break;
                    case -839117230:
                        if (nextName.equals("isTestDevice")) {
                            c9 = 2;
                            break;
                        }
                        break;
                    case -733436947:
                        if (nextName.equals("tagForUnderAgeOfConsent")) {
                            c9 = 4;
                            break;
                        }
                        break;
                    case -99890337:
                        if (nextName.equals("httpTimeoutMillis")) {
                            c9 = 6;
                            break;
                        }
                        break;
                    case 523149226:
                        if (nextName.equals("keywords")) {
                            c9 = 1;
                            break;
                        }
                        break;
                    case 597632527:
                        if (nextName.equals("maxAdContentRating")) {
                            c9 = 5;
                            break;
                        }
                        break;
                    case 1411582723:
                        if (nextName.equals("tagForChildDirectedTreatment")) {
                            c9 = 3;
                            break;
                        }
                        break;
                }
                c9 = 65535;
                switch (c9) {
                    case 0:
                        jsonReader.beginObject();
                        Bundle bundle = new Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        zzmVar.zzb(bundle);
                        break;
                    case 1:
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        zzmVar.zze(arrayList);
                        break;
                    case 2:
                        zzmVar.zzd(jsonReader.nextBoolean());
                        break;
                    case 3:
                        if (jsonReader.nextBoolean()) {
                            zzmVar.zzh(1);
                            break;
                        } else {
                            zzmVar.zzh(0);
                            break;
                        }
                    case 4:
                        if (jsonReader.nextBoolean()) {
                            zzmVar.zzi(1);
                            break;
                        } else {
                            zzmVar.zzi(0);
                            break;
                        }
                    case 5:
                        String nextString = jsonReader.nextString();
                        if (!RequestConfiguration.zza.contains(nextString)) {
                            break;
                        } else {
                            zzmVar.zzf(nextString);
                            break;
                        }
                    case 6:
                        zzmVar.zzc(jsonReader.nextInt());
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
        com.google.android.gms.ads.internal.client.zzl zza = zzmVar.zza();
        Bundle bundle2 = zza.zzm.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 == null) {
            bundle2 = zza.zzc;
            zza.zzm.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle2);
        }
        return new com.google.android.gms.ads.internal.client.zzl(zza.zza, zza.zzb, bundle2, zza.zzd, zza.zze, zza.zzf, zza.zzg, zza.zzh, zza.zzi, zza.zzj, zza.zzk, zza.zzl, zza.zzm, zza.zzn, zza.zzo, zza.zzp, zza.zzq, zza.zzr, zza.zzs, zza.zzt, zza.zzu, zza.zzv, zza.zzw, zza.zzx, zza.zzy, zza.zzz);
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final void zze() {
        this.zzc.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final void zzf(String str) throws RemoteException {
        boolean z8;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjU)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("Received H5 gmsg: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        com.google.android.gms.ads.internal.zzu.zzp();
        Map zzP = com.google.android.gms.ads.internal.util.zzt.zzP(parse);
        String str2 = (String) zzP.get("action");
        if (TextUtils.isEmpty(str2)) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("H5 gmsg did not contain an action");
            return;
        }
        int hashCode = str2.hashCode();
        char c9 = 65535;
        if (hashCode != 579053441) {
            if (hashCode == 871091088 && str2.equals("initialize")) {
                z8 = false;
            }
            z8 = -1;
        } else {
            if (str2.equals("dispose_all")) {
                z8 = true;
            }
            z8 = -1;
        }
        if (z8) {
            if (!z8) {
                String str3 = (String) zzP.get("obj_id");
                try {
                    Objects.requireNonNull(str3);
                    long parseLong = Long.parseLong(str3);
                    switch (str2.hashCode()) {
                        case -1790951212:
                            if (str2.equals("show_interstitial_ad")) {
                                c9 = 2;
                                break;
                            }
                            break;
                        case -1266374734:
                            if (str2.equals("show_rewarded_ad")) {
                                c9 = 5;
                                break;
                            }
                            break;
                        case -257098725:
                            if (str2.equals("load_rewarded_ad")) {
                                c9 = 4;
                                break;
                            }
                            break;
                        case 393881811:
                            if (str2.equals("create_interstitial_ad")) {
                                c9 = 0;
                                break;
                            }
                            break;
                        case 585513149:
                            if (str2.equals("load_interstitial_ad")) {
                                c9 = 1;
                                break;
                            }
                            break;
                        case 1671767583:
                            if (str2.equals("dispose")) {
                                c9 = 6;
                                break;
                            }
                            break;
                        case 2109237041:
                            if (str2.equals("create_rewarded_ad")) {
                                c9 = 3;
                                break;
                            }
                            break;
                    }
                    switch (c9) {
                        case 0:
                            if (this.zzc.size() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjV)).intValue()) {
                                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not create H5 ad, too many existing objects");
                                this.zzb.zzi(parseLong);
                                return;
                            }
                            Map map = this.zzc;
                            Long valueOf = Long.valueOf(parseLong);
                            if (map.containsKey(valueOf)) {
                                com.google.android.gms.ads.internal.util.client.zzm.zze("Could not create H5 ad, object ID already exists");
                                this.zzb.zzi(parseLong);
                                return;
                            }
                            String str4 = (String) zzP.get("ad_unit");
                            if (TextUtils.isEmpty(str4)) {
                                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not create H5 ad, missing ad unit id");
                                this.zzb.zzi(parseLong);
                                return;
                            }
                            zzdwd zzb = this.zza.zzb();
                            zzb.zzb(parseLong);
                            zzb.zza(str4);
                            this.zzc.put(valueOf, zzb.zzc().zza());
                            this.zzb.zzh(parseLong);
                            com.google.android.gms.ads.internal.util.zze.zza("Created H5 interstitial #" + parseLong + " with ad unit " + str4);
                            return;
                        case 1:
                            zzdwc zzdwcVar = (zzdwc) this.zzc.get(Long.valueOf(parseLong));
                            if (zzdwcVar == null) {
                                com.google.android.gms.ads.internal.util.client.zzm.zze("Could not load H5 ad, object ID does not exist");
                                this.zzb.zzf(parseLong);
                                return;
                            } else {
                                zzdwcVar.zzb(zzc(zzP));
                                return;
                            }
                        case 2:
                            zzdwc zzdwcVar2 = (zzdwc) this.zzc.get(Long.valueOf(parseLong));
                            if (zzdwcVar2 == null) {
                                com.google.android.gms.ads.internal.util.client.zzm.zze("Could not show H5 ad, object ID does not exist");
                                this.zzb.zzf(parseLong);
                                return;
                            } else {
                                zzdwcVar2.zzc();
                                return;
                            }
                        case 3:
                            if (this.zzc.size() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjV)).intValue()) {
                                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not create H5 ad, too many existing objects");
                                this.zzb.zzi(parseLong);
                                return;
                            }
                            Map map2 = this.zzc;
                            Long valueOf2 = Long.valueOf(parseLong);
                            if (map2.containsKey(valueOf2)) {
                                com.google.android.gms.ads.internal.util.client.zzm.zze("Could not create H5 ad, object ID already exists");
                                this.zzb.zzi(parseLong);
                                return;
                            }
                            String str5 = (String) zzP.get("ad_unit");
                            if (TextUtils.isEmpty(str5)) {
                                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not create H5 ad, missing ad unit id");
                                this.zzb.zzi(parseLong);
                                return;
                            }
                            zzdwd zzb2 = this.zza.zzb();
                            zzb2.zzb(parseLong);
                            zzb2.zza(str5);
                            this.zzc.put(valueOf2, zzb2.zzc().zzb());
                            this.zzb.zzh(parseLong);
                            com.google.android.gms.ads.internal.util.zze.zza("Created H5 rewarded #" + parseLong + " with ad unit " + str5);
                            return;
                        case 4:
                            zzdwc zzdwcVar3 = (zzdwc) this.zzc.get(Long.valueOf(parseLong));
                            if (zzdwcVar3 == null) {
                                com.google.android.gms.ads.internal.util.client.zzm.zze("Could not load H5 ad, object ID does not exist");
                                this.zzb.zzq(parseLong);
                                return;
                            } else {
                                zzdwcVar3.zzb(zzc(zzP));
                                return;
                            }
                        case 5:
                            zzdwc zzdwcVar4 = (zzdwc) this.zzc.get(Long.valueOf(parseLong));
                            if (zzdwcVar4 == null) {
                                com.google.android.gms.ads.internal.util.client.zzm.zze("Could not show H5 ad, object ID does not exist");
                                this.zzb.zzq(parseLong);
                                return;
                            } else {
                                zzdwcVar4.zzc();
                                return;
                            }
                        case 6:
                            Map map3 = this.zzc;
                            Long valueOf3 = Long.valueOf(parseLong);
                            zzdwc zzdwcVar5 = (zzdwc) map3.get(valueOf3);
                            if (zzdwcVar5 == null) {
                                com.google.android.gms.ads.internal.util.client.zzm.zze("Could not dispose H5 ad, object ID does not exist");
                                return;
                            }
                            zzdwcVar5.zza();
                            this.zzc.remove(valueOf3);
                            com.google.android.gms.ads.internal.util.zze.zza("Disposed H5 ad #" + parseLong);
                            return;
                        default:
                            com.google.android.gms.ads.internal.util.client.zzm.zze("H5 gmsg contained invalid action: ".concat(str2));
                            return;
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zze("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
                    return;
                }
            }
            Iterator it = this.zzc.values().iterator();
            while (it.hasNext()) {
                ((zzdwc) it.next()).zza();
            }
            this.zzc.clear();
            return;
        }
        this.zzc.clear();
        this.zzb.zza();
    }
}
