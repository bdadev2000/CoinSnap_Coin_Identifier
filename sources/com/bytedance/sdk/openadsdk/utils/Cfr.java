package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class Cfr implements Thread.UncaughtExceptionHandler {
    public static volatile boolean YFl;
    private final Thread.UncaughtExceptionHandler Sg = Thread.getDefaultUncaughtExceptionHandler();
    private String tN;

    private Cfr() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        Sg();
    }

    private void Sg() {
        Context YFl2 = com.bytedance.sdk.openadsdk.core.lG.YFl();
        if (YFl2 == null) {
            return;
        }
        try {
            File file = new File(YFl2.getFilesDir(), "TTCache");
            file.mkdirs();
            this.tN = file.getPath();
        } catch (Throwable unused) {
        }
    }

    public static Cfr YFl() {
        return new Cfr();
    }

    private void tN() {
        try {
            Method YFl2 = com.bytedance.sdk.component.utils.VOe.YFl("com.bytedance.sdk.openadsdk.TTC2Proxy", "a", Context.class);
            if (YFl2 != null) {
                YFl2.invoke(null, com.bytedance.sdk.openadsdk.core.lG.YFl());
            }
        } catch (Throwable unused) {
        }
        try {
            Method YFl3 = com.bytedance.sdk.component.utils.VOe.YFl("com.bytedance.sdk.openadsdk.TTC3Proxy", "a", Context.class);
            if (YFl3 != null) {
                YFl3.invoke(null, com.bytedance.sdk.openadsdk.core.lG.YFl());
            }
        } catch (Throwable unused2) {
        }
        try {
            com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().YFl();
        } catch (Throwable unused3) {
        }
        try {
            com.bytedance.sdk.component.adexpress.YFl.Sg.Sg.Sg();
        } catch (Throwable unused4) {
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        YFl = true;
        boolean z10 = false;
        com.bytedance.sdk.component.qsH.vc.YFl(false);
        try {
            StringWriter stringWriter = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            if (stringWriter2 != null) {
                z10 = stringWriter2.contains(AdSlot.class.getPackage().getName());
            }
        } catch (Throwable unused) {
        }
        if (z10) {
            YFl(thread, th2);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.Sg;
        if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != this) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
    private void YFl(java.lang.Thread r17, java.lang.Throwable r18) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.Cfr.YFl(java.lang.Thread, java.lang.Throwable):void");
    }
}
