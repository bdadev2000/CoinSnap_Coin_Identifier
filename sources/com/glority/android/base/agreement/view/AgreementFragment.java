package com.glority.android.base.agreement.view;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.glority.android.base.agreement.R;
import com.glority.android.base.agreement.util.LogEventUtil;
import com.glority.android.base.agreement.view.PrivacyPolicyFragment;
import com.glority.android.base.agreement.view.TermsOfUseFragment;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.agreement.AgreeAgreementRequest;
import com.glority.android.ui.base.BackEventResolver;
import com.glority.android.ui.base.BaseFragment;
import com.glority.android.ui.base.ContainerActivity;
import com.glority.android.ui.base.FragmentHelper;
import com.glority.utils.app.ResUtils;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AgreementFragment.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\u000fH\u0014J!\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\tH\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/glority/android/base/agreement/view/AgreementFragment;", "Lcom/glority/android/ui/base/BaseFragment;", "Lcom/glority/android/ui/base/BackEventResolver;", "()V", "disableBack", "", "startTs", "", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "getLayoutId", "", "getLogPageName", "", "logPageEvent", NotificationCompat.CATEGORY_EVENT, "time", "", "(Ljava/lang/String;Ljava/lang/Double;)V", "onDestroy", "resolveBackEvent", "Companion", "base-agreement_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class AgreementFragment extends BaseFragment implements BackEventResolver {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String KEY_ENABLE_BACK = "enableBack";
    public static final int ON_BACK_CLICK_CODE = 100001;
    private HashMap _$_findViewCache;
    private long startTs = System.currentTimeMillis();
    private boolean disableBack = true;

    @Override // com.glority.android.ui.base.BaseFragment
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View rootView = getRootView();
        if (rootView == null) {
            return null;
        }
        View findViewById = rootView.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.glority.android.ui.base.BaseFragment
    protected String getLogPageName() {
        return "agreement";
    }

    @Override // com.glority.android.ui.base.BaseFragment
    protected int getLayoutId() {
        return R.layout.agreement_fragment_agreement;
    }

    @Override // com.glority.android.ui.base.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        this.startTs = System.currentTimeMillis();
        logPageEvent$default(this, "open", null, 2, null);
        Bundle arguments = getArguments();
        final boolean z = true;
        this.disableBack = arguments != null ? arguments.getBoolean(KEY_ENABLE_BACK, true) : true;
        String termsOfUse = ResUtils.getString(R.string.agreement_protocol_termsofuse);
        String privacyPolicy = ResUtils.getString(R.string.agreement_protocol_privacypolicy);
        String policyHint = ResUtils.getString(R.string.agreement_text_policy_tapping_continue, termsOfUse, privacyPolicy);
        String str = policyHint;
        SpannableString spannableString = new SpannableString(str);
        Intrinsics.checkNotNullExpressionValue(policyHint, "policyHint");
        Intrinsics.checkNotNullExpressionValue(termsOfUse, "termsOfUse");
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, termsOfUse, 0, false, 6, (Object) null);
        spannableString.setSpan(new ClickableSpan() { // from class: com.glority.android.base.agreement.view.AgreementFragment$doCreateView$1
            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                Intrinsics.checkNotNullParameter(widget, "widget");
                AgreementFragment.logPageEvent$default(AgreementFragment.this, "terms_of_use", null, 2, null);
                TermsOfUseFragment.Companion companion = TermsOfUseFragment.INSTANCE;
                FragmentActivity activity = AgreementFragment.this.getActivity();
                if (activity != null) {
                    Intrinsics.checkNotNullExpressionValue(activity, "activity ?: return");
                    TermsOfUseFragment.Companion.open$default(companion, activity, false, 2, null);
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint ds) {
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(ResUtils.getColor(R.color.agreement_first_page_link_text_color));
                ds.setUnderlineText(true);
            }
        }, indexOf$default, termsOfUse.length() + indexOf$default, 33);
        Intrinsics.checkNotNullExpressionValue(privacyPolicy, "privacyPolicy");
        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str, privacyPolicy, 0, false, 6, (Object) null);
        spannableString.setSpan(new ClickableSpan() { // from class: com.glority.android.base.agreement.view.AgreementFragment$doCreateView$2
            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                Intrinsics.checkNotNullParameter(widget, "widget");
                AgreementFragment.logPageEvent$default(AgreementFragment.this, "privacy_policy", null, 2, null);
                PrivacyPolicyFragment.Companion companion = PrivacyPolicyFragment.INSTANCE;
                FragmentActivity activity = AgreementFragment.this.getActivity();
                if (activity != null) {
                    Intrinsics.checkNotNullExpressionValue(activity, "activity ?: return");
                    PrivacyPolicyFragment.Companion.open$default(companion, activity, false, 2, null);
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint ds) {
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(ResUtils.getColor(R.color.agreement_first_page_link_text_color));
                ds.setUnderlineText(true);
            }
        }, indexOf$default2, privacyPolicy.length() + indexOf$default2, 33);
        TextView textView = (TextView) _$_findCachedViewById(R.id.tv_policy_hint);
        textView.setText(spannableString);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        TextView tv_policy_continue = (TextView) _$_findCachedViewById(R.id.tv_policy_continue);
        Intrinsics.checkNotNullExpressionValue(tv_policy_continue, "tv_policy_continue");
        ViewExtensionsKt.setSingleClickListener$default(tv_policy_continue, 0L, new Function1<View, Unit>() { // from class: com.glority.android.base.agreement.view.AgreementFragment$doCreateView$4
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
                AgreementFragment.logPageEvent$default(AgreementFragment.this, "continue", null, 2, null);
                new AgreeAgreementRequest().post();
                ViewExtensionsKt.finish(AgreementFragment.this);
            }
        }, 1, (Object) null);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        requireActivity.getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(z) { // from class: com.glority.android.base.agreement.view.AgreementFragment$doCreateView$5
            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                FragmentActivity activity = AgreementFragment.this.getActivity();
                if (activity != null) {
                    activity.setResult(100001);
                }
                ViewExtensionsKt.finish(AgreementFragment.this);
            }
        });
    }

    @Override // com.glority.android.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        logPageEvent("view_time", Double.valueOf((System.currentTimeMillis() - this.startTs) / 1000.0d));
        logPageEvent$default(this, "close", null, 2, null);
        super.onDestroy();
    }

    @Override // com.glority.android.ui.base.BackEventResolver
    /* renamed from: resolveBackEvent, reason: from getter */
    public boolean getDisableBack() {
        return this.disableBack;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void logPageEvent$default(AgreementFragment agreementFragment, String str, Double d, int i, Object obj) {
        if ((i & 2) != 0) {
            d = null;
        }
        agreementFragment.logPageEvent(str, d);
    }

    private final void logPageEvent(String event, Double time) {
        LogEventUtil.INSTANCE.logEvent(getLogPageName(), event, time);
    }

    /* compiled from: AgreementFragment.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/glority/android/base/agreement/view/AgreementFragment$Companion;", "", "()V", "KEY_ENABLE_BACK", "", "ON_BACK_CLICK_CODE", "", "open", "", "activity", "Landroid/app/Activity;", "disableBack", "", "requestCode", "(Landroid/app/Activity;ZLjava/lang/Integer;)V", "base-agreement_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void open$default(Companion companion, Activity activity, boolean z, Integer num, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                num = null;
            }
            companion.open(activity, z, num);
        }

        public final void open(Activity activity, boolean disableBack, Integer requestCode) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            FragmentHelper.Builder.launch$default(ContainerActivity.INSTANCE.open(AgreementFragment.class).put(AgreementFragment.KEY_ENABLE_BACK, disableBack), activity, requestCode, (ActivityOptionsCompat) null, 4, (Object) null);
        }
    }
}
