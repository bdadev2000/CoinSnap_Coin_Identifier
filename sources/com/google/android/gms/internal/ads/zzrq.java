package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class zzrq {
    public final int zza;

    @Nullable
    public final zzuy zzb;
    private final CopyOnWriteArrayList zzc;

    private zzrq(CopyOnWriteArrayList copyOnWriteArrayList, int i2, @Nullable zzuy zzuyVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzuyVar;
    }

    @CheckResult
    public final zzrq zza(int i2, @Nullable zzuy zzuyVar) {
        return new zzrq(this.zzc, 0, zzuyVar);
    }

    public final void zzb(Handler handler, zzrr zzrrVar) {
        this.zzc.add(new zzrp(handler, zzrrVar));
    }

    public final void zzc(zzrr zzrrVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzrp zzrpVar = (zzrp) it.next();
            if (zzrpVar.zza == zzrrVar) {
                this.zzc.remove(zzrpVar);
            }
        }
    }

    public zzrq() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
