package k;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class t extends U1.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21325d = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f21326f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f21327g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, C.c cVar) {
        super(wVar);
        this.f21326f = wVar;
        this.f21327g = cVar;
    }

    @Override // U1.b
    public final IntentFilter d() {
        switch (this.f21325d) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [k.D, java.lang.Object] */
    @Override // U1.b
    public final int e() {
        Location location;
        boolean z8;
        long j7;
        Location location2;
        switch (this.f21325d) {
            case 0:
                if (AbstractC2427p.a((PowerManager) this.f21327g)) {
                    return 2;
                }
                return 1;
            default:
                C.c cVar = (C.c) this.f21327g;
                C2408E c2408e = (C2408E) cVar.f349f;
                if (c2408e.b > System.currentTimeMillis()) {
                    z8 = c2408e.f21230a;
                } else {
                    Context context = (Context) cVar.f347c;
                    int e4 = z2.i.e(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) cVar.f348d;
                    if (e4 == 0) {
                        try {
                        } catch (Exception e9) {
                            Log.d("TwilightManager", "Failed to get last known location", e9);
                        }
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (z2.i.e(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e10) {
                            Log.d("TwilightManager", "Failed to get last known location", e10);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    z8 = false;
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (C2407D.f21227d == null) {
                            C2407D.f21227d = new Object();
                        }
                        C2407D c2407d = C2407D.f21227d;
                        c2407d.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS);
                        c2407d.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        if (c2407d.f21229c == 1) {
                            z8 = true;
                        }
                        long j9 = c2407d.b;
                        long j10 = c2407d.f21228a;
                        c2407d.a(location.getLatitude(), location.getLongitude(), com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS + currentTimeMillis);
                        long j11 = c2407d.b;
                        if (j9 != -1 && j10 != -1) {
                            if (currentTimeMillis <= j10) {
                                if (currentTimeMillis > j9) {
                                    j11 = j10;
                                } else {
                                    j11 = j9;
                                }
                            }
                            j7 = j11 + ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
                        } else {
                            j7 = currentTimeMillis + 43200000;
                        }
                        c2408e.f21230a = z8;
                        c2408e.b = j7;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i9 = Calendar.getInstance().get(11);
                        if (i9 < 6 || i9 >= 22) {
                            z8 = true;
                        }
                    }
                }
                if (!z8) {
                    return 1;
                }
                return 2;
        }
    }

    @Override // U1.b
    public final void g() {
        switch (this.f21325d) {
            case 0:
                this.f21326f.n(true, true);
                return;
            default:
                this.f21326f.n(true, true);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, Context context) {
        super(wVar);
        this.f21326f = wVar;
        this.f21327g = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
