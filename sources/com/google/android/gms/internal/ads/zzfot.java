package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzfot {
    private final zzfnu zza;
    private final ArrayList zzb;

    public zzfot(zzfnu zzfnuVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.zzb = arrayList;
        this.zza = zzfnuVar;
        arrayList.add(str);
    }

    public final zzfnu zza() {
        return this.zza;
    }

    public final ArrayList zzb() {
        return this.zzb;
    }

    public final void zzc(String str) {
        this.zzb.add(str);
    }
}
