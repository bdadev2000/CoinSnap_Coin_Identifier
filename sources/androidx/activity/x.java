package androidx.activity;

import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x implements c {

    /* renamed from: b, reason: collision with root package name */
    public final q f622b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f623c;

    public x(z zVar, q onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f623c = zVar;
        this.f622b = onBackPressedCallback;
    }

    @Override // androidx.activity.c
    public final void cancel() {
        z zVar = this.f623c;
        ArrayDeque arrayDeque = zVar.f625b;
        q qVar = this.f622b;
        arrayDeque.remove(qVar);
        if (Intrinsics.areEqual(zVar.f626c, qVar)) {
            qVar.getClass();
            zVar.f626c = null;
        }
        qVar.getClass();
        Intrinsics.checkNotNullParameter(this, "cancellable");
        qVar.f587b.remove(this);
        Function0 function0 = qVar.f588c;
        if (function0 != null) {
            function0.invoke();
        }
        qVar.f588c = null;
    }
}
