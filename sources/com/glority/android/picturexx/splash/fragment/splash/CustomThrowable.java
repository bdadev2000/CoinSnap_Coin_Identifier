package com.glority.android.picturexx.splash.fragment.splash;

import com.glority.android.core.data.LogEventArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SplashAgreementFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/android/picturexx/splash/fragment/splash/CustomThrowable;", "", LogEventArguments.ARG_MESSAGE, "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
final class CustomThrowable extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomThrowable(String message, Throwable th) {
        super(message, th);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
