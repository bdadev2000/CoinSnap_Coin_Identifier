package com.safedk.android.utils;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static List<String> f30019a = Arrays.asList(k.e, "java.util.List", "java.util.ArrayList", "java.util.Map", "java.util.HashMap", "org.json.JSONObject", "com.five_corp.ad.internal.cache", "com.five_corp.ad.internal.context", ImpressionLog.w, "long");

    /* renamed from: b, reason: collision with root package name */
    private static final String f30020b = "DebugUtils";

    /* JADX WARN: Removed duplicated region for block: B:15:0x015f A[Catch: Throwable -> 0x017c, TRY_LEAVE, TryCatch #0 {Throwable -> 0x017c, blocks: (B:3:0x0001, B:5:0x001f, B:7:0x002a, B:8:0x002e, B:10:0x0114, B:12:0x0139, B:13:0x0158, B:15:0x015f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0177 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.lang.String r11, java.lang.String r12, android.view.ViewGroup r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.utils.b.a(java.lang.String, java.lang.String, android.view.ViewGroup, java.lang.String):void");
    }

    private static void a(View view, String str, String str2) {
        try {
            Logger.d(str, str2 + " getViewDetails started, View type is " + view.getClass().getName() + ", Id=" + Integer.toHexString(view.getId()));
            if (view.getParent() != null) {
                if (view.getParent() instanceof View) {
                    a((View) view.getParent(), str, str2);
                } else {
                    Log.d(str, str2 + " getViewDetails parent is ViewParent, view : " + view.getId() + ", View type is " + view.getClass().getName());
                }
            }
        } catch (Throwable th) {
            Logger.e(str, str2 + " Exception in getViewDetails", th);
        }
    }

    private static void a(Context context, String str) {
        File file = new File(context.getFilesDir() + RemoteSettings.FORWARD_SLASH_STRING + str);
        if (file.exists()) {
            a(file);
        } else {
            Logger.d(f30020b, "listFiles directory does not exist : " + file);
        }
    }

    private static void a(Context context) {
        Logger.d(f30020b, "listFilesInFilesDir started, dir : " + context.getFilesDir().getPath());
        a(context.getFilesDir());
    }

    private static void b(Context context) {
        a(context.getCacheDir());
    }

    private static void a(File file) {
        if (file != null) {
            if (file.isFile()) {
                Logger.d(f30020b, "listFilesInDir file " + a(file.length()) + " " + file.getPath());
                return;
            }
            if (file.isDirectory()) {
                Logger.d(f30020b, "listFilesInDir dir  " + file.getPath());
                for (File file2 : file.listFiles()) {
                    a(file2);
                }
            }
        }
    }

    private static String a(long j2) {
        if (j2 <= 0) {
            return "0 Bytes";
        }
        String[] strArr = {"Bt", "kB", "MB", "GB", "TB"};
        int log10 = (int) (Math.log10(j2) / Math.log10(1024.0d));
        return new DecimalFormat("#,##0.#").format(j2 / Math.pow(1024.0d, log10)) + " " + strArr[log10];
    }

    private static void a(String str, String str2, Object obj, int i2, int i3) {
        if (obj != null) {
            try {
                if (obj.getClass() != null) {
                    if (i2 > i3) {
                        Log.d(str, str2 + " reflectRecursively cannot go beyond level " + i3 + " current level is " + i2);
                        return;
                    }
                    for (Field field : obj.getClass().getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj2 = field.get(obj);
                        String str3 = null;
                        if (c(field.getType().getName())) {
                            str3 = obj2 != null ? obj2.toString() : "null";
                        }
                        String replace = new String(new char[i2 * 2]).replace("\u0000", "-");
                        if (f30019a.contains(field.getType().getName())) {
                            Logger.d(str, str2 + " reflectRecursively level " + i2 + replace + ", name : " + field.getName() + ", type : " + field.getType().getName() + ", value : " + str3);
                        } else {
                            Logger.d(str, str2 + " reflectRecursively level " + i2 + replace + ", name : " + field.getName() + ", type : " + field.getType().getName());
                        }
                        if (!field.getType().isPrimitive() && obj2 != null) {
                            a(str, str2, obj2, i2 + 1, i3);
                        }
                    }
                }
            } catch (Throwable th) {
                Logger.e(str, str2 + " reflectRecursively Exception, stopping", th);
            }
        }
    }

    private static boolean c(String str) {
        Iterator<String> it = f30019a.iterator();
        while (it.hasNext()) {
            if (str.toLowerCase().startsWith(it.next().toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static void a(String str, String str2) {
        Logger.d(f30020b, "CopyFileToExternalStorage: src is: " + str + " directory: " + str2);
        String str3 = Environment.getExternalStorageDirectory() + File.separator + (str2 != null ? str2 + File.separator : "");
        Logger.d(f30020b, "CopyFileToExternalStorage: destination: " + str3);
        String str4 = str3 + str.split(RemoteSettings.FORWARD_SLASH_STRING)[r1.length - 1];
        Logger.d(f30020b, "copyFileToExternalStorage target = " + str4);
        Logger.d(f30020b, "copyFileToExternalStorage result = " + b(str, str4));
    }

    private static boolean b(String str, String str2) {
        int i2;
        try {
            if (new File(str).exists()) {
                FileInputStream fileInputStream = new FileInputStream(str);
                FileOutputStream fileOutputStream = new FileOutputStream(str2);
                byte[] bArr = new byte[1444];
                i2 = 0;
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    i2 += read;
                    fileOutputStream.write(bArr, 0, read);
                }
                fileInputStream.close();
                fileOutputStream.close();
            } else {
                i2 = 0;
            }
            if (new File(str2).exists()) {
                Logger.d(f30020b, "copyFile finished creating file " + str2 + ", " + i2 + " bytes written");
            } else {
                Logger.d(f30020b, "copyFile failed to create file " + str2);
            }
            return true;
        } catch (Throwable th) {
            Logger.d(f30020b, "Exception in copyFile : " + th.getMessage(), th);
            return false;
        }
    }

    public static List<String> a(String str) {
        File[] listFiles = new File(str).listFiles(new FileFilter() { // from class: com.safedk.android.utils.b.1

            /* renamed from: a, reason: collision with root package name */
            private final List<String> f30021a = Arrays.asList("jpeg", "jpg", "png", "bmp", "gif");

            @Override // java.io.FileFilter
            public boolean accept(File pathname) {
                String path = pathname.getPath();
                return this.f30021a.contains(path.substring(path.lastIndexOf(".") + 1));
            }
        });
        ArrayList arrayList = new ArrayList();
        if (listFiles != null && listFiles.length > 0) {
            for (File file : listFiles) {
                arrayList.add(file.getName());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.io.File r7, java.io.File r8) throws java.io.IOException {
        /*
            r2 = 0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L27
            r0.<init>(r7)     // Catch: java.io.FileNotFoundException -> L27
            java.nio.channels.FileChannel r1 = r0.getChannel()     // Catch: java.io.FileNotFoundException -> L27
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L7b
            r0.<init>(r8)     // Catch: java.io.FileNotFoundException -> L7b
            java.nio.channels.FileChannel r6 = r0.getChannel()     // Catch: java.io.FileNotFoundException -> L7b
        L13:
            r2 = 0
            long r4 = r1.size()     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L6f
            r1.transferTo(r2, r4, r6)     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L6f
            if (r1 == 0) goto L21
            r1.close()
        L21:
            if (r6 == 0) goto L26
            r6.close()
        L26:
            return
        L27:
            r0 = move-exception
            r1 = r2
        L29:
            java.lang.String r3 = "DebugUtils"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Exception copying file :"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r0.getMessage()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.safedk.android.utils.Logger.d(r3, r4, r0)
            r6 = r2
            goto L13
        L47:
            r0 = move-exception
            java.lang.String r2 = "DebugUtils"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r3.<init>()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = "Exception copying file :"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L6f
            com.safedk.android.utils.Logger.d(r2, r3, r0)     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto L69
            r1.close()
        L69:
            if (r6 == 0) goto L26
            r6.close()
            goto L26
        L6f:
            r0 = move-exception
            if (r1 == 0) goto L75
            r1.close()
        L75:
            if (r6 == 0) goto L7a
            r6.close()
        L7a:
            throw r0
        L7b:
            r0 = move-exception
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.utils.b.a(java.io.File, java.io.File):void");
    }

    public static String b(String str) {
        SafeDK.getInstance().l();
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(str)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (FileNotFoundException e) {
            Logger.e(f30020b, "Exception reading file " + str, e);
        } catch (IOException e2) {
            Logger.e(f30020b, "Exception reading file " + str, e2);
        }
        return sb.toString();
    }
}
