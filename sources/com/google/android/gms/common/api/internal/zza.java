package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* loaded from: classes2.dex */
final class zza implements Runnable {
    final /* synthetic */ LifecycleCallback zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzb zzc;

    public zza(zzb zzbVar, LifecycleCallback lifecycleCallback, String str) {
        this.zzc = zzbVar;
        this.zza = lifecycleCallback;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        zzb zzbVar = this.zzc;
        i9 = zzbVar.zzc;
        if (i9 > 0) {
            LifecycleCallback lifecycleCallback = this.zza;
            bundle = zzbVar.zzd;
            if (bundle != null) {
                String str = this.zzb;
                bundle3 = zzbVar.zzd;
                bundle2 = bundle3.getBundle(str);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
        i10 = this.zzc.zzc;
        if (i10 >= 2) {
            this.zza.onStart();
        }
        i11 = this.zzc.zzc;
        if (i11 >= 3) {
            this.zza.onResume();
        }
        i12 = this.zzc.zzc;
        if (i12 >= 4) {
            this.zza.onStop();
        }
        i13 = this.zzc.zzc;
        if (i13 >= 5) {
            this.zza.onDestroy();
        }
    }
}
