package com.glority.android.picturexx.settings.vm;

import androidx.autofill.HintConstants;
import androidx.lifecycle.LiveData;
import com.glority.base.repository.UserRepository;
import com.glority.base.viewmodel.BaseViewModel;
import com.glority.component.generatedAPI.kotlinAPI.enums.Gender;
import com.glority.component.generatedAPI.kotlinAPI.user.GetUserMessage;
import com.glority.component.generatedAPI.kotlinAPI.user.UpdateMessage;
import com.glority.network.model.Resource;
import java.io.File;
import kotlin.Metadata;

/* compiled from: ProfileViewModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00060\u0005H\u0007¨\u0006\u0010"}, d2 = {"Lcom/glority/android/picturexx/settings/vm/ProfileViewModel;", "Lcom/glority/base/viewmodel/BaseViewModel;", "<init>", "()V", "updateProfile", "Landroidx/lifecycle/LiveData;", "Lcom/glority/network/model/Resource;", "Lcom/glority/component/generatedAPI/kotlinAPI/user/UpdateMessage;", "nickname", "", "avatar", "Ljava/io/File;", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/Gender;", "getUserProfile", "Lcom/glority/component/generatedAPI/kotlinAPI/user/GetUserMessage;", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ProfileViewModel extends BaseViewModel {
    public final LiveData<Resource<UpdateMessage>> updateProfile(String nickname, File avatar, Gender gender) {
        return BaseViewModel.request$default(this, UpdateMessage.class, UserRepository.INSTANCE.getInstance().updateProfileMethod(nickname, avatar, gender), null, null, null, 28, null);
    }

    public final LiveData<Resource<GetUserMessage>> getUserProfile() {
        return BaseViewModel.request$default(this, GetUserMessage.class, UserRepository.INSTANCE.getInstance().getUserProfileMethod(), null, null, null, 28, null);
    }
}
