package h;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.os.PowerManager;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class b0 extends d0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18518d = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0 f18519f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f18520g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(g0 g0Var, c cVar) {
        super(g0Var);
        this.f18519f = g0Var;
        this.f18520g = cVar;
    }

    @Override // h.d0
    public final IntentFilter b() {
        switch (this.f18518d) {
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

    @Override // h.d0
    public final int d() {
        boolean z10;
        Location location;
        boolean z11;
        long j3;
        long j10;
        int i10 = this.f18518d;
        Object obj = this.f18520g;
        switch (i10) {
            case 0:
                if (!((PowerManager) obj).isPowerSaveMode()) {
                    return 1;
                }
                return 2;
            default:
                c cVar = (c) obj;
                t0 t0Var = (t0) cVar.f18525f;
                boolean z12 = false;
                if (t0Var.f18664b > System.currentTimeMillis()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z11 = t0Var.a;
                } else {
                    Location location2 = null;
                    if (com.bumptech.glide.e.n((Context) cVar.f18523c, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        location = cVar.x("network");
                    } else {
                        location = null;
                    }
                    if (com.bumptech.glide.e.n((Context) cVar.f18523c, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        location2 = cVar.x("gps");
                    }
                    if (location2 == null || location == null ? location2 != null : location2.getTime() > location.getTime()) {
                        location = location2;
                    }
                    if (location != null) {
                        t0 t0Var2 = (t0) cVar.f18525f;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (s0.f18658d == null) {
                            s0.f18658d = new s0();
                        }
                        s0 s0Var = s0.f18658d;
                        s0Var.a(currentTimeMillis - com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS, location.getLatitude(), location.getLongitude());
                        s0Var.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        if (s0Var.a == 1) {
                            z12 = true;
                        }
                        long j11 = s0Var.f18661c;
                        long j12 = s0Var.f18660b;
                        s0Var.a(currentTimeMillis + com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS, location.getLatitude(), location.getLongitude());
                        long j13 = s0Var.f18661c;
                        if (j11 != -1 && j12 != -1) {
                            if (currentTimeMillis > j12) {
                                j10 = j13 + 0;
                            } else if (currentTimeMillis > j11) {
                                j10 = j12 + 0;
                            } else {
                                j10 = j11 + 0;
                            }
                            j3 = j10 + ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
                        } else {
                            j3 = currentTimeMillis + 43200000;
                        }
                        t0Var2.a = z12;
                        t0Var2.f18664b = j3;
                        z11 = t0Var.a;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i11 = Calendar.getInstance().get(11);
                        if (i11 < 6 || i11 >= 22) {
                            z12 = true;
                        }
                        z11 = z12;
                    }
                }
                if (!z11) {
                    return 1;
                }
                return 2;
        }
    }

    @Override // h.d0
    public final void e() {
        int i10 = this.f18518d;
        g0 g0Var = this.f18519f;
        switch (i10) {
            case 0:
                g0Var.o(true, true);
                return;
            default:
                g0Var.o(true, true);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(g0 g0Var, Context context) {
        super(g0Var);
        this.f18519f = g0Var;
        this.f18520g = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
