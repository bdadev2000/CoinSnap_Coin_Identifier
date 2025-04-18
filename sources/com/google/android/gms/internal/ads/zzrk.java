package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class zzrk {
    public final int zza;

    @Nullable
    public final zzur zzb;
    private final CopyOnWriteArrayList zzc;

    private zzrk(CopyOnWriteArrayList copyOnWriteArrayList, int i10, @Nullable zzur zzurVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzurVar;
    }

    @CheckResult
    public final zzrk zza(int i10, @Nullable zzur zzurVar) {
        return new zzrk(this.zzc, 0, zzurVar);
    }

    public final void zzb(Handler handler, zzrl zzrlVar) {
        this.zzc.add(new zzrj(handler, zzrlVar));
    }

    public final void zzc(zzrl zzrlVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzrj zzrjVar = (zzrj) it.next();
            if (zzrjVar.zza == zzrlVar) {
                this.zzc.remove(zzrjVar);
            }
        }
    }

    public zzrk() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
