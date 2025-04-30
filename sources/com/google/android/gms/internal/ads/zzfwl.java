package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfwl extends zzfww {
    final /* synthetic */ zzfwu zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzfws zzc;
    final /* synthetic */ TaskCompletionSource zzd;
    final /* synthetic */ zzfwn zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwl(zzfwn zzfwnVar, TaskCompletionSource taskCompletionSource, zzfwu zzfwuVar, int i9, zzfws zzfwsVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zza = zzfwuVar;
        this.zzb = i9;
        this.zzc = zzfwsVar;
        this.zzd = taskCompletionSource2;
        this.zze = zzfwnVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzfvo, android.os.IInterface] */
    @Override // com.google.android.gms.internal.ads.zzfww
    public final void zza() {
        zzfwv zzfwvVar;
        String str;
        String str2;
        try {
            ?? zze = this.zze.zza.zze();
            if (zze == 0) {
                return;
            }
            zzfwu zzfwuVar = this.zza;
            str2 = this.zze.zzd;
            int i9 = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfwuVar.zzb());
            bundle.putInt("displayMode", i9);
            bundle.putString("callerPackage", str2);
            bundle.putString("appId", zzfwuVar.zza());
            zze.zzg(bundle, new zzfwm(this.zze, this.zzc));
        } catch (RemoteException e4) {
            int i10 = this.zzb;
            zzfwvVar = zzfwn.zzb;
            Integer valueOf = Integer.valueOf(i10);
            str = this.zze.zzd;
            zzfwvVar.zzb(e4, "switchDisplayMode overlay display to %d from: %s", valueOf, str);
            this.zzd.trySetException(new RuntimeException(e4));
        }
    }
}
