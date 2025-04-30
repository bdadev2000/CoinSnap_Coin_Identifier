package p8;

import com.adjust.sdk.Constants;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final C2575c[] f22412a;
    public static final Map b;

    static {
        C2575c c2575c = new C2575c(C2575c.f22395i, "");
        w8.i iVar = C2575c.f22392f;
        C2575c c2575c2 = new C2575c(iVar, "GET");
        C2575c c2575c3 = new C2575c(iVar, "POST");
        w8.i iVar2 = C2575c.f22393g;
        C2575c c2575c4 = new C2575c(iVar2, "/");
        C2575c c2575c5 = new C2575c(iVar2, "/index.html");
        w8.i iVar3 = C2575c.f22394h;
        C2575c c2575c6 = new C2575c(iVar3, "http");
        C2575c c2575c7 = new C2575c(iVar3, Constants.SCHEME);
        w8.i iVar4 = C2575c.f22391e;
        C2575c[] c2575cArr = {c2575c, c2575c2, c2575c3, c2575c4, c2575c5, c2575c6, c2575c7, new C2575c(iVar4, "200"), new C2575c(iVar4, "204"), new C2575c(iVar4, "206"), new C2575c(iVar4, "304"), new C2575c(iVar4, "400"), new C2575c(iVar4, "404"), new C2575c(iVar4, "500"), new C2575c("accept-charset", ""), new C2575c("accept-encoding", "gzip, deflate"), new C2575c("accept-language", ""), new C2575c("accept-ranges", ""), new C2575c("accept", ""), new C2575c("access-control-allow-origin", ""), new C2575c("age", ""), new C2575c("allow", ""), new C2575c("authorization", ""), new C2575c("cache-control", ""), new C2575c("content-disposition", ""), new C2575c("content-encoding", ""), new C2575c("content-language", ""), new C2575c("content-length", ""), new C2575c("content-location", ""), new C2575c("content-range", ""), new C2575c("content-type", ""), new C2575c("cookie", ""), new C2575c("date", ""), new C2575c(DownloadModel.ETAG, ""), new C2575c("expect", ""), new C2575c("expires", ""), new C2575c("from", ""), new C2575c("host", ""), new C2575c("if-match", ""), new C2575c("if-modified-since", ""), new C2575c("if-none-match", ""), new C2575c("if-range", ""), new C2575c("if-unmodified-since", ""), new C2575c("last-modified", ""), new C2575c("link", ""), new C2575c("location", ""), new C2575c("max-forwards", ""), new C2575c("proxy-authenticate", ""), new C2575c("proxy-authorization", ""), new C2575c("range", ""), new C2575c("referer", ""), new C2575c(ToolBar.REFRESH, ""), new C2575c("retry-after", ""), new C2575c("server", ""), new C2575c("set-cookie", ""), new C2575c("strict-transport-security", ""), new C2575c("transfer-encoding", ""), new C2575c("user-agent", ""), new C2575c("vary", ""), new C2575c("via", ""), new C2575c("www-authenticate", "")};
        f22412a = c2575cArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        int i9 = 0;
        while (i9 < 61) {
            int i10 = i9 + 1;
            if (!linkedHashMap.containsKey(c2575cArr[i9].f22396a)) {
                linkedHashMap.put(c2575cArr[i9].f22396a, Integer.valueOf(i9));
            }
            i9 = i10;
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        G7.j.d(unmodifiableMap, "unmodifiableMap(result)");
        b = unmodifiableMap;
    }

    public static void a(w8.i iVar) {
        G7.j.e(iVar, "name");
        int c9 = iVar.c();
        int i9 = 0;
        while (i9 < c9) {
            int i10 = i9 + 1;
            byte f9 = iVar.f(i9);
            if (65 <= f9 && f9 <= 90) {
                throw new IOException(G7.j.j(iVar.j(), "PROTOCOL_ERROR response malformed: mixed case name: "));
            }
            i9 = i10;
        }
    }
}
