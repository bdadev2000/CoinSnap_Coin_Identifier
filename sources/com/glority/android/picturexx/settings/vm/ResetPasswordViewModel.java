package com.glority.android.picturexx.settings.vm;

import androidx.autofill.HintConstants;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.glority.base.repository.UserRepository;
import com.glority.base.viewmodel.BaseViewModel;
import com.glority.component.generatedAPI.kotlinAPI.user.CheckVerifyCodeMessage;
import com.glority.component.generatedAPI.kotlinAPI.user.GetVerifyCodeMessage;
import com.glority.component.generatedAPI.kotlinAPI.user.ResetPasswordAndLoginMessage;
import com.glority.network.model.Resource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResetPasswordViewModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014H\u0007J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00150\u00142\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J,\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00150\u00142\u0006\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0007R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/glority/android/picturexx/settings/vm/ResetPasswordViewModel;", "Lcom/glority/base/viewmodel/BaseViewModel;", "<init>", "()V", "email", "Landroidx/lifecycle/MutableLiveData;", "", "getEmail", "()Landroidx/lifecycle/MutableLiveData;", "setEmail", "(Landroidx/lifecycle/MutableLiveData;)V", "verifyCode", "getVerifyCode", "setVerifyCode", HintConstants.AUTOFILL_HINT_PASSWORD, "getPassword", "setPassword", "passwordConfirm", "getPasswordConfirm", "setPasswordConfirm", "Landroidx/lifecycle/LiveData;", "Lcom/glority/network/model/Resource;", "Lcom/glority/component/generatedAPI/kotlinAPI/user/GetVerifyCodeMessage;", "checkVerifyCode", "Lcom/glority/component/generatedAPI/kotlinAPI/user/CheckVerifyCodeMessage;", "resetUserPassWord", "Lcom/glority/component/generatedAPI/kotlinAPI/user/ResetPasswordAndLoginMessage;", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ResetPasswordViewModel extends BaseViewModel {
    private MutableLiveData<String> email = new MutableLiveData<>();
    private MutableLiveData<String> verifyCode = new MutableLiveData<>();
    private MutableLiveData<String> password = new MutableLiveData<>();
    private MutableLiveData<String> passwordConfirm = new MutableLiveData<>();

    public final MutableLiveData<String> getEmail() {
        return this.email;
    }

    public final void setEmail(MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.email = mutableLiveData;
    }

    /* renamed from: getVerifyCode, reason: collision with other method in class */
    public final MutableLiveData<String> m7814getVerifyCode() {
        return this.verifyCode;
    }

    public final void setVerifyCode(MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.verifyCode = mutableLiveData;
    }

    public final MutableLiveData<String> getPassword() {
        return this.password;
    }

    public final void setPassword(MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.password = mutableLiveData;
    }

    public final MutableLiveData<String> getPasswordConfirm() {
        return this.passwordConfirm;
    }

    public final void setPasswordConfirm(MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.passwordConfirm = mutableLiveData;
    }

    public final LiveData<Resource<GetVerifyCodeMessage>> getVerifyCode() {
        ResetPasswordViewModel resetPasswordViewModel = this;
        UserRepository companion = UserRepository.INSTANCE.getInstance();
        String value = this.email.getValue();
        if (value == null) {
            value = "";
        }
        return BaseViewModel.request$default(resetPasswordViewModel, GetVerifyCodeMessage.class, companion.getVerifyCodeMethod(value), null, null, null, 28, null);
    }

    public final LiveData<Resource<CheckVerifyCodeMessage>> checkVerifyCode(String verifyCode) {
        Intrinsics.checkNotNullParameter(verifyCode, "verifyCode");
        ResetPasswordViewModel resetPasswordViewModel = this;
        UserRepository companion = UserRepository.INSTANCE.getInstance();
        String value = this.email.getValue();
        if (value == null) {
            value = "";
        }
        return BaseViewModel.request$default(resetPasswordViewModel, CheckVerifyCodeMessage.class, companion.checkVerifyCodeMethod(value, verifyCode), null, null, null, 28, null);
    }

    public final LiveData<Resource<ResetPasswordAndLoginMessage>> resetUserPassWord(String email, String verifyCode, String password) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(verifyCode, "verifyCode");
        Intrinsics.checkNotNullParameter(password, "password");
        return BaseViewModel.request$default(this, ResetPasswordAndLoginMessage.class, UserRepository.INSTANCE.getInstance().resetUserPasswordMethod(email, verifyCode, password), null, null, null, 28, null);
    }
}
