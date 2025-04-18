package com.safedk.android.analytics.events.base;

import android.util.Base64;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.utils.k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class StatsEventWithBundle extends StatsEvent implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final String f29842a = "CrashEvent";

    /* renamed from: b, reason: collision with root package name */
    private static final String f29843b = "report";

    /* renamed from: i, reason: collision with root package name */
    protected static final String f29844i = "metadata";

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f29845c;

    public StatsEventWithBundle(String sdk, StatsCollector.EventType eventType, JSONObject report) {
        super(sdk, eventType);
        this.E = eventType;
        this.C = sdk;
        this.G = k.b(System.currentTimeMillis());
        this.f29845c = report;
    }

    public JSONObject d() throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        k.b(f29842a, "report : " + this.f29845c);
        jSONObject.put("report", a(this.f29845c.toString().replace("\\/", RemoteSettings.FORWARD_SLASH_STRING)));
        return jSONObject;
    }

    private String a(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return new String(Base64.encode(byteArray, 2));
    }
}
