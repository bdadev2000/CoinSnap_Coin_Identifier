package com.google.android.gms.ads.h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.internal.ads.zzbkm;
import com.google.android.gms.internal.ads.zzbkz;

@RequiresApi(api = 21)
/* loaded from: classes3.dex */
public final class H5AdsWebViewClient extends zzbkm {
    private final zzbkz zza;

    public H5AdsWebViewClient(@NonNull Context context, @NonNull WebView webView) {
        this.zza = new zzbkz(context, webView);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbkm
    @NonNull
    public WebViewClient getDelegate() {
        return this.zza;
    }

    @Nullable
    public WebViewClient getDelegateWebViewClient() {
        return this.zza.getDelegate();
    }

    public void setDelegateWebViewClient(@Nullable WebViewClient webViewClient) {
        this.zza.zzb(webViewClient);
    }
}
