package sc;

import android.net.Uri;
import com.adjust.sdk.Constants;
import java.net.URL;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h implements a {
    public final qc.b a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f24962b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24963c;

    public h(qc.b appInfo, CoroutineContext blockingDispatcher) {
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
        Intrinsics.checkNotNullParameter("firebase-settings.crashlytics.com", "baseUrl");
        this.a = appInfo;
        this.f24962b = blockingDispatcher;
        this.f24963c = "firebase-settings.crashlytics.com";
    }

    public static final URL a(h hVar) {
        hVar.getClass();
        Uri.Builder appendPath = new Uri.Builder().scheme(Constants.SCHEME).authority(hVar.f24963c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        qc.b bVar = hVar.a;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.a).appendPath("settings");
        qc.a aVar = bVar.f23765f;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar.f23754c).appendQueryParameter("display_version", aVar.f23753b).build().toString());
    }
}
