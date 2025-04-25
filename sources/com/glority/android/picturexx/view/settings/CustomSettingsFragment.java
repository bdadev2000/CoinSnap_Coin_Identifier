package com.glority.android.picturexx.view.settings;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.core.utils.device.CorePersistKey;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.CustomFragmentSettingBinding;
import com.glority.android.picturexx.constants.BusinessConstants;
import com.glority.android.picturexx.payment.billingUI.BillingGuideUtils;
import com.glority.android.picturexx.settings.fragment.setting.BaseSettingFragment;
import com.glority.android.picturexx.utils.CoinConfigUtils;
import com.glority.android.picturexx.view.dialog.ChangeCurrencyDialog;
import com.glority.android.picturexx.view.settings.CustomFAQAndHelpFragment;
import com.glority.android.picturexx.vm.NoteSnapViewModel;
import com.glority.android.ui.base.ContainerActivity;
import com.glority.android.ui.base.v2.BaseFragment;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.routers.OpenHowToReminderActivityRequest;
import com.glority.base.routers.OpenNoNotificationActivityRequest;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.base.widget.SettingItem;
import com.glority.utils.ui.ToastUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: CustomSettingsFragment.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/glority/android/picturexx/view/settings/CustomSettingsFragment;", "Lcom/glority/android/picturexx/settings/fragment/setting/BaseSettingFragment;", "Lcom/glority/android/picturexx/business/databinding/CustomFragmentSettingBinding;", "<init>", "()V", "noteSnapViewModel", "Lcom/glority/android/picturexx/vm/NoteSnapViewModel;", "getNoteSnapViewModel", "()Lcom/glority/android/picturexx/vm/NoteSnapViewModel;", "noteSnapViewModel$delegate", "Lkotlin/Lazy;", "getLayoutId", "", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "setNoteSnapIcon", "showRedDot", "", "setDebugInfo", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CustomSettingsFragment extends BaseSettingFragment<CustomFragmentSettingBinding> {

    /* renamed from: noteSnapViewModel$delegate, reason: from kotlin metadata */
    private final Lazy noteSnapViewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final void open(Context context) {
        INSTANCE.open(context);
    }

    public CustomSettingsFragment() {
        final CustomSettingsFragment customSettingsFragment = this;
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.glority.android.picturexx.view.settings.CustomSettingsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.glority.android.picturexx.view.settings.CustomSettingsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) Function0.this.invoke();
            }
        });
        final Function0 function02 = null;
        this.noteSnapViewModel = FragmentViewModelLazyKt.createViewModelLazy(customSettingsFragment, Reflection.getOrCreateKotlinClass(NoteSnapViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.settings.CustomSettingsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStoreOwner m7538viewModels$lambda1;
                m7538viewModels$lambda1 = FragmentViewModelLazyKt.m7538viewModels$lambda1(Lazy.this);
                return m7538viewModels$lambda1.getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.settings.CustomSettingsFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                ViewModelStoreOwner m7538viewModels$lambda1;
                CreationExtras creationExtras;
                Function0 function03 = Function0.this;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                m7538viewModels$lambda1 = FragmentViewModelLazyKt.m7538viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m7538viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m7538viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.settings.CustomSettingsFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelStoreOwner m7538viewModels$lambda1;
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                m7538viewModels$lambda1 = FragmentViewModelLazyKt.m7538viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m7538viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m7538viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = Fragment.this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ CustomFragmentSettingBinding access$getBinding(CustomSettingsFragment customSettingsFragment) {
        return (CustomFragmentSettingBinding) customSettingsFragment.getBinding();
    }

    /* compiled from: CustomSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/picturexx/view/settings/CustomSettingsFragment$Companion;", "", "<init>", "()V", "open", "", "context", "Landroid/content/Context;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void open(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ContainerActivity.INSTANCE.open(CustomSettingsFragment.class).launch(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NoteSnapViewModel getNoteSnapViewModel() {
        return (NoteSnapViewModel) this.noteSnapViewModel.getValue();
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.custom_fragment_setting;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.picturexx.settings.fragment.setting.BaseSettingFragment, com.glority.android.ui.base.v2.BaseFragment
    public void doCreateView(Bundle savedInstanceState) {
        super.doCreateView(savedInstanceState);
        SettingItem helpItem = ((CustomFragmentSettingBinding) getBinding()).helpItem;
        Intrinsics.checkNotNullExpressionValue(helpItem, "helpItem");
        ViewExtensionsKt.setSingleClickListener$default(helpItem, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.settings.CustomSettingsFragment$doCreateView$1
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
                BaseFragment.logEvent$default(CustomSettingsFragment.this, LogEvents.settings_help_click, null, 2, null);
                CustomFAQAndHelpFragment.Companion companion = CustomFAQAndHelpFragment.Companion;
                Context context = it.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                companion.open(context);
            }
        }, 1, (Object) null);
        SettingItem settingOpenPurchasePushNotice = ((CustomFragmentSettingBinding) getBinding()).settingOpenPurchasePushNotice;
        Intrinsics.checkNotNullExpressionValue(settingOpenPurchasePushNotice, "settingOpenPurchasePushNotice");
        ViewExtensionsKt.setSingleClickListener$default(settingOpenPurchasePushNotice, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.settings.CustomSettingsFragment$doCreateView$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (NotificationManagerCompat.from(it.getContext()).areNotificationsEnabled()) {
                    new OpenHowToReminderActivityRequest(BillingGuideUtils.INSTANCE.getPurchaseLogEventBundle()).post();
                } else {
                    new OpenNoNotificationActivityRequest(BillingGuideUtils.INSTANCE.getPurchaseLogEventBundle()).post();
                }
            }
        }, 1, (Object) null);
        SettingItem settingOpenPurchasePushNotice2 = ((CustomFragmentSettingBinding) getBinding()).settingOpenPurchasePushNotice;
        Intrinsics.checkNotNullExpressionValue(settingOpenPurchasePushNotice2, "settingOpenPurchasePushNotice");
        settingOpenPurchasePushNotice2.setVisibility(AppViewModel.INSTANCE.isDebugMode() ? 0 : 8);
        SettingItem notesnapItem = ((CustomFragmentSettingBinding) getBinding()).notesnapItem;
        Intrinsics.checkNotNullExpressionValue(notesnapItem, "notesnapItem");
        notesnapItem.setVisibility(NoteSnapViewModel.INSTANCE.visibleNoteSnapOffer() ? 0 : 8);
        SettingItem notesnapItem2 = ((CustomFragmentSettingBinding) getBinding()).notesnapItem;
        Intrinsics.checkNotNullExpressionValue(notesnapItem2, "notesnapItem");
        ViewExtensionsKt.setSingleClickListener$default(notesnapItem2, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.settings.CustomSettingsFragment$doCreateView$3
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
                NoteSnapViewModel noteSnapViewModel;
                Intrinsics.checkNotNullParameter(it, "it");
                BaseFragment.logEvent$default(CustomSettingsFragment.this, LogEvents.settings_notesnapoffer_click, null, 2, null);
                NoteSnapViewModel.INSTANCE.getNoteSnapRedDotVisibleLiveData().postValue(false);
                PersistData.INSTANCE.set(BusinessConstants.KEY_NOTESNAP_SETTINGS_CLICK, true);
                noteSnapViewModel = CustomSettingsFragment.this.getNoteSnapViewModel();
                Context context = it.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                final CustomSettingsFragment customSettingsFragment = CustomSettingsFragment.this;
                noteSnapViewModel.openConvertPage(context, LogEvents.notesnapoffer, new Function1<NoteSnapViewModel.DismissType, Unit>() { // from class: com.glority.android.picturexx.view.settings.CustomSettingsFragment$doCreateView$3.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(NoteSnapViewModel.DismissType dismissType) {
                        invoke2(dismissType);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(NoteSnapViewModel.DismissType it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        if (it2 == NoteSnapViewModel.DismissType.CLAIM) {
                            SettingItem notesnapItem3 = CustomSettingsFragment.access$getBinding(CustomSettingsFragment.this).notesnapItem;
                            Intrinsics.checkNotNullExpressionValue(notesnapItem3, "notesnapItem");
                            notesnapItem3.setVisibility(8);
                        }
                    }
                });
            }
        }, 1, (Object) null);
        NoteSnapViewModel.INSTANCE.getNoteSnapRedDotVisibleLiveData().observe(this, new CustomSettingsFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.glority.android.picturexx.view.settings.CustomSettingsFragment$doCreateView$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) {
                CustomSettingsFragment.this.setNoteSnapIcon(Intrinsics.areEqual((Object) bool, (Object) true));
            }
        }));
        SettingItem currencyItem = ((CustomFragmentSettingBinding) getBinding()).currencyItem;
        Intrinsics.checkNotNullExpressionValue(currencyItem, "currencyItem");
        ViewExtensionsKt.setSingleClickListener$default(currencyItem, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.settings.CustomSettingsFragment$doCreateView$5
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
                CustomSettingsFragment.this.logEvent(LogEvents.settings_currency_click, BundleKt.bundleOf(TuplesKt.to(LogEventArguments.ARG_STRING_1, CoinConfigUtils.INSTANCE.getCountryCode())));
                ChangeCurrencyDialog.Companion.open(CustomSettingsFragment.this.getSupportFragmentManager());
            }
        }, 1, (Object) null);
        setDebugInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setNoteSnapIcon(boolean showRedDot) {
        ((CustomFragmentSettingBinding) getBinding()).notesnapItem.setIcon(showRedDot ? R.drawable.icon_settings_notesnap_reddot : R.drawable.icon_settings_notesnap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setDebugInfo() {
        final long userId = AppViewModel.INSTANCE.getUserId();
        ((CustomFragmentSettingBinding) getBinding()).tvUserId.setText(String.valueOf(userId));
        ((CustomFragmentSettingBinding) getBinding()).tvUserId.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.glority.android.picturexx.view.settings.CustomSettingsFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean debugInfo$lambda$0;
                debugInfo$lambda$0 = CustomSettingsFragment.setDebugInfo$lambda$0(CustomSettingsFragment.this, userId, view);
                return debugInfo$lambda$0;
            }
        });
        final String deviceId = PersistData.INSTANCE.getDeviceId();
        ((CustomFragmentSettingBinding) getBinding()).tvDeviceToken.setText(String.valueOf(deviceId));
        ((CustomFragmentSettingBinding) getBinding()).tvDeviceToken.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.glority.android.picturexx.view.settings.CustomSettingsFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean debugInfo$lambda$1;
                debugInfo$lambda$1 = CustomSettingsFragment.setDebugInfo$lambda$1(CustomSettingsFragment.this, deviceId, view);
                return debugInfo$lambda$1;
            }
        });
        AppCompatButton btnConfirm = ((CustomFragmentSettingBinding) getBinding()).btnConfirm;
        Intrinsics.checkNotNullExpressionValue(btnConfirm, "btnConfirm");
        ViewExtensionsKt.setSingleClickListener$default(btnConfirm, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.settings.CustomSettingsFragment$setDebugInfo$3
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
                PersistData.INSTANCE.set(CorePersistKey.DEVICE_ID, String.valueOf(CustomSettingsFragment.access$getBinding(CustomSettingsFragment.this).etDeviceInfoInput.getText()));
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setDebugInfo$lambda$0(CustomSettingsFragment this$0, long j, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.getContext();
        Object systemService = context != null ? context.getSystemService("clipboard") : null;
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("userId", String.valueOf(j)));
        }
        ToastUtils.showShort("已复制", new Object[0]);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setDebugInfo$lambda$1(CustomSettingsFragment this$0, String deviceToken, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceToken, "$deviceToken");
        Context context = this$0.getContext();
        Object systemService = context != null ? context.getSystemService("clipboard") : null;
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("deviceToken", deviceToken));
        }
        ToastUtils.showShort("已复制", new Object[0]);
        return true;
    }
}
