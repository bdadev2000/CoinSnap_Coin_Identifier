package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class ab extends k {
    public static void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.c.g b3 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b3 == null) {
                com.mbridge.msdk.c.h.a();
                b3 = com.mbridge.msdk.c.i.a();
            }
            long currentTimeMillis = System.currentTimeMillis() - (b3.i() * 1000);
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                long currentTimeMillis2 = System.currentTimeMillis();
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (file2.lastModified() + currentTimeMillis < currentTimeMillis2) {
                            a(file2);
                            try {
                                File file3 = new File(str + ".zip");
                                if (file3.exists() && file3.isFile()) {
                                    a(file3);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    public static void b() {
        new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.ab.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                        String a = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_VC);
                        try {
                            File file = new File(a);
                            if (file.exists() && file.isDirectory()) {
                                for (File file2 : ab.b(a)) {
                                    if (file2.exists() && file2.isFile()) {
                                        file2.delete();
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                    }
                }
            }
        }).start();
    }

    private static ArrayList<File> c(File file) {
        ArrayList<File> arrayList = new ArrayList<>();
        for (File file2 : file.listFiles(new FileFilter() { // from class: com.mbridge.msdk.foundation.tools.ab.3
            @Override // java.io.FileFilter
            public final boolean accept(File file3) {
                if (!file3.isHidden() || file3.isDirectory()) {
                    return true;
                }
                return false;
            }
        })) {
            if (!file2.isDirectory()) {
                arrayList.add(file2);
            } else {
                arrayList.addAll(c(file2));
            }
        }
        return arrayList;
    }

    private static long d(File file) throws Exception {
        long j3 = 0;
        FileInputStream fileInputStream = null;
        try {
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            try {
                if (file.exists()) {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        j3 = fileInputStream2.available();
                        fileInputStream = fileInputStream2;
                    } catch (Exception e10) {
                        e = e10;
                        fileInputStream = fileInputStream2;
                        e.printStackTrace();
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return j3;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } else {
                    file.createNewFile();
                    ad.b("获取文件大小", "文件不存在!");
                }
            } catch (Exception e12) {
                e = e12;
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return j3;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static long e(File file) throws Exception {
        long d10;
        File[] listFiles = file.listFiles();
        long j3 = 0;
        if (listFiles != null) {
            for (int i10 = 0; i10 < listFiles.length; i10++) {
                if (listFiles[i10].isDirectory()) {
                    d10 = e(listFiles[i10]);
                } else {
                    d10 = d(listFiles[i10]);
                }
                j3 += d10;
            }
        }
        return j3;
    }

    public static File[] b(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return file.listFiles();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        if (r1 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.io.File r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            java.lang.StringBuffer r4 = new java.lang.StringBuffer     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L4a
            r4.<init>()     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L4a
        L13:
            java.lang.String r2 = r1.readLine()     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L4a
            if (r2 == 0) goto L2e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L4a
            r3.<init>()     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L4a
            r3.append(r2)     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L4a
            java.lang.String r2 = "\n"
            r3.append(r2)     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L4a
            java.lang.String r2 = r3.toString()     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L4a
            r4.append(r2)     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L4a
            goto L13
        L2e:
            r1.close()     // Catch: java.io.IOException -> L42
            goto L42
        L32:
            r2 = move-exception
            goto L3c
        L34:
            r2 = move-exception
            r4 = r0
            goto L3c
        L37:
            r4 = move-exception
            goto L4c
        L39:
            r2 = move-exception
            r4 = r0
            r1 = r4
        L3c:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L42
            goto L2e
        L42:
            if (r4 == 0) goto L49
            java.lang.String r4 = r4.toString()
            return r4
        L49:
            return r0
        L4a:
            r4 = move-exception
            r0 = r1
        L4c:
            if (r0 == 0) goto L51
            r0.close()     // Catch: java.io.IOException -> L51
        L51:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.ab.b(java.io.File):java.lang.String");
    }

    private static void e(String str) {
        try {
            ArrayList<File> c10 = c(new File(str));
            Collections.sort(c10, new Comparator<File>() { // from class: com.mbridge.msdk.foundation.tools.ab.4
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(File file, File file2) {
                    long lastModified = file.lastModified() - file2.lastModified();
                    if (lastModified > 0) {
                        return 1;
                    }
                    if (lastModified == 0) {
                        return 0;
                    }
                    return -1;
                }

                @Override // java.util.Comparator
                public final boolean equals(Object obj) {
                    return true;
                }
            });
            int size = (c10.size() - 1) / 2;
            for (int i10 = 0; i10 < size; i10++) {
                File file = c10.get(i10);
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
            }
        } catch (Exception unused) {
            ad.b("SameFileTool", "del memory failed");
        }
    }

    public static String c(String str) {
        return !TextUtils.isEmpty(str) ? SameMD5.getMD5(ao.b(str.trim())) : "";
    }

    public static boolean d(String str) {
        if (com.mbridge.msdk.foundation.same.c.e.a(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isFile();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00ec, code lost:
    
        if (r12 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00ee, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00f2, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00f3, code lost:
    
        com.mbridge.msdk.foundation.tools.ad.b("SameFileTool", com.mbridge.msdk.newreward.function.common.MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0103, code lost:
    
        if (r12 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0105, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0109, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x010a, code lost:
    
        com.mbridge.msdk.foundation.tools.ad.b("SameFileTool", com.mbridge.msdk.newreward.function.common.MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0118, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x011b, code lost:
    
        if (r12 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x011d, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0121, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0122, code lost:
    
        com.mbridge.msdk.foundation.tools.ad.b("SameFileTool", com.mbridge.msdk.newreward.function.common.MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.ab.b(java.lang.String, java.lang.String):java.lang.String");
    }

    public static void a() {
        Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.foundation.tools.ab.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    com.mbridge.msdk.c.g b3 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
                    if (b3 == null) {
                        com.mbridge.msdk.c.h.a();
                        b3 = com.mbridge.msdk.c.i.a();
                    }
                    ab.a(com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_RES_MANAGER_DIR), b3.Q());
                    ab.a(System.currentTimeMillis() - (b3.i() * 1000));
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        e2.printStackTrace();
                    }
                }
            }
        };
        com.mbridge.msdk.foundation.controller.d.a();
        com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
    }

    public static void a(long j3) {
        try {
            Iterator<File> it = c(new File(com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_RES_MANAGER_DIR))).iterator();
            while (it.hasNext()) {
                File next = it.next();
                if (next.lastModified() < j3 && next.exists() && next.isFile()) {
                    next.delete();
                }
            }
        } catch (Throwable th2) {
            ad.b("SameFileTool", th2.getMessage(), th2);
        }
    }

    public static String a(File file) {
        try {
            if (file.isFile()) {
                file.delete();
                return "";
            }
            if (!file.isDirectory()) {
                return "";
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                for (File file2 : listFiles) {
                    a(file2);
                }
                file.delete();
                return "";
            }
            file.delete();
            return "";
        } catch (Exception e2) {
            return e2.getMessage();
        }
    }

    public static List<String> a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        try {
        } catch (Exception e2) {
            ad.b("SameFileTool", e2.getMessage());
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            File file = new File(str + File.separator + "template_config.json");
            if (file.isFile() && file.exists()) {
                String b3 = b(file);
                if (TextUtils.isEmpty(b3)) {
                    return arrayList;
                }
                try {
                    JSONArray jSONArray = new JSONArray(b3);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        if (jSONObject != null && str2.equals(jSONObject.optString("xml_type"))) {
                            arrayList.add(str + File.separator + jSONObject.optString("name"));
                            if (jSONObject.has("ext_template")) {
                                jSONObject.put("folder_dir", str);
                                arrayList.add(jSONObject.toString());
                            }
                        }
                    }
                    return arrayList;
                } catch (JSONException e10) {
                    ad.b("SameFileTool", e10.getMessage());
                    return arrayList;
                }
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    public static boolean a(byte[] bArr, File file) {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if (file.getParentFile() != null && !file.exists()) {
                    file.getParentFile().mkdirs();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(bArr);
                    try {
                        fileOutputStream2.close();
                        return true;
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        return true;
                    }
                } catch (Exception e10) {
                    e = e10;
                    fileOutputStream = fileOutputStream2;
                    e.printStackTrace();
                    if (fileOutputStream == null) {
                        return false;
                    }
                    try {
                        fileOutputStream.close();
                        return false;
                    } catch (IOException e11) {
                        e11.printStackTrace();
                        return false;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e13) {
            e = e13;
        }
    }

    public static /* synthetic */ void a(String str, int i10) {
        try {
            if (e(new File(str)) > i10 * ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) {
                e(str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (Throwable unused) {
            ad.b("SameFileTool", "clean memory failed");
        }
    }
}
