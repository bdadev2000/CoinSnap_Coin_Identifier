package com.applovin.impl;

import com.applovin.impl.qi;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.security.ProviderInstaller;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class im extends xl {

    /* renamed from: k, reason: collision with root package name */
    private static final AtomicBoolean f8318k = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    private final int f8319h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f8320i;

    /* renamed from: j, reason: collision with root package name */
    private b f8321j;

    /* loaded from: classes.dex */
    public interface b {
        void a(JSONObject jSONObject);
    }

    /* loaded from: classes.dex */
    public class c extends xl {
        public c(com.applovin.impl.sdk.k kVar) {
            super("TaskTimeoutFetchBasicSettings", kVar, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (im.this.f8321j != null) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f12279c.b(this.b, "Timing out fetch basic settings...");
                }
                im.this.a(new JSONObject());
            }
        }
    }

    public im(int i9, com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskFetchBasicSettings", kVar, true);
        this.f8320i = new Object();
        this.f8319h = i9;
        this.f8321j = bVar;
    }

    private String f() {
        return c4.a((String) this.f12278a.a(oj.f9598H0), "5.0/i", b());
    }

    private String g() {
        return c4.a((String) this.f12278a.a(oj.f9592G0), "5.0/i", b());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(41:1|2|3|(38:5|(1:7)|8|(1:10)|11|(1:13)|14|(1:16)(1:106)|17|(1:19)(2:102|(1:104)(1:105))|(1:23)|24|(1:26)|27|(1:29)(1:101)|30|(1:32)|33|34|(1:36)|38|(1:42)|43|44|(4:46|(1:52)|53|(1:58))(4:87|(1:93)|94|(1:99))|59|(2:61|(1:63))|64|(1:66)|67|(1:69)|70|(1:72)|73|(1:77)|78|(3:80|(1:82)|83)|85)|107|8|(0)|11|(0)|14|(0)(0)|17|(0)(0)|(2:21|23)|24|(0)|27|(0)(0)|30|(0)|33|34|(0)|38|(2:40|42)|43|44|(0)(0)|59|(0)|64|(0)|67|(0)|70|(0)|73|(2:75|77)|78|(0)|85) */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d0 A[Catch: JSONException -> 0x005e, TryCatch #1 {JSONException -> 0x005e, blocks: (B:3:0x003d, B:5:0x004f, B:8:0x006e, B:10:0x00ac, B:11:0x00b1, B:13:0x00b9, B:14:0x00be, B:16:0x0110, B:17:0x0125, B:19:0x015b, B:21:0x017c, B:23:0x0182, B:24:0x0193, B:26:0x01a9, B:27:0x01ae, B:29:0x01c5, B:30:0x01da, B:32:0x0249, B:38:0x028a, B:40:0x0292, B:42:0x0298, B:43:0x02a2, B:46:0x02ac, B:48:0x02e6, B:50:0x02f0, B:52:0x02f8, B:53:0x0301, B:56:0x031d, B:58:0x0325, B:59:0x03c0, B:61:0x03c8, B:63:0x03d8, B:64:0x03e1, B:66:0x03f1, B:67:0x03fc, B:69:0x040c, B:70:0x0417, B:72:0x0423, B:73:0x0429, B:75:0x0435, B:77:0x043b, B:78:0x0440, B:80:0x0459, B:82:0x0465, B:83:0x046e, B:87:0x0339, B:89:0x0373, B:91:0x037d, B:93:0x0385, B:94:0x038e, B:97:0x03aa, B:99:0x03b2, B:101:0x01d0, B:102:0x0166, B:104:0x016e, B:106:0x011b, B:107:0x0061), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0166 A[Catch: JSONException -> 0x005e, TryCatch #1 {JSONException -> 0x005e, blocks: (B:3:0x003d, B:5:0x004f, B:8:0x006e, B:10:0x00ac, B:11:0x00b1, B:13:0x00b9, B:14:0x00be, B:16:0x0110, B:17:0x0125, B:19:0x015b, B:21:0x017c, B:23:0x0182, B:24:0x0193, B:26:0x01a9, B:27:0x01ae, B:29:0x01c5, B:30:0x01da, B:32:0x0249, B:38:0x028a, B:40:0x0292, B:42:0x0298, B:43:0x02a2, B:46:0x02ac, B:48:0x02e6, B:50:0x02f0, B:52:0x02f8, B:53:0x0301, B:56:0x031d, B:58:0x0325, B:59:0x03c0, B:61:0x03c8, B:63:0x03d8, B:64:0x03e1, B:66:0x03f1, B:67:0x03fc, B:69:0x040c, B:70:0x0417, B:72:0x0423, B:73:0x0429, B:75:0x0435, B:77:0x043b, B:78:0x0440, B:80:0x0459, B:82:0x0465, B:83:0x046e, B:87:0x0339, B:89:0x0373, B:91:0x037d, B:93:0x0385, B:94:0x038e, B:97:0x03aa, B:99:0x03b2, B:101:0x01d0, B:102:0x0166, B:104:0x016e, B:106:0x011b, B:107:0x0061), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011b A[Catch: JSONException -> 0x005e, TryCatch #1 {JSONException -> 0x005e, blocks: (B:3:0x003d, B:5:0x004f, B:8:0x006e, B:10:0x00ac, B:11:0x00b1, B:13:0x00b9, B:14:0x00be, B:16:0x0110, B:17:0x0125, B:19:0x015b, B:21:0x017c, B:23:0x0182, B:24:0x0193, B:26:0x01a9, B:27:0x01ae, B:29:0x01c5, B:30:0x01da, B:32:0x0249, B:38:0x028a, B:40:0x0292, B:42:0x0298, B:43:0x02a2, B:46:0x02ac, B:48:0x02e6, B:50:0x02f0, B:52:0x02f8, B:53:0x0301, B:56:0x031d, B:58:0x0325, B:59:0x03c0, B:61:0x03c8, B:63:0x03d8, B:64:0x03e1, B:66:0x03f1, B:67:0x03fc, B:69:0x040c, B:70:0x0417, B:72:0x0423, B:73:0x0429, B:75:0x0435, B:77:0x043b, B:78:0x0440, B:80:0x0459, B:82:0x0465, B:83:0x046e, B:87:0x0339, B:89:0x0373, B:91:0x037d, B:93:0x0385, B:94:0x038e, B:97:0x03aa, B:99:0x03b2, B:101:0x01d0, B:102:0x0166, B:104:0x016e, B:106:0x011b, B:107:0x0061), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00ac A[Catch: JSONException -> 0x005e, TryCatch #1 {JSONException -> 0x005e, blocks: (B:3:0x003d, B:5:0x004f, B:8:0x006e, B:10:0x00ac, B:11:0x00b1, B:13:0x00b9, B:14:0x00be, B:16:0x0110, B:17:0x0125, B:19:0x015b, B:21:0x017c, B:23:0x0182, B:24:0x0193, B:26:0x01a9, B:27:0x01ae, B:29:0x01c5, B:30:0x01da, B:32:0x0249, B:38:0x028a, B:40:0x0292, B:42:0x0298, B:43:0x02a2, B:46:0x02ac, B:48:0x02e6, B:50:0x02f0, B:52:0x02f8, B:53:0x0301, B:56:0x031d, B:58:0x0325, B:59:0x03c0, B:61:0x03c8, B:63:0x03d8, B:64:0x03e1, B:66:0x03f1, B:67:0x03fc, B:69:0x040c, B:70:0x0417, B:72:0x0423, B:73:0x0429, B:75:0x0435, B:77:0x043b, B:78:0x0440, B:80:0x0459, B:82:0x0465, B:83:0x046e, B:87:0x0339, B:89:0x0373, B:91:0x037d, B:93:0x0385, B:94:0x038e, B:97:0x03aa, B:99:0x03b2, B:101:0x01d0, B:102:0x0166, B:104:0x016e, B:106:0x011b, B:107:0x0061), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b9 A[Catch: JSONException -> 0x005e, TryCatch #1 {JSONException -> 0x005e, blocks: (B:3:0x003d, B:5:0x004f, B:8:0x006e, B:10:0x00ac, B:11:0x00b1, B:13:0x00b9, B:14:0x00be, B:16:0x0110, B:17:0x0125, B:19:0x015b, B:21:0x017c, B:23:0x0182, B:24:0x0193, B:26:0x01a9, B:27:0x01ae, B:29:0x01c5, B:30:0x01da, B:32:0x0249, B:38:0x028a, B:40:0x0292, B:42:0x0298, B:43:0x02a2, B:46:0x02ac, B:48:0x02e6, B:50:0x02f0, B:52:0x02f8, B:53:0x0301, B:56:0x031d, B:58:0x0325, B:59:0x03c0, B:61:0x03c8, B:63:0x03d8, B:64:0x03e1, B:66:0x03f1, B:67:0x03fc, B:69:0x040c, B:70:0x0417, B:72:0x0423, B:73:0x0429, B:75:0x0435, B:77:0x043b, B:78:0x0440, B:80:0x0459, B:82:0x0465, B:83:0x046e, B:87:0x0339, B:89:0x0373, B:91:0x037d, B:93:0x0385, B:94:0x038e, B:97:0x03aa, B:99:0x03b2, B:101:0x01d0, B:102:0x0166, B:104:0x016e, B:106:0x011b, B:107:0x0061), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0110 A[Catch: JSONException -> 0x005e, TryCatch #1 {JSONException -> 0x005e, blocks: (B:3:0x003d, B:5:0x004f, B:8:0x006e, B:10:0x00ac, B:11:0x00b1, B:13:0x00b9, B:14:0x00be, B:16:0x0110, B:17:0x0125, B:19:0x015b, B:21:0x017c, B:23:0x0182, B:24:0x0193, B:26:0x01a9, B:27:0x01ae, B:29:0x01c5, B:30:0x01da, B:32:0x0249, B:38:0x028a, B:40:0x0292, B:42:0x0298, B:43:0x02a2, B:46:0x02ac, B:48:0x02e6, B:50:0x02f0, B:52:0x02f8, B:53:0x0301, B:56:0x031d, B:58:0x0325, B:59:0x03c0, B:61:0x03c8, B:63:0x03d8, B:64:0x03e1, B:66:0x03f1, B:67:0x03fc, B:69:0x040c, B:70:0x0417, B:72:0x0423, B:73:0x0429, B:75:0x0435, B:77:0x043b, B:78:0x0440, B:80:0x0459, B:82:0x0465, B:83:0x046e, B:87:0x0339, B:89:0x0373, B:91:0x037d, B:93:0x0385, B:94:0x038e, B:97:0x03aa, B:99:0x03b2, B:101:0x01d0, B:102:0x0166, B:104:0x016e, B:106:0x011b, B:107:0x0061), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x015b A[Catch: JSONException -> 0x005e, TryCatch #1 {JSONException -> 0x005e, blocks: (B:3:0x003d, B:5:0x004f, B:8:0x006e, B:10:0x00ac, B:11:0x00b1, B:13:0x00b9, B:14:0x00be, B:16:0x0110, B:17:0x0125, B:19:0x015b, B:21:0x017c, B:23:0x0182, B:24:0x0193, B:26:0x01a9, B:27:0x01ae, B:29:0x01c5, B:30:0x01da, B:32:0x0249, B:38:0x028a, B:40:0x0292, B:42:0x0298, B:43:0x02a2, B:46:0x02ac, B:48:0x02e6, B:50:0x02f0, B:52:0x02f8, B:53:0x0301, B:56:0x031d, B:58:0x0325, B:59:0x03c0, B:61:0x03c8, B:63:0x03d8, B:64:0x03e1, B:66:0x03f1, B:67:0x03fc, B:69:0x040c, B:70:0x0417, B:72:0x0423, B:73:0x0429, B:75:0x0435, B:77:0x043b, B:78:0x0440, B:80:0x0459, B:82:0x0465, B:83:0x046e, B:87:0x0339, B:89:0x0373, B:91:0x037d, B:93:0x0385, B:94:0x038e, B:97:0x03aa, B:99:0x03b2, B:101:0x01d0, B:102:0x0166, B:104:0x016e, B:106:0x011b, B:107:0x0061), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a9 A[Catch: JSONException -> 0x005e, TryCatch #1 {JSONException -> 0x005e, blocks: (B:3:0x003d, B:5:0x004f, B:8:0x006e, B:10:0x00ac, B:11:0x00b1, B:13:0x00b9, B:14:0x00be, B:16:0x0110, B:17:0x0125, B:19:0x015b, B:21:0x017c, B:23:0x0182, B:24:0x0193, B:26:0x01a9, B:27:0x01ae, B:29:0x01c5, B:30:0x01da, B:32:0x0249, B:38:0x028a, B:40:0x0292, B:42:0x0298, B:43:0x02a2, B:46:0x02ac, B:48:0x02e6, B:50:0x02f0, B:52:0x02f8, B:53:0x0301, B:56:0x031d, B:58:0x0325, B:59:0x03c0, B:61:0x03c8, B:63:0x03d8, B:64:0x03e1, B:66:0x03f1, B:67:0x03fc, B:69:0x040c, B:70:0x0417, B:72:0x0423, B:73:0x0429, B:75:0x0435, B:77:0x043b, B:78:0x0440, B:80:0x0459, B:82:0x0465, B:83:0x046e, B:87:0x0339, B:89:0x0373, B:91:0x037d, B:93:0x0385, B:94:0x038e, B:97:0x03aa, B:99:0x03b2, B:101:0x01d0, B:102:0x0166, B:104:0x016e, B:106:0x011b, B:107:0x0061), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01c5 A[Catch: JSONException -> 0x005e, TryCatch #1 {JSONException -> 0x005e, blocks: (B:3:0x003d, B:5:0x004f, B:8:0x006e, B:10:0x00ac, B:11:0x00b1, B:13:0x00b9, B:14:0x00be, B:16:0x0110, B:17:0x0125, B:19:0x015b, B:21:0x017c, B:23:0x0182, B:24:0x0193, B:26:0x01a9, B:27:0x01ae, B:29:0x01c5, B:30:0x01da, B:32:0x0249, B:38:0x028a, B:40:0x0292, B:42:0x0298, B:43:0x02a2, B:46:0x02ac, B:48:0x02e6, B:50:0x02f0, B:52:0x02f8, B:53:0x0301, B:56:0x031d, B:58:0x0325, B:59:0x03c0, B:61:0x03c8, B:63:0x03d8, B:64:0x03e1, B:66:0x03f1, B:67:0x03fc, B:69:0x040c, B:70:0x0417, B:72:0x0423, B:73:0x0429, B:75:0x0435, B:77:0x043b, B:78:0x0440, B:80:0x0459, B:82:0x0465, B:83:0x046e, B:87:0x0339, B:89:0x0373, B:91:0x037d, B:93:0x0385, B:94:0x038e, B:97:0x03aa, B:99:0x03b2, B:101:0x01d0, B:102:0x0166, B:104:0x016e, B:106:0x011b, B:107:0x0061), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0249 A[Catch: JSONException -> 0x005e, TRY_LEAVE, TryCatch #1 {JSONException -> 0x005e, blocks: (B:3:0x003d, B:5:0x004f, B:8:0x006e, B:10:0x00ac, B:11:0x00b1, B:13:0x00b9, B:14:0x00be, B:16:0x0110, B:17:0x0125, B:19:0x015b, B:21:0x017c, B:23:0x0182, B:24:0x0193, B:26:0x01a9, B:27:0x01ae, B:29:0x01c5, B:30:0x01da, B:32:0x0249, B:38:0x028a, B:40:0x0292, B:42:0x0298, B:43:0x02a2, B:46:0x02ac, B:48:0x02e6, B:50:0x02f0, B:52:0x02f8, B:53:0x0301, B:56:0x031d, B:58:0x0325, B:59:0x03c0, B:61:0x03c8, B:63:0x03d8, B:64:0x03e1, B:66:0x03f1, B:67:0x03fc, B:69:0x040c, B:70:0x0417, B:72:0x0423, B:73:0x0429, B:75:0x0435, B:77:0x043b, B:78:0x0440, B:80:0x0459, B:82:0x0465, B:83:0x046e, B:87:0x0339, B:89:0x0373, B:91:0x037d, B:93:0x0385, B:94:0x038e, B:97:0x03aa, B:99:0x03b2, B:101:0x01d0, B:102:0x0166, B:104:0x016e, B:106:0x011b, B:107:0x0061), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x026b A[Catch: all -> 0x028a, TRY_LEAVE, TryCatch #0 {all -> 0x028a, blocks: (B:34:0x0258, B:36:0x026b), top: B:33:0x0258 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02ac A[Catch: JSONException -> 0x005e, TRY_ENTER, TryCatch #1 {JSONException -> 0x005e, blocks: (B:3:0x003d, B:5:0x004f, B:8:0x006e, B:10:0x00ac, B:11:0x00b1, B:13:0x00b9, B:14:0x00be, B:16:0x0110, B:17:0x0125, B:19:0x015b, B:21:0x017c, B:23:0x0182, B:24:0x0193, B:26:0x01a9, B:27:0x01ae, B:29:0x01c5, B:30:0x01da, B:32:0x0249, B:38:0x028a, B:40:0x0292, B:42:0x0298, B:43:0x02a2, B:46:0x02ac, B:48:0x02e6, B:50:0x02f0, B:52:0x02f8, B:53:0x0301, B:56:0x031d, B:58:0x0325, B:59:0x03c0, B:61:0x03c8, B:63:0x03d8, B:64:0x03e1, B:66:0x03f1, B:67:0x03fc, B:69:0x040c, B:70:0x0417, B:72:0x0423, B:73:0x0429, B:75:0x0435, B:77:0x043b, B:78:0x0440, B:80:0x0459, B:82:0x0465, B:83:0x046e, B:87:0x0339, B:89:0x0373, B:91:0x037d, B:93:0x0385, B:94:0x038e, B:97:0x03aa, B:99:0x03b2, B:101:0x01d0, B:102:0x0166, B:104:0x016e, B:106:0x011b, B:107:0x0061), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03c8 A[Catch: JSONException -> 0x005e, TryCatch #1 {JSONException -> 0x005e, blocks: (B:3:0x003d, B:5:0x004f, B:8:0x006e, B:10:0x00ac, B:11:0x00b1, B:13:0x00b9, B:14:0x00be, B:16:0x0110, B:17:0x0125, B:19:0x015b, B:21:0x017c, B:23:0x0182, B:24:0x0193, B:26:0x01a9, B:27:0x01ae, B:29:0x01c5, B:30:0x01da, B:32:0x0249, B:38:0x028a, B:40:0x0292, B:42:0x0298, B:43:0x02a2, B:46:0x02ac, B:48:0x02e6, B:50:0x02f0, B:52:0x02f8, B:53:0x0301, B:56:0x031d, B:58:0x0325, B:59:0x03c0, B:61:0x03c8, B:63:0x03d8, B:64:0x03e1, B:66:0x03f1, B:67:0x03fc, B:69:0x040c, B:70:0x0417, B:72:0x0423, B:73:0x0429, B:75:0x0435, B:77:0x043b, B:78:0x0440, B:80:0x0459, B:82:0x0465, B:83:0x046e, B:87:0x0339, B:89:0x0373, B:91:0x037d, B:93:0x0385, B:94:0x038e, B:97:0x03aa, B:99:0x03b2, B:101:0x01d0, B:102:0x0166, B:104:0x016e, B:106:0x011b, B:107:0x0061), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03f1 A[Catch: JSONException -> 0x005e, TryCatch #1 {JSONException -> 0x005e, blocks: (B:3:0x003d, B:5:0x004f, B:8:0x006e, B:10:0x00ac, B:11:0x00b1, B:13:0x00b9, B:14:0x00be, B:16:0x0110, B:17:0x0125, B:19:0x015b, B:21:0x017c, B:23:0x0182, B:24:0x0193, B:26:0x01a9, B:27:0x01ae, B:29:0x01c5, B:30:0x01da, B:32:0x0249, B:38:0x028a, B:40:0x0292, B:42:0x0298, B:43:0x02a2, B:46:0x02ac, B:48:0x02e6, B:50:0x02f0, B:52:0x02f8, B:53:0x0301, B:56:0x031d, B:58:0x0325, B:59:0x03c0, B:61:0x03c8, B:63:0x03d8, B:64:0x03e1, B:66:0x03f1, B:67:0x03fc, B:69:0x040c, B:70:0x0417, B:72:0x0423, B:73:0x0429, B:75:0x0435, B:77:0x043b, B:78:0x0440, B:80:0x0459, B:82:0x0465, B:83:0x046e, B:87:0x0339, B:89:0x0373, B:91:0x037d, B:93:0x0385, B:94:0x038e, B:97:0x03aa, B:99:0x03b2, B:101:0x01d0, B:102:0x0166, B:104:0x016e, B:106:0x011b, B:107:0x0061), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x040c A[Catch: JSONException -> 0x005e, TryCatch #1 {JSONException -> 0x005e, blocks: (B:3:0x003d, B:5:0x004f, B:8:0x006e, B:10:0x00ac, B:11:0x00b1, B:13:0x00b9, B:14:0x00be, B:16:0x0110, B:17:0x0125, B:19:0x015b, B:21:0x017c, B:23:0x0182, B:24:0x0193, B:26:0x01a9, B:27:0x01ae, B:29:0x01c5, B:30:0x01da, B:32:0x0249, B:38:0x028a, B:40:0x0292, B:42:0x0298, B:43:0x02a2, B:46:0x02ac, B:48:0x02e6, B:50:0x02f0, B:52:0x02f8, B:53:0x0301, B:56:0x031d, B:58:0x0325, B:59:0x03c0, B:61:0x03c8, B:63:0x03d8, B:64:0x03e1, B:66:0x03f1, B:67:0x03fc, B:69:0x040c, B:70:0x0417, B:72:0x0423, B:73:0x0429, B:75:0x0435, B:77:0x043b, B:78:0x0440, B:80:0x0459, B:82:0x0465, B:83:0x046e, B:87:0x0339, B:89:0x0373, B:91:0x037d, B:93:0x0385, B:94:0x038e, B:97:0x03aa, B:99:0x03b2, B:101:0x01d0, B:102:0x0166, B:104:0x016e, B:106:0x011b, B:107:0x0061), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0423 A[Catch: JSONException -> 0x005e, TryCatch #1 {JSONException -> 0x005e, blocks: (B:3:0x003d, B:5:0x004f, B:8:0x006e, B:10:0x00ac, B:11:0x00b1, B:13:0x00b9, B:14:0x00be, B:16:0x0110, B:17:0x0125, B:19:0x015b, B:21:0x017c, B:23:0x0182, B:24:0x0193, B:26:0x01a9, B:27:0x01ae, B:29:0x01c5, B:30:0x01da, B:32:0x0249, B:38:0x028a, B:40:0x0292, B:42:0x0298, B:43:0x02a2, B:46:0x02ac, B:48:0x02e6, B:50:0x02f0, B:52:0x02f8, B:53:0x0301, B:56:0x031d, B:58:0x0325, B:59:0x03c0, B:61:0x03c8, B:63:0x03d8, B:64:0x03e1, B:66:0x03f1, B:67:0x03fc, B:69:0x040c, B:70:0x0417, B:72:0x0423, B:73:0x0429, B:75:0x0435, B:77:0x043b, B:78:0x0440, B:80:0x0459, B:82:0x0465, B:83:0x046e, B:87:0x0339, B:89:0x0373, B:91:0x037d, B:93:0x0385, B:94:0x038e, B:97:0x03aa, B:99:0x03b2, B:101:0x01d0, B:102:0x0166, B:104:0x016e, B:106:0x011b, B:107:0x0061), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0459 A[Catch: JSONException -> 0x005e, TryCatch #1 {JSONException -> 0x005e, blocks: (B:3:0x003d, B:5:0x004f, B:8:0x006e, B:10:0x00ac, B:11:0x00b1, B:13:0x00b9, B:14:0x00be, B:16:0x0110, B:17:0x0125, B:19:0x015b, B:21:0x017c, B:23:0x0182, B:24:0x0193, B:26:0x01a9, B:27:0x01ae, B:29:0x01c5, B:30:0x01da, B:32:0x0249, B:38:0x028a, B:40:0x0292, B:42:0x0298, B:43:0x02a2, B:46:0x02ac, B:48:0x02e6, B:50:0x02f0, B:52:0x02f8, B:53:0x0301, B:56:0x031d, B:58:0x0325, B:59:0x03c0, B:61:0x03c8, B:63:0x03d8, B:64:0x03e1, B:66:0x03f1, B:67:0x03fc, B:69:0x040c, B:70:0x0417, B:72:0x0423, B:73:0x0429, B:75:0x0435, B:77:0x043b, B:78:0x0440, B:80:0x0459, B:82:0x0465, B:83:0x046e, B:87:0x0339, B:89:0x0373, B:91:0x037d, B:93:0x0385, B:94:0x038e, B:97:0x03aa, B:99:0x03b2, B:101:0x01d0, B:102:0x0166, B:104:0x016e, B:106:0x011b, B:107:0x0061), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0339 A[Catch: JSONException -> 0x005e, TryCatch #1 {JSONException -> 0x005e, blocks: (B:3:0x003d, B:5:0x004f, B:8:0x006e, B:10:0x00ac, B:11:0x00b1, B:13:0x00b9, B:14:0x00be, B:16:0x0110, B:17:0x0125, B:19:0x015b, B:21:0x017c, B:23:0x0182, B:24:0x0193, B:26:0x01a9, B:27:0x01ae, B:29:0x01c5, B:30:0x01da, B:32:0x0249, B:38:0x028a, B:40:0x0292, B:42:0x0298, B:43:0x02a2, B:46:0x02ac, B:48:0x02e6, B:50:0x02f0, B:52:0x02f8, B:53:0x0301, B:56:0x031d, B:58:0x0325, B:59:0x03c0, B:61:0x03c8, B:63:0x03d8, B:64:0x03e1, B:66:0x03f1, B:67:0x03fc, B:69:0x040c, B:70:0x0417, B:72:0x0423, B:73:0x0429, B:75:0x0435, B:77:0x043b, B:78:0x0440, B:80:0x0459, B:82:0x0465, B:83:0x046e, B:87:0x0339, B:89:0x0373, B:91:0x037d, B:93:0x0385, B:94:0x038e, B:97:0x03aa, B:99:0x03b2, B:101:0x01d0, B:102:0x0166, B:104:0x016e, B:106:0x011b, B:107:0x0061), top: B:2:0x003d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.json.JSONObject e() {
        /*
            Method dump skipped, instructions count: 1199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.im.e():org.json.JSONObject");
    }

    public Map h() {
        HashMap hashMap = new HashMap();
        if (!((Boolean) this.f12278a.a(oj.f9885x5)).booleanValue() && !((Boolean) this.f12278a.a(oj.f9877w5)).booleanValue()) {
            hashMap.put("rid", UUID.randomUUID().toString());
        }
        if (!((Boolean) this.f12278a.a(oj.f9790j5)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f12278a.d0());
        }
        Boolean b8 = y3.b().b(a());
        if (b8 != null) {
            hashMap.put("huc", b8.toString());
        }
        Boolean b9 = y3.c().b(a());
        if (b9 != null) {
            hashMap.put("aru", b9.toString());
        }
        Boolean b10 = y3.a().b(a());
        if (b10 != null) {
            hashMap.put("dns", b10.toString());
        }
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!x3.k() && f8318k.compareAndSet(false, true)) {
            try {
                ProviderInstaller.installIfNeeded(com.applovin.impl.sdk.k.k());
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f12279c.a(this.b, "Cannot update security provider", th);
                }
            }
        }
        com.applovin.impl.sdk.network.a a6 = com.applovin.impl.sdk.network.a.a(this.f12278a).b(g()).a(f()).b(h()).a(e()).b(((Boolean) this.f12278a.a(oj.I5)).booleanValue()).c("POST").a((Object) new JSONObject()).a(((Integer) this.f12278a.a(oj.f9800l3)).intValue()).b(((Integer) this.f12278a.a(oj.o3)).intValue()).c(((Integer) this.f12278a.a(oj.f9796k3)).intValue()).e(((Boolean) this.f12278a.a(oj.f9883x3)).booleanValue()).a(qi.a.a(((Integer) this.f12278a.a(oj.f9820o5)).intValue())).f(true).a();
        this.f12278a.l0().a(new c(this.f12278a), sm.b.TIMEOUT, ((Integer) this.f12278a.a(r3)).intValue() + 250);
        a aVar = new a(a6, this.f12278a, d());
        aVar.c(oj.f9592G0);
        aVar.b(oj.f9598H0);
        this.f12278a.l0().a(aVar);
    }

    /* loaded from: classes.dex */
    public class a extends en {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z8) {
            super(aVar, kVar, z8);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i9) {
            im.this.a(jSONObject);
            this.f12278a.B().a("fetchBasicSettings", str, i9);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i9, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.b(this.b, "Unable to fetch basic SDK settings: server returned " + i9);
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            im.this.a(jSONObject);
            this.f12278a.B().a("fetchBasicSettings", str, i9, CollectionUtils.hashMap("error_message", str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        b bVar;
        synchronized (this.f8320i) {
            bVar = this.f8321j;
            this.f8321j = null;
        }
        if (bVar != null) {
            bVar.a(jSONObject);
        }
    }
}
