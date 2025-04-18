package s0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import androidx.core.app.h;

/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {
    public final /* synthetic */ h a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InputConnection inputConnection, h hVar) {
        super(inputConnection, false);
        this.a = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        byte b3;
        String str2;
        ResultReceiver resultReceiver;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        h hVar = this.a;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (bundle != null) {
            if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                b3 = false;
            } else if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                b3 = true;
            }
            if (b3 != false) {
                str2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
            } else {
                str2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
            }
            try {
                resultReceiver = (ResultReceiver) bundle.getParcelable(str2);
                if (b3 != false) {
                    str3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                } else {
                    str3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                }
            } catch (Throwable th2) {
                th = th2;
                resultReceiver = null;
            }
            try {
                Uri uri = (Uri) bundle.getParcelable(str3);
                if (b3 != false) {
                    str4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                } else {
                    str4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                }
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(str4);
                if (b3 != false) {
                    str5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                } else {
                    str5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                }
                Uri uri2 = (Uri) bundle.getParcelable(str5);
                if (b3 != false) {
                    str6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                } else {
                    str6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                }
                int i10 = bundle.getInt(str6);
                if (b3 != false) {
                    str7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                } else {
                    str7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                }
                Bundle bundle2 = (Bundle) bundle.getParcelable(str7);
                if (uri != null && clipDescription != null) {
                    z10 = hVar.e(new f.a(uri, clipDescription, uri2), i10, bundle2);
                }
                if (resultReceiver != null) {
                    resultReceiver.send(z10 ? 1 : 0, null);
                }
            } catch (Throwable th3) {
                th = th3;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        }
        if (z10) {
            return true;
        }
        return super.performPrivateCommand(str, bundle);
    }
}
