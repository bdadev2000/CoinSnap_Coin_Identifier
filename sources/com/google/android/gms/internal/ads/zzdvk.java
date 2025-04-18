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

/* loaded from: classes3.dex */
public final class zzdvk extends zzbkx {
    private final zzdvn zza;
    private final zzdvi zzb;
    private final Map zzc = new HashMap();

    public zzdvk(zzdvn zzdvnVar, zzdvi zzdviVar) {
        this.zza = zzdvnVar;
        this.zzb = zzdviVar;
    }

    private static com.google.android.gms.ads.internal.client.zzm zzc(Map map) {
        char c2;
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
                            c2 = 0;
                            break;
                        }
                        break;
                    case -839117230:
                        if (nextName.equals("isTestDevice")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case -733436947:
                        if (nextName.equals("tagForUnderAgeOfConsent")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case -99890337:
                        if (nextName.equals("httpTimeoutMillis")) {
                            c2 = 6;
                            break;
                        }
                        break;
                    case 523149226:
                        if (nextName.equals("keywords")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 597632527:
                        if (nextName.equals("maxAdContentRating")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case 1411582723:
                        if (nextName.equals("tagForChildDirectedTreatment")) {
                            c2 = 3;
                            break;
                        }
                        break;
                }
                c2 = 65535;
                switch (c2) {
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
                        if (!jsonReader.nextBoolean()) {
                            zznVar.zzh(0);
                            break;
                        } else {
                            zznVar.zzh(1);
                            break;
                        }
                    case 4:
                        if (!jsonReader.nextBoolean()) {
                            zznVar.zzi(0);
                            break;
                        } else {
                            zznVar.zzi(1);
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

    @Override // com.google.android.gms.internal.ads.zzbky
    public final void zze() {
        this.zzc.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final void zzf(String str) throws RemoteException {
        boolean z2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjA)).booleanValue()) {
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
            char c2 = 65535;
            if (hashCode != 579053441) {
                if (hashCode == 871091088 && str2.equals("initialize")) {
                    z2 = false;
                }
                z2 = -1;
            } else {
                if (str2.equals("dispose_all")) {
                    z2 = true;
                }
                z2 = -1;
            }
            if (!z2) {
                this.zzc.clear();
                this.zzb.zza();
                return;
            }
            if (z2) {
                Iterator it = this.zzc.values().iterator();
                while (it.hasNext()) {
                    ((zzdvd) it.next()).zza();
                }
                this.zzc.clear();
                return;
            }
            String str3 = (String) zzP.get("obj_id");
            try {
                Objects.requireNonNull(str3);
                long parseLong = Long.parseLong(str3);
                switch (str2.hashCode()) {
                    case -1790951212:
                        if (str2.equals("show_interstitial_ad")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case -1266374734:
                        if (str2.equals("show_rewarded_ad")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case -257098725:
                        if (str2.equals("load_rewarded_ad")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 393881811:
                        if (str2.equals("create_interstitial_ad")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 585513149:
                        if (str2.equals("load_interstitial_ad")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 1671767583:
                        if (str2.equals("dispose")) {
                            c2 = 6;
                            break;
                        }
                        break;
                    case 2109237041:
                        if (str2.equals("create_rewarded_ad")) {
                            c2 = 3;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        if (this.zzc.size() >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjB)).intValue()) {
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
                        zzdve zzb = this.zza.zzb();
                        zzb.zzb(parseLong);
                        zzb.zza(str4);
                        this.zzc.put(valueOf, zzb.zzc().zza());
                        this.zzb.zzh(parseLong);
                        com.google.android.gms.ads.internal.util.zze.zza("Created H5 interstitial #" + parseLong + " with ad unit " + str4);
                        return;
                    case 1:
                        zzdvd zzdvdVar = (zzdvd) this.zzc.get(Long.valueOf(parseLong));
                        if (zzdvdVar != null) {
                            zzdvdVar.zzb(zzc(zzP));
                            return;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzm.zze("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzf(parseLong);
                            return;
                        }
                    case 2:
                        zzdvd zzdvdVar2 = (zzdvd) this.zzc.get(Long.valueOf(parseLong));
                        if (zzdvdVar2 != null) {
                            zzdvdVar2.zzc();
                            return;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzm.zze("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzf(parseLong);
                            return;
                        }
                    case 3:
                        if (this.zzc.size() >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjB)).intValue()) {
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
                        zzdve zzb2 = this.zza.zzb();
                        zzb2.zzb(parseLong);
                        zzb2.zza(str5);
                        this.zzc.put(valueOf2, zzb2.zzc().zzb());
                        this.zzb.zzh(parseLong);
                        com.google.android.gms.ads.internal.util.zze.zza("Created H5 rewarded #" + parseLong + " with ad unit " + str5);
                        return;
                    case 4:
                        zzdvd zzdvdVar3 = (zzdvd) this.zzc.get(Long.valueOf(parseLong));
                        if (zzdvdVar3 != null) {
                            zzdvdVar3.zzb(zzc(zzP));
                            return;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzm.zze("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzq(parseLong);
                            return;
                        }
                    case 5:
                        zzdvd zzdvdVar4 = (zzdvd) this.zzc.get(Long.valueOf(parseLong));
                        if (zzdvdVar4 != null) {
                            zzdvdVar4.zzc();
                            return;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzm.zze("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzq(parseLong);
                            return;
                        }
                    case 6:
                        Map map3 = this.zzc;
                        Long valueOf3 = Long.valueOf(parseLong);
                        zzdvd zzdvdVar5 = (zzdvd) map3.get(valueOf3);
                        if (zzdvdVar5 == null) {
                            com.google.android.gms.ads.internal.util.client.zzm.zze("Could not dispose H5 ad, object ID does not exist");
                            return;
                        }
                        zzdvdVar5.zza();
                        this.zzc.remove(valueOf3);
                        com.google.android.gms.ads.internal.util.zze.zza("Disposed H5 ad #" + parseLong);
                        return;
                    default:
                        com.google.android.gms.ads.internal.util.client.zzm.zze("H5 gmsg contained invalid action: ".concat(str2));
                        return;
                }
            } catch (NullPointerException | NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
            }
        }
    }
}
