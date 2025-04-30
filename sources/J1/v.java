package J1;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1549a;
    public final Object b;

    public /* synthetic */ v(Object obj, int i9) {
        this.f1549a = i9;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0217  */
    /* JADX WARN: Type inference failed for: r0v3, types: [U0.h, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.v.call():java.lang.Object");
    }

    public v(View view) {
        this.f1549a = 3;
        this.b = new WeakReference(view);
    }
}
