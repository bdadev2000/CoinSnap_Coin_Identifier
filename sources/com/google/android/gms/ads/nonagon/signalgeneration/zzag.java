package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbvv;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzgfp;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzag implements zzgfp {
    final /* synthetic */ zzbvv zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzaj zzc;

    public zzag(zzaj zzajVar, zzbvv zzbvvVar, boolean z8) {
        this.zza = zzbvvVar;
        this.zzb = z8;
        this.zzc = zzajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        try {
            this.zza.zze("Internal error: " + th.getMessage());
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        boolean z8;
        String str;
        Uri zzZ;
        zzfoe zzfoeVar;
        zzfoe zzfoeVar2;
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.zza.zzf(arrayList);
            z8 = this.zzc.zzr;
            if (!z8 && !this.zzb) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (this.zzc.zzP(uri)) {
                    str = this.zzc.zzA;
                    zzZ = zzaj.zzZ(uri, str, "1");
                    zzfoeVar = this.zzc.zzq;
                    zzfoeVar.zzc(zzZ.toString(), null);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhG)).booleanValue()) {
                        zzfoeVar2 = this.zzc.zzq;
                        zzfoeVar2.zzc(uri.toString(), null);
                    }
                }
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
        }
    }
}
