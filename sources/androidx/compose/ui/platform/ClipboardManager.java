package androidx.compose.ui.platform;

import androidx.compose.ui.text.AnnotatedString;

/* loaded from: classes2.dex */
public interface ClipboardManager {
    AnnotatedString a();

    default ClipEntry b() {
        return null;
    }

    default boolean c() {
        AnnotatedString a2 = a();
        return a2 != null && a2.length() > 0;
    }

    void d(AnnotatedString annotatedString);
}
