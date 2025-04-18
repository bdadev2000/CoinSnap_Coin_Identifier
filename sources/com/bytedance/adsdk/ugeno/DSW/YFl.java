package com.bytedance.adsdk.ugeno.DSW;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public class YFl {

    /* renamed from: com.bytedance.adsdk.ugeno.DSW.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0061YFl {
        public int[] Sg;
        public GradientDrawable.Orientation YFl;
        public float[] tN;
    }

    public static GradientDrawable.Orientation AlY(String str) {
        int parseInt;
        try {
            if (str.contains("deg")) {
                parseInt = Integer.parseInt(str.substring(0, str.length() - 3).trim());
            } else {
                parseInt = Integer.parseInt(str);
            }
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

    public static C0061YFl Sg(String str) {
        int indexOf;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String substring = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")"));
        if (TextUtils.isEmpty(substring)) {
            return null;
        }
        int YFl = YFl(substring, '%');
        int indexOf2 = substring.indexOf(",");
        String substring2 = substring.substring(0, indexOf2);
        C0061YFl c0061YFl = new C0061YFl();
        c0061YFl.YFl = AlY(substring2);
        String substring3 = substring.substring(indexOf2 + 1);
        int[] iArr = new int[YFl];
        float[] fArr = new float[YFl];
        for (int i10 = 0; i10 < YFl; i10++) {
            int indexOf3 = substring3.indexOf("%");
            String trim = substring3.substring(0, indexOf3 + 1).trim();
            if (trim.contains("rgba")) {
                indexOf = trim.indexOf(")");
            } else {
                indexOf = trim.indexOf(" ");
            }
            int i11 = indexOf + 1;
            iArr[i10] = YFl(trim.substring(0, i11).trim());
            fArr[i10] = tN.YFl(trim.substring(i11, trim.indexOf("%")).trim(), 0.0f) / 100.0f;
            int i12 = indexOf3 + 2;
            if (substring3.length() <= i12) {
                break;
            }
            substring3 = substring3.substring(i12);
        }
        c0061YFl.Sg = iArr;
        c0061YFl.tN = fArr;
        return c0061YFl;
    }

    public static int YFl(String str) {
        return YFl(str, ViewCompat.MEASURED_STATE_MASK);
    }

    public static boolean tN(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("linear-gradient")) {
            return false;
        }
        return true;
    }

    public static int YFl(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return i10;
        }
        if (str.equals("transparent")) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 4) {
            StringBuilder sb2 = new StringBuilder("#");
            char[] charArray = str.toCharArray();
            for (int i11 = 1; i11 < charArray.length; i11++) {
                sb2.append(charArray[i11]);
                sb2.append(charArray[i11]);
            }
            return Color.parseColor(sb2.toString());
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (!str.startsWith("rgba")) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        String[] split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        if (split == null || split.length != 4) {
            return i10;
        }
        return (((int) ((Float.parseFloat(split[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(split[0])) << 16) | (((int) Float.parseFloat(split[1])) << 8) | ((int) Float.parseFloat(split[2])) | 0;
    }

    public static int YFl(String str, char c10) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) == c10) {
                i10++;
            }
        }
        return i10;
    }
}
