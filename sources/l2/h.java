package l2;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h implements Callable {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21116b;

    public h(View rootView) {
        this.a = 3;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.f21116b = new WeakReference(rootView);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d0  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.h.call():java.lang.Object");
    }

    public /* synthetic */ h(Object obj, int i10) {
        this.a = i10;
        this.f21116b = obj;
    }
}
