package lb;

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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y7.u;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f21307b = Charset.forName("UTF-8");
    public final ob.c a;

    public g(ob.c cVar) {
        this.a = cVar;
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
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                u uVar = n.a;
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString("rolloutId");
                String string3 = jSONObject.getString("parameterKey");
                String string4 = jSONObject.getString("parameterValue");
                String string5 = jSONObject.getString("variantId");
                long j3 = jSONObject.getLong("templateVersion");
                if (string4.length() > 256) {
                    str2 = string4.substring(0, NotificationCompat.FLAG_LOCAL_ONLY);
                } else {
                    str2 = string4;
                }
                arrayList.add(new b(string2, string3, str2, string5, j3));
            } catch (Exception e2) {
                b6.a.f2288f.i("Failed de-serializing rollouts state. " + string, e2);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(n.a.c(list.get(i10))));
            } catch (JSONException e2) {
                b6.a.f2288f.i("Exception parsing rollout assignment!", e2);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            b6.a.f2288f.f("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [long] */
    public final Map c(String str, boolean z10) {
        File o10;
        FileInputStream fileInputStream;
        Exception e2;
        ob.c cVar = this.a;
        if (z10) {
            o10 = cVar.o(str, "internal-keys");
        } else {
            o10 = cVar.o(str, "keys");
        }
        if (o10.exists()) {
            ?? length = o10.length();
            if (length != 0) {
                Closeable closeable = null;
                try {
                    try {
                        fileInputStream = new FileInputStream(o10);
                    } catch (Exception e10) {
                        fileInputStream = null;
                        e2 = e10;
                    } catch (Throwable th2) {
                        th = th2;
                        jb.g.c(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                    try {
                        HashMap a = a(jb.g.J(fileInputStream));
                        jb.g.c(fileInputStream, "Failed to close user metadata file.");
                        return a;
                    } catch (Exception e11) {
                        e2 = e11;
                        b6.a.f2288f.i("Error deserializing user metadata.", e2);
                        f(o10);
                        jb.g.c(fileInputStream, "Failed to close user metadata file.");
                        return Collections.emptyMap();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    closeable = length;
                    jb.g.c(closeable, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        f(o10);
        return Collections.emptyMap();
    }

    public final String d(String str) {
        FileInputStream fileInputStream;
        String str2;
        File o10 = this.a.o(str, "user-data");
        boolean exists = o10.exists();
        b6.a aVar = b6.a.f2288f;
        FileInputStream fileInputStream2 = null;
        if (exists && o10.length() != 0) {
            try {
                fileInputStream = new FileInputStream(o10);
            } catch (Exception e2) {
                e = e2;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                jb.g.c(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
            try {
                try {
                    JSONObject jSONObject = new JSONObject(jb.g.J(fileInputStream));
                    if (!jSONObject.isNull("userId")) {
                        str2 = jSONObject.optString("userId", null);
                    } else {
                        str2 = null;
                    }
                    aVar.d("Loaded userId " + str2 + " for session " + str, null);
                    jb.g.c(fileInputStream, "Failed to close user metadata file.");
                    return str2;
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream2 = fileInputStream;
                    jb.g.c(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                aVar.i("Error deserializing user metadata.", e);
                f(o10);
                jb.g.c(fileInputStream, "Failed to close user metadata file.");
                return null;
            }
        }
        aVar.d("No userId set for session " + str, null);
        f(o10);
        return null;
    }

    public final void g(String str, Map map, boolean z10) {
        File o10;
        BufferedWriter bufferedWriter;
        ob.c cVar = this.a;
        if (z10) {
            o10 = cVar.o(str, "internal-keys");
        } else {
            o10 = cVar.o(str, "keys");
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                String jSONObject = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(o10), f21307b));
                try {
                    bufferedWriter.write(jSONObject);
                    bufferedWriter.flush();
                    jb.g.c(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Exception e2) {
                    e = e2;
                    bufferedWriter2 = bufferedWriter;
                    b6.a.f2288f.i("Error serializing key/value metadata.", e);
                    f(o10);
                    jb.g.c(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    jb.g.c(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedWriter = bufferedWriter2;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    public final void h(String str, List list) {
        BufferedWriter bufferedWriter;
        File o10 = this.a.o(str, "rollouts-state");
        if (list.isEmpty()) {
            f(o10);
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                String e2 = e(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(o10), f21307b));
                try {
                    bufferedWriter.write(e2);
                    bufferedWriter.flush();
                    jb.g.c(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter2 = bufferedWriter;
                    b6.a.f2288f.i("Error serializing rollouts state.", e);
                    f(o10);
                    jb.g.c(bufferedWriter2, "Failed to close rollouts state file.");
                } catch (Throwable th2) {
                    th = th2;
                    jb.g.c(bufferedWriter, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedWriter = bufferedWriter2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }
}
