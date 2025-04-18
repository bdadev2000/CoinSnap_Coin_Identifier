package com.bytedance.sdk.component.NjR;

import com.bytedance.sdk.component.utils.YoT;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class Sg {
    public static boolean YFl(List<String> list, String str) {
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                try {
                } catch (Throwable th2) {
                    YoT.Sg(th2.toString());
                }
                if (Pattern.matches(it.next(), str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
