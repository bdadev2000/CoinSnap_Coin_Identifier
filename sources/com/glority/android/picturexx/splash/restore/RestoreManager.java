package com.glority.android.picturexx.splash.restore;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.billing.agent.MyBillingAgent;
import com.glority.billing.purchase.generatedAPI.kotlinAPI.ErrorCodes;
import com.glority.billing.purchase.generatedAPI.kotlinAPI.enums.RestorePolicy;
import com.glority.component.generatedAPI.kotlinAPI.user.User;
import com.glority.component.generatedAPI.kotlinAPI.vip.RestoreResult;
import com.glority.network.model.Status;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Base64;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.json.JSONObject;

/* compiled from: RestoreManager.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\tJ\u0006\u0010\u0014\u001a\u00020\fJ*\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0016J4\u0010\u001c\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u00132\u0006\u0010#\u001a\u00020$H\u0016J\"\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\b\u0010(\u001a\u00020\u000eH\u0016J\u0016\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020+H\u0082@¢\u0006\u0002\u0010,R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/glority/android/picturexx/splash/restore/RestoreManager;", "Lcom/glority/billing/agent/MyBillingAgent$MyBillingAgentListener;", "<init>", "()V", "myBillingAgent", "Lcom/glority/billing/agent/MyBillingAgent;", "activity", "Landroidx/activity/ComponentActivity;", "onFinishListener", "Lkotlin/Function2;", "", "", "", "isSetupFinished", "", "restoreAfterSetupFinish", "init", "productIdList", "", "", "startRestore", "myBillingSetupFinished", "success", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "skuDetailsList", "", "Lcom/android/billingclient/api/ProductDetails;", "myRestoreOrderSuccess", FirebaseAnalytics.Event.PURCHASE, "Lcom/android/billingclient/api/Purchase;", "restore", "status", "Lcom/glority/network/model/Status;", "appData", "restorePolicy", "Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/enums/RestorePolicy;", "myPurchaseError", "errorCode", LogEventArguments.ARG_MESSAGE, "myRestoreEmpty", "loginWithRestore", "restoreResult", "Lcom/glority/component/generatedAPI/kotlinAPI/vip/RestoreResult;", "(Lcom/glority/component/generatedAPI/kotlinAPI/vip/RestoreResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class RestoreManager implements MyBillingAgent.MyBillingAgentListener {
    public static final int $stable = 8;
    private ComponentActivity activity;
    private boolean isSetupFinished;
    private MyBillingAgent myBillingAgent;
    private Function2<? super Throwable, ? super Integer, Unit> onFinishListener;
    private boolean restoreAfterSetupFinish;

    @Override // com.glority.billing.agent.MyBillingAgent.MyBillingAgentListener
    public boolean myRestoreEmpty() {
        return true;
    }

    @Override // com.glority.billing.agent.MyBillingAgent.MyBillingAgentListener
    public void myConsumerResponse(BillingResult billingResult, String str) {
        MyBillingAgent.MyBillingAgentListener.DefaultImpls.myConsumerResponse(this, billingResult, str);
    }

    @Override // com.glority.billing.agent.MyBillingAgent.MyBillingAgentListener
    public String myGetProductType() {
        return MyBillingAgent.MyBillingAgentListener.DefaultImpls.myGetProductType(this);
    }

    @Override // com.glority.billing.agent.MyBillingAgent.MyBillingAgentListener
    public void myPurchaseSuccess(Purchase purchase, boolean z, Status status, String str) {
        MyBillingAgent.MyBillingAgentListener.DefaultImpls.myPurchaseSuccess(this, purchase, z, status, str);
    }

    @Override // com.glority.billing.agent.MyBillingAgent.MyBillingAgentListener
    public void myShowProgress() {
        MyBillingAgent.MyBillingAgentListener.DefaultImpls.myShowProgress(this);
    }

    public final void init(ComponentActivity activity, List<String> productIdList, Function2<? super Throwable, ? super Integer, Unit> onFinishListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(productIdList, "productIdList");
        Intrinsics.checkNotNullParameter(onFinishListener, "onFinishListener");
        this.activity = activity;
        this.onFinishListener = onFinishListener;
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Lifecycle lifecycleRegistry = activity.getLifecycleRegistry();
        Intrinsics.checkNotNullExpressionValue(lifecycleRegistry, "<get-lifecycle>(...)");
        this.myBillingAgent = new MyBillingAgent(applicationContext, "subs", productIdList, lifecycleRegistry, this);
    }

    public final void startRestore() {
        if (this.isSetupFinished) {
            MyBillingAgent myBillingAgent = this.myBillingAgent;
            if (myBillingAgent == null) {
                Intrinsics.throwUninitializedPropertyAccessException("myBillingAgent");
                myBillingAgent = null;
            }
            MyBillingAgent.restore$default(myBillingAgent, null, 1, null);
            return;
        }
        this.restoreAfterSetupFinish = true;
    }

    @Override // com.glority.billing.agent.MyBillingAgent.MyBillingAgentListener
    public void myBillingSetupFinished(boolean success, BillingResult billingResult, List<ProductDetails> skuDetailsList) {
        MyBillingAgent.MyBillingAgentListener.DefaultImpls.myBillingSetupFinished(this, success, billingResult, skuDetailsList);
        if (success) {
            this.isSetupFinished = true;
            if (this.restoreAfterSetupFinish) {
                MyBillingAgent myBillingAgent = this.myBillingAgent;
                if (myBillingAgent == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("myBillingAgent");
                    myBillingAgent = null;
                }
                MyBillingAgent.restore$default(myBillingAgent, null, 1, null);
                return;
            }
            return;
        }
        Function2<? super Throwable, ? super Integer, Unit> function2 = this.onFinishListener;
        if (function2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onFinishListener");
            function2 = null;
        }
        function2.invoke(new Exception("billing setup failed"), null);
    }

    @Override // com.glority.billing.agent.MyBillingAgent.MyBillingAgentListener
    public void myRestoreOrderSuccess(Purchase purchase, boolean restore, Status status, String appData, RestorePolicy restorePolicy) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(restorePolicy, "restorePolicy");
        MyBillingAgent.MyBillingAgentListener.DefaultImpls.myRestoreOrderSuccess(this, purchase, restore, status, appData, restorePolicy);
        if (status != Status.SUCCESS || appData == null) {
            return;
        }
        byte[] decode = Base64.getDecoder().decode(appData);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        try {
            JSONObject jSONObject = new JSONObject(new String(decode, Charsets.UTF_8));
            int i = jSONObject.getInt(LogEvents.result);
            if (i == ErrorCodes.SUCCESS.getValue()) {
                if (jSONObject.has("response")) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("response");
                    Intrinsics.checkNotNull(optJSONObject);
                    RestoreResult restoreResult = new RestoreResult(optJSONObject);
                    User value = AppViewModel.INSTANCE.getInstance().getUser().getValue();
                    Long valueOf = value != null ? Long.valueOf(value.getUserId()) : null;
                    long userId = restoreResult.getVipInfo().getUserId();
                    if (valueOf != null && valueOf.longValue() == userId) {
                        AppViewModel.INSTANCE.getInstance().updateUserVipInfo(restoreResult.getVipInfo());
                        Function2<? super Throwable, ? super Integer, Unit> function2 = this.onFinishListener;
                        if (function2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("onFinishListener");
                            function2 = null;
                        }
                        function2.invoke(null, null);
                        Unit unit = Unit.INSTANCE;
                        return;
                    }
                    ComponentActivity componentActivity = this.activity;
                    if (componentActivity == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("activity");
                        componentActivity = null;
                    }
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(componentActivity), null, null, new RestoreManager$myRestoreOrderSuccess$1(this, restoreResult, null), 3, null);
                    return;
                }
                throw new Exception("response is null");
            }
            if (i == com.glority.abtesting.generatedAPI.kotlinAPI.ErrorCodes.TRANSACTION_BELONG_TO_OTHER_USER.getValue()) {
                MyBillingAgent myBillingAgent = this.myBillingAgent;
                if (myBillingAgent == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("myBillingAgent");
                    myBillingAgent = null;
                }
                myBillingAgent.restore(RestorePolicy.USE_OLD_USER);
                Unit unit2 = Unit.INSTANCE;
                return;
            }
            throw new Exception("result code = " + i);
        } catch (Throwable th) {
            Function2<? super Throwable, ? super Integer, Unit> function22 = this.onFinishListener;
            if (function22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onFinishListener");
                function22 = null;
            }
            function22.invoke(th, null);
            Unit unit3 = Unit.INSTANCE;
        }
    }

    @Override // com.glority.billing.agent.MyBillingAgent.MyBillingAgentListener
    public void myPurchaseError(int errorCode, String message, boolean restore) {
        MyBillingAgent.MyBillingAgentListener.DefaultImpls.myPurchaseError(this, errorCode, message, restore);
        Function2<? super Throwable, ? super Integer, Unit> function2 = this.onFinishListener;
        if (function2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onFinishListener");
            function2 = null;
        }
        function2.invoke(new Exception(message), Integer.valueOf(errorCode));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object loginWithRestore(com.glority.component.generatedAPI.kotlinAPI.vip.RestoreResult r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.splash.restore.RestoreManager.loginWithRestore(com.glority.component.generatedAPI.kotlinAPI.vip.RestoreResult, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
