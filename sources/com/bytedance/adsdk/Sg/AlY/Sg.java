package com.bytedance.adsdk.Sg.AlY;

import com.bytedance.component.sdk.annotation.RestrictTo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class Sg implements vc {
    @Override // com.bytedance.adsdk.Sg.AlY.vc
    public AlY YFl(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new YFl(httpURLConnection);
    }
}
