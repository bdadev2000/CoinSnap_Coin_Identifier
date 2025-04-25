package com.glority.android.picturexx.settings.vm;

import androidx.autofill.HintConstants;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.glority.base.repository.UserRepository;
import com.glority.base.viewmodel.BaseViewModel;
import com.glority.component.generatedAPI.kotlinAPI.user.LoginInfo;
import com.glority.component.generatedAPI.kotlinAPI.user.LoginOrCreateMessage;
import com.glority.network.model.Resource;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoginViewModel.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\u0006\u0010\u0004\u001a\u00020\u0005H\u0007J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0007R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/glority/android/picturexx/settings/vm/LoginViewModel;", "Lcom/glority/base/viewmodel/BaseViewModel;", "<init>", "()V", "loginInfo", "Lcom/glority/component/generatedAPI/kotlinAPI/user/LoginInfo;", "getLoginInfo", "()Lcom/glority/component/generatedAPI/kotlinAPI/user/LoginInfo;", "setLoginInfo", "(Lcom/glority/component/generatedAPI/kotlinAPI/user/LoginInfo;)V", "email", "Landroidx/lifecycle/MutableLiveData;", "", "getEmail", "()Landroidx/lifecycle/MutableLiveData;", "setEmail", "(Landroidx/lifecycle/MutableLiveData;)V", HintConstants.AUTOFILL_HINT_PASSWORD, "getPassword", "setPassword", "loginWithEmail", "Landroidx/lifecycle/LiveData;", "Lcom/glority/network/model/Resource;", "Lcom/glority/component/generatedAPI/kotlinAPI/user/LoginOrCreateMessage;", "loginWithGoogleAccount", "account", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class LoginViewModel extends BaseViewModel {
    private LoginInfo loginInfo = new LoginInfo(0, 1, null);
    private MutableLiveData<String> email = new MutableLiveData<>();
    private MutableLiveData<String> password = new MutableLiveData<>();

    public final LoginInfo getLoginInfo() {
        return this.loginInfo;
    }

    public final void setLoginInfo(LoginInfo loginInfo) {
        Intrinsics.checkNotNullParameter(loginInfo, "<set-?>");
        this.loginInfo = loginInfo;
    }

    public final MutableLiveData<String> getEmail() {
        return this.email;
    }

    public final void setEmail(MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.email = mutableLiveData;
    }

    public final MutableLiveData<String> getPassword() {
        return this.password;
    }

    public final void setPassword(MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.password = mutableLiveData;
    }

    public final LiveData<Resource<LoginOrCreateMessage>> loginWithEmail(LoginInfo loginInfo) {
        Intrinsics.checkNotNullParameter(loginInfo, "loginInfo");
        return BaseViewModel.request$default(this, LoginOrCreateMessage.class, UserRepository.INSTANCE.getInstance().loginWithEmailMethod(loginInfo), null, null, null, 28, null);
    }

    public final LiveData<Resource<LoginOrCreateMessage>> loginWithGoogleAccount(GoogleSignInAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        return BaseViewModel.request$default(this, LoginOrCreateMessage.class, UserRepository.INSTANCE.getInstance().loginWithGoogleMethod(account), null, null, null, 28, null);
    }
}
