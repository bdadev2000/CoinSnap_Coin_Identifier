package J1;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public String f1539a;

    public r(String str) {
        this.f1539a = AbstractC2914a.c(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    public static String b(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e4) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e4);
                str2 = AbstractC2914a.f(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return com.mbridge.msdk.foundation.entity.o.k(str, " : ", str2);
    }

    public void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", b(this.f1539a, str, objArr));
        }
    }
}
