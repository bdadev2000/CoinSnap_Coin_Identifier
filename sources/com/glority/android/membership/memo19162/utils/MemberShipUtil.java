package com.glority.android.membership.memo19162.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.core.os.BundleKt;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.route.guide.BillingUIGetCurrencyCodeRequest;
import com.glority.android.core.route.guide.BillingUIGetPriceBySkuRequest;
import com.glority.android.core.route.membership.BillingPlatiumRequest;
import com.glority.android.core.route.membership.ContactUsRequest;
import com.glority.android.core.route.membership.GetVipInfoRequest;
import com.glority.android.core.route.membership.IsEightRequest;
import com.glority.android.core.route.membership.LessFifthRequest;
import com.glority.android.core.route.membership.MembershipFeedbackRequest;
import com.glority.utils.stability.LogUtils;
import com.google.gson.Gson;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MemberShipUtil.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005J\u0012\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0010\u0010\f\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00102\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u0012J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00102\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\u0012J\u0016\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tJ\u0016\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tJ\u0016\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tJ\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00102\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\tJ\u0006\u0010 \u001a\u00020\tJ\u0006\u0010!\u001a\u00020\tJ\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u0004\u0018\u00010%J\u0006\u0010&\u001a\u00020\u0005J$\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\t2\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00050*J\u0006\u0010+\u001a\u00020\u0005J\u000e\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020.¨\u0006/"}, d2 = {"Lcom/glority/android/membership/memo19162/utils/MemberShipUtil;", "", "<init>", "()V", "clickCancelPlan", "", "clickKeepPlan", "clickChangePlan", LogEventArguments.ARG_SKU, "", "clickX", "clickContactUs", "clickSku", "clickBack", "clickFinishCancelling", "getPricePerWeek", "Lkotlin/Pair;", "weeks", "", "getPricePerDay", "days", "amountSavedYear2week", "yearPrice", "weekPrice", "amountSavedMonth2week", "monthPrice", "week52", "weekCode", "getPriceAndCurrency", "getRemainingDays", "", "getStartTime", "getEndTime", "pageType", "isFreeTrial", "", "getVipInfo", "Lcom/glority/android/membership/memo19162/utils/VipInfo;", "toPlatinumPage", "sendCancelVipEmail", "email", "callback", "Lkotlin/Function1;", "contactUs", "toGoogleSubscriptionsPage", "context", "Landroid/content/Context;", "purchaseui_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes3.dex */
public final class MemberShipUtil {
    public static final MemberShipUtil INSTANCE = new MemberShipUtil();

    private MemberShipUtil() {
    }

    public final void clickCancelPlan() {
        new LogEventRequest(MembershipLogEvents.go_to_cancel_plan, null, 2, null).post();
    }

    public final void clickKeepPlan() {
        new LogEventRequest(MembershipLogEvents.MEMBERSHIP_KEEP_PLAN + pageType(), null, 2, null).post();
    }

    public static /* synthetic */ void clickChangePlan$default(MemberShipUtil memberShipUtil, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        memberShipUtil.clickChangePlan(str);
    }

    public final void clickChangePlan(String sku) {
        if (sku == null) {
            new LogEventRequest(MembershipLogEvents.MEMBERSHIP_CHANGE_PLAN + pageType(), null, 2, null).post();
        } else {
            new LogEventRequest(MembershipLogEvents.MEMBERSHIP_CHANGE_PLAN + pageType(), BundleKt.bundleOf(TuplesKt.to(LogEventArguments.ARG_SKU, sku))).post();
        }
    }

    public final void clickX() {
        new LogEventRequest(MembershipLogEvents.return_to_member_center, null, 2, null).post();
    }

    public final void clickContactUs() {
        new LogEventRequest(MembershipLogEvents.turnto_customer_service, null, 2, null).post();
    }

    public final void clickSku(String sku) {
        new LogEventRequest(MembershipLogEvents.select_plan, BundleKt.bundleOf(TuplesKt.to(LogEventArguments.ARG_SKU, sku))).post();
    }

    public final void clickBack() {
        new LogEventRequest(MembershipLogEvents.return_to_lastpage, null, 2, null).post();
    }

    public final void clickFinishCancelling() {
        new LogEventRequest(MembershipLogEvents.finish_cancelling, null, 2, null).post();
    }

    public final Pair<String, String> getPricePerWeek(String sku, int weeks) {
        Pair<String, String> priceAndCurrency = getPriceAndCurrency(sku);
        String component1 = priceAndCurrency.component1();
        String component2 = priceAndCurrency.component2();
        try {
            String bigDecimal = new BigDecimal(component1).divide(new BigDecimal(weeks), 2, 1).toString();
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "toString(...)");
            return new Pair<>(bigDecimal, component2);
        } catch (Throwable unused) {
            return new Pair<>("null", component2);
        }
    }

    public final Pair<String, String> getPricePerDay(String sku, int days) {
        Pair<String, String> priceAndCurrency = getPriceAndCurrency(sku);
        String component1 = priceAndCurrency.component1();
        String component2 = priceAndCurrency.component2();
        try {
            String bigDecimal = new BigDecimal(component1).divide(new BigDecimal(days), 2, 1).toString();
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "toString(...)");
            return new Pair<>(bigDecimal, component2);
        } catch (Throwable unused) {
            return new Pair<>("null", component2);
        }
    }

    public final String amountSavedYear2week(String yearPrice, String weekPrice) {
        Intrinsics.checkNotNullParameter(yearPrice, "yearPrice");
        Intrinsics.checkNotNullParameter(weekPrice, "weekPrice");
        try {
            String format = String.format("%.0f", Arrays.copyOf(new Object[]{new BigDecimal(1).subtract(new BigDecimal(yearPrice).divide(new BigDecimal(weekPrice).multiply(new BigDecimal(52)), 2, 1)).multiply(new BigDecimal(100))}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        } catch (Throwable unused) {
            return "null";
        }
    }

    public final String amountSavedMonth2week(String monthPrice, String weekPrice) {
        Intrinsics.checkNotNullParameter(monthPrice, "monthPrice");
        Intrinsics.checkNotNullParameter(weekPrice, "weekPrice");
        try {
            String format = String.format("%.0f", Arrays.copyOf(new Object[]{new BigDecimal(1).subtract(new BigDecimal(monthPrice).divide(new BigDecimal(weekPrice).multiply(new BigDecimal(4)), 2, 1)).multiply(new BigDecimal(100))}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        } catch (Throwable unused) {
            return "null";
        }
    }

    public final String week52(String weekPrice, String weekCode) {
        Intrinsics.checkNotNullParameter(weekPrice, "weekPrice");
        Intrinsics.checkNotNullParameter(weekCode, "weekCode");
        try {
            return weekCode + new BigDecimal(weekPrice).multiply(new BigDecimal(52));
        } catch (Throwable unused) {
            return "null";
        }
    }

    public final Pair<String, String> getPriceAndCurrency(String sku) {
        String result = new BillingUIGetCurrencyCodeRequest(sku, null, 2, null).toResult();
        if (result == null) {
            result = "";
        }
        String result2 = new BillingUIGetPriceBySkuRequest(sku, null, 2, null).toResult();
        return new Pair<>(result2 != null ? result2 : "", result);
    }

    public final long getRemainingDays() {
        Date expiredAt;
        VipInfo vipInfo = getVipInfo();
        long time = ((vipInfo == null || (expiredAt = vipInfo.getExpiredAt()) == null) ? 0L : expiredAt.getTime()) - System.currentTimeMillis();
        long j = time > 0 ? time : 0L;
        long j2 = 60;
        return (long) Math.ceil((((j / 1000) / j2) / j2) / 24.0d);
    }

    public final String getStartTime() {
        Date startAt;
        VipInfo vipInfo = getVipInfo();
        if (vipInfo == null || (startAt = vipInfo.getStartAt()) == null) {
            return "";
        }
        return new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault()).format(startAt);
    }

    public final String getEndTime() {
        Date expiredAt;
        VipInfo vipInfo = getVipInfo();
        if (vipInfo == null || (expiredAt = vipInfo.getExpiredAt()) == null) {
            return "";
        }
        return new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault()).format(expiredAt);
    }

    public final String pageType() {
        return new IsEightRequest().toResult().booleanValue() ? "_8" : new LessFifthRequest().toResult().booleanValue() ? "_5" : "";
    }

    public final boolean isFreeTrial() {
        return new LessFifthRequest().toResult().booleanValue();
    }

    public final VipInfo getVipInfo() {
        try {
            return (VipInfo) new Gson().fromJson(new GetVipInfoRequest().toResult(), VipInfo.class);
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
            return null;
        }
    }

    public final void toPlatinumPage() {
        new BillingPlatiumRequest().post();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendCancelVipEmail$default(MemberShipUtil memberShipUtil, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<Boolean, Unit>() { // from class: com.glority.android.membership.memo19162.utils.MemberShipUtil$sendCancelVipEmail$1
                public final void invoke(boolean z) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }
            };
        }
        memberShipUtil.sendCancelVipEmail(str, function1);
    }

    public final void sendCancelVipEmail(String email, final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(callback, "callback");
        new MembershipFeedbackRequest(email).subscribe(new Consumer() { // from class: com.glority.android.membership.memo19162.utils.MemberShipUtil$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MemberShipUtil.sendCancelVipEmail$lambda$3(Function1.this, (Boolean) obj);
            }
        }, new Consumer() { // from class: com.glority.android.membership.memo19162.utils.MemberShipUtil$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MemberShipUtil.sendCancelVipEmail$lambda$4(Function1.this, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendCancelVipEmail$lambda$3(Function1 callback, Boolean bool) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke(Boolean.valueOf(Intrinsics.areEqual((Object) bool, (Object) true)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendCancelVipEmail$lambda$4(Function1 callback, Throwable th) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke(false);
    }

    public final void contactUs() {
        new ContactUsRequest().post();
    }

    public final void toGoogleSubscriptionsPage(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://play.google.com/store/account/subscriptions"));
        intent.setPackage("com.android.vending");
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
        }
    }
}
