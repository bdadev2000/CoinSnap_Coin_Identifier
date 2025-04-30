package X4;

import a5.C0397a;
import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import androidx.core.app.C0414o;
import h5.C2323d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final C0397a f3697e = C0397a.d();

    /* renamed from: a, reason: collision with root package name */
    public final Activity f3698a;
    public final E1.c b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f3699c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3700d;

    public f(Activity activity) {
        E1.c cVar = new E1.c(26);
        HashMap hashMap = new HashMap();
        this.f3700d = false;
        this.f3698a = activity;
        this.b = cVar;
        this.f3699c = hashMap;
    }

    public final C2323d a() {
        boolean z8 = this.f3700d;
        C0397a c0397a = f3697e;
        if (!z8) {
            c0397a.a("No recording has been started.");
            return new C2323d();
        }
        SparseIntArray[] sparseIntArrayArr = ((C0414o) this.b.f972c).b;
        if (sparseIntArrayArr == null) {
            c0397a.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return new C2323d();
        }
        SparseIntArray sparseIntArray = sparseIntArrayArr[0];
        if (sparseIntArray == null) {
            c0397a.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return new C2323d();
        }
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < sparseIntArray.size(); i12++) {
            int keyAt = sparseIntArray.keyAt(i12);
            int valueAt = sparseIntArray.valueAt(i12);
            i9 += valueAt;
            if (keyAt > 700) {
                i11 += valueAt;
            }
            if (keyAt > 16) {
                i10 += valueAt;
            }
        }
        return new C2323d(new b5.d(i9, i10, i11));
    }

    public final void b() {
        boolean z8 = this.f3700d;
        Activity activity = this.f3698a;
        if (z8) {
            f3697e.b("FrameMetricsAggregator is already recording %s", activity.getClass().getSimpleName());
            return;
        }
        C0414o c0414o = (C0414o) this.b.f972c;
        c0414o.getClass();
        if (C0414o.f4418e == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            C0414o.f4418e = handlerThread;
            handlerThread.start();
            C0414o.f4419f = new Handler(C0414o.f4418e.getLooper());
        }
        for (int i9 = 0; i9 <= 8; i9++) {
            SparseIntArray[] sparseIntArrayArr = c0414o.b;
            if (sparseIntArrayArr[i9] == null) {
                if (((1 << i9) & c0414o.f4420a) != 0) {
                    sparseIntArrayArr[i9] = new SparseIntArray();
                }
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener(c0414o.f4422d, C0414o.f4419f);
        c0414o.f4421c.add(new WeakReference(activity));
        this.f3700d = true;
    }
}
