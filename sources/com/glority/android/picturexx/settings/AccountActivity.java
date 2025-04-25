package com.glority.android.picturexx.settings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.Observer;
import androidx.navigation.ActivityKt;
import com.glority.android.picturexx.settings.vm.AccountViewModel;
import com.glority.base.activity.CommonActivity;
import com.glority.base.utils.data.DefaultResponseHandler;
import com.glority.base.utils.data.ResponseUtil;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.user.GetConfigMessage;
import com.glority.component.generatedAPI.kotlinAPI.vip.GetVipCardMessage;
import com.glority.network.model.Resource;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountActivity.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\"\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/glority/android/picturexx/settings/AccountActivity;", "Lcom/glority/base/activity/CommonActivity;", "<init>", "()V", "vm", "Lcom/glority/android/picturexx/settings/vm/AccountViewModel;", "getVm", "()Lcom/glority/android/picturexx/settings/vm/AccountViewModel;", "setVm", "(Lcom/glority/android/picturexx/settings/vm/AccountViewModel;)V", "getLayoutId", "", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onDestroy", "addSubscription", "Companion", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class AccountActivity extends CommonActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String tagForceShowLogin = "forceShowLogin";
    public AccountViewModel vm;

    /* compiled from: AccountActivity.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/glority/android/picturexx/settings/AccountActivity$Companion;", "", "<init>", "()V", "tagForceShowLogin", "", "start", "", "ctx", "Landroid/content/Context;", "requestCode", "", AccountActivity.tagForceShowLogin, "", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void start$default(Companion companion, Context context, Integer num, Boolean bool, int i, Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                bool = false;
            }
            companion.start(context, num, bool);
        }

        public final void start(Context ctx, Integer requestCode, Boolean forceShowLogin) {
            if (ctx == null) {
                return;
            }
            if (requestCode == null) {
                Intent intent = new Intent(ctx, (Class<?>) AccountActivity.class);
                intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                intent.putExtra(AccountActivity.tagForceShowLogin, forceShowLogin);
                ctx.startActivity(intent);
                return;
            }
            if (ctx instanceof Activity) {
                Intent intent2 = new Intent(ctx, (Class<?>) AccountActivity.class);
                intent2.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                intent2.putExtra(AccountActivity.tagForceShowLogin, forceShowLogin);
                ((Activity) ctx).startActivityForResult(intent2, requestCode.intValue());
                return;
            }
            Intent intent3 = new Intent(ctx, (Class<?>) AccountActivity.class);
            intent3.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            intent3.putExtra(AccountActivity.tagForceShowLogin, forceShowLogin);
            ctx.startActivity(intent3);
        }
    }

    public final AccountViewModel getVm() {
        AccountViewModel accountViewModel = this.vm;
        if (accountViewModel != null) {
            return accountViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vm");
        return null;
    }

    public final void setVm(AccountViewModel accountViewModel) {
        Intrinsics.checkNotNullParameter(accountViewModel, "<set-?>");
        this.vm = accountViewModel;
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected int getLayoutId() {
        return R.layout.activity_account;
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected void doCreateView(Bundle savedInstanceState) {
        setVm((AccountViewModel) getViewModel(AccountViewModel.class));
        addSubscription();
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        return ActivityKt.findNavController(this, R.id.account_nav_host_fragment).navigateUp();
    }

    @Override // com.glority.base.activity.CommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // com.glority.base.activity.CommonActivity, com.glority.android.ui.base.BaseActivity, com.glority.android.core.route.RouteableActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    private final void addSubscription() {
        AccountActivity accountActivity = this;
        getVm().getObservable(GetVipCardMessage.class).observe(accountActivity, new Observer() { // from class: com.glority.android.picturexx.settings.AccountActivity$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                AccountActivity.addSubscription$lambda$0(AccountActivity.this, (Resource) obj);
            }
        });
        getVm().getObservable(GetConfigMessage.class).observe(accountActivity, new Observer() { // from class: com.glority.android.picturexx.settings.AccountActivity$$ExternalSyntheticLambda1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                AccountActivity.addSubscription$lambda$1(AccountActivity.this, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscription$lambda$0(final AccountActivity this$0, Resource resource) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ResponseUtil responseUtil = ResponseUtil.INSTANCE;
        Intrinsics.checkNotNull(resource);
        responseUtil.handleResult(resource, new DefaultResponseHandler<GetVipCardMessage>() { // from class: com.glority.android.picturexx.settings.AccountActivity$addSubscription$1$1
            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void success(GetVipCardMessage data) {
                super.success((AccountActivity$addSubscription$1$1) data);
                LogUtils.d("GetVipCardMessage Requested Successfully!");
                if (data == null) {
                    return;
                }
                AppViewModel.INSTANCE.getInstance().updateUserVipInfo(data.getVipInfo());
                AccountActivity.this.getVm().getClientConfig();
            }

            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void error(Throwable e) {
                super.error(e);
                Object[] objArr = new Object[2];
                objArr[0] = "GetVipCardMessage Requested Failed!";
                objArr[1] = e != null ? e.getMessage() : null;
                LogUtils.e(objArr);
                AccountActivity.this.hideProgress();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscription$lambda$1(final AccountActivity this$0, Resource resource) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ResponseUtil responseUtil = ResponseUtil.INSTANCE;
        Intrinsics.checkNotNull(resource);
        responseUtil.handleResult(resource, new DefaultResponseHandler<GetConfigMessage>() { // from class: com.glority.android.picturexx.settings.AccountActivity$addSubscription$2$1
            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void success(GetConfigMessage data) {
                super.success((AccountActivity$addSubscription$2$1) data);
                LogUtils.d("GetConfigMessage Requested Successfully!");
                if (data == null) {
                    return;
                }
                AppViewModel.INSTANCE.getInstance().setClientConfig(data.getConfig());
                AccountActivity.this.hideProgress();
                AccountActivity.this.finish();
            }

            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void error(Throwable e) {
                super.error(e);
                Object[] objArr = new Object[2];
                objArr[0] = "GetConfigMessage Requested Failed!";
                objArr[1] = e != null ? e.getMessage() : null;
                LogUtils.e(objArr);
                AccountActivity.this.hideProgress();
            }
        });
    }
}
