package com.mbridge.msdk.dycreator.e;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.foundation.tools.ad;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c {
    public static double a(double d2, double d9, int i9) {
        if (i9 < 0) {
            return 1.0d;
        }
        try {
            return new BigDecimal(Double.toString(d2)).divide(new BigDecimal(Double.toString(d9)), i9, 4).doubleValue();
        } catch (Exception e4) {
            ad.b("CommUtil", e4.getMessage());
            return 1.0d;
        }
    }

    public static int a(Context context, float f9) {
        if (context == null) {
            return 0;
        }
        try {
            Resources resources = context.getResources();
            if (resources == null) {
                return 0;
            }
            return (int) ((f9 * resources.getDisplayMetrics().density) + 0.5f);
        } catch (Exception e4) {
            ad.b("CommUtil", e4.getMessage());
            return 0;
        }
    }

    public static Map<String, String> a(Context context, AttributeSet attributeSet) {
        HashMap hashMap = new HashMap();
        if (context != null && attributeSet != null) {
            int attributeCount = attributeSet.getAttributeCount();
            for (int i9 = 0; i9 < attributeCount; i9++) {
                String attributeName = attributeSet.getAttributeName(i9);
                if (!TextUtils.isEmpty(attributeName)) {
                    if (attributeName.equals("mbridge_data")) {
                        try {
                            hashMap.put("mbridgeData", b.f15274a.get(attributeSet.getAttributeValue(i9).substring(8)));
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                    }
                    if (attributeName.equals("mbridge_click")) {
                        try {
                            hashMap.put("mbridgeAction", b.f15274a.get(attributeSet.getAttributeValue(i9).substring(8)));
                        } catch (Exception e9) {
                            e9.printStackTrace();
                        }
                    }
                    if (attributeName.equals("mbridge_strategy")) {
                        try {
                            hashMap.put("mbridgeStrategy", b.f15274a.get(attributeSet.getAttributeValue(i9).substring(8)));
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                    if (attributeName.equals("mbridge_effect")) {
                        try {
                            hashMap.put("mbridgeEffect", b.f15274a.get(attributeSet.getAttributeValue(i9).substring(8)));
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                    if (attributeName.equals("mbridge_report")) {
                        try {
                            hashMap.put("mbridgeReport", attributeSet.getAttributeValue(i9));
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    public static void a(Map<String, String> map, View view) {
        if (map == null || view == null) {
            return;
        }
        if (map.containsKey("mbridgeData")) {
            com.mbridge.msdk.dycreator.binding.b.a().c(view);
        }
        if (map.containsKey("mbridgeAction")) {
            com.mbridge.msdk.dycreator.binding.b.a().d(view);
        }
        if (map.containsKey("mbridgeEffect")) {
            com.mbridge.msdk.dycreator.binding.b.a().b(view);
        }
        if (map.containsKey("mbridgeReport")) {
            com.mbridge.msdk.dycreator.binding.b.a().a(view);
        }
    }

    public static Map<String, Boolean> a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("\\|");
            if (split != null && split.length > 0) {
                for (String str2 : split) {
                    if (str2.equals("mbridgeAttached")) {
                        hashMap.put("mbridgeAttached", Boolean.TRUE);
                    }
                    if (str2.equals("mbridgeDetached")) {
                        hashMap.put("mbridgeDetached", Boolean.TRUE);
                    }
                }
            } else {
                if (str.equals("mbridgeAttached")) {
                    hashMap.put("mbridgeAttached", Boolean.TRUE);
                }
                if (str.equals("mbridgeDetached")) {
                    hashMap.put("mbridgeDetached", Boolean.TRUE);
                }
            }
        }
        return hashMap;
    }
}
