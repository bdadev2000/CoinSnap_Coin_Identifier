package com.bytedance.adsdk.ugeno.lMd;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public class zp {

    /* renamed from: com.bytedance.adsdk.ugeno.lMd.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0069zp {
        public float[] KS;
        public int[] lMd;
        public GradientDrawable.Orientation zp;
    }

    public static boolean KS(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("linear-gradient")) {
            return false;
        }
        return true;
    }

    public static GradientDrawable.Orientation jU(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt == 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (parseInt == 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (parseInt == 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            if (parseInt == 135) {
                return GradientDrawable.Orientation.TL_BR;
            }
            if (parseInt == 45) {
                return GradientDrawable.Orientation.BL_TR;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    public static C0069zp lMd(String str) {
        int indexOf;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String substring = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")"));
        if (TextUtils.isEmpty(substring)) {
            return null;
        }
        int zp = zp(substring, '%');
        int indexOf2 = substring.indexOf(",");
        String substring2 = substring.substring(0, indexOf2);
        C0069zp c0069zp = new C0069zp();
        c0069zp.zp = jU(substring2);
        String substring3 = substring.substring(indexOf2 + 1);
        int[] iArr = new int[zp];
        float[] fArr = new float[zp];
        for (int i9 = 0; i9 < zp; i9++) {
            int indexOf3 = substring3.indexOf("%");
            String trim = substring3.substring(0, indexOf3 + 1).trim();
            if (trim.contains("rgba")) {
                indexOf = trim.indexOf(")");
            } else {
                indexOf = trim.indexOf(" ");
            }
            int i10 = indexOf + 1;
            iArr[i9] = zp(trim.substring(0, i10).trim());
            fArr[i9] = KS.zp(trim.substring(i10, trim.indexOf("%")).trim(), 0.0f) / 100.0f;
            int i11 = indexOf3 + 2;
            if (substring3.length() <= i11) {
                break;
            }
            substring3 = substring3.substring(i11);
        }
        c0069zp.lMd = iArr;
        c0069zp.KS = fArr;
        return c0069zp;
    }

    public static int zp(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (str.equals("transparent")) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 4) {
            StringBuilder sb = new StringBuilder("#");
            char[] charArray = str.toCharArray();
            for (int i9 = 1; i9 < charArray.length; i9++) {
                sb.append(charArray[i9]);
                sb.append(charArray[i9]);
            }
            return Color.parseColor(sb.toString());
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        return (str.startsWith("rgba") && (split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) != null && split.length == 4) ? (((int) ((Float.parseFloat(split[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(split[0])) << 16) | (((int) Float.parseFloat(split[1])) << 8) | ((int) Float.parseFloat(split[2])) : ViewCompat.MEASURED_STATE_MASK;
    }

    public static int zp(String str, char c9) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (str.charAt(i10) == c9) {
                i9++;
            }
        }
        return i9;
    }
}
