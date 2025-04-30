package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzfqg {
    private final zzfph zza;
    private final ArrayList zzb;

    public zzfqg(zzfph zzfphVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.zzb = arrayList;
        this.zza = zzfphVar;
        arrayList.add(str);
    }

    public final zzfph zza() {
        return this.zza;
    }

    public final ArrayList zzb() {
        return this.zzb;
    }

    public final void zzc(String str) {
        this.zzb.add(str);
    }
}
