package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzfmx {
    private final zzfni zza;
    private final zzfni zzb;
    private final boolean zzc;
    private final zzfnb zzd;
    private final zzfne zze;

    private zzfmx(zzfnb zzfnbVar, zzfne zzfneVar, zzfni zzfniVar, zzfni zzfniVar2, boolean z10) {
        this.zzd = zzfnbVar;
        this.zze = zzfneVar;
        this.zza = zzfniVar;
        if (zzfniVar2 == null) {
            this.zzb = zzfni.NONE;
        } else {
            this.zzb = zzfniVar2;
        }
        this.zzc = z10;
    }

    public static zzfmx zza(zzfnb zzfnbVar, zzfne zzfneVar, zzfni zzfniVar, zzfni zzfniVar2, boolean z10) {
        zzfor.zzc(zzfnbVar, "CreativeType is null");
        zzfor.zzc(zzfneVar, "ImpressionType is null");
        zzfor.zzc(zzfniVar, "Impression owner is null");
        if (zzfniVar != zzfni.NONE) {
            if (zzfnbVar == zzfnb.DEFINED_BY_JAVASCRIPT && zzfniVar == zzfni.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            if (zzfneVar == zzfne.DEFINED_BY_JAVASCRIPT && zzfniVar == zzfni.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            return new zzfmx(zzfnbVar, zzfneVar, zzfniVar, zzfniVar2, z10);
        }
        throw new IllegalArgumentException("Impression owner is none");
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfon.zze(jSONObject, "impressionOwner", this.zza);
        zzfon.zze(jSONObject, "mediaEventsOwner", this.zzb);
        zzfon.zze(jSONObject, "creativeType", this.zzd);
        zzfon.zze(jSONObject, "impressionType", this.zze);
        zzfon.zze(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.zzc));
        return jSONObject;
    }
}
