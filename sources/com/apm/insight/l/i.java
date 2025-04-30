package com.apm.insight.l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.nativecrash.NativeImpl;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public class i {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        if (r18 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0101, code lost:
    
        if (r18 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        r0 = null;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c8, code lost:
    
        if (r18 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ca, code lost:
    
        r3 = "InvalidStack.NoStackAvailable: Catch a OOM Exception without stack.\n";
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cb, code lost:
    
        r2.append(r3);
        r2 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d9, code lost:
    
        if (r18 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        r3 = "InvalidStack.NoStackAvailable: Catch a OOM Exception without stack.\n";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.apm.insight.entity.a a(java.io.File r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.l.i.a(java.io.File, boolean):com.apm.insight.entity.a");
    }

    public static JSONArray b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(new File(str), -1L);
    }

    public static String c(File file) {
        return a(file, "\n");
    }

    public static com.apm.insight.entity.a d(File file) {
        com.apm.insight.entity.a a6 = a(new File(file, "logEventStack"), file.getName().contains("oom"));
        boolean z8 = false;
        for (int i9 = 0; i9 < com.apm.insight.g.d.a(); i9++) {
            File a9 = o.a(file, "." + i9);
            if (a9.exists()) {
                try {
                    a6.c(new JSONObject(c(a9.getAbsolutePath())));
                    z8 = true;
                } catch (Throwable unused) {
                }
            }
        }
        a6.a("crash_type", z8 ? "step" : "simple");
        JSONObject optJSONObject = a6.h().optJSONObject("header");
        JSONObject f9 = Header.a(com.apm.insight.i.g(), a6.h().optLong("crash_time", 0L)).f();
        if (optJSONObject == null) {
            a6.a(f9);
        } else {
            l.a(optJSONObject, f9);
        }
        return a6;
    }

    public static com.apm.insight.entity.e e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(c(str));
            com.apm.insight.entity.e eVar = new com.apm.insight.entity.e();
            eVar.d(jSONObject.optString("aid"));
            eVar.c(jSONObject.optString("did"));
            eVar.e(jSONObject.optString("processName"));
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("alogFiles");
            if (optJSONArray != null) {
                for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                    arrayList.add(optJSONArray.getString(i9));
                }
                eVar.a(arrayList);
            }
            return eVar;
        } catch (IOException e4) {
            e = e4;
            e.printStackTrace();
            return null;
        } catch (JSONException e9) {
            e = e9;
            e.printStackTrace();
            return null;
        }
    }

    public static void f(File file) {
        File file2 = new File(file, "lock");
        try {
            file2.createNewFile();
            NativeImpl.c(file2.getAbsolutePath());
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
    }

    public static boolean g(File file) {
        int c9;
        if (!file.isFile()) {
            file = new File(file, "lock");
        }
        if (!file.exists()) {
            return false;
        }
        try {
            c9 = NativeImpl.c(file.getAbsolutePath());
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
        if (c9 <= 0) {
            return c9 < 0;
        }
        NativeImpl.a(c9);
        return false;
    }

    public static JSONArray b(String str, String str2) {
        JSONArray jSONArray = new JSONArray();
        if (str != null && str2 != null) {
            for (String str3 : str.split(str2)) {
                jSONArray.put(str3);
            }
        }
        return jSONArray;
    }

    public static String c(String str) {
        return a(str, "\n");
    }

    public static com.apm.insight.entity.e d(String str) {
        try {
            String c9 = c(str);
            if (c9 == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(c9);
            com.apm.insight.entity.e eVar = new com.apm.insight.entity.e();
            eVar.a(jSONObject.optString("url"));
            eVar.a(jSONObject.optJSONObject(TtmlNode.TAG_BODY));
            eVar.b(jSONObject.optString("dump_file"));
            eVar.a(jSONObject.optBoolean("encrypt", false));
            return eVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static Map<String, String> e(File file) {
        FileInputStream fileInputStream;
        Properties properties;
        FileInputStream fileInputStream2 = null;
        try {
            properties = new Properties();
            fileInputStream = new FileInputStream(file);
        } catch (IOException e4) {
            e = e4;
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
            k.a(fileInputStream2);
            throw th;
        }
        try {
            try {
                properties.load(fileInputStream);
                Set<String> stringPropertyNames = properties.stringPropertyNames();
                HashMap hashMap = new HashMap();
                for (String str : stringPropertyNames) {
                    hashMap.put(str, properties.getProperty(str));
                }
                k.a(fileInputStream);
                return hashMap;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                k.a(fileInputStream2);
                throw th;
            }
        } catch (IOException e9) {
            e = e9;
            q.b((Throwable) e);
            k.a(fileInputStream);
            return null;
        }
    }

    public static void b(@NonNull File file, @NonNull JSONObject jSONObject, boolean z8) {
        if (jSONObject == null) {
            return;
        }
        file.getParentFile().mkdirs();
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file));
            try {
                m.a(jSONObject, bufferedWriter2);
                k.a(bufferedWriter2);
            } catch (Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
                try {
                    try {
                        jSONObject.put("err_write", th.toString());
                        com.apm.insight.entity.a.a(jSONObject, "filters", "err_write", th.getLocalizedMessage());
                    } catch (JSONException unused) {
                        com.apm.insight.c.a().a("NPTH_CATCH", th);
                        k.a(bufferedWriter);
                    }
                } catch (Throwable th2) {
                    k.a(bufferedWriter);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void c(String str, String str2) {
        a(str2, new File(str));
    }

    public static boolean b(File file) {
        String[] list = file.list();
        return list == null || list.length == 0;
    }

    public static com.apm.insight.entity.e a(File file, CrashType crashType) {
        com.apm.insight.entity.a d2 = d(file);
        String name = file.getName();
        String substring = name.substring(name.lastIndexOf(95) + 1);
        JSONObject optJSONObject = d2.h().optJSONObject("header");
        if (optJSONObject.optString("unique_key", null) == null) {
            try {
                optJSONObject.put("unique_key", "android_" + com.apm.insight.i.c().a() + "_" + substring + "_" + CrashType.LAUNCH);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        com.apm.insight.entity.e eVar = new com.apm.insight.entity.e();
        eVar.a(crashType == CrashType.LAUNCH ? com.apm.insight.k.e.e() : com.apm.insight.k.e.c());
        eVar.a(d2.h());
        eVar.a(com.apm.insight.k.e.a());
        return eVar;
    }

    public static String a(File file, String str) {
        return a(file, str, -1L);
    }

    public static String a(File file, String str, long j7) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            if (j7 > 0) {
                try {
                    bufferedReader2.skip(j7);
                    bufferedReader2.readLine();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    k.a(bufferedReader);
                    throw th;
                }
            }
            while (true) {
                String readLine = bufferedReader2.readLine();
                if (readLine == null) {
                    k.a(bufferedReader2);
                    return sb.toString();
                }
                if (sb.length() != 0 && str != null) {
                    sb.append(str);
                }
                sb.append(readLine);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String a(File file, String str, String str2, JSONObject jSONObject, String str3, boolean z8) {
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("url", str2);
            jSONObject2.put(TtmlNode.TAG_BODY, jSONObject);
            if (str3 == null) {
                str3 = "";
            }
            jSONObject2.put("dump_file", str3);
            jSONObject2.put("encrypt", z8);
            a(file2, jSONObject2, false);
        } catch (IOException e4) {
            e = e4;
            e.printStackTrace();
            return file2.getAbsolutePath();
        } catch (JSONException e9) {
            e = e9;
            e.printStackTrace();
            return file2.getAbsolutePath();
        }
        return file2.getAbsolutePath();
    }

    public static String a(File file, String str, String str2, JSONObject jSONObject, boolean z8) {
        return a(file, str, str2, jSONObject, null, z8);
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(new File(str), str2);
    }

    public static JSONArray a(@NonNull File file, long j7) {
        JSONArray jSONArray = new JSONArray();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            if (j7 > 0) {
                try {
                    bufferedReader2.skip(j7);
                    bufferedReader2.readLine();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    k.a(bufferedReader);
                    throw th;
                }
            }
            while (true) {
                String readLine = bufferedReader2.readLine();
                if (readLine == null) {
                    k.a(bufferedReader2);
                    return jSONArray;
                }
                jSONArray.put(readLine);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void a(File file, File file2) {
        FileOutputStream fileOutputStream;
        if (file == null || file2 == null) {
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            file2.getParentFile().mkdirs();
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (read <= 0) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, read);
                        }
                    }
                    k.a(fileInputStream2);
                } catch (Exception e4) {
                    e = e4;
                    fileInputStream = fileInputStream2;
                    try {
                        e.printStackTrace();
                        k.a(fileInputStream);
                        k.a(fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        k.a(fileInputStream);
                        k.a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    k.a(fileInputStream);
                    k.a(fileOutputStream);
                    throw th;
                }
            } catch (Exception e9) {
                e = e9;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Exception e10) {
            e = e10;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
        k.a(fileOutputStream);
    }

    public static void a(@NonNull File file, @NonNull String str, boolean z8) {
        FileOutputStream fileOutputStream;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        file.getParentFile().mkdirs();
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file, z8);
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(str.getBytes());
            fileOutputStream.flush();
            k.a(fileOutputStream);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            k.a(fileOutputStream2);
            throw th;
        }
    }

    @Nullable
    public static void a(File file, Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                Properties properties = new Properties();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        properties.setProperty(entry.getKey(), entry.getValue());
                    }
                    properties.store(fileOutputStream2, "no");
                    k.a(fileOutputStream2);
                } catch (IOException e4) {
                    e = e4;
                    fileOutputStream = fileOutputStream2;
                    q.b((Throwable) e);
                    k.a(fileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    k.a(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e9) {
            e = e9;
        }
    }

    public static void a(@NonNull File file, @NonNull JSONArray jSONArray, boolean z8) {
        BufferedWriter bufferedWriter;
        if (jSONArray == null) {
            return;
        }
        file.getParentFile().mkdirs();
        BufferedWriter bufferedWriter2 = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
        } catch (Throwable unused) {
        }
        try {
            m.a(jSONArray, bufferedWriter);
            k.a(bufferedWriter);
        } catch (Throwable unused2) {
            bufferedWriter2 = bufferedWriter;
            k.a(bufferedWriter2);
        }
    }

    public static void a(@NonNull File file, @NonNull JSONObject jSONObject, boolean z8) {
        BufferedWriter bufferedWriter;
        if (jSONObject == null) {
            return;
        }
        file.getParentFile().mkdirs();
        BufferedWriter bufferedWriter2 = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
        } catch (Throwable unused) {
        }
        try {
            m.a(jSONObject, bufferedWriter);
            k.a(bufferedWriter);
        } catch (Throwable unused2) {
            bufferedWriter2 = bufferedWriter;
            k.a(bufferedWriter2);
        }
    }

    public static void a(OutputStream outputStream, File... fileArr) {
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(outputStream);
            try {
                zipOutputStream2.putNextEntry(new ZipEntry("/"));
                for (File file : fileArr) {
                    a(zipOutputStream2, file);
                }
                k.a(zipOutputStream2);
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                k.a(zipOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void a(String str, File file) {
        ZipOutputStream zipOutputStream;
        ZipOutputStream zipOutputStream2 = null;
        try {
            new File(str).getParentFile().mkdirs();
            zipOutputStream = new ZipOutputStream(new FileOutputStream(str));
        } catch (Throwable th) {
            th = th;
        }
        try {
            a(zipOutputStream, file, "");
            k.a(zipOutputStream);
        } catch (Throwable th2) {
            th = th2;
            zipOutputStream2 = zipOutputStream;
            k.a(zipOutputStream2);
            throw th;
        }
    }

    private static void a(ZipOutputStream zipOutputStream, File file) {
        if (file == null || !file.exists()) {
            return;
        }
        File[] listFiles = file.isDirectory() ? file.listFiles() : new File[]{file};
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            a(zipOutputStream, file2, file2.getName());
        }
    }

    private static void a(ZipOutputStream zipOutputStream, File file, String str) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            zipOutputStream.putNextEntry(new ZipEntry(com.mbridge.msdk.foundation.entity.o.j(str, "/")));
            String concat = str.length() == 0 ? "" : str.concat("/");
            for (int i9 = 0; i9 < listFiles.length; i9++) {
                File file2 = listFiles[i9];
                StringBuilder b = AbstractC2965e.b(concat);
                b.append(listFiles[i9].getName());
                a(zipOutputStream, file2, b.toString());
            }
            return;
        }
        zipOutputStream.putNextEntry(new ZipEntry(str));
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream2.read(bArr);
                    if (-1 == read) {
                        k.a(fileInputStream2);
                        return;
                    }
                    zipOutputStream.write(bArr, 0, read);
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                k.a(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean a(@NonNull File file) {
        boolean a6;
        boolean z8 = true;
        if (!file.exists()) {
            return true;
        }
        if (!file.canWrite()) {
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        if (!file.isDirectory()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        for (int i9 = 0; listFiles != null && i9 < listFiles.length; i9++) {
            if (!listFiles[i9].isFile()) {
                a6 = a(listFiles[i9]);
            } else if (listFiles[i9].canWrite()) {
                a6 = listFiles[i9].delete();
            } else {
                z8 = false;
            }
            z8 &= a6;
        }
        return z8 & file.delete();
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return a(new File(str));
    }

    public static boolean a(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }
}
