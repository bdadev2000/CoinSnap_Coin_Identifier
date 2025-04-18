package androidx.compose.ui.text.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.emoji2.text.EmojiCompat;

@StabilityInferred
/* loaded from: classes4.dex */
public final class EmojiCompatStatus implements EmojiCompatStatusDelegate {

    /* renamed from: a, reason: collision with root package name */
    public static final EmojiCompatStatusDelegate f17430a;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.text.platform.DefaultImpl, androidx.compose.ui.text.platform.EmojiCompatStatusDelegate, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.f17426a = EmojiCompat.g() ? obj.a() : null;
        f17430a = obj;
    }
}
