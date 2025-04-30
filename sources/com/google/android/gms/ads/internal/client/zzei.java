package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbnt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class zzei extends zzbnt {
    final /* synthetic */ zzej zza;

    public /* synthetic */ zzei(zzej zzejVar, zzeh zzehVar) {
        this.zza = zzejVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final void zzb(List list) throws RemoteException {
        int i9;
        ArrayList arrayList;
        synchronized (zzej.zzg(this.zza)) {
            zzej.zzk(this.zza, false);
            zzej.zzj(this.zza, true);
            arrayList = new ArrayList(zzej.zzi(this.zza));
            zzej.zzi(this.zza).clear();
        }
        InitializationStatus zzd = zzej.zzd(list);
        int size = arrayList.size();
        for (i9 = 0; i9 < size; i9++) {
            ((OnInitializationCompleteListener) arrayList.get(i9)).onInitializationComplete(zzd);
        }
    }
}
