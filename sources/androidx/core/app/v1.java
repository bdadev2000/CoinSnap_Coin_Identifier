package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class v1 {
    public static void a(x1 x1Var, Intent intent, Map<String, Uri> map) {
        RemoteInput.addDataResultToIntent(x1.a(x1Var), intent, map);
    }

    public static Set<String> b(Object obj) {
        Set<String> allowedDataTypes;
        allowedDataTypes = ((RemoteInput) obj).getAllowedDataTypes();
        return allowedDataTypes;
    }

    public static Map<String, Uri> c(Intent intent, String str) {
        Map<String, Uri> dataResultsFromIntent;
        dataResultsFromIntent = RemoteInput.getDataResultsFromIntent(intent, str);
        return dataResultsFromIntent;
    }

    public static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z10) {
        RemoteInput.Builder allowDataType;
        allowDataType = builder.setAllowDataType(str, z10);
        return allowDataType;
    }
}
