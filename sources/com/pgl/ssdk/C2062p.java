package com.pgl.ssdk;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipFile;

/* renamed from: com.pgl.ssdk.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2062p {

    /* renamed from: a, reason: collision with root package name */
    private static AccessibilityManager f19589a = null;
    private static int b = -1;

    public static int a() {
        return b;
    }

    public static boolean b(Context context) {
        List<InputMethodInfo> list;
        ZipFile zipFile;
        if (context == null) {
            return false;
        }
        if (f19589a == null) {
            f19589a = (AccessibilityManager) context.getSystemService("accessibility");
        }
        AccessibilityManager accessibilityManager = f19589a;
        if (accessibilityManager == null) {
            return false;
        }
        List<AccessibilityServiceInfo> installedAccessibilityServiceList = accessibilityManager.getInstalledAccessibilityServiceList();
        ZipFile zipFile2 = null;
        try {
            list = ((InputMethodManager) context.getSystemService("input_method")).getInputMethodList();
        } catch (Exception unused) {
            list = null;
        }
        if (installedAccessibilityServiceList != null && list != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<InputMethodInfo> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getPackageName());
            }
            for (AccessibilityServiceInfo accessibilityServiceInfo : installedAccessibilityServiceList) {
                if (accessibilityServiceInfo != null && arrayList.contains(accessibilityServiceInfo.getResolveInfo().serviceInfo.packageName)) {
                    arrayList2.add(accessibilityServiceInfo.getResolveInfo().serviceInfo.applicationInfo.publicSourceDir);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                try {
                    zipFile = new ZipFile((String) it2.next());
                } catch (IOException unused2) {
                    zipFile = null;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (zipFile.getEntry("assets/easyagent") != null) {
                        try {
                            zipFile.close();
                            return true;
                        } catch (IOException unused3) {
                            return true;
                        }
                    }
                } catch (IOException unused4) {
                    if (zipFile == null) {
                    }
                    zipFile.close();
                } catch (Throwable th2) {
                    th = th2;
                    zipFile2 = zipFile;
                    if (zipFile2 != null) {
                        try {
                            zipFile2.close();
                        } catch (IOException unused5) {
                        }
                    }
                    throw th;
                }
                try {
                    zipFile.close();
                } catch (IOException unused6) {
                }
            }
        }
        return false;
    }

    public static String c(Context context) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        if (context == null) {
            return null;
        }
        if (f19589a == null) {
            f19589a = (AccessibilityManager) context.getSystemService("accessibility");
        }
        AccessibilityManager accessibilityManager = f19589a;
        if (accessibilityManager == null || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1)) == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < enabledAccessibilityServiceList.size(); i9++) {
            AccessibilityServiceInfo accessibilityServiceInfo = enabledAccessibilityServiceList.get(i9);
            if (accessibilityServiceInfo != null) {
                sb.append(accessibilityServiceInfo.getResolveInfo().serviceInfo.packageName + "#" + accessibilityServiceInfo.getResolveInfo().serviceInfo.name);
                if (i9 != enabledAccessibilityServiceList.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    public static void a(Context context) {
        if (b != -1) {
            return;
        }
        boolean z8 = false;
        b = 0;
        boolean b8 = b(context);
        try {
            z8 = new File("/data/local/tmp/easyagent.apk").exists();
        } catch (Exception unused) {
        }
        if (b8) {
            b |= 1;
        }
        if (z8) {
            b |= 2;
        }
    }
}
