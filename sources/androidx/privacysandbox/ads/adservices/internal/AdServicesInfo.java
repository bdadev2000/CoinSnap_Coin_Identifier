package androidx.privacysandbox.ads.adservices.internal;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class AdServicesInfo {

    @RequiresApi
    /* loaded from: classes.dex */
    public static final class Extensions30Impl {

        /* renamed from: a, reason: collision with root package name */
        public static final Extensions30Impl f20816a = new Object();

        @DoNotInline
        public final int a() {
            int extensionVersion;
            extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            return extensionVersion;
        }
    }

    public static int a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return Extensions30Impl.f20816a.a();
        }
        return 0;
    }
}
