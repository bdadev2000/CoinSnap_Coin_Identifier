package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import java.io.File;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import vd.e;

/* loaded from: classes.dex */
public final class c {
    static File a;

    /* renamed from: b, reason: collision with root package name */
    static Context f10053b;

    /* renamed from: c, reason: collision with root package name */
    static String f10054c;

    /* renamed from: g, reason: collision with root package name */
    private static final Set<String> f10055g = new HashSet(Arrays.asList("js", "css", "html", "ico", "jpeg", "jpg", "png", "gif", "woff", "svg", "ttf", "woff2", "webp", "otf", "sfnt"));

    /* renamed from: d, reason: collision with root package name */
    INetWork f10056d;

    /* renamed from: e, reason: collision with root package name */
    private Map.Entry<String, JSONObject> f10057e;

    /* renamed from: f, reason: collision with root package name */
    private Map.Entry<String, JSONObject> f10058f;

    /* loaded from: classes.dex */
    public static class a {
        private static c a = new c(0);
    }

    public /* synthetic */ c(byte b3) {
        this();
    }

    public static c a(Context context) {
        f10053b = context;
        if (a == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f10053b.getCacheDir());
            a = new File(e.h(sb2, File.separator, "gecko"));
        }
        return a.a;
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
            if (this.f10056d != null && !TextUtils.isEmpty(str)) {
                this.f10056d.syncDoGet(str);
            }
        } catch (Throwable unused) {
        }
    }

    private c() {
    }

    public static com.bykv.vk.openvk.preload.falconx.loader.a b() {
        try {
            return new com.bykv.vk.openvk.preload.falconx.loader.a(f10053b, "cca47107bfcbdb211d88f3385aeede40", a);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static c a() {
        return a.a;
    }

    public static void a(String str) {
        f10054c = str;
    }

    private JSONObject a(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                Map.Entry<String, JSONObject> entry = this.f10057e;
                if (entry == null || !str.equals(entry.getKey())) {
                    String a10 = com.bykv.vk.openvk.preload.geckox.utils.c.a(new com.bykv.vk.openvk.preload.falconx.loader.a(f10053b, "cca47107bfcbdb211d88f3385aeede40", a).getInputStream(str.concat("/manifest.json")));
                    if (TextUtils.isEmpty(a10)) {
                        return null;
                    }
                    this.f10057e = new AbstractMap.SimpleEntry(str, new JSONObject(a10));
                }
                Map.Entry<String, JSONObject> entry2 = this.f10058f;
                if (entry2 == null || !str.equals(entry2.getKey())) {
                    String a11 = com.bykv.vk.openvk.preload.geckox.utils.c.a(new com.bykv.vk.openvk.preload.falconx.loader.a(f10053b, "cca47107bfcbdb211d88f3385aeede40", a).getInputStream(str.concat("/md5_url_map.json")));
                    if (TextUtils.isEmpty(a11)) {
                        return null;
                    }
                    this.f10058f = new AbstractMap.SimpleEntry(str, new JSONObject(a11));
                }
                JSONObject value = this.f10057e.getValue();
                JSONObject value2 = this.f10058f.getValue();
                String a12 = a(str2, value2);
                if (value.has(a12)) {
                    JSONObject jSONObject = value.getJSONObject(a12);
                    a(value, a12, str2);
                    return jSONObject;
                }
                String b3 = b(str2);
                if (b3 == null) {
                    return null;
                }
                String a13 = a(b3, value2);
                if (value.has(a13)) {
                    JSONObject jSONObject2 = value.getJSONObject(a13);
                    a(value, a13, str2);
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

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:
    
        return new com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel(1, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel a(com.bykv.vk.openvk.preload.falconx.loader.ILoader r8, java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.geckox.c.a(com.bykv.vk.openvk.preload.falconx.loader.ILoader, java.lang.String, java.lang.String):com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel");
    }

    public static int a(ILoader iLoader, String str) {
        if (iLoader == null || str == null) {
            return 0;
        }
        try {
            com.bykv.vk.openvk.preload.falconx.loader.a aVar = new com.bykv.vk.openvk.preload.falconx.loader.a(f10053b, "cca47107bfcbdb211d88f3385aeede40", a);
            String str2 = str + File.separator;
            if (!aVar.f9990b.get()) {
                com.bykv.vk.openvk.preload.geckox.f.b bVar = aVar.a;
                if (!bVar.f10088b.get()) {
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
