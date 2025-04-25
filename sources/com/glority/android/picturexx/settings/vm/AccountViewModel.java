package com.glority.android.picturexx.settings.vm;

import androidx.autofill.HintConstants;
import androidx.lifecycle.LiveData;
import com.glority.base.repository.ConfigRepository;
import com.glority.base.repository.UserRepository;
import com.glority.base.viewmodel.BaseViewModel;
import com.glority.component.generatedAPI.kotlinAPI.user.GetConfigMessage;
import com.glority.component.generatedAPI.kotlinAPI.vip.GetVipCardMessage;
import com.glority.network.model.Resource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountViewModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013J\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00140\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/glority/android/picturexx/settings/vm/AccountViewModel;", "Lcom/glority/base/viewmodel/BaseViewModel;", "<init>", "()V", "email", "", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", HintConstants.AUTOFILL_HINT_PASSWORD, "getPassword", "setPassword", "isPasswordReset", "", "()Z", "setPasswordReset", "(Z)V", "getVipCard", "Landroidx/lifecycle/LiveData;", "Lcom/glority/network/model/Resource;", "Lcom/glority/component/generatedAPI/kotlinAPI/vip/GetVipCardMessage;", "getClientConfig", "Lcom/glority/component/generatedAPI/kotlinAPI/user/GetConfigMessage;", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class AccountViewModel extends BaseViewModel {
    private boolean isPasswordReset;
    private String email = "";
    private String password = "";

    public final String getEmail() {
        return this.email;
    }

    public final void setEmail(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    public final String getPassword() {
        return this.password;
    }

    public final void setPassword(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.password = str;
    }

    /* renamed from: isPasswordReset, reason: from getter */
    public final boolean getIsPasswordReset() {
        return this.isPasswordReset;
    }

    public final void setPasswordReset(boolean z) {
        this.isPasswordReset = z;
    }

    public final LiveData<Resource<GetVipCardMessage>> getVipCard() {
        return BaseViewModel.request$default(this, GetVipCardMessage.class, UserRepository.INSTANCE.getInstance().getVipCardMethod(), null, null, null, 28, null);
    }

    public final LiveData<Resource<GetConfigMessage>> getClientConfig() {
        return BaseViewModel.request$default(this, GetConfigMessage.class, ConfigRepository.INSTANCE.getInstance().getClientConfigMethod(), null, null, null, 28, null);
    }
}
