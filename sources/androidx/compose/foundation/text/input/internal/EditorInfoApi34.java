package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import b1.f0;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes3.dex */
final class EditorInfoApi34 {

    /* renamed from: a, reason: collision with root package name */
    public static final EditorInfoApi34 f6404a = new Object();

    @DoNotInline
    public final void a(@NotNull EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(f0.v(d.k(), d.x(), d.s(), d.v(), d.z(), d.B(), d.D()));
        editorInfo.setSupportedHandwritingGesturePreviews(f0.C(d.k(), d.x(), d.s(), d.v()));
    }
}
