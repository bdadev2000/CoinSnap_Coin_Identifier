package kb;

import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class b extends FunctionReferenceImpl implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20632b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(int r8) {
        /*
            r7 = this;
            kb.c r2 = kb.d.f20633d
            r7.f20632b = r8
            r0 = 1
            if (r8 == r0) goto L24
            r0 = 2
            if (r8 == r0) goto L17
            r1 = 0
            java.lang.Class<kb.c> r3 = kb.c.class
            java.lang.String r4 = "isBackgroundThread"
            java.lang.String r5 = "isBackgroundThread()Z"
            r6 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L17:
            r1 = 0
            java.lang.Class<kb.c> r3 = kb.c.class
            java.lang.String r4 = "isNotMainThread"
            java.lang.String r5 = "isNotMainThread()Z"
            r6 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L24:
            r1 = 0
            java.lang.Class<kb.c> r3 = kb.c.class
            java.lang.String r4 = "isBlockingThread"
            java.lang.String r5 = "isBlockingThread()Z"
            r6 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kb.b.<init>(int):void");
    }

    public final Boolean a() {
        boolean contains$default;
        boolean contains$default2;
        switch (this.f20632b) {
            case 0:
                ((c) this.receiver).getClass();
                String threadName = c.b();
                Intrinsics.checkNotNullExpressionValue(threadName, "threadName");
                contains$default = StringsKt__StringsKt.contains$default(threadName, "Firebase Background Thread #", false, 2, (Object) null);
                return Boolean.valueOf(contains$default);
            case 1:
                ((c) this.receiver).getClass();
                String threadName2 = c.b();
                Intrinsics.checkNotNullExpressionValue(threadName2, "threadName");
                contains$default2 = StringsKt__StringsKt.contains$default(threadName2, "Firebase Blocking Thread #", false, 2, (Object) null);
                return Boolean.valueOf(contains$default2);
            default:
                ((c) this.receiver).getClass();
                return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f20632b) {
            case 0:
                return a();
            case 1:
                return a();
            default:
                return a();
        }
    }
}
