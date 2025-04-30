package com.bytedance.adsdk.lottie.jU;

import com.bytedance.component.sdk.annotation.RestrictTo;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class lMd implements HWF {
    @Override // com.bytedance.adsdk.lottie.jU.HWF
    public jU zp(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new zp(httpURLConnection);
    }
}
