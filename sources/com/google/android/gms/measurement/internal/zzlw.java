package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;

/* loaded from: classes2.dex */
public final class zzlw implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzkx zza;
    private volatile boolean zzb;
    private volatile zzft zzc;

    public zzlw(zzkx zzkxVar) {
        this.zza = zzkxVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Preconditions.checkNotNull(this.zzc);
                this.zza.zzl().zzb(new zzlx(this, this.zzc.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.zzc = null;
                this.zzb = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        zzfw zzm = this.zza.zzu.zzm();
        if (zzm != null) {
            zzm.zzu().zza("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.zzb = false;
            this.zzc = null;
        }
        this.zza.zzl().zzb(new zzlz(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i9) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.zza.zzj().zzc().zza("Service connection suspended");
        this.zza.zzl().zzb(new zzma(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzlw zzlwVar;
        zzfl zzfnVar;
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.zzb = false;
                this.zza.zzj().zzg().zza("Service connected with null binder");
                return;
            }
            zzfl zzflVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof zzfl) {
                        zzfnVar = (zzfl) queryLocalInterface;
                    } else {
                        zzfnVar = new zzfn(iBinder);
                    }
                    zzflVar = zzfnVar;
                    this.zza.zzj().zzp().zza("Bound to IMeasurementService interface");
                } else {
                    this.zza.zzj().zzg().zza("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.zza.zzj().zzg().zza("Service connect failed to get IMeasurementService");
            }
            if (zzflVar == null) {
                this.zzb = false;
                try {
                    ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                    Context zza = this.zza.zza();
                    zzlwVar = this.zza.zza;
                    connectionTracker.unbindService(zza, zzlwVar);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.zza.zzl().zzb(new zzlv(this, zzflVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.zza.zzj().zzc().zza("Service disconnected");
        this.zza.zzl().zzb(new zzly(this, componentName));
    }

    public final void zzb() {
        if (this.zzc != null && (this.zzc.isConnected() || this.zzc.isConnecting())) {
            this.zzc.disconnect();
        }
        this.zzc = null;
    }

    public final void zza(Intent intent) {
        zzlw zzlwVar;
        this.zza.zzt();
        Context zza = this.zza.zza();
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            try {
                if (this.zzb) {
                    this.zza.zzj().zzp().zza("Connection attempt already in progress");
                    return;
                }
                this.zza.zzj().zzp().zza("Using local app measurement service");
                this.zzb = true;
                zzlwVar = this.zza.zza;
                connectionTracker.bindService(zza, intent, zzlwVar, 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza() {
        this.zza.zzt();
        Context zza = this.zza.zza();
        synchronized (this) {
            try {
                if (this.zzb) {
                    this.zza.zzj().zzp().zza("Connection attempt already in progress");
                    return;
                }
                if (this.zzc != null && (this.zzc.isConnecting() || this.zzc.isConnected())) {
                    this.zza.zzj().zzp().zza("Already awaiting connection attempt");
                    return;
                }
                this.zzc = new zzft(zza, Looper.getMainLooper(), this, this);
                this.zza.zzj().zzp().zza("Connecting to remote service");
                this.zzb = true;
                Preconditions.checkNotNull(this.zzc);
                this.zzc.checkAvailabilityAndConnect();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
