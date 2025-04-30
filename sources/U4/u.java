package U4;

import android.app.NotificationManager;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaCodecInfo;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcessClient;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class u {
    public static /* bridge */ /* synthetic */ boolean A(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static /* bridge */ /* synthetic */ boolean B(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static /* bridge */ /* synthetic */ boolean C(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint c() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint d(int i9, int i10, int i11) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i9, i10, i11);
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint e(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* bridge */ /* synthetic */ String f(NotificationManager notificationManager) {
        return notificationManager.getNotificationDelegate();
    }

    public static /* bridge */ /* synthetic */ void i(NotificationManager notificationManager) {
        notificationManager.setNotificationDelegate("com.google.android.gms");
    }

    public static /* bridge */ /* synthetic */ void j(GradientDrawable gradientDrawable, int[] iArr, float[] fArr) {
        gradientDrawable.setColors(iArr, fArr);
    }

    public static /* bridge */ /* synthetic */ void r(WebView webView, WebViewRenderProcessClient webViewRenderProcessClient) {
        webView.setWebViewRenderProcessClient(webViewRenderProcessClient);
    }

    public static /* bridge */ /* synthetic */ boolean x(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static /* bridge */ /* synthetic */ void y(NotificationManager notificationManager) {
        notificationManager.setNotificationDelegate(null);
    }
}
