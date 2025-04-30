package g5;

import android.content.Context;
import com.google.firebase.perf.v1.PerfSession;
import h5.C2326g;
import i5.H;
import java.util.List;
import java.util.Random;

/* renamed from: g5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2301d {

    /* renamed from: a, reason: collision with root package name */
    public final Y4.a f20466a;
    public final double b;

    /* renamed from: c, reason: collision with root package name */
    public final double f20467c;

    /* renamed from: d, reason: collision with root package name */
    public final C2300c f20468d;

    /* renamed from: e, reason: collision with root package name */
    public final C2300c f20469e;

    public C2301d(Context context, C2326g c2326g) {
        boolean z8;
        R3.e eVar = new R3.e(24);
        double nextDouble = new Random().nextDouble();
        double nextDouble2 = new Random().nextDouble();
        Y4.a e4 = Y4.a.e();
        this.f20468d = null;
        this.f20469e = null;
        boolean z9 = false;
        if (0.0d <= nextDouble && nextDouble < 1.0d) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            if (0.0d <= nextDouble2 && nextDouble2 < 1.0d) {
                z9 = true;
            }
            if (z9) {
                this.b = nextDouble;
                this.f20467c = nextDouble2;
                this.f20466a = e4;
                this.f20468d = new C2300c(c2326g, eVar, e4, "Trace");
                this.f20469e = new C2300c(c2326g, eVar, e4, "Network");
                com.bumptech.glide.c.N(context);
                return;
            }
            throw new IllegalArgumentException("Fragment sampling bucket ID should be in range [0.0, 1.0).");
        }
        throw new IllegalArgumentException("Sampling bucket ID should be in range [0.0, 1.0).");
    }

    public static boolean a(List list) {
        if (list.size() <= 0 || ((PerfSession) list.get(0)).getSessionVerbosityCount() <= 0 || ((PerfSession) list.get(0)).getSessionVerbosity(0) != H.GAUGES_AND_SYSTEM_EVENTS) {
            return false;
        }
        return true;
    }
}
