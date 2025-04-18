package androidx.activity;

import android.window.OnBackInvokedCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w {
    public static final w a = new w();

    public final OnBackInvokedCallback a(Function1<? super b, Unit> onBackStarted, Function1<? super b, Unit> onBackProgressed, Function0<Unit> onBackInvoked, Function0<Unit> onBackCancelled) {
        Intrinsics.checkNotNullParameter(onBackStarted, "onBackStarted");
        Intrinsics.checkNotNullParameter(onBackProgressed, "onBackProgressed");
        Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
        Intrinsics.checkNotNullParameter(onBackCancelled, "onBackCancelled");
        return new v(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
