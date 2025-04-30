package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class zzuw extends zzuo {
    private final HashMap zza = new HashMap();

    @Nullable
    private Handler zzb;

    @Nullable
    private zzie zzc;

    public abstract void zzA(Object obj, zzvq zzvqVar, zzdc zzdcVar);

    public final void zzB(final Object obj, zzvq zzvqVar) {
        zzeq.zzd(!this.zza.containsKey(obj));
        zzvp zzvpVar = new zzvp() { // from class: com.google.android.gms.internal.ads.zzut
            @Override // com.google.android.gms.internal.ads.zzvp
            public final void zza(zzvq zzvqVar2, zzdc zzdcVar) {
                zzuw.this.zzA(obj, zzvqVar2, zzdcVar);
            }
        };
        zzuu zzuuVar = new zzuu(this, obj);
        this.zza.put(obj, new zzuv(zzvqVar, zzvpVar, zzuuVar));
        Handler handler = this.zzb;
        handler.getClass();
        zzvqVar.zzh(handler, zzuuVar);
        Handler handler2 = this.zzb;
        handler2.getClass();
        zzvqVar.zzg(handler2, zzuuVar);
        zzvqVar.zzm(zzvpVar, this.zzc, zzb());
        if (!zzu()) {
            zzvqVar.zzi(zzvpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    @CallSuper
    public final void zzj() {
        for (zzuv zzuvVar : this.zza.values()) {
            zzuvVar.zza.zzi(zzuvVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    @CallSuper
    public final void zzl() {
        for (zzuv zzuvVar : this.zza.values()) {
            zzuvVar.zza.zzk(zzuvVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    @CallSuper
    public void zzn(@Nullable zzie zzieVar) {
        this.zzc = zzieVar;
        this.zzb = zzgd.zzx(null);
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    @CallSuper
    public void zzq() {
        for (zzuv zzuvVar : this.zza.values()) {
            zzuvVar.zza.zzp(zzuvVar.zzb);
            zzuvVar.zza.zzs(zzuvVar.zzc);
            zzuvVar.zza.zzr(zzuvVar.zzc);
        }
        this.zza.clear();
    }

    public int zzw(Object obj, int i9) {
        return 0;
    }

    public long zzx(Object obj, long j7, @Nullable zzvo zzvoVar) {
        return j7;
    }

    @Nullable
    public zzvo zzy(Object obj, zzvo zzvoVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    @CallSuper
    public void zzz() throws IOException {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((zzuv) it.next()).zza.zzz();
        }
    }
}
