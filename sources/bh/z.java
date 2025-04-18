package bh;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import kotlinx.serialization.Contextual;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;

/* loaded from: classes4.dex */
public final class z {
    public static final k Companion = new k(null);
    public static final String FILE_SCHEME = "file://";
    public static final String INCENTIVIZED_BODY_TEXT = "INCENTIVIZED_BODY_TEXT";
    public static final String INCENTIVIZED_CLOSE_TEXT = "INCENTIVIZED_CLOSE_TEXT";
    public static final String INCENTIVIZED_CONTINUE_TEXT = "INCENTIVIZED_CONTINUE_TEXT";
    public static final String INCENTIVIZED_TITLE_TEXT = "INCENTIVIZED_TITLE_TEXT";
    public static final String KEY_TEMPLATE = "template";
    public static final String TPAT_CLICK_COORDINATES_URLS = "video.clickCoordinates";
    private static final String UNKNOWN = "unknown";
    private com.vungle.ads.d adConfig;
    private com.vungle.ads.c0 adSize;
    private final List<n> ads;
    private File assetDirectory;
    private boolean assetsFullyDownloaded;
    private final j1 config;
    private Map<String, String> incentivizedTextSettings;
    private ConcurrentHashMap<String, String> mraidFiles;

    public z() {
        this(null, null, 3, null);
    }

    private final String complexReplace(String str, String str2, String str3) {
        String quote = Pattern.quote(str2);
        Intrinsics.checkNotNullExpressionValue(quote, "quote(oldValue)");
        return new Regex(quote).replace(str, valueOrEmpty(str3));
    }

    private final n getAd() {
        List<n> list = this.ads;
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        return list.get(0);
    }

    @Transient
    public static /* synthetic */ void getAdConfig$annotations() {
    }

    private final g getAdMarkup() {
        n ad2 = getAd();
        if (ad2 != null) {
            return ad2.getAdMarkup();
        }
        return null;
    }

    @Transient
    public static /* synthetic */ void getAdSize$annotations() {
    }

    @SerialName(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)
    private static /* synthetic */ void getAds$annotations() {
    }

    @Transient
    public static /* synthetic */ void getAssetDirectory$annotations() {
    }

    @SerialName("config")
    private static /* synthetic */ void getConfig$annotations() {
    }

    public static /* synthetic */ void getIncentivizedTextSettings$annotations() {
    }

    @Contextual
    private static /* synthetic */ void getMraidFiles$annotations() {
    }

    public static /* synthetic */ List getTpatUrls$default(z zVar, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        return zVar.getTpatUrls(str, str2, str3);
    }

    private final String valueOrEmpty(String str) {
        return str == null ? "" : str;
    }

    @JvmStatic
    public static final void write$Self(z self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z14 = false;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.ads != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            output.encodeNullableSerializableElement(serialDesc, 0, new ArrayListSerializer(l.INSTANCE), self.ads);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.config != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            output.encodeNullableSerializableElement(serialDesc, 1, h1.INSTANCE, self.config);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.mraidFiles, new ConcurrentHashMap())) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConcurrentHashMap.class);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            output.encodeSerializableElement(serialDesc, 2, new ContextualSerializer(orCreateKotlinClass, null, new KSerializer[]{stringSerializer, stringSerializer}), self.mraidFiles);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual(self.incentivizedTextSettings, new HashMap())) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
            output.encodeSerializableElement(serialDesc, 3, new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), self.incentivizedTextSettings);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.assetsFullyDownloaded) {
            z14 = true;
        }
        if (z14) {
            output.encodeBooleanElement(serialDesc, 4, self.assetsFullyDownloaded);
        }
    }

    public final g adUnit() {
        return getAdMarkup();
    }

    public final String appId() {
        g adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdvAppId();
        }
        return null;
    }

    public final j1 configExt() {
        return this.config;
    }

    public final JsonObject createMRAIDArgs() {
        Map<String, String> mRAIDArgsInMap = getMRAIDArgsInMap();
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        for (Map.Entry<String, String> entry : mRAIDArgsInMap.entrySet()) {
            JsonElementBuildersKt.put(jsonObjectBuilder, entry.getKey(), entry.getValue());
        }
        return jsonObjectBuilder.build();
    }

    public final String eventId() {
        g adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getId();
        }
        return null;
    }

    public final com.vungle.ads.d getAdConfig() {
        return this.adConfig;
    }

    public final com.vungle.ads.c0 getAdSize() {
        return this.adSize;
    }

    public final String getAdType() {
        g adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdType();
        }
        return null;
    }

    public final File getAssetDirectory() {
        return this.assetDirectory;
    }

    public final boolean getAssetsFullyDownloaded() {
        return this.assetsFullyDownloaded;
    }

    public final String getCreativeId() {
        String campaign;
        boolean z10;
        g adMarkup = getAdMarkup();
        String str = null;
        if (adMarkup != null && (campaign = adMarkup.getCampaign()) != null) {
            if (campaign.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                Object[] array = new Regex("\\|").split(campaign, 0).toArray(new String[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                String[] strArr = (String[]) array;
                if (strArr.length >= 2) {
                    str = strArr[1];
                }
            }
        }
        if (str == null) {
            return "unknown";
        }
        return str;
    }

    public final List<c> getDownloadableAssets(File dir) {
        q templateSettings;
        Map<String, j> cacheableReplacements;
        boolean z10;
        boolean z11;
        g adMarkup;
        String templateURL;
        Intrinsics.checkNotNullParameter(dir, "dir");
        this.assetDirectory = dir;
        ArrayList arrayList = new ArrayList();
        if (!isNativeTemplateType() && (adMarkup = getAdMarkup()) != null && (templateURL = adMarkup.getTemplateURL()) != null && com.vungle.ads.internal.util.n.INSTANCE.isValidUrl(templateURL)) {
            String filePath = new File(dir, "template").getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(filePath, "filePath");
            arrayList.add(new c("template", templateURL, filePath, a.ZIP, true));
        }
        g adMarkup2 = getAdMarkup();
        if (adMarkup2 != null && (templateSettings = adMarkup2.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (Map.Entry<String, j> entry : cacheableReplacements.entrySet()) {
                j value = entry.getValue();
                if (value.getUrl() != null) {
                    com.vungle.ads.internal.util.n nVar = com.vungle.ads.internal.util.n.INSTANCE;
                    if (nVar.isValidUrl(value.getUrl())) {
                        Boolean required = value.getRequired();
                        if (required != null) {
                            z10 = required.booleanValue();
                        } else {
                            z10 = false;
                        }
                        if (!isNativeTemplateType()) {
                            com.vungle.ads.internal.f0 f0Var = com.vungle.ads.internal.f0.INSTANCE;
                            if (f0Var.adLoadOptimizationEnabled()) {
                                if (!f0Var.isCacheableAssetsRequired()) {
                                    z11 = false;
                                } else {
                                    z11 = z10;
                                }
                                String filePath2 = new File(dir, nVar.guessFileName(value.getUrl(), value.getExtension())).getAbsolutePath();
                                String key = entry.getKey();
                                String url = value.getUrl();
                                Intrinsics.checkNotNullExpressionValue(filePath2, "filePath");
                                arrayList.add(new c(key, url, filePath2, a.ASSET, z11));
                            }
                        }
                        z11 = true;
                        String filePath22 = new File(dir, nVar.guessFileName(value.getUrl(), value.getExtension())).getAbsolutePath();
                        String key2 = entry.getKey();
                        String url2 = value.getUrl();
                        Intrinsics.checkNotNullExpressionValue(filePath22, "filePath");
                        arrayList.add(new c(key2, url2, filePath22, a.ASSET, z11));
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new y());
        }
        return arrayList;
    }

    public final int getExpiry() {
        Integer expiry;
        g adMarkup = getAdMarkup();
        if (adMarkup == null || (expiry = adMarkup.getExpiry()) == null) {
            return 0;
        }
        return expiry.intValue();
    }

    public final Map<String, String> getIncentivizedTextSettings() {
        return this.incentivizedTextSettings;
    }

    public final Map<String, String> getMRAIDArgsInMap() {
        q qVar;
        q templateSettings;
        Map<String, j> cacheableReplacements;
        q templateSettings2;
        Map<String, String> normalReplacements;
        g adMarkup = getAdMarkup();
        if (adMarkup != null) {
            qVar = adMarkup.getTemplateSettings();
        } else {
            qVar = null;
        }
        if (qVar != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            g adMarkup2 = getAdMarkup();
            if (adMarkup2 != null && (templateSettings2 = adMarkup2.getTemplateSettings()) != null && (normalReplacements = templateSettings2.getNormalReplacements()) != null) {
                linkedHashMap.putAll(normalReplacements);
            }
            g adMarkup3 = getAdMarkup();
            if (adMarkup3 != null && (templateSettings = adMarkup3.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
                for (Map.Entry<String, j> entry : cacheableReplacements.entrySet()) {
                    String url = entry.getValue().getUrl();
                    if (url != null) {
                        linkedHashMap.put(entry.getKey(), url);
                    }
                }
            }
            if (!this.mraidFiles.isEmpty()) {
                linkedHashMap.putAll(this.mraidFiles);
            }
            if (!this.incentivizedTextSettings.isEmpty()) {
                linkedHashMap.putAll(this.incentivizedTextSettings);
            }
            return linkedHashMap;
        }
        throw new IllegalArgumentException("Advertisement does not have MRAID Arguments!".toString());
    }

    public final int getShowCloseDelay(Boolean bool) {
        Integer showClose;
        Integer showCloseIncentivized;
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            g adMarkup = getAdMarkup();
            if (adMarkup == null || (showCloseIncentivized = adMarkup.getShowCloseIncentivized()) == null) {
                return 0;
            }
            return showCloseIncentivized.intValue() * 1000;
        }
        g adMarkup2 = getAdMarkup();
        if (adMarkup2 == null || (showClose = adMarkup2.getShowClose()) == null) {
            return 0;
        }
        return showClose.intValue() * 1000;
    }

    public final List<String> getTpatUrls(String event, String str, String str2) {
        boolean z10;
        List<String> list;
        ArrayList arrayList;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        int collectionSizeOrDefault3;
        int collectionSizeOrDefault4;
        Map<String, List<String>> tpat;
        Map<String, List<String>> tpat2;
        Intrinsics.checkNotNullParameter(event, "event");
        g adMarkup = getAdMarkup();
        boolean z11 = false;
        if (adMarkup != null && (tpat2 = adMarkup.getTpat()) != null && !tpat2.containsKey(event)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            com.vungle.ads.s.INSTANCE.logError$vungle_ads_release(128, vd.e.e("Invalid tpat key: ", event), placementId(), getCreativeId(), eventId());
            return null;
        }
        g adMarkup2 = getAdMarkup();
        if (adMarkup2 != null && (tpat = adMarkup2.getTpat()) != null) {
            list = tpat.get(event);
        } else {
            list = null;
        }
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z11 = true;
        }
        if (z11) {
            com.vungle.ads.s.INSTANCE.logError$vungle_ads_release(129, vd.e.e("Empty tpat key: ", event), placementId(), getCreativeId(), eventId());
            return null;
        }
        switch (event.hashCode()) {
            case -2125915830:
                if (event.equals("checkpoint.0")) {
                    List<String> list3 = list;
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
                    arrayList = new ArrayList(collectionSizeOrDefault);
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(complexReplace(complexReplace(complexReplace((String) it.next(), "{{{remote_play}}}", String.valueOf(!this.assetsFullyDownloaded)), "{{{carrier}}}", str), "{{{vol}}}", str2));
                    }
                    break;
                } else {
                    return list;
                }
            case -132489083:
                if (event.equals("ad.loadDuration")) {
                    List<String> list4 = list;
                    collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10);
                    arrayList = new ArrayList(collectionSizeOrDefault2);
                    Iterator<T> it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(complexReplace((String) it2.next(), "{{{time_dl}}}", str));
                    }
                    break;
                } else {
                    return list;
                }
            case 1516630125:
                if (event.equals("ad.close")) {
                    List<String> list5 = list;
                    collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10);
                    arrayList = new ArrayList(collectionSizeOrDefault3);
                    Iterator<T> it3 = list5.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(complexReplace(complexReplace((String) it3.next(), "{{{dur}}}", str), "{{{vol}}}", str2));
                    }
                    break;
                } else {
                    return list;
                }
            case 1940309120:
                if (event.equals("deeplink.click")) {
                    List<String> list6 = list;
                    collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10);
                    arrayList = new ArrayList(collectionSizeOrDefault4);
                    Iterator<T> it4 = list6.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(complexReplace((String) it4.next(), "{{{is_success}}}", str));
                    }
                    break;
                } else {
                    return list;
                }
            default:
                return list;
        }
        return arrayList;
    }

    public final List<String> getWinNotifications() {
        g adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getNotification();
        }
        return null;
    }

    public final boolean hasExpired() {
        Integer expiry;
        boolean z10;
        g adMarkup = getAdMarkup();
        if (adMarkup == null || (expiry = adMarkup.getExpiry()) == null) {
            return false;
        }
        if (expiry.intValue() < System.currentTimeMillis() / 1000) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public final boolean isClickCoordinatesTrackingEnabled() {
        Boolean clickCoordinatesEnabled;
        g adMarkup = getAdMarkup();
        if (adMarkup == null || (clickCoordinatesEnabled = adMarkup.getClickCoordinatesEnabled()) == null) {
            return false;
        }
        return clickCoordinatesEnabled.booleanValue();
    }

    public final boolean isCriticalAsset(String failingUrl) {
        q templateSettings;
        Map<String, j> cacheableReplacements;
        String str;
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        if (!isNativeTemplateType()) {
            g adMarkup = getAdMarkup();
            if (adMarkup != null) {
                str = adMarkup.getTemplateURL();
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str, failingUrl)) {
                return true;
            }
        }
        g adMarkup2 = getAdMarkup();
        if (adMarkup2 != null && (templateSettings = adMarkup2.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, j> entry : cacheableReplacements.entrySet()) {
                if (Intrinsics.areEqual(entry.getValue().getUrl(), failingUrl)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return !linkedHashMap.isEmpty();
        }
        return false;
    }

    public final boolean isNativeTemplateType() {
        g adMarkup = getAdMarkup();
        return Intrinsics.areEqual("native", adMarkup != null ? adMarkup.getTemplateType() : null);
    }

    public final boolean omEnabled() {
        u viewability;
        x om;
        Boolean isEnabled;
        g adMarkup = getAdMarkup();
        if (adMarkup == null || (viewability = adMarkup.getViewability()) == null || (om = viewability.getOm()) == null || (isEnabled = om.isEnabled()) == null) {
            return false;
        }
        return isEnabled.booleanValue();
    }

    public final String placementId() {
        n ad2 = getAd();
        if (ad2 != null) {
            return ad2.getPlacementReferenceId();
        }
        return null;
    }

    public final void setAdConfig(com.vungle.ads.d dVar) {
        this.adConfig = dVar;
    }

    public final void setAdSize(com.vungle.ads.c0 c0Var) {
        this.adSize = c0Var;
    }

    public final void setAssetFullyDownloaded() {
        this.assetsFullyDownloaded = true;
    }

    public final void setAssetsFullyDownloaded(boolean z10) {
        this.assetsFullyDownloaded = z10;
    }

    public final void setIncentivizedText(String title, String body, String keepWatching, String close) {
        boolean z10;
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(keepWatching, "keepWatching");
        Intrinsics.checkNotNullParameter(close, "close");
        boolean z13 = true;
        if (title.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.incentivizedTextSettings.put(INCENTIVIZED_TITLE_TEXT, title);
        }
        if (body.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.incentivizedTextSettings.put(INCENTIVIZED_BODY_TEXT, body);
        }
        if (keepWatching.length() > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CONTINUE_TEXT, keepWatching);
        }
        if (close.length() <= 0) {
            z13 = false;
        }
        if (z13) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CLOSE_TEXT, close);
        }
    }

    public final void setIncentivizedTextSettings(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.incentivizedTextSettings = map;
    }

    public final String templateType() {
        g adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getTemplateType();
        }
        return null;
    }

    public final synchronized void updateAdAssetPath(c cVar) {
        if (cVar != null) {
            if (!Intrinsics.areEqual("template", cVar.getAdIdentifier())) {
                File file = new File(cVar.getLocalPath());
                if (file.exists()) {
                    String adIdentifier = cVar.getAdIdentifier();
                    this.mraidFiles.put(adIdentifier, FILE_SCHEME + file.getPath());
                }
            }
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ z(int i10, @SerialName("ads") List list, @SerialName("config") j1 j1Var, @Contextual ConcurrentHashMap concurrentHashMap, Map map, boolean z10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i10, 0, d.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.ads = null;
        } else {
            this.ads = list;
        }
        if ((i10 & 2) == 0) {
            this.config = null;
        } else {
            this.config = j1Var;
        }
        if ((i10 & 4) == 0) {
            this.mraidFiles = new ConcurrentHashMap<>();
        } else {
            this.mraidFiles = concurrentHashMap;
        }
        if ((i10 & 8) == 0) {
            this.incentivizedTextSettings = new HashMap();
        } else {
            this.incentivizedTextSettings = map;
        }
        if ((i10 & 16) == 0) {
            this.assetsFullyDownloaded = false;
        } else {
            this.assetsFullyDownloaded = z10;
        }
        this.adConfig = null;
        this.adSize = null;
        this.assetDirectory = null;
    }

    public z(List<n> list, j1 j1Var) {
        this.ads = list;
        this.config = j1Var;
        this.mraidFiles = new ConcurrentHashMap<>();
        this.incentivizedTextSettings = new HashMap();
    }

    public /* synthetic */ z(List list, j1 j1Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : j1Var);
    }
}
