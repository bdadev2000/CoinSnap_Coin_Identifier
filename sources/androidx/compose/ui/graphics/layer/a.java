package androidx.compose.ui.graphics.layer;

import android.view.WindowInsets;
import android.view.contentcapture.ContentCaptureSession;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ WindowInsets.Builder c() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder d(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession f(Object obj) {
        return (ContentCaptureSession) obj;
    }
}
