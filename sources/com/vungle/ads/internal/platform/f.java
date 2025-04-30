package com.vungle.ads.internal.platform;

import G7.j;
import android.content.Context;
import android.util.AndroidRuntimeException;
import android.webkit.WebSettings;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.util.v;

/* loaded from: classes3.dex */
public final class f {
    public static final e Companion = new e(null);
    private static final String TAG = f.class.getSimpleName();
    private final Context context;

    public f(Context context) {
        j.e(context, "context");
        this.context = context;
    }

    public final void getUserAgent(S.a aVar) {
        j.e(aVar, "consumer");
        try {
            aVar.accept(WebSettings.getDefaultUserAgent(this.context));
        } catch (Exception e4) {
            if (e4 instanceof AndroidRuntimeException) {
                u uVar = v.Companion;
                String str = TAG;
                j.d(str, "TAG");
                uVar.e(str, "WebView could be missing here");
            }
            aVar.accept(null);
        }
    }
}
