package com.glority.android.picturexx.splash;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Result;

/* compiled from: SplashController.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001f\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/splash/SplashController;", "", "<init>", "()V", "initializeFinished", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Result;", "", "getInitializeFinished", "()Landroidx/lifecycle/MutableLiveData;", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SplashController {
    public static final SplashController INSTANCE = new SplashController();
    private static final MutableLiveData<Result<Boolean>> initializeFinished = new MutableLiveData<>(null);
    public static final int $stable = 8;

    private SplashController() {
    }

    public final MutableLiveData<Result<Boolean>> getInitializeFinished() {
        return initializeFinished;
    }
}
