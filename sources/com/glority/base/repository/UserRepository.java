package com.glority.base.repository;

import android.net.Uri;
import androidx.autofill.HintConstants;
import androidx.lifecycle.LiveData;
import com.glority.android.repository.BaseRepository;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.enums.Gender;
import com.glority.component.generatedAPI.kotlinAPI.enums.LoginAction;
import com.glority.component.generatedAPI.kotlinAPI.enums.LoginType;
import com.glority.component.generatedAPI.kotlinAPI.enums.SupportType;
import com.glority.component.generatedAPI.kotlinAPI.support.SendSupportTicketMessage;
import com.glority.component.generatedAPI.kotlinAPI.user.CheckVerifyCodeMessage;
import com.glority.component.generatedAPI.kotlinAPI.user.DeleteAccountMessage;
import com.glority.component.generatedAPI.kotlinAPI.user.DeviceInfo;
import com.glority.component.generatedAPI.kotlinAPI.user.GetUserMessage;
import com.glority.component.generatedAPI.kotlinAPI.user.GetVerifyCodeMessage;
import com.glority.component.generatedAPI.kotlinAPI.user.InitialiseMessage;
import com.glority.component.generatedAPI.kotlinAPI.user.LoginInfo;
import com.glority.component.generatedAPI.kotlinAPI.user.LoginOrCreateMessage;
import com.glority.component.generatedAPI.kotlinAPI.user.ResetPasswordAndLoginMessage;
import com.glority.component.generatedAPI.kotlinAPI.user.ThirdPartyUserInfo;
import com.glority.component.generatedAPI.kotlinAPI.user.UpdateDeviceInfoMessage;
import com.glority.component.generatedAPI.kotlinAPI.user.UpdateMessage;
import com.glority.component.generatedAPI.kotlinAPI.vip.GetVipCardMessage;
import com.glority.component.generatedAPI.kotlinAPI.vip.RemindUserToAttentionTrialMessage;
import com.glority.network.model.Resource;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.io.File;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserRepository.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 =2\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00060\u0005J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006J\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00060\u0005J\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00060\u0005J0\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00060\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00060\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00060\u00052\u0006\u0010\b\u001a\u00020\tJ\u001a\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00060\u00052\u0006\u0010\b\u001a\u00020\tJ\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00060\u00052\u0006\u0010#\u001a\u00020\u0017J\"\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00060\u00052\u0006\u0010#\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0017J*\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00060\u00052\u0006\u0010#\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0017JL\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00060\u00052\u0006\u0010#\u001a\u00020\u00172\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u00172\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001002\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u000100JH\u00102\u001a\b\u0012\u0004\u0012\u00020+0\u00062\u0006\u0010#\u001a\u00020\u00172\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u00172\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001002\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u000100H\u0007J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J*\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00060\u00052\u0006\u0010#\u001a\u00020\u00172\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u000100J\u001c\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00060\u00052\b\u00106\u001a\u0004\u0018\u000107J\u0014\u00108\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00062\u0006\u0010;\u001a\u00020<2\u0006\u0010#\u001a\u00020\u0017H\u0007¨\u0006>"}, d2 = {"Lcom/glority/base/repository/UserRepository;", "Lcom/glority/android/repository/BaseRepository;", "<init>", "()V", "initializeAppMethod", "Landroidx/lifecycle/LiveData;", "Lcom/glority/network/model/Resource;", "Lcom/glority/component/generatedAPI/kotlinAPI/user/InitialiseMessage;", "loginInfo", "Lcom/glority/component/generatedAPI/kotlinAPI/user/LoginInfo;", "deviceInfo", "Lcom/glority/component/generatedAPI/kotlinAPI/user/DeviceInfo;", "initializeAppBlockingMethod", "getVipCardMethod", "Lcom/glority/component/generatedAPI/kotlinAPI/vip/GetVipCardMessage;", "getVipCardMethodBlocking", "getUserProfileMethod", "Lcom/glority/component/generatedAPI/kotlinAPI/user/GetUserMessage;", "deleteAccountMethod", "Lcom/glority/component/generatedAPI/kotlinAPI/user/DeleteAccountMessage;", "updateProfileMethod", "Lcom/glority/component/generatedAPI/kotlinAPI/user/UpdateMessage;", "nickname", "", "avatar", "Ljava/io/File;", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/Gender;", "updateDeviceInfoMethod", "Lcom/glority/component/generatedAPI/kotlinAPI/user/UpdateDeviceInfoMessage;", "loginWithEmailMethod", "Lcom/glority/component/generatedAPI/kotlinAPI/user/LoginOrCreateMessage;", "signUpWithEmailMethod", "getVerifyCodeMethod", "Lcom/glority/component/generatedAPI/kotlinAPI/user/GetVerifyCodeMessage;", "email", "checkVerifyCodeMethod", "Lcom/glority/component/generatedAPI/kotlinAPI/user/CheckVerifyCodeMessage;", "verifyCode", "resetUserPasswordMethod", "Lcom/glority/component/generatedAPI/kotlinAPI/user/ResetPasswordAndLoginMessage;", HintConstants.AUTOFILL_HINT_PASSWORD, "submitSupportTicketMethod", "Lcom/glority/component/generatedAPI/kotlinAPI/support/SendSupportTicketMessage;", "supportType", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/SupportType;", "content", "images", "", "tags", "submitSupportTicketMethodBlocking", "loginWithRestoreMethodBlocking", "cancelSubscriptionMessage", "loginWithGoogleMethod", "account", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "updateDeviceInfoMethodBlocking", "remindUserToAttentionTrialSync", "Lcom/glority/component/generatedAPI/kotlinAPI/vip/RemindUserToAttentionTrialMessage;", "daysToRemind", "", "Companion", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class UserRepository extends BaseRepository {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<UserRepository> instance$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<UserRepository>() { // from class: com.glority.base.repository.UserRepository$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final UserRepository invoke() {
            return new UserRepository();
        }
    });

    /* compiled from: UserRepository.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/glority/base/repository/UserRepository$Companion;", "", "<init>", "()V", "instance", "Lcom/glority/base/repository/UserRepository;", "getInstance", "()Lcom/glority/base/repository/UserRepository;", "instance$delegate", "Lkotlin/Lazy;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UserRepository getInstance() {
            return (UserRepository) UserRepository.instance$delegate.getValue();
        }
    }

    public static /* synthetic */ LiveData initializeAppMethod$default(UserRepository userRepository, LoginInfo loginInfo, DeviceInfo deviceInfo, int i, Object obj) {
        if ((i & 2) != 0) {
            deviceInfo = null;
        }
        return userRepository.initializeAppMethod(loginInfo, deviceInfo);
    }

    public final LiveData<Resource<InitialiseMessage>> initializeAppMethod(LoginInfo loginInfo, DeviceInfo deviceInfo) {
        return BaseRepository.INSTANCE.getAppServer().sendMessage(new InitialiseMessage(loginInfo, deviceInfo, AppViewModel.INSTANCE.getInstance().getLanguageCode(), AppViewModel.INSTANCE.getInstance().getCountryCode()));
    }

    public static /* synthetic */ Resource initializeAppBlockingMethod$default(UserRepository userRepository, LoginInfo loginInfo, DeviceInfo deviceInfo, int i, Object obj) {
        if ((i & 2) != 0) {
            deviceInfo = null;
        }
        return userRepository.initializeAppBlockingMethod(loginInfo, deviceInfo);
    }

    public final Resource<InitialiseMessage> initializeAppBlockingMethod(LoginInfo loginInfo, DeviceInfo deviceInfo) {
        return BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new InitialiseMessage(loginInfo, deviceInfo, AppViewModel.INSTANCE.getInstance().getLanguageCode(), AppViewModel.INSTANCE.getInstance().getCountryCode()));
    }

    public final LiveData<Resource<GetVipCardMessage>> getVipCardMethod() {
        return BaseRepository.INSTANCE.getAppServer().sendMessage(new GetVipCardMessage(0, 1, null));
    }

    public final Resource<GetVipCardMessage> getVipCardMethodBlocking() {
        return BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new GetVipCardMessage(0, 1, null));
    }

    public final LiveData<Resource<GetUserMessage>> getUserProfileMethod() {
        return BaseRepository.INSTANCE.getAppServer().sendMessage(new GetUserMessage(0, 1, null));
    }

    public final LiveData<Resource<DeleteAccountMessage>> deleteAccountMethod() {
        return BaseRepository.INSTANCE.getAppServer().sendMessage(new DeleteAccountMessage(0, 1, null));
    }

    public final LiveData<Resource<UpdateMessage>> updateProfileMethod(String nickname, File avatar, Gender gender) {
        return BaseRepository.INSTANCE.getAppServer().sendMessage(new UpdateMessage(nickname, avatar, gender));
    }

    public final LiveData<Resource<UpdateDeviceInfoMessage>> updateDeviceInfoMethod(DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        return BaseRepository.INSTANCE.getAppServer().sendMessage(new UpdateDeviceInfoMessage(deviceInfo));
    }

    public final LiveData<Resource<LoginOrCreateMessage>> loginWithEmailMethod(LoginInfo loginInfo) {
        Intrinsics.checkNotNullParameter(loginInfo, "loginInfo");
        DeviceInfo deviceInfo = AppViewModel.INSTANCE.getInstance().getDeviceInfo();
        deviceInfo.setDeviceDetailInfo(AppViewModel.INSTANCE.getInstance().getDeviceDetailInfo());
        return BaseRepository.INSTANCE.getAppServer().sendMessage(new LoginOrCreateMessage(loginInfo, deviceInfo, LoginAction.ONLY_LOGIN));
    }

    public final LiveData<Resource<LoginOrCreateMessage>> signUpWithEmailMethod(LoginInfo loginInfo) {
        Intrinsics.checkNotNullParameter(loginInfo, "loginInfo");
        DeviceInfo deviceInfo = AppViewModel.INSTANCE.getInstance().getDeviceInfo();
        deviceInfo.setDeviceDetailInfo(AppViewModel.INSTANCE.getInstance().getDeviceDetailInfo());
        return BaseRepository.INSTANCE.getAppServer().sendMessage(new LoginOrCreateMessage(loginInfo, deviceInfo, LoginAction.CREATE_THEN_LOGIN));
    }

    public final LiveData<Resource<GetVerifyCodeMessage>> getVerifyCodeMethod(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        return BaseRepository.INSTANCE.getAppServer().sendMessage(new GetVerifyCodeMessage(email, AppViewModel.INSTANCE.getInstance().getLanguageCode()));
    }

    public final LiveData<Resource<CheckVerifyCodeMessage>> checkVerifyCodeMethod(String email, String verifyCode) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(verifyCode, "verifyCode");
        return BaseRepository.INSTANCE.getAppServer().sendMessage(new CheckVerifyCodeMessage(email, verifyCode));
    }

    public final LiveData<Resource<ResetPasswordAndLoginMessage>> resetUserPasswordMethod(String email, String verifyCode, String password) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(verifyCode, "verifyCode");
        Intrinsics.checkNotNullParameter(password, "password");
        return BaseRepository.INSTANCE.getAppServer().sendMessage(new ResetPasswordAndLoginMessage(email, verifyCode, password, AppViewModel.INSTANCE.getInstance().getDeviceInfo()));
    }

    public final LiveData<Resource<SendSupportTicketMessage>> submitSupportTicketMethod(String email, SupportType supportType, String content, List<String> images, List<String> tags) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(supportType, "supportType");
        return BaseRepository.INSTANCE.getAppServer().sendMessage(new SendSupportTicketMessage(email, supportType, AppViewModel.INSTANCE.getInstance().getLanguageCode(), AppViewModel.INSTANCE.getInstance().getCountryCode(), content, images, tags));
    }

    public final Resource<SendSupportTicketMessage> submitSupportTicketMethodBlocking(String email, SupportType supportType, String content, List<String> images, List<String> tags) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(supportType, "supportType");
        return BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new SendSupportTicketMessage(email, supportType, AppViewModel.INSTANCE.getInstance().getLanguageCode(), AppViewModel.INSTANCE.getInstance().getCountryCode(), content, images, tags));
    }

    public final Resource<LoginOrCreateMessage> loginWithRestoreMethodBlocking(LoginInfo loginInfo) {
        Intrinsics.checkNotNullParameter(loginInfo, "loginInfo");
        DeviceInfo deviceInfo = AppViewModel.INSTANCE.getInstance().getDeviceInfo();
        deviceInfo.setDeviceDetailInfo(AppViewModel.INSTANCE.getInstance().getDeviceDetailInfo());
        return BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new LoginOrCreateMessage(loginInfo, deviceInfo, LoginAction.ONLY_LOGIN));
    }

    public final LiveData<Resource<SendSupportTicketMessage>> cancelSubscriptionMessage(String email, List<String> tags) {
        Intrinsics.checkNotNullParameter(email, "email");
        String countryCode = AppViewModel.INSTANCE.getInstance().getCountryCode();
        return BaseRepository.INSTANCE.getAppServer().sendMessage(new SendSupportTicketMessage(email, SupportType.VIP_UNSUBSCRIPTION, AppViewModel.INSTANCE.getInstance().getLanguageCode(), countryCode, "", null, tags));
    }

    public final LiveData<Resource<LoginOrCreateMessage>> loginWithGoogleMethod(GoogleSignInAccount account) {
        String str;
        String str2;
        String str3;
        String id;
        Uri photoUrl;
        ThirdPartyUserInfo thirdPartyUserInfo = new ThirdPartyUserInfo(0, 1, null);
        String str4 = "";
        if (account == null || (str = account.getDisplayName()) == null) {
            str = "";
        }
        thirdPartyUserInfo.setNickname(str);
        if (account == null || (photoUrl = account.getPhotoUrl()) == null || (str2 = photoUrl.toString()) == null) {
            str2 = "";
        }
        thirdPartyUserInfo.setAvatarUrl(str2);
        thirdPartyUserInfo.setGender(Gender.UNKNOWN);
        if (account == null || (str3 = account.getEmail()) == null) {
            str3 = "";
        }
        thirdPartyUserInfo.setEmail(str3);
        LoginInfo loginInfo = new LoginInfo(0, 1, null);
        if (account != null && (id = account.getId()) != null) {
            str4 = id;
        }
        loginInfo.setLoginKey(str4);
        loginInfo.setLoginPassword(account != null ? account.getIdToken() : null);
        loginInfo.setLoginType(LoginType.GOOGLE);
        loginInfo.setThirdPartyUserInfo(thirdPartyUserInfo);
        return BaseRepository.INSTANCE.getAppServer().sendMessage(new LoginOrCreateMessage(loginInfo, AppViewModel.INSTANCE.getInstance().getDeviceInfo(), LoginAction.LOGIN_OR_CREATE_THEN_LOGIN));
    }

    public final Resource<UpdateDeviceInfoMessage> updateDeviceInfoMethodBlocking(DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        return BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new UpdateDeviceInfoMessage(deviceInfo));
    }

    public final Resource<RemindUserToAttentionTrialMessage> remindUserToAttentionTrialSync(int daysToRemind, String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        return BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new RemindUserToAttentionTrialMessage(AppViewModel.INSTANCE.getInstance().getLanguageCode(), daysToRemind, email));
    }
}
