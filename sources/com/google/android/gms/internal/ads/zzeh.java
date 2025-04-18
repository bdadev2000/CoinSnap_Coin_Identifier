package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzeh extends BroadcastReceiver {
    final /* synthetic */ zzei zza;

    public /* synthetic */ zzeh(zzei zzeiVar, zzeg zzegVar) {
        this.zza = zzeiVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Executor mainExecutor;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i2 = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 4 && type != 5) {
                                if (type != 6) {
                                    i2 = type != 9 ? 8 : 7;
                                }
                                i2 = 5;
                            }
                        }
                        i2 = 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i2 = 3;
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
                            i2 = 4;
                            break;
                        case 13:
                            i2 = 5;
                            break;
                        case 16:
                        case 19:
                        default:
                            i2 = 6;
                            break;
                        case 18:
                            i2 = 2;
                            break;
                        case 20:
                            if (zzeu.zza >= 29) {
                                i2 = 9;
                                break;
                            }
                            break;
                    }
                } else {
                    i2 = 1;
                }
            } catch (SecurityException unused) {
            }
        }
        if (zzeu.zza < 31 || i2 != 5) {
            zzei.zzc(this.zza, i2);
            return;
        }
        zzei zzeiVar = this.zza;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            zzef zzefVar = new zzef(zzeiVar);
            mainExecutor = context.getMainExecutor();
            telephonyManager.registerTelephonyCallback(mainExecutor, zzefVar);
            telephonyManager.unregisterTelephonyCallback(zzefVar);
        } catch (RuntimeException unused2) {
            zzei.zzc(zzeiVar, 5);
        }
    }
}
