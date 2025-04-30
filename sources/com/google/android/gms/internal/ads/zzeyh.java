package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzeyh implements zzexw {
    private final zzgge zza;
    private final Context zzb;

    public zzeyh(zzgge zzggeVar, Context context) {
        this.zza = zzggeVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 39;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeyg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeyh.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeyf zzc() throws Exception {
        boolean z8;
        int i9;
        TelephonyManager telephonyManager = (TelephonyManager) this.zzb.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzu.zzp();
        int i10 = -1;
        if (com.google.android.gms.ads.internal.util.zzt.zzA(this.zzb, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.zzb.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i9 = type;
                i10 = ordinal;
            } else {
                i9 = -1;
            }
            z8 = connectivityManager.isActiveNetworkMetered();
        } else {
            z8 = false;
            i9 = -2;
        }
        return new zzeyf(networkOperator, i9, com.google.android.gms.ads.internal.zzu.zzq().zzm(this.zzb), phoneType, z8, i10);
    }
}
