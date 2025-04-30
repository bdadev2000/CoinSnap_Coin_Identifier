package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfwj extends zzfww {
    final /* synthetic */ zzfwp zza;
    final /* synthetic */ zzfws zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfwn zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwj(zzfwn zzfwnVar, TaskCompletionSource taskCompletionSource, zzfwp zzfwpVar, zzfws zzfwsVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zza = zzfwpVar;
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
        String str3;
        try {
            ?? zze = this.zzd.zza.zze();
            if (zze == 0) {
                return;
            }
            zzfwn zzfwnVar = this.zzd;
            str2 = zzfwnVar.zzd;
            zzfwp zzfwpVar = this.zza;
            str3 = zzfwnVar.zzd;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", zzfwpVar.zzf());
            bundle.putString("adFieldEnifd", zzfwpVar.zzg());
            bundle.putInt("layoutGravity", zzfwpVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzfwpVar.zza());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", zzfwpVar.zze());
            bundle.putString("deeplinkUrl", null);
            bundle.putBoolean("stableSessionToken", true);
            bundle.putString("callerPackage", str3);
            if (zzfwpVar.zzh() != null) {
                bundle.putString("appId", zzfwpVar.zzh());
            }
            zze.zzf(str2, bundle, new zzfwm(this.zzd, this.zzb));
        } catch (RemoteException e4) {
            zzfwvVar = zzfwn.zzb;
            str = this.zzd.zzd;
            zzfwvVar.zzb(e4, "show overlay display from: %s", str);
            this.zzc.trySetException(new RuntimeException(e4));
        }
    }
}
