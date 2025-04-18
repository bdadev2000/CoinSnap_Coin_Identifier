package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class zzfqm extends zzfqn {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfqm(zzfqf zzfqfVar, HashSet hashSet, JSONObject jSONObject, long j2) {
        super(zzfqfVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j2;
    }
}
