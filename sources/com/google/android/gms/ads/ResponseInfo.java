package com.google.android.gms.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ResponseInfo {

    @Nullable
    private final zzdn zza;
    private final List zzb = new ArrayList();

    @Nullable
    private AdapterResponseInfo zzc;

    private ResponseInfo(@Nullable zzdn zzdnVar) {
        this.zza = zzdnVar;
        if (zzdnVar != null) {
            try {
                List zzj = zzdnVar.zzj();
                if (zzj != null) {
                    Iterator it = zzj.iterator();
                    while (it.hasNext()) {
                        AdapterResponseInfo zza = AdapterResponseInfo.zza((zzu) it.next());
                        if (zza != null) {
                            this.zzb.add(zza);
                        }
                    }
                }
            } catch (RemoteException e4) {
                zzm.zzh("Could not forward getAdapterResponseInfo to ResponseInfo.", e4);
            }
        }
        zzdn zzdnVar2 = this.zza;
        if (zzdnVar2 != null) {
            try {
                zzu zzf = zzdnVar2.zzf();
                if (zzf != null) {
                    this.zzc = AdapterResponseInfo.zza(zzf);
                }
            } catch (RemoteException e9) {
                zzm.zzh("Could not forward getLoadedAdapterResponse to ResponseInfo.", e9);
            }
        }
    }

    @Nullable
    public static ResponseInfo zza(@Nullable zzdn zzdnVar) {
        if (zzdnVar != null) {
            return new ResponseInfo(zzdnVar);
        }
        return null;
    }

    @NonNull
    public static ResponseInfo zzb(@Nullable zzdn zzdnVar) {
        return new ResponseInfo(zzdnVar);
    }

    @NonNull
    public List<AdapterResponseInfo> getAdapterResponses() {
        return this.zzb;
    }

    @Nullable
    public AdapterResponseInfo getLoadedAdapterResponseInfo() {
        return this.zzc;
    }

    @Nullable
    public String getMediationAdapterClassName() {
        try {
            zzdn zzdnVar = this.zza;
            if (zzdnVar != null) {
                return zzdnVar.zzg();
            }
            return null;
        } catch (RemoteException e4) {
            zzm.zzh("Could not forward getMediationAdapterClassName to ResponseInfo.", e4);
            return null;
        }
    }

    @NonNull
    public Bundle getResponseExtras() {
        try {
            zzdn zzdnVar = this.zza;
            if (zzdnVar != null) {
                return zzdnVar.zze();
            }
        } catch (RemoteException e4) {
            zzm.zzh("Could not forward getResponseExtras to ResponseInfo.", e4);
        }
        return new Bundle();
    }

    @Nullable
    public String getResponseId() {
        try {
            zzdn zzdnVar = this.zza;
            if (zzdnVar != null) {
                return zzdnVar.zzi();
            }
            return null;
        } catch (RemoteException e4) {
            zzm.zzh("Could not forward getResponseId to ResponseInfo.", e4);
            return null;
        }
    }

    @NonNull
    public String toString() {
        try {
            return zzd().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @Nullable
    public final zzdn zzc() {
        return this.zza;
    }

    @NonNull
    public final JSONObject zzd() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String responseId = getResponseId();
        if (responseId == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", responseId);
        }
        String mediationAdapterClassName = getMediationAdapterClassName();
        if (mediationAdapterClassName == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", mediationAdapterClassName);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            jSONArray.put(((AdapterResponseInfo) it.next()).zzb());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        AdapterResponseInfo adapterResponseInfo = this.zzc;
        if (adapterResponseInfo != null) {
            jSONObject.put("Loaded Adapter Response", adapterResponseInfo.zzb());
        }
        Bundle responseExtras = getResponseExtras();
        if (responseExtras != null) {
            jSONObject.put("Response Extras", zzay.zzb().zzi(responseExtras));
        }
        return jSONObject;
    }
}
