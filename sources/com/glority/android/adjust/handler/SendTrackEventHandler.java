package com.glority.android.adjust.handler;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Handler;
import android.os.Looper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustEvent;
import com.glority.android.app.BuildConfig;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.adjust.SendTrackEventRequest;
import com.glority.android.core.route.adjust.UrlAdjust;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.xx.constants.Args;
import com.glority.billing.agent.MyBillingAgent;
import com.glority.utils.stability.LogUtils;
import com.google.android.exoplayer2.SimpleExoPlayer;
import io.reactivex.Observable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SendTrackEventHandler.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/glority/android/adjust/handler/SendTrackEventHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "post", "", "request", "Lcom/glority/android/core/route/RouteRequest;", "Companion", "base-adjust_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SendTrackEventHandler implements RouteHandler<Boolean> {
    public static final String ADJUST_EVENT_DEBUG = "adjust_event_debug";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

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
        return UrlAdjust.INSTANCE.getURL_ADJUST_SEND_TRACK_EVENT();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(final RouteRequest<Boolean> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof SendTrackEventRequest) {
            SendTrackEventRequest sendTrackEventRequest = (SendTrackEventRequest) request;
            String str = INSTANCE.getEvents().get(sendTrackEventRequest.getEventName());
            if (str == null) {
                if (str == null) {
                    String config = AppContext.INSTANCE.getConfig(sendTrackEventRequest.getEventName());
                    if (config.length() == 0) {
                        if (Intrinsics.areEqual(AppContext.INSTANCE.getConfig("ENV"), BuildConfig.ENV)) {
                            return;
                        }
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.glority.android.adjust.handler.SendTrackEventHandler$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SendTrackEventHandler.m7698post$lambda3(RouteRequest.this);
                            }
                        }, SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                        return;
                    } else {
                        Adjust.trackEvent(new AdjustEvent(config));
                        new LogEventRequest(ADJUST_EVENT_DEBUG, BundleKt.bundleOf(TuplesKt.to("name", sendTrackEventRequest.getEventName()), TuplesKt.to("error", "event name config in app"))).post();
                        return;
                    }
                }
                return;
            }
            AdjustEvent adjustEvent = new AdjustEvent(str);
            Double revenue = sendTrackEventRequest.getRevenue();
            if (revenue != null) {
                double doubleValue = revenue.doubleValue();
                String currency = sendTrackEventRequest.getCurrency();
                if (currency == null) {
                    currency = "";
                }
                adjustEvent.setRevenue(doubleValue, currency);
            }
            String orderid = sendTrackEventRequest.getOrderid();
            if (orderid != null) {
                adjustEvent.setOrderId(orderid);
            }
            new LogEventRequest(ADJUST_EVENT_DEBUG, BundleKt.bundleOf(TuplesKt.to("name", str))).post();
            Adjust.trackEvent(adjustEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: post$lambda-3, reason: not valid java name */
    public static final void m7698post$lambda3(RouteRequest request) {
        Intrinsics.checkNotNullParameter(request, "$request");
        INSTANCE.quitEdit("Adjust event config error", "EventName: " + ((SendTrackEventRequest) request).getEventName() + "\n Please contact lin.qixin for more detail.");
    }

    /* compiled from: SendTrackEventHandler.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/glority/android/adjust/handler/SendTrackEventHandler$Companion;", "", "()V", "ADJUST_EVENT_DEBUG", "", "getEvents", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "quitEdit", "", Args.title, LogEventArguments.ARG_MESSAGE, "base-adjust_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HashMap<String, String> getEvents() {
            String config = AppContext.INSTANCE.getConfig("APPLICATION_ID");
            switch (config.hashCode()) {
                case -2014001301:
                    if (config.equals("com.growit.ai")) {
                        return MapsKt.hashMapOf(TuplesKt.to(MyBillingAgent.ADJUST_PURCHASE_EVENT, "vckzin"), TuplesKt.to("AJ_vip", "bwcyo9"));
                    }
                    break;
                case -1943621967:
                    if (config.equals("com.glority.everlens")) {
                        return MapsKt.hashMapOf(TuplesKt.to("aj_purchase", "avuh3n"), TuplesKt.to("aj_rate", "wqxc14"), TuplesKt.to("aj_share", "l69gqa"), TuplesKt.to("activation", "njo2v8"), TuplesKt.to("cancellation", "nlmwtv"), TuplesKt.to("entered_billing_retry", "t5eu3v"), TuplesKt.to("first_conversion", "vcn1f8"), TuplesKt.to("reactivation", "8odr58"), TuplesKt.to("renewal", "dpzq96"), TuplesKt.to("renewal_from_billing_retry", "538j7h"), TuplesKt.to("aj_subscribe", "7kis6p"), TuplesKt.to("aj_trialcancel", "m2z4rn"), TuplesKt.to("AJ_removeads", "vsgpti"), TuplesKt.to(MyBillingAgent.ADJUST_PURCHASE_EVENT, "nfzbra"), TuplesKt.to("AJ_vip", "yb6b0r"));
                    }
                    break;
                case -1752462063:
                    if (config.equals("com.glammeai.app")) {
                        return MapsKt.hashMapOf(TuplesKt.to(MyBillingAgent.ADJUST_PURCHASE_EVENT, "6c31fh"));
                    }
                    break;
                case -1366726854:
                    if (config.equals("com.mejordailytracker.app")) {
                        return MapsKt.hashMapOf(TuplesKt.to(MyBillingAgent.ADJUST_PURCHASE_EVENT, "fe0goj"), TuplesKt.to("AJ_survey", "4vnq39"), TuplesKt.to("AJ_survey_w", "m7eg4j"), TuplesKt.to("AJ_vip", "t6tt8g"));
                    }
                    break;
                case -1069088216:
                    if (config.equals("com.healingpal.ai")) {
                        return MapsKt.hashMapOf(TuplesKt.to(MyBillingAgent.ADJUST_PURCHASE_EVENT, "xaxaun"), TuplesKt.to("AJ_vip", "yg6sjp"));
                    }
                    break;
                case -930394493:
                    if (config.equals("com.askthis.aichatbot")) {
                        return MapsKt.hashMapOf(TuplesKt.to(MyBillingAgent.ADJUST_PURCHASE_EVENT, "cllild"));
                    }
                    break;
                case -846698245:
                    if (config.equals("com.banknote.ai")) {
                        return MapsKt.hashMapOf(TuplesKt.to(MyBillingAgent.ADJUST_PURCHASE_EVENT, "z7b89z"), TuplesKt.to("AJ_discount", "yyz59j"), TuplesKt.to("AJ_vip", "sw5z0q"));
                    }
                    break;
                case -214467490:
                    if (config.equals("com.picturenature.ai")) {
                        return MapsKt.hashMapOf(TuplesKt.to(MyBillingAgent.ADJUST_PURCHASE_EVENT, "14ghmy"), TuplesKt.to("AJ_discount", "moanpy"), TuplesKt.to("AJ_vip", "or844b"));
                    }
                    break;
                case -159596116:
                    if (config.equals("com.ailawyer.legalai")) {
                        return MapsKt.hashMapOf(TuplesKt.to(MyBillingAgent.ADJUST_PURCHASE_EVENT, "ri693w"), TuplesKt.to("sub_year", "7nbkbn"), TuplesKt.to("sub_week", "b1zfa1"), TuplesKt.to("sub_month", "20vusk"), TuplesKt.to("sub_year_3dt", "tdz6tu"), TuplesKt.to("sub_year_notrial", "akrr2o"));
                    }
                    break;
                case -151919731:
                    if (config.equals("com.picturethis.lite")) {
                        return MapsKt.hashMapOf(TuplesKt.to(MyBillingAgent.ADJUST_PURCHASE_EVENT, "ilxisd"));
                    }
                    break;
                case -100412174:
                    if (config.equals("com.aichatbot.friend")) {
                        return MapsKt.hashMapOf(TuplesKt.to(MyBillingAgent.ADJUST_PURCHASE_EVENT, "i0939z"), TuplesKt.to("sub_week", "jb280f"), TuplesKt.to("sub_yearly", "x9coc3"), TuplesKt.to("sub_week_pro", "9fkgus"), TuplesKt.to("sub_month", "74vro2"), TuplesKt.to("unlock_role_199", "yy74he"), TuplesKt.to("sub_yearly_notrial", "q9hgxx"));
                    }
                    break;
                case 139243041:
                    if (config.equals("com.glority.picturemushroom")) {
                        return MapsKt.hashMapOf(TuplesKt.to("AJ_rate", "2gl1vm"), TuplesKt.to("AJ_share", "qv4wro"), TuplesKt.to(MyBillingAgent.ADJUST_PURCHASE_EVENT, "zhjgs1"), TuplesKt.to("AJ_removeads", "oamyic"), TuplesKt.to("AJ_discount", "1herl7"), TuplesKt.to("AJ_vip", "1twifu"));
                    }
                    break;
                case 546804482:
                    if (config.equals("com.glority.picturebird")) {
                        return MapsKt.hashMapOf(TuplesKt.to("AJ_rate", "5rnp0s"), TuplesKt.to("AJ_share", "u0d7pf"), TuplesKt.to(MyBillingAgent.ADJUST_PURCHASE_EVENT, "qe88rp"), TuplesKt.to("AJ_discount", "ko84l5"), TuplesKt.to("AJ_vip", "g0xdhy"));
                    }
                    break;
                case 546923681:
                    if (config.equals("com.glority.picturefish")) {
                        return MapsKt.hashMapOf(TuplesKt.to("AJ_rate", "jei1dn"), TuplesKt.to("AJ_share", "t6d874"), TuplesKt.to(MyBillingAgent.ADJUST_PURCHASE_EVENT, "xtqwdo"), TuplesKt.to("AJ_vip", "u6l83x"));
                    }
                    break;
                case 692794179:
                    if (config.equals("com.plantparentai.app")) {
                        return MapsKt.hashMapOf(TuplesKt.to(MyBillingAgent.ADJUST_PURCHASE_EVENT, "7rooxu"), TuplesKt.to("AJ_discount", "i6kugq"), TuplesKt.to("AJ_vip", "7k5nsu"), TuplesKt.to("AJ_homeshow", "n0i3qr"), TuplesKt.to("AJ_identify", "i6262n"));
                    }
                    break;
                case 697124991:
                    if (config.equals("cn.danatech.xingseus")) {
                        return MapsKt.hashMapOf(TuplesKt.to(MyBillingAgent.ADJUST_PURCHASE_EVENT, "yrznw9"), TuplesKt.to("AJ_nps", "9qstug"), TuplesKt.to("AJ_discount", "enr5w0"), TuplesKt.to("AJ_vip_client", "88mj58"));
                    }
                    break;
                case 853945383:
                    if (config.equals("com.snapface.app")) {
                        return MapsKt.hashMapOf(TuplesKt.to(MyBillingAgent.ADJUST_PURCHASE_EVENT, "cbxzc8"));
                    }
                    break;
                case 1136314985:
                    if (config.equals("com.glamme.app")) {
                        return MapsKt.hashMapOf(TuplesKt.to(MyBillingAgent.ADJUST_PURCHASE_EVENT, "jh1h58"));
                    }
                    break;
                case 1469272927:
                    if (config.equals(BuildConfig.APPLICATION_ID)) {
                        return MapsKt.hashMapOf(TuplesKt.to(MyBillingAgent.ADJUST_PURCHASE_EVENT, "mlntnm"), TuplesKt.to("AJ_nps", "4bx6hm"), TuplesKt.to("AJ_photo3", "lamaog"), TuplesKt.to("AJ_serieslevel", "2w8t2r"), TuplesKt.to("AJ_discount", "wgrpy5"), TuplesKt.to("AJ_vip", "e5jqlz"));
                    }
                    break;
                case 1518855645:
                    if (config.equals("com.picturerock.rock")) {
                        return MapsKt.hashMapOf(TuplesKt.to("AJ_share", "ce2ua3"), TuplesKt.to("AJ_healingcrystals", "9vqu8q"), TuplesKt.to("AJ_tumbledstones", "svmq6i"), TuplesKt.to("AJ_Birthstones", "trb4r2"), TuplesKt.to("AJ_zodiacgemstones", "52q33v"), TuplesKt.to("AJ_removeads", "vjzbxs"), TuplesKt.to(MyBillingAgent.ADJUST_PURCHASE_EVENT, "kznwdy"), TuplesKt.to("AJ_removeads_f", "h4kivr"), TuplesKt.to("AJ_discount", "v57xrz"), TuplesKt.to("AJ_vip", "xure6d"));
                    }
                    break;
                case 1698152689:
                    if (config.equals("com.glority.pictureinsect")) {
                        return MapsKt.hashMapOf(TuplesKt.to("AJ_rate", "2aca1g"), TuplesKt.to("AJ_share", "y70vay"), TuplesKt.to(MyBillingAgent.ADJUST_PURCHASE_EVENT, "mfou8l"), TuplesKt.to("AJ_discount", "ik7sih"), TuplesKt.to("AJ_vip", "8vplsl"));
                    }
                    break;
                case 2016600191:
                    if (config.equals("com.homework.helper")) {
                        return MapsKt.hashMapOf(TuplesKt.to(MyBillingAgent.ADJUST_PURCHASE_EVENT, "lulubh"), TuplesKt.to("AJ_print", "63xlm7"), TuplesKt.to("save_export", "u55m9y"), TuplesKt.to("AJ_vip", "msw8gx"));
                    }
                    break;
            }
            return new HashMap<>();
        }

        public final void quitEdit(String title, String message) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            if (AppContext.INSTANCE.peekContext() instanceof Activity) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AppContext.INSTANCE.peekContext());
                builder.setTitle(title);
                builder.setMessage(message);
                builder.setCancelable(false);
                builder.create().show();
                LogUtils.e("adjust event not config !!!!!!!!", message);
            }
        }
    }
}
