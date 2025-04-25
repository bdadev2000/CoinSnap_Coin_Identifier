package com.glority.base.routers.abtest;

import android.util.Log;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.abtest.UrlAbtest;
import com.glority.android.core.route.billing.QueryHasSubscribedRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.core.utils.device.CorePersistKey;
import com.glority.android.core.utils.mediaSource.MediaSourceUtils;
import com.glority.android.ui.base.LocaleManager;
import com.glority.base.storage.PersistKey;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.user.User;
import com.glority.utils.device.NetworkUtils;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ViewUtils;
import io.reactivex.Observable;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AbtestGetTagMapHandler.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00102\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0006\u0010\u000f\u001a\u00020\u0003R\u0014\u0010\u0007\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/glority/base/routers/abtest/AbtestGetTagMapHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "", "", "<init>", "()V", "url", "getUrl", "()Ljava/lang/String;", "execute", "request", "Lcom/glority/android/core/route/RouteRequest;", "appNewUser", "", "getResolutions", "Companion", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class AbtestGetTagMapHandler implements RouteHandler<Map<String, ? extends Object>> {
    public static final int $stable = 0;
    private static final int NEW_USER_DURATION = 3600000;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<String> languageGroup = CollectionsKt.listOf((Object[]) new String[]{"en", "pt", "es", "fr", "ru", "ja", "de", "zh", "ar", "it", "nl", "ko"});

    /* compiled from: AbtestGetTagMapHandler.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkUtils.NetworkType.values().length];
            try {
                iArr[NetworkUtils.NetworkType.NETWORK_ETHERNET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkUtils.NetworkType.NETWORK_WIFI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkUtils.NetworkType.NETWORK_5G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NetworkUtils.NetworkType.NETWORK_4G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NetworkUtils.NetworkType.NETWORK_3G.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NetworkUtils.NetworkType.NETWORK_2G.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[NetworkUtils.NetworkType.NETWORK_NO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Map<String, ? extends Object>> routeRequest) {
        RouteHandler.DefaultImpls.post(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlAbtest.INSTANCE.getURL_ABTEST_TAG_MAP();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0132  */
    @Override // com.glority.android.core.route.RouteHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, ? extends java.lang.Object> execute(com.glority.android.core.route.RouteRequest<java.util.Map<java.lang.String, ? extends java.lang.Object>> r9) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.base.routers.abtest.AbtestGetTagMapHandler.execute(com.glority.android.core.route.RouteRequest):java.util.Map");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        if (r3.getVip() == true) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (r3.getVip() == true) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        r3 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean appNewUser() {
        /*
            r5 = this;
            com.glority.android.core.utils.data.PersistData r0 = com.glority.android.core.utils.data.PersistData.INSTANCE
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.String r3 = "key_is_reinstall"
            java.lang.Object r0 = r0.get(r3, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            com.glority.base.viewmodel.AppViewModel$Companion r3 = com.glority.base.viewmodel.AppViewModel.INSTANCE     // Catch: java.lang.Throwable -> L30
            com.glority.base.viewmodel.AppViewModel r3 = r3.getInstance()     // Catch: java.lang.Throwable -> L30
            androidx.lifecycle.MutableLiveData r3 = r3.getUser()     // Catch: java.lang.Throwable -> L30
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L30
            com.glority.component.generatedAPI.kotlinAPI.user.User r3 = (com.glority.component.generatedAPI.kotlinAPI.user.User) r3     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L2e
            boolean r3 = r3.getVip()     // Catch: java.lang.Throwable -> L30
            if (r3 != r2) goto L2e
        L2c:
            r3 = r2
            goto L43
        L2e:
            r3 = r1
            goto L43
        L30:
            com.glority.android.core.utils.data.PersistData r3 = com.glority.android.core.utils.data.PersistData.INSTANCE
            java.lang.String r4 = "key_user"
            java.lang.Object r3 = r3.get(r4)
            com.glority.component.generatedAPI.kotlinAPI.user.User r3 = (com.glority.component.generatedAPI.kotlinAPI.user.User) r3
            if (r3 == 0) goto L2e
            boolean r3 = r3.getVip()
            if (r3 != r2) goto L2e
            goto L2c
        L43:
            com.glority.base.routers.abtest.AbtestGetTagMapHandler$Companion r4 = com.glority.base.routers.abtest.AbtestGetTagMapHandler.INSTANCE
            boolean r4 = r4.isNewUser()
            if (r4 != 0) goto L4d
            if (r0 == 0) goto L5c
        L4d:
            if (r3 != 0) goto L5c
            com.glority.base.viewmodel.AppViewModel$Companion r0 = com.glority.base.viewmodel.AppViewModel.INSTANCE
            com.glority.base.viewmodel.AppViewModel r0 = r0.getInstance()
            boolean r0 = r0.isVipInHistory()
            if (r0 != 0) goto L5c
            r1 = r2
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.base.routers.abtest.AbtestGetTagMapHandler.appNewUser():boolean");
    }

    public final String getResolutions() {
        return ViewUtils.getScreenHeight() + "x" + ViewUtils.getScreenWidth();
    }

    /* compiled from: AbtestGetTagMapHandler.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/glority/base/routers/abtest/AbtestGetTagMapHandler$Companion;", "", "<init>", "()V", "languageGroup", "", "", "NEW_USER_DURATION", "", "hasSubscribeRecord", "", "getHasSubscribeRecord", "()Ljava/lang/Boolean;", "getMediaSource", "isNewUser", "isInLanguageGroup", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Boolean getHasSubscribeRecord() {
            return new QueryHasSubscribedRequest().toResult();
        }

        public final String getMediaSource() {
            if (((Number) PersistData.INSTANCE.get(CorePersistKey.MEDIA_STORE_CONTROL, 0)).intValue() == 2) {
                return MediaSourceUtils.INSTANCE.getMediaSources();
            }
            return "";
        }

        public final boolean isNewUser() {
            try {
                User value = AppViewModel.INSTANCE.getInstance().getUser().getValue();
                if (value != null) {
                    return value.getUserId() == 0 || (System.currentTimeMillis() - value.getCreatedAt().getTime()) - ((Number) PersistData.INSTANCE.get(PersistKey.KEY_SERVER_CLIENT_TIME_OFFSET, 0L)).longValue() < 3600000;
                }
                Companion companion = AbtestGetTagMapHandler.INSTANCE;
                return true;
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
                return false;
            }
        }

        public final String isInLanguageGroup() {
            try {
                if (!AbtestGetTagMapHandler.languageGroup.contains(LocaleManager.getInstance().getLanguage())) {
                    return "false";
                }
                if (Intrinsics.areEqual(Locale.getDefault().getCountry(), "CN")) {
                    return "false";
                }
                return "true";
            } catch (Exception unused) {
                return "false";
            }
        }
    }
}
