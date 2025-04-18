package com.google.android.gms.ads.identifier;

import a4.j;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

@KeepForSdk
/* loaded from: classes3.dex */
public class AdvertisingIdClient {

    @Nullable
    BlockingServiceConnection zza;

    @Nullable
    zzf zzb;
    boolean zzc;
    final Object zzd;

    @Nullable
    zzb zze;
    final long zzf;
    private final Context zzg;

    @KeepForSdkWithMembers
    /* loaded from: classes3.dex */
    public static final class Info {

        @Nullable
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(@Nullable String str, boolean z10) {
            this.zza = str;
            this.zzb = z10;
        }

        @Nullable
        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        @NonNull
        public String toString() {
            String str = this.zza;
            boolean z10 = this.zzb;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }
    }

    @KeepForSdk
    public AdvertisingIdClient(@NonNull Context context) {
        this(context, 30000L, false, false);
    }

    @NonNull
    @KeepForSdk
    public static Info getAdvertisingIdInfo(@NonNull Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zzb(false);
            Info zzd = advertisingIdClient.zzd(-1);
            advertisingIdClient.zzc(zzd, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return zzd;
        } finally {
        }
    }

    @KeepForSdk
    public static boolean getIsAdIdFakeForDebugLogging(@NonNull Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        boolean zzd;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzb(false);
            Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                if (!advertisingIdClient.zzc) {
                    synchronized (advertisingIdClient.zzd) {
                        zzb zzbVar = advertisingIdClient.zze;
                        if (zzbVar == null || !zzbVar.zzb) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        advertisingIdClient.zzb(false);
                        if (!advertisingIdClient.zzc) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e2) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                    }
                }
                Preconditions.checkNotNull(advertisingIdClient.zza);
                Preconditions.checkNotNull(advertisingIdClient.zzb);
                try {
                    zzd = advertisingIdClient.zzb.zzd();
                } catch (RemoteException e10) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                    throw new IOException("Remote exception");
                }
            }
            advertisingIdClient.zze();
            return zzd;
        } finally {
            advertisingIdClient.zza();
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static void setShouldSkipGmsCoreVersionCheck(boolean z10) {
    }

    private final Info zzd(int i10) throws IOException {
        Info info;
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.zzc) {
                synchronized (this.zzd) {
                    zzb zzbVar = this.zze;
                    if (zzbVar == null || !zzbVar.zzb) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    zzb(false);
                    if (!this.zzc) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            Preconditions.checkNotNull(this.zza);
            Preconditions.checkNotNull(this.zzb);
            try {
                info = new Info(this.zzb.zzc(), this.zzb.zze(true));
            } catch (RemoteException e10) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                throw new IOException("Remote exception");
            }
        }
        zze();
        return info;
    }

    private final void zze() {
        synchronized (this.zzd) {
            zzb zzbVar = this.zze;
            if (zzbVar != null) {
                zzbVar.zza.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j3 = this.zzf;
            if (j3 > 0) {
                this.zze = new zzb(this, j3);
            }
        }
    }

    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    @NonNull
    @KeepForSdk
    public Info getInfo() throws IOException {
        return zzd(-1);
    }

    @KeepForSdk
    public void start() throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        zzb(true);
    }

    public final void zza() {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzg != null && this.zza != null) {
                try {
                    if (this.zzc) {
                        ConnectionTracker.getInstance().unbindService(this.zzg, this.zza);
                    }
                } catch (Throwable th2) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th2);
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            }
        }
    }

    @VisibleForTesting
    public final void zzb(boolean z10) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzc) {
                zza();
            }
            Context context = this.zzg;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                if (isGooglePlayServicesAvailable != 0 && isGooglePlayServicesAvailable != 2) {
                    throw new IOException("Google Play services not available");
                }
                BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (ConnectionTracker.getInstance().bindService(context, intent, blockingServiceConnection, 1)) {
                        this.zza = blockingServiceConnection;
                        try {
                            this.zzb = zze.zza(blockingServiceConnection.getServiceWithTimeout(10000L, TimeUnit.MILLISECONDS));
                            this.zzc = true;
                            if (z10) {
                                zze();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th2) {
                            throw new IOException(th2);
                        }
                    } else {
                        throw new IOException("Connection failure");
                    }
                } finally {
                    IOException iOException = new IOException(th2);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new GooglePlayServicesNotAvailableException(9);
            }
        }
    }

    @VisibleForTesting
    public final boolean zzc(@Nullable Info info, boolean z10, float f10, long j3, String str, @Nullable Throwable th2) {
        if (Math.random() <= 0.0d) {
            String str2 = "1";
            HashMap q10 = j.q("app_context", "1");
            if (info != null) {
                if (true != info.isLimitAdTrackingEnabled()) {
                    str2 = "0";
                }
                q10.put("limit_ad_tracking", str2);
                String id2 = info.getId();
                if (id2 != null) {
                    q10.put("ad_id_size", Integer.toString(id2.length()));
                }
            }
            if (th2 != null) {
                q10.put("error", th2.getClass().getName());
            }
            q10.put("tag", "AdvertisingIdClient");
            q10.put("time_spent", Long.toString(j3));
            new zza(this, q10).start();
            return true;
        }
        return false;
    }

    @VisibleForTesting
    public AdvertisingIdClient(@NonNull Context context, long j3, boolean z10, boolean z11) {
        Context applicationContext;
        this.zzd = new Object();
        Preconditions.checkNotNull(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.zzg = context;
        this.zzc = false;
        this.zzf = j3;
    }
}
