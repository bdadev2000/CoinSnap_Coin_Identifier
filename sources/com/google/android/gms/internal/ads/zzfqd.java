package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzfqd {
    private final zzfpg zza;
    private final ArrayList zzb;

    public zzfqd(zzfpg zzfpgVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.zzb = arrayList;
        this.zza = zzfpgVar;
        arrayList.add(str);
    }

    public final zzfpg zza() {
        return this.zza;
    }

    public final ArrayList zzb() {
        return this.zzb;
    }

    public final void zzc(String str) {
        this.zzb.add(str);
    }
}
