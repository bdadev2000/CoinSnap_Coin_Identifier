package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbma;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class zzex extends zzbma {
    final /* synthetic */ zzey zza;

    public /* synthetic */ zzex(zzey zzeyVar, zzew zzewVar) {
        this.zza = zzeyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmb
    public final void zzb(List list) throws RemoteException {
        int i2;
        ArrayList arrayList;
        synchronized (zzey.zzh(this.zza)) {
            zzey.zzm(this.zza, false);
            zzey.zzl(this.zza, true);
            arrayList = new ArrayList(zzey.zzj(this.zza));
            zzey.zzj(this.zza).clear();
        }
        InitializationStatus zzd = zzey.zzd(list);
        int size = arrayList.size();
        for (i2 = 0; i2 < size; i2++) {
            ((OnInitializationCompleteListener) arrayList.get(i2)).onInitializationComplete(zzd);
        }
    }
}
