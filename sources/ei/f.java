package ei;

import com.adjust.sdk.Constants;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class f {
    public static final c[] a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f17416b;

    static {
        c cVar = new c(c.f17395i, "");
        int i10 = 0;
        ki.l lVar = c.f17392f;
        ki.l lVar2 = c.f17393g;
        ki.l lVar3 = c.f17394h;
        ki.l lVar4 = c.f17391e;
        c[] cVarArr = {cVar, new c(lVar, "GET"), new c(lVar, "POST"), new c(lVar2, "/"), new c(lVar2, "/index.html"), new c(lVar3, "http"), new c(lVar3, Constants.SCHEME), new c(lVar4, "200"), new c(lVar4, "204"), new c(lVar4, "206"), new c(lVar4, "304"), new c(lVar4, "400"), new c(lVar4, "404"), new c(lVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c(DownloadModel.ETAG, ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c(ToolBar.REFRESH, ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (i10 < 61) {
            int i11 = i10 + 1;
            if (!linkedHashMap.containsKey(cVarArr[i10].a)) {
                linkedHashMap.put(cVarArr[i10].a, Integer.valueOf(i10));
            }
            i10 = i11;
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(result)");
        f17416b = unmodifiableMap;
    }

    public static void a(ki.l name) {
        boolean z10;
        Intrinsics.checkNotNullParameter(name, "name");
        int d10 = name.d();
        int i10 = 0;
        while (i10 < d10) {
            int i11 = i10 + 1;
            byte i12 = name.i(i10);
            if (65 <= i12 && i12 <= 90) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                i10 = i11;
            } else {
                throw new IOException(Intrinsics.stringPlus("PROTOCOL_ERROR response malformed: mixed case name: ", name.q()));
            }
        }
    }
}
