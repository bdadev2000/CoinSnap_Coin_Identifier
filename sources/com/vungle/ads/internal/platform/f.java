package com.vungle.ads.internal.platform;

import android.content.Context;
import android.util.AndroidRuntimeException;
import android.webkit.WebSettings;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.util.v;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {
    public static final e Companion = new e(null);
    private static final String TAG = f.class.getSimpleName();
    private final Context context;

    public f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final void getUserAgent(m0.a consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        try {
            consumer.accept(WebSettings.getDefaultUserAgent(this.context));
        } catch (Exception e2) {
            if (e2 instanceof AndroidRuntimeException) {
                u uVar = v.Companion;
                String TAG2 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                uVar.e(TAG2, "WebView could be missing here");
            }
            consumer.accept(null);
        }
    }
}
