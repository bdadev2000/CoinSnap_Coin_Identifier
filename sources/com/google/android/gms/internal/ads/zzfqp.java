package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class zzfqp extends zzfqq {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfqp(zzfqi zzfqiVar, HashSet hashSet, JSONObject jSONObject, long j7) {
        super(zzfqiVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j7;
    }
}
