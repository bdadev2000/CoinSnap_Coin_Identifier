package com.mbridge.msdk.click;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes4.dex */
public class h {
    private static final String a = "h";

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.c.g f12536b;

    /* renamed from: c, reason: collision with root package name */
    private String f12537c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12538d = true;

    /* renamed from: e, reason: collision with root package name */
    private final int f12539e = 3145728;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f12540f;

    public h() {
        com.mbridge.msdk.c.g d10 = com.applovin.impl.mediation.ads.e.d(com.mbridge.msdk.c.h.a());
        this.f12536b = d10;
        if (d10 == null) {
            com.mbridge.msdk.c.h.a();
            this.f12536b = com.mbridge.msdk.c.i.a();
        }
    }

    public final com.mbridge.msdk.click.entity.a a(String str, boolean z10, boolean z11, CampaignEx campaignEx) {
        HttpURLConnection httpURLConnection;
        int i10;
        HttpURLConnection httpURLConnection2 = null;
        if (!URLUtil.isNetworkUrl(str)) {
            return null;
        }
        String replace = str.replace(" ", "%20");
        this.f12540f = new com.mbridge.msdk.click.entity.a();
        try {
            httpURLConnection = (HttpURLConnection) new URL(replace).openConnection();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            httpURLConnection.setRequestMethod("GET");
            if ((!z10 && !z11) || campaignEx == null) {
                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, z.g());
            }
            if (z10 && campaignEx != null && campaignEx.getcUA() == 1) {
                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, z.g());
            }
            if (z11 && campaignEx != null && campaignEx.getImpUA() == 1) {
                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, z.g());
            }
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            if (this.f12536b.aG() && !TextUtils.isEmpty(this.f12537c)) {
                httpURLConnection.setRequestProperty("referer", this.f12537c);
            }
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(60000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.connect();
            this.f12540f.a = httpURLConnection.getHeaderField("Location");
            this.f12540f.f12520d = httpURLConnection.getHeaderField("Referer");
            this.f12540f.f12522f = httpURLConnection.getResponseCode();
            this.f12540f.f12518b = httpURLConnection.getContentType();
            this.f12540f.f12521e = httpURLConnection.getContentLength();
            this.f12540f.f12519c = httpURLConnection.getContentEncoding();
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(this.f12540f.f12519c);
            com.mbridge.msdk.click.entity.a aVar = this.f12540f;
            if (aVar.f12522f == 200 && this.f12538d && (i10 = aVar.f12521e) > 0 && i10 < 3145728 && !TextUtils.isEmpty(replace)) {
                try {
                    String a10 = a(httpURLConnection.getInputStream(), equalsIgnoreCase);
                    if (!TextUtils.isEmpty(a10)) {
                        byte[] bytes = a10.getBytes();
                        if (bytes.length > 0 && bytes.length < 3145728) {
                            this.f12540f.f12523g = a10.trim();
                        }
                    }
                } catch (Throwable th3) {
                    ad.b(a, th3.getMessage());
                }
            }
            this.f12537c = replace;
            httpURLConnection.disconnect();
            return this.f12540f;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection2 = httpURLConnection;
            try {
                this.f12540f.f12524h = th.getMessage();
                return this.f12540f;
            } finally {
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[Catch: Exception -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x004f, blocks: (B:32:0x0022, B:12:0x004b), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[Catch: all -> 0x002c, TryCatch #5 {all -> 0x002c, blocks: (B:39:0x0008, B:4:0x000e, B:7:0x002f, B:9:0x0033, B:10:0x0040), top: B:38:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String a(java.io.InputStream r4, boolean r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            if (r5 == 0) goto Le
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r4 = r5
        Le:
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
        L18:
            java.lang.String r4 = r5.readLine()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            if (r4 == 0) goto L22
            r0.append(r4)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            goto L18
        L22:
            r5.close()     // Catch: java.lang.Exception -> L4f
            goto L59
        L26:
            r4 = move-exception
            r1 = r5
            goto L5e
        L29:
            r4 = move-exception
            r1 = r5
            goto L2f
        L2c:
            r4 = move-exception
            goto L5e
        L2e:
            r4 = move-exception
        L2f:
            com.mbridge.msdk.click.entity.a r5 = r3.f12540f     // Catch: java.lang.Throwable -> L2c
            if (r5 != 0) goto L40
            com.mbridge.msdk.click.entity.a r5 = new com.mbridge.msdk.click.entity.a     // Catch: java.lang.Throwable -> L2c
            r5.<init>()     // Catch: java.lang.Throwable -> L2c
            r3.f12540f = r5     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = r4.getMessage()     // Catch: java.lang.Throwable -> L2c
            r5.f12524h = r2     // Catch: java.lang.Throwable -> L2c
        L40:
            java.lang.String r5 = com.mbridge.msdk.click.h.a     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L2c
            com.mbridge.msdk.foundation.tools.ad.b(r5, r4)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L59
            r1.close()     // Catch: java.lang.Exception -> L4f
            goto L59
        L4f:
            r4 = move-exception
            java.lang.String r5 = com.mbridge.msdk.click.h.a
            java.lang.String r4 = r4.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r5, r4)
        L59:
            java.lang.String r4 = r0.toString()
            return r4
        L5e:
            if (r1 == 0) goto L6e
            r1.close()     // Catch: java.lang.Exception -> L64
            goto L6e
        L64:
            r5 = move-exception
            java.lang.String r0 = com.mbridge.msdk.click.h.a
            java.lang.String r5 = r5.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r0, r5)
        L6e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.h.a(java.io.InputStream, boolean):java.lang.String");
    }
}
