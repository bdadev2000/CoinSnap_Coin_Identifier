package androidx.appcompat.app;

import android.content.Context;
import android.location.LocationManager;

/* loaded from: classes2.dex */
class TwilightManager {
    public static TwilightManager d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f491a;

    /* renamed from: b, reason: collision with root package name */
    public final LocationManager f492b;

    /* renamed from: c, reason: collision with root package name */
    public final TwilightState f493c = new Object();

    /* loaded from: classes2.dex */
    public static class TwilightState {

        /* renamed from: a, reason: collision with root package name */
        public boolean f494a;

        /* renamed from: b, reason: collision with root package name */
        public long f495b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.app.TwilightManager$TwilightState, java.lang.Object] */
    public TwilightManager(Context context, LocationManager locationManager) {
        this.f491a = context;
        this.f492b = locationManager;
    }
}
