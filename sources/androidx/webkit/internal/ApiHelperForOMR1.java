package androidx.webkit.internal;

import android.content.Context;
import android.net.Uri;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi
/* loaded from: classes.dex */
public class ApiHelperForOMR1 {
    @DoNotInline
    public static void a(@NonNull SafeBrowsingResponse safeBrowsingResponse, boolean z2) {
        safeBrowsingResponse.backToSafety(z2);
    }

    @NonNull
    @DoNotInline
    public static Uri b() {
        Uri safeBrowsingPrivacyPolicyUrl;
        safeBrowsingPrivacyPolicyUrl = WebView.getSafeBrowsingPrivacyPolicyUrl();
        return safeBrowsingPrivacyPolicyUrl;
    }

    @DoNotInline
    public static void c(@NonNull SafeBrowsingResponse safeBrowsingResponse, boolean z2) {
        safeBrowsingResponse.proceed(z2);
    }

    @DoNotInline
    public static void d(@NonNull List<String> list, @Nullable ValueCallback<Boolean> valueCallback) {
        WebView.setSafeBrowsingWhitelist(list, valueCallback);
    }

    @DoNotInline
    public static void e(@NonNull SafeBrowsingResponse safeBrowsingResponse, boolean z2) {
        safeBrowsingResponse.showInterstitial(z2);
    }

    @DoNotInline
    public static void f(@NonNull Context context, @Nullable ValueCallback<Boolean> valueCallback) {
        WebView.startSafeBrowsing(context, valueCallback);
    }
}
