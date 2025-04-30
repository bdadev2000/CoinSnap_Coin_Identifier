package com.google.android.gms.internal.ads;

import android.os.IBinder;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class zzfxc extends zzfww {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzfxf zzb;

    public zzfxc(zzfxf zzfxfVar, IBinder iBinder) {
        this.zza = iBinder;
        this.zzb = zzfxfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfww
    public final void zza() {
        List list;
        List list2;
        this.zzb.zza.zzn = zzfvn.zzb(this.zza);
        zzfxg.zzq(this.zzb.zza);
        this.zzb.zza.zzh = false;
        list = this.zzb.zza.zze;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.zzb.zza.zze;
        list2.clear();
    }
}
