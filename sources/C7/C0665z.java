package c7;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.C2073d;
import com.vungle.ads.C2137s;
import e8.C2228c;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u7.AbstractC2818i;
import u7.AbstractC2821l;

/* renamed from: c7.z */
/* loaded from: classes3.dex */
public final class C0665z {
    public static final C0636k Companion = new C0636k(null);
    public static final String FILE_SCHEME = "file://";
    public static final String INCENTIVIZED_BODY_TEXT = "INCENTIVIZED_BODY_TEXT";
    public static final String INCENTIVIZED_CLOSE_TEXT = "INCENTIVIZED_CLOSE_TEXT";
    public static final String INCENTIVIZED_CONTINUE_TEXT = "INCENTIVIZED_CONTINUE_TEXT";
    public static final String INCENTIVIZED_TITLE_TEXT = "INCENTIVIZED_TITLE_TEXT";
    public static final String KEY_TEMPLATE = "template";
    public static final String TPAT_CLICK_COORDINATES_URLS = "video.clickCoordinates";
    private static final String UNKNOWN = "unknown";
    private C2073d adConfig;
    private com.vungle.ads.C adSize;
    private final List<C0642n> ads;
    private File assetDirectory;
    private boolean assetsFullyDownloaded;
    private final C0637k0 config;
    private Map<String, String> incentivizedTextSettings;
    private ConcurrentHashMap<String, String> mraidFiles;

    public C0665z() {
        this(null, null, 3, null);
    }

    private final String complexReplace(String str, String str2, String str3) {
        String quote = Pattern.quote(str2);
        G7.j.d(quote, "quote(oldValue)");
        Pattern compile = Pattern.compile(quote);
        G7.j.d(compile, "compile(...)");
        String valueOrEmpty = valueOrEmpty(str3);
        G7.j.e(str, "input");
        G7.j.e(valueOrEmpty, "replacement");
        String replaceAll = compile.matcher(str).replaceAll(valueOrEmpty);
        G7.j.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    private final C0642n getAd() {
        List<C0642n> list = this.ads;
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        return list.get(0);
    }

    private final C0628g getAdMarkup() {
        C0642n ad = getAd();
        if (ad != null) {
            return ad.getAdMarkup();
        }
        return null;
    }

    public static /* synthetic */ List getTpatUrls$default(C0665z c0665z, String str, String str2, String str3, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            str2 = null;
        }
        if ((i9 & 4) != 0) {
            str3 = null;
        }
        return c0665z.getTpatUrls(str, str2, str3);
    }

    private final String valueOrEmpty(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    public static final void write$Self(C0665z c0665z, d8.b bVar, c8.g gVar) {
        G7.j.e(c0665z, "self");
        if (Q7.n0.u(bVar, "output", gVar, "serialDesc", gVar) || c0665z.ads != null) {
            bVar.u(gVar, 0, new C2228c(C0638l.INSTANCE, 0), c0665z.ads);
        }
        if (bVar.o(gVar) || c0665z.config != null) {
            bVar.u(gVar, 1, C0633i0.INSTANCE, c0665z.config);
        }
        if (bVar.o(gVar) || !G7.j.a(c0665z.mraidFiles, new ConcurrentHashMap())) {
            G7.e a6 = G7.s.a(ConcurrentHashMap.class);
            e8.k0 k0Var = e8.k0.f20172a;
            bVar.m(gVar, 2, new a8.a(a6, new a8.b[]{k0Var, k0Var}), c0665z.mraidFiles);
        }
        if (bVar.o(gVar) || !G7.j.a(c0665z.incentivizedTextSettings, new HashMap())) {
            e8.k0 k0Var2 = e8.k0.f20172a;
            bVar.m(gVar, 3, new e8.F(k0Var2, k0Var2, 1), c0665z.incentivizedTextSettings);
        }
        if (bVar.o(gVar) || c0665z.assetsFullyDownloaded) {
            bVar.v(gVar, 4, c0665z.assetsFullyDownloaded);
        }
    }

    public final C0628g adUnit() {
        return getAdMarkup();
    }

    public final String appId() {
        C0628g adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdvAppId();
        }
        return null;
    }

    public final C0637k0 configExt() {
        return this.config;
    }

    public final f8.v createMRAIDArgs() {
        Map<String, String> mRAIDArgsInMap = getMRAIDArgsInMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : mRAIDArgsInMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            G7.j.e(key, "key");
        }
        return new f8.v(linkedHashMap);
    }

    public final String eventId() {
        C0628g adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getId();
        }
        return null;
    }

    public final C2073d getAdConfig() {
        return this.adConfig;
    }

    public final com.vungle.ads.C getAdSize() {
        return this.adSize;
    }

    public final String getAdType() {
        C0628g adMarkup = getAdMarkup();
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
        List list;
        C0628g adMarkup = getAdMarkup();
        String str = null;
        if (adMarkup != null && (campaign = adMarkup.getCampaign()) != null && campaign.length() > 0) {
            Pattern compile = Pattern.compile("\\|");
            G7.j.d(compile, "compile(...)");
            O7.g.S(0);
            Matcher matcher = compile.matcher(campaign);
            if (!matcher.find()) {
                list = android.support.v4.media.session.a.w(campaign.toString());
            } else {
                ArrayList arrayList = new ArrayList(10);
                int i9 = 0;
                do {
                    arrayList.add(campaign.subSequence(i9, matcher.start()).toString());
                    i9 = matcher.end();
                } while (matcher.find());
                arrayList.add(campaign.subSequence(i9, campaign.length()).toString());
                list = arrayList;
            }
            Object[] array = list.toArray(new String[0]);
            G7.j.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            if (strArr.length >= 2) {
                str = strArr[1];
            }
        }
        if (str == null) {
            return "unknown";
        }
        return str;
    }

    public final List<C0620c> getDownloadableAssets(File file) {
        C0648q templateSettings;
        Map<String, C0634j> cacheableReplacements;
        boolean z8;
        boolean z9;
        C0628g adMarkup;
        String templateURL;
        G7.j.e(file, "dir");
        this.assetDirectory = file;
        ArrayList arrayList = new ArrayList();
        if (!isNativeTemplateType() && (adMarkup = getAdMarkup()) != null && (templateURL = adMarkup.getTemplateURL()) != null && com.vungle.ads.internal.util.n.INSTANCE.isValidUrl(templateURL)) {
            String absolutePath = new File(file, "template").getAbsolutePath();
            G7.j.d(absolutePath, "filePath");
            arrayList.add(new C0620c("template", templateURL, absolutePath, EnumC0616a.ZIP, true));
        }
        C0628g adMarkup2 = getAdMarkup();
        if (adMarkup2 != null && (templateSettings = adMarkup2.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (Map.Entry<String, C0634j> entry : cacheableReplacements.entrySet()) {
                C0634j value = entry.getValue();
                if (value.getUrl() != null) {
                    com.vungle.ads.internal.util.n nVar = com.vungle.ads.internal.util.n.INSTANCE;
                    if (nVar.isValidUrl(value.getUrl())) {
                        Boolean required = value.getRequired();
                        if (required != null) {
                            z8 = required.booleanValue();
                        } else {
                            z8 = false;
                        }
                        if (!isNativeTemplateType()) {
                            com.vungle.ads.internal.F f9 = com.vungle.ads.internal.F.INSTANCE;
                            if (f9.adLoadOptimizationEnabled()) {
                                if (!f9.isCacheableAssetsRequired()) {
                                    z9 = false;
                                } else {
                                    z9 = z8;
                                }
                                String absolutePath2 = new File(file, nVar.guessFileName(value.getUrl(), value.getExtension())).getAbsolutePath();
                                String key = entry.getKey();
                                String url = value.getUrl();
                                G7.j.d(absolutePath2, "filePath");
                                arrayList.add(new C0620c(key, url, absolutePath2, EnumC0616a.ASSET, z9));
                            }
                        }
                        z9 = true;
                        String absolutePath22 = new File(file, nVar.guessFileName(value.getUrl(), value.getExtension())).getAbsolutePath();
                        String key2 = entry.getKey();
                        String url2 = value.getUrl();
                        G7.j.d(absolutePath22, "filePath");
                        arrayList.add(new C0620c(key2, url2, absolutePath22, EnumC0616a.ASSET, z9));
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            AbstractC2821l.F(arrayList, new C0663y());
        }
        return arrayList;
    }

    public final int getExpiry() {
        Integer expiry;
        C0628g adMarkup = getAdMarkup();
        if (adMarkup != null && (expiry = adMarkup.getExpiry()) != null) {
            return expiry.intValue();
        }
        return 0;
    }

    public final Map<String, String> getIncentivizedTextSettings() {
        return this.incentivizedTextSettings;
    }

    public final Map<String, String> getMRAIDArgsInMap() {
        C0648q c0648q;
        C0648q templateSettings;
        Map<String, C0634j> cacheableReplacements;
        C0648q templateSettings2;
        Map<String, String> normalReplacements;
        C0628g adMarkup = getAdMarkup();
        if (adMarkup != null) {
            c0648q = adMarkup.getTemplateSettings();
        } else {
            c0648q = null;
        }
        if (c0648q != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C0628g adMarkup2 = getAdMarkup();
            if (adMarkup2 != null && (templateSettings2 = adMarkup2.getTemplateSettings()) != null && (normalReplacements = templateSettings2.getNormalReplacements()) != null) {
                linkedHashMap.putAll(normalReplacements);
            }
            C0628g adMarkup3 = getAdMarkup();
            if (adMarkup3 != null && (templateSettings = adMarkup3.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
                for (Map.Entry<String, C0634j> entry : cacheableReplacements.entrySet()) {
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
        if (G7.j.a(bool, Boolean.TRUE)) {
            C0628g adMarkup = getAdMarkup();
            if (adMarkup == null || (showCloseIncentivized = adMarkup.getShowCloseIncentivized()) == null) {
                return 0;
            }
            return showCloseIncentivized.intValue() * 1000;
        }
        C0628g adMarkup2 = getAdMarkup();
        if (adMarkup2 == null || (showClose = adMarkup2.getShowClose()) == null) {
            return 0;
        }
        return showClose.intValue() * 1000;
    }

    public final List<String> getTpatUrls(String str, String str2, String str3) {
        List<String> list;
        ArrayList arrayList;
        Map<String, List<String>> tpat;
        Map<String, List<String>> tpat2;
        G7.j.e(str, NotificationCompat.CATEGORY_EVENT);
        C0628g adMarkup = getAdMarkup();
        if (adMarkup != null && (tpat2 = adMarkup.getTpat()) != null && !tpat2.containsKey(str)) {
            C2137s.INSTANCE.logError$vungle_ads_release(128, "Invalid tpat key: ".concat(str), placementId(), getCreativeId(), eventId());
            return null;
        }
        C0628g adMarkup2 = getAdMarkup();
        if (adMarkup2 != null && (tpat = adMarkup2.getTpat()) != null) {
            list = tpat.get(str);
        } else {
            list = null;
        }
        List<String> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            switch (str.hashCode()) {
                case -2125915830:
                    if (str.equals("checkpoint.0")) {
                        List<String> list3 = list;
                        arrayList = new ArrayList(AbstractC2818i.E(list3, 10));
                        Iterator<T> it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(complexReplace(complexReplace(complexReplace((String) it.next(), "{{{remote_play}}}", String.valueOf(!this.assetsFullyDownloaded)), "{{{carrier}}}", str2), "{{{vol}}}", str3));
                        }
                        break;
                    } else {
                        return list;
                    }
                case -132489083:
                    if (str.equals("ad.loadDuration")) {
                        List<String> list4 = list;
                        arrayList = new ArrayList(AbstractC2818i.E(list4, 10));
                        Iterator<T> it2 = list4.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(complexReplace((String) it2.next(), "{{{time_dl}}}", str2));
                        }
                        break;
                    } else {
                        return list;
                    }
                case 1516630125:
                    if (str.equals("ad.close")) {
                        List<String> list5 = list;
                        arrayList = new ArrayList(AbstractC2818i.E(list5, 10));
                        Iterator<T> it3 = list5.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(complexReplace(complexReplace((String) it3.next(), "{{{dur}}}", str2), "{{{vol}}}", str3));
                        }
                        break;
                    } else {
                        return list;
                    }
                case 1940309120:
                    if (str.equals("deeplink.click")) {
                        List<String> list6 = list;
                        arrayList = new ArrayList(AbstractC2818i.E(list6, 10));
                        Iterator<T> it4 = list6.iterator();
                        while (it4.hasNext()) {
                            arrayList.add(complexReplace((String) it4.next(), "{{{is_success}}}", str2));
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
        C2137s.INSTANCE.logError$vungle_ads_release(129, "Empty tpat key: ".concat(str), placementId(), getCreativeId(), eventId());
        return null;
    }

    public final List<String> getWinNotifications() {
        C0628g adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getNotification();
        }
        return null;
    }

    public final boolean hasExpired() {
        Integer expiry;
        C0628g adMarkup = getAdMarkup();
        if (adMarkup == null || (expiry = adMarkup.getExpiry()) == null || expiry.intValue() >= System.currentTimeMillis() / 1000) {
            return false;
        }
        return true;
    }

    public final boolean isClickCoordinatesTrackingEnabled() {
        Boolean clickCoordinatesEnabled;
        C0628g adMarkup = getAdMarkup();
        if (adMarkup != null && (clickCoordinatesEnabled = adMarkup.getClickCoordinatesEnabled()) != null) {
            return clickCoordinatesEnabled.booleanValue();
        }
        return false;
    }

    public final boolean isCriticalAsset(String str) {
        C0648q templateSettings;
        Map<String, C0634j> cacheableReplacements;
        String str2;
        G7.j.e(str, "failingUrl");
        if (!isNativeTemplateType()) {
            C0628g adMarkup = getAdMarkup();
            if (adMarkup != null) {
                str2 = adMarkup.getTemplateURL();
            } else {
                str2 = null;
            }
            if (G7.j.a(str2, str)) {
                return true;
            }
        }
        C0628g adMarkup2 = getAdMarkup();
        if (adMarkup2 != null && (templateSettings = adMarkup2.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, C0634j> entry : cacheableReplacements.entrySet()) {
                if (G7.j.a(entry.getValue().getUrl(), str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return !linkedHashMap.isEmpty();
        }
        return false;
    }

    public final boolean isNativeTemplateType() {
        String str;
        C0628g adMarkup = getAdMarkup();
        if (adMarkup != null) {
            str = adMarkup.getTemplateType();
        } else {
            str = null;
        }
        return "native".equals(str);
    }

    public final boolean omEnabled() {
        C0655u viewability;
        C0661x om;
        Boolean isEnabled;
        C0628g adMarkup = getAdMarkup();
        if (adMarkup != null && (viewability = adMarkup.getViewability()) != null && (om = viewability.getOm()) != null && (isEnabled = om.isEnabled()) != null) {
            return isEnabled.booleanValue();
        }
        return false;
    }

    public final String placementId() {
        C0642n ad = getAd();
        if (ad != null) {
            return ad.getPlacementReferenceId();
        }
        return null;
    }

    public final void setAdConfig(C2073d c2073d) {
        this.adConfig = c2073d;
    }

    public final void setAdSize(com.vungle.ads.C c9) {
        this.adSize = c9;
    }

    public final void setAssetFullyDownloaded() {
        this.assetsFullyDownloaded = true;
    }

    public final void setAssetsFullyDownloaded(boolean z8) {
        this.assetsFullyDownloaded = z8;
    }

    public final void setIncentivizedText(String str, String str2, String str3, String str4) {
        G7.j.e(str, CampaignEx.JSON_KEY_TITLE);
        G7.j.e(str2, TtmlNode.TAG_BODY);
        G7.j.e(str3, "keepWatching");
        G7.j.e(str4, "close");
        if (str.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_TITLE_TEXT, str);
        }
        if (str2.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_BODY_TEXT, str2);
        }
        if (str3.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CONTINUE_TEXT, str3);
        }
        if (str4.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CLOSE_TEXT, str4);
        }
    }

    public final void setIncentivizedTextSettings(Map<String, String> map) {
        G7.j.e(map, "<set-?>");
        this.incentivizedTextSettings = map;
    }

    public final String templateType() {
        C0628g adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getTemplateType();
        }
        return null;
    }

    public final synchronized void updateAdAssetPath(C0620c c0620c) {
        if (c0620c != null) {
            if (!"template".equals(c0620c.getAdIdentifier())) {
                File file = new File(c0620c.getLocalPath());
                if (file.exists()) {
                    String adIdentifier = c0620c.getAdIdentifier();
                    this.mraidFiles.put(adIdentifier, FILE_SCHEME + file.getPath());
                }
            }
        }
    }

    public /* synthetic */ C0665z(int i9, List list, C0637k0 c0637k0, ConcurrentHashMap concurrentHashMap, Map map, boolean z8, e8.g0 g0Var) {
        if ((i9 & 1) == 0) {
            this.ads = null;
        } else {
            this.ads = list;
        }
        if ((i9 & 2) == 0) {
            this.config = null;
        } else {
            this.config = c0637k0;
        }
        if ((i9 & 4) == 0) {
            this.mraidFiles = new ConcurrentHashMap<>();
        } else {
            this.mraidFiles = concurrentHashMap;
        }
        if ((i9 & 8) == 0) {
            this.incentivizedTextSettings = new HashMap();
        } else {
            this.incentivizedTextSettings = map;
        }
        if ((i9 & 16) == 0) {
            this.assetsFullyDownloaded = false;
        } else {
            this.assetsFullyDownloaded = z8;
        }
        this.adConfig = null;
        this.adSize = null;
        this.assetDirectory = null;
    }

    public C0665z(List<C0642n> list, C0637k0 c0637k0) {
        this.ads = list;
        this.config = c0637k0;
        this.mraidFiles = new ConcurrentHashMap<>();
        this.incentivizedTextSettings = new HashMap();
    }

    public /* synthetic */ C0665z(List list, C0637k0 c0637k0, int i9, G7.f fVar) {
        this((i9 & 1) != 0 ? null : list, (i9 & 2) != 0 ? null : c0637k0);
    }

    public static /* synthetic */ void getAdConfig$annotations() {
    }

    public static /* synthetic */ void getAdSize$annotations() {
    }

    private static /* synthetic */ void getAds$annotations() {
    }

    public static /* synthetic */ void getAssetDirectory$annotations() {
    }

    private static /* synthetic */ void getConfig$annotations() {
    }

    public static /* synthetic */ void getIncentivizedTextSettings$annotations() {
    }

    private static /* synthetic */ void getMraidFiles$annotations() {
    }
}
