package com.glority.android.picturexx.settings.fragment.account;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.glority.android.base.aws.s3.AwsFileUploader;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.picturexx.settings.R;
import com.glority.android.picturexx.settings.databinding.FragmentDeleteAccountBinding;
import com.glority.android.picturexx.settings.logevents.SettingsLogEvents;
import com.glority.android.picturexx.settings.vm.DataManageViewModel;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.storage.PersistKey;
import com.glority.base.utils.data.DefaultResponseHandler;
import com.glority.base.utils.data.ResponseUtil;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.user.DeleteAccountMessage;
import com.glority.component.generatedAPI.kotlinAPI.user.InitialiseMessage;
import com.glority.component.generatedAPI.kotlinAPI.user.LoginInfo;
import com.glority.component.generatedAPI.kotlinAPI.user.User;
import com.glority.component.generatedAPI.kotlinAPI.user.UserAdditionalData;
import com.glority.component.generatedAPI.kotlinAPI.vip.GetVipCardMessage;
import com.glority.network.model.Resource;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeleteAccountFragment.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/glority/android/picturexx/settings/fragment/account/DeleteAccountFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/settings/databinding/FragmentDeleteAccountBinding;", "<init>", "()V", "vm", "Lcom/glority/android/picturexx/settings/vm/DataManageViewModel;", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "tvDelete", "Landroid/view/View;", "llConfirmContainer", "tvCancel", "ivChecked", "Landroid/widget/ImageView;", "getLayoutId", "", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "initToolbar", "initView", "initListener", "addSubscription", "onDestroy", "getLogPageName", "", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class DeleteAccountFragment extends BaseFragment<FragmentDeleteAccountBinding> {
    private ImageView ivChecked;
    private View llConfirmContainer;
    private Toolbar toolbar;
    private View tvCancel;
    private View tvDelete;
    private DataManageViewModel vm;

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_delete_account;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        DataManageViewModel dataManageViewModel = null;
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this, SettingsLogEvents.Delete_Account_Page, null, 2, null);
        this.vm = (DataManageViewModel) getViewModel(DataManageViewModel.class);
        initView();
        initToolbar();
        initListener();
        addSubscription();
        DataManageViewModel dataManageViewModel2 = this.vm;
        if (dataManageViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        } else {
            dataManageViewModel = dataManageViewModel2;
        }
        dataManageViewModel.getHasConfirmed().setValue(false);
    }

    private final void initToolbar() {
        Toolbar toolbar = this.toolbar;
        Toolbar toolbar2 = null;
        if (toolbar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbar");
            toolbar = null;
        }
        toolbar.setTitle(R.string.data_management_text_delete_account);
        Toolbar toolbar3 = this.toolbar;
        if (toolbar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbar");
            toolbar3 = null;
        }
        toolbar3.setNavigationIcon(R.drawable.arrow_back_black);
        Toolbar toolbar4 = this.toolbar;
        if (toolbar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbar");
        } else {
            toolbar2 = toolbar4;
        }
        toolbar2.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.settings.fragment.account.DeleteAccountFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeleteAccountFragment.initToolbar$lambda$0(DeleteAccountFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initToolbar$lambda$0(DeleteAccountFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    private final void initView() {
        this.toolbar = (Toolbar) requireView().findViewById(R.id.toolbar);
        this.tvDelete = requireView().findViewById(R.id.tv_delete);
        this.llConfirmContainer = requireView().findViewById(R.id.ll_confirm_container);
        this.tvCancel = requireView().findViewById(R.id.tv_cancel);
        this.ivChecked = (ImageView) requireView().findViewById(R.id.iv_checked);
    }

    private final void initListener() {
        View view;
        View view2;
        View view3;
        View view4 = this.llConfirmContainer;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llConfirmContainer");
            view = null;
        } else {
            view = view4;
        }
        ViewExtensionsKt.setSingleClickListener$default(view, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.account.DeleteAccountFragment$initListener$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view5) {
                invoke2(view5);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                DataManageViewModel dataManageViewModel;
                DataManageViewModel dataManageViewModel2;
                Intrinsics.checkNotNullParameter(it, "it");
                dataManageViewModel = DeleteAccountFragment.this.vm;
                DataManageViewModel dataManageViewModel3 = null;
                if (dataManageViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                    dataManageViewModel = null;
                }
                Boolean value = dataManageViewModel.getHasConfirmed().getValue();
                if (value != null) {
                    DeleteAccountFragment deleteAccountFragment = DeleteAccountFragment.this;
                    boolean booleanValue = value.booleanValue();
                    deleteAccountFragment.logEvent(SettingsLogEvents.Delete_Account_Yes_I_Know_Click, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("type", Boolean.valueOf(!booleanValue))));
                    dataManageViewModel2 = deleteAccountFragment.vm;
                    if (dataManageViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                    } else {
                        dataManageViewModel3 = dataManageViewModel2;
                    }
                    dataManageViewModel3.getHasConfirmed().setValue(Boolean.valueOf(!booleanValue));
                }
            }
        }, 1, (Object) null);
        View view5 = this.tvDelete;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvDelete");
            view2 = null;
        } else {
            view2 = view5;
        }
        ViewExtensionsKt.setSingleClickListener$default(view2, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.account.DeleteAccountFragment$initListener$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view6) {
                invoke2(view6);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                DataManageViewModel dataManageViewModel;
                Intrinsics.checkNotNullParameter(it, "it");
                DataManageViewModel dataManageViewModel2 = null;
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(DeleteAccountFragment.this, SettingsLogEvents.Delete_Account_Delete, null, 2, null);
                com.glority.android.ui.base.v2.BaseFragment.showProgress$default(DeleteAccountFragment.this, null, false, 3, null);
                dataManageViewModel = DeleteAccountFragment.this.vm;
                if (dataManageViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                } else {
                    dataManageViewModel2 = dataManageViewModel;
                }
                dataManageViewModel2.deleteAccount();
            }
        }, 1, (Object) null);
        View view6 = this.tvCancel;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvCancel");
            view3 = null;
        } else {
            view3 = view6;
        }
        ViewExtensionsKt.setSingleClickListener$default(view3, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.account.DeleteAccountFragment$initListener$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view7) {
                invoke2(view7);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(DeleteAccountFragment.this, SettingsLogEvents.Delete_Account_Cancel, null, 2, null);
                FragmentActivity activity = DeleteAccountFragment.this.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }, 1, (Object) null);
    }

    private final void addSubscription() {
        DataManageViewModel dataManageViewModel = this.vm;
        DataManageViewModel dataManageViewModel2 = null;
        if (dataManageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            dataManageViewModel = null;
        }
        DeleteAccountFragment deleteAccountFragment = this;
        dataManageViewModel.getHasConfirmed().observe(deleteAccountFragment, new Observer() { // from class: com.glority.android.picturexx.settings.fragment.account.DeleteAccountFragment$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                DeleteAccountFragment.addSubscription$lambda$1(DeleteAccountFragment.this, (Boolean) obj);
            }
        });
        DataManageViewModel dataManageViewModel3 = this.vm;
        if (dataManageViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            dataManageViewModel3 = null;
        }
        dataManageViewModel3.getObservable(DeleteAccountMessage.class).observe(deleteAccountFragment, new Observer() { // from class: com.glority.android.picturexx.settings.fragment.account.DeleteAccountFragment$$ExternalSyntheticLambda1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                DeleteAccountFragment.addSubscription$lambda$2(DeleteAccountFragment.this, (Resource) obj);
            }
        });
        DataManageViewModel dataManageViewModel4 = this.vm;
        if (dataManageViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            dataManageViewModel4 = null;
        }
        dataManageViewModel4.getObservable(InitialiseMessage.class).observe(deleteAccountFragment, new Observer() { // from class: com.glority.android.picturexx.settings.fragment.account.DeleteAccountFragment$$ExternalSyntheticLambda2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                DeleteAccountFragment.addSubscription$lambda$3(DeleteAccountFragment.this, (Resource) obj);
            }
        });
        DataManageViewModel dataManageViewModel5 = this.vm;
        if (dataManageViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        } else {
            dataManageViewModel2 = dataManageViewModel5;
        }
        dataManageViewModel2.getObservable(GetVipCardMessage.class).observe(deleteAccountFragment, new Observer() { // from class: com.glority.android.picturexx.settings.fragment.account.DeleteAccountFragment$$ExternalSyntheticLambda3
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                DeleteAccountFragment.addSubscription$lambda$4(DeleteAccountFragment.this, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscription$lambda$1(DeleteAccountFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.tvDelete;
        ImageView imageView = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvDelete");
            view = null;
        }
        view.setClickable(bool.booleanValue());
        if (bool.booleanValue()) {
            View view2 = this$0.tvDelete;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvDelete");
                view2 = null;
            }
            view2.setAlpha(1.0f);
            ImageView imageView2 = this$0.ivChecked;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivChecked");
            } else {
                imageView = imageView2;
            }
            imageView.setImageResource(R.drawable.icon_iknow_hold);
            return;
        }
        View view3 = this$0.tvDelete;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvDelete");
            view3 = null;
        }
        view3.setAlpha(0.5f);
        ImageView imageView3 = this$0.ivChecked;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivChecked");
        } else {
            imageView = imageView3;
        }
        imageView.setImageResource(R.drawable.icon_iknow_default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscription$lambda$2(final DeleteAccountFragment this$0, Resource resource) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ResponseUtil responseUtil = ResponseUtil.INSTANCE;
        Intrinsics.checkNotNull(resource);
        responseUtil.handleResult(resource, new DefaultResponseHandler<DeleteAccountMessage>() { // from class: com.glority.android.picturexx.settings.fragment.account.DeleteAccountFragment$addSubscription$2$1
            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void success(DeleteAccountMessage data) {
                DataManageViewModel dataManageViewModel;
                super.success((DeleteAccountFragment$addSubscription$2$1) data);
                LogUtils.d("DeleteAccountMessage Requested Successfully!");
                DataManageViewModel dataManageViewModel2 = null;
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(DeleteAccountFragment.this, SettingsLogEvents.Delete_Account_Success, null, 2, null);
                AppViewModel.INSTANCE.getInstance().removeUserInformation();
                AppViewModel.INSTANCE.getInstance().clearSession();
                LoginInfo loginInfo = AppViewModel.INSTANCE.getInstance().getLoginInfo();
                dataManageViewModel = DeleteAccountFragment.this.vm;
                if (dataManageViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                } else {
                    dataManageViewModel2 = dataManageViewModel;
                }
                dataManageViewModel2.initializeApp(loginInfo);
            }

            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void error(Throwable e) {
                super.error(e);
                DeleteAccountFragment.this.hideProgress();
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(DeleteAccountFragment.this, SettingsLogEvents.Delete_Account_Failure, null, 2, null);
                Object[] objArr = new Object[2];
                objArr[0] = "DeleteAccountMessage Requested Failed!";
                objArr[1] = e != null ? e.getMessage() : null;
                LogUtils.e(objArr);
                ToastUtils.showShort(R.string.error_text_internal_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscription$lambda$3(final DeleteAccountFragment this$0, Resource resource) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ResponseUtil responseUtil = ResponseUtil.INSTANCE;
        Intrinsics.checkNotNull(resource);
        responseUtil.handleResult(resource, new DefaultResponseHandler<InitialiseMessage>() { // from class: com.glority.android.picturexx.settings.fragment.account.DeleteAccountFragment$addSubscription$3$1
            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void success(InitialiseMessage data) {
                DataManageViewModel dataManageViewModel;
                super.success((DeleteAccountFragment$addSubscription$3$1) data);
                if (data == null) {
                    return;
                }
                LogUtils.d("InitialiseMessage Requested Successfully!");
                User user = data.getUser();
                UserAdditionalData userAdditionalData = data.getUserAdditionalData();
                String accessToken = data.getAccessToken();
                AppViewModel.INSTANCE.getInstance().setClientConfig(data.getConfig());
                AppViewModel.INSTANCE.getInstance().setOtherConfig(data.getOtherConfigs());
                AppViewModel.INSTANCE.getInstance().updateUserAndToken(user, accessToken, userAdditionalData);
                PersistData.INSTANCE.set(PersistKey.KEY_SERVER_CLIENT_TIME_OFFSET, Long.valueOf(System.currentTimeMillis() - data.getAppServerTime().getTime()));
                dataManageViewModel = DeleteAccountFragment.this.vm;
                if (dataManageViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                    dataManageViewModel = null;
                }
                dataManageViewModel.getVipCard();
            }

            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void error(Throwable e) {
                super.error(e);
                Object[] objArr = new Object[2];
                objArr[0] = "InitialiseMessage Requested Failed!";
                objArr[1] = e != null ? e.getMessage() : null;
                LogUtils.e(objArr);
                DeleteAccountFragment.this.hideProgress();
                ToastUtils.showShort(R.string.error_text_internal_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscription$lambda$4(final DeleteAccountFragment this$0, Resource resource) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ResponseUtil responseUtil = ResponseUtil.INSTANCE;
        Intrinsics.checkNotNull(resource);
        responseUtil.handleResult(resource, new DefaultResponseHandler<GetVipCardMessage>() { // from class: com.glority.android.picturexx.settings.fragment.account.DeleteAccountFragment$addSubscription$4$1
            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void success(GetVipCardMessage data) {
                super.success((DeleteAccountFragment$addSubscription$4$1) data);
                LogUtils.d("GetVipCardMessage Requested Successfully!");
                if (data == null) {
                    return;
                }
                AppViewModel.INSTANCE.getInstance().updateUserVipInfo(data.getVipInfo());
                DeleteAccountFragment.this.hideProgress();
                AwsFileUploader.INSTANCE.init();
                FragmentActivity activity = DeleteAccountFragment.this.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }

            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void error(Throwable e) {
                super.error(e);
                Object[] objArr = new Object[2];
                objArr[0] = "GetVipCardMessage Requested Failed!";
                objArr[1] = e != null ? e.getMessage() : null;
                LogUtils.e(objArr);
                DeleteAccountFragment.this.hideProgress();
                ToastUtils.showShort(R.string.error_text_internal_error);
            }
        });
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this, SettingsLogEvents.Delete_Account_Page_Close, null, 2, null);
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    protected String getPageName() {
        String lowerCase = "DeleteAccount".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
