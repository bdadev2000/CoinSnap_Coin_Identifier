package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfr extends BroadcastReceiver {
    final /* synthetic */ zzfs zza;

    public /* synthetic */ zzfr(zzfs zzfsVar, zzfq zzfqVar) {
        this.zza = zzfsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Executor mainExecutor;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i9 = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    i9 = 1;
                } else {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 4 && type != 5) {
                                if (type != 6) {
                                    i9 = type != 9 ? 8 : 7;
                                }
                                i9 = 5;
                            }
                        }
                        i9 = 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i9 = 3;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            i9 = 4;
                            break;
                        case 13:
                            i9 = 5;
                            break;
                        case 16:
                        case 19:
                        default:
                            i9 = 6;
                            break;
                        case 18:
                            i9 = 2;
                            break;
                        case 20:
                            if (zzgd.zza >= 29) {
                                i9 = 9;
                                break;
                            }
                            break;
                    }
                }
            } catch (SecurityException unused) {
            }
        }
        if (zzgd.zza >= 31 && i9 == 5) {
            zzfs zzfsVar = this.zza;
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                telephonyManager.getClass();
                zzfp zzfpVar = new zzfp(zzfsVar);
                mainExecutor = context.getMainExecutor();
                telephonyManager.registerTelephonyCallback(mainExecutor, zzfpVar);
                telephonyManager.unregisterTelephonyCallback(zzfpVar);
                return;
            } catch (RuntimeException unused2) {
                zzfs.zzc(zzfsVar, 5);
                return;
            }
        }
        zzfs.zzc(this.zza, i9);
    }
}
