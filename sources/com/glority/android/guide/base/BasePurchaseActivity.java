package com.glority.android.guide.base;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.EnvironmentCompat;
import com.glority.android.cmsui.entity.LikeItem;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.guide.BillingUICloseRequest;
import com.glority.android.core.route.guide.GuideBillingInitRequest;
import com.glority.android.core.route.guide.GuideCloseExtraRequest;
import com.glority.android.core.route.vipEvent.VipEventRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.core.utils.device.CorePersistKey;
import com.glority.android.guide.iface.IBillingListener;
import com.glority.android.guide.route.ConvertPageOpenExtraParamUtil;
import com.glority.android.guide.route.ConvertPageOpenWithExtraHandler;
import com.glority.android.guide.route.GetDeviceLevelRequest;
import com.glority.android.ui.base.RuntimePermissionActivity;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BasePurchaseActivity.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001AB\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0006\u0010+\u001a\u00020(J\b\u0010,\u001a\u00020-H\u0002J\u0006\u0010.\u001a\u00020\u0019J\b\u0010/\u001a\u00020\u0013H\u0014J\b\u00100\u001a\u00020\u0013H\u0014J\"\u00101\u001a\u00020(2\u0006\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u00020\u00192\b\u00104\u001a\u0004\u0018\u000105H\u0014J\b\u00106\u001a\u00020(H\u0016J\u0012\u00107\u001a\u00020(2\b\u00108\u001a\u0004\u0018\u00010-H\u0014J\b\u00109\u001a\u00020(H\u0014J\b\u0010:\u001a\u00020(H\u0002J\b\u0010;\u001a\u00020(H\u0004J\b\u0010<\u001a\u00020(H\u0016J\b\u0010=\u001a\u00020\u0013H\u0014J\b\u0010>\u001a\u00020(H\u0002J\u0006\u0010?\u001a\u00020(J\b\u0010@\u001a\u00020(H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR\u001a\u0010\u000f\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR\u001a\u0010\u0012\u001a\u00020\u0013X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0019X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001a\u0010\u001f\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001a\u0010\"\u001a\u00020\u0019X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006B"}, d2 = {"Lcom/glority/android/guide/base/BasePurchaseActivity;", "Lcom/glority/android/ui/base/RuntimePermissionActivity;", "Lcom/glority/android/guide/iface/IBillingListener;", "()V", "abtestId", "", "getAbtestId", "()Ljava/lang/String;", "setAbtestId", "(Ljava/lang/String;)V", "closeExtraParam", "closeExtraParamNoSurvey", "extraParam", "getExtraParam", "setExtraParam", "group", "getGroup", "setGroup", "isInapp", "", "()Z", "setInapp", "(Z)V", "newExtraParam", "openCloseRetainRequestCode", "", "openPurchaseDetainRequestCode", "openPurchaseSuccessRequestCode", "openTimes", "getOpenTimes", "setOpenTimes", "pageFrom", "getPageFrom", "setPageFrom", "pageType", "getPageType", "()I", "setPageType", "(I)V", "applyOverrideConfiguration", "", "overrideConfiguration", "Landroid/content/res/Configuration;", "close", "getBundle", "Landroid/os/Bundle;", "getDeviceLevel", "isConversionPage", "isLightStatusBar", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "onDestroy", "parseExtraParam", "postUiCloseRequest", "purchaseSuccess", "showBackPressedCloseRetain", "trackBackPressed", "trackClose", "trackOpen", "Companion", "base-guide_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes13.dex */
public abstract class BasePurchaseActivity extends RuntimePermissionActivity implements IBillingListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int openPurchaseDetainAndCloseOnlySuccessRequestCode = 82;
    private boolean isInapp;
    private int pageType;
    private final int openCloseRetainRequestCode = 72;
    private final int openPurchaseDetainRequestCode = 80;
    private final int openPurchaseSuccessRequestCode = 81;
    private final String closeExtraParamNoSurvey = "no_survey";
    private String pageFrom = "";
    private String extraParam = "";
    private String newExtraParam = "";
    private String openTimes = LikeItem.DISLIKE;
    private String group = "";
    private String abtestId = "";
    private String closeExtraParam = "";

    @Override // com.glority.android.ui.base.RuntimePermissionActivity
    public void _$_clearFindViewByIdCache() {
    }

    protected boolean isConversionPage() {
        return true;
    }

    protected boolean isLightStatusBar() {
        return true;
    }

    @Override // com.glority.android.guide.iface.IBillingListener
    public void purchaseSuccess() {
    }

    protected boolean showBackPressedCloseRetain() {
        return false;
    }

    /* compiled from: BasePurchaseActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/android/guide/base/BasePurchaseActivity$Companion;", "", "()V", "openPurchaseDetainAndCloseOnlySuccessRequestCode", "", "getOpenPurchaseDetainAndCloseOnlySuccessRequestCode", "()I", "base-guide_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes13.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int getOpenPurchaseDetainAndCloseOnlySuccessRequestCode() {
            return BasePurchaseActivity.openPurchaseDetainAndCloseOnlySuccessRequestCode;
        }
    }

    @Override // com.glority.android.guide.iface.IBillingListener
    public void changePayUi(boolean z) {
        IBillingListener.DefaultImpls.changePayUi(this, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String getPageFrom() {
        return this.pageFrom;
    }

    protected final void setPageFrom(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pageFrom = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getPageType() {
        return this.pageType;
    }

    protected final void setPageType(int i) {
        this.pageType = i;
    }

    protected final String getExtraParam() {
        return this.extraParam;
    }

    protected final void setExtraParam(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.extraParam = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String getOpenTimes() {
        return this.openTimes;
    }

    protected final void setOpenTimes(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.openTimes = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String getGroup() {
        return this.group;
    }

    protected final void setGroup(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.group = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String getAbtestId() {
        return this.abtestId;
    }

    protected final void setAbtestId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.abtestId = str;
    }

    /* renamed from: isInapp, reason: from getter */
    protected final boolean getIsInapp() {
        return this.isInapp;
    }

    protected final void setInapp(boolean z) {
        this.isInapp = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (isConversionPage()) {
            PersistData.INSTANCE.set("hasShownInitVipPage", true);
            PersistData.INSTANCE.set(CorePersistKey.CONVERT_PAGE_OPENING_TIMES, Integer.valueOf(((Number) PersistData.INSTANCE.get(CorePersistKey.CONVERT_PAGE_OPENING_TIMES, 0)).intValue() + 1));
        }
        new GuideBillingInitRequest(AppContext.INSTANCE.peekContext(), this.isInapp).post();
        Window window = getWindow();
        if (window != null) {
            StatusBarUtil.INSTANCE.setImmerseLayout(window);
            StatusBarUtil.INSTANCE.setStatusBarLightMode(window, isLightStatusBar());
        }
        String stringExtra = getIntent().getStringExtra("arg_page_from");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.pageFrom = stringExtra;
        this.pageType = getIntent().getIntExtra("arg_page_type", 0);
        String stringExtra2 = getIntent().getStringExtra(ConvertPageOpenWithExtraHandler.ARG_PAGE_GROUP);
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.group = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra(ConvertPageOpenWithExtraHandler.ARG_PAGE_EXTRA_PARAM);
        this.newExtraParam = stringExtra3 != null ? stringExtra3 : "";
        parseExtraParam();
        trackOpen();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        trackBackPressed();
        if (showBackPressedCloseRetain()) {
            postUiCloseRequest();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.view.ContextThemeWrapper
    public void applyOverrideConfiguration(Configuration overrideConfiguration) {
        if (overrideConfiguration != null) {
            int i = overrideConfiguration.uiMode;
            overrideConfiguration.setTo(getBaseContext().getResources().getConfiguration());
            overrideConfiguration.uiMode = i;
        }
        super.applyOverrideConfiguration(overrideConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.route.RouteableActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        new GuideCloseExtraRequest(null, this.closeExtraParam, 1, null).post();
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == this.openCloseRetainRequestCode || requestCode == this.openPurchaseDetainRequestCode) {
            if (resultCode == -1) {
                this.closeExtraParam = this.closeExtraParamNoSurvey;
                setResult(-1);
            }
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (requestCode == this.openPurchaseSuccessRequestCode) {
            if (resultCode == -1) {
                this.closeExtraParam = this.closeExtraParamNoSurvey;
            }
            setResult(-1);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (requestCode == openPurchaseDetainAndCloseOnlySuccessRequestCode && resultCode == -1) {
            this.closeExtraParam = this.closeExtraParamNoSurvey;
            setResult(-1);
            if (isFinishing()) {
                return;
            }
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void postUiCloseRequest() {
        new BillingUICloseRequest(this.openCloseRetainRequestCode, this.pageFrom, String.valueOf(this.pageType)).post();
    }

    private final Bundle getBundle() {
        String countryCode = Locale.getDefault().getCountry();
        Intrinsics.checkNotNullExpressionValue(countryCode, "countryCode");
        if (countryCode.length() == 0) {
            countryCode = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        return LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("from", this.pageFrom), TuplesKt.to("name", Integer.valueOf(this.pageType)), TuplesKt.to("group", this.group), TuplesKt.to(LogEventArguments.ARG_STRING_1, this.abtestId), TuplesKt.to("code", countryCode), TuplesKt.to(LogEventArguments.ARG_STEP, this.openTimes));
    }

    private final void trackOpen() {
        new VipEventRequest("vip_open", getBundle()).post();
    }

    private final void trackBackPressed() {
        new VipEventRequest("vip_close_back", getBundle()).post();
    }

    public final void trackClose() {
        new VipEventRequest("vip_close", getBundle()).post();
    }

    public final int getDeviceLevel() {
        return new GetDeviceLevelRequest().toResult().intValue();
    }

    private final void parseExtraParam() {
        if (this.newExtraParam.length() > 0) {
            this.extraParam = ConvertPageOpenExtraParamUtil.INSTANCE.parsePlantType(this.newExtraParam);
            this.abtestId = ConvertPageOpenExtraParamUtil.INSTANCE.parseABTestId(this.newExtraParam);
            this.openTimes = ConvertPageOpenExtraParamUtil.INSTANCE.parseOpenTimes(this.newExtraParam);
        }
    }

    public final void close() {
        finish();
    }
}
