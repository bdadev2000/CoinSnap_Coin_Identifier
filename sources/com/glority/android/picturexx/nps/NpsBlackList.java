package com.glority.android.picturexx.nps;

import com.glority.android.base.agreement.view.AgreementFragment;
import com.glority.android.picturexx.recognize.fragment.CaptureFragment;
import com.glority.android.picturexx.recognize.fragment.ResultFragment;
import com.glority.android.picturexx.splash.DeeplinkHandlerActivity;
import com.glority.android.picturexx.splash.SplashActivity;
import com.glority.android.picturexx.splash.SplashOnboardingActivity;
import com.glority.android.picturexx.splash.fragment.splash.SplashAgreementFragment;
import com.glority.android.picturexx.splash.fragment.splash.SplashFragment;
import com.glority.android.picturexx.splash.fragment.splashguide.OnBoardingSplashGuideFragment;
import com.glority.imagepicker.MultiImageSelectorActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: NpsBlackList.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001f\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/glority/android/picturexx/nps/NpsBlackList;", "", "<init>", "()V", "blackList", "", "Ljava/lang/Class;", "getBlackList", "()Ljava/util/List;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class NpsBlackList {
    public static final NpsBlackList INSTANCE = new NpsBlackList();
    private static final List<Class<? extends Object>> blackList = CollectionsKt.listOf((Object[]) new Class[]{CaptureFragment.class, MultiImageSelectorActivity.class, ResultFragment.class, SplashActivity.class, SplashFragment.class, SplashOnboardingActivity.class, OnBoardingSplashGuideFragment.class, SplashAgreementFragment.class, DeeplinkHandlerActivity.class, AgreementFragment.class});
    public static final int $stable = 8;

    private NpsBlackList() {
    }

    public final List<Class<? extends Object>> getBlackList() {
        return blackList;
    }
}
