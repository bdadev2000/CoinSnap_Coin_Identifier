package o1;

import android.os.ext.SdkExtensions;
import kotlin.time.DurationKt;

/* loaded from: classes.dex */
public final class a {
    public static final a a = new a();

    public final int a() {
        int extensionVersion;
        extensionVersion = SdkExtensions.getExtensionVersion(DurationKt.NANOS_IN_MILLIS);
        return extensionVersion;
    }
}
