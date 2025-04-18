package com.bytedance.sdk.openadsdk.multipro;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.component.utils.lG;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class tN {
    private static final AtomicBoolean Sg = new AtomicBoolean(false);
    private static boolean YFl = true;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void Sg(android.content.Context r3) {
        /*
            java.lang.String r0 = Sg()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Ld
            java.lang.String r0 = "webview"
            goto L17
        Ld:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "webview_"
            java.lang.String r0 = r1.concat(r0)
        L17:
            r1 = 0
            java.io.File r3 = r3.getDir(r0, r1)
            java.lang.String r3 = r3.getPath()
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "webview_data.lock"
            r0.<init>(r3, r1)
            r0.getAbsolutePath()
            boolean r3 = r0.exists()
            if (r3 != 0) goto L31
            return
        L31:
            r3 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L69
            java.lang.String r2 = "rw"
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L69
            java.nio.channels.FileChannel r2 = r1.getChannel()     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> L82
            if (r2 == 0) goto L46
            java.nio.channels.FileLock r3 = r2.tryLock()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L62
            goto L46
        L44:
            r3 = move-exception
            goto L85
        L46:
            if (r3 == 0) goto L4c
            r3.close()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L62
            goto L4f
        L4c:
            YFl(r0)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L62
        L4f:
            if (r2 == 0) goto L59
            r2.close()     // Catch: java.lang.Throwable -> L55
            goto L59
        L55:
            r3 = move-exception
            r3.getMessage()
        L59:
            r1.close()     // Catch: java.lang.Throwable -> L5d
            return
        L5d:
            r3 = move-exception
            r3.getMessage()
            return
        L62:
            r3 = r2
            goto L6a
        L64:
            r0 = move-exception
            r1 = r3
            r2 = r1
        L67:
            r3 = r0
            goto L85
        L69:
            r1 = r3
        L6a:
            YFl(r0)     // Catch: java.lang.Throwable -> L82
            if (r3 == 0) goto L77
            r3.close()     // Catch: java.lang.Throwable -> L73
            goto L77
        L73:
            r3 = move-exception
            r3.getMessage()
        L77:
            if (r1 == 0) goto L81
            r1.close()     // Catch: java.lang.Throwable -> L7d
            return
        L7d:
            r3 = move-exception
            r3.getMessage()
        L81:
            return
        L82:
            r0 = move-exception
            r2 = r3
            goto L67
        L85:
            if (r2 == 0) goto L8f
            r2.close()     // Catch: java.lang.Throwable -> L8b
            goto L8f
        L8b:
            r0 = move-exception
            r0.getMessage()
        L8f:
            if (r1 == 0) goto L99
            r1.close()     // Catch: java.lang.Throwable -> L95
            goto L99
        L95:
            r0 = move-exception
            r0.getMessage()
        L99:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.multipro.tN.Sg(android.content.Context):void");
    }

    public static void YFl(Context context) {
        if (context != null && YFl && Sg.compareAndSet(false, true)) {
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    if (lG.YFl(context)) {
                        Sg(context);
                        return;
                    }
                    String Sg2 = lG.Sg(context);
                    try {
                        if (TextUtils.isEmpty(Sg2)) {
                            Sg2 = context.getPackageName() + Process.myPid();
                        }
                        WebView.setDataDirectorySuffix(Sg2);
                    } catch (IllegalStateException unused) {
                        YFl(Sg2);
                    } catch (Exception unused2) {
                    }
                }
            } catch (Throwable th2) {
                YoT.Sg(th2.getMessage());
            }
        }
    }

    public static void YFl() {
        YFl = false;
    }

    private static void YFl(String str) {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            Field field = (Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix");
            field.setAccessible(true);
            if (TextUtils.isEmpty((String) field.get(cls))) {
                field.set(cls, str);
            }
        } catch (Throwable unused) {
        }
    }

    private static void YFl(File file) {
        YFl(file, file.exists() ? file.delete() : false);
    }

    private static void YFl(File file, boolean z10) {
        if (!z10 || file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException e2) {
            YoT.YFl("TTAD.TTMultiInitHelper", e2.getMessage());
        }
    }

    private static String Sg() {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            return (String) ((Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix")).get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }
}
