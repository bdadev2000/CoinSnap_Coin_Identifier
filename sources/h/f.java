package h;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends Handler {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18551b;

    public f(com.facebook.login.k kVar) {
        this.a = 2;
        this.f18551b = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e A[ORIG_RETURN, RETURN] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleMessage(android.os.Message r11) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.f.handleMessage(android.os.Message):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Looper looper, int i10) {
        super(looper);
        this.a = i10;
        this.f18551b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CoroutineContext backgroundDispatcher) {
        super(Looper.getMainLooper());
        this.a = 4;
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.f18551b = backgroundDispatcher;
    }

    public f(DialogInterface dialogInterface) {
        this.a = 0;
        this.f18551b = new WeakReference(dialogInterface);
    }
}
