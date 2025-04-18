package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.collection.SimpleArrayMap;
import androidx.core.location.GnssStatusCompat;
import androidx.core.location.LocationManagerCompat;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class LocationManagerCompat {

    /* renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f18582a = new WeakHashMap();

    /* loaded from: classes.dex */
    public static class Api19Impl {

        /* renamed from: a, reason: collision with root package name */
        public static Class f18583a;

        /* renamed from: b, reason: collision with root package name */
        public static Method f18584b;

        @DoNotInline
        @SuppressLint({"BanUncheckedReflection"})
        public static boolean a(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, LocationListenerCompat locationListenerCompat, Looper looper) {
            try {
                if (f18583a == null) {
                    f18583a = Class.forName("android.location.LocationRequest");
                }
                if (f18584b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f18583a, LocationListener.class, Looper.class);
                    f18584b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest a2 = locationRequestCompat.a(str);
                if (a2 != null) {
                    f18584b.invoke(locationManager, a2, locationListenerCompat, looper);
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }

        @RequiresPermission
        @DoNotInline
        @SuppressLint({"BanUncheckedReflection"})
        public static boolean b(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, LocationListenerTransport locationListenerTransport) {
            LocationRequest a2;
            try {
                if (f18583a == null) {
                    f18583a = Class.forName("android.location.LocationRequest");
                }
                if (f18584b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f18583a, LocationListener.class, Looper.class);
                    f18584b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                a2 = locationRequestCompat.a(str);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            if (a2 == null) {
                return false;
            }
            synchronized (LocationManagerCompat.f18582a) {
                f18584b.invoke(locationManager, a2, locationListenerTransport, Looper.getMainLooper());
                locationListenerTransport.getClass();
                throw null;
            }
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api24Impl {
        @RequiresPermission
        @DoNotInline
        public static boolean a(@NonNull LocationManager locationManager, @NonNull GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(callback);
        }

        @RequiresPermission
        @DoNotInline
        public static boolean b(@NonNull LocationManager locationManager, @NonNull GnssMeasurementsEvent.Callback callback, @NonNull Handler handler) {
            return locationManager.registerGnssMeasurementsCallback(callback, handler);
        }

        @RequiresPermission
        @DoNotInline
        public static boolean c(LocationManager locationManager, Handler handler, Executor executor, GnssStatusCompat.Callback callback) {
            if (handler == null) {
                throw new IllegalArgumentException();
            }
            SimpleArrayMap simpleArrayMap = GnssListenersHolder.f18588a;
            synchronized (simpleArrayMap) {
                try {
                    PreRGnssStatusTransport preRGnssStatusTransport = (PreRGnssStatusTransport) simpleArrayMap.get(callback);
                    if (preRGnssStatusTransport == null) {
                        preRGnssStatusTransport = new PreRGnssStatusTransport(callback);
                    } else {
                        preRGnssStatusTransport.f18591b = null;
                    }
                    Preconditions.a(executor != null, "invalid null executor");
                    if (preRGnssStatusTransport.f18591b != null) {
                        throw new IllegalStateException((String) null);
                    }
                    preRGnssStatusTransport.f18591b = executor;
                    if (!locationManager.registerGnssStatusCallback(preRGnssStatusTransport, handler)) {
                        return false;
                    }
                    simpleArrayMap.put(callback, preRGnssStatusTransport);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @DoNotInline
        public static void d(@NonNull LocationManager locationManager, @NonNull GnssMeasurementsEvent.Callback callback) {
            locationManager.unregisterGnssMeasurementsCallback(callback);
        }

        @DoNotInline
        public static void e(LocationManager locationManager, Object obj) {
            if (obj instanceof PreRGnssStatusTransport) {
                ((PreRGnssStatusTransport) obj).f18591b = null;
            }
            locationManager.unregisterGnssStatusCallback((GnssStatus.Callback) obj);
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api28Impl {
        @DoNotInline
        public static String a(LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        @DoNotInline
        public static int b(LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }

        @DoNotInline
        public static boolean c(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api30Impl {

        /* renamed from: a, reason: collision with root package name */
        public static Class f18585a;

        /* renamed from: b, reason: collision with root package name */
        public static Method f18586b;

        @RequiresPermission
        @DoNotInline
        public static void a(LocationManager locationManager, @NonNull String str, @Nullable CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull final Consumer<Location> consumer) {
            Objects.requireNonNull(consumer);
            locationManager.getCurrentLocation(str, cancellationSignal, executor, new java.util.function.Consumer() { // from class: androidx.core.location.a
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Consumer.this.accept((Location) obj);
                }
            });
        }

        @RequiresPermission
        @DoNotInline
        public static boolean b(LocationManager locationManager, Handler handler, Executor executor, GnssStatusCompat.Callback callback) {
            SimpleArrayMap simpleArrayMap = GnssListenersHolder.f18588a;
            synchronized (simpleArrayMap) {
                try {
                    GnssStatusTransport gnssStatusTransport = (GnssStatusTransport) simpleArrayMap.get(callback);
                    if (gnssStatusTransport == null) {
                        gnssStatusTransport = new GnssStatusTransport(callback);
                    }
                    if (!locationManager.registerGnssStatusCallback(executor, gnssStatusTransport)) {
                        return false;
                    }
                    simpleArrayMap.put(callback, gnssStatusTransport);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @DoNotInline
        public static boolean c(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, Executor executor, LocationListenerCompat locationListenerCompat) {
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    if (f18585a == null) {
                        f18585a = Class.forName("android.location.LocationRequest");
                    }
                    if (f18586b == null) {
                        Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f18585a, Executor.class, LocationListener.class);
                        f18586b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    LocationRequest a2 = locationRequestCompat.a(str);
                    if (a2 != null) {
                        f18586b.invoke(locationManager, a2, executor, locationListenerCompat);
                        return true;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                }
            }
            return false;
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api31Impl {
        @DoNotInline
        public static boolean a(LocationManager locationManager, @NonNull String str) {
            return locationManager.hasProvider(str);
        }

        @RequiresPermission
        @DoNotInline
        public static boolean b(@NonNull LocationManager locationManager, @NonNull Executor executor, @NonNull GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(executor, callback);
        }

        @RequiresPermission
        @DoNotInline
        public static void c(LocationManager locationManager, @NonNull String str, @NonNull LocationRequest locationRequest, @NonNull Executor executor, @NonNull LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    /* loaded from: classes.dex */
    public static final class CancellableLocationListener implements LocationListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f18587a;

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            synchronized (this) {
                try {
                    if (this.f18587a) {
                        return;
                    }
                    this.f18587a = true;
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            onLocationChanged((Location) null);
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i2, Bundle bundle) {
        }
    }

    /* loaded from: classes.dex */
    public static class GnssListenersHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final SimpleArrayMap f18588a = new SimpleArrayMap();

        static {
            new SimpleArrayMap();
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class GnssMeasurementsTransport extends GnssMeasurementsEvent.Callback {
        @Override // android.location.GnssMeasurementsEvent.Callback
        public final void onGnssMeasurementsReceived(GnssMeasurementsEvent gnssMeasurementsEvent) {
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public final void onStatusChanged(int i2) {
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class GnssStatusTransport extends GnssStatus.Callback {

        /* renamed from: a, reason: collision with root package name */
        public final GnssStatusCompat.Callback f18589a;

        public GnssStatusTransport(GnssStatusCompat.Callback callback) {
            Preconditions.a(callback != null, "invalid null callback");
            this.f18589a = callback;
        }

        @Override // android.location.GnssStatus.Callback
        public final void onFirstFix(int i2) {
            this.f18589a.getClass();
        }

        @Override // android.location.GnssStatus.Callback
        public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            new GnssStatusWrapper(gnssStatus);
            this.f18589a.getClass();
        }

        @Override // android.location.GnssStatus.Callback
        public final void onStarted() {
            this.f18589a.getClass();
        }

        @Override // android.location.GnssStatus.Callback
        public final void onStopped() {
            this.f18589a.getClass();
        }
    }

    /* loaded from: classes.dex */
    public static class GpsStatusTransport implements GpsStatus.Listener {
        @Override // android.location.GpsStatus.Listener
        public final void onGpsStatusChanged(int i2) {
        }
    }

    /* loaded from: classes.dex */
    public static final class InlineHandlerExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            Looper.myLooper();
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class LocationListenerKey {
        public final boolean equals(Object obj) {
            if (!(obj instanceof LocationListenerKey)) {
                return false;
            }
            ((LocationListenerKey) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            return Objects.hash(null, null);
        }
    }

    /* loaded from: classes.dex */
    public static class LocationListenerTransport implements LocationListener {
        @Override // android.location.LocationListener
        public final void onFlushComplete(int i2) {
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i2, Bundle bundle) {
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(List list) {
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class PreRGnssStatusTransport extends GnssStatus.Callback {

        /* renamed from: a, reason: collision with root package name */
        public final GnssStatusCompat.Callback f18590a;

        /* renamed from: b, reason: collision with root package name */
        public volatile Executor f18591b;

        public PreRGnssStatusTransport(GnssStatusCompat.Callback callback) {
            Preconditions.a(callback != null, "invalid null callback");
            this.f18590a = callback;
        }

        @Override // android.location.GnssStatus.Callback
        public final void onFirstFix(final int i2) {
            final Executor executor = this.f18591b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable(this, executor, i2) { // from class: androidx.core.location.c

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Executor f18600a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Object f18601b;

                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport = (LocationManagerCompat.PreRGnssStatusTransport) this.f18601b;
                    if (preRGnssStatusTransport.f18591b != this.f18600a) {
                        return;
                    }
                    preRGnssStatusTransport.f18590a.getClass();
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public final void onSatelliteStatusChanged(final GnssStatus gnssStatus) {
            final Executor executor = this.f18591b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.b
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport = (LocationManagerCompat.PreRGnssStatusTransport) this;
                    Executor executor2 = executor;
                    GnssStatus gnssStatus2 = (GnssStatus) gnssStatus;
                    if (preRGnssStatusTransport.f18591b != executor2) {
                        return;
                    }
                    GnssStatusCompat.Callback callback = preRGnssStatusTransport.f18590a;
                    new GnssStatusWrapper(gnssStatus2);
                    callback.getClass();
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public final void onStarted() {
            Executor executor = this.f18591b;
            if (executor == null) {
                return;
            }
            executor.execute(new d(this, executor, 0));
        }

        @Override // android.location.GnssStatus.Callback
        public final void onStopped() {
            Executor executor = this.f18591b;
            if (executor == null) {
                return;
            }
            executor.execute(new d(this, executor, 1));
        }
    }
}
