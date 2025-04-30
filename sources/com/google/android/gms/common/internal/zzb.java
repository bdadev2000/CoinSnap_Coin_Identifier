package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.mbridge.msdk.foundation.entity.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzb extends com.google.android.gms.internal.common.zzi {
    final /* synthetic */ BaseGmsClient zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        this.zza = baseGmsClient;
    }

    private static final void zza(Message message) {
        zzc zzcVar = (zzc) message.obj;
        zzcVar.zzc();
        zzcVar.zzg();
    }

    private static final boolean zzb(Message message) {
        int i9 = message.what;
        if (i9 == 2 || i9 == 1 || i9 == 7) {
            return true;
        }
        return false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks;
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks2;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        ConnectionResult connectionResult3;
        ConnectionResult connectionResult4;
        boolean z8;
        if (this.zza.zzd.get() != message.arg1) {
            if (zzb(message)) {
                zza(message);
                return;
            }
            return;
        }
        int i9 = message.what;
        if ((i9 != 1 && i9 != 7 && ((i9 != 4 || this.zza.enableLocalFallback()) && message.what != 5)) || this.zza.isConnecting()) {
            int i10 = message.what;
            PendingIntent pendingIntent = null;
            if (i10 == 4) {
                this.zza.zzB = new ConnectionResult(message.arg2);
                if (BaseGmsClient.zzo(this.zza)) {
                    BaseGmsClient baseGmsClient = this.zza;
                    z8 = baseGmsClient.zzC;
                    if (!z8) {
                        baseGmsClient.zzp(3, null);
                        return;
                    }
                }
                BaseGmsClient baseGmsClient2 = this.zza;
                connectionResult3 = baseGmsClient2.zzB;
                if (connectionResult3 != null) {
                    connectionResult4 = baseGmsClient2.zzB;
                } else {
                    connectionResult4 = new ConnectionResult(8);
                }
                this.zza.zzc.onReportServiceBinding(connectionResult4);
                this.zza.onConnectionFailed(connectionResult4);
                return;
            }
            if (i10 == 5) {
                BaseGmsClient baseGmsClient3 = this.zza;
                connectionResult = baseGmsClient3.zzB;
                if (connectionResult != null) {
                    connectionResult2 = baseGmsClient3.zzB;
                } else {
                    connectionResult2 = new ConnectionResult(8);
                }
                this.zza.zzc.onReportServiceBinding(connectionResult2);
                this.zza.onConnectionFailed(connectionResult2);
                return;
            }
            if (i10 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                ConnectionResult connectionResult5 = new ConnectionResult(message.arg2, pendingIntent);
                this.zza.zzc.onReportServiceBinding(connectionResult5);
                this.zza.onConnectionFailed(connectionResult5);
                return;
            }
            if (i10 == 6) {
                this.zza.zzp(5, null);
                BaseGmsClient baseGmsClient4 = this.zza;
                baseConnectionCallbacks = baseGmsClient4.zzw;
                if (baseConnectionCallbacks != null) {
                    baseConnectionCallbacks2 = baseGmsClient4.zzw;
                    baseConnectionCallbacks2.onConnectionSuspended(message.arg2);
                }
                this.zza.onConnectionSuspended(message.arg2);
                BaseGmsClient.zzn(this.zza, 5, 1, null);
                return;
            }
            if (i10 == 2 && !this.zza.isConnected()) {
                zza(message);
                return;
            } else if (zzb(message)) {
                ((zzc) message.obj).zze();
                return;
            } else {
                Log.wtf("GmsClient", o.h(message.what, "Don't know how to handle message: "), new Exception());
                return;
            }
        }
        zza(message);
    }
}
