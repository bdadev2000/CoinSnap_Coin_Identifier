package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbub;
import com.google.android.gms.internal.ads.zzfng;
import com.google.android.gms.internal.ads.zzgfk;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzan implements zzgfk {
    final /* synthetic */ zzbub zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzap zzc;

    public zzan(zzap zzapVar, zzbub zzbubVar, boolean z2) {
        this.zza = zzbubVar;
        this.zzb = z2;
        this.zzc = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        try {
            this.zza.zze("Internal error: " + th.getMessage());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        boolean z2;
        String str;
        Uri zzZ;
        zzfng zzfngVar;
        zzfng zzfngVar2;
        List<Uri> list = (List) obj;
        try {
            zzap.zzH(this.zzc, list);
            this.zza.zzf(list);
            z2 = this.zzc.zzs;
            if (!z2 && !this.zzb) {
                return;
            }
            for (Uri uri : list) {
                if (this.zzc.zzO(uri)) {
                    str = this.zzc.zzA;
                    zzZ = zzap.zzZ(uri, str, AppEventsConstants.EVENT_PARAM_VALUE_YES);
                    zzfngVar = this.zzc.zzq;
                    zzfngVar.zzc(zzZ.toString(), null);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhf)).booleanValue()) {
                        zzfngVar2 = this.zzc.zzq;
                        zzfngVar2.zzc(uri.toString(), null);
                    }
                }
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
        }
    }
}
