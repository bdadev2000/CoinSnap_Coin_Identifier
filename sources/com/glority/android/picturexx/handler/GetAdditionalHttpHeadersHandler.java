package com.glority.android.picturexx.handler;

import android.util.Log;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.network.GetAdditionalHttpHeadersRequest;
import com.glority.android.core.route.network.UrlNetwork;
import com.glority.base.abtest.CoinAbTestUtils;
import com.glority.base.utils.AbTestUtil;
import com.glority.component.generatedAPI.kotlinAPI.cms.GetCmsNameMessage;
import com.glority.component.generatedAPI.kotlinAPI.item.GetItemDetailMessage;
import com.glority.utils.stability.LogUtils;
import com.picturecoin.generatedAPI.kotlinAPI.collection.SaveCollectionMessage;
import com.picturecoin.generatedAPI.kotlinAPI.recognize.RecognizeGradeMessage;
import com.picturecoin.generatedAPI.kotlinAPI.recognize.RecognizeNewMessage;
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GetAdditionalHttpHeadersHandler.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0005\u0018\u0000 \u00132\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u001a\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u000bH\u0016J$\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000fH\u0002J$\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000fH\u0002J$\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000fH\u0002J$\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000fH\u0002R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/glority/android/picturexx/handler/GetAdditionalHttpHeadersHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "", "<init>", "()V", "url", "getUrl", "()Ljava/lang/String;", "execute", "request", "Lcom/glority/android/core/route/RouteRequest;", "putRecognizeDetailHeadersIfNeeded", "", "headers", "", "putPriceABHeadersIfNeeded", "putEngineABHeadersIfNeeded", "putCollectionABHeadersIfNeeded", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class GetAdditionalHttpHeadersHandler implements RouteHandler<Map<String, ? extends String>> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<String> cmsUrl = CollectionsKt.listOf((Object[]) new String[]{RecognizeNewMessage.INSTANCE.getApi(), GetItemDetailMessage.INSTANCE.getApi(), GetCmsNameMessage.INSTANCE.getApi()});
    private static final List<String> priceABUrl = CollectionsKt.listOf((Object[]) new String[]{RecognizeNewMessage.INSTANCE.getApi(), GetItemDetailMessage.INSTANCE.getApi(), GetCmsNameMessage.INSTANCE.getApi(), RecognizeGradeMessage.INSTANCE.getApi()});
    private static final List<String> engineAbUrl = CollectionsKt.listOf((Object[]) new String[]{RecognizeNewMessage.INSTANCE.getApi(), RecognizeGradeMessage.INSTANCE.getApi()});
    private static final List<String> collectionAbUrl = CollectionsKt.listOf(SaveCollectionMessage.INSTANCE.getApi());

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Map<String, ? extends String>> routeRequest) {
        RouteHandler.DefaultImpls.post(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlNetwork.INSTANCE.getURL_GET_ADDITIONAL_HTTP_HEADERS();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public Map<String, ? extends String> execute(RouteRequest<Map<String, ? extends String>> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (!(request instanceof GetAdditionalHttpHeadersRequest)) {
            return null;
        }
        String path = ((GetAdditionalHttpHeadersRequest) request).getUrl().getPath();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Intrinsics.checkNotNull(path);
        putRecognizeDetailHeadersIfNeeded(path, linkedHashMap);
        putPriceABHeadersIfNeeded(path, linkedHashMap);
        putEngineABHeadersIfNeeded(path, linkedHashMap);
        putCollectionABHeadersIfNeeded(path, linkedHashMap);
        return linkedHashMap;
    }

    private final void putRecognizeDetailHeadersIfNeeded(String url, Map<String, String> headers) {
        Object obj;
        Iterator<T> it = cmsUrl.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (StringsKt.contains$default((CharSequence) url, (CharSequence) obj, false, 2, (Object) null)) {
                    break;
                }
            }
        }
        if (obj != null || (StringsKt.contains$default((CharSequence) url, (CharSequence) "get_static_url", false, 2, (Object) null) && AbTestUtil.INSTANCE.getCmsH5VariableData() != null)) {
            String cmsH5VariableData = AbTestUtil.INSTANCE.getCmsH5VariableData();
            if (cmsH5VariableData == null) {
                String str = CoinAbTestUtils.INSTANCE.enableV4H5() ? "name_h5=v4" : null;
                cmsH5VariableData = str == null ? "name_h5=v3" : str;
            }
            headers.put("ABTESTING-CMS", cmsH5VariableData);
        }
    }

    private final void putPriceABHeadersIfNeeded(String url, Map<String, String> headers) {
        Object obj;
        Iterator<T> it = priceABUrl.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (StringsKt.contains$default((CharSequence) url, (CharSequence) next, false, 2, (Object) null)) {
                obj = next;
                break;
            }
        }
        if (obj == null) {
            return;
        }
        String priceABVariableData = CoinAbTestUtils.INSTANCE.getPriceABVariableData();
        String str = priceABVariableData;
        if (str == null || str.length() == 0) {
            return;
        }
        headers.put("COIN-PRICE-VERSION-DATA", priceABVariableData);
    }

    private final void putEngineABHeadersIfNeeded(String url, Map<String, String> headers) {
        Object obj;
        Iterator<T> it = engineAbUrl.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (StringsKt.contains$default((CharSequence) url, (CharSequence) next, false, 2, (Object) null)) {
                obj = next;
                break;
            }
        }
        if (obj == null) {
            return;
        }
        String engineABVariableData = CoinAbTestUtils.INSTANCE.getEngineABVariableData();
        String str = engineABVariableData;
        if (str != null && str.length() != 0) {
            String upperCase = "engine-abtesting-coin-categorywithsimilar-global".toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            headers.put(upperCase, engineABVariableData);
        }
        try {
            HashMap<String, String> engineAbMap = CoinAbTestUtils.INSTANCE.getEngineAbMap();
            if (engineAbMap != null) {
                headers.putAll(engineAbMap);
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    private final void putCollectionABHeadersIfNeeded(String url, Map<String, String> headers) {
        Object obj;
        Iterator<T> it = collectionAbUrl.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (StringsKt.contains$default((CharSequence) url, (CharSequence) next, false, 2, (Object) null)) {
                obj = next;
                break;
            }
        }
        if (obj == null) {
            return;
        }
        String h5PriceABVariable = CoinAbTestUtils.INSTANCE.getH5PriceABVariable();
        String str = h5PriceABVariable;
        if (str == null || str.length() == 0) {
            return;
        }
        headers.put("COIN-PRICE-VERSION", h5PriceABVariable);
    }

    /* compiled from: GetAdditionalHttpHeadersHandler.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/glority/android/picturexx/handler/GetAdditionalHttpHeadersHandler$Companion;", "", "<init>", "()V", "cmsUrl", "", "", "getCmsUrl", "()Ljava/util/List;", "priceABUrl", "getPriceABUrl", "engineAbUrl", "getEngineAbUrl", "collectionAbUrl", "getCollectionAbUrl", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<String> getCmsUrl() {
            return GetAdditionalHttpHeadersHandler.cmsUrl;
        }

        public final List<String> getPriceABUrl() {
            return GetAdditionalHttpHeadersHandler.priceABUrl;
        }

        public final List<String> getEngineAbUrl() {
            return GetAdditionalHttpHeadersHandler.engineAbUrl;
        }

        public final List<String> getCollectionAbUrl() {
            return GetAdditionalHttpHeadersHandler.collectionAbUrl;
        }
    }
}
