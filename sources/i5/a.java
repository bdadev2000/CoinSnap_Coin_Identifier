package i5;

import a5.i;
import a5.v;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import b5.b;
import com.bytedance.sdk.component.Sg.YFl.EH;
import h.c;
import java.io.InputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a {
    public static final Handler a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f19154b = Charset.forName("UTF-8");

    public static boolean a() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static int b(c cVar) {
        int lastIndexOf;
        if (cVar.k() == 200) {
            String n10 = cVar.n("Content-Length");
            if (!TextUtils.isEmpty(n10)) {
                try {
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }
            return Integer.parseInt(n10);
        }
        if (cVar.k() != 206) {
            return -1;
        }
        String n11 = cVar.n("Content-Range");
        if (TextUtils.isEmpty(n11) || (lastIndexOf = n11.lastIndexOf("/")) < 0 || lastIndexOf >= n11.length() - 1) {
            return -1;
        }
        String substring = n11.substring(lastIndexOf + 1);
        if (!TextUtils.isEmpty(substring)) {
            try {
            } catch (NumberFormatException unused2) {
                return -1;
            }
        }
        return Integer.parseInt(substring);
    }

    public static b5.a c(c cVar, b bVar, String str, int i10) {
        String str2;
        String str3;
        String str4;
        String str5;
        b5.a a10 = bVar.a(i10, str);
        if (a10 == null) {
            int b3 = b(cVar);
            String n10 = cVar.n("Content-Type");
            if (b3 > 0 && !TextUtils.isEmpty(n10)) {
                e5.b bVar2 = (e5.b) cVar.f18524d;
                if (bVar2 == null) {
                    str2 = "";
                    str3 = str2;
                } else {
                    str3 = bVar2.a;
                    HashMap hashMap = bVar2.f17110b;
                    if (hashMap == null || hashMap.size() == 0) {
                        str2 = "";
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            sb2.append(entry.getKey());
                            sb2.append(": ");
                            sb2.append(entry.getValue());
                            sb2.append("\r\n");
                        }
                        str2 = sb2.toString();
                    }
                }
                List list = (List) cVar.f18523c;
                if (list == null || list.size() == 0) {
                    str4 = "";
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    int size = list.size();
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < size) {
                        i iVar = (i) list.get(i12);
                        if (iVar != null) {
                            sb3.append(iVar.a);
                            sb3.append(": ");
                            sb3.append(iVar.f197b);
                            sb3.append("\r\n");
                        }
                        i11++;
                        i12 = 0;
                    }
                    str4 = sb3.toString();
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("requestUrl", str3);
                    jSONObject.put("requestHeaders", str2);
                    jSONObject.put("responseHeaders", str4);
                    str5 = jSONObject.toString();
                } catch (Throwable unused) {
                    str5 = "";
                }
                new b5.a(b3, i10, str, n10, str5);
                bVar.getClass();
                throw null;
            }
        }
        return a10;
    }

    public static String d(b5.a aVar, int i10) {
        StringBuilder sb2 = new StringBuilder();
        if (i10 <= 0) {
            sb2.append("HTTP/1.1 200 OK\r\n");
        } else {
            sb2.append("HTTP/1.1 206 Partial Content\r\n");
        }
        sb2.append("Accept-Ranges: bytes\r\nContent-Type: ");
        sb2.append(aVar.f2281b);
        sb2.append("\r\n");
        int i11 = aVar.f2282c;
        if (i10 <= 0) {
            sb2.append("Content-Length: ");
            sb2.append(i11);
            sb2.append("\r\n");
        } else {
            sb2.append("Content-Range: bytes ");
            sb2.append(i10);
            sb2.append("-");
            sb2.append(i11 - 1);
            sb2.append("/");
            sb2.append(i11);
            sb2.append("\r\nContent-Length: ");
            sb2.append(i11 - i10);
            sb2.append("\r\n");
        }
        sb2.append("Connection: close\r\n\r\n");
        String sb3 = sb2.toString();
        if (v.a) {
            Log.i("TAG_PROXY_WRITE_TO_MP", sb3);
        }
        return sb3;
    }

    public static String e(c cVar, int i10) {
        boolean z10;
        int b3;
        boolean z11 = true;
        if (((EH) cVar.f18525f).tN() >= 200 && ((EH) cVar.f18525f).tN() < 300) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.M().toUpperCase());
        sb2.append(' ');
        sb2.append(cVar.k());
        sb2.append(' ');
        sb2.append(cVar.L());
        sb2.append("\r\n");
        if (v.a) {
            Log.i("TAG_PROXY_headers", cVar.M().toUpperCase() + " " + cVar.k() + " " + cVar.L());
        }
        List i11 = i((List) cVar.f18523c);
        if (i11 != null) {
            int size = i11.size();
            for (int i12 = 0; i12 < size; i12++) {
                i iVar = (i) i11.get(i12);
                if (iVar != null) {
                    String str = iVar.a;
                    sb2.append(str);
                    sb2.append(": ");
                    String str2 = iVar.f197b;
                    sb2.append(str2);
                    sb2.append("\r\n");
                    if ("Content-Range".equalsIgnoreCase(str) || ("Accept-Ranges".equalsIgnoreCase(str) && "bytes".equalsIgnoreCase(str2))) {
                        z11 = false;
                    }
                }
            }
        }
        if (z11 && (b3 = b(cVar)) > 0) {
            sb2.append("Content-Range: bytes ");
            sb2.append(Math.max(i10, 0));
            sb2.append("-");
            sb2.append(b3 - 1);
            sb2.append("/");
            sb2.append(b3);
            sb2.append("\r\n");
        }
        sb2.append("Connection: close\r\n\r\n");
        String sb3 = sb2.toString();
        if (v.a) {
            Log.i("TAG_PROXY_WRITE_TO_MP", sb3);
        }
        return sb3;
    }

    public static String f(c cVar, boolean z10, boolean z11) {
        boolean z12;
        String n10;
        boolean z13 = true;
        if (((EH) cVar.f18525f).tN() >= 200 && ((EH) cVar.f18525f).tN() < 300) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            if (v.a) {
                Log.e("TAG_PROXY_Response", "response code: " + cVar.k());
            }
            return "response code: " + cVar.k();
        }
        String n11 = cVar.n("Content-Type");
        if (n11 == null || (!n11.startsWith("video/") && !"application/octet-stream".equals(n11) && !"binary/octet-stream".equals(n11))) {
            z13 = false;
        }
        if (!z13) {
            if (v.a) {
                Log.e("TAG_PROXY_Response", "Content-Type: ".concat(String.valueOf(n11)));
            }
            return "Content-Type: ".concat(String.valueOf(n11));
        }
        int b3 = b(cVar);
        if (b3 <= 0) {
            if (v.a) {
                Log.e("TAG_PROXY_Response", "Content-Length: ".concat(String.valueOf(b3)));
            }
            return "Content-Length: ".concat(String.valueOf(b3));
        }
        if (z10 && ((n10 = cVar.n("Accept-Ranges")) == null || !n10.contains("bytes"))) {
            if (v.a) {
                Log.e("TAG_PROXY_Response", "Accept-Ranges: ".concat(String.valueOf(n10)));
            }
            return "Accept-Ranges: ".concat(String.valueOf(n10));
        }
        if (z11 && cVar.j() == null) {
            if (v.a) {
                Log.e("TAG_PROXY_Response", "response body null");
            }
            return "response body null";
        }
        return null;
    }

    public static ArrayList g(Map map) {
        if (map != null && !map.isEmpty()) {
            try {
                Set<Map.Entry> entrySet = map.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : entrySet) {
                    arrayList.add(new i((String) entry.getKey(), (String) entry.getValue()));
                }
                return arrayList;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public static ArrayList h(String... strArr) {
        boolean z10;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (str != null && (str.startsWith("http://") || str.startsWith("https://"))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static List i(List list) {
        if (list != null && list.size() != 0) {
            if (v.a) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    i iVar = (i) list.get(i10);
                    if (iVar != null) {
                        StringBuilder sb2 = new StringBuilder();
                        String str = iVar.a;
                        sb2.append(str);
                        sb2.append(": ");
                        sb2.append(str);
                        Log.i("TAG_PROXY_PRE_FILTER", sb2.toString());
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i iVar2 = (i) it.next();
                if (!"Host".equals(iVar2.a)) {
                    String str2 = iVar2.a;
                    if (!"Keep-Alive".equals(str2) && !"Connection".equals(str2) && !"Proxy-Connection".equals(str2)) {
                    }
                }
                arrayList.add(iVar2);
            }
            list.removeAll(arrayList);
            if (v.a) {
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    i iVar3 = (i) list.get(i11);
                    if (iVar3 != null) {
                        Log.i("TAG_PROXY_POST_FILTER", iVar3.a + ": " + iVar3.f197b);
                    }
                }
            }
            return list;
        }
        return null;
    }

    public static void j(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void k(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
    }
}
