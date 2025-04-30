package com.pgl.ssdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.text.TextUtils;
import android.view.Display;

/* loaded from: classes3.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private static volatile DisplayManager.DisplayListener f19608a = null;
    private static volatile boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private static String f19609c;

    /* renamed from: d, reason: collision with root package name */
    private static String f19610d;

    /* renamed from: e, reason: collision with root package name */
    private static String f19611e;

    /* renamed from: f, reason: collision with root package name */
    private static DisplayManager f19612f;

    /* loaded from: classes3.dex */
    public static class a implements DisplayManager.DisplayListener {
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i9) {
            w.a(i9, 1);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i9) {
            w.a(i9, 3);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i9) {
            w.a(i9, 2);
        }
    }

    private static String a(Display display) {
        String name = display.getName();
        boolean z8 = false;
        Object a6 = I.a(display, display.getClass(), "getType", new Class[0], new Object[0]);
        Object a9 = I.a(display, display.getClass(), "getOwnerPackageName", new Class[0], new Object[0]);
        Object a10 = I.a(null, display.getClass(), "TYPE_VIRTUAL", null);
        if (a6 != null && a10 != null && ((Integer) a6).intValue() == ((Integer) a10).intValue()) {
            z8 = true;
        }
        return String.format("%s#%s#%b", a9, name, Boolean.valueOf(z8));
    }

    public static void b(Context context) {
        P c9;
        if (b) {
            return;
        }
        b = true;
        if (f19608a == null) {
            f19608a = new a();
        }
        if (f19612f == null) {
            f19612f = (DisplayManager) context.getSystemService("display");
        }
        if (f19612f != null && (c9 = L.a().c()) != null) {
            f19612f.registerDisplayListener(f19608a, c9);
        }
    }

    public static void a(int i9, int i10) {
        if (i9 != 0) {
            try {
                Display display = f19612f.getDisplay(i9);
                String a6 = display != null ? a(display) : "pd";
                if (i10 == 1) {
                    if (a6.equals(f19609c)) {
                        return;
                    }
                    f19609c = a6;
                } else {
                    if (i10 != 2) {
                        if (i10 != 3 || a6.equals(f19611e)) {
                            return;
                        }
                        f19611e = a6;
                        return;
                    }
                    if (a6.equals(f19610d)) {
                        return;
                    }
                    f19610d = a6;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean a(Context context) {
        String str;
        Display[] displays;
        if (f19609c != null || f19610d != null || f19611e != null) {
            return true;
        }
        if (context != null) {
            if (f19612f == null) {
                f19612f = (DisplayManager) context.getSystemService("display");
            }
            DisplayManager displayManager = f19612f;
            if (displayManager == null || (displays = displayManager.getDisplays()) == null) {
                str = "";
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                for (int i9 = 0; i9 < displays.length; i9++) {
                    Display display = displays[i9];
                    if (display != null && display.getDisplayId() != 0) {
                        stringBuffer.append(a(displays[i9]));
                        if (i9 != displays.length - 1) {
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
