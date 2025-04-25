package com.glority.android.picturexx.splash.vm.main;

import androidx.lifecycle.LiveData;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.repository.UserRepository;
import com.glority.base.storage.PersistKey;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.base.viewmodel.BaseViewModel;
import com.glority.component.generatedAPI.kotlinAPI.enums.LoginType;
import com.glority.component.generatedAPI.kotlinAPI.user.DeviceInfo;
import com.glority.component.generatedAPI.kotlinAPI.user.InitialiseMessage;
import com.glority.component.generatedAPI.kotlinAPI.user.LoginInfo;
import com.glority.component.generatedAPI.kotlinAPI.vip.GetVipCardMessage;
import com.glority.network.model.Resource;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: SplashViewModel.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0007J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000e0\rH\u0007J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0087@¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u0005H\u0087@¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0015\u001a\u00020\u0005H\u0087@¢\u0006\u0002\u0010\u0013J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0002J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0005H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/glority/android/picturexx/splash/vm/main/SplashViewModel;", "Lcom/glority/base/viewmodel/BaseViewModel;", "<init>", "()V", "hasActiveSubscription", "", "getHasActiveSubscription", "()Z", "setHasActiveSubscription", "(Z)V", "isOldUser", "setOldUser", "initializeApp", "Landroidx/lifecycle/LiveData;", "Lcom/glority/network/model/Resource;", "Lcom/glority/component/generatedAPI/kotlinAPI/user/InitialiseMessage;", "getVipCard", "Lcom/glority/component/generatedAPI/kotlinAPI/vip/GetVipCardMessage;", "initializeAppSync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkIfNeedManualRestoreDirect", "checkIfNeedManualRestore", "getLastManualRestoreUserId", "", "setLastManualRestoreUserId", "", "userId", "getManualRestoreRequestResult", "setManualRestoreRequestResult", LogEvents.result, "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SplashViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private boolean hasActiveSubscription;
    private boolean isOldUser = PersistData.INSTANCE.contains(PersistKey.KEY_USER);

    public final boolean getHasActiveSubscription() {
        return this.hasActiveSubscription;
    }

    public final void setHasActiveSubscription(boolean z) {
        this.hasActiveSubscription = z;
    }

    /* renamed from: isOldUser, reason: from getter */
    public final boolean getIsOldUser() {
        return this.isOldUser;
    }

    public final void setOldUser(boolean z) {
        this.isOldUser = z;
    }

    public final LiveData<Resource<InitialiseMessage>> initializeApp() {
        LoginInfo loginInfo = AppViewModel.INSTANCE.getInstance().getLoginInfo();
        if (loginInfo.getLoginType() != LoginType.GUEST) {
            loginInfo = null;
        }
        DeviceInfo deviceInfo = AppViewModel.INSTANCE.getInstance().getDeviceInfo();
        deviceInfo.setDeviceDetailInfo(AppViewModel.INSTANCE.getInstance().getDeviceDetailInfo());
        return BaseViewModel.request$default(this, InitialiseMessage.class, UserRepository.INSTANCE.getInstance().initializeAppMethod(loginInfo, deviceInfo), null, null, null, 28, null);
    }

    public final LiveData<Resource<GetVipCardMessage>> getVipCard() {
        return BaseViewModel.request$default(this, GetVipCardMessage.class, UserRepository.INSTANCE.getInstance().getVipCardMethod(), null, null, null, 28, null);
    }

    public final Object initializeAppSync(Continuation<? super Resource<InitialiseMessage>> continuation) {
        LoginInfo loginInfo = AppViewModel.INSTANCE.getInstance().getLoginInfo();
        DeviceInfo deviceInfo = AppViewModel.INSTANCE.getInstance().getDeviceInfo();
        deviceInfo.setDeviceDetailInfo(AppViewModel.INSTANCE.getInstance().getDeviceDetailInfo());
        return BuildersKt.withContext(Dispatchers.getIO(), new SplashViewModel$initializeAppSync$2(loginInfo, deviceInfo, null), continuation);
    }

    public final Object checkIfNeedManualRestoreDirect(Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new SplashViewModel$checkIfNeedManualRestoreDirect$2(null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object checkIfNeedManualRestore(kotlin.coroutines.Continuation<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.glority.android.picturexx.splash.vm.main.SplashViewModel$checkIfNeedManualRestore$1
            if (r0 == 0) goto L14
            r0 = r9
            com.glority.android.picturexx.splash.vm.main.SplashViewModel$checkIfNeedManualRestore$1 r0 = (com.glority.android.picturexx.splash.vm.main.SplashViewModel$checkIfNeedManualRestore$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            com.glority.android.picturexx.splash.vm.main.SplashViewModel$checkIfNeedManualRestore$1 r0 = new com.glority.android.picturexx.splash.vm.main.SplashViewModel$checkIfNeedManualRestore$1
            r0.<init>(r8, r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            long r1 = r0.J$0
            java.lang.Object r0 = r0.L$0
            com.glority.android.picturexx.splash.vm.main.SplashViewModel r0 = (com.glority.android.picturexx.splash.vm.main.SplashViewModel) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L7f
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            kotlin.ResultKt.throwOnFailure(r9)
            com.glority.base.viewmodel.AppViewModel$Companion r9 = com.glority.base.viewmodel.AppViewModel.INSTANCE
            com.glority.base.viewmodel.AppViewModel r9 = r9.getInstance()
            androidx.lifecycle.MutableLiveData r9 = r9.getUser()
            java.lang.Object r9 = r9.getValue()
            com.glority.component.generatedAPI.kotlinAPI.user.User r9 = (com.glority.component.generatedAPI.kotlinAPI.user.User) r9
            if (r9 == 0) goto L90
            long r4 = r9.getUserId()
            long r6 = r8.getLastManualRestoreUserId()
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L62
            boolean r9 = r8.getManualRestoreRequestResult()
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r9)
            return r9
        L62:
            kotlinx.coroutines.CoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r9 = (kotlin.coroutines.CoroutineContext) r9
            com.glority.android.picturexx.splash.vm.main.SplashViewModel$checkIfNeedManualRestore$result$1 r2 = new com.glority.android.picturexx.splash.vm.main.SplashViewModel$checkIfNeedManualRestore$result$1
            r6 = 0
            r2.<init>(r6)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r0.L$0 = r8
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r2, r0)
            if (r9 != r1) goto L7d
            return r1
        L7d:
            r0 = r8
            r1 = r4
        L7f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r0.setManualRestoreRequestResult(r9)
            r0.setLastManualRestoreUserId(r1)
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r9)
            return r9
        L90:
            r9 = 0
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.splash.vm.main.SplashViewModel.checkIfNeedManualRestore(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final long getLastManualRestoreUserId() {
        return ((Number) PersistData.INSTANCE.get(PersistKey.KEY_LAST_MANUAL_RESTORE_USER_ID, 0L)).longValue();
    }

    private final void setLastManualRestoreUserId(long userId) {
        PersistData.INSTANCE.set(PersistKey.KEY_LAST_MANUAL_RESTORE_USER_ID, Long.valueOf(userId));
    }

    private final boolean getManualRestoreRequestResult() {
        return ((Boolean) PersistData.INSTANCE.get(PersistKey.KEY_MANUAL_RESTORE_REQUEST_RESULT, false)).booleanValue();
    }

    private final void setManualRestoreRequestResult(boolean result) {
        PersistData.INSTANCE.set(PersistKey.KEY_MANUAL_RESTORE_REQUEST_RESULT, Boolean.valueOf(result));
    }
}
