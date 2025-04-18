package androidx.core.location;

import android.location.LocationRequest;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.TimeUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class LocationRequestCompat {

    /* loaded from: classes2.dex */
    public static class Api19Impl {

        /* renamed from: a, reason: collision with root package name */
        public static Class f18592a;

        /* renamed from: b, reason: collision with root package name */
        public static Method f18593b;

        /* renamed from: c, reason: collision with root package name */
        public static Method f18594c;
        public static Method d;
        public static Method e;

        /* renamed from: f, reason: collision with root package name */
        public static Method f18595f;
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api31Impl {
        @DoNotInline
        public static LocationRequest a(LocationRequestCompat locationRequestCompat) {
            locationRequestCompat.getClass();
            return new LocationRequest.Builder(0L).setQuality(0).setMinUpdateIntervalMillis(0L).setDurationMillis(0L).setMaxUpdates(0).setMinUpdateDistanceMeters(0.0f).setMaxUpdateDelayMillis(0L).build();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Builder {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface Quality {
    }

    public final LocationRequest a(String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.a(this);
        }
        Object obj = null;
        try {
            if (Api19Impl.f18592a == null) {
                Api19Impl.f18592a = Class.forName("android.location.LocationRequest");
            }
            if (Api19Impl.f18593b == null) {
                Method declaredMethod = Api19Impl.f18592a.getDeclaredMethod("createFromDeprecatedProvider", String.class, Long.TYPE, Float.TYPE, Boolean.TYPE);
                Api19Impl.f18593b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object invoke = Api19Impl.f18593b.invoke(null, str, 0L, Float.valueOf(0.0f), Boolean.FALSE);
            if (invoke != null) {
                if (Api19Impl.f18594c == null) {
                    Method declaredMethod2 = Api19Impl.f18592a.getDeclaredMethod("setQuality", Integer.TYPE);
                    Api19Impl.f18594c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                Api19Impl.f18594c.invoke(invoke, 0);
                if (Api19Impl.d == null) {
                    Method declaredMethod3 = Api19Impl.f18592a.getDeclaredMethod("setFastestInterval", Long.TYPE);
                    Api19Impl.d = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                Api19Impl.d.invoke(invoke, 0L);
                if (Api19Impl.e == null) {
                    Method declaredMethod4 = Api19Impl.f18592a.getDeclaredMethod("setNumUpdates", Integer.TYPE);
                    Api19Impl.e = declaredMethod4;
                    declaredMethod4.setAccessible(true);
                }
                Api19Impl.e.invoke(invoke, 0);
                if (Api19Impl.f18595f == null) {
                    Method declaredMethod5 = Api19Impl.f18592a.getDeclaredMethod("setExpireIn", Long.TYPE);
                    Api19Impl.f18595f = declaredMethod5;
                    declaredMethod5.setAccessible(true);
                }
                Api19Impl.f18595f.invoke(invoke, 0L);
                obj = invoke;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return androidx.compose.ui.contentcapture.a.f(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequestCompat)) {
            return false;
        }
        ((LocationRequestCompat) obj).getClass();
        return Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        int i2 = (int) 0;
        return (i2 * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request[@");
        Object obj = TimeUtils.f18686a;
        synchronized (obj) {
            sb.append(TimeUtils.f18687b, 0, TimeUtils.a(0L));
        }
        sb.append(", duration=");
        synchronized (obj) {
            sb.append(TimeUtils.f18687b, 0, TimeUtils.a(0L));
        }
        sb.append(", maxUpdates=0");
        if (0.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            sb.append(", minUpdateDistance=0.0");
        }
        sb.append(']');
        return sb.toString();
    }
}
