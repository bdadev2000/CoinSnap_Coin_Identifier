package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class zzso {
    public final int zza;

    @Nullable
    public final zzvo zzb;
    private final CopyOnWriteArrayList zzc;

    private zzso(CopyOnWriteArrayList copyOnWriteArrayList, int i9, @Nullable zzvo zzvoVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzvoVar;
    }

    @CheckResult
    public final zzso zza(int i9, @Nullable zzvo zzvoVar) {
        return new zzso(this.zzc, 0, zzvoVar);
    }

    public final void zzb(Handler handler, zzsp zzspVar) {
        this.zzc.add(new zzsn(handler, zzspVar));
    }

    public final void zzc(zzsp zzspVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsn zzsnVar = (zzsn) it.next();
            if (zzsnVar.zzb == zzspVar) {
                this.zzc.remove(zzsnVar);
            }
        }
    }

    public zzso() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
