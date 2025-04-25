package com.glority.android.picturexx.payment.handler;

import android.util.Log;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.guide.IsVipInHistoryRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.picturexx.constants.ShortcutConstants;
import com.glority.android.picturexx.payment.billingUI.BillingGuideUtils;
import com.glority.base.routers.OpenBillingActivityRequest;
import com.glority.base.routers.UrlRouter;
import com.glority.base.storage.PersistKey;
import com.glority.base.utils.AbTestUtil;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BillingActivityHandler.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016J\u001b\u0010\r\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0002\u0010\u000eJ*\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0002H\u0002J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/glority/android/picturexx/payment/handler/BillingActivityHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "<init>", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "post", "", "request", "Lcom/glority/android/core/route/RouteRequest;", "execute", "(Lcom/glority/android/core/route/RouteRequest;)Ljava/lang/Boolean;", "showPurchasePage", "from", "pageType", "", "requestCode", "isDefaultPage", "showDefaultPurchasePage", "getDefaultConversionPageId", "()Ljava/lang/Integer;", "purchase_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class BillingActivityHandler implements RouteHandler<Boolean> {
    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlRouter.INSTANCE.getURL_OPEN_BILLING_ACTIVITY();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Boolean> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        execute(request);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.glority.android.core.route.RouteHandler
    public Boolean execute(RouteRequest<Boolean> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Long l = (Long) PersistData.INSTANCE.get(ShortcutConstants.ONE_DAY_FREE_SHORTCUT_EXPIRED_TIME, null);
        boolean z = l != null && l.longValue() > ((Number) PersistData.INSTANCE.get(PersistKey.KEY_SERVER_TIME, 0L)).longValue();
        if ((request instanceof OpenBillingActivityRequest) && !z) {
            OpenBillingActivityRequest openBillingActivityRequest = (OpenBillingActivityRequest) request;
            String page = openBillingActivityRequest.getPage();
            Integer intOrNull = page != null ? StringsKt.toIntOrNull(page) : null;
            String from = openBillingActivityRequest.getFrom();
            Integer requestCode = openBillingActivityRequest.getRequestCode();
            int intValue = requestCode != null ? requestCode.intValue() : 1;
            if (AppViewModel.INSTANCE.isDebugMode()) {
                ToastUtils.showShort("get conversion page id: " + intOrNull, new Object[0]);
            }
            if (intOrNull == null) {
                showDefaultPurchasePage(from, intValue);
            } else {
                showPurchasePage$default(this, from, intOrNull.intValue(), intValue, false, 8, null);
            }
            return true;
        }
        return false;
    }

    static /* synthetic */ void showPurchasePage$default(BillingActivityHandler billingActivityHandler, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            z = false;
        }
        billingActivityHandler.showPurchasePage(str, i, i2, z);
    }

    private final void showPurchasePage(String from, int pageType, int requestCode, boolean isDefaultPage) {
        BillingGuideUtils.INSTANCE.billingStartActivity(from, pageType, requestCode, isDefaultPage ? "default_page" : AbTestUtil.INSTANCE.getConversionPageGroup());
    }

    private final void showDefaultPurchasePage(String from, int requestCode) {
        Integer defaultConversionPageId = getDefaultConversionPageId();
        if (defaultConversionPageId != null) {
            showPurchasePage(from, defaultConversionPageId.intValue(), requestCode, true);
        }
    }

    private final Integer getDefaultConversionPageId() {
        String config;
        String config2;
        try {
            if (new IsVipInHistoryRequest().toResult().booleanValue()) {
                config = AppContext.INSTANCE.getConfig("BUI_DEFAULT_MEMO_VIP_IN_HISTORY");
                config2 = AppContext.INSTANCE.getConfig("BUI_DEFAULT_MEMO_VIP_IN_HISTORY_INDEX");
            } else {
                config = AppContext.INSTANCE.getConfig("BUI_DEFAULT_MEMO");
                config2 = AppContext.INSTANCE.getConfig("BUI_DEFAULT_MEMO_INDEX");
            }
            return Integer.valueOf(Integer.parseInt(config + config2));
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
            return null;
        }
    }
}
