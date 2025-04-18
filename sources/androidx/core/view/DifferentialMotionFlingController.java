package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Api;

/* loaded from: classes.dex */
public class DifferentialMotionFlingController {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18701a;

    /* renamed from: b, reason: collision with root package name */
    public final DifferentialMotionFlingTarget f18702b;

    /* renamed from: c, reason: collision with root package name */
    public final FlingVelocityThresholdCalculator f18703c;
    public final DifferentialVelocityProvider d;
    public VelocityTracker e;

    /* renamed from: f, reason: collision with root package name */
    public float f18704f;

    /* renamed from: g, reason: collision with root package name */
    public int f18705g;

    /* renamed from: h, reason: collision with root package name */
    public int f18706h;

    /* renamed from: i, reason: collision with root package name */
    public int f18707i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f18708j;

    @VisibleForTesting
    /* loaded from: classes.dex */
    public interface DifferentialVelocityProvider {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i2);
    }

    @VisibleForTesting
    /* loaded from: classes.dex */
    public interface FlingVelocityThresholdCalculator {
        void b(Context context, int[] iArr, MotionEvent motionEvent, int i2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.view.DifferentialMotionFlingController$FlingVelocityThresholdCalculator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, androidx.core.view.DifferentialMotionFlingController$DifferentialVelocityProvider] */
    public DifferentialMotionFlingController(Context context, DifferentialMotionFlingTarget differentialMotionFlingTarget) {
        ?? obj = new Object();
        ?? obj2 = new Object();
        this.f18705g = -1;
        this.f18706h = -1;
        this.f18707i = -1;
        this.f18708j = new int[]{Api.BaseClientBuilder.API_PRIORITY_OTHER, 0};
        this.f18701a = context;
        this.f18702b = differentialMotionFlingTarget;
        this.f18703c = obj;
        this.d = obj2;
    }

    public final void a(MotionEvent motionEvent, int i2) {
        boolean z2;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i3 = this.f18706h;
        int[] iArr = this.f18708j;
        if (i3 == source && this.f18707i == deviceId && this.f18705g == i2) {
            z2 = false;
        } else {
            this.f18703c.b(this.f18701a, iArr, motionEvent, i2);
            this.f18706h = source;
            this.f18707i = deviceId;
            this.f18705g = i2;
            z2 = true;
        }
        if (iArr[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.e = null;
                return;
            }
            return;
        }
        if (this.e == null) {
            this.e = VelocityTracker.obtain();
        }
        float a2 = this.d.a(this.e, motionEvent, i2);
        DifferentialMotionFlingTarget differentialMotionFlingTarget = this.f18702b;
        float b2 = differentialMotionFlingTarget.b() * a2;
        float signum = Math.signum(b2);
        if (z2 || (signum != Math.signum(this.f18704f) && signum != 0.0f)) {
            differentialMotionFlingTarget.c();
        }
        if (Math.abs(b2) < iArr[0]) {
            return;
        }
        float max = Math.max(-r8, Math.min(b2, iArr[1]));
        this.f18704f = differentialMotionFlingTarget.a(max) ? max : 0.0f;
    }
}
