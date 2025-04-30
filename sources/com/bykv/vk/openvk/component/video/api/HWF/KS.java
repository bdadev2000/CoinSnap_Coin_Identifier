package com.bykv.vk.openvk.component.video.api.HWF;

/* loaded from: classes.dex */
public class KS {
    private static String KS = "";
    private static int lMd = 4;
    private static boolean zp = false;

    public static boolean KS() {
        return zp;
    }

    public static void lMd() {
        zp = false;
        zp(7);
    }

    public static void zp(String str) {
        KS = str;
    }

    public static void zp(int i9) {
        lMd = i9;
    }

    public static void zp() {
        zp = true;
        zp(3);
    }
}
