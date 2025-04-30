package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class Lij implements Thread.UncaughtExceptionHandler {
    public static volatile boolean zp;
    private String KS;
    private final Thread.UncaughtExceptionHandler lMd = Thread.getDefaultUncaughtExceptionHandler();

    private Lij() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        lMd();
    }

    private void KS() {
        try {
            Method zp2 = com.bytedance.sdk.component.utils.ox.zp("com.bytedance.sdk.openadsdk.TTC2Proxy", "a", Context.class);
            if (zp2 != null) {
                zp2.invoke(null, com.bytedance.sdk.openadsdk.core.KVG.zp());
            }
        } catch (Throwable unused) {
        }
        try {
            Method zp3 = com.bytedance.sdk.component.utils.ox.zp("com.bytedance.sdk.openadsdk.TTC3Proxy", "a", Context.class);
            if (zp3 != null) {
                zp3.invoke(null, com.bytedance.sdk.openadsdk.core.KVG.zp());
            }
        } catch (Throwable unused2) {
        }
        try {
            com.bytedance.sdk.openadsdk.core.settings.dQp.etV().zp();
        } catch (Throwable unused3) {
        }
        try {
            com.bytedance.sdk.component.adexpress.zp.lMd.lMd.lMd();
        } catch (Throwable unused4) {
        }
    }

    private void lMd() {
        Context zp2 = com.bytedance.sdk.openadsdk.core.KVG.zp();
        if (zp2 == null) {
            return;
        }
        try {
            File file = new File(zp2.getFilesDir(), "TTCache");
            file.mkdirs();
            this.KS = file.getPath();
        } catch (Throwable unused) {
        }
    }

    public static Lij zp() {
        return new Lij();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        zp = true;
        boolean z8 = false;
        com.bytedance.sdk.component.ku.HWF.zp(false);
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            if (stringWriter2 != null) {
                z8 = stringWriter2.contains(AdSlot.class.getPackage().getName());
            }
        } catch (Throwable unused) {
        }
        if (z8) {
            zp(thread, th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.lMd;
        if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != this) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Properties] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.Properties] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void zp(java.lang.Thread r17, java.lang.Throwable r18) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.Lij.zp(java.lang.Thread, java.lang.Throwable):void");
    }
}
