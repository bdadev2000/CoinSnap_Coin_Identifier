package com.glority.android.picturexx.handler;

import android.app.UiModeManager;
import android.content.Context;
import android.util.Log;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.content.pm.ShortcutManagerCompat;
import com.glority.abtest.utils.AbtestUtils;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.picturexx.constants.ShortcutConstants;
import com.glority.android.picturexx.nps.CustomNpsPopupController;
import com.glority.android.picturexx.utils.CoinSPUtils;
import com.glority.android.picturexx.utils.ShortcutUtils;
import com.glority.android.picturexx.utils.ThemeUtils;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.abtest.CoinAbTestUtils;
import com.glority.base.routers.UrlRouter;
import com.glority.base.routers.business.AfterSplashAgreePolicyRequest;
import com.glority.base.storage.PersistKey;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import com.glority.utils.stability.LogUtils;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AfterSplashAgreePolicyHandler.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/glority/android/picturexx/handler/AfterSplashAgreePolicyHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "<init>", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "post", "", "request", "Lcom/glority/android/core/route/RouteRequest;", "enableDarkMode", "context", "Landroid/content/Context;", "oneDayTrialShortcutEnable", "", "removeAllShortcuts", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class AfterSplashAgreePolicyHandler implements RouteHandler<Object> {
    public static final int $stable = 0;

    @Override // com.glority.android.core.route.RouteHandler
    public Object execute(RouteRequest<Object> routeRequest) {
        return RouteHandler.DefaultImpls.execute(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlRouter.INSTANCE.getURL_AFTER_SPLASH_AGREE_POLICY();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Object> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof AfterSplashAgreePolicyRequest) {
            if (oneDayTrialShortcutEnable()) {
                ShortcutUtils.INSTANCE.addOneDayTrialShortcut(((AfterSplashAgreePolicyRequest) request).getContext());
            } else {
                ShortcutUtils.INSTANCE.setStableShortcuts(((AfterSplashAgreePolicyRequest) request).getContext());
            }
            CustomNpsPopupController.INSTANCE.init();
            AfterSplashAgreePolicyRequest afterSplashAgreePolicyRequest = (AfterSplashAgreePolicyRequest) request;
            enableDarkMode(afterSplashAgreePolicyRequest.getContext());
            afterSplashAgreePolicyRequest.getMethod().invoke();
        }
    }

    private final void enableDarkMode(Context context) {
        if (((UiModeManager) context.getSystemService(UiModeManager.class)).getNightMode() == 2) {
            new LogEventRequest(LogEvents.darkmode_enable_click, null, 2, null).post();
            AbtestUtils.INSTANCE.setAbtestMoreData("onetime_darkmode_ab", "condition_ok", "110453");
            if (CoinSPUtils.INSTANCE.getThemeType() == -100 && CoinAbTestUtils.INSTANCE.enableDarkMode()) {
                new LogEventRequest(LogEvents.darkmode_abopen_click, null, 2, null).post();
                CoinSPUtils.INSTANCE.saveThemeType(-1);
                ThemeUtils.INSTANCE.changeTheme(-1, context);
                return;
            }
            ThemeUtils.INSTANCE.changeTheme(1, context);
        }
    }

    private final boolean oneDayTrialShortcutEnable() {
        return !AppViewModel.INSTANCE.isVip() && (((Number) PersistData.INSTANCE.get(PersistKey.KEY_VIP_OPEN_COUNT, 0)).intValue() == 0) && (PersistData.INSTANCE.get(ShortcutConstants.ONE_DAY_FREE_SHORTCUT_EXPIRED_TIME, null) == null) && (AppViewModel.INSTANCE.getInstance().getLanguageCode() == LanguageCode.English);
    }

    private final void removeAllShortcuts(Context context) {
        try {
            List<ShortcutInfoCompat> shortcuts = ShortcutManagerCompat.getShortcuts(context, 2);
            Intrinsics.checkNotNullExpressionValue(shortcuts, "getShortcuts(...)");
            List<ShortcutInfoCompat> list = shortcuts;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ShortcutInfoCompat) it.next()).getId());
            }
            ShortcutManagerCompat.removeDynamicShortcuts(context, arrayList);
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }
}
