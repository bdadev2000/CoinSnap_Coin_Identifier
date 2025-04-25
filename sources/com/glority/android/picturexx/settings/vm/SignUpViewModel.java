package com.glority.android.picturexx.settings.vm;

import androidx.autofill.HintConstants;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.glority.base.repository.UserRepository;
import com.glority.base.viewmodel.BaseViewModel;
import com.glority.component.generatedAPI.kotlinAPI.enums.LoginType;
import com.glority.component.generatedAPI.kotlinAPI.user.LoginInfo;
import com.glority.component.generatedAPI.kotlinAPI.user.LoginOrCreateMessage;
import com.glority.network.model.Resource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SignUpViewModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/glority/android/picturexx/settings/vm/SignUpViewModel;", "Lcom/glority/base/viewmodel/BaseViewModel;", "<init>", "()V", "email", "Landroidx/lifecycle/MutableLiveData;", "", "getEmail", "()Landroidx/lifecycle/MutableLiveData;", "setEmail", "(Landroidx/lifecycle/MutableLiveData;)V", HintConstants.AUTOFILL_HINT_PASSWORD, "getPassword", "setPassword", "signUpWithEmail", "Landroidx/lifecycle/LiveData;", "Lcom/glority/network/model/Resource;", "Lcom/glority/component/generatedAPI/kotlinAPI/user/LoginOrCreateMessage;", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SignUpViewModel extends BaseViewModel {
    private MutableLiveData<String> email = new MutableLiveData<>();
    private MutableLiveData<String> password = new MutableLiveData<>();

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

    public final LiveData<Resource<LoginOrCreateMessage>> signUpWithEmail(String email, String password) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(password, "password");
        UserRepository companion = UserRepository.INSTANCE.getInstance();
        LoginInfo loginInfo = new LoginInfo(0, 1, null);
        loginInfo.setLoginKey(email);
        loginInfo.setLoginPassword(password);
        loginInfo.setLoginType(LoginType.EMAIL);
        Unit unit = Unit.INSTANCE;
        return BaseViewModel.request$default(this, LoginOrCreateMessage.class, companion.signUpWithEmailMethod(loginInfo), null, null, null, 28, null);
    }
}
