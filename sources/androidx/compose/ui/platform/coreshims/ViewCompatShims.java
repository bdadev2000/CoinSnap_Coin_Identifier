package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
public class ViewCompatShims {

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api26Impl {
        @DoNotInline
        public static AutofillId a(View view) {
            return view.getAutofillId();
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api29Impl {
        @DoNotInline
        public static ContentCaptureSession a(View view) {
            return view.getContentCaptureSession();
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api30Impl {
        @DoNotInline
        public static void a(View view, int i2) {
            view.setImportantForContentCapture(i2);
        }
    }

    public static AutofillIdCompat a(View view) {
        return new AutofillIdCompat(Api26Impl.a(view));
    }

    public static ContentCaptureSessionCompat b(View view) {
        ContentCaptureSession a2;
        if (Build.VERSION.SDK_INT < 29 || (a2 = Api29Impl.a(view)) == null) {
            return null;
        }
        return new ContentCaptureSessionCompat(a2, view);
    }

    public static void c(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.a(view, 1);
        }
    }
}
