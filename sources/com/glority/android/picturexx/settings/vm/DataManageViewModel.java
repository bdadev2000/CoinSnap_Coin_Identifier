package com.glority.android.picturexx.settings.vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.glority.base.repository.UserRepository;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.base.viewmodel.BaseViewModel;
import com.glority.component.generatedAPI.kotlinAPI.user.DeleteAccountMessage;
import com.glority.component.generatedAPI.kotlinAPI.user.DeviceInfo;
import com.glority.component.generatedAPI.kotlinAPI.user.InitialiseMessage;
import com.glority.component.generatedAPI.kotlinAPI.user.LoginInfo;
import com.glority.component.generatedAPI.kotlinAPI.vip.GetVipCardMessage;
import com.glority.network.model.Resource;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DataManageViewModel.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0007J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\r0\fH\u0007R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/glority/android/picturexx/settings/vm/DataManageViewModel;", "Lcom/glority/base/viewmodel/BaseViewModel;", "<init>", "()V", "hasConfirmed", "Landroidx/lifecycle/MutableLiveData;", "", "getHasConfirmed", "()Landroidx/lifecycle/MutableLiveData;", "hasConfirmed$delegate", "Lkotlin/Lazy;", "deleteAccount", "Landroidx/lifecycle/LiveData;", "Lcom/glority/network/model/Resource;", "Lcom/glority/component/generatedAPI/kotlinAPI/user/DeleteAccountMessage;", "initializeApp", "Lcom/glority/component/generatedAPI/kotlinAPI/user/InitialiseMessage;", "loginInfo", "Lcom/glority/component/generatedAPI/kotlinAPI/user/LoginInfo;", "getVipCard", "Lcom/glority/component/generatedAPI/kotlinAPI/vip/GetVipCardMessage;", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class DataManageViewModel extends BaseViewModel {

    /* renamed from: hasConfirmed$delegate, reason: from kotlin metadata */
    private final Lazy hasConfirmed = LazyKt.lazy(new Function0<MutableLiveData<Boolean>>() { // from class: com.glority.android.picturexx.settings.vm.DataManageViewModel$hasConfirmed$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>();
        }
    });

    public final MutableLiveData<Boolean> getHasConfirmed() {
        return (MutableLiveData) this.hasConfirmed.getValue();
    }

    public final LiveData<Resource<DeleteAccountMessage>> deleteAccount() {
        return BaseViewModel.request$default(this, DeleteAccountMessage.class, UserRepository.INSTANCE.getInstance().deleteAccountMethod(), null, null, null, 28, null);
    }

    public final LiveData<Resource<InitialiseMessage>> initializeApp(LoginInfo loginInfo) {
        Intrinsics.checkNotNullParameter(loginInfo, "loginInfo");
        DeviceInfo deviceInfo = AppViewModel.INSTANCE.getInstance().getDeviceInfo();
        deviceInfo.setDeviceDetailInfo(AppViewModel.INSTANCE.getInstance().getDeviceDetailInfo());
        return BaseViewModel.request$default(this, InitialiseMessage.class, UserRepository.INSTANCE.getInstance().initializeAppMethod(loginInfo, deviceInfo), null, null, null, 28, null);
    }

    public final LiveData<Resource<GetVipCardMessage>> getVipCard() {
        return BaseViewModel.request$default(this, GetVipCardMessage.class, UserRepository.INSTANCE.getInstance().getVipCardMethod(), null, null, null, 28, null);
    }
}
