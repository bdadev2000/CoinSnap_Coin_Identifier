package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
final class zzerb implements zzexw {
    private final Set zza;

    public zzerb(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        final ArrayList arrayList = new ArrayList();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzgft.zzh(new zzexv() { // from class: com.google.android.gms.internal.ads.zzera
            @Override // com.google.android.gms.internal.ads.zzexv
            public final void zzj(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}
