package com.pgl.ssdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.text.TextUtils;
import android.view.Display;

/* loaded from: classes4.dex */
public class w {
    private static volatile DisplayManager.DisplayListener a = null;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f16586b = false;

    /* renamed from: c, reason: collision with root package name */
    private static String f16587c;

    /* renamed from: d, reason: collision with root package name */
    private static String f16588d;

    /* renamed from: e, reason: collision with root package name */
    private static String f16589e;

    /* renamed from: f, reason: collision with root package name */
    private static DisplayManager f16590f;

    /* loaded from: classes4.dex */
    public static class a implements DisplayManager.DisplayListener {
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
            w.a(i10, 1);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            w.a(i10, 3);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
            w.a(i10, 2);
        }
    }

    private static String a(Display display) {
        String name = display.getName();
        Object a10 = J.a(display, display.getClass(), "getType", new Class[0], new Object[0]);
        Object a11 = J.a(display, display.getClass(), "getOwnerPackageName", new Class[0], new Object[0]);
        Object a12 = J.a(null, display.getClass(), "TYPE_VIRTUAL", null);
        return String.format("%s#%s#%b", a11, name, Boolean.valueOf((a10 == null || a12 == null || ((Integer) a10).intValue() != ((Integer) a12).intValue()) ? false : true));
    }

    public static void b(Context context) {
        Q c10;
        if (f16586b) {
            return;
        }
        f16586b = true;
        if (a == null) {
            a = new a();
        }
        if (f16590f == null) {
            f16590f = (DisplayManager) context.getSystemService("display");
        }
        if (f16590f != null && (c10 = M.a().c()) != null) {
            try {
                f16590f.registerDisplayListener(a, c10);
            } catch (Exception unused) {
            }
        }
    }

    public static void a(int i10, int i11) {
        if (i10 != 0) {
            try {
                Display display = f16590f.getDisplay(i10);
                String a10 = display != null ? a(display) : "pd";
                if (i11 == 1) {
                    if (a10.equals(f16587c)) {
                        return;
                    }
                    f16587c = a10;
                } else {
                    if (i11 != 2) {
                        if (i11 != 3 || a10.equals(f16589e)) {
                            return;
                        }
                        f16589e = a10;
                        return;
                    }
                    if (a10.equals(f16588d)) {
                        return;
                    }
                    f16588d = a10;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean a(Context context) {
        String str;
        Display[] displays;
        if (f16587c != null || f16588d != null || f16589e != null) {
            return true;
        }
        if (context != null) {
            if (f16590f == null) {
                f16590f = (DisplayManager) context.getSystemService("display");
            }
            DisplayManager displayManager = f16590f;
            if (displayManager == null || (displays = displayManager.getDisplays()) == null) {
                str = "";
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                for (int i10 = 0; i10 < displays.length; i10++) {
                    Display display = displays[i10];
                    if (display != null && display.getDisplayId() != 0) {
                        stringBuffer.append(a(displays[i10]));
                        if (i10 != displays.length - 1) {
                            stringBuffer.append(",");
                        }
                    }
                }
                str = stringBuffer.toString();
            }
            if (!TextUtils.isEmpty(str)) {
                return true;
            }
        }
        return false;
    }
}
