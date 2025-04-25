package com.glority.base.viewmodel;

import android.location.Location;
import android.os.Build;
import androidx.lifecycle.MutableLiveData;
import com.glority.android.app.BuildConfig;
import com.glority.android.cmsui.common.CmsUILogEvents;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.adjust.GetAdjustIdRequest;
import com.glority.android.core.route.agreement.UpdateLegalConfigRequest;
import com.glority.android.core.route.analysis.FirebaseSetUserIdRequest;
import com.glority.android.core.route.analysis.UpdateAdvertisingIdRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.ui.base.LocaleManager;
import com.glority.base.routers.UserChangedRequest;
import com.glority.base.routers.abtest.AbtestGetTagMapHandler;
import com.glority.base.storage.PersistKey;
import com.glority.billing.utils.PaymentUtils;
import com.glority.component.generatedAPI.kotlinAPI.enums.DeviceType;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import com.glority.component.generatedAPI.kotlinAPI.enums.LoginType;
import com.glority.component.generatedAPI.kotlinAPI.enums.VipLevel;
import com.glority.component.generatedAPI.kotlinAPI.user.ClientConfig;
import com.glority.component.generatedAPI.kotlinAPI.user.DeviceDetailInfo;
import com.glority.component.generatedAPI.kotlinAPI.user.DeviceInfo;
import com.glority.component.generatedAPI.kotlinAPI.user.LoginInfo;
import com.glority.component.generatedAPI.kotlinAPI.user.User;
import com.glority.component.generatedAPI.kotlinAPI.user.UserAdditionalData;
import com.glority.component.generatedAPI.kotlinAPI.vip.VipInfo;
import com.glority.utils.ui.ToastUtils;
import com.glority.utils.ui.ViewUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AppViewModel.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000 V2\u00020\u0001:\u0001VB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001e\u001a\u00020\u0013J\b\u0010=\u001a\u0004\u0018\u00010>J\u0010\u0010B\u001a\u00020C2\b\u0010.\u001a\u0004\u0018\u000100J&\u0010D\u001a\u00020C2\b\u0010.\u001a\u0004\u0018\u0001002\b\u0010E\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>J\u0010\u0010F\u001a\u00020C2\b\u0010G\u001a\u0004\u0018\u000106J\u0006\u0010H\u001a\u00020CJ\u0006\u0010I\u001a\u00020CJ\u000e\u0010J\u001a\u00020C2\u0006\u0010K\u001a\u00020LJ\u0006\u0010M\u001a\u00020LJ\u0006\u0010N\u001a\u00020CJ\u0006\u0010O\u001a\u00020PJ\u0006\u0010Q\u001a\u00020RJ\u0006\u0010S\u001a\u00020@J\u0006\u0010T\u001a\u00020UR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001f\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R(\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010(0'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\t\"\u0004\b*\u0010+R\u0013\u0010,\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b-\u0010\u000fR#\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000/8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b1\u00102R!\u00105\u001a\b\u0012\u0004\u0012\u0002060/8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b7\u00102R\u001b\u00109\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00104\u001a\u0004\b:\u0010;R\u0011\u0010?\u001a\u00020@8F¢\u0006\u0006\u001a\u0004\b?\u0010A¨\u0006W"}, d2 = {"Lcom/glority/base/viewmodel/AppViewModel;", "Lcom/glority/base/viewmodel/BaseViewModel;", "<init>", "()V", "languages", "", "", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "getLanguages", "()Ljava/util/Map;", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "uploadWidth", "", "getUploadWidth", "()I", "uploadHeight", "getUploadHeight", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "getLocation", "()Landroid/location/Location;", "setLocation", "(Landroid/location/Location;)V", "getRecognizeOwnCount", "value", "Lcom/glority/component/generatedAPI/kotlinAPI/user/ClientConfig;", "clientConfig", "getClientConfig", "()Lcom/glority/component/generatedAPI/kotlinAPI/user/ClientConfig;", "setClientConfig", "(Lcom/glority/component/generatedAPI/kotlinAPI/user/ClientConfig;)V", "otherConfig", "", "", "getOtherConfig", "setOtherConfig", "(Ljava/util/Map;)V", "shareAppUrl", "getShareAppUrl", "user", "Landroidx/lifecycle/MutableLiveData;", "Lcom/glority/component/generatedAPI/kotlinAPI/user/User;", "getUser", "()Landroidx/lifecycle/MutableLiveData;", "user$delegate", "Lkotlin/Lazy;", "vipInfo", "Lcom/glority/component/generatedAPI/kotlinAPI/vip/VipInfo;", "getVipInfo", "vipInfo$delegate", "defaultVipInfo", "getDefaultVipInfo", "()Lcom/glority/component/generatedAPI/kotlinAPI/vip/VipInfo;", "defaultVipInfo$delegate", "additionalData", "Lcom/glority/component/generatedAPI/kotlinAPI/user/UserAdditionalData;", "isUserGuest", "", "()Z", "updateUser", "", "updateUserAndToken", "accessToken", "updateUserVipInfo", CmsUILogEvents.INFO, "updateUserPendingVipInfo", "removeUserInformation", "updateLoginInfo", "loginInfo", "Lcom/glority/component/generatedAPI/kotlinAPI/user/LoginInfo;", "getLoginInfo", "clearSession", "getDeviceInfo", "Lcom/glority/component/generatedAPI/kotlinAPI/user/DeviceInfo;", "getDeviceDetailInfo", "Lcom/glority/component/generatedAPI/kotlinAPI/user/DeviceDetailInfo;", "isVipInHistory", "userCreateTime", "", "Companion", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class AppViewModel extends BaseViewModel {
    private static final int PICTURE_HEIGHT;
    public static final int PICTURE_WIDTH = 1080;
    private static final int SCREEN_HEIGHT;
    private static final int SCREEN_WIDTH;
    public static final String TAG = "AppViewModel";
    private String countryCode;

    /* renamed from: defaultVipInfo$delegate, reason: from kotlin metadata */
    private final Lazy defaultVipInfo;
    private final Map<String, LanguageCode> languages;
    private Location location;
    private Map<String, ? extends Object> otherConfig;

    /* renamed from: user$delegate, reason: from kotlin metadata */
    private final Lazy user;

    /* renamed from: vipInfo$delegate, reason: from kotlin metadata */
    private final Lazy vipInfo;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<AppViewModel> instance$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<AppViewModel>() { // from class: com.glority.base.viewmodel.AppViewModel$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final AppViewModel invoke() {
            return new AppViewModel(null);
        }
    });

    public /* synthetic */ AppViewModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final int getUploadHeight() {
        return 960;
    }

    public final int getUploadWidth() {
        return 720;
    }

    private AppViewModel() {
        LanguageCode languageCode;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String language = Locale.US.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        linkedHashMap.put(language, LanguageCode.English);
        linkedHashMap.put("de", LanguageCode.German);
        linkedHashMap.put("es", LanguageCode.Spanish);
        String language2 = Locale.FRANCE.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language2, "getLanguage(...)");
        linkedHashMap.put(language2, LanguageCode.French);
        String language3 = Locale.ITALY.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language3, "getLanguage(...)");
        linkedHashMap.put(language3, LanguageCode.Italian);
        linkedHashMap.put("nl", LanguageCode.Dutch);
        linkedHashMap.put("pt", LanguageCode.Portuguese);
        linkedHashMap.put("ja", LanguageCode.Japanese);
        String language4 = Locale.KOREA.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language4, "getLanguage(...)");
        linkedHashMap.put(language4, LanguageCode.Korean);
        linkedHashMap.put("ar", LanguageCode.Arabic);
        linkedHashMap.put("es", LanguageCode.Spanish);
        linkedHashMap.put("ru", LanguageCode.Russian);
        linkedHashMap.put("pt", LanguageCode.Portuguese);
        linkedHashMap.put("sv", LanguageCode.Swedish);
        linkedHashMap.put("pl", LanguageCode.Polish);
        linkedHashMap.put("ms", LanguageCode.Malay);
        linkedHashMap.put("th", LanguageCode.Thai);
        linkedHashMap.put("sl", LanguageCode.Slovenia);
        linkedHashMap.put("ro", LanguageCode.Romanian);
        String language5 = Locale.CHINESE.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language5, "getLanguage(...)");
        if (Intrinsics.areEqual(LocaleManager.getInstance().getCountry(), Locale.SIMPLIFIED_CHINESE.getCountry())) {
            languageCode = LanguageCode.Chinese;
        } else {
            languageCode = LanguageCode.TraditionalChinese;
        }
        linkedHashMap.put(language5, languageCode);
        this.languages = linkedHashMap;
        String country = LocaleManager.getInstance().getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        this.countryCode = country;
        this.otherConfig = new HashMap();
        this.user = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<MutableLiveData<User>>() { // from class: com.glority.base.viewmodel.AppViewModel$user$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final MutableLiveData<User> invoke() {
                return new MutableLiveData<>(PersistData.INSTANCE.get(PersistKey.KEY_USER));
            }
        });
        this.vipInfo = LazyKt.lazy(new Function0<MutableLiveData<VipInfo>>() { // from class: com.glority.base.viewmodel.AppViewModel$vipInfo$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final MutableLiveData<VipInfo> invoke() {
                VipInfo vipInfo = (VipInfo) PersistData.INSTANCE.get(PersistKey.KEY_VIP_INFO);
                if (vipInfo == null) {
                    vipInfo = AppViewModel.this.getDefaultVipInfo();
                }
                return new MutableLiveData<>(vipInfo);
            }
        });
        this.defaultVipInfo = LazyKt.lazy(new Function0<VipInfo>() { // from class: com.glority.base.viewmodel.AppViewModel$defaultVipInfo$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final VipInfo invoke() {
                VipInfo vipInfo = new VipInfo(0, 1, null);
                vipInfo.setUserId(AppViewModel.INSTANCE.getUserId());
                vipInfo.setVipLevel(VipLevel.NONE);
                return vipInfo;
            }
        });
    }

    /* compiled from: AppViewModel.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017¨\u0006 "}, d2 = {"Lcom/glority/base/viewmodel/AppViewModel$Companion;", "", "<init>", "()V", "TAG", "", "instance", "Lcom/glority/base/viewmodel/AppViewModel;", "getInstance", "()Lcom/glority/base/viewmodel/AppViewModel;", "instance$delegate", "Lkotlin/Lazy;", "SCREEN_WIDTH", "", "getSCREEN_WIDTH", "()I", "SCREEN_HEIGHT", "getSCREEN_HEIGHT", "PICTURE_WIDTH", "PICTURE_HEIGHT", "getPICTURE_HEIGHT", "isVip", "", "()Z", "isTrial", "vipStartAt", "Ljava/util/Date;", "getVipStartAt", "()Ljava/util/Date;", "isDebugMode", "getUserId", "", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AppViewModel getInstance() {
            return (AppViewModel) AppViewModel.instance$delegate.getValue();
        }

        public final int getSCREEN_WIDTH() {
            return AppViewModel.SCREEN_WIDTH;
        }

        public final int getSCREEN_HEIGHT() {
            return AppViewModel.SCREEN_HEIGHT;
        }

        public final int getPICTURE_HEIGHT() {
            return AppViewModel.PICTURE_HEIGHT;
        }

        public final boolean isVip() {
            VipInfo vipInfo = (VipInfo) PersistData.INSTANCE.get(PersistKey.KEY_VIP_INFO);
            return (vipInfo != null && vipInfo.getIsVip()) || PaymentUtils.INSTANCE.isPaddingVip();
        }

        public final boolean isTrial() {
            VipInfo vipInfo = (VipInfo) PersistData.INSTANCE.get(PersistKey.KEY_VIP_INFO);
            return vipInfo != null && vipInfo.getIsTrial();
        }

        public final Date getVipStartAt() {
            VipInfo vipInfo = (VipInfo) PersistData.INSTANCE.get(PersistKey.KEY_VIP_INFO);
            if (vipInfo != null) {
                return vipInfo.getStartAt();
            }
            return null;
        }

        public final boolean isDebugMode() {
            return !StringsKt.startsWith(AppContext.INSTANCE.getConfig("ENV"), BuildConfig.ENV, true);
        }

        public final long getUserId() {
            User value = getInstance().getUser().getValue();
            if (value != null) {
                return value.getUserId();
            }
            return 0L;
        }
    }

    static {
        int screenWidth = ViewUtils.getScreenWidth();
        SCREEN_WIDTH = screenWidth;
        int screenHeight = ViewUtils.getScreenHeight();
        SCREEN_HEIGHT = screenHeight;
        PICTURE_HEIGHT = (screenHeight * PICTURE_WIDTH) / screenWidth;
    }

    public final Map<String, LanguageCode> getLanguages() {
        return this.languages;
    }

    public final LanguageCode getLanguageCode() {
        LanguageCode languageCode = this.languages.get(LocaleManager.getInstance().getLanguage());
        return languageCode == null ? LanguageCode.English : languageCode;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final void setCountryCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.countryCode = str;
    }

    public final Location getLocation() {
        return this.location;
    }

    public final void setLocation(Location location) {
        this.location = location;
    }

    public final int getRecognizeOwnCount() {
        return ((Number) PersistData.INSTANCE.get(PersistKey.KEY_LOCAL_RECOGNIZE_OWN_COUNT, 0)).intValue();
    }

    public final ClientConfig getClientConfig() {
        return (ClientConfig) PersistData.INSTANCE.get(PersistKey.KEY_CLIENT_CONFIG);
    }

    public final void setClientConfig(ClientConfig clientConfig) {
        PersistData.INSTANCE.set(PersistKey.KEY_CLIENT_CONFIG, clientConfig);
        new UpdateLegalConfigRequest().post();
    }

    public final Map<String, Object> getOtherConfig() {
        return this.otherConfig;
    }

    public final void setOtherConfig(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.otherConfig = map;
    }

    public final String getShareAppUrl() {
        ClientConfig clientConfig = getClientConfig();
        if (clientConfig != null) {
            return clientConfig.getShareAppUrl();
        }
        return null;
    }

    public final MutableLiveData<User> getUser() {
        return (MutableLiveData) this.user.getValue();
    }

    public final MutableLiveData<VipInfo> getVipInfo() {
        return (MutableLiveData) this.vipInfo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VipInfo getDefaultVipInfo() {
        return (VipInfo) this.defaultVipInfo.getValue();
    }

    public final UserAdditionalData additionalData() {
        Object obj = PersistData.INSTANCE.get(PersistKey.KEY_USER_ADDITIONAL_DATA);
        if (obj instanceof UserAdditionalData) {
            return (UserAdditionalData) obj;
        }
        return null;
    }

    public final boolean isUserGuest() {
        if (getUser().getValue() == null) {
            return true;
        }
        User value = getUser().getValue();
        if ((value != null ? Boolean.valueOf(value.getGuestUser()) : null) == null) {
            return true;
        }
        User value2 = getUser().getValue();
        return value2 != null && value2.getGuestUser();
    }

    public final void updateUser(User user) {
        if (user != null) {
            getUser().setValue(user);
            new FirebaseSetUserIdRequest(String.valueOf(user.getUserId())).post();
        }
        PersistData.INSTANCE.set(PersistKey.KEY_USER, user);
    }

    public static /* synthetic */ void updateUserAndToken$default(AppViewModel appViewModel, User user, String str, UserAdditionalData userAdditionalData, int i, Object obj) {
        if ((i & 4) != 0) {
            userAdditionalData = null;
        }
        appViewModel.updateUserAndToken(user, str, userAdditionalData);
    }

    public final void updateUserAndToken(User user, String accessToken, UserAdditionalData additionalData) {
        User value = getUser().getValue();
        new UserChangedRequest(value != null ? Long.valueOf(value.getUserId()) : null, user != null ? Long.valueOf(user.getUserId()) : null).post();
        updateUser(user);
        PersistData.INSTANCE.set(PersistKey.KEY_ACCESS_TOKEN, accessToken);
        PersistData.INSTANCE.set(PersistKey.KEY_USER_ADDITIONAL_DATA, additionalData);
        new UpdateAdvertisingIdRequest().post();
    }

    public final void updateUserVipInfo(VipInfo info) {
        PersistData.INSTANCE.set(PersistKey.KEY_VIP_INFO, info);
        if (info != null) {
            getVipInfo().setValue(info);
            User value = getUser().getValue();
            if (value != null) {
                value.setVip(info.getIsVip());
                getUser().setValue(value);
            }
        }
    }

    public final void updateUserPendingVipInfo() {
        Companion companion = INSTANCE;
        if (companion.isVip()) {
            return;
        }
        if (PaymentUtils.INSTANCE.isPaddingVip()) {
            if (companion.isDebugMode()) {
                ToastUtils.showShort("Vip is pending vip", new Object[0]);
            }
            VipInfo vipInfo = new VipInfo(0, 1, null);
            vipInfo.setSku("");
            User value = companion.getInstance().getUser().getValue();
            vipInfo.setUserId(value != null ? value.getUserId() : 0L);
            vipInfo.setTrial(false);
            vipInfo.setVip(true);
            vipInfo.setVipLevel(VipLevel.GOLD);
            updateUserVipInfo(vipInfo);
            User value2 = getUser().getValue();
            if (value2 != null) {
                value2.setVip(vipInfo.getIsVip());
                getUser().setValue(value2);
                return;
            }
            return;
        }
        if (companion.isDebugMode()) {
            ToastUtils.showShort("Vip is NOT pending vip", new Object[0]);
        }
        getVipInfo().setValue(getDefaultVipInfo());
    }

    public final void removeUserInformation() {
        User value = getUser().getValue();
        new UserChangedRequest(value != null ? Long.valueOf(value.getUserId()) : null, null).post();
        getUser().setValue(null);
        getVipInfo().setValue(getDefaultVipInfo());
        PersistData.INSTANCE.remove(PersistKey.KEY_USER);
        PersistData.INSTANCE.remove(PersistKey.KEY_USER_ADDITIONAL_DATA);
        PersistData.INSTANCE.remove(PersistKey.KEY_VIP_INFO);
    }

    public final void updateLoginInfo(LoginInfo loginInfo) {
        Intrinsics.checkNotNullParameter(loginInfo, "loginInfo");
        PersistData.INSTANCE.set(PersistKey.KEY_LOGIN_INFO, loginInfo);
    }

    public final LoginInfo getLoginInfo() {
        LoginInfo loginInfo = (LoginInfo) PersistData.INSTANCE.get(PersistKey.KEY_LOGIN_INFO);
        if (loginInfo != null) {
            return loginInfo;
        }
        LoginInfo loginInfo2 = new LoginInfo(0, 1, null);
        loginInfo2.setLoginType(LoginType.GUEST);
        loginInfo2.setLoginKey(PersistData.INSTANCE.getDeviceId());
        loginInfo2.setLoginPassword(null);
        loginInfo2.setThirdPartyUserInfo(null);
        return loginInfo2;
    }

    public final void clearSession() {
        PersistData.INSTANCE.remove(PersistKey.KEY_ACCESS_TOKEN);
        PersistData.INSTANCE.remove(PersistKey.KEY_USER_SESSION);
        PersistData.INSTANCE.remove(PersistKey.KEY_THIRD_INFO);
        PersistData.INSTANCE.remove(PersistKey.KEY_LOGIN_INFO);
    }

    public final DeviceInfo getDeviceInfo() {
        DeviceInfo deviceInfo = new DeviceInfo(0, 1, null);
        deviceInfo.setDeviceType(DeviceType.ANDROID);
        deviceInfo.setDeviceToken(PersistData.INSTANCE.getDeviceId());
        return deviceInfo;
    }

    public final DeviceDetailInfo getDeviceDetailInfo() {
        DeviceDetailInfo deviceDetailInfo = new DeviceDetailInfo(0, 1, null);
        String result = new GetAdjustIdRequest().toResult();
        if (result == null) {
            result = "";
        }
        deviceDetailInfo.setAppsFlyerId(result);
        deviceDetailInfo.setAppsFlyerAdvertisingId(null);
        deviceDetailInfo.setCountryCode(this.countryCode);
        deviceDetailInfo.setLanguage(getLanguageCode().name());
        deviceDetailInfo.setAppVersion(AppContext.INSTANCE.getConfig("VERSION_NAME"));
        deviceDetailInfo.setDeviceOs("ANDROID" + Build.VERSION.SDK);
        deviceDetailInfo.setDeviceModel(Build.MODEL);
        return deviceDetailInfo;
    }

    public final boolean isVipInHistory() {
        if (Intrinsics.areEqual((Object) AbtestGetTagMapHandler.INSTANCE.getHasSubscribeRecord(), (Object) true)) {
            return true;
        }
        UserAdditionalData additionalData = additionalData();
        return additionalData != null && additionalData.getIsVipInHistory();
    }

    public final long userCreateTime() {
        Date createdAt;
        User value = getUser().getValue();
        return (value == null || (createdAt = value.getCreatedAt()) == null) ? System.currentTimeMillis() : createdAt.getTime();
    }
}
