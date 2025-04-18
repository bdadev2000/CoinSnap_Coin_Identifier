package com.mbridge.msdk.click;

import android.net.Uri;
import android.text.TextUtils;
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
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class l {
    private static volatile AtomicInteger a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.c.g f12555b;

    /* renamed from: c, reason: collision with root package name */
    private String f12556c;

    /* renamed from: d, reason: collision with root package name */
    private int f12557d = 9377;

    public l() {
        com.mbridge.msdk.c.g d10 = com.applovin.impl.mediation.ads.e.d(com.mbridge.msdk.c.h.a());
        this.f12555b = d10;
        if (d10 == null) {
            com.mbridge.msdk.c.h.a();
            this.f12555b = com.mbridge.msdk.c.i.a();
        }
    }

    private JSONObject b(String str, CampaignEx campaignEx, boolean z10, boolean z11) {
        JSONObject jSONObject = new JSONObject();
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                String path = parse.getPath();
                String encodedQuery = parse.getEncodedQuery();
                this.f12556c = host;
                jSONObject.put("uri", "https://" + host + path);
                jSONObject.put(DataSchemeDataSource.SCHEME_DATA, encodedQuery);
            }
        } catch (Throwable th2) {
            ad.b("SocketSpider", th2.getMessage());
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (!z10 && !z11) {
                jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, z.g());
            }
            if (campaignEx != null) {
                if (z10 && campaignEx.getcUA() == 1) {
                    jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, z.g());
                }
                if (z11 && campaignEx.getImpUA() == 1) {
                    jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, z.g());
                }
            } else {
                jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, z.g());
            }
            jSONObject2.put("Accept-Encoding", "gzip");
            if (this.f12555b.aG() && !TextUtils.isEmpty(str)) {
                jSONObject2.put("referer", str);
            }
            jSONObject.put("header", jSONObject2);
        } catch (Throwable th3) {
            ad.b("SocketSpider", th3.getMessage());
        }
        return jSONObject;
    }

    public final com.mbridge.msdk.click.entity.a a(String str, CampaignEx campaignEx, boolean z10, boolean z11) {
        com.mbridge.msdk.click.entity.a aVar = new com.mbridge.msdk.click.entity.a();
        aVar.f12523g = str;
        if (TextUtils.isEmpty(str)) {
            aVar.f12524h = "request url can not null.";
            return aVar;
        }
        String replace = str.replace(" ", "%20");
        JSONObject b3 = b(replace, campaignEx, z10, z11);
        if (b3.length() == 0) {
            aVar.f12524h = "request content generation failed.";
            return aVar;
        }
        if (TextUtils.isEmpty(b3.optString("uri"))) {
            aVar.f12524h = "request url parse error.";
            return aVar;
        }
        if (campaignEx != null) {
            int trackingTcpPort = campaignEx.getTrackingTcpPort();
            if (trackingTcpPort == 0) {
                trackingTcpPort = 9377;
            }
            this.f12557d = trackingTcpPort;
        }
        if (TextUtils.isEmpty(this.f12556c)) {
            aVar.f12524h = "request url parse error.";
            return aVar;
        }
        return a(replace, b3.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01d2 A[Catch: Exception -> 0x01db, TRY_ENTER, TryCatch #4 {Exception -> 0x01db, blocks: (B:68:0x01a7, B:87:0x01d2, B:89:0x01d7), top: B:2:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.click.entity.a a(java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 506
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
        byte[] bArr2 = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
        while (true) {
            int read = gZIPInputStream.read(bArr2, 0, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
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
