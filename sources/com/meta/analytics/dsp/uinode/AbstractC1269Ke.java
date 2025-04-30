package com.meta.analytics.dsp.uinode;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.Ke, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1269Ke {
    public static byte[] A00;
    public static String[] A01 = {"4Hyw1ld0", "fEzx6YE0SeCvem7jc58qc1uowK5CeHyF", "mKjUZIiYyhCBAWVMkGfhIPNFhY8yjY7b", "XoO13E9Z", "T5DEyuoaMCuUHewoghibS1K19XR2WHTa", "iIUB3596vuf", "PRfLmBQ8OOom6oFwc8jxiiNxNKuVVsiK", "TWoMGSFYHQz"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Kd A00() throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException, IllegalAccessException {
        Class<?> cls = Class.forName(A03(8, 26, 93));
        Object invoke = cls.getMethod(A03(66, 21, 92), new Class[0]).invoke(null, new Object[0]);
        Field declaredField = cls.getDeclaredField(A03(87, 11, 69));
        declaredField.setAccessible(true);
        Map map = (Map) declaredField.get(invoke);
        if (map == null) {
            return Kd.A0B;
        }
        for (Object obj : map.values()) {
            Field declaredField2 = obj.getClass().getDeclaredField(A03(0, 8, 87));
            declaredField2.setAccessible(true);
            Activity activity = (Activity) declaredField2.get(obj);
            if (activity.isTaskRoot() && activity.getIntent().getCategories().contains(A03(34, 32, 84))) {
                return Kd.A06;
            }
        }
        return Kd.A09;
    }

    public static String A03(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            int i13 = copyOfRange[i12] ^ i11;
            if (A01[4].charAt(13) == '3') {
                throw new RuntimeException();
            }
            A01[2] = "lr9od7US3THgayVRC3YximplGEeGYREs";
            copyOfRange[i12] = (byte) (i13 ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{60, 62, 41, 52, 43, 52, 41, 36, 54, 57, 51, 37, 56, 62, 51, 121, 54, 39, 39, 121, Ascii.SYN, 52, 35, 62, 33, 62, 35, 46, 3, 63, 37, 50, 54, 51, 63, 48, 58, 44, 49, 55, 58, 112, 55, 48, 42, 59, 48, 42, 112, 61, 63, 42, 59, 57, 49, 44, 39, 112, Ascii.DC2, Ascii.US, Ascii.VT, Ascii.DLE, Ascii.GS, Ascii.SYN, Ascii.ESC, Ascii.FF, 53, 35, 36, 36, 51, 56, 34, Ascii.ETB, 53, 34, 63, 32, 63, 34, 47, 2, 62, 36, 51, 55, 50, 34, Ascii.SO, 44, 59, 38, 57, 38, 59, 38, 42, 60};
    }

    static {
        A04();
    }

    public static Kd A01(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return A02(context);
            }
            return A00();
        } catch (Exception unused) {
            return Kd.A04;
        }
    }

    public static Kd A02(Context context) {
        if (context == null) {
            return Kd.A0C;
        }
        ActivityManager mgr = (ActivityManager) context.getSystemService(A03(0, 8, 87));
        if (mgr == null) {
            return Kd.A07;
        }
        List<ActivityManager.AppTask> tasks = mgr.getAppTasks();
        if (tasks.isEmpty()) {
            return Kd.A0A;
        }
        Iterator<ActivityManager.AppTask> it = tasks.iterator();
        while (it.hasNext()) {
            ActivityManager.RecentTaskInfo taskInfo = it.next().getTaskInfo();
            if (taskInfo != null && taskInfo.baseIntent != null) {
                Set<String> categories = taskInfo.baseIntent.getCategories();
                if (A01[4].charAt(13) == '3') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[7] = "rbRaEFWiZz7";
                strArr[5] = "WgbgXmtUXm5";
                if (categories != null && taskInfo.baseIntent.getCategories().contains(A03(34, 32, 84))) {
                    return Kd.A05;
                }
            }
        }
        return Kd.A08;
    }
}
