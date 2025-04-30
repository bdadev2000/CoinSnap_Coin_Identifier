package com.applovin.impl.sdk;

import android.location.Location;
import android.location.LocationManager;
import android.provider.Settings;
import com.applovin.impl.oj;
import com.applovin.impl.x3;
import java.util.concurrent.TimeUnit;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private final k f11151a;
    private final LocationManager b = (LocationManager) k.k().getSystemService("location");

    /* renamed from: c, reason: collision with root package name */
    private double f11152c;

    /* renamed from: d, reason: collision with root package name */
    private double f11153d;

    /* renamed from: e, reason: collision with root package name */
    private long f11154e;

    public s(k kVar) {
        this.f11151a = kVar;
    }

    private boolean f() {
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f11151a.a(oj.f9615J4)).longValue());
        if (this.f11154e != 0 && System.currentTimeMillis() - this.f11154e < millis) {
            return false;
        }
        Location a6 = a("gps", "android.permission.ACCESS_FINE_LOCATION");
        if (a6 == null) {
            a6 = a("network", "android.permission.ACCESS_COARSE_LOCATION");
        }
        if (a6 == null) {
            return false;
        }
        this.f11152c = a6.getLatitude();
        this.f11153d = a6.getLongitude();
        this.f11154e = System.currentTimeMillis();
        return true;
    }

    public double a() {
        return this.f11152c;
    }

    public double b() {
        return this.f11153d;
    }

    public boolean c() {
        return x3.a("android.permission.ACCESS_COARSE_LOCATION", k.k());
    }

    public boolean d() {
        if (!this.f11151a.g0().isLocationCollectionEnabled() || !((Boolean) this.f11151a.a(oj.f9609I4)).booleanValue() || !c()) {
            return false;
        }
        if (!f() && this.f11154e == 0) {
            return false;
        }
        return true;
    }

    public boolean e() {
        boolean isLocationEnabled;
        if (x3.j()) {
            isLocationEnabled = this.b.isLocationEnabled();
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
            return this.b.getLastKnownLocation(str);
        } catch (IllegalArgumentException e4) {
            this.f11151a.L();
            if (t.a()) {
                this.f11151a.L().a("LocationManager", AbstractC2914a.e("Failed to retrieve location from ", str, ": device does not support this location provider."), e4);
            }
            return null;
        } catch (NullPointerException e9) {
            this.f11151a.L();
            if (t.a()) {
                this.f11151a.L().a("LocationManager", AbstractC2914a.e("Failed to retrieve location from ", str, ": location provider is not available."), e9);
            }
            return null;
        } catch (SecurityException e10) {
            this.f11151a.L();
            if (t.a()) {
                this.f11151a.L().a("LocationManager", AbstractC2914a.e("Failed to retrieve location from ", str, ": access denied."), e10);
            }
            return null;
        } catch (Throwable th) {
            this.f11151a.L();
            if (t.a()) {
                this.f11151a.L().a("LocationManager", AbstractC2914a.e("Failed to retrieve location from ", str, "."), th);
            }
            return null;
        }
    }
}
