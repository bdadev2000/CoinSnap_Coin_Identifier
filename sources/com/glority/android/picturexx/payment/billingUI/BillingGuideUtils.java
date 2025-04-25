package com.glority.android.picturexx.payment.billingUI;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BundleKt;
import androidx.core.os.EnvironmentCompat;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.abtest.AbtestGetVariableTestIdRequest;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.route.guide.ConvertPageOpenExtraRequest;
import com.glority.android.core.route.vipEvent.VipEventRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.core.utils.device.CorePersistKey;
import com.glority.android.guide.iface.IBillingListener;
import com.glority.android.guide.route.ConvertPageOpenExtraParamUtil;
import com.glority.android.guide.utils.GuideUtils;
import com.glority.android.picturexx.payment.R;
import com.glority.android.picturexx.payment.billing.BillingViewModel;
import com.glority.android.picturexx.payment.detain.DetainUtil;
import com.glority.android.picturexx.payment.logevents.PaymentLogEvents;
import com.glority.android.picturexx.payment.routers.BillingPageTypeConvertRequest;
import com.glority.android.picturexx.payment.routers.PurchaseDialogRequest;
import com.glority.android.picturexx.payment.skumanager.SkuManager;
import com.glority.android.picturexx.payment.skumanager.internal.ActualSkuManager;
import com.glority.android.retain.BuildConfig;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.storage.PersistKey;
import com.glority.base.utils.AbTestUtil;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.billing.agent.MyBillingAgent;
import com.glority.billing.purchase.generatedAPI.kotlinAPI.enums.RestorePolicy;
import com.glority.component.generatedAPI.kotlinAPI.ErrorCodes;
import com.glority.component.generatedAPI.kotlinAPI.user.User;
import com.glority.component.generatedAPI.kotlinAPI.vip.RestoreResult;
import com.glority.component.generatedAPI.kotlinAPI.vip.VipInfo;
import com.glority.network.model.Status;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: BillingGuideUtils.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001zB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0005H\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0002J\r\u0010-\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010.J\r\u0010/\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010.J*\u00100\u001a\u0002012\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0005J\u0010\u00103\u001a\u0002012\u0006\u00104\u001a\u00020\u0016H\u0002J\u0010\u00105\u001a\u0002012\b\b\u0002\u00106\u001a\u00020\u0016J\u000e\u00107\u001a\u0002012\u0006\u00108\u001a\u000209J\u0006\u0010:\u001a\u000201J[\u0010;\u001a\u0002012\b\u0010<\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010=\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010>\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010?J5\u0010@\u001a\u0002012\b\u0010<\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010>\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010AJ\b\u0010B\u001a\u000201H\u0002J\u0012\u0010C\u001a\u0004\u0018\u00010\u00052\b\u0010<\u001a\u0004\u0018\u00010\u0005J\u0012\u0010D\u001a\u0004\u0018\u00010\u00052\b\u0010<\u001a\u0004\u0018\u00010\u0005J\u0012\u0010E\u001a\u0004\u0018\u00010\u00052\b\u0010<\u001a\u0004\u0018\u00010\u0005J\b\u0010F\u001a\u000201H\u0002J\u0006\u0010G\u001a\u000201J\b\u0010H\u001a\u00020\u0005H\u0002J\u0006\u0010I\u001a\u00020JJ\b\u0010K\u001a\u00020JH\u0002J\b\u0010L\u001a\u00020JH\u0002J\u0010\u0010M\u001a\u0002012\b\b\u0002\u0010N\u001a\u00020OJ*\u0010P\u001a\u0002012\u0006\u0010Q\u001a\u00020\u00162\b\u0010R\u001a\u0004\u0018\u00010S2\u000e\u0010T\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010UH\u0016J,\u0010W\u001a\u0002012\b\u0010X\u001a\u0004\u0018\u00010Y2\u0006\u0010M\u001a\u00020\u00162\u0006\u0010Z\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010]\u001a\u0002012\u0006\u0010^\u001a\u00020\u000f2\b\u0010_\u001a\u0004\u0018\u00010\u00052\u0006\u0010M\u001a\u00020\u0016H\u0016J4\u0010`\u001a\u0002012\b\u0010X\u001a\u0004\u0018\u00010Y2\u0006\u0010M\u001a\u00020\u00162\u0006\u0010Z\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u00010\u00052\u0006\u0010N\u001a\u00020OH\u0016J\u0010\u0010a\u001a\u0002012\u0006\u0010b\u001a\u00020cH\u0002J\u0010\u0010d\u001a\u0002012\u0006\u0010M\u001a\u00020\u0016H\u0002J\u001c\u0010e\u001a\u0002012\u0006\u0010f\u001a\u00020\u00052\n\b\u0002\u0010g\u001a\u0004\u0018\u00010JH\u0002J\b\u0010h\u001a\u000201H\u0016J\b\u0010i\u001a\u00020\u0005H\u0016J\u0010\u0010j\u001a\u00020\u00162\u0006\u0010k\u001a\u00020lH\u0002J\u0010\u0010m\u001a\u00020\u00162\u0006\u0010k\u001a\u00020lH\u0002J\u0010\u0010n\u001a\u00020\u00162\u0006\u0010k\u001a\u00020lH\u0002J\b\u0010o\u001a\u000201H\u0002J\u0006\u0010p\u001a\u000201J\u0006\u0010q\u001a\u000201J\u0006\u0010r\u001a\u000201J\u0006\u0010s\u001a\u000201J\u0006\u0010t\u001a\u000201J\u0006\u0010u\u001a\u000201J\u0006\u0010v\u001a\u000201J\u0006\u0010w\u001a\u000201J\u0006\u0010x\u001a\u000201J\n\u0010y\u001a\u0004\u0018\u00010lH\u0002R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001aR\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160(¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00160(¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*¨\u0006{"}, d2 = {"Lcom/glority/android/picturexx/payment/billingUI/BillingGuideUtils;", "Lcom/glority/billing/agent/MyBillingAgent$MyBillingAgentListener;", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "vm", "Lcom/glority/android/picturexx/payment/billing/BillingViewModel;", "getVm", "()Lcom/glority/android/picturexx/payment/billing/BillingViewModel;", "vm$delegate", "Lkotlin/Lazy;", "pageType", "", "pageFrom", "group", "progressDialog", "Landroidx/fragment/app/DialogFragment;", "currentSku", "showDetain", "", "billingAgent", "Lcom/glority/billing/agent/MyBillingAgent;", "notifyOpened", "Ljava/lang/Boolean;", "purchaseSuccessByRestore", "currentPurchasePageType", "Lcom/glority/android/picturexx/payment/billingUI/BillingGuideUtils$PurchasePageType;", "abtestId", "getAbtestId", "()Ljava/lang/String;", "setAbtestId", "(Ljava/lang/String;)V", "isInappRecord", "()Z", "setInappRecord", "(Z)V", "setupFinished", "Landroidx/lifecycle/MutableLiveData;", "getSetupFinished", "()Landroidx/lifecycle/MutableLiveData;", "purchaseSuccess", "getPurchaseSuccess", "isNotifyOpened", "()Ljava/lang/Boolean;", "isPurchaseSuccessByRestore", "billingStartActivity", "", "requestCode", "cacheIsStartTrialTagIfNeeded", "isTrial", "billingInit", "isInapp", "billingPreInit", "context", "Landroidx/appcompat/app/AppCompatActivity;", "billingDestroy", "startDirectPurchase", LogEventArguments.ARG_SKU, "abtestGroup", "replaceSkusProrationMode", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZLjava/lang/Boolean;)V", "startPurchase", "(Ljava/lang/String;IZLjava/lang/Boolean;)V", "setPurchasePageType", "getPriceBySku", "getIntroductoryPriceBySku", "getCurrencyCodeBySku", "showProgress", "hideProgress", "getCountryCode", "getPurchaseLogEventBundle", "Landroid/os/Bundle;", "getDetainBundle", "getRetainBundle", "restore", "restorePolicy", "Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/enums/RestorePolicy;", "myBillingSetupFinished", "success", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "skuDetailsList", "", "Lcom/android/billingclient/api/ProductDetails;", "myPurchaseSuccess", FirebaseAnalytics.Event.PURCHASE, "Lcom/android/billingclient/api/Purchase;", "status", "Lcom/glority/network/model/Status;", "appData", "myPurchaseError", "errorCode", LogEventArguments.ARG_MESSAGE, "myRestoreOrderSuccess", "onRestore", "restoreResult", "Lcom/glority/component/generatedAPI/kotlinAPI/vip/RestoreResult;", "onSuccess", "logBillingEvent", NotificationCompat.CATEGORY_EVENT, "args", "myShowProgress", "myGetProductType", "isPurchaseDetainActivity", "activity", "Landroid/app/Activity;", "isCloseRetainActivity", "isConversionActivity", "setVipPageOpenCount", "logOpenEvent", "logCloseEvent", "logBuyEvent", "logBuySuccessEvent", "logBuyFailEvent", "logRestoreEvent", "logRestoreSuccessEvent", "logRestoreFailEvent", "logCancelEvent", "getCurrentActivity", "PurchasePageType", "purchase_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class BillingGuideUtils implements MyBillingAgent.MyBillingAgentListener {
    public static final BillingGuideUtils INSTANCE;
    private static final String TAG;
    private static String abtestId;
    private static MyBillingAgent billingAgent;
    private static PurchasePageType currentPurchasePageType;
    private static String currentSku;
    private static boolean isInappRecord;
    private static Boolean notifyOpened;
    private static DialogFragment progressDialog;
    private static final MutableLiveData<Boolean> purchaseSuccess;
    private static Boolean purchaseSuccessByRestore;
    private static final MutableLiveData<Boolean> setupFinished;
    private static boolean showDetain;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private static final Lazy vm;

    public static final void myRestoreOrderSuccess$lambda$18$lambda$17$lambda$15(DialogInterface dialogInterface, int i) {
    }

    @Override // com.glority.billing.agent.MyBillingAgent.MyBillingAgentListener
    public void myShowProgress() {
    }

    private BillingGuideUtils() {
    }

    @Override // com.glority.billing.agent.MyBillingAgent.MyBillingAgentListener
    public void myConsumerResponse(BillingResult billingResult, String str) {
        MyBillingAgent.MyBillingAgentListener.DefaultImpls.myConsumerResponse(this, billingResult, str);
    }

    @Override // com.glority.billing.agent.MyBillingAgent.MyBillingAgentListener
    public boolean myRestoreEmpty() {
        return MyBillingAgent.MyBillingAgentListener.DefaultImpls.myRestoreEmpty(this);
    }

    /* compiled from: BillingGuideUtils.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/android/picturexx/payment/billingUI/BillingGuideUtils$PurchasePageType;", "", "<init>", "(Ljava/lang/String;I)V", "DETAIN", "RETAIN", "CONVERSION", "purchase_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes2.dex */
    public static final class PurchasePageType extends Enum<PurchasePageType> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PurchasePageType[] $VALUES;
        public static final PurchasePageType DETAIN = new PurchasePageType("DETAIN", 0);
        public static final PurchasePageType RETAIN = new PurchasePageType("RETAIN", 1);
        public static final PurchasePageType CONVERSION = new PurchasePageType("CONVERSION", 2);

        private static final /* synthetic */ PurchasePageType[] $values() {
            return new PurchasePageType[]{DETAIN, RETAIN, CONVERSION};
        }

        public static EnumEntries<PurchasePageType> getEntries() {
            return $ENTRIES;
        }

        private PurchasePageType(String str, int i) {
            super(str, i);
        }

        static {
            PurchasePageType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static PurchasePageType valueOf(String str) {
            return (PurchasePageType) Enum.valueOf(PurchasePageType.class, str);
        }

        public static PurchasePageType[] values() {
            return (PurchasePageType[]) $VALUES.clone();
        }
    }

    static {
        BillingGuideUtils billingGuideUtils = new BillingGuideUtils();
        INSTANCE = billingGuideUtils;
        TAG = billingGuideUtils.getClass().getSimpleName();
        vm = LazyKt.lazy(new Function0<BillingViewModel>() { // from class: com.glority.android.picturexx.payment.billingUI.BillingGuideUtils$vm$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final BillingViewModel invoke() {
                return new BillingViewModel();
            }
        });
        showDetain = true;
        currentPurchasePageType = PurchasePageType.CONVERSION;
        abtestId = "";
        setupFinished = new MutableLiveData<>();
        purchaseSuccess = new MutableLiveData<>();
    }

    private final BillingViewModel getVm() {
        return (BillingViewModel) vm.getValue();
    }

    private final int pageType() {
        Integer num = (Integer) PersistData.INSTANCE.get("billing_pageType");
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    private final String pageFrom() {
        String str = (String) PersistData.INSTANCE.get("billing_pageFrom");
        return str == null ? "" : str;
    }

    private final String group() {
        String str = (String) PersistData.INSTANCE.get("billing_group");
        return str == null ? "" : str;
    }

    public final String getAbtestId() {
        return abtestId;
    }

    public final void setAbtestId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        abtestId = str;
    }

    public final boolean isInappRecord() {
        return isInappRecord;
    }

    public final void setInappRecord(boolean z) {
        isInappRecord = z;
    }

    public final MutableLiveData<Boolean> getSetupFinished() {
        return setupFinished;
    }

    public final MutableLiveData<Boolean> getPurchaseSuccess() {
        return purchaseSuccess;
    }

    public final Boolean isNotifyOpened() {
        return notifyOpened;
    }

    public final Boolean isPurchaseSuccessByRestore() {
        return purchaseSuccessByRestore;
    }

    public static /* synthetic */ void billingStartActivity$default(BillingGuideUtils billingGuideUtils, String str, int i, int i2, String str2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            str2 = "";
        }
        billingGuideUtils.billingStartActivity(str, i, i2, str2);
    }

    public final void billingStartActivity(String pageFrom, int pageType, int requestCode, String group) {
        Intrinsics.checkNotNullParameter(group, "group");
        PersistData.INSTANCE.set("billing_pageType", Integer.valueOf(pageType));
        PersistData.INSTANCE.set("billing_pageFrom", pageFrom);
        PersistData.INSTANCE.set("billing_group", group);
        setVipPageOpenCount();
        String result = new AbtestGetVariableTestIdRequest(AbTestUtil.tag_conversion_page, String.valueOf(pageType)).toResult();
        if (result == null) {
            result = "";
        }
        abtestId = result;
        int intValue = ((Number) PersistData.INSTANCE.get(PersistKey.KEY_VIP_OPEN_COUNT, 0)).intValue() + 1;
        Integer result2 = new BillingPageTypeConvertRequest(pageType).toResult();
        new ConvertPageOpenExtraRequest(String.valueOf(result2 != null ? result2.intValue() : pageType), pageFrom, pageType, requestCode, group, ConvertPageOpenExtraParamUtil.INSTANCE.generateParamString(null, abtestId, String.valueOf(intValue))).post();
    }

    private final void cacheIsStartTrialTagIfNeeded(boolean isTrial) {
        boolean areEqual = Intrinsics.areEqual(pageFrom(), "start");
        boolean z = ((Number) PersistData.INSTANCE.get(CorePersistKey.CONVERT_PAGE_OPENING_TIMES, 0)).intValue() == 1;
        if (areEqual && isTrial && z) {
            PersistData.INSTANCE.set(PersistKey.KEY_IS_START_TRIAL, "true");
        }
    }

    public static /* synthetic */ void billingInit$default(BillingGuideUtils billingGuideUtils, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        billingGuideUtils.billingInit(z);
    }

    public final void billingInit(boolean isInapp) {
        isInappRecord = isInapp;
        PersistData.INSTANCE.set(PersistKey.KEY_VIP_OPEN_COUNT, Integer.valueOf(((Number) PersistData.INSTANCE.get(PersistKey.KEY_VIP_OPEN_COUNT, 0)).intValue() + 1));
        Activity currentActivity = getCurrentActivity();
        if (currentActivity instanceof AppCompatActivity) {
            billingPreInit((AppCompatActivity) currentActivity);
        }
    }

    public final void billingPreInit(AppCompatActivity context) {
        String str;
        List<String> subsSkus;
        Intrinsics.checkNotNullParameter(context, "context");
        notifyOpened = null;
        setPurchasePageType();
        MyBillingAgent myBillingAgent = billingAgent;
        if (myBillingAgent != null) {
            myBillingAgent.destroy();
        }
        billingAgent = null;
        boolean z = isInappRecord;
        if (z) {
            str = "inapp";
        } else {
            str = "subs";
        }
        String str2 = str;
        if (z) {
            subsSkus = SkuManager.INSTANCE.getConsumeSkus();
        } else {
            subsSkus = SkuManager.INSTANCE.getSubsSkus();
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Lifecycle lifecycle = context.getLifecycleRegistry();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        billingAgent = new MyBillingAgent(applicationContext, str2, subsSkus, lifecycle, this);
    }

    public final void billingDestroy() {
        MyBillingAgent myBillingAgent = billingAgent;
        if (myBillingAgent != null) {
            myBillingAgent.destroy();
        }
    }

    public final void startDirectPurchase(String r3, String pageFrom, int pageType, String abtestGroup, String abtestId2, int replaceSkusProrationMode, boolean showDetain2, Boolean notifyOpened2) {
        Intrinsics.checkNotNullParameter(abtestGroup, "abtestGroup");
        Intrinsics.checkNotNullParameter(abtestId2, "abtestId");
        String str = r3;
        if (str == null || str.length() == 0) {
            return;
        }
        PersistData.INSTANCE.set("billing_pageType", Integer.valueOf(pageType));
        PersistData.INSTANCE.set("billing_pageFrom", pageFrom);
        PersistData.INSTANCE.set("billing_group", abtestGroup);
        abtestId = abtestId2;
        startPurchase(r3, replaceSkusProrationMode, showDetain2, notifyOpened2);
    }

    public static /* synthetic */ void startPurchase$default(BillingGuideUtils billingGuideUtils, String str, int i, boolean z, Boolean bool, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            bool = null;
        }
        billingGuideUtils.startPurchase(str, i, z, bool);
    }

    public final void startPurchase(String r7, int replaceSkusProrationMode, boolean showDetain2, Boolean notifyOpened2) {
        String str;
        User value;
        Activity currentActivity;
        String str2 = r7;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        setPurchasePageType();
        notifyOpened = notifyOpened2;
        currentSku = r7;
        showDetain = showDetain2;
        logBuyEvent();
        showProgress();
        VipInfo value2 = AppViewModel.INSTANCE.getInstance().getVipInfo().getValue();
        Object obj = null;
        if (value2 != null) {
            str = value2.getIsVip() ? value2.getSku() : null;
        } else {
            str = null;
        }
        List<ProductDetails> value3 = getVm().getSkuDetailsList().getValue();
        if (value3 != null) {
            Iterator<T> it = value3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((ProductDetails) next).getProductId(), r7)) {
                    obj = next;
                    break;
                }
            }
            ProductDetails productDetails = (ProductDetails) obj;
            if (productDetails == null || (value = AppViewModel.INSTANCE.getInstance().getUser().getValue()) == null) {
                return;
            }
            long userId = value.getUserId();
            MyBillingAgent myBillingAgent = billingAgent;
            if (myBillingAgent == null || (currentActivity = getCurrentActivity()) == null) {
                return;
            }
            myBillingAgent.purchase(currentActivity, productDetails, str, replaceSkusProrationMode, String.valueOf(userId));
        }
    }

    private final void setPurchasePageType() {
        PurchasePageType purchasePageType;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            purchasePageType = PurchasePageType.CONVERSION;
        } else if (isCloseRetainActivity(currentActivity)) {
            purchasePageType = PurchasePageType.RETAIN;
        } else if (isPurchaseDetainActivity(currentActivity)) {
            purchasePageType = PurchasePageType.DETAIN;
        } else {
            purchasePageType = PurchasePageType.CONVERSION;
        }
        currentPurchasePageType = purchasePageType;
    }

    public final String getPriceBySku(String r9) {
        ProductDetails productDetails;
        List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails;
        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails2;
        ProductDetails.PricingPhases pricingPhases;
        List<ProductDetails.PricingPhase> pricingPhaseList;
        Object obj;
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        Object obj2;
        List<ProductDetails> value = getVm().getSkuDetailsList().getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (Intrinsics.areEqual(((ProductDetails) obj2).getProductId(), r9)) {
                    break;
                }
            }
            productDetails = (ProductDetails) obj2;
        } else {
            productDetails = null;
        }
        if (Intrinsics.areEqual(myGetProductType(), "inapp")) {
            if (productDetails == null || (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) == null) {
                return null;
            }
            return GuideUtils.INSTANCE.formatPrice(MathKt.roundToLong(((float) oneTimePurchaseOfferDetails.getPriceAmountMicros()) / 10000.0f) * 10000);
        }
        if (productDetails != null && (subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails()) != null && (subscriptionOfferDetails2 = (ProductDetails.SubscriptionOfferDetails) CollectionsKt.firstOrNull((List) subscriptionOfferDetails)) != null && (pricingPhases = subscriptionOfferDetails2.getPricingPhases()) != null && (pricingPhaseList = pricingPhases.getPricingPhaseList()) != null) {
            Iterator<T> it2 = pricingPhaseList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                ProductDetails.PricingPhase pricingPhase = (ProductDetails.PricingPhase) obj;
                if (pricingPhase.getRecurrenceMode() == 1 && pricingPhase.getPriceAmountMicros() > 0) {
                    break;
                }
            }
            ProductDetails.PricingPhase pricingPhase2 = (ProductDetails.PricingPhase) obj;
            if (pricingPhase2 != null) {
                return GuideUtils.INSTANCE.formatPrice(MathKt.roundToLong(((float) pricingPhase2.getPriceAmountMicros()) / 10000.0f) * 10000);
            }
        }
        return null;
    }

    public final String getIntroductoryPriceBySku(String r10) {
        ProductDetails productDetails;
        List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails;
        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails2;
        ProductDetails.PricingPhases pricingPhases;
        List<ProductDetails.PricingPhase> pricingPhaseList;
        Object obj;
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        Object obj2;
        List<ProductDetails> value = getVm().getSkuDetailsList().getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (Intrinsics.areEqual(((ProductDetails) obj2).getProductId(), r10)) {
                    break;
                }
            }
            productDetails = (ProductDetails) obj2;
        } else {
            productDetails = null;
        }
        if (Intrinsics.areEqual(myGetProductType(), "inapp")) {
            if (productDetails == null || (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) == null) {
                return null;
            }
            return GuideUtils.INSTANCE.formatPrice(MathKt.roundToLong(((float) oneTimePurchaseOfferDetails.getPriceAmountMicros()) / 10000.0f) * 10000);
        }
        if (productDetails != null && (subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails()) != null && (subscriptionOfferDetails2 = (ProductDetails.SubscriptionOfferDetails) CollectionsKt.firstOrNull((List) subscriptionOfferDetails)) != null && (pricingPhases = subscriptionOfferDetails2.getPricingPhases()) != null && (pricingPhaseList = pricingPhases.getPricingPhaseList()) != null) {
            Iterator<T> it2 = pricingPhaseList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                ProductDetails.PricingPhase pricingPhase = (ProductDetails.PricingPhase) obj;
                if (pricingPhase.getPriceAmountMicros() > 0 && pricingPhase.getRecurrenceMode() == 2 && pricingPhase.getBillingCycleCount() > 0) {
                    break;
                }
            }
            ProductDetails.PricingPhase pricingPhase2 = (ProductDetails.PricingPhase) obj;
            if (pricingPhase2 != null) {
                return GuideUtils.INSTANCE.formatPrice(MathKt.roundToLong(((float) pricingPhase2.getPriceAmountMicros()) / 10000.0f) * 10000);
            }
        }
        return null;
    }

    public final String getCurrencyCodeBySku(String r7) {
        ProductDetails productDetails;
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        ProductDetails.PricingPhase pricingPhase;
        List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails;
        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails2;
        ProductDetails.PricingPhases pricingPhases;
        List<ProductDetails.PricingPhase> pricingPhaseList;
        Object obj;
        MutableLiveData<List<ProductDetails>> skuDetailsList;
        List<ProductDetails> value;
        Object obj2;
        BillingViewModel vm2 = getVm();
        if (vm2 == null || (skuDetailsList = vm2.getSkuDetailsList()) == null || (value = skuDetailsList.getValue()) == null) {
            productDetails = null;
        } else {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (Intrinsics.areEqual(((ProductDetails) obj2).getProductId(), r7)) {
                    break;
                }
            }
            productDetails = (ProductDetails) obj2;
        }
        if (!Intrinsics.areEqual("subs", myGetProductType())) {
            if (productDetails == null || (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) == null) {
                return null;
            }
            return oneTimePurchaseOfferDetails.getPriceCurrencyCode();
        }
        if (productDetails == null || (subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails()) == null || (subscriptionOfferDetails2 = (ProductDetails.SubscriptionOfferDetails) CollectionsKt.firstOrNull((List) subscriptionOfferDetails)) == null || (pricingPhases = subscriptionOfferDetails2.getPricingPhases()) == null || (pricingPhaseList = pricingPhases.getPricingPhaseList()) == null) {
            pricingPhase = null;
        } else {
            Iterator<T> it2 = pricingPhaseList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((ProductDetails.PricingPhase) obj).getPriceAmountMicros() > 0) {
                    break;
                }
            }
            pricingPhase = (ProductDetails.PricingPhase) obj;
        }
        if (pricingPhase != null) {
            return pricingPhase.getPriceCurrencyCode();
        }
        return null;
    }

    private final void showProgress() {
        try {
            Activity currentActivity = INSTANCE.getCurrentActivity();
            AppCompatActivity appCompatActivity = currentActivity instanceof AppCompatActivity ? (AppCompatActivity) currentActivity : null;
            if (appCompatActivity == null) {
                return;
            }
            DialogFragment dialogFragment = progressDialog;
            if (dialogFragment != null) {
                dialogFragment.dismiss();
            }
            DialogFragment result = new PurchaseDialogRequest(ActualSkuManager.INSTANCE.getTotalSkuList().get(currentSku)).toResult();
            if (result != null) {
                progressDialog = result;
            } else {
                progressDialog = new DefaultPurchaseLoadingDialog();
            }
            DialogFragment dialogFragment2 = progressDialog;
            if (dialogFragment2 != null) {
                dialogFragment2.show(appCompatActivity.getSupportFragmentManager(), "purchase_loading_dialog");
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    public final void hideProgress() {
        try {
            DialogFragment dialogFragment = progressDialog;
            if (dialogFragment != null) {
                Intrinsics.checkNotNull(dialogFragment);
                dialogFragment.dismiss();
                progressDialog = null;
            }
        } catch (Exception unused) {
            LogUtils.d("hideProgress err");
        }
    }

    private final String getCountryCode() {
        String country = Locale.getDefault().getCountry();
        Intrinsics.checkNotNull(country);
        if (country.length() == 0) {
            country = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        Intrinsics.checkNotNull(country);
        return country;
    }

    public final Bundle getPurchaseLogEventBundle() {
        Pair[] pairArr = new Pair[7];
        pairArr[0] = TuplesKt.to("from", pageFrom());
        pairArr[1] = TuplesKt.to("name", String.valueOf(pageType()));
        String str = currentSku;
        if (str == null) {
            str = "";
        }
        pairArr[2] = TuplesKt.to(LogEventArguments.ARG_SKU, str);
        pairArr[3] = TuplesKt.to("group", group());
        pairArr[4] = TuplesKt.to(LogEventArguments.ARG_STRING_1, abtestId);
        pairArr[5] = TuplesKt.to("code", getCountryCode());
        pairArr[6] = TuplesKt.to(LogEventArguments.ARG_STEP, String.valueOf(((Number) PersistData.INSTANCE.get(PersistKey.KEY_VIP_OPEN_COUNT, 0)).intValue()));
        return LogEventArgumentsKt.logEventBundleOf(pairArr);
    }

    private final Bundle getDetainBundle() {
        String purchaseDetainId = DetainUtil.INSTANCE.getPurchaseDetainId();
        Pair[] pairArr = new Pair[8];
        pairArr[0] = TuplesKt.to("from", pageFrom());
        pairArr[1] = TuplesKt.to("name", String.valueOf(pageType()));
        String str = currentSku;
        if (str == null) {
            str = "";
        }
        pairArr[2] = TuplesKt.to(LogEventArguments.ARG_SKU, str);
        pairArr[3] = TuplesKt.to("group", group());
        pairArr[4] = TuplesKt.to(LogEventArguments.ARG_STRING_1, abtestId);
        pairArr[5] = TuplesKt.to("code", getCountryCode());
        pairArr[6] = TuplesKt.to(LogEventArguments.ARG_STEP, String.valueOf(((Number) PersistData.INSTANCE.get(PersistKey.KEY_VIP_OPEN_COUNT, 0)).intValue()));
        pairArr[7] = TuplesKt.to("id", purchaseDetainId);
        return LogEventArgumentsKt.logEventBundleOf(pairArr);
    }

    private final Bundle getRetainBundle() {
        String convertRetainId = DetainUtil.INSTANCE.getConvertRetainId();
        Pair[] pairArr = new Pair[8];
        pairArr[0] = TuplesKt.to("from", pageFrom());
        pairArr[1] = TuplesKt.to("name", String.valueOf(pageType()));
        String str = currentSku;
        if (str == null) {
            str = "";
        }
        pairArr[2] = TuplesKt.to(LogEventArguments.ARG_SKU, str);
        pairArr[3] = TuplesKt.to("group", group());
        pairArr[4] = TuplesKt.to(LogEventArguments.ARG_STRING_1, abtestId);
        pairArr[5] = TuplesKt.to("code", getCountryCode());
        pairArr[6] = TuplesKt.to(LogEventArguments.ARG_STEP, String.valueOf(((Number) PersistData.INSTANCE.get(PersistKey.KEY_VIP_OPEN_COUNT, 0)).intValue()));
        pairArr[7] = TuplesKt.to("id", convertRetainId);
        return LogEventArgumentsKt.logEventBundleOf(pairArr);
    }

    public static /* synthetic */ void restore$default(BillingGuideUtils billingGuideUtils, RestorePolicy restorePolicy, int i, Object obj) {
        if ((i & 1) != 0) {
            restorePolicy = RestorePolicy.Default;
        }
        billingGuideUtils.restore(restorePolicy);
    }

    public final void restore(RestorePolicy restorePolicy) {
        Intrinsics.checkNotNullParameter(restorePolicy, "restorePolicy");
        logRestoreEvent();
        getVm().setRestore(true);
        MyBillingAgent myBillingAgent = billingAgent;
        if (myBillingAgent != null) {
            myBillingAgent.restore(restorePolicy);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.os.Bundle, T] */
    @Override // com.glority.billing.agent.MyBillingAgent.MyBillingAgentListener
    public void myBillingSetupFinished(boolean success, BillingResult billingResult, List<ProductDetails> skuDetailsList) {
        MyBillingAgent.MyBillingAgentListener.DefaultImpls.myBillingSetupFinished(this, success, billingResult, skuDetailsList);
        hideProgress();
        setupFinished.postValue(Boolean.valueOf(success));
        if (success) {
            logBillingEvent$default(this, PaymentLogEvents.VIP_Query_Success, null, 2, null);
            List<ProductDetails> list = skuDetailsList;
            if (list == null || list.isEmpty()) {
                LogUtils.e(TAG, "onSkuDetailsResponse empty SkuDetails.");
                return;
            }
            getVm().getSkuDetailsList().setValue(skuDetailsList);
            ComponentCallbacks2 currentActivity = getCurrentActivity();
            IBillingListener iBillingListener = currentActivity instanceof IBillingListener ? (IBillingListener) currentActivity : null;
            if (iBillingListener != null) {
                iBillingListener.changePrice();
                return;
            }
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (billingResult != null) {
            ?? bundle = new Bundle();
            bundle.putString("error", String.valueOf(billingResult.getResponseCode()));
            bundle.putString(LogEventArguments.ARG_MESSAGE, billingResult.getDebugMessage());
            objectRef.element = bundle;
        }
        logBillingEvent(PaymentLogEvents.VIP_Query_Failure, (Bundle) objectRef.element);
        LogUtils.e(TAG, "Unsuccessful query for type: subs");
        ToastUtils.showLong(R.string.text_no_connection);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    @Override // com.glority.billing.agent.MyBillingAgent.MyBillingAgentListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void myPurchaseSuccess(com.android.billingclient.api.Purchase r8, boolean r9, com.glority.network.model.Status r10, java.lang.String r11) {
        /*
            r7 = this;
            java.lang.String r0 = "response"
            java.lang.String r1 = "status"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            com.glority.android.picturexx.payment.billingUI.BillingGuideUtils.purchaseSuccessByRestore = r1
            com.glority.billing.agent.MyBillingAgent.MyBillingAgentListener.DefaultImpls.myPurchaseSuccess(r7, r8, r9, r10, r11)
            r7.hideProgress()
            com.glority.network.model.Status r9 = com.glority.network.model.Status.SUCCESS
            r1 = 0
            if (r10 != r9) goto Lc6
            r9 = 1
            if (r8 == 0) goto L29
            java.lang.String r8 = r8.getOriginalJson()     // Catch: java.lang.Exception -> L27
            if (r8 == 0) goto L29
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Exception -> L27
            r10.<init>(r8)     // Catch: java.lang.Exception -> L27
            goto L2a
        L27:
            r8 = move-exception
            goto L45
        L29:
            r10 = 0
        L2a:
            if (r10 == 0) goto L5a
            java.lang.String r8 = "productId"
            java.lang.String r8 = r10.optString(r8)     // Catch: java.lang.Exception -> L27
            if (r8 == 0) goto L5a
            com.glority.android.picturexx.payment.skumanager.SkuManager r10 = com.glority.android.picturexx.payment.skumanager.SkuManager.INSTANCE     // Catch: java.lang.Exception -> L27
            boolean r10 = r10.isConsumeSku(r8)     // Catch: java.lang.Exception -> L27
            if (r10 != r9) goto L5a
            com.glority.base.routers.business.ConsumeBuySuccessRequest r10 = new com.glority.base.routers.business.ConsumeBuySuccessRequest     // Catch: java.lang.Exception -> L27
            r10.<init>(r8)     // Catch: java.lang.Exception -> L27
            r10.post()     // Catch: java.lang.Exception -> L27
            goto L5a
        L45:
            com.glority.android.core.app.AppContext r10 = com.glority.android.core.app.AppContext.INSTANCE
            boolean r10 = r10.isDebugMode()
            if (r10 == 0) goto L5a
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.String r8 = android.util.Log.getStackTraceString(r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            com.glority.utils.stability.LogUtils.e(r8)
        L5a:
            if (r11 != 0) goto L60
            r7.onSuccess(r1)
            goto Ld2
        L60:
            byte[] r8 = com.google.android.gms.common.util.Base64Utils.decode(r11)
            java.lang.String r10 = "decode(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r10)
            java.lang.String r10 = new java.lang.String
            java.nio.charset.Charset r11 = kotlin.text.Charsets.UTF_8
            r10.<init>(r8, r11)
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lc2
            r8.<init>(r10)     // Catch: java.lang.Throwable -> Lc2
            boolean r10 = r8.has(r0)     // Catch: java.lang.Throwable -> Lc2
            if (r10 == 0) goto Ld2
            org.json.JSONObject r8 = r8.optJSONObject(r0)     // Catch: java.lang.Throwable -> Lc2
            if (r8 != 0) goto L82
            return
        L82:
            com.glority.component.generatedAPI.kotlinAPI.vip.VerifyResult r10 = new com.glority.component.generatedAPI.kotlinAPI.vip.VerifyResult     // Catch: java.lang.Throwable -> Lc2
            r10.<init>(r8)     // Catch: java.lang.Throwable -> Lc2
            com.glority.base.viewmodel.AppViewModel$Companion r8 = com.glority.base.viewmodel.AppViewModel.INSTANCE     // Catch: java.lang.Throwable -> Lc2
            com.glority.base.viewmodel.AppViewModel r8 = r8.getInstance()     // Catch: java.lang.Throwable -> Lc2
            com.glority.component.generatedAPI.kotlinAPI.vip.VipInfo r11 = r10.getVipInfo()     // Catch: java.lang.Throwable -> Lc2
            r8.updateUserVipInfo(r11)     // Catch: java.lang.Throwable -> Lc2
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r11 = com.glority.android.picturexx.payment.billingUI.BillingGuideUtils.TAG     // Catch: java.lang.Throwable -> Lc2
            r8[r1] = r11     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r11 = "verifyPurchase success."
            r8[r9] = r11     // Catch: java.lang.Throwable -> Lc2
            com.glority.utils.stability.LogUtils.d(r8)     // Catch: java.lang.Throwable -> Lc2
            r7.onSuccess(r1)     // Catch: java.lang.Throwable -> Lc2
            com.glority.component.generatedAPI.kotlinAPI.vip.VipInfo r8 = r10.getVipInfo()     // Catch: java.lang.Throwable -> Lc2
            boolean r8 = r8.getIsTrial()     // Catch: java.lang.Throwable -> Lc2
            r7.cacheIsStartTrialTagIfNeeded(r8)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r8 = com.glority.android.picturexx.payment.billingUI.BillingGuideUtils.currentSku     // Catch: java.lang.Throwable -> Lc2
            if (r8 != 0) goto Lb5
            return
        Lb5:
            java.lang.String r9 = r7.pageFrom()     // Catch: java.lang.Throwable -> Lc2
            com.glority.base.routers.business.PurchaseSuccessRequest r10 = new com.glority.base.routers.business.PurchaseSuccessRequest     // Catch: java.lang.Throwable -> Lc2
            r10.<init>(r8, r9, r1)     // Catch: java.lang.Throwable -> Lc2
            r10.toResult()     // Catch: java.lang.Throwable -> Lc2
            goto Ld2
        Lc2:
            r7.onSuccess(r1)
            goto Ld2
        Lc6:
            com.glority.base.viewmodel.AppViewModel$Companion r8 = com.glority.base.viewmodel.AppViewModel.INSTANCE
            com.glority.base.viewmodel.AppViewModel r8 = r8.getInstance()
            r8.updateUserPendingVipInfo()
            r7.onSuccess(r1)
        Ld2:
            com.glority.base.viewmodel.AppViewModel$Companion r8 = com.glority.base.viewmodel.AppViewModel.INSTANCE
            boolean r8 = r8.isVip()
            if (r8 == 0) goto Leb
            com.glority.android.core.route.adjust.SendTrackEventRequest r8 = new com.glority.android.core.route.adjust.SendTrackEventRequest
            r5 = 14
            r6 = 0
            java.lang.String r1 = "AJ_vip"
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.post()
        Leb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.payment.billingUI.BillingGuideUtils.myPurchaseSuccess(com.android.billingclient.api.Purchase, boolean, com.glority.network.model.Status, java.lang.String):void");
    }

    @Override // com.glority.billing.agent.MyBillingAgent.MyBillingAgentListener
    public void myPurchaseError(int errorCode, String r3, boolean restore) {
        MyBillingAgent.MyBillingAgentListener.DefaultImpls.myPurchaseError(this, errorCode, r3, restore);
        LogUtils.e(r3);
        hideProgress();
        if (errorCode != 1) {
            if (restore) {
                logRestoreFailEvent();
                if (currentPurchasePageType == PurchasePageType.DETAIN) {
                    new LogEventRequest("detain_restore_fail_v3", getDetainBundle()).post();
                }
                if (currentPurchasePageType == PurchasePageType.RETAIN) {
                    new LogEventRequest("retain_restore_fail_v3", getRetainBundle()).post();
                }
                ToastUtils.showShort(R.string.text_retore_empty);
                hideProgress();
                return;
            }
            logBuyFailEvent();
            if (currentPurchasePageType == PurchasePageType.DETAIN) {
                new LogEventRequest("detain_buy_fail_v3", getDetainBundle()).post();
            }
            if (currentPurchasePageType == PurchasePageType.RETAIN) {
                new LogEventRequest("retain_buy_fail_v3", getRetainBundle()).post();
            }
            ToastUtils.showShort(R.string.text_failed);
            hideProgress();
            return;
        }
        LogUtils.d("User has cancelled payment");
        logCancelEvent();
        if (currentSku != null) {
            SkuManager skuManager = SkuManager.INSTANCE;
            String str = currentSku;
            Intrinsics.checkNotNull(str);
            if (skuManager.isTrialYearPacket(str) && currentPurchasePageType == PurchasePageType.CONVERSION && DetainUtil.INSTANCE.canShowPurchaseDetain() && showDetain) {
                getVm().getBillingCancelled().setValue(true);
                String str2 = currentSku;
                if (str2 != null) {
                    DetainUtil detainUtil = DetainUtil.INSTANCE;
                    BillingGuideUtils billingGuideUtils = INSTANCE;
                    detainUtil.toPurchaseDetainPage(str2, billingGuideUtils.pageFrom(), String.valueOf(billingGuideUtils.pageType()));
                    DetainUtil.INSTANCE.recordPurchaseRetainShow();
                }
            }
        }
    }

    @Override // com.glority.billing.agent.MyBillingAgent.MyBillingAgentListener
    public void myRestoreOrderSuccess(Purchase r5, boolean restore, Status status, String appData, RestorePolicy restorePolicy) {
        Object obj;
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(restorePolicy, "restorePolicy");
        MyBillingAgent.MyBillingAgentListener.DefaultImpls.myRestoreOrderSuccess(this, r5, restore, status, appData, restorePolicy);
        hideProgress();
        if (status != Status.SUCCESS || appData == null) {
            return;
        }
        byte[] decode = Base64Utils.decode(appData);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        String str = new String(decode, Charsets.UTF_8);
        LogUtils.d("appData decoded: ".concat(str));
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt(LogEvents.result);
            if (i == ErrorCodes.SUCCESS.getValue()) {
                if (jSONObject.has("response")) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("response");
                    if (optJSONObject == null) {
                        Unit unit = Unit.INSTANCE;
                        return;
                    }
                    RestoreResult restoreResult = new RestoreResult(optJSONObject);
                    User value = AppViewModel.INSTANCE.getInstance().getUser().getValue();
                    if (value == null || value.getUserId() != restoreResult.getVipInfo().getUserId()) {
                        INSTANCE.onRestore(restoreResult);
                    } else {
                        AppViewModel.INSTANCE.getInstance().updateUserVipInfo(restoreResult.getVipInfo());
                        INSTANCE.onSuccess(true);
                    }
                } else {
                    LogUtils.e("appData eer");
                }
                obj = Unit.INSTANCE;
            } else if (i == ErrorCodes.TRANSACTION_BELONG_TO_OTHER_USER.getValue()) {
                obj = new AlertDialog.Builder(AppContext.INSTANCE.peekContext()).setMessage(R.string.restore_text_membership_desc).setNegativeButton(R.string.text_cancel, new DialogInterface.OnClickListener() { // from class: com.glority.android.picturexx.payment.billingUI.BillingGuideUtils$$ExternalSyntheticLambda1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        BillingGuideUtils.myRestoreOrderSuccess$lambda$18$lambda$17$lambda$15(dialogInterface, i2);
                    }
                }).setPositiveButton(R.string.text_confirm, new DialogInterface.OnClickListener() { // from class: com.glority.android.picturexx.payment.billingUI.BillingGuideUtils$$ExternalSyntheticLambda2
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        BillingGuideUtils.myRestoreOrderSuccess$lambda$18$lambda$17$lambda$16(dialogInterface, i2);
                    }
                }).show();
            } else {
                ToastUtils.showShort(R.string.text_failed);
                LogUtils.e("appData eer");
                obj = Unit.INSTANCE;
            }
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    public static final void myRestoreOrderSuccess$lambda$18$lambda$17$lambda$16(DialogInterface dialogInterface, int i) {
        INSTANCE.restore(RestorePolicy.USE_OLD_USER);
    }

    private final void onRestore(RestoreResult restoreResult) {
        LiveData<Status> loginWithRestore = getVm().loginWithRestore(restoreResult);
        ComponentCallbacks2 currentActivity = getCurrentActivity();
        if (currentActivity instanceof AppCompatActivity) {
            loginWithRestore.observe((LifecycleOwner) currentActivity, new Observer() { // from class: com.glority.android.picturexx.payment.billingUI.BillingGuideUtils$$ExternalSyntheticLambda0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    BillingGuideUtils.onRestore$lambda$19((Status) obj);
                }
            });
        }
    }

    public static final void onRestore$lambda$19(Status status) {
        DialogFragment dialogFragment = progressDialog;
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
        if (status == Status.SUCCESS) {
            INSTANCE.onSuccess(true);
        } else {
            ToastUtils.showShort(R.string.text_failed);
        }
    }

    private final void onSuccess(boolean restore) {
        if (restore) {
            logRestoreSuccessEvent();
        } else {
            logBuySuccessEvent();
            if (currentPurchasePageType == PurchasePageType.DETAIN) {
                new LogEventRequest("detain_buy_success_v3", getDetainBundle()).post();
            }
            if (currentPurchasePageType == PurchasePageType.RETAIN) {
                new LogEventRequest("retain_buy_success_v3", getRetainBundle()).post();
            }
            purchaseSuccess.postValue(true);
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            if (isCloseRetainActivity(currentActivity) || isPurchaseDetainActivity(currentActivity) || isConversionActivity(currentActivity)) {
                Activity currentActivity2 = getCurrentActivity();
                if (currentActivity2 != null) {
                    currentActivity2.setResult(-1);
                }
                Activity currentActivity3 = getCurrentActivity();
                if (currentActivity3 != null) {
                    currentActivity3.finish();
                }
            }
        }
    }

    static /* synthetic */ void logBillingEvent$default(BillingGuideUtils billingGuideUtils, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        billingGuideUtils.logBillingEvent(str, bundle);
    }

    private final void logBillingEvent(String r4, Bundle args) {
        Bundle bundleOf = BundleKt.bundleOf(TuplesKt.to("from", pageFrom()), TuplesKt.to("source", getVm().getCurrentPageName()));
        if (args != null) {
            bundleOf.putAll(args);
        }
        new VipEventRequest(r4, bundleOf).post();
    }

    @Override // com.glority.billing.agent.MyBillingAgent.MyBillingAgentListener
    public String myGetProductType() {
        if (isInappRecord) {
            return "inapp";
        }
        return "subs";
    }

    private final boolean isPurchaseDetainActivity(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        if (!StringsKt.contains$default((CharSequence) simpleName, (CharSequence) "Detain", false, 2, (Object) null)) {
            return false;
        }
        String simpleName2 = activity.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
        return StringsKt.contains$default((CharSequence) simpleName2, (CharSequence) "Activity", false, 2, (Object) null);
    }

    private final boolean isCloseRetainActivity(Activity activity) {
        String name;
        Package r5 = activity.getClass().getPackage();
        if (r5 == null || (name = r5.getName()) == null) {
            return false;
        }
        return StringsKt.startsWith$default(name, BuildConfig.APPLICATION_ID, false, 2, (Object) null);
    }

    private final boolean isConversionActivity(Activity activity) {
        return activity instanceof IBillingListener;
    }

    private final void setVipPageOpenCount() {
        List split$default = StringsKt.split$default((CharSequence) PersistData.INSTANCE.get(PersistKey.KEY_VIP_PAGE_OPEN_DAY_AND_COUNT, ":"), new String[]{":"}, false, 0, 6, (Object) null);
        if (split$default.size() == 2) {
            Long longOrNull = StringsKt.toLongOrNull((String) split$default.get(0));
            long longValue = longOrNull != null ? longOrNull.longValue() : System.currentTimeMillis();
            int i = 1;
            if (DateUtils.isToday(longValue)) {
                Integer intOrNull = StringsKt.toIntOrNull((String) split$default.get(1));
                i = 1 + (intOrNull != null ? intOrNull.intValue() : 0);
            } else {
                longValue = System.currentTimeMillis();
            }
            PersistData.INSTANCE.set(PersistKey.KEY_VIP_PAGE_OPEN_DAY_AND_COUNT, longValue + ":" + i);
            return;
        }
        PersistData.INSTANCE.set(PersistKey.KEY_VIP_PAGE_OPEN_DAY_AND_COUNT, System.currentTimeMillis() + ":1");
    }

    public final void logOpenEvent() {
        new VipEventRequest("vip_open", getPurchaseLogEventBundle()).post();
    }

    public final void logCloseEvent() {
        boolean z;
        boolean z2;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            BillingGuideUtils billingGuideUtils = INSTANCE;
            z = billingGuideUtils.isPurchaseDetainActivity(currentActivity);
            z2 = billingGuideUtils.isCloseRetainActivity(currentActivity);
        } else {
            z = false;
            z2 = false;
        }
        if (z || z2) {
            return;
        }
        new VipEventRequest("vip_close", getPurchaseLogEventBundle()).post();
    }

    public final void logBuyEvent() {
        new VipEventRequest("vip_buy", getPurchaseLogEventBundle()).post();
    }

    public final void logBuySuccessEvent() {
        new VipEventRequest("vip_buy_success", getPurchaseLogEventBundle()).post();
    }

    public final void logBuyFailEvent() {
        new VipEventRequest(PaymentLogEvents.NEW_VIP_BUY_FAIL, getPurchaseLogEventBundle()).post();
    }

    public final void logRestoreEvent() {
        new VipEventRequest("vip_restore", getPurchaseLogEventBundle()).post();
    }

    public final void logRestoreSuccessEvent() {
        new VipEventRequest("vip_restore_success", getPurchaseLogEventBundle()).post();
    }

    public final void logRestoreFailEvent() {
        new VipEventRequest(PaymentLogEvents.NEW_VIP_RESTORE_FAIL, getPurchaseLogEventBundle()).post();
    }

    public final void logCancelEvent() {
        new VipEventRequest(PaymentLogEvents.NEW_VIP_CANCEL_BILLING, getPurchaseLogEventBundle()).post();
    }

    private final Activity getCurrentActivity() {
        try {
            Context peekContext = AppContext.INSTANCE.peekContext();
            if (peekContext instanceof Activity) {
                return (Activity) peekContext;
            }
            return null;
        } catch (Exception e) {
            if (!AppContext.INSTANCE.isDebugMode()) {
                return null;
            }
            LogUtils.e(Log.getStackTraceString(e));
            return null;
        }
    }
}
