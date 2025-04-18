package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzblv;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzev extends zzblv {
    final /* synthetic */ zzex zza;

    public /* synthetic */ zzev(zzex zzexVar, zzew zzewVar) {
        this.zza = zzexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final void zzb(List list) throws RemoteException {
        Object obj;
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        InitializationStatus zzA;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzg = false;
            this.zza.zzh = true;
            arrayList2 = this.zza.zzf;
            arrayList = new ArrayList(arrayList2);
            arrayList3 = this.zza.zzf;
            arrayList3.clear();
        }
        zzA = zzex.zzA(list);
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((OnInitializationCompleteListener) arrayList.get(i10)).onInitializationComplete(zzA);
        }
    }
}
