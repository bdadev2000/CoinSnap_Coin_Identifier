package R3;

import W1.F;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import c2.InterfaceC0595f;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustSessionFailure;
import com.adjust.sdk.Constants;
import com.adjust.sdk.OnAttributionChangedListener;
import com.adjust.sdk.OnSessionTrackingFailedListener;
import com.facebook.A;
import com.facebook.B;
import com.facebook.C;
import com.facebook.C0785a;
import com.facebook.C1827e;
import com.facebook.C1849l;
import com.facebook.E;
import com.facebook.G;
import com.facebook.internal.AbstractC1839h;
import com.facebook.internal.H;
import com.facebook.internal.z;
import com.facebook.x;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import i8.I;
import i8.M;
import j5.C2400c;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import k2.InterfaceC2429a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u0.C2747b;
import u7.AbstractC2816g;

/* loaded from: classes2.dex */
public class e implements B4.d, C0.d, C4.a, G5.c, H0.c, A5.d, InterfaceC2429a, F, InterfaceC0595f, RewardItem, OnAttributionChangedListener, OnSessionTrackingFailedListener {

    /* renamed from: c, reason: collision with root package name */
    public static e f2642c;
    public final /* synthetic */ int b;

    public /* synthetic */ e(int i9) {
        this.b = i9;
    }

    public static void A(E e4, ArrayList arrayList) {
        Boolean valueOf;
        G7.j.e(e4, "requests");
        int size = e4.f13403d.size();
        ArrayList arrayList2 = new ArrayList();
        if (size > 0) {
            int i9 = 0;
            while (true) {
                int i10 = i9 + 1;
                C c9 = (C) e4.f13403d.get(i9);
                if (c9.f13387g != null) {
                    arrayList2.add(new Pair(c9.f13387g, arrayList.get(i9)));
                }
                if (i10 >= size) {
                    break;
                } else {
                    i9 = i10;
                }
            }
        }
        if (arrayList2.size() > 0) {
            A4.d dVar = new A4.d(27, arrayList2, e4);
            Handler handler = e4.b;
            if (handler == null) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(handler.post(dVar));
            }
            if (valueOf == null) {
                dVar.run();
            }
        }
    }

    public static void B() {
        File[] listFiles;
        if (H.z()) {
            return;
        }
        File h6 = com.facebook.appevents.n.h();
        if (h6 == null) {
            listFiles = new File[0];
        } else {
            listFiles = h6.listFiles(new L2.e(0));
            if (listFiles == null) {
                listFiles = new File[0];
            }
        }
        ArrayList arrayList = new ArrayList(listFiles.length);
        for (File file : listFiles) {
            arrayList.add(com.facebook.appevents.i.k(file));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((L2.d) next).a()) {
                arrayList2.add(next);
            }
        }
        List R4 = AbstractC2816g.R(new M2.b(1), arrayList2);
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = e1.f.t(0, Math.min(R4.size(), 5)).iterator();
        while (((L7.b) it2).f1833d) {
            jSONArray.put(R4.get(((L7.b) it2).a()));
        }
        com.facebook.appevents.n.t("crash_reports", jSONArray, new M2.c(R4, 1));
    }

    public static void C(HashMap hashMap, A a6) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = C.f13380j;
            if (u(((com.facebook.u) entry.getValue()).b)) {
                a6.m((String) entry.getKey(), ((com.facebook.u) entry.getValue()).b, ((com.facebook.u) entry.getValue()).f13843a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.facebook.A, java.lang.Object, com.facebook.x] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public static void D(E e4, HttpURLConnection httpURLConnection) {
        boolean z8;
        G g9;
        OutputStream gZIPOutputStream;
        String b;
        ?? r22 = 1;
        G7.j.e(e4, "requests");
        z zVar = new z();
        int size = e4.f13403d.size();
        Iterator<E> it = e4.iterator();
        loop0: while (true) {
            if (it.hasNext()) {
                C c9 = (C) it.next();
                Iterator<String> it2 = c9.f13384d.keySet().iterator();
                while (it2.hasNext()) {
                    if (u(c9.f13384d.get(it2.next()))) {
                        z8 = false;
                        break loop0;
                    }
                }
            } else {
                z8 = true;
                break;
            }
        }
        BufferedOutputStream bufferedOutputStream = null;
        if (size == 1) {
            g9 = ((C) e4.f13403d.get(0)).f13388h;
        } else {
            g9 = null;
        }
        G g10 = G.f13409c;
        if (g9 == null) {
            g9 = g10;
        }
        httpURLConnection.setRequestMethod(g9.name());
        if (z8) {
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        } else {
            httpURLConnection.setRequestProperty("Content-Type", String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{C.f13380j}, 1)));
        }
        URL url = httpURLConnection.getURL();
        zVar.b();
        zVar.a(e4.f13402c, "Id");
        G7.j.d(url, "url");
        zVar.a(url, "URL");
        String requestMethod = httpURLConnection.getRequestMethod();
        G7.j.d(requestMethod, "connection.requestMethod");
        zVar.a(requestMethod, "Method");
        String requestProperty = httpURLConnection.getRequestProperty(Command.HTTP_HEADER_USER_AGENT);
        G7.j.d(requestProperty, "connection.getRequestProperty(\"User-Agent\")");
        zVar.a(requestProperty, Command.HTTP_HEADER_USER_AGENT);
        String requestProperty2 = httpURLConnection.getRequestProperty("Content-Type");
        G7.j.d(requestProperty2, "connection.getRequestProperty(\"Content-Type\")");
        zVar.a(requestProperty2, "Content-Type");
        httpURLConnection.setConnectTimeout(0);
        httpURLConnection.setReadTimeout(0);
        com.facebook.H h6 = com.facebook.H.b;
        String str = zVar.f13682a;
        if (g9 == g10) {
            httpURLConnection.setDoOutput(true);
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                if (z8) {
                    try {
                        gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream2);
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        throw th;
                    }
                } else {
                    gZIPOutputStream = bufferedOutputStream2;
                }
                Iterator it3 = e4.f13404f.iterator();
                while (it3.hasNext()) {
                }
                Iterator<E> it4 = e4.iterator();
                while (it4.hasNext()) {
                    com.facebook.v vVar = ((C) it4.next()).f13387g;
                }
                ?? obj = new Object();
                obj.f13377c = gZIPOutputStream;
                obj.f13378d = zVar;
                obj.f13376a = true;
                obj.b = z8;
                if (size == 1) {
                    C c10 = (C) e4.f13403d.get(0);
                    HashMap hashMap = new HashMap();
                    for (String str2 : c10.f13384d.keySet()) {
                        Object obj2 = c10.f13384d.get(str2);
                        if (u(obj2)) {
                            G7.j.d(str2, "key");
                            hashMap.put(str2, new com.facebook.u(c10, obj2));
                        }
                    }
                    zVar.b();
                    Bundle bundle = c10.f13384d;
                    for (String str3 : bundle.keySet()) {
                        Object obj3 = bundle.get(str3);
                        if (v(obj3)) {
                            G7.j.d(str3, "key");
                            obj.m(str3, obj3, c10);
                        }
                    }
                    zVar.b();
                    C(hashMap, obj);
                    JSONObject jSONObject = c10.f13383c;
                    if (jSONObject != null) {
                        String path = url.getPath();
                        G7.j.d(path, "url.path");
                        y(jSONObject, path, obj);
                    }
                } else {
                    Iterator<E> it5 = e4.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            C0785a c0785a = ((C) it5.next()).f13382a;
                            if (c0785a != null) {
                                b = c0785a.f13448j;
                                break;
                            }
                        } else {
                            String str4 = C.f13380j;
                            b = com.facebook.r.b();
                            break;
                        }
                    }
                    if (b.length() != 0) {
                        obj.a("batch_app_id", b);
                        HashMap hashMap2 = new HashMap();
                        JSONArray jSONArray = new JSONArray();
                        Iterator it6 = e4.iterator();
                        while (it6.hasNext()) {
                            C c11 = (C) it6.next();
                            c11.getClass();
                            JSONObject jSONObject2 = new JSONObject();
                            String h9 = c11.h(String.format("https://graph.%s", Arrays.copyOf(new Object[]{com.facebook.r.e()}, (int) r22)));
                            c11.a();
                            Uri parse = Uri.parse(c11.b(h9, r22));
                            String format = String.format("%s?%s", Arrays.copyOf(new Object[]{parse.getPath(), parse.getQuery()}, 2));
                            jSONObject2.put("relative_url", format);
                            jSONObject2.put("method", c11.f13388h);
                            C0785a c0785a2 = c11.f13382a;
                            if (c0785a2 != null) {
                                z.f13680c.p(c0785a2.f13445g);
                            }
                            ArrayList arrayList = new ArrayList();
                            Iterator<String> it7 = c11.f13384d.keySet().iterator();
                            while (true) {
                                boolean hasNext = it7.hasNext();
                                String str5 = C.f13380j;
                                if (!hasNext) {
                                    break;
                                }
                                Object obj4 = c11.f13384d.get(it7.next());
                                if (u(obj4)) {
                                    Iterator it8 = it6;
                                    String format2 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(hashMap2.size())}, 2));
                                    arrayList.add(format2);
                                    hashMap2.put(format2, new com.facebook.u(c11, obj4));
                                    it6 = it8;
                                    it7 = it7;
                                }
                            }
                            Iterator it9 = it6;
                            if (!arrayList.isEmpty()) {
                                jSONObject2.put("attached_files", TextUtils.join(",", arrayList));
                            }
                            JSONObject jSONObject3 = c11.f13383c;
                            if (jSONObject3 != null) {
                                ArrayList arrayList2 = new ArrayList();
                                y(jSONObject3, format, new B(arrayList2));
                                jSONObject2.put(TtmlNode.TAG_BODY, TextUtils.join("&", arrayList2));
                            }
                            jSONArray.put(jSONObject2);
                            it6 = it9;
                            r22 = 1;
                        }
                        String jSONArray2 = jSONArray.toString();
                        G7.j.d(jSONArray2, "requestJsonArray.toString()");
                        obj.a("batch", jSONArray2);
                        zVar.b();
                        C(hashMap2, obj);
                    } else {
                        throw new C1849l("App ID was not specified at the request or Settings.");
                    }
                }
                gZIPOutputStream.close();
                String sb = zVar.b.toString();
                G7.j.d(sb, "contents.toString()");
                L4.f.o(h6, str, sb);
                zVar.b = new StringBuilder();
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            String sb2 = zVar.b.toString();
            G7.j.d(sb2, "contents.toString()");
            L4.f.o(h6, str, sb2);
            zVar.b = new StringBuilder();
        }
    }

    public static HttpURLConnection E(E e4) {
        URL url;
        G7.j.e(e4, "requests");
        Iterator<E> it = e4.iterator();
        while (it.hasNext()) {
            C c9 = (C) it.next();
            if (G.b == c9.f13388h && H.B(c9.f13384d.getString("fields"))) {
                L4.f fVar = z.f13680c;
                com.facebook.H h6 = com.facebook.H.f13414g;
                StringBuilder sb = new StringBuilder("GET requests for /");
                String str = c9.b;
                if (str == null) {
                    str = "";
                }
                sb.append(str);
                sb.append(" should contain an explicit \"fields\" parameter.");
                L4.f.o(h6, "Request", sb.toString());
            }
        }
        try {
            if (e4.f13403d.size() == 1) {
                url = new URL(((C) e4.f13403d.get(0)).g());
            } else {
                url = new URL(String.format("https://graph.%s", Arrays.copyOf(new Object[]{com.facebook.r.e()}, 1)));
            }
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnection = p(url);
                D(e4, httpURLConnection);
                return httpURLConnection;
            } catch (IOException e9) {
                H.j(httpURLConnection);
                throw new RuntimeException("could not construct request body", e9);
            } catch (JSONException e10) {
                H.j(httpURLConnection);
                throw new RuntimeException("could not construct request body", e10);
            }
        } catch (MalformedURLException e11) {
            throw new RuntimeException("could not construct URL for request", e11);
        }
    }

    public static final C.c i(JSONObject jSONObject) {
        String optString;
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray(DataSchemeDataSource.SCHEME_DATA);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i9 = 0;
            while (true) {
                int i10 = i9 + 1;
                JSONObject optJSONObject = jSONArray.optJSONObject(i9);
                String optString2 = optJSONObject.optString("permission");
                G7.j.d(optString2, "permission");
                if (optString2.length() != 0 && !optString2.equals("installed") && (optString = optJSONObject.optString(NotificationCompat.CATEGORY_STATUS)) != null) {
                    int hashCode = optString.hashCode();
                    if (hashCode != -1309235419) {
                        if (hashCode != 280295099) {
                            if (hashCode == 568196142 && optString.equals("declined")) {
                                arrayList2.add(optString2);
                            }
                        } else if (optString.equals("granted")) {
                            arrayList.add(optString2);
                        }
                    } else if (optString.equals("expired")) {
                        arrayList3.add(optString2);
                    }
                }
                if (i10 >= length) {
                    break;
                }
                i9 = i10;
            }
        }
        C.c cVar = new C.c(18, (char) 0);
        cVar.f347c = arrayList;
        cVar.f348d = arrayList2;
        cVar.f349f = arrayList3;
        return cVar;
    }

    public static final String k(Object obj) {
        String str = C.f13380j;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof Boolean) && !(obj instanceof Number)) {
            if (obj instanceof Date) {
                String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                G7.j.d(format, "iso8601DateFormat.format(value)");
                return format;
            }
            throw new IllegalArgumentException("Unsupported parameter type.");
        }
        return obj.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0084 -> B:13:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0087 -> B:13:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object l(java.util.List r6, e0.y r7, w7.f r8) {
        /*
            boolean r0 = r8 instanceof e0.C2204e
            if (r0 == 0) goto L13
            r0 = r8
            e0.e r0 = (e0.C2204e) r0
            int r1 = r0.f19969i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19969i = r1
            goto L18
        L13:
            e0.e r0 = new e0.e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f19968h
            x7.a r1 = x7.EnumC2928a.b
            int r2 = r0.f19969i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.util.Iterator r6 = r0.f19967g
            java.io.Serializable r7 = r0.f19966f
            G7.r r7 = (G7.r) r7
            t7.AbstractC2712a.f(r8)     // Catch: java.lang.Throwable -> L30
            goto L67
        L30:
            r8 = move-exception
            goto L80
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.io.Serializable r6 = r0.f19966f
            java.util.List r6 = (java.util.List) r6
            t7.AbstractC2712a.f(r8)
            goto L5c
        L42:
            t7.AbstractC2712a.f(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            e0.g r2 = new e0.g
            r5 = 0
            r2.<init>(r6, r8, r5)
            r0.f19966f = r8
            r0.f19969i = r4
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L5b
            goto L95
        L5b:
            r6 = r8
        L5c:
            G7.r r7 = new G7.r
            r7.<init>()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L67:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8d
            java.lang.Object r8 = r6.next()
            F7.l r8 = (F7.l) r8
            r0.f19966f = r7     // Catch: java.lang.Throwable -> L30
            r0.f19967g = r6     // Catch: java.lang.Throwable -> L30
            r0.f19969i = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r1) goto L67
            goto L95
        L80:
            java.lang.Object r2 = r7.b
            if (r2 != 0) goto L87
            r7.b = r8
            goto L67
        L87:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            t7.AbstractC2712a.a(r2, r8)
            goto L67
        L8d:
            java.lang.Object r6 = r7.b
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L96
            t7.y r1 = t7.y.f23029a
        L95:
            return r1
        L96:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.e.l(java.util.List, e0.y, w7.f):java.lang.Object");
    }

    public static final I o(I i9) {
        M m;
        if (i9 == null) {
            m = null;
        } else {
            m = i9.f20779i;
        }
        if (m != null) {
            i8.H h6 = i9.h();
            h6.f20769g = null;
            return h6.a();
        }
        return i9;
    }

    public static HttpURLConnection p(URL url) {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        if (uRLConnection != null) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            if (C.l == null) {
                C.l = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "16.1.3"}, 2));
            }
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, C.l);
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
    }

    public static B4.b q(r6.b bVar) {
        androidx.work.o oVar = new androidx.work.o(8);
        B4.a aVar = new B4.a(true, false, false);
        bVar.getClass();
        return new B4.b(System.currentTimeMillis() + Constants.ONE_HOUR, oVar, aVar, 10.0d, 1.2d, 60);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [com.facebook.l, java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.facebook.l, java.lang.RuntimeException] */
    public static ArrayList r(E e4) {
        Exception exc;
        HttpURLConnection httpURLConnection;
        ArrayList b;
        G7.j.e(e4, "requests");
        AbstractC1839h.i(e4);
        HttpURLConnection httpURLConnection2 = null;
        r0 = null;
        InputStream inputStream = null;
        try {
            httpURLConnection = E(e4);
            exc = null;
        } catch (Exception e9) {
            exc = e9;
            httpURLConnection = null;
        } catch (Throwable th) {
            th = th;
            H.j(httpURLConnection2);
            throw th;
        }
        try {
            if (httpURLConnection != null) {
                com.facebook.H h6 = com.facebook.H.b;
                try {
                    try {
                    } catch (C1849l e10) {
                        L4.f fVar = z.f13680c;
                        com.facebook.r.h(h6);
                        b = com.facebook.appevents.n.b(e4, httpURLConnection, e10);
                    } catch (Exception e11) {
                        L4.f fVar2 = z.f13680c;
                        com.facebook.r.h(h6);
                        b = com.facebook.appevents.n.b(e4, httpURLConnection, new RuntimeException(e11));
                    }
                    if (com.facebook.r.g()) {
                        if (httpURLConnection.getResponseCode() >= 400) {
                            inputStream = httpURLConnection.getErrorStream();
                        } else {
                            inputStream = httpURLConnection.getInputStream();
                        }
                        b = com.facebook.appevents.n.d(inputStream, httpURLConnection, e4);
                        H.d(inputStream);
                        H.j(httpURLConnection);
                        int size = e4.f13403d.size();
                        if (size == b.size()) {
                            A(e4, b);
                            C1827e s5 = C1827e.f13531f.s();
                            C0785a c0785a = s5.f13534c;
                            if (c0785a != null) {
                                long time = new Date().getTime();
                                if (c0785a.f13446h.b && time - s5.f13536e.getTime() > 3600000 && time - c0785a.f13447i.getTime() > com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS) {
                                    if (G7.j.a(Looper.getMainLooper(), Looper.myLooper())) {
                                        s5.a();
                                    } else {
                                        new Handler(Looper.getMainLooper()).post(new D3.b(s5, 23));
                                    }
                                }
                            }
                        } else {
                            throw new C1849l(String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(b.size()), Integer.valueOf(size)}, 2)));
                        }
                    } else {
                        Log.e("com.facebook.F", "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                        throw new C1849l("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    }
                } catch (Throwable th2) {
                    H.d(null);
                    throw th2;
                }
            } else {
                b = com.facebook.appevents.n.b(e4.f13403d, null, new RuntimeException(exc));
                A(e4, b);
            }
            H.j(httpURLConnection);
            return b;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection2 = httpURLConnection;
            H.j(httpURLConnection2);
            throw th;
        }
    }

    public static boolean t(String str) {
        if (!"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static boolean u(Object obj) {
        if (!(obj instanceof Bitmap) && !(obj instanceof byte[]) && !(obj instanceof Uri) && !(obj instanceof ParcelFileDescriptor) && !(obj instanceof com.facebook.z)) {
            return false;
        }
        return true;
    }

    public static boolean v(Object obj) {
        if (!(obj instanceof String) && !(obj instanceof Boolean) && !(obj instanceof Number) && !(obj instanceof Date)) {
            return false;
        }
        return true;
    }

    public static C w(C0785a c0785a, String str, com.facebook.v vVar) {
        return new C(c0785a, str, null, null, vVar);
    }

    public static C x(C0785a c0785a, String str, JSONObject jSONObject, com.facebook.v vVar) {
        C c9 = new C(c0785a, str, null, G.f13409c, vVar);
        c9.f13383c = jSONObject;
        return c9;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void y(org.json.JSONObject r7, java.lang.String r8, com.facebook.x r9) {
        /*
            java.util.regex.Pattern r0 = com.facebook.C.f13381k
            java.util.regex.Matcher r0 = r0.matcher(r8)
            boolean r1 = r0.matches()
            r2 = 1
            if (r1 == 0) goto L17
            java.lang.String r0 = r0.group(r2)
            java.lang.String r1 = "matcher.group(1)"
            G7.j.d(r0, r1)
            goto L18
        L17:
            r0 = r8
        L18:
            java.lang.String r1 = "me/"
            r3 = 0
            boolean r1 = O7.o.C(r0, r1, r3)
            if (r1 != 0) goto L2c
            java.lang.String r1 = "/me/"
            boolean r0 = O7.o.C(r0, r1, r3)
            if (r0 == 0) goto L2a
            goto L2c
        L2a:
            r8 = r3
            goto L42
        L2c:
            java.lang.String r0 = ":"
            r1 = 6
            int r0 = O7.g.J(r8, r0, r3, r3, r1)
            java.lang.String r4 = "?"
            int r8 = O7.g.J(r8, r4, r3, r3, r1)
            r1 = 3
            if (r0 <= r1) goto L2a
            r1 = -1
            if (r8 == r1) goto L41
            if (r0 >= r8) goto L2a
        L41:
            r8 = r2
        L42:
            java.util.Iterator r0 = r7.keys()
        L46:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r4 = r7.opt(r1)
            if (r8 == 0) goto L62
            java.lang.String r5 = "image"
            boolean r5 = O7.o.y(r1, r5)
            if (r5 == 0) goto L62
            r5 = r2
            goto L63
        L62:
            r5 = r3
        L63:
            java.lang.String r6 = "key"
            G7.j.d(r1, r6)
            java.lang.String r6 = "value"
            G7.j.d(r4, r6)
            z(r1, r4, r9, r5)
            goto L46
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.e.y(org.json.JSONObject, java.lang.String, com.facebook.x):void");
    }

    public static void z(String str, Object obj, x xVar, boolean z8) {
        Class<?> cls = obj.getClass();
        if (JSONObject.class.isAssignableFrom(cls)) {
            JSONObject jSONObject = (JSONObject) obj;
            if (z8) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String format = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                    Object opt = jSONObject.opt(next);
                    G7.j.d(opt, "jsonObject.opt(propertyName)");
                    z(format, opt, xVar, z8);
                }
                return;
            }
            if (jSONObject.has("id")) {
                String optString = jSONObject.optString("id");
                G7.j.d(optString, "jsonObject.optString(\"id\")");
                z(str, optString, xVar, z8);
                return;
            } else if (jSONObject.has("url")) {
                String optString2 = jSONObject.optString("url");
                G7.j.d(optString2, "jsonObject.optString(\"url\")");
                z(str, optString2, xVar, z8);
                return;
            } else {
                if (jSONObject.has("fbsdk:create_object")) {
                    String jSONObject2 = jSONObject.toString();
                    G7.j.d(jSONObject2, "jsonObject.toString()");
                    z(str, jSONObject2, xVar, z8);
                    return;
                }
                return;
            }
        }
        if (JSONArray.class.isAssignableFrom(cls)) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            if (length > 0) {
                int i9 = 0;
                while (true) {
                    int i10 = i9 + 1;
                    String format2 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i9)}, 2));
                    Object opt2 = jSONArray.opt(i9);
                    G7.j.d(opt2, "jsonArray.opt(i)");
                    z(format2, opt2, xVar, z8);
                    if (i10 < length) {
                        i9 = i10;
                    } else {
                        return;
                    }
                }
            }
        } else {
            if (!String.class.isAssignableFrom(cls) && !Number.class.isAssignableFrom(cls) && !Boolean.class.isAssignableFrom(cls)) {
                if (Date.class.isAssignableFrom(cls)) {
                    String format3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                    G7.j.d(format3, "iso8601DateFormat.format(date)");
                    xVar.a(str, format3);
                    return;
                }
                String str2 = C.f13380j;
                com.facebook.r rVar = com.facebook.r.f13801a;
                return;
            }
            xVar.a(str, obj.toString());
        }
    }

    @Override // C4.a
    public StackTraceElement[] c(StackTraceElement[] stackTraceElementArr) {
        int i9;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        while (i11 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i11];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i13 = i11 - intValue;
                if (i11 + i13 <= stackTraceElementArr.length) {
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (stackTraceElementArr[intValue + i14].equals(stackTraceElementArr[i11 + i14])) {
                        }
                    }
                    int intValue2 = i11 - num.intValue();
                    if (i10 < 10) {
                        System.arraycopy(stackTraceElementArr, i11, stackTraceElementArr2, i12, intValue2);
                        i12 += intValue2;
                        i10++;
                    }
                    i9 = (intValue2 - 1) + i11;
                    hashMap.put(stackTraceElement, Integer.valueOf(i11));
                    i11 = i9 + 1;
                }
            }
            stackTraceElementArr2[i12] = stackTraceElementArr[i11];
            i12++;
            i10 = 1;
            i9 = i11;
            hashMap.put(stackTraceElement, Integer.valueOf(i11));
            i11 = i9 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i12];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i12);
        if (i12 < stackTraceElementArr.length) {
            return stackTraceElementArr3;
        }
        return stackTraceElementArr;
    }

    @Override // H0.c
    public H0.d d(H0.b bVar) {
        boolean z8 = bVar.b;
        return new I0.e((Context) bVar.f1345c, (String) bVar.f1346d, (D0.l) bVar.f1347e, z8);
    }

    @Override // k2.InterfaceC2429a
    public Object e() {
        switch (this.b) {
            case 8:
                return new P1.A();
            default:
                return new ArrayList();
        }
    }

    @Override // B4.d
    public B4.b f(r6.b bVar, JSONObject jSONObject) {
        return q(bVar);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        return 1;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public String getType() {
        return "vungle";
    }

    @Override // W1.F
    public void h(MediaExtractor mediaExtractor, Object obj) {
        mediaExtractor.setDataSource(new W1.E((ByteBuffer) obj));
    }

    @Override // G5.c
    public void j(G5.d dVar) {
        int i9;
        int i10 = dVar.f1278a;
        String str = dVar.f1280d;
        int length = str.length();
        if (i10 < length) {
            char charAt = str.charAt(i10);
            i9 = 0;
            while (r8.k.q(charAt) && i10 < length) {
                i9++;
                i10++;
                if (i10 < length) {
                    charAt = str.charAt(i10);
                }
            }
        } else {
            i9 = 0;
        }
        if (i9 >= 2) {
            char charAt2 = str.charAt(dVar.f1278a);
            char charAt3 = str.charAt(dVar.f1278a + 1);
            if (r8.k.q(charAt2) && r8.k.q(charAt3)) {
                dVar.e((char) ((charAt3 - '0') + ((charAt2 - '0') * 10) + 130));
                dVar.f1278a += 2;
                return;
            } else {
                throw new IllegalArgumentException("not digits: " + charAt2 + charAt3);
            }
        }
        char a6 = dVar.a();
        int t9 = r8.k.t(str, dVar.f1278a, 0);
        if (t9 != 0) {
            if (t9 != 1) {
                if (t9 != 2) {
                    if (t9 != 3) {
                        if (t9 != 4) {
                            if (t9 == 5) {
                                dVar.e((char) 231);
                                dVar.b = 5;
                                return;
                            }
                            throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(t9)));
                        }
                        dVar.e((char) 240);
                        dVar.b = 4;
                        return;
                    }
                    dVar.e((char) 238);
                    dVar.b = 3;
                    return;
                }
                dVar.e((char) 239);
                dVar.b = 2;
                return;
            }
            dVar.e((char) 230);
            dVar.b = 1;
            return;
        }
        if (r8.k.r(a6)) {
            dVar.e((char) 235);
            dVar.e((char) (a6 - 127));
            dVar.f1278a++;
        } else {
            dVar.e((char) (a6 + 1));
            dVar.f1278a++;
        }
    }

    @Override // W1.F
    public void m(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(new W1.E((ByteBuffer) obj));
    }

    /* JADX WARN: Code restructure failed: missing block: B:290:0x065a, code lost:
    
        if (r1 != false) goto L365;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0373 A[LOOP:3: B:99:0x0371->B:100:0x0373, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:486:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017e A[LOOP:1: B:64:0x0150->B:71:0x017e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0261  */
    @Override // A5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public D5.b n(java.lang.String r25, int r26, java.util.EnumMap r27) {
        /*
            Method dump skipped, instructions count: 2096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.e.n(java.lang.String, int, java.util.EnumMap):D5.b");
    }

    @Override // com.adjust.sdk.OnAttributionChangedListener
    public void onAttributionChanged(AdjustAttribution adjustAttribution) {
        Log.d("MiaAdjust", "Attribution callback called!");
        Log.d("MiaAdjust", "Attribution: " + adjustAttribution.toString());
    }

    @Override // com.adjust.sdk.OnSessionTrackingFailedListener
    public void onFinishedSessionTrackingFailed(AdjustSessionFailure adjustSessionFailure) {
        Log.d("MiaAdjust", "Session failure callback called!");
        Log.d("MiaAdjust", "Session failure data: " + adjustSessionFailure.toString());
    }

    public C1827e s() {
        C1827e c1827e;
        C1827e c1827e2 = C1827e.f13532g;
        if (c1827e2 == null) {
            synchronized (this) {
                c1827e = C1827e.f13532g;
                if (c1827e == null) {
                    C2747b a6 = C2747b.a(com.facebook.r.a());
                    G7.j.d(a6, "getInstance(applicationContext)");
                    C1827e c1827e3 = new C1827e(a6, new C2400c(28));
                    C1827e.f13532g = c1827e3;
                    c1827e = c1827e3;
                }
            }
            return c1827e;
        }
        return c1827e2;
    }

    @Override // C0.d
    public void g() {
    }

    @Override // c2.InterfaceC0595f
    public void b(Activity activity) {
    }

    @Override // C0.d
    public void a(int i9, Serializable serializable) {
    }
}
