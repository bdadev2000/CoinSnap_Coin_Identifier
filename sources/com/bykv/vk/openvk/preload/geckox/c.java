package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import java.io.File;
import java.io.InputStream;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    static File f13224a;
    static Context b;

    /* renamed from: c, reason: collision with root package name */
    static String f13225c;

    /* renamed from: g, reason: collision with root package name */
    private static final Set<String> f13226g = new HashSet(Arrays.asList("js", "css", "html", "ico", "jpeg", "jpg", "png", "gif", "woff", "svg", "ttf", "woff2", "webp", "otf", "sfnt"));

    /* renamed from: d, reason: collision with root package name */
    INetWork f13227d;

    /* renamed from: e, reason: collision with root package name */
    private Map.Entry<String, JSONObject> f13228e;

    /* renamed from: f, reason: collision with root package name */
    private Map.Entry<String, JSONObject> f13229f;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static c f13230a = new c(0);
    }

    public /* synthetic */ c(byte b8) {
        this();
    }

    public static c a(Context context) {
        b = context;
        if (f13224a == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(b.getCacheDir());
            f13224a = new File(AbstractC2914a.h(sb, File.separator, "gecko"));
        }
        return a.f13230a;
    }

    private static String b(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf("?");
        return indexOf == -1 ? str : str.substring(0, indexOf);
    }

    private void c(String str) {
        try {
            if (this.f13227d != null && !TextUtils.isEmpty(str)) {
                this.f13227d.syncDoGet(str);
            }
        } catch (Throwable unused) {
        }
    }

    private c() {
    }

    public static com.bykv.vk.openvk.preload.falconx.loader.a b() {
        try {
            return new com.bykv.vk.openvk.preload.falconx.loader.a(b, "cca47107bfcbdb211d88f3385aeede40", f13224a);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static c a() {
        return a.f13230a;
    }

    public static void a(String str) {
        f13225c = str;
    }

    private JSONObject a(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                Map.Entry<String, JSONObject> entry = this.f13228e;
                if (entry == null || !str.equals(entry.getKey())) {
                    String a6 = com.bykv.vk.openvk.preload.geckox.utils.c.a(new com.bykv.vk.openvk.preload.falconx.loader.a(b, "cca47107bfcbdb211d88f3385aeede40", f13224a).getInputStream(str.concat("/manifest.json")));
                    if (TextUtils.isEmpty(a6)) {
                        return null;
                    }
                    this.f13228e = new AbstractMap.SimpleEntry(str, new JSONObject(a6));
                }
                Map.Entry<String, JSONObject> entry2 = this.f13229f;
                if (entry2 == null || !str.equals(entry2.getKey())) {
                    String a9 = com.bykv.vk.openvk.preload.geckox.utils.c.a(new com.bykv.vk.openvk.preload.falconx.loader.a(b, "cca47107bfcbdb211d88f3385aeede40", f13224a).getInputStream(str.concat("/md5_url_map.json")));
                    if (TextUtils.isEmpty(a9)) {
                        return null;
                    }
                    this.f13229f = new AbstractMap.SimpleEntry(str, new JSONObject(a9));
                }
                JSONObject value = this.f13228e.getValue();
                JSONObject value2 = this.f13229f.getValue();
                String a10 = a(str2, value2);
                if (value.has(a10)) {
                    JSONObject jSONObject = value.getJSONObject(a10);
                    a(value, a10, str2);
                    return jSONObject;
                }
                String b8 = b(str2);
                if (b8 == null) {
                    return null;
                }
                String a11 = a(b8, value2);
                if (value.has(a11)) {
                    JSONObject jSONObject2 = value.getJSONObject(a11);
                    a(value, a11, str2);
                    return jSONObject2;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static String a(String str, JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject(str).getString("md5");
        } catch (Throwable unused) {
            return "";
        }
    }

    private void a(JSONObject jSONObject, String str, String str2) {
        try {
            if ("once".equals(jSONObject.getJSONObject(str).optJSONObject("cacheStrategy").optString("hitStrategy"))) {
                jSONObject.remove(str);
                c(str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(ILoader iLoader) {
        if (iLoader != null) {
            try {
                iLoader.release();
            } catch (Throwable unused) {
            }
        }
    }

    public final WebResourceResponseModel a(ILoader iLoader, String str, String str2) {
        String substring;
        try {
            if (iLoader == null) {
                return new WebResourceResponseModel(-1, null);
            }
            if (!TextUtils.isEmpty(str2) && !str2.matches("^https?:\\/\\/www\\.google-analytics\\.com/(?:ga|urchin|analytics)\\.js") && !str2.matches("^https?:\\/\\/www\\.googletagmanager\\.com\\/(gtag\\/js|gtm\\.js)") && !str2.matches("^https?:\\/\\/analytics\\.tiktok\\.com\\/i18n\\/pixel") && !str2.matches("https?:\\/\\/connect\\.facebook\\.net\\/(.*)\\/fbevents\\.js") && !str2.matches("https?:\\/\\/mc\\.yandex\\.ru\\/") && !str2.contains("jsonp") && !str2.contains("Callback") && !str2.contains("analytics.tiktok.com/i18n/pixel") && !str2.contains("google-analytics.com/analytics") && !str2.contains("connect.facebook.net") && !str2.contains("www.googletagmanager.com")) {
                JSONObject a6 = a(str, str2);
                Set<String> set = f13226g;
                String b8 = b(str2);
                int lastIndexOf = b8.lastIndexOf(".");
                if (lastIndexOf == -1) {
                    substring = "";
                } else {
                    substring = b8.substring(lastIndexOf + 1);
                }
                int i9 = set.contains(substring) ? 2 : -1;
                if (a6 == null) {
                    return new WebResourceResponseModel(i9, null);
                }
                String optString = a6.optString("fileName", null);
                if (optString == null) {
                    return new WebResourceResponseModel(i9, null);
                }
                JSONObject jSONObject = a6.has("respHeader") ? a6.getJSONObject("respHeader") : null;
                if (jSONObject == null) {
                    return new WebResourceResponseModel(i9, null);
                }
                String str3 = str + File.separator + optString;
                InputStream inputStream = !iLoader.exist(str3) ? null : iLoader.getInputStream(str3);
                if (inputStream == null) {
                    return new WebResourceResponseModel(i9, null);
                }
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
                return new WebResourceResponseModel(i9, com.bykv.vk.openvk.preload.falconx.a.a.a(inputStream, hashMap));
            }
            return new WebResourceResponseModel(1, null);
        } catch (Throwable unused) {
            return new WebResourceResponseModel(-1, null);
        }
    }

    public static int a(ILoader iLoader, String str) {
        if (iLoader == null || str == null) {
            return 0;
        }
        try {
            com.bykv.vk.openvk.preload.falconx.loader.a aVar = new com.bykv.vk.openvk.preload.falconx.loader.a(b, "cca47107bfcbdb211d88f3385aeede40", f13224a);
            String str2 = str + File.separator;
            if (!aVar.b.get()) {
                com.bykv.vk.openvk.preload.geckox.f.b bVar = aVar.f13162a;
                if (!bVar.b.get()) {
                    if (!TextUtils.isEmpty(str2)) {
                        return bVar.a(str2.trim()).b(str2);
                    }
                    throw new RuntimeException("relativePath empty");
                }
                throw new RuntimeException("released");
            }
            throw new RuntimeException("released!");
        } catch (Throwable unused) {
            return 0;
        }
    }
}
