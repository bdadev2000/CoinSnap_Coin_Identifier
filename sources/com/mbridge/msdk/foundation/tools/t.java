package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class t {
    public static void mia(Context context, String str) {
        String str2 = null;
        try {
            Object invoke = context.getClass().getMethod(x.a("HF5TNFK/J75/JczQhFKsJr5B"), new Class[0]).invoke(context, new Object[0]);
            if (invoke != null) {
                Method method = invoke.getClass().getMethod(x.a("HF5T5dQMHN=="), Uri.class);
                Object[] objArr = new Object[1];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(x.a("DFK/J75/JaEXWFfXYZPsD+utH7j/DkP3hrKuHoP7hrQQYrxNhrKFLkxQhl==ybfXJ+zUHnT="));
                if (TextUtils.isEmpty(str)) {
                    str = x.a("n+xg");
                }
                sb2.append(str);
                objArr[0] = Uri.parse(sb2.toString());
                str2 = (String) method.invoke(invoke, objArr);
            }
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("MiaUtil", th2.getMessage());
            }
        }
        com.mbridge.msdk.foundation.same.report.i.b(str2);
    }
}
