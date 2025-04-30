package p6;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.foundation.entity.o;
import x0.AbstractC2914a;

/* renamed from: p6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2572a {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f22372a;
    public static final boolean b;

    static {
        System.getProperty("line.separator");
        f22372a = true;
        b = true;
    }

    public static void a(String str, Object... objArr) {
        String str2;
        Object obj;
        if (!b) {
            return;
        }
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[5];
        String className = stackTraceElement.getClassName();
        String[] split = className.split("\\.");
        if (split.length > 0) {
            className = AbstractC2914a.h(new StringBuilder(), split[split.length - 1], ".java");
        }
        int i9 = 0;
        if (className.contains("$")) {
            className = AbstractC2914a.h(new StringBuilder(), className.split("\\$")[0], ".java");
        }
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        if (lineNumber < 0) {
            lineNumber = 0;
        }
        if (str == null) {
            str = className;
        }
        boolean z8 = f22372a;
        if (z8 && TextUtils.isEmpty(str)) {
            str = "KLog";
        } else if (!z8) {
            str = null;
        }
        if (objArr.length > 1) {
            StringBuilder sb = new StringBuilder("\n");
            for (int i10 = 0; i10 < objArr.length; i10++) {
                Object obj2 = objArr[i10];
                if (obj2 == null) {
                    sb.append("Param[");
                    sb.append(i10);
                    sb.append("] = null\n");
                } else {
                    sb.append("Param[");
                    sb.append(i10);
                    sb.append("] = ");
                    sb.append(obj2.toString());
                    sb.append("\n");
                }
            }
            str2 = sb.toString();
        } else if (objArr.length != 1 || (obj = objArr[0]) == null) {
            str2 = "null";
        } else {
            str2 = obj.toString();
        }
        StringBuilder sb2 = new StringBuilder("[ (");
        sb2.append(className);
        sb2.append(":");
        sb2.append(lineNumber);
        sb2.append(")#");
        String[] strArr = {str, str2, AbstractC2914a.h(sb2, methodName, " ] ")};
        String str3 = strArr[0];
        String j7 = o.j(strArr[2], strArr[1]);
        int length = j7.length();
        int i11 = length / 4000;
        if (i11 > 0) {
            int i12 = 0;
            while (i9 < i11) {
                int i13 = i12 + 4000;
                Log.e(str3, j7.substring(i12, i13));
                i9++;
                i12 = i13;
            }
            Log.e(str3, j7.substring(i12, length));
            return;
        }
        Log.e(str3, j7);
    }
}
