package androidx.activity;

import android.window.OnBackInvokedCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements OnBackInvokedCallback {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f618b;

    public /* synthetic */ t(Object obj, int i10) {
        this.a = i10;
        this.f618b = obj;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                Function0 onBackInvoked = (Function0) this.f618b;
                Intrinsics.checkNotNullParameter(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                return;
            case 1:
                ((Runnable) this.f618b).run();
                return;
            default:
                ((fa.b) this.f618b).d();
                return;
        }
    }
}
