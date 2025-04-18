package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class zzfpc extends zzfpd {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfpc(zzfov zzfovVar, HashSet hashSet, JSONObject jSONObject, long j3) {
        super(zzfovVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j3;
    }
}
