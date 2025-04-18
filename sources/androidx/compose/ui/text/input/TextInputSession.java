package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
@d0.a
/* loaded from: classes3.dex */
public final class TextInputSession {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputService f17390a;

    /* renamed from: b, reason: collision with root package name */
    public final PlatformTextInputService f17391b;

    public TextInputSession(TextInputService textInputService, PlatformTextInputService platformTextInputService) {
        this.f17390a = textInputService;
        this.f17391b = platformTextInputService;
    }
}
