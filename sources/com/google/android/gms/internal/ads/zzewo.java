package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzewo implements zzevz {
    private final zzges zza;
    private final Context zzb;

    public zzewo(zzges zzgesVar, Context context) {
        this.zza = zzgesVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 39;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzewn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzewo.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzewm zzc() throws Exception {
        boolean z10;
        int i10;
        TelephonyManager telephonyManager = (TelephonyManager) this.zzb.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzv.zzq();
        int i11 = -1;
        if (com.google.android.gms.ads.internal.util.zzs.zzA(this.zzb, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.zzb.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i10 = type;
                i11 = ordinal;
            } else {
                i10 = -1;
            }
            z10 = connectivityManager.isActiveNetworkMetered();
        } else {
            z10 = false;
            i10 = -2;
        }
        return new zzewm(networkOperator, i10, com.google.android.gms.ads.internal.zzv.zzr().zzm(this.zzb), phoneType, z10, i11);
    }
}
