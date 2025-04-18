package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes.dex */
public final class o1 extends Transition.EpicenterCallback {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rect f1701b;

    public /* synthetic */ o1(Rect rect, int i10) {
        this.a = i10;
        this.f1701b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        int i10 = this.a;
        Rect rect = this.f1701b;
        switch (i10) {
            case 0:
                return rect;
            default:
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
