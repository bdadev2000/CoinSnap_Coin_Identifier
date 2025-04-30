package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfok {
    private final zzfov zza;
    private final zzfov zzb;
    private final boolean zzc;
    private final zzfoo zzd;
    private final zzfor zze;

    private zzfok(zzfoo zzfooVar, zzfor zzforVar, zzfov zzfovVar, zzfov zzfovVar2, boolean z8) {
        this.zzd = zzfooVar;
        this.zze = zzforVar;
        this.zza = zzfovVar;
        if (zzfovVar2 == null) {
            this.zzb = zzfov.NONE;
        } else {
            this.zzb = zzfovVar2;
        }
        this.zzc = z8;
    }

    public static zzfok zza(zzfoo zzfooVar, zzfor zzforVar, zzfov zzfovVar, zzfov zzfovVar2, boolean z8) {
        zzfqd.zzc(zzfooVar, "CreativeType is null");
        zzfqd.zzc(zzforVar, "ImpressionType is null");
        zzfqd.zzc(zzfovVar, "Impression owner is null");
        if (zzfovVar != zzfov.NONE) {
            if (zzfooVar == zzfoo.DEFINED_BY_JAVASCRIPT && zzfovVar == zzfov.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            if (zzforVar == zzfor.DEFINED_BY_JAVASCRIPT && zzfovVar == zzfov.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            return new zzfok(zzfooVar, zzforVar, zzfovVar, zzfovVar2, z8);
        }
        throw new IllegalArgumentException("Impression owner is none");
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfpy.zze(jSONObject, "impressionOwner", this.zza);
        zzfpy.zze(jSONObject, "mediaEventsOwner", this.zzb);
        zzfpy.zze(jSONObject, "creativeType", this.zzd);
        zzfpy.zze(jSONObject, "impressionType", this.zze);
        zzfpy.zze(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.zzc));
        return jSONObject;
    }
}
