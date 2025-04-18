package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class zzug extends zztx {
    private final HashMap zza = new HashMap();

    @Nullable
    private Handler zzb;

    @Nullable
    private zzhh zzc;

    public abstract void zzA(Object obj, zzva zzvaVar, zzcc zzccVar);

    public final void zzB(final Object obj, zzva zzvaVar) {
        zzdi.zzd(!this.zza.containsKey(obj));
        zzuz zzuzVar = new zzuz() { // from class: com.google.android.gms.internal.ads.zzud
            @Override // com.google.android.gms.internal.ads.zzuz
            public final void zza(zzva zzvaVar2, zzcc zzccVar) {
                zzug.this.zzA(obj, zzvaVar2, zzccVar);
            }
        };
        zzue zzueVar = new zzue(this, obj);
        this.zza.put(obj, new zzuf(zzvaVar, zzuzVar, zzueVar));
        Handler handler = this.zzb;
        handler.getClass();
        zzvaVar.zzh(handler, zzueVar);
        Handler handler2 = this.zzb;
        handler2.getClass();
        zzvaVar.zzg(handler2, zzueVar);
        zzvaVar.zzm(zzuzVar, this.zzc, zzb());
        if (zzu()) {
            return;
        }
        zzvaVar.zzi(zzuzVar);
    }

    @Override // com.google.android.gms.internal.ads.zztx
    @CallSuper
    public final void zzj() {
        for (zzuf zzufVar : this.zza.values()) {
            zzufVar.zza.zzi(zzufVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztx
    @CallSuper
    public final void zzl() {
        for (zzuf zzufVar : this.zza.values()) {
            zzufVar.zza.zzk(zzufVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztx
    @CallSuper
    public void zzn(@Nullable zzhh zzhhVar) {
        this.zzc = zzhhVar;
        this.zzb = zzeu.zzx(null);
    }

    @Override // com.google.android.gms.internal.ads.zztx
    @CallSuper
    public void zzq() {
        for (zzuf zzufVar : this.zza.values()) {
            zzufVar.zza.zzp(zzufVar.zzb);
            zzufVar.zza.zzs(zzufVar.zzc);
            zzufVar.zza.zzr(zzufVar.zzc);
        }
        this.zza.clear();
    }

    public int zzw(Object obj, int i2) {
        return 0;
    }

    public long zzx(Object obj, long j2, @Nullable zzuy zzuyVar) {
        return j2;
    }

    @Nullable
    public zzuy zzy(Object obj, zzuy zzuyVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzva
    @CallSuper
    public void zzz() throws IOException {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((zzuf) it.next()).zza.zzz();
        }
    }
}
