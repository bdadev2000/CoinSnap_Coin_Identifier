package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.view.inputmethod.InputContentInfoCompat;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes3.dex */
public final class InputConnectionCompat {

    /* renamed from: androidx.core.view.inputmethod.InputConnectionCompat$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass2 extends InputConnectionWrapper {
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
        
            r3.send(0, null);
         */
        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean performPrivateCommand(java.lang.String r9, android.os.Bundle r10) {
            /*
                r8 = this;
                if (r10 != 0) goto L4
                goto L80
            L4:
                java.lang.String r0 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
                boolean r0 = android.text.TextUtils.equals(r0, r9)
                r1 = 0
                if (r0 == 0) goto Lf
                r0 = r1
                goto L18
            Lf:
                java.lang.String r0 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
                boolean r0 = android.text.TextUtils.equals(r0, r9)
                if (r0 == 0) goto L80
                r0 = 1
            L18:
                r2 = 0
                if (r0 == 0) goto L21
                java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
                goto L23
            L1e:
                r9 = move-exception
                r3 = r2
                goto L7a
            L21:
                java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
            L23:
                android.os.Parcelable r3 = r10.getParcelable(r3)     // Catch: java.lang.Throwable -> L1e
                android.os.ResultReceiver r3 = (android.os.ResultReceiver) r3     // Catch: java.lang.Throwable -> L1e
                if (r0 == 0) goto L30
                java.lang.String r4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
                goto L32
            L2e:
                r9 = move-exception
                goto L7a
            L30:
                java.lang.String r4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            L32:
                android.os.Parcelable r4 = r10.getParcelable(r4)     // Catch: java.lang.Throwable -> L2e
                android.net.Uri r4 = (android.net.Uri) r4     // Catch: java.lang.Throwable -> L2e
                if (r0 == 0) goto L3d
                java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
                goto L3f
            L3d:
                java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            L3f:
                android.os.Parcelable r5 = r10.getParcelable(r5)     // Catch: java.lang.Throwable -> L2e
                android.content.ClipDescription r5 = (android.content.ClipDescription) r5     // Catch: java.lang.Throwable -> L2e
                if (r0 == 0) goto L4a
                java.lang.String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
                goto L4c
            L4a:
                java.lang.String r6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            L4c:
                android.os.Parcelable r6 = r10.getParcelable(r6)     // Catch: java.lang.Throwable -> L2e
                android.net.Uri r6 = (android.net.Uri) r6     // Catch: java.lang.Throwable -> L2e
                if (r0 == 0) goto L57
                java.lang.String r7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
                goto L59
            L57:
                java.lang.String r7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            L59:
                r10.getInt(r7)     // Catch: java.lang.Throwable -> L2e
                if (r0 == 0) goto L61
                java.lang.String r0 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
                goto L63
            L61:
                java.lang.String r0 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            L63:
                android.os.Parcelable r0 = r10.getParcelable(r0)     // Catch: java.lang.Throwable -> L2e
                android.os.Bundle r0 = (android.os.Bundle) r0     // Catch: java.lang.Throwable -> L2e
                if (r4 == 0) goto L74
                if (r5 != 0) goto L6e
                goto L74
            L6e:
                androidx.core.view.inputmethod.InputContentInfoCompat r9 = new androidx.core.view.inputmethod.InputContentInfoCompat     // Catch: java.lang.Throwable -> L2e
                r9.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> L2e
                throw r2     // Catch: java.lang.Throwable -> L2e
            L74:
                if (r3 == 0) goto L80
                r3.send(r1, r2)
                goto L80
            L7a:
                if (r3 == 0) goto L7f
                r3.send(r1, r2)
            L7f:
                throw r9
            L80:
                boolean r9 = super.performPrivateCommand(r9, r10)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.inputmethod.InputConnectionCompat.AnonymousClass2.performPrivateCommand(java.lang.String, android.os.Bundle):boolean");
        }
    }

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class Api25Impl {
        @DoNotInline
        public static boolean a(InputConnection inputConnection, InputContentInfo inputContentInfo, int i2, Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i2, bundle);
        }
    }

    /* loaded from: classes3.dex */
    public interface OnCommitContentListener {
        boolean a(InputContentInfoCompat inputContentInfoCompat, int i2, Bundle bundle);
    }

    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, final OnCommitContentListener onCommitContentListener) {
        if (editorInfo != null) {
            return new InputConnectionWrapper(inputConnection) { // from class: androidx.core.view.inputmethod.InputConnectionCompat.1
                @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
                    if (onCommitContentListener.a(inputContentInfo == null ? null : new InputContentInfoCompat(new InputContentInfoCompat.InputContentInfoCompatApi25Impl(inputContentInfo)), i2, bundle)) {
                        return true;
                    }
                    return super.commitContent(inputContentInfo, i2, bundle);
                }
            };
        }
        throw new NullPointerException("editorInfo must be non-null");
    }
}
