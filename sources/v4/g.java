package v4;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n1.C2475f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u4.AbstractC2762g;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class g {
    public static final Charset b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final z4.c f23616a;

    public g(z4.c cVar) {
        this.f23616a = cVar;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public static ArrayList b(String str) {
        String str2;
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            String string = jSONArray.getString(i9);
            try {
                C2475f c2475f = m.f23630a;
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString("rolloutId");
                String string3 = jSONObject.getString("parameterKey");
                String string4 = jSONObject.getString("parameterValue");
                String string5 = jSONObject.getString("variantId");
                long j7 = jSONObject.getLong("templateVersion");
                if (string4.length() > 256) {
                    str2 = string4.substring(0, NotificationCompat.FLAG_LOCAL_ONLY);
                } else {
                    str2 = string4;
                }
                arrayList.add(new C2850b(string2, string3, str2, string5, j7));
            } catch (Exception e4) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e4);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i9 = 0; i9 < list.size(); i9++) {
            try {
                jSONArray.put(new JSONObject(m.f23630a.m(list.get(i9))));
            } catch (JSONException e4) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e4);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [long] */
    public final Map c(String str, boolean z8) {
        File b8;
        FileInputStream fileInputStream;
        Exception e4;
        z4.c cVar = this.f23616a;
        if (z8) {
            b8 = cVar.b(str, "internal-keys");
        } else {
            b8 = cVar.b(str, "keys");
        }
        if (b8.exists()) {
            ?? length = b8.length();
            if (length != 0) {
                Closeable closeable = null;
                try {
                    try {
                        fileInputStream = new FileInputStream(b8);
                    } catch (Exception e9) {
                        fileInputStream = null;
                        e4 = e9;
                    } catch (Throwable th) {
                        th = th;
                        AbstractC2762g.c(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                    try {
                        HashMap a6 = a(AbstractC2762g.j(fileInputStream));
                        AbstractC2762g.c(fileInputStream, "Failed to close user metadata file.");
                        return a6;
                    } catch (Exception e10) {
                        e4 = e10;
                        Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e4);
                        f(b8);
                        AbstractC2762g.c(fileInputStream, "Failed to close user metadata file.");
                        return Collections.emptyMap();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    closeable = length;
                    AbstractC2762g.c(closeable, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        f(b8);
        return Collections.emptyMap();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    public final String d(String str) {
        FileInputStream fileInputStream;
        String str2;
        File b8 = this.f23616a.b(str, "user-data");
        Closeable closeable = null;
        if (b8.exists()) {
            ?? r32 = (b8.length() > 0L ? 1 : (b8.length() == 0L ? 0 : -1));
            try {
                if (r32 != 0) {
                    try {
                        fileInputStream = new FileInputStream(b8);
                    } catch (Exception e4) {
                        e = e4;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        AbstractC2762g.c(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(AbstractC2762g.j(fileInputStream));
                        if (!jSONObject.isNull("userId")) {
                            str2 = jSONObject.optString("userId", null);
                        } else {
                            str2 = null;
                        }
                        String str3 = "Loaded userId " + str2 + " for session " + str;
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", str3, null);
                        }
                        AbstractC2762g.c(fileInputStream, "Failed to close user metadata file.");
                        return str2;
                    } catch (Exception e9) {
                        e = e9;
                        Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                        f(b8);
                        AbstractC2762g.c(fileInputStream, "Failed to close user metadata file.");
                        return null;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = r32;
            }
        }
        String d2 = AbstractC2914a.d("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", d2, null);
        }
        f(b8);
        return null;
    }

    public final void g(String str, Map map, boolean z8) {
        File b8;
        z4.c cVar = this.f23616a;
        if (z8) {
            b8 = cVar.b(str, "internal-keys");
        } else {
            b8 = cVar.b(str, "keys");
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String jSONObject = new JSONObject(map).toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b8), b));
                try {
                    bufferedWriter2.write(jSONObject);
                    bufferedWriter2.flush();
                    AbstractC2762g.c(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e4) {
                    e = e4;
                    bufferedWriter = bufferedWriter2;
                    Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                    f(b8);
                    AbstractC2762g.c(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    AbstractC2762g.c(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    public final void h(String str, List list) {
        File b8 = this.f23616a.b(str, "rollouts-state");
        if (list.isEmpty()) {
            f(b8);
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String e4 = e(list);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b8), b));
                try {
                    bufferedWriter2.write(e4);
                    bufferedWriter2.flush();
                    AbstractC2762g.c(bufferedWriter2, "Failed to close rollouts state file.");
                } catch (Exception e9) {
                    e = e9;
                    bufferedWriter = bufferedWriter2;
                    Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                    f(b8);
                    AbstractC2762g.c(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    AbstractC2762g.c(bufferedWriter, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    public final void i(String str, String str2) {
        File b8 = this.f23616a.b(str, "user-data");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("userId", str2);
                String obj = jSONObject.toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b8), b));
                try {
                    bufferedWriter2.write(obj);
                    bufferedWriter2.flush();
                    AbstractC2762g.c(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e4) {
                    e = e4;
                    bufferedWriter = bufferedWriter2;
                    Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                    AbstractC2762g.c(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    AbstractC2762g.c(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }
}
