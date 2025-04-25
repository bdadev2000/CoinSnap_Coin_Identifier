package com.glority.android.core.route;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.glority.abtest.AbtestInitHandler;
import com.glority.abtest.utils.AbtestGetLoginUiMemoHandler;
import com.glority.abtest.utils.AbtestGetStringVariableHandler;
import com.glority.abtest.utils.AbtestGetVariableDataHandler;
import com.glority.abtest.utils.AbtestGetVariableHandler;
import com.glority.abtest.utils.AbtestGetVariableTestIdHandler;
import com.glority.analysis.handler.BackgroundHandler;
import com.glority.analysis.handler.EnableAppDataCollectionHandler;
import com.glority.analysis.handler.EventValidityCheckHandler;
import com.glority.analysis.handler.ForegroundHandler;
import com.glority.analysis.handler.GetLongIdHandler;
import com.glority.analysis.handler.LogEventSelfHandler;
import com.glority.analysis.handler.SendErrorEventHandler;
import com.glority.android.adjust.handler.EnableAdjustDataCollectionHandler;
import com.glority.android.adjust.handler.GetAdjustIdHandler;
import com.glority.android.adjust.handler.SendPlayStoreSubscriptionHandler;
import com.glority.android.adjust.handler.SendTrackEventHandler;
import com.glority.android.base.agreement.handler.EnableCookieControlHandler;
import com.glority.android.base.agreement.handler.GetPrivacyPolicyUrlHandler;
import com.glority.android.base.agreement.handler.GetTermsOfUseUrlHandler;
import com.glority.android.base.agreement.handler.IsCookieControlEnabledHandler;
import com.glority.android.base.agreement.handler.NeedUpdateAgreementHandler;
import com.glority.android.base.agreement.handler.OpenAgreementPageHandler;
import com.glority.android.base.agreement.handler.OpenPrivacyPolicyPageHandler;
import com.glority.android.base.agreement.handler.OpenSubscriptionTermsPageHandler;
import com.glority.android.base.agreement.handler.OpenTermsOfUsePageHandler;
import com.glority.android.base.agreement.handler.UpdateLegalConfigHandler;
import com.glority.android.base.aws.router.FileUploadHandler;
import com.glority.android.base.aws.router.InitFileUploadHandler;
import com.glority.android.base.aws.router.UpdateCredentialsHandler;
import com.glority.android.base.aws.router.UpdateItemHighQualityHandler;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.utils.ReflectUtil;
import com.glority.android.detain.route.DetainOpenHandler;
import com.glority.android.detain.route.DetainOpenWithRequestCodeHandler;
import com.glority.android.guide.route.ConvertPageOpenHandler;
import com.glority.android.guide.route.ConvertPageOpenWithExtraHandler;
import com.glority.android.guide.route.GetDeviceLevelHandler;
import com.glority.android.handler.OpenHowToReminderActivityHandler;
import com.glority.android.handler.OpenNoNotificationAccessActivityHandler;
import com.glority.android.international.firebase.handler.AfShotLogEventHandler;
import com.glority.android.international.firebase.handler.DeviceInfoChangeHandler;
import com.glority.android.international.firebase.handler.EnableFirebaseDataCollectionHandler;
import com.glority.android.international.firebase.handler.FirebaseGetADIdHandler;
import com.glority.android.international.firebase.handler.FirebaseSetUserIdHandler;
import com.glority.android.international.firebase.handler.FirebaseSetUserPropertyHandler;
import com.glority.android.international.firebase.handler.LogCheckParametersHandler;
import com.glority.android.international.firebase.handler.LogEventHandler;
import com.glority.android.international.firebase.handler.LogExceptionHandler;
import com.glority.android.international.firebase.handler.UpdateAdvertisingIdHandler;
import com.glority.android.picturexx.handler.AfterSplashAgreePolicyHandler;
import com.glority.android.picturexx.handler.BillingPageTypeConvertHandler;
import com.glority.android.picturexx.handler.GetAdditionalHttpHeadersHandler;
import com.glority.android.picturexx.handler.GetPremiumContentHandler;
import com.glority.android.picturexx.handler.GetSurveyJsonHandler;
import com.glority.android.picturexx.handler.GetTrackingAPIsHandler;
import com.glority.android.picturexx.handler.OpenNPSHandler;
import com.glority.android.picturexx.handler.OpenSnapTipsActivityHandler;
import com.glority.android.picturexx.handler.PurchaseDialogHandler;
import com.glority.android.picturexx.handler.PurchaseSuccessHandler;
import com.glority.android.picturexx.handler.UserChangedHandler;
import com.glority.android.picturexx.payment.billingUI.routerHandler.BillingSetPriceBoldHandler;
import com.glority.android.picturexx.payment.billingUI.routerHandler.BillingUIGetCurrencyCodeHandler;
import com.glority.android.picturexx.payment.billingUI.routerHandler.BillingUIGetPriceBySkuHandler;
import com.glority.android.picturexx.payment.billingUI.routerHandler.BillingUIIsCanadaHandler;
import com.glority.android.picturexx.payment.billingUI.routerHandler.BillingUIScrollToDataPolicyHandler;
import com.glority.android.picturexx.payment.billingUI.routerHandler.BillingUISetPolicyClickHandler;
import com.glority.android.picturexx.payment.billingUI.routerHandler.GuideBillingFreeHandler;
import com.glority.android.picturexx.payment.billingUI.routerHandler.GuideBillingInitHandler;
import com.glority.android.picturexx.payment.billingUI.routerHandler.GuideCloseHandler;
import com.glority.android.picturexx.payment.billingUI.routerHandler.GuidePurchaseHandler;
import com.glority.android.picturexx.payment.billingUI.routerHandler.GuidePurchaseWithoutDetainHandler;
import com.glority.android.picturexx.payment.billingUI.routerHandler.GuideRestoreHandler;
import com.glority.android.picturexx.payment.billingUI.routerHandler.IsArabicHandler;
import com.glority.android.picturexx.payment.billingUI.routerHandler.IsJapaneseHandler;
import com.glority.android.picturexx.payment.billingUI.routerHandler.OpenPrivacyPolicyHandler;
import com.glority.android.picturexx.payment.billingUI.routerHandler.OpenServerTermsHandler;
import com.glority.android.picturexx.payment.handler.BillingActivityHandler;
import com.glority.android.picturexx.payment.handler.BillingUICloseHandler;
import com.glority.android.picturexx.payment.handler.BillingUIGetIntroductoryPriceByuSkHandler;
import com.glority.android.picturexx.payment.handler.BillingUISetPolicyClickV2Handler;
import com.glority.android.picturexx.payment.handler.GetVipStepHandler;
import com.glority.android.picturexx.payment.handler.GuideCloseExtraHandler;
import com.glority.android.picturexx.payment.handler.InitBillingSkuDataHandler;
import com.glority.android.picturexx.payment.handler.RemindUserToAttentionTrialByEmailHandler;
import com.glority.android.picturexx.settings.handler.AccountActivityHandler;
import com.glority.android.picturexx.settings.handler.ContactUsHandler;
import com.glority.android.picturexx.settings.handler.DeleteAccountFragmentHandler;
import com.glority.android.picturexx.settings.handler.FeedbackFragmentHandler;
import com.glority.android.picturexx.settings.handler.GetVipInfoHandler;
import com.glority.android.picturexx.settings.handler.ManageMembershipActivityHandler;
import com.glority.android.picturexx.settings.handler.PremiumCenterFragmentHandler;
import com.glority.android.picturexx.settings.handler.ProfileFragmentHandler;
import com.glority.android.picturexx.settings.handler.VipSupportFragmentHandler;
import com.glority.android.picturexx.splash.handler.AgreeAgreementHandler;
import com.glority.android.picturexx.splash.handler.GetLegalConfigHandler;
import com.glority.android.picturexx.splash.handler.GetLocalAgreementVersionHandler;
import com.glority.android.picturexx.splash.handler.HomePurchasePageShouldShowHandler;
import com.glority.android.retain.base.route.RetainOpenHandler;
import com.glority.android.surveyEvent.SurveyAddTagToItemHandler;
import com.glority.android.surveyEvent.SurveyAddTagToNonitemHandler;
import com.glority.android.surveyEvent.SurveyAddToMmsHandler;
import com.glority.android.vipEvent.VipEventHandler;
import com.glority.base.handler.DataCollectMessageHandler;
import com.glority.base.handler.GetCountryCodeHandler;
import com.glority.base.handler.GetDeviceIdHandler;
import com.glority.base.handler.GetUserTypeHandler;
import com.glority.base.handler.GetVipStepRequestHandler;
import com.glority.base.handler.GetVipTypeHandler;
import com.glority.base.handler.IsAgreedAgreementHandler;
import com.glority.base.handler.IsVipInHistoryHandler;
import com.glority.base.handler.WebViewOpenHandler;
import com.glority.base.routers.GetLanguageCodeHandler;
import com.glority.base.routers.abtest.AbtestGetTagMapHandler;
import com.glority.base.routers.abtest.GetUserIdHandlerBilling;
import com.glority.base.routers.encrypt.DecryptHandler;
import com.glority.base.routers.encrypt.EncryptHandler;
import com.glority.base.routers.encrypt.GetMd5EncryptKeyHandler;
import com.glority.base.routers.network.GetAccessTokenHandler;
import com.glority.base.routers.network.GetUserIdHandler;
import com.glority.base.routers.network.NetworkChangedHandler;
import com.glority.base.routers.network.PingServerHandler;
import com.glority.base.routers.persistdata.PersistDataReadHandler;
import com.glority.base.routers.persistdata.PersistDataWriteHandler;
import com.glority.billing.handler.QueryHasActiveSubscribedHandler;
import com.glority.billing.handler.QueryHasSubscribedHandler;
import com.glority.loginPolicyExample.handler.JumpConvertPageHandler;
import com.glority.loginPolicyExample.handler.OpenSignActivityHandler;
import com.glority.sample.membership.handler.IsEightHandler;
import com.glority.sample.membership.handler.LessFifthHandler;
import com.glority.share.ShareHandler;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class Router {
    private static String TAG = "Router";
    private static Map<String, RouteHandler> handlers = new ConcurrentHashMap();
    private static Map<String, RouteRequest> requests = new ConcurrentHashMap();

    static {
        registerHandler(new GetSurveyJsonHandler());
        registerHandler(new IsEightHandler());
        registerHandler(new GetCountryCodeHandler());
        registerHandler(new OpenPrivacyPolicyPageHandler());
        registerHandler(new BillingPageTypeConvertHandler());
        registerHandler(new DataCollectMessageHandler());
        registerHandler(new LogExceptionHandler());
        registerHandler(new BillingUIScrollToDataPolicyHandler());
        registerHandler(new PremiumCenterFragmentHandler());
        registerHandler(new UpdateCredentialsHandler());
        registerHandler(new LessFifthHandler());
        registerHandler(new BillingUIGetPriceBySkuHandler());
        registerHandler(new GuideBillingFreeHandler());
        registerHandler(new AbtestGetStringVariableHandler());
        registerHandler(new InitFileUploadHandler());
        registerHandler(new BillingActivityHandler());
        registerHandler(new GetVipStepRequestHandler());
        registerHandler(new GuideBillingInitHandler());
        registerHandler(new GetLongIdHandler());
        registerHandler(new EnableCookieControlHandler());
        registerHandler(new DeleteAccountFragmentHandler());
        registerHandler(new AbtestGetTagMapHandler());
        registerHandler(new GetPrivacyPolicyUrlHandler());
        registerHandler(new OpenTermsOfUsePageHandler());
        registerHandler(new GuideCloseExtraHandler());
        registerHandler(new BillingUIIsCanadaHandler());
        registerHandler(new GetLanguageCodeHandler());
        registerHandler(new GetAccessTokenHandler());
        registerHandler(new IsCookieControlEnabledHandler());
        registerHandler(new BillingUISetPolicyClickV2Handler());
        registerHandler(new LogEventSelfHandler());
        registerHandler(new OpenSignActivityHandler());
        registerHandler(new FirebaseSetUserPropertyHandler());
        registerHandler(new AbtestGetLoginUiMemoHandler());
        registerHandler(new SurveyAddTagToItemHandler());
        registerHandler(new GuideRestoreHandler());
        registerHandler(new NetworkChangedHandler());
        registerHandler(new AfShotLogEventHandler());
        registerHandler(new OpenSnapTipsActivityHandler());
        registerHandler(new ShareHandler());
        registerHandler(new OpenNPSHandler());
        registerHandler(new VipEventHandler());
        registerHandler(new AbtestGetVariableTestIdHandler());
        registerHandler(new GetVipStepHandler());
        registerHandler(new AbtestGetVariableHandler());
        registerHandler(new AfterSplashAgreePolicyHandler());
        registerHandler(new GetDeviceLevelHandler());
        registerHandler(new SendErrorEventHandler());
        registerHandler(new UpdateItemHighQualityHandler());
        registerHandler(new RetainOpenHandler());
        registerHandler(new GetAdditionalHttpHeadersHandler());
        registerHandler(new GetTermsOfUseUrlHandler());
        registerHandler(new AgreeAgreementHandler());
        registerHandler(new UpdateAdvertisingIdHandler());
        registerHandler(new QueryHasActiveSubscribedHandler());
        registerHandler(new GetUserIdHandlerBilling());
        registerHandler(new PersistDataWriteHandler());
        registerHandler(new IsArabicHandler());
        registerHandler(new IsVipInHistoryHandler());
        registerHandler(new GetVipTypeHandler());
        registerHandler(new EventValidityCheckHandler());
        registerHandler(new GetDeviceIdHandler());
        registerHandler(new EnableFirebaseDataCollectionHandler());
        registerHandler(new BillingSetPriceBoldHandler());
        registerHandler(new VipSupportFragmentHandler());
        registerHandler(new DetainOpenHandler());
        registerHandler(new OpenSubscriptionTermsPageHandler());
        registerHandler(new OpenNoNotificationAccessActivityHandler());
        registerHandler(new FirebaseGetADIdHandler());
        registerHandler(new GetLocalAgreementVersionHandler());
        registerHandler(new OpenHowToReminderActivityHandler());
        registerHandler(new HomePurchasePageShouldShowHandler());
        registerHandler(new ContactUsHandler());
        registerHandler(new OpenServerTermsHandler());
        registerHandler(new GetTrackingAPIsHandler());
        registerHandler(new BillingUIGetCurrencyCodeHandler());
        registerHandler(new GetUserIdHandler());
        registerHandler(new GetLegalConfigHandler());
        registerHandler(new JumpConvertPageHandler());
        registerHandler(new AbtestGetVariableDataHandler());
        registerHandler(new GetVipInfoHandler());
        registerHandler(new DeviceInfoChangeHandler());
        registerHandler(new IsJapaneseHandler());
        registerHandler(new GetUserTypeHandler());
        registerHandler(new EncryptHandler());
        registerHandler(new UserChangedHandler());
        registerHandler(new SurveyAddToMmsHandler());
        registerHandler(new GetPremiumContentHandler());
        registerHandler(new ConvertPageOpenHandler());
        registerHandler(new FileUploadHandler());
        registerHandler(new BillingUICloseHandler());
        registerHandler(new com.glority.base.routers.aws.GetUserIdHandler());
        registerHandler(new GetAdjustIdHandler());
        registerHandler(new SendTrackEventHandler());
        registerHandler(new ConvertPageOpenWithExtraHandler());
        registerHandler(new BackgroundHandler());
        registerHandler(new LogCheckParametersHandler());
        registerHandler(new DecryptHandler());
        registerHandler(new EnableAdjustDataCollectionHandler());
        registerHandler(new SurveyAddTagToNonitemHandler());
        registerHandler(new ManageMembershipActivityHandler());
        registerHandler(new PurchaseDialogHandler());
        registerHandler(new DetainOpenWithRequestCodeHandler());
        registerHandler(new GuidePurchaseWithoutDetainHandler());
        registerHandler(new FeedbackFragmentHandler());
        registerHandler(new WebViewOpenHandler());
        registerHandler(new AccountActivityHandler());
        registerHandler(new NeedUpdateAgreementHandler());
        registerHandler(new FirebaseSetUserIdHandler());
        registerHandler(new PingServerHandler());
        registerHandler(new EnableAppDataCollectionHandler());
        registerHandler(new OpenAgreementPageHandler());
        registerHandler(new SendPlayStoreSubscriptionHandler());
        registerHandler(new InitBillingSkuDataHandler());
        registerHandler(new QueryHasSubscribedHandler());
        registerHandler(new GuidePurchaseHandler());
        registerHandler(new OpenPrivacyPolicyHandler());
        registerHandler(new RemindUserToAttentionTrialByEmailHandler());
        registerHandler(new GetMd5EncryptKeyHandler());
        registerHandler(new UpdateLegalConfigHandler());
        registerHandler(new PurchaseSuccessHandler());
        registerHandler(new ProfileFragmentHandler());
        registerHandler(new BillingUIGetIntroductoryPriceByuSkHandler());
        registerHandler(new BillingUISetPolicyClickHandler());
        registerHandler(new AbtestInitHandler());
        registerHandler(new GuideCloseHandler());
        registerHandler(new LogEventHandler());
        registerHandler(new IsAgreedAgreementHandler());
        registerHandler(new ForegroundHandler());
        registerHandler(new PersistDataReadHandler());
    }

    private Router() {
    }

    public static void registerHandler(RouteHandler routeHandler) {
        if (routeHandler == null || TextUtils.isEmpty(routeHandler.getUrl())) {
            return;
        }
        String url = routeHandler.getUrl();
        if (url.indexOf("://") <= 0) {
            url = AppContext.INSTANCE.getScheme() + url;
        }
        Log.e("registerHandler", "registerHandler ====== " + url);
        handlers.put(url, routeHandler);
    }

    public static void removeHandler(RouteHandler routeHandler) {
        for (Map.Entry<String, RouteHandler> entry : handlers.entrySet()) {
            if (entry.getValue() == routeHandler) {
                handlers.remove(entry.getKey());
                return;
            }
        }
    }

    public static void removeRequest(String str) {
        requests.remove(str);
    }

    public static <T> T executeRequest(RouteRequest routeRequest) throws ClassNotFoundException {
        RouteHandler routeHandler = handlers.get(routeRequest.getUrlWithoutData());
        if (routeHandler == null) {
            if (AppContext.INSTANCE.isDebugMode()) {
                throw new ClassNotFoundException(String.format("No handler found for: %s. Request class: %s", routeRequest.getUrlWithoutData(), routeRequest.getClass().getSimpleName()));
            }
            return null;
        }
        return (T) routeHandler.execute(routeRequest);
    }

    public static void executeAtOnce(RouteRequest routeRequest) throws ClassNotFoundException {
        RouteHandler routeHandler = handlers.get(routeRequest.getUrlWithoutData());
        if (routeHandler == null) {
            if (AppContext.INSTANCE.isDebugMode()) {
                throw new ClassNotFoundException(String.format("No handler found for: %s. Request class: %s", routeRequest.getUrlWithoutData(), routeRequest.getClass().getSimpleName()));
            }
        } else {
            routeHandler.post(routeRequest);
        }
    }

    public static void postRequest(final RouteRequest routeRequest) {
        final RouteHandler routeHandler = handlers.get(routeRequest.getUrlWithoutData());
        if (routeHandler == null) {
            String str = "No handler found for " + routeRequest.getUrlWithoutData();
            if (AppContext.INSTANCE.isDebugMode()) {
                ToastUtils.showLong(str);
                LogUtils.e(TAG, str);
            }
            routeRequest.onResult(null);
            return;
        }
        requests.put(routeRequest.getId(), routeRequest);
        String encode = Uri.encode("#");
        String queryParameter = Uri.parse(routeRequest.getUrl().replace("#", encode)).getQueryParameter("dependenceUrl");
        (queryParameter != null ? new RouteRequest(queryParameter.replace(encode, "#")).toObservable() : Observable.just(true)).filter(new Predicate() { // from class: com.glority.android.core.route.Router$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return Router.lambda$postRequest$0(obj);
            }
        }).flatMap(new Function() { // from class: com.glority.android.core.route.Router$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return Router.lambda$postRequest$1(RouteHandler.this, obj);
            }
        }).subscribe(new Consumer() { // from class: com.glority.android.core.route.Router$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                Router.lambda$postRequest$2(RouteHandler.this, routeRequest, obj);
            }
        }, new Consumer() { // from class: com.glority.android.core.route.Router$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RouteRequest.this.onComplete();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean lambda$postRequest$0(Object obj) throws Exception {
        try {
            Method method = ReflectUtil.getMethod(obj.getClass(), "isReady");
            if (method != null) {
                return !method.invoke(obj, new Object[0]).equals(false);
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object lambda$postRequest$1(RouteHandler routeHandler, Object obj) throws Exception {
        return routeHandler.getDependency() != null ? routeHandler.getDependency() : Observable.just(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$postRequest$2(RouteHandler routeHandler, RouteRequest routeRequest, Object obj) throws Exception {
        try {
            routeHandler.post(routeRequest);
            if (routeRequest.getRequireResponse()) {
                return;
            }
            routeRequest.onComplete();
        } catch (Exception e) {
            e.printStackTrace();
            routeRequest.onException(e);
        }
    }

    public static <T> void onResponse(String str, T t) {
        RouteRequest routeRequest;
        if (TextUtils.isEmpty(str) || (routeRequest = requests.get(str)) == null) {
            return;
        }
        routeRequest.onResult(t);
    }

    public static void onException(String str, Exception exc) {
        RouteRequest routeRequest;
        if (TextUtils.isEmpty(str) || (routeRequest = requests.get(str)) == null) {
            return;
        }
        routeRequest.onException(exc);
    }
}
