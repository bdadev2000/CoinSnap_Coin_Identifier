package com.glority.android.picturexx.splash.fragment.splash;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LifecycleOwnerKt;
import com.glority.android.base.agreement.util.AgreementPersistKey;
import com.glority.android.base.agreement.view.PrivacyPolicyFragment;
import com.glority.android.base.agreement.view.TermsOfUseFragment;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.init.InitGrade;
import com.glority.android.core.route.adjust.EnableAdjustDataCollectionRequest;
import com.glority.android.core.route.agreement.AgreeAgreementRequest;
import com.glority.android.core.route.agreement.IsCookieControlEnabledRequest;
import com.glority.android.core.route.analysis.EnableAppDataCollectionRequest;
import com.glority.android.core.route.analysis.EnableFirebaseDataCollectionRequest;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.route.analysis.LogExceptionRequest;
import com.glority.android.core.route.network.GetUserIdRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.picturexx.splash.R;
import com.glority.android.picturexx.splash.SplashController;
import com.glority.android.picturexx.splash.databinding.FragmentSplashAgreementBinding;
import com.glority.base.fragment.BaseFragment;
import com.glority.utils.app.ResUtils;
import com.glority.utils.ui.ToastUtils;
import com.google.android.exoplayer2.SimpleExoPlayer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SplashAgreementFragment.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0016J!\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/glority/android/picturexx/splash/fragment/splash/SplashAgreementFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/splash/databinding/FragmentSplashAgreementBinding;", "<init>", "()V", "startTs", "", "disableBack", "", "getLogPageName", "", "getLayoutId", "", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "navigate", "onDestroy", "logPageEvent", NotificationCompat.CATEGORY_EVENT, "time", "", "(Ljava/lang/String;Ljava/lang/Double;)V", "Companion", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SplashAgreementFragment extends BaseFragment<FragmentSplashAgreementBinding> {
    public static final int ON_BACK_CLICK_CODE = 100001;
    public static final int $stable = 8;
    private static final String KEY_ENABLE_BACK = "enableBack";
    private long startTs = System.currentTimeMillis();
    private boolean disableBack = true;

    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    protected String getPageName() {
        return "agreement";
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_splash_agreement;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        this.startTs = System.currentTimeMillis();
        logPageEvent$default(this, "open", null, 2, null);
        Bundle arguments = getArguments();
        this.disableBack = arguments != null ? arguments.getBoolean(KEY_ENABLE_BACK, true) : true;
        String string = ResUtils.getString(R.string.agreement_protocol_termsofuse);
        String string2 = ResUtils.getString(R.string.agreement_protocol_privacypolicy);
        String string3 = ResUtils.getString(R.string.agreement_text_policy_tapping_continue, string, string2);
        String str = string3;
        SpannableString spannableString = new SpannableString(str);
        Intrinsics.checkNotNull(string3);
        Intrinsics.checkNotNull(string);
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, string, 0, false, 6, (Object) null);
        spannableString.setSpan(new ClickableSpan() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashAgreementFragment$doCreateView$1
            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                Intrinsics.checkNotNullParameter(widget, "widget");
                SplashAgreementFragment.logPageEvent$default(SplashAgreementFragment.this, "terms_of_use", null, 2, null);
                TermsOfUseFragment.Companion companion = TermsOfUseFragment.INSTANCE;
                FragmentActivity activity = SplashAgreementFragment.this.getActivity();
                if (activity == null) {
                    return;
                }
                TermsOfUseFragment.Companion.open$default(companion, activity, false, 2, null);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint ds) {
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(ResUtils.getColor(R.color.agreement_first_page_link_text_color));
                ds.setUnderlineText(true);
            }
        }, indexOf$default, string.length() + indexOf$default, 33);
        Intrinsics.checkNotNull(string2);
        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str, string2, 0, false, 6, (Object) null);
        spannableString.setSpan(new ClickableSpan() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashAgreementFragment$doCreateView$2
            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                Intrinsics.checkNotNullParameter(widget, "widget");
                SplashAgreementFragment.logPageEvent$default(SplashAgreementFragment.this, "privacy_policy", null, 2, null);
                PrivacyPolicyFragment.Companion companion = PrivacyPolicyFragment.INSTANCE;
                FragmentActivity activity = SplashAgreementFragment.this.getActivity();
                if (activity == null) {
                    return;
                }
                PrivacyPolicyFragment.Companion.open$default(companion, activity, false, 2, null);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint ds) {
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(ResUtils.getColor(R.color.agreement_first_page_link_text_color));
                ds.setUnderlineText(true);
            }
        }, indexOf$default2, string2.length() + indexOf$default2, 33);
        TextView textView = ((FragmentSplashAgreementBinding) getBinding()).tvPolicyHint;
        textView.setText(spannableString);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        TextView tvPolicyContinue = ((FragmentSplashAgreementBinding) getBinding()).tvPolicyContinue;
        Intrinsics.checkNotNullExpressionValue(tvPolicyContinue, "tvPolicyContinue");
        ViewExtensionsKt.setSingleClickListener$default(tvPolicyContinue, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashAgreementFragment$doCreateView$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                SplashAgreementFragment.logPageEvent$default(SplashAgreementFragment.this, "continue", null, 2, null);
                new AgreeAgreementRequest().execute();
                if (new IsCookieControlEnabledRequest().toResult() == null) {
                    PersistData.INSTANCE.set(AgreementPersistKey.AGREEMENT_COOKIE_CONTROL_ENABLED, true);
                    InitGrade.INSTANCE.isPrivacyAgreed().postValue(true);
                    Long result = new GetUserIdRequest().toResult();
                    new EnableFirebaseDataCollectionRequest(true, result != null ? result.toString() : null).execute();
                    new EnableAdjustDataCollectionRequest(true).execute();
                    new EnableAppDataCollectionRequest(true).execute();
                }
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(SplashAgreementFragment.this), null, null, new AnonymousClass1(SplashAgreementFragment.this, null), 3, null);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SplashAgreementFragment.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
            @DebugMetadata(c = "com.glority.android.picturexx.splash.fragment.splash.SplashAgreementFragment$doCreateView$4$1", f = "SplashAgreementFragment.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.glority.android.picturexx.splash.fragment.splash.SplashAgreementFragment$doCreateView$4$1, reason: invalid class name */
            /* loaded from: classes5.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ SplashAgreementFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SplashAgreementFragment splashAgreementFragment, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = splashAgreementFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        com.glority.android.ui.base.v2.BaseFragment.showProgress$default(this.this$0, null, false, 1, null);
                        Flow filterNotNull = FlowKt.filterNotNull(FlowLiveDataConversions.asFlow(SplashController.INSTANCE.getInitializeFinished()));
                        final SplashAgreementFragment splashAgreementFragment = this.this$0;
                        this.label = 1;
                        if (filterNotNull.collect(new FlowCollector() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashAgreementFragment.doCreateView.4.1.1
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public final Object emit(Object obj2, Continuation<? super Unit> continuation) {
                                Result result = (Result) obj2;
                                if (Result.m8281isSuccessimpl(result.getValue())) {
                                    SplashAgreementFragment.this.navigate();
                                } else {
                                    SplashAgreementFragment.this.hideProgress();
                                    Throwable m8277exceptionOrNullimpl = Result.m8277exceptionOrNullimpl(result.getValue());
                                    new LogExceptionRequest(new CustomThrowable("Glority Splash Init Message Requested Failed" + (m8277exceptionOrNullimpl != null ? m8277exceptionOrNullimpl.getMessage() : null), m8277exceptionOrNullimpl)).execute();
                                    ToastUtils.showShort(R.string.error_text_internal_error);
                                }
                                return Unit.INSTANCE;
                            }
                        }, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
        }, 1, (Object) null);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashAgreementFragment$doCreateView$5
            private long lastClickTimestamp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.lastClickTimestamp > SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS) {
                    ToastUtils.showShort(R.string.text_continue_tap_to_close_app);
                } else {
                    FragmentActivity activity = SplashAgreementFragment.this.getActivity();
                    if (activity != null) {
                        activity.setResult(100001);
                    }
                    ViewExtensionsKt.finish(SplashAgreementFragment.this);
                }
                this.lastClickTimestamp = currentTimeMillis;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigate() {
        hideProgress();
        ViewExtensionsKt.navigate$default(this, R.id.action_fragment_splash_agreement_to_fragment_splash_onboarding, null, null, null, 14, null);
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        logPageEvent("view_time", Double.valueOf((System.currentTimeMillis() - this.startTs) / 1000.0d));
        logPageEvent$default(this, "close", null, 2, null);
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void logPageEvent$default(SplashAgreementFragment splashAgreementFragment, String str, Double d, int i, Object obj) {
        if ((i & 2) != 0) {
            d = null;
        }
        splashAgreementFragment.logPageEvent(str, d);
    }

    private final void logPageEvent(String event, Double time) {
        new LogEventRequest("gl_agreement", LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("name", event), TuplesKt.to("type", event), TuplesKt.to("time", time))).post();
    }
}
