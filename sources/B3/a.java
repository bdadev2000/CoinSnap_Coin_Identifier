package B3;

import android.content.ClipData;
import android.content.pm.ApkChecksum;
import android.content.res.Configuration;
import android.media.ApplicationMediaCapabilities;
import android.view.ContentInfo;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ int b(Configuration configuration) {
        return configuration.fontWeightAdjustment;
    }

    public static /* bridge */ /* synthetic */ ApkChecksum g(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* synthetic */ ApplicationMediaCapabilities.Builder h() {
        return new ApplicationMediaCapabilities.Builder();
    }

    public static /* synthetic */ ContentInfo.Builder l(ClipData clipData, int i9) {
        return new ContentInfo.Builder(clipData, i9);
    }

    public static /* bridge */ /* synthetic */ ContentInfo n(Object obj) {
        return (ContentInfo) obj;
    }
}
