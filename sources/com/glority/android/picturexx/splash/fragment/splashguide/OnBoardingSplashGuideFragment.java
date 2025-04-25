package com.glority.android.picturexx.splash.fragment.splashguide;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.FragmentActivity;
import com.glority.android.app.BuildConfig;
import com.glority.android.core.app.AppContext;
import com.glority.android.picturexx.splash.R;
import com.glority.android.picturexx.splash.SplashGuideOnboardingKt;
import com.glority.android.picturexx.splash.databinding.FragmentSplashGuideOnBoardingBinding;
import com.glority.base.fragment.BaseFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;

/* compiled from: SplashGuideAnimationFragment.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0014J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\nH\u0002¨\u0006\u000e"}, d2 = {"Lcom/glority/android/picturexx/splash/fragment/splashguide/OnBoardingSplashGuideFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/splash/databinding/FragmentSplashGuideOnBoardingBinding;", "<init>", "()V", "getLayoutId", "", "getLogPageName", "", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "onAnimationFinish", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class OnBoardingSplashGuideFragment extends BaseFragment<FragmentSplashGuideOnBoardingBinding> {
    public static final int $stable = 0;

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_splash_guide_on_boarding;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected String getLogPageName() {
        return "onboarding";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        ((FragmentSplashGuideOnBoardingBinding) getBinding()).composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1274244557, true, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.fragment.splashguide.OnBoardingSplashGuideFragment$doCreateView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1274244557, i, -1, "com.glority.android.picturexx.splash.fragment.splashguide.OnBoardingSplashGuideFragment.doCreateView.<anonymous> (SplashGuideAnimationFragment.kt:25)");
                    }
                    BackHandlerKt.BackHandler(true, new Function0<Unit>() { // from class: com.glority.android.picturexx.splash.fragment.splashguide.OnBoardingSplashGuideFragment$doCreateView$1.1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }
                    }, composer, 54, 0);
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    OnBoardingSplashGuideFragment onBoardingSplashGuideFragment = OnBoardingSplashGuideFragment.this;
                    composer.startReplaceableGroup(1260191394);
                    boolean changed = composer.changed(onBoardingSplashGuideFragment);
                    OnBoardingSplashGuideFragment$doCreateView$1$2$1 rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new OnBoardingSplashGuideFragment$doCreateView$1$2$1(onBoardingSplashGuideFragment);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    SplashGuideOnboardingKt.SplashGuideOnboarding(fillMaxSize$default, (Function0) ((KFunction) rememberedValue), composer, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }));
        TextView tvSkip = ((FragmentSplashGuideOnBoardingBinding) getBinding()).tvSkip;
        Intrinsics.checkNotNullExpressionValue(tvSkip, "tvSkip");
        tvSkip.setVisibility(StringsKt.startsWith(AppContext.INSTANCE.getConfig("ENV"), BuildConfig.ENV, true) ^ true ? 0 : 8);
        ((FragmentSplashGuideOnBoardingBinding) getBinding()).tvSkip.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.splash.fragment.splashguide.OnBoardingSplashGuideFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnBoardingSplashGuideFragment.doCreateView$lambda$0(OnBoardingSplashGuideFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doCreateView$lambda$0(OnBoardingSplashGuideFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onAnimationFinish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAnimationFinish() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
