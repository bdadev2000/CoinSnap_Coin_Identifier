package com.glority.android.picturexx.payment.handler;

import android.content.Context;
import android.util.Log;
import androidx.core.app.NotificationManagerCompat;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.guide.GuideCloseExtraRequest;
import com.glority.android.core.route.guide.UrlGuide;
import com.glority.android.picturexx.payment.billingUI.BillingGuideUtils;
import com.glority.android.picturexx.payment.skumanager.SkuManager;
import com.glority.android.picturexx.payment.utils.TrialReminderUtil;
import com.glority.base.routers.OpenHowToReminderActivityRequest;
import com.glority.base.routers.OpenNoNotificationActivityRequest;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.vip.VipInfo;
import com.glority.utils.stability.LogUtils;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GuideCloseExtraHandler.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/glority/android/picturexx/payment/handler/GuideCloseExtraHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "<init>", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "post", "", "request", "Lcom/glority/android/core/route/RouteRequest;", "setNotifyAccess", "purchase_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class GuideCloseExtraHandler implements RouteHandler<Boolean> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.glority.android.core.route.RouteHandler
    public Boolean execute(RouteRequest<Boolean> routeRequest) {
        return (Boolean) RouteHandler.DefaultImpls.execute(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlGuide.INSTANCE.getURL_EXTRA_CLOSE();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Boolean> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if ((request instanceof GuideCloseExtraRequest) && Intrinsics.areEqual((Object) BillingGuideUtils.INSTANCE.isNotifyOpened(), (Object) true)) {
            setNotifyAccess();
        }
    }

    private final void setNotifyAccess() {
        String str;
        try {
            boolean areEqual = Intrinsics.areEqual((Object) BillingGuideUtils.INSTANCE.isPurchaseSuccessByRestore(), (Object) true);
            boolean isVip = AppViewModel.INSTANCE.isVip();
            Context peekContext = AppContext.INSTANCE.peekContext();
            if (!areEqual && isVip) {
                SkuManager skuManager = SkuManager.INSTANCE;
                VipInfo value = AppViewModel.INSTANCE.getInstance().getVipInfo().getValue();
                if (value == null || (str = value.getSku()) == null) {
                    str = "";
                }
                Integer trialDays = skuManager.getTrialDays(str);
                int intValue = (trialDays != null ? trialDays.intValue() : 0) - 2;
                if (intValue > 0) {
                    TrialReminderUtil.INSTANCE.remindUserToAttentionTrialIfNeeded(intValue);
                    if (NotificationManagerCompat.from(peekContext).areNotificationsEnabled()) {
                        new OpenHowToReminderActivityRequest(BillingGuideUtils.INSTANCE.getPurchaseLogEventBundle()).post();
                    } else {
                        new OpenNoNotificationActivityRequest(BillingGuideUtils.INSTANCE.getPurchaseLogEventBundle()).post();
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }
}
