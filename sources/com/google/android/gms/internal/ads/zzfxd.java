package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzfxd {
    private final zzfxc zza;

    private zzfxd(zzfxc zzfxcVar) {
        int i10 = zzfwe.zzb;
        this.zza = zzfxcVar;
    }

    public static zzfxd zza(int i10) {
        return new zzfxd(new zzfwz(4000));
    }

    public static zzfxd zzb(zzfwf zzfwfVar) {
        return new zzfxd(new zzfwx(zzfwfVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator zzf(CharSequence charSequence) {
        return this.zza.zza(this, charSequence);
    }

    public final Iterable zzc(CharSequence charSequence) {
        charSequence.getClass();
        return new zzfxa(this, charSequence);
    }

    public final List zze(CharSequence charSequence) {
        charSequence.getClass();
        Iterator zzf = zzf(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzf.hasNext()) {
            arrayList.add((String) zzf.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
