package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzfym {
    private final zzfyl zza;

    private zzfym(zzfyl zzfylVar) {
        int i2 = zzfxm.zzb;
        this.zza = zzfylVar;
    }

    public static zzfym zza(int i2) {
        return new zzfym(new zzfyi(4000));
    }

    public static zzfym zzb(zzfxn zzfxnVar) {
        return new zzfym(new zzfyg(zzfxnVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator zzf(CharSequence charSequence) {
        return this.zza.zza(this, charSequence);
    }

    public final Iterable zzc(CharSequence charSequence) {
        charSequence.getClass();
        return new zzfyj(this, charSequence);
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
