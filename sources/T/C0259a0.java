package T;

import android.view.ViewConfiguration;

/* renamed from: T.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0259a0 implements S.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2877a;
    public final /* synthetic */ ViewConfiguration b;

    public /* synthetic */ C0259a0(ViewConfiguration viewConfiguration, int i9) {
        this.f2877a = i9;
        this.b = viewConfiguration;
    }

    @Override // S.f
    public final Integer get() {
        switch (this.f2877a) {
            case 0:
                return Integer.valueOf(this.b.getScaledMaximumFlingVelocity());
            default:
                return Integer.valueOf(this.b.getScaledMinimumFlingVelocity());
        }
    }
}
