package com.safedk.android.analytics.reporters;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.SafeDK;
import com.safedk.android.utils.e;
import com.safedk.android.utils.k;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f29855a = "exceptions";

    /* renamed from: b, reason: collision with root package name */
    public static final String f29856b = "type";

    /* renamed from: c, reason: collision with root package name */
    public static final String f29857c = "message";
    public static final String d = "lines";
    public static final String e = "proguard_map_uuid";

    /* renamed from: g, reason: collision with root package name */
    private static final String f29858g = "build_params";

    /* renamed from: h, reason: collision with root package name */
    private static final String f29859h = "crash_stacktrace";

    /* renamed from: i, reason: collision with root package name */
    private static final String f29860i = "threads_traces";

    /* renamed from: j, reason: collision with root package name */
    private static final String f29861j = "is_low_memory";

    /* renamed from: f, reason: collision with root package name */
    protected Context f29862f;

    public b() {
        this.f29862f = null;
        if (SafeDK.getInstance() != null) {
            this.f29862f = SafeDK.getInstance().l();
        }
    }

    public b(Context context) {
        this.f29862f = null;
        this.f29862f = context;
    }

    protected JSONObject a(Throwable th, boolean z2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f29858g, k.a(a()));
        jSONObject.put(f29861j, e.b(this.f29862f));
        jSONObject.put(f29859h, a(th));
        if (z2) {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                jSONArray.put(a(entry.getKey(), entry.getValue()));
            }
            jSONObject.put(f29860i, jSONArray);
        }
        String proguardMD5 = SafeDK.getProguardMD5();
        if (!TextUtils.isEmpty(proguardMD5)) {
            jSONObject.put(e, proguardMD5);
        }
        return jSONObject;
    }

    private Bundle a() {
        Bundle bundle = new Bundle();
        a(Build.class, "", bundle);
        a(Build.VERSION.class, "VERSION", bundle);
        return bundle;
    }

    private void a(Class<?> cls, String str, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        for (Field field : cls.getFields()) {
            StringBuilder sb2 = new StringBuilder();
            if (str != null && str.length() > 0) {
                sb2.append(str).append('.');
            }
            sb2.append(field.getName());
            try {
                Object obj = field.get(null);
                if (obj != null) {
                    if (field.getType().isArray()) {
                        bundle.putParcelableArrayList(sb2.toString(), (ArrayList) Arrays.asList(obj));
                    } else {
                        bundle.putString(sb2.toString(), obj.toString());
                    }
                }
            } catch (IllegalAccessException e2) {
                sb.append("N/A");
            } catch (IllegalArgumentException e3) {
                sb.append("N/A");
            } catch (Exception e4) {
            }
        }
    }

    protected JSONObject a(Throwable th) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONObject.put(f29855a, jSONArray);
        a(th, jSONArray);
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            a(cause, jSONArray);
        }
        return jSONObject;
    }

    private void a(Throwable th, JSONArray jSONArray) throws JSONException {
        if (th != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", th.getClass());
            jSONObject.put("message", th.getMessage());
            a(jSONObject, th.getStackTrace());
            jSONArray.put(jSONObject);
        }
    }

    private void a(JSONObject jSONObject, StackTraceElement[] stackTraceElementArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("c", stackTraceElement.getClassName());
            jSONObject2.put("m", stackTraceElement.getMethodName());
            jSONObject2.put("f", stackTraceElement.getFileName());
            jSONObject2.put("l", stackTraceElement.getLineNumber());
            jSONObject2.put(com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f29536f, stackTraceElement.isNativeMethod());
            jSONArray.put(jSONObject2);
        }
        jSONObject.put(d, jSONArray);
    }

    protected JSONObject a(Thread thread, StackTraceElement[] stackTraceElementArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", thread.getName());
        a(jSONObject, stackTraceElementArr);
        return jSONObject;
    }
}
