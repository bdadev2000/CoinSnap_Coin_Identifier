package t9;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
public abstract class b extends c {

    /* renamed from: c, reason: collision with root package name */
    public boolean f25366c;

    /* renamed from: d, reason: collision with root package name */
    public int f25367d;

    /* renamed from: e, reason: collision with root package name */
    public int f25368e;

    /* renamed from: f, reason: collision with root package name */
    public int f25369f;

    /* renamed from: g, reason: collision with root package name */
    public VelocityTracker f25370g;

    public b() {
        this.f25367d = -1;
        this.f25369f = -1;
    }

    @Override // b0.a
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f25369f < 0) {
            this.f25369f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f25366c) {
            int i10 = this.f25367d;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y4 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y4 - this.f25368e) > this.f25369f) {
                this.f25368e = y4;
                return true;
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f25370g;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f25367d = -1;
        motionEvent.getX();
        motionEvent.getY();
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.u(view);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    @Override // b0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            int r0 = r8.getActionMasked()
            r1 = -1
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == r3) goto L41
            r5 = 2
            if (r0 == r5) goto L2d
            r7 = 3
            if (r0 == r7) goto L45
            r7 = 6
            if (r0 == r7) goto L14
            goto L52
        L14:
            int r7 = r8.getActionIndex()
            if (r7 != 0) goto L1b
            goto L1c
        L1b:
            r3 = r4
        L1c:
            int r7 = r8.getPointerId(r3)
            r6.f25367d = r7
            float r7 = r8.getY(r3)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r0
            int r7 = (int) r7
            r6.f25368e = r7
            goto L52
        L2d:
            int r0 = r6.f25367d
            int r0 = r8.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r4
        L36:
            float r8 = r8.getY(r0)
            int r8 = (int) r8
            r6.f25368e = r8
            a4.j.t(r7)
            throw r2
        L41:
            android.view.VelocityTracker r0 = r6.f25370g
            if (r0 != 0) goto L5c
        L45:
            r6.f25366c = r4
            r6.f25367d = r1
            android.view.VelocityTracker r7 = r6.f25370g
            if (r7 == 0) goto L52
            r7.recycle()
            r6.f25370g = r2
        L52:
            android.view.VelocityTracker r7 = r6.f25370g
            if (r7 == 0) goto L59
            r7.addMovement(r8)
        L59:
            boolean r7 = r6.f25366c
            return r7
        L5c:
            r0.addMovement(r8)
            android.view.VelocityTracker r8 = r6.f25370g
            r0 = 1000(0x3e8, float:1.401E-42)
            r8.computeCurrentVelocity(r0)
            android.view.VelocityTracker r8 = r6.f25370g
            int r0 = r6.f25367d
            r8.getYVelocity(r0)
            a4.j.t(r7)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.b.v(android.view.View, android.view.MotionEvent):boolean");
    }

    public b(int i10) {
        super(0);
        this.f25367d = -1;
        this.f25369f = -1;
    }
}
