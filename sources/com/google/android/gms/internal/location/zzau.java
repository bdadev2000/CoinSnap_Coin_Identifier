package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzau implements FusedLocationProviderApi {
    public static /* bridge */ /* synthetic */ TaskCompletionSource zza(final BaseImplementation.ResultHolder resultHolder) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzah
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                BaseImplementation.ResultHolder resultHolder2 = BaseImplementation.ResultHolder.this;
                if (task.isSuccessful()) {
                    resultHolder2.setResult(Status.RESULT_SUCCESS);
                    return;
                }
                if (task.isCanceled()) {
                    resultHolder2.setFailedResult(Status.RESULT_CANCELED);
                    return;
                }
                Exception exception = task.getException();
                if (exception instanceof ApiException) {
                    resultHolder2.setFailedResult(((ApiException) exception).getStatus());
                } else {
                    resultHolder2.setFailedResult(Status.RESULT_INTERNAL_ERROR);
                }
            }
        });
        return taskCompletionSource;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult<Status> flushLocations(GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new zzaj(this, googleApiClient));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final Location getLastLocation(GoogleApiClient googleApiClient) {
        boolean z10;
        boolean await;
        boolean z11 = false;
        if (googleApiClient != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "GoogleApiClient parameter is required.");
        zzda zzdaVar = (zzda) googleApiClient.getClient(zzbp.zza);
        final AtomicReference atomicReference = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        try {
            zzdaVar.zzt(new LastLocationRequest.Builder().build(), taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzai
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    AtomicReference atomicReference2 = atomicReference;
                    CountDownLatch countDownLatch2 = countDownLatch;
                    if (task.isSuccessful()) {
                        atomicReference2.set((Location) task.getResult());
                    }
                    countDownLatch2.countDown();
                }
            });
            try {
                long nanos = TimeUnit.SECONDS.toNanos(30L);
                long nanoTime = System.nanoTime() + nanos;
                while (true) {
                    try {
                        try {
                            await = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            z11 = true;
                            if (z11) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        nanos = nanoTime - System.nanoTime();
                        z11 = true;
                    }
                }
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                if (!await) {
                    return null;
                }
                return (Location) atomicReference.get();
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final LocationAvailability getLocationAvailability(GoogleApiClient googleApiClient) {
        boolean z10;
        if (googleApiClient != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "GoogleApiClient parameter is required.");
        try {
            return ((zzda) googleApiClient.getClient(zzbp.zza)).zzp();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult<Status> removeLocationUpdates(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return googleApiClient.execute(new zzao(this, googleApiClient, pendingIntent));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return googleApiClient.execute(new zzam(this, googleApiClient, pendingIntent, locationRequest));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult<Status> setMockLocation(GoogleApiClient googleApiClient, Location location) {
        return googleApiClient.execute(new zzar(this, googleApiClient, location));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult<Status> setMockMode(GoogleApiClient googleApiClient, boolean z10) {
        return googleApiClient.execute(new zzaq(this, googleApiClient, z10));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult<Status> removeLocationUpdates(GoogleApiClient googleApiClient, LocationCallback locationCallback) {
        return googleApiClient.execute(new zzap(this, googleApiClient, locationCallback));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return googleApiClient.execute(new zzal(this, googleApiClient, ListenerHolders.createListenerHolder(locationCallback, looper, "LocationCallback"), locationRequest));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult<Status> removeLocationUpdates(GoogleApiClient googleApiClient, LocationListener locationListener) {
        return googleApiClient.execute(new zzan(this, googleApiClient, locationListener));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        Looper myLooper = Looper.myLooper();
        Preconditions.checkNotNull(myLooper, "invalid null looper");
        return googleApiClient.execute(new zzak(this, googleApiClient, ListenerHolders.createListenerHolder(locationListener, myLooper, "LocationListener"), locationRequest));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return googleApiClient.execute(new zzak(this, googleApiClient, ListenerHolders.createListenerHolder(locationListener, looper, "LocationListener"), locationRequest));
    }
}
