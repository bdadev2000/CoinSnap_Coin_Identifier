package com.mbridge.msdk.click;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.L;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static volatile AtomicInteger f14846a = new AtomicInteger(1);
    private com.mbridge.msdk.c.g b;

    /* renamed from: c, reason: collision with root package name */
    private String f14847c;

    /* renamed from: d, reason: collision with root package name */
    private int f14848d = 9377;

    public l() {
        com.mbridge.msdk.c.g f9 = L.f(com.mbridge.msdk.c.h.a());
        this.b = f9;
        if (f9 == null) {
            com.mbridge.msdk.c.h.a();
            this.b = com.mbridge.msdk.c.i.a();
        }
    }

    private JSONObject b(String str, CampaignEx campaignEx, boolean z8, boolean z9) {
        JSONObject jSONObject = new JSONObject();
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                String path = parse.getPath();
                String encodedQuery = parse.getEncodedQuery();
                this.f14847c = host;
                jSONObject.put("uri", "https://" + host + path);
                jSONObject.put(DataSchemeDataSource.SCHEME_DATA, encodedQuery);
            }
        } catch (Throwable th) {
            ad.b("SocketSpider", th.getMessage());
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (!z8 && !z9) {
                jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, z.g());
            }
            if (campaignEx != null) {
                if (z8 && campaignEx.getcUA() == 1) {
                    jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, z.g());
                }
                if (z9 && campaignEx.getImpUA() == 1) {
                    jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, z.g());
                }
            } else {
                jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, z.g());
            }
            jSONObject2.put("Accept-Encoding", "gzip");
            if (this.b.aG() && !TextUtils.isEmpty(str)) {
                jSONObject2.put("referer", str);
            }
            jSONObject.put("header", jSONObject2);
        } catch (Throwable th2) {
            ad.b("SocketSpider", th2.getMessage());
        }
        return jSONObject;
    }

    public final com.mbridge.msdk.click.entity.a a(String str, CampaignEx campaignEx, boolean z8, boolean z9) {
        com.mbridge.msdk.click.entity.a aVar = new com.mbridge.msdk.click.entity.a();
        aVar.f14815g = str;
        if (TextUtils.isEmpty(str)) {
            aVar.f14816h = "request url can not null.";
            return aVar;
        }
        String replace = str.replace(" ", "%20");
        JSONObject b = b(replace, campaignEx, z8, z9);
        if (b.length() == 0) {
            aVar.f14816h = "request content generation failed.";
            return aVar;
        }
        if (TextUtils.isEmpty(b.optString("uri"))) {
            aVar.f14816h = "request url parse error.";
            return aVar;
        }
        if (campaignEx != null) {
            int trackingTcpPort = campaignEx.getTrackingTcpPort();
            if (trackingTcpPort == 0) {
                trackingTcpPort = 9377;
            }
            this.f14848d = trackingTcpPort;
        }
        if (TextUtils.isEmpty(this.f14847c)) {
            aVar.f14816h = "request url parse error.";
            return aVar;
        }
        return a(replace, b.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01df A[Catch: Exception -> 0x01b4, TRY_ENTER, TryCatch #8 {Exception -> 0x01b4, blocks: (B:67:0x01ad, B:87:0x01df, B:89:0x01e4), top: B:2:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.click.entity.a a(java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.l.a(java.lang.String, java.lang.String):com.mbridge.msdk.click.entity.a");
    }

    private String a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int read = gZIPInputStream.read(bArr2, 0, 1024);
            if (read > 0) {
                byteArrayOutputStream.write(bArr2, 0, read);
            } else {
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toString();
            }
        }
    }
}
