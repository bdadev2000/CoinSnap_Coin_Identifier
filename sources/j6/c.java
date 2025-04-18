package j6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.appevents.g;
import com.facebook.x;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final a f19766b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONArray f19767c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19768d;

    /* renamed from: e, reason: collision with root package name */
    public final String f19769e;

    /* renamed from: f, reason: collision with root package name */
    public final String f19770f;

    /* renamed from: g, reason: collision with root package name */
    public final Long f19771g;

    public c(JSONArray jSONArray) {
        this.f19766b = a.Analysis;
        Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f19771g = valueOf;
        this.f19767c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer("analysis_log_");
        stringBuffer.append(String.valueOf(valueOf));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.a = stringBuffer2;
    }

    public final int a(c data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Long l10 = this.f19771g;
        if (l10 == null) {
            return -1;
        }
        long longValue = l10.longValue();
        Long l11 = data.f19771g;
        if (l11 == null) {
            return 1;
        }
        return Intrinsics.compare(l11.longValue(), longValue);
    }

    public final boolean b() {
        int i10;
        a aVar = this.f19766b;
        if (aVar == null) {
            i10 = -1;
        } else {
            i10 = b.a[aVar.ordinal()];
        }
        Long l10 = this.f19771g;
        if (i10 != 1) {
            String str = this.f19770f;
            if (i10 != 2) {
                if ((i10 != 3 && i10 != 4 && i10 != 5) || str == null || l10 == null) {
                    return false;
                }
            } else if (str == null || this.f19769e == null || l10 == null) {
                return false;
            }
        } else if (this.f19767c == null || l10 == null) {
            return false;
        }
        return true;
    }

    public final void c() {
        if (!b()) {
            return;
        }
        g.N(this.a, toString());
    }

    public final String toString() {
        int i10;
        JSONObject jSONObject;
        a aVar = this.f19766b;
        if (aVar == null) {
            i10 = -1;
        } else {
            i10 = b.a[aVar.ordinal()];
        }
        Long l10 = this.f19771g;
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
                jSONObject = new JSONObject();
                jSONObject.put("device_os_version", Build.VERSION.RELEASE);
                jSONObject.put("device_model", Build.MODEL);
                String str = this.f19768d;
                if (str != null) {
                    jSONObject.put("app_version", str);
                }
                if (l10 != null) {
                    jSONObject.put(CampaignEx.JSON_KEY_TIMESTAMP, l10);
                }
                String str2 = this.f19769e;
                if (str2 != null) {
                    jSONObject.put("reason", str2);
                }
                String str3 = this.f19770f;
                if (str3 != null) {
                    jSONObject.put("callstack", str3);
                }
                if (aVar != null) {
                    jSONObject.put("type", aVar);
                }
            }
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            JSONArray jSONArray = this.f19767c;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            if (l10 != null) {
                jSONObject.put(CampaignEx.JSON_KEY_TIMESTAMP, l10);
            }
        }
        if (jSONObject == null) {
            String jSONObject2 = new JSONObject().toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "JSONObject().toString()");
            return jSONObject2;
        }
        String jSONObject3 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject3, "params.toString()");
        return jSONObject3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(java.lang.Throwable r7, j6.a r8) {
        /*
            r6 = this;
            r6.<init>()
            r6.f19766b = r8
            android.content.Context r0 = com.facebook.x.a()
            java.lang.String r1 = r0.getPackageName()
            r2 = 0
            r3 = 0
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1d
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1d
            if (r0 != 0) goto L1a
            goto L1d
        L1a:
            java.lang.String r0 = r0.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1d
            goto L1e
        L1d:
            r0 = r3
        L1e:
            r6.f19768d = r0
            if (r7 != 0) goto L24
            r0 = r3
            goto L37
        L24:
            java.lang.Throwable r0 = r7.getCause()
            if (r0 != 0) goto L2f
            java.lang.String r0 = r7.toString()
            goto L37
        L2f:
            java.lang.Throwable r0 = r7.getCause()
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L37:
            r6.f19769e = r0
            if (r7 != 0) goto L3c
            goto L69
        L3c:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
        L41:
            if (r7 == 0) goto L65
            if (r7 == r3) goto L65
            java.lang.StackTraceElement[] r1 = r7.getStackTrace()
            java.lang.String r3 = "t.stackTrace"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            int r3 = r1.length
            r4 = r2
        L50:
            if (r4 >= r3) goto L5e
            r5 = r1[r4]
            int r4 = r4 + 1
            java.lang.String r5 = r5.toString()
            r0.put(r5)
            goto L50
        L5e:
            java.lang.Throwable r1 = r7.getCause()
            r3 = r7
            r7 = r1
            goto L41
        L65:
            java.lang.String r3 = r0.toString()
        L69:
            r6.f19770f = r3
            long r0 = java.lang.System.currentTimeMillis()
            r7 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r7
            long r0 = r0 / r2
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            r6.f19771g = r7
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            int r8 = r8.ordinal()
            r1 = 1
            if (r8 == r1) goto La0
            r1 = 2
            if (r8 == r1) goto L9d
            r1 = 3
            if (r8 == r1) goto L9a
            r1 = 4
            if (r8 == r1) goto L97
            r1 = 5
            if (r8 == r1) goto L94
            java.lang.String r8 = "Unknown"
            goto La2
        L94:
            java.lang.String r8 = "thread_check_log_"
            goto La2
        L97:
            java.lang.String r8 = "shield_log_"
            goto La2
        L9a:
            java.lang.String r8 = "crash_log_"
            goto La2
        L9d:
            java.lang.String r8 = "anr_log_"
            goto La2
        La0:
            java.lang.String r8 = "analysis_log_"
        La2:
            r0.append(r8)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r0.append(r7)
            java.lang.String r7 = ".json"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r8 = "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            r6.a = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.c.<init>(java.lang.Throwable, j6.a):void");
    }

    public c(String str, String str2) {
        this.f19766b = a.AnrReport;
        Context a = x.a();
        String str3 = null;
        try {
            PackageInfo packageInfo = a.getPackageManager().getPackageInfo(a.getPackageName(), 0);
            if (packageInfo != null) {
                str3 = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        this.f19768d = str3;
        this.f19769e = str;
        this.f19770f = str2;
        Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f19771g = valueOf;
        StringBuffer stringBuffer = new StringBuffer("anr_log_");
        stringBuffer.append(String.valueOf(valueOf));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.a = stringBuffer2;
    }

    public c(File file) {
        boolean startsWith$default;
        boolean startsWith$default2;
        boolean startsWith$default3;
        boolean startsWith$default4;
        boolean startsWith$default5;
        a aVar;
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        this.a = name;
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(name, "crash_log_", false, 2, null);
        if (startsWith$default) {
            aVar = a.CrashReport;
        } else {
            startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(name, "shield_log_", false, 2, null);
            if (startsWith$default2) {
                aVar = a.CrashShield;
            } else {
                startsWith$default3 = StringsKt__StringsJVMKt.startsWith$default(name, "thread_check_log_", false, 2, null);
                if (startsWith$default3) {
                    aVar = a.ThreadCheck;
                } else {
                    startsWith$default4 = StringsKt__StringsJVMKt.startsWith$default(name, "analysis_log_", false, 2, null);
                    if (startsWith$default4) {
                        aVar = a.Analysis;
                    } else {
                        startsWith$default5 = StringsKt__StringsJVMKt.startsWith$default(name, "anr_log_", false, 2, null);
                        if (startsWith$default5) {
                            aVar = a.AnrReport;
                        } else {
                            aVar = a.Unknown;
                        }
                    }
                }
            }
        }
        this.f19766b = aVar;
        JSONObject G = g.G(name);
        if (G != null) {
            this.f19771g = Long.valueOf(G.optLong(CampaignEx.JSON_KEY_TIMESTAMP, 0L));
            this.f19768d = G.optString("app_version", null);
            this.f19769e = G.optString("reason", null);
            this.f19770f = G.optString("callstack", null);
            this.f19767c = G.optJSONArray("feature_names");
        }
    }
}
