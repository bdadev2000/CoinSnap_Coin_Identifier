package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class o0 {
    public static void a(q0 q0Var, Intent intent, Map<String, Uri> map) {
        RemoteInput.addDataResultToIntent(q0.a(q0Var), intent, map);
    }

    public static Set<String> b(Object obj) {
        return ((RemoteInput) obj).getAllowedDataTypes();
    }

    public static Map<String, Uri> c(Intent intent, String str) {
        return RemoteInput.getDataResultsFromIntent(intent, str);
    }

    public static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z8) {
        return builder.setAllowDataType(str, z8);
    }
}
