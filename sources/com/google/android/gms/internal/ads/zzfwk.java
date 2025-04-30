package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfwk extends zzfww {
    final /* synthetic */ zzfwe zza;
    final /* synthetic */ zzfws zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfwn zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwk(zzfwn zzfwnVar, TaskCompletionSource taskCompletionSource, zzfwe zzfweVar, zzfws zzfwsVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zza = zzfweVar;
        this.zzb = zzfwsVar;
        this.zzc = taskCompletionSource2;
        this.zzd = zzfwnVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzfvo, android.os.IInterface] */
    @Override // com.google.android.gms.internal.ads.zzfww
    public final void zza() {
        zzfwv zzfwvVar;
        String str;
        String str2;
        try {
            ?? zze = this.zzd.zza.zze();
            if (zze == 0) {
                return;
            }
            zzfwe zzfweVar = this.zza;
            str2 = this.zzd.zzd;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfweVar.zzb());
            bundle.putString("callerPackage", str2);
            bundle.putString("appId", zzfweVar.zza());
            zze.zze(bundle, new zzfwm(this.zzd, this.zzb));
        } catch (RemoteException e4) {
            zzfwn zzfwnVar = this.zzd;
            zzfwvVar = zzfwn.zzb;
            str = zzfwnVar.zzd;
            zzfwvVar.zzb(e4, "dismiss overlay display from: %s", str);
            this.zzc.trySetException(new RuntimeException(e4));
        }
    }
}
