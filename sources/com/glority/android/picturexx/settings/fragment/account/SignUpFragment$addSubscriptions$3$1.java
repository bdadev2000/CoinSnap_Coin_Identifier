package com.glority.android.picturexx.settings.fragment.account;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.glority.android.picturexx.settings.R;
import com.glority.android.picturexx.settings.logevents.SettingsLogEvents;
import com.glority.android.picturexx.settings.vm.AccountViewModel;
import com.glority.android.ui.base.v2.BaseFragment;
import com.glority.base.utils.data.DefaultResponseHandler;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.ErrorCodes;
import com.glority.component.generatedAPI.kotlinAPI.user.LoginOrCreateMessage;
import com.glority.network.exception.APIException;
import com.glority.utils.app.ResUtils;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SignUpFragment.kt */
@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/glority/android/picturexx/settings/fragment/account/SignUpFragment$addSubscriptions$3$1", "Lcom/glority/base/utils/data/DefaultResponseHandler;", "Lcom/glority/component/generatedAPI/kotlinAPI/user/LoginOrCreateMessage;", "success", "", "data", "error", "e", "", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SignUpFragment$addSubscriptions$3$1 extends DefaultResponseHandler<LoginOrCreateMessage> {
    final /* synthetic */ SignUpFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SignUpFragment$addSubscriptions$3$1(SignUpFragment signUpFragment) {
        this.this$0 = signUpFragment;
    }

    @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
    public void success(LoginOrCreateMessage data) {
        AccountViewModel accountViewModel;
        super.success((SignUpFragment$addSubscriptions$3$1) data);
        if (data == null) {
            return;
        }
        LogUtils.d("LoginOrCreateMessage Requested Successfully!");
        AppViewModel.INSTANCE.getInstance().updateUserAndToken(data.getUser(), data.getAccessToken(), data.getUserAdditionalData());
        accountViewModel = this.this$0.accountViewModel;
        if (accountViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
            accountViewModel = null;
        }
        accountViewModel.getVipCard();
        BaseFragment.logEvent$default(this.this$0, SettingsLogEvents.Signup_Success, null, 2, null);
    }

    @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
    public void error(Throwable e) {
        super.error(e);
        if (!(e instanceof APIException) || ((APIException) e).getCode() != ErrorCodes.USER_ALREADY_EXIST.getValue()) {
            this.this$0.hideProgress();
            Object[] objArr = new Object[2];
            objArr[0] = "LoginOrCreateMessage Requested Failure!";
            objArr[1] = e != null ? e.getMessage() : null;
            LogUtils.e(objArr);
            Context context = this.this$0.getContext();
            if (context == null) {
                return;
            }
            new AlertDialog.Builder(context).setTitle(R.string.text_login_fail).setMessage(R.string.text_account_exist_content).setPositiveButton(com.glority.base.R.string.text_confirm, new DialogInterface.OnClickListener() { // from class: com.glority.android.picturexx.settings.fragment.account.SignUpFragment$addSubscriptions$3$1$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).show();
            BaseFragment.logEvent$default(this.this$0, SettingsLogEvents.Signup_Failure, null, 2, null);
            return;
        }
        LogUtils.d("GetVerifyCodeMessage Requested Successfully!", "Email exists!!!!");
        this.this$0.hideProgress();
        SignUpFragment.access$getBinding(this.this$0).textLayoutEmail.setError(ResUtils.getString(R.string.text_account_exist_title));
    }
}
