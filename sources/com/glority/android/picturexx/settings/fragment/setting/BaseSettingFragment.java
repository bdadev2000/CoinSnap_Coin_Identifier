package com.glority.android.picturexx.settings.fragment.setting;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.os.BundleKt;
import androidx.databinding.ViewDataBinding;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.agreement.NeedUpdateAgreementRequest;
import com.glority.android.core.route.agreement.OpenPrivacyPolicyPageRequest;
import com.glority.android.core.route.agreement.OpenTermsOfUsePageRequest;
import com.glority.android.core.route.debugtool.EnableDebugToolRequest;
import com.glority.android.core.route.guide.GuideRestoreRequest;
import com.glority.android.picturexx.settings.R;
import com.glority.android.picturexx.settings.fragment.setting.AboutFragment;
import com.glority.android.picturexx.settings.fragment.setting.PremiumServiceFragment;
import com.glority.android.picturexx.settings.logevents.SettingsLogEvents;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.logs.LogEvents;
import com.glority.base.routers.OpenAccountActivityRequest;
import com.glority.base.routers.OpenManageMembershipActivityRequest;
import com.glority.base.routers.OpenNPSRequest;
import com.glority.base.routers.OpenPremiumCenterFragmentRequest;
import com.glority.base.share.ShareUtil;
import com.glority.base.utils.SystemUtil;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.base.widget.SettingItem;
import com.glority.billing.utils.PaymentUtils;
import com.glority.component.generatedAPI.kotlinAPI.user.User;
import com.glority.component.generatedAPI.kotlinAPI.vip.VipInfo;
import com.glority.utils.app.ResUtils;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseSettingFragment.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010TH\u0014J\b\u0010U\u001a\u00020RH\u0002J\b\u0010V\u001a\u00020RH\u0002J\b\u0010W\u001a\u00020RH\u0016J\b\u0010X\u001a\u00020RH\u0002J\b\u0010Y\u001a\u00020RH\u0016J\b\u0010Z\u001a\u00020[H\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\rX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001a\u0010!\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\u001a\u0010$\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001a\u0010'\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR\u001a\u0010*\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR\u001a\u0010-\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0018\"\u0004\b/\u0010\u001aR\u001a\u00100\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR\u001a\u00103\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0018\"\u0004\b5\u0010\u001aR\u001a\u00106\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0018\"\u0004\b8\u0010\u001aR\u001a\u00109\u001a\u00020\rX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u000f\"\u0004\b;\u0010\u0011R\u001a\u0010<\u001a\u00020\rX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u000f\"\u0004\b>\u0010\u0011R\u001a\u0010?\u001a\u00020\rX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u000f\"\u0004\bA\u0010\u0011R\u001a\u0010B\u001a\u00020CX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010H\u001a\u00020\rX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u000f\"\u0004\bJ\u0010\u0011R\u001c\u0010K\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u000f\"\u0004\bM\u0010\u0011R\u001a\u0010N\u001a\u00020\rX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u000f\"\u0004\bP\u0010\u0011¨\u0006\\"}, d2 = {"Lcom/glority/android/picturexx/settings/fragment/setting/BaseSettingFragment;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/databinding/ViewDataBinding;", "Lcom/glority/base/fragment/BaseFragment;", "<init>", "()V", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "setToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "memberLl", "Landroid/view/View;", "getMemberLl", "()Landroid/view/View;", "setMemberLl", "(Landroid/view/View;)V", "accountLl", "getAccountLl", "setAccountLl", "vipSupportItem", "Lcom/glority/base/widget/SettingItem;", "getVipSupportItem", "()Lcom/glority/base/widget/SettingItem;", "setVipSupportItem", "(Lcom/glority/base/widget/SettingItem;)V", "membershipManageItem", "getMembershipManageItem", "setMembershipManageItem", "testingOptions", "getTestingOptions", "setTestingOptions", "newTermsOfUseItem", "getNewTermsOfUseItem", "setNewTermsOfUseItem", "accountItem", "getAccountItem", "setAccountItem", "aboutItem", "getAboutItem", "setAboutItem", "settingShare", "getSettingShare", "setSettingShare", "suggestionItem", "getSuggestionItem", "setSuggestionItem", "privacyItem", "getPrivacyItem", "setPrivacyItem", "termItem", "getTermItem", "setTermItem", "rateItem", "getRateItem", "setRateItem", "settingOpenPremiumCenter", "getSettingOpenPremiumCenter", "setSettingOpenPremiumCenter", "settingOpenPremiumWelcome", "getSettingOpenPremiumWelcome", "setSettingOpenPremiumWelcome", "settingOpenManageMembership", "getSettingOpenManageMembership", "setSettingOpenManageMembership", "enableDebugTool", "Landroidx/appcompat/widget/SwitchCompat;", "getEnableDebugTool", "()Landroidx/appcompat/widget/SwitchCompat;", "setEnableDebugTool", "(Landroidx/appcompat/widget/SwitchCompat;)V", "settingOpenConversionPage", "getSettingOpenConversionPage", "setSettingOpenConversionPage", "settingOpenNps", "getSettingOpenNps", "setSettingOpenNps", "restore", "getRestore", "setRestore", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "initToolbar", "initView", "onResume", "initClickEvents", "onDestroy", "getLogPageName", "", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public abstract class BaseSettingFragment<T extends ViewDataBinding> extends BaseFragment<T> {
    public SettingItem aboutItem;
    public SettingItem accountItem;
    public View accountLl;
    public SwitchCompat enableDebugTool;
    public View memberLl;
    public SettingItem membershipManageItem;
    public SettingItem newTermsOfUseItem;
    public SettingItem privacyItem;
    public SettingItem rateItem;
    public View restore;
    public View settingOpenConversionPage;
    public View settingOpenManageMembership;
    private View settingOpenNps;
    public View settingOpenPremiumCenter;
    public View settingOpenPremiumWelcome;
    public SettingItem settingShare;
    public SettingItem suggestionItem;
    public SettingItem termItem;
    public View testingOptions;
    public Toolbar toolbar;
    public SettingItem vipSupportItem;

    public final Toolbar getToolbar() {
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            return toolbar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("toolbar");
        return null;
    }

    public final void setToolbar(Toolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "<set-?>");
        this.toolbar = toolbar;
    }

    public final View getMemberLl() {
        View view = this.memberLl;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("memberLl");
        return null;
    }

    public final void setMemberLl(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.memberLl = view;
    }

    public final View getAccountLl() {
        View view = this.accountLl;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountLl");
        return null;
    }

    public final void setAccountLl(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.accountLl = view;
    }

    public final SettingItem getVipSupportItem() {
        SettingItem settingItem = this.vipSupportItem;
        if (settingItem != null) {
            return settingItem;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vipSupportItem");
        return null;
    }

    public final void setVipSupportItem(SettingItem settingItem) {
        Intrinsics.checkNotNullParameter(settingItem, "<set-?>");
        this.vipSupportItem = settingItem;
    }

    public final SettingItem getMembershipManageItem() {
        SettingItem settingItem = this.membershipManageItem;
        if (settingItem != null) {
            return settingItem;
        }
        Intrinsics.throwUninitializedPropertyAccessException("membershipManageItem");
        return null;
    }

    public final void setMembershipManageItem(SettingItem settingItem) {
        Intrinsics.checkNotNullParameter(settingItem, "<set-?>");
        this.membershipManageItem = settingItem;
    }

    public final View getTestingOptions() {
        View view = this.testingOptions;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("testingOptions");
        return null;
    }

    public final void setTestingOptions(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.testingOptions = view;
    }

    public final SettingItem getNewTermsOfUseItem() {
        SettingItem settingItem = this.newTermsOfUseItem;
        if (settingItem != null) {
            return settingItem;
        }
        Intrinsics.throwUninitializedPropertyAccessException("newTermsOfUseItem");
        return null;
    }

    public final void setNewTermsOfUseItem(SettingItem settingItem) {
        Intrinsics.checkNotNullParameter(settingItem, "<set-?>");
        this.newTermsOfUseItem = settingItem;
    }

    public final SettingItem getAccountItem() {
        SettingItem settingItem = this.accountItem;
        if (settingItem != null) {
            return settingItem;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountItem");
        return null;
    }

    public final void setAccountItem(SettingItem settingItem) {
        Intrinsics.checkNotNullParameter(settingItem, "<set-?>");
        this.accountItem = settingItem;
    }

    public final SettingItem getAboutItem() {
        SettingItem settingItem = this.aboutItem;
        if (settingItem != null) {
            return settingItem;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aboutItem");
        return null;
    }

    public final void setAboutItem(SettingItem settingItem) {
        Intrinsics.checkNotNullParameter(settingItem, "<set-?>");
        this.aboutItem = settingItem;
    }

    public final SettingItem getSettingShare() {
        SettingItem settingItem = this.settingShare;
        if (settingItem != null) {
            return settingItem;
        }
        Intrinsics.throwUninitializedPropertyAccessException("settingShare");
        return null;
    }

    public final void setSettingShare(SettingItem settingItem) {
        Intrinsics.checkNotNullParameter(settingItem, "<set-?>");
        this.settingShare = settingItem;
    }

    public final SettingItem getSuggestionItem() {
        SettingItem settingItem = this.suggestionItem;
        if (settingItem != null) {
            return settingItem;
        }
        Intrinsics.throwUninitializedPropertyAccessException("suggestionItem");
        return null;
    }

    public final void setSuggestionItem(SettingItem settingItem) {
        Intrinsics.checkNotNullParameter(settingItem, "<set-?>");
        this.suggestionItem = settingItem;
    }

    public final SettingItem getPrivacyItem() {
        SettingItem settingItem = this.privacyItem;
        if (settingItem != null) {
            return settingItem;
        }
        Intrinsics.throwUninitializedPropertyAccessException("privacyItem");
        return null;
    }

    public final void setPrivacyItem(SettingItem settingItem) {
        Intrinsics.checkNotNullParameter(settingItem, "<set-?>");
        this.privacyItem = settingItem;
    }

    public final SettingItem getTermItem() {
        SettingItem settingItem = this.termItem;
        if (settingItem != null) {
            return settingItem;
        }
        Intrinsics.throwUninitializedPropertyAccessException("termItem");
        return null;
    }

    public final void setTermItem(SettingItem settingItem) {
        Intrinsics.checkNotNullParameter(settingItem, "<set-?>");
        this.termItem = settingItem;
    }

    public final SettingItem getRateItem() {
        SettingItem settingItem = this.rateItem;
        if (settingItem != null) {
            return settingItem;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rateItem");
        return null;
    }

    public final void setRateItem(SettingItem settingItem) {
        Intrinsics.checkNotNullParameter(settingItem, "<set-?>");
        this.rateItem = settingItem;
    }

    public final View getSettingOpenPremiumCenter() {
        View view = this.settingOpenPremiumCenter;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("settingOpenPremiumCenter");
        return null;
    }

    public final void setSettingOpenPremiumCenter(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.settingOpenPremiumCenter = view;
    }

    public final View getSettingOpenPremiumWelcome() {
        View view = this.settingOpenPremiumWelcome;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("settingOpenPremiumWelcome");
        return null;
    }

    public final void setSettingOpenPremiumWelcome(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.settingOpenPremiumWelcome = view;
    }

    public final View getSettingOpenManageMembership() {
        View view = this.settingOpenManageMembership;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("settingOpenManageMembership");
        return null;
    }

    public final void setSettingOpenManageMembership(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.settingOpenManageMembership = view;
    }

    public final SwitchCompat getEnableDebugTool() {
        SwitchCompat switchCompat = this.enableDebugTool;
        if (switchCompat != null) {
            return switchCompat;
        }
        Intrinsics.throwUninitializedPropertyAccessException("enableDebugTool");
        return null;
    }

    public final void setEnableDebugTool(SwitchCompat switchCompat) {
        Intrinsics.checkNotNullParameter(switchCompat, "<set-?>");
        this.enableDebugTool = switchCompat;
    }

    public final View getSettingOpenConversionPage() {
        View view = this.settingOpenConversionPage;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("settingOpenConversionPage");
        return null;
    }

    public final void setSettingOpenConversionPage(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.settingOpenConversionPage = view;
    }

    public final View getSettingOpenNps() {
        return this.settingOpenNps;
    }

    public final void setSettingOpenNps(View view) {
        this.settingOpenNps = view;
    }

    public final View getRestore() {
        View view = this.restore;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("restore");
        return null;
    }

    public final void setRestore(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.restore = view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    public void doCreateView(Bundle savedInstanceState) {
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this, SettingsLogEvents.Settings, null, 2, null);
        try {
            initView();
            initToolbar();
            initClickEvents();
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    private final void initToolbar() {
        getToolbar().setTitle(R.string.setting_text_title);
        getToolbar().setNavigationOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.settings.fragment.setting.BaseSettingFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSettingFragment.initToolbar$lambda$1(BaseSettingFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initToolbar$lambda$1(BaseSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    private final void initView() {
        setToolbar((Toolbar) requireView().findViewById(R.id.toolbar));
        setMemberLl(requireView().findViewById(R.id.member_ll));
        setAccountLl(requireView().findViewById(R.id.account_ll));
        setVipSupportItem((SettingItem) requireView().findViewById(R.id.vip_support_item));
        setMembershipManageItem((SettingItem) requireView().findViewById(R.id.membership_manage_item));
        setTestingOptions(requireView().findViewById(R.id.testing_options));
        setNewTermsOfUseItem((SettingItem) requireView().findViewById(R.id.new_terms_of_use_item));
        setAccountItem((SettingItem) requireView().findViewById(R.id.account_item));
        setAboutItem((SettingItem) requireView().findViewById(R.id.about_item));
        setSettingShare((SettingItem) requireView().findViewById(R.id.setting_share));
        setSuggestionItem((SettingItem) requireView().findViewById(R.id.suggestion_item));
        setPrivacyItem((SettingItem) requireView().findViewById(R.id.privacy_item));
        setTermItem((SettingItem) requireView().findViewById(R.id.term_item));
        setSettingOpenPremiumCenter(requireView().findViewById(R.id.setting_open_premium_center));
        setSettingOpenPremiumWelcome(requireView().findViewById(R.id.setting_open_premium_welcome));
        setSettingOpenManageMembership(requireView().findViewById(R.id.setting_open_manage_membership));
        setEnableDebugTool((SwitchCompat) requireView().findViewById(R.id.enable_debug_tool));
        setSettingOpenConversionPage(requireView().findViewById(R.id.setting_open_conversion_page));
        setRateItem((SettingItem) requireView().findViewById(R.id.rate_item));
        setRestore(requireView().findViewById(R.id.restore_item));
        this.settingOpenNps = requireView().findViewById(R.id.setting_open_nps);
        getMemberLl().setVisibility(Intrinsics.areEqual(AppContext.INSTANCE.getConfig("enableMember"), "true") ? 0 : 8);
        getAccountLl().setVisibility(Intrinsics.areEqual(AppContext.INSTANCE.getConfig("enableLogin"), "true") ? 0 : 8);
        BaseSettingFragment<T> baseSettingFragment = this;
        AppViewModel.INSTANCE.getInstance().getVipInfo().observe(baseSettingFragment, new Observer() { // from class: com.glority.android.picturexx.settings.fragment.setting.BaseSettingFragment$$ExternalSyntheticLambda1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                BaseSettingFragment.initView$lambda$2(BaseSettingFragment.this, (VipInfo) obj);
            }
        });
        AppViewModel.INSTANCE.getInstance().getUser().observe(baseSettingFragment, new BaseSettingFragment$sam$androidx_lifecycle_Observer$0(new Function1<User, Unit>(this) { // from class: com.glority.android.picturexx.settings.fragment.setting.BaseSettingFragment$initView$2
            final /* synthetic */ BaseSettingFragment<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(User user) {
                invoke2(user);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(User user) {
                if (user != null && user.getGuestUser()) {
                    this.this$0.getAccountItem().setAlpha(1.0f);
                    this.this$0.getAccountItem().setClickable(true);
                    SettingItem accountItem = this.this$0.getAccountItem();
                    final BaseSettingFragment<T> baseSettingFragment2 = this.this$0;
                    ViewExtensionsKt.setSingleClickListener(accountItem, 600L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.setting.BaseSettingFragment$initView$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            com.glority.android.ui.base.v2.BaseFragment.logEvent$default(baseSettingFragment2, SettingsLogEvents.Settings_Account, null, 2, null);
                            new OpenAccountActivityRequest(null, null, 3, null).post();
                        }
                    });
                    this.this$0.getAccountItem().setTitle(this.this$0.getString(R.string.text_login) + " / " + this.this$0.getString(R.string.login_text_sign_up));
                    return;
                }
                this.this$0.getAccountItem().setAlpha(0.4f);
                this.this$0.getAccountItem().setClickable(false);
                this.this$0.getAccountItem().setTitle(R.string.login_text_sign_in);
            }
        }));
        if (AppViewModel.INSTANCE.isDebugMode()) {
            getTestingOptions().setVisibility(0);
        } else {
            getTestingOptions().setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(BaseSettingFragment this$0, VipInfo vipInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean isVip = vipInfo != null ? vipInfo.getIsVip() : false;
        if (!isVip && !PaymentUtils.INSTANCE.isPaddingVip()) {
            this$0.getVipSupportItem().setSubtitle(ResUtils.getString(R.string.setting_cell_my_premium_service_membership) + ResUtils.getString(R.string.setting_cell_my_premium_service_free));
        } else {
            this$0.getMembershipManageItem().setVisibility(isVip ? 0 : 8);
            this$0.getVipSupportItem().setSubtitle(ResUtils.getString(R.string.setting_cell_my_premium_service_membership) + ResUtils.getString(R.string.setting_cell_my_premium_service_gold));
        }
        this$0.getRestore().setVisibility(!isVip && !PaymentUtils.INSTANCE.isPaddingVip() ? 0 : 8);
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (new NeedUpdateAgreementRequest().toResult().booleanValue()) {
            getNewTermsOfUseItem().setVisibility(0);
        } else {
            getNewTermsOfUseItem().setVisibility(8);
        }
    }

    private final void initClickEvents() {
        getVipSupportItem().setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.settings.fragment.setting.BaseSettingFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSettingFragment.initClickEvents$lambda$3(BaseSettingFragment.this, view);
            }
        });
        getMembershipManageItem().setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.settings.fragment.setting.BaseSettingFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSettingFragment.initClickEvents$lambda$4(BaseSettingFragment.this, view);
            }
        });
        getAboutItem().setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.settings.fragment.setting.BaseSettingFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSettingFragment.initClickEvents$lambda$5(BaseSettingFragment.this, view);
            }
        });
        ViewExtensionsKt.setSingleClickListener$default(getSettingShare(), 0L, new Function1<View, Unit>(this) { // from class: com.glority.android.picturexx.settings.fragment.setting.BaseSettingFragment$initClickEvents$4
            final /* synthetic */ BaseSettingFragment<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this.this$0, SettingsLogEvents.Settings_Share_To_Friends, null, 2, null);
                ShareUtil.INSTANCE.shareAPP(this.this$0.getContext());
            }
        }, 1, (Object) null);
        ViewExtensionsKt.setSingleClickListener$default(getSuggestionItem(), 0L, new Function1<View, Unit>(this) { // from class: com.glority.android.picturexx.settings.fragment.setting.BaseSettingFragment$initClickEvents$5
            final /* synthetic */ BaseSettingFragment<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this.this$0, SettingsLogEvents.Settings_Suggestions, null, 2, null);
                FragmentActivity activity = this.this$0.getActivity();
                if (activity != null) {
                    ShareUtil.INSTANCE.sendEmail(activity);
                }
            }
        }, 1, (Object) null);
        getPrivacyItem().setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.settings.fragment.setting.BaseSettingFragment$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSettingFragment.initClickEvents$lambda$6(BaseSettingFragment.this, view);
            }
        });
        getTermItem().setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.settings.fragment.setting.BaseSettingFragment$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSettingFragment.initClickEvents$lambda$7(BaseSettingFragment.this, view);
            }
        });
        getRateItem().setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.settings.fragment.setting.BaseSettingFragment$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSettingFragment.initClickEvents$lambda$8(BaseSettingFragment.this, view);
            }
        });
        ViewExtensionsKt.setSingleClickListener$default(getNewTermsOfUseItem(), 0L, new Function1<View, Unit>(this) { // from class: com.glority.android.picturexx.settings.fragment.setting.BaseSettingFragment$initClickEvents$9
            final /* synthetic */ BaseSettingFragment<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this.this$0, SettingsLogEvents.Settings_New_Terms_Of_Use, null, 2, null);
                new OpenTermsOfUsePageRequest(true).post();
            }
        }, 1, (Object) null);
        ViewExtensionsKt.setSingleClickListener$default(getRestore(), 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.setting.BaseSettingFragment$initClickEvents$10
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                new GuideRestoreRequest(false, null, 3, null).post();
            }
        }, 1, (Object) null);
        ViewExtensionsKt.setSingleClickListener$default(getSettingOpenPremiumCenter(), 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.setting.BaseSettingFragment$initClickEvents$11
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                PremiumServiceFragment.Companion companion = PremiumServiceFragment.INSTANCE;
                Context context = it.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                companion.open(context);
            }
        }, 1, (Object) null);
        ViewExtensionsKt.setSingleClickListener$default(getSettingOpenPremiumWelcome(), 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.setting.BaseSettingFragment$initClickEvents$12
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }
        }, 1, (Object) null);
        ViewExtensionsKt.setSingleClickListener$default(getSettingOpenManageMembership(), 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.setting.BaseSettingFragment$initClickEvents$13
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                new OpenManageMembershipActivityRequest(OpenManageMembershipActivityRequest.FROM_SETTINGS_MANAGE_MEMBERSHIP, null, 2, null).post();
            }
        }, 1, (Object) null);
        getEnableDebugTool().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.glority.android.picturexx.settings.fragment.setting.BaseSettingFragment$$ExternalSyntheticLambda8
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                BaseSettingFragment.initClickEvents$lambda$9(compoundButton, z);
            }
        });
        ViewExtensionsKt.setSingleClickListener$default(getSettingOpenConversionPage(), 0L, new Function1<View, Unit>(this) { // from class: com.glority.android.picturexx.settings.fragment.setting.BaseSettingFragment$initClickEvents$15
            final /* synthetic */ BaseSettingFragment<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                new ConversionPageInputDialog().show(this.this$0.getSupportFragmentManager(), "ConversionPageInputDialog");
            }
        }, 1, (Object) null);
        View view = this.settingOpenNps;
        if (view != null) {
            ViewExtensionsKt.setSingleClickListener$default(view, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.setting.BaseSettingFragment$initClickEvents$16
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                    invoke2(view2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    new OpenNPSRequest().post();
                }
            }, 1, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickEvents$lambda$3(BaseSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Pair[] pairArr = new Pair[1];
        pairArr[0] = TuplesKt.to("type", AppViewModel.INSTANCE.isVip() ? LogEvents.ARG_IS_VIP : LogEvents.ARG_IS_NOT_VIP);
        this$0.logEvent(SettingsLogEvents.Settings_VipSupport, BundleKt.bundleOf(pairArr));
        new OpenPremiumCenterFragmentRequest(OpenPremiumCenterFragmentRequest.FROM_SETTING_MY_PREMIUM_SERVICE).post();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickEvents$lambda$4(BaseSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this$0, SettingsLogEvents.Settings_Manage_Membership, null, 2, null);
        new OpenManageMembershipActivityRequest(OpenManageMembershipActivityRequest.FROM_SETTINGS_MANAGE_MEMBERSHIP, null, 2, null).post();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickEvents$lambda$5(BaseSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this$0, SettingsLogEvents.Settings_About_Us, null, 2, null);
        AboutFragment.Companion companion = AboutFragment.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        companion.open(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickEvents$lambda$6(BaseSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this$0, SettingsLogEvents.Settings_Privacy, null, 2, null);
        new OpenPrivacyPolicyPageRequest(true).post();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickEvents$lambda$7(BaseSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this$0, SettingsLogEvents.Settings_Terms_Of_Services, null, 2, null);
        new OpenTermsOfUsePageRequest(false, 1, null).post();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickEvents$lambda$8(BaseSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this$0, SettingsLogEvents.Settings_Rate_And_Review, null, 2, null);
        SystemUtil.INSTANCE.startMarket(this$0.getActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickEvents$lambda$9(CompoundButton compoundButton, boolean z) {
        new EnableDebugToolRequest(z).post();
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this, SettingsLogEvents.Settings_Close, null, 2, null);
        super.onDestroy();
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    protected String getPageName() {
        return SettingsLogEvents.Settings;
    }
}
