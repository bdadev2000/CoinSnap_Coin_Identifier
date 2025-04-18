package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbtv;
import com.google.android.gms.internal.ads.zzflr;
import com.google.android.gms.internal.ads.zzgee;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzam implements zzgee {
    final /* synthetic */ zzbtv zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzap zzc;

    public zzam(zzap zzapVar, zzbtv zzbtvVar, boolean z10) {
        this.zza = zzbtvVar;
        this.zzb = z10;
        this.zzc = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        try {
            this.zza.zze("Internal error: " + th2.getMessage());
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        boolean z10;
        String str;
        Uri zzZ;
        zzflr zzflrVar;
        zzflr zzflrVar2;
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.zza.zzf(arrayList);
            z10 = this.zzc.zzr;
            if (z10 || this.zzb) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    if (this.zzc.zzP(uri)) {
                        str = this.zzc.zzA;
                        zzZ = zzap.zzZ(uri, str, "1");
                        zzflrVar = this.zzc.zzq;
                        zzflrVar.zzc(zzZ.toString(), null);
                    } else {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhh)).booleanValue()) {
                            zzflrVar2 = this.zzc.zzq;
                            zzflrVar2.zzc(uri.toString(), null);
                        }
                    }
                }
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
        }
    }
}
