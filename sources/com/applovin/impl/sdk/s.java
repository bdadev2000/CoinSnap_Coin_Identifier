package com.applovin.impl.sdk;

import android.location.Location;
import android.location.LocationManager;
import android.provider.Settings;
import com.applovin.impl.oj;
import com.applovin.impl.x3;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class s {
    private final k a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f7987b = (LocationManager) k.k().getSystemService("location");

    /* renamed from: c, reason: collision with root package name */
    private double f7988c;

    /* renamed from: d, reason: collision with root package name */
    private double f7989d;

    /* renamed from: e, reason: collision with root package name */
    private long f7990e;

    public s(k kVar) {
        this.a = kVar;
    }

    private boolean f() {
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.a.a(oj.J4)).longValue());
        if (this.f7990e != 0 && System.currentTimeMillis() - this.f7990e < millis) {
            return false;
        }
        Location a = a("gps", "android.permission.ACCESS_FINE_LOCATION");
        if (a == null) {
            a = a("network", "android.permission.ACCESS_COARSE_LOCATION");
        }
        if (a == null) {
            return false;
        }
        this.f7988c = a.getLatitude();
        this.f7989d = a.getLongitude();
        this.f7990e = System.currentTimeMillis();
        return true;
    }

    public double a() {
        return this.f7988c;
    }

    public double b() {
        return this.f7989d;
    }

    public boolean c() {
        return x3.a("android.permission.ACCESS_COARSE_LOCATION", k.k());
    }

    public boolean d() {
        if (!this.a.g0().isLocationCollectionEnabled() || !((Boolean) this.a.a(oj.I4)).booleanValue() || !c()) {
            return false;
        }
        if (!f() && this.f7990e == 0) {
            return false;
        }
        return true;
    }

    public boolean e() {
        boolean isLocationEnabled;
        if (x3.j()) {
            isLocationEnabled = this.f7987b.isLocationEnabled();
            return isLocationEnabled;
        }
        if (!x3.e() || Settings.Secure.getInt(k.k().getContentResolver(), "location_mode", 0) != 0) {
            return true;
        }
        return false;
    }

    private Location a(String str, String str2) {
        if (!x3.a(str2, k.k())) {
            return null;
        }
        try {
            return this.f7987b.getLastKnownLocation(str);
        } catch (IllegalArgumentException e2) {
            this.a.L();
            if (t.a()) {
                this.a.L().a("LocationManager", com.applovin.impl.mediation.ads.e.f("Failed to retrieve location from ", str, ": device does not support this location provider."), e2);
            }
            return null;
        } catch (NullPointerException e10) {
            this.a.L();
            if (t.a()) {
                this.a.L().a("LocationManager", com.applovin.impl.mediation.ads.e.f("Failed to retrieve location from ", str, ": location provider is not available."), e10);
            }
            return null;
        } catch (SecurityException e11) {
            this.a.L();
            if (t.a()) {
                this.a.L().a("LocationManager", com.applovin.impl.mediation.ads.e.f("Failed to retrieve location from ", str, ": access denied."), e11);
            }
            return null;
        } catch (Throwable th2) {
            this.a.L();
            if (t.a()) {
                this.a.L().a("LocationManager", com.applovin.impl.mediation.ads.e.f("Failed to retrieve location from ", str, "."), th2);
            }
            return null;
        }
    }
}
