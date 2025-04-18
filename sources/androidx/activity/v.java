package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v implements OnBackAnimationCallback {
    public final /* synthetic */ Function1 a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f619b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f620c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f621d;

    public v(Function1 function1, Function1 function12, Function0 function0, Function0 function02) {
        this.a = function1;
        this.f619b = function12;
        this.f620c = function0;
        this.f621d = function02;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        this.f621d.invoke();
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.f620c.invoke();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        this.f619b.invoke(new b(backEvent));
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        this.a.invoke(new b(backEvent));
    }
}
