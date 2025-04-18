package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzexw implements zzexh {
    private final zzgfz zza;
    private final Context zzb;

    public zzexw(zzgfz zzgfzVar, Context context) {
        this.zza = zzgfzVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 39;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzexv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzexw.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzexu zzc() throws Exception {
        boolean z2;
        int i2;
        TelephonyManager telephonyManager = (TelephonyManager) this.zzb.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzu.zzp();
        int i3 = -1;
        if (com.google.android.gms.ads.internal.util.zzt.zzA(this.zzb, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.zzb.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i2 = type;
                i3 = ordinal;
            } else {
                i2 = -1;
            }
            z2 = connectivityManager.isActiveNetworkMetered();
        } else {
            z2 = false;
            i2 = -2;
        }
        return new zzexu(networkOperator, i2, com.google.android.gms.ads.internal.zzu.zzq().zzm(this.zzb), phoneType, z2, i3);
    }
}
