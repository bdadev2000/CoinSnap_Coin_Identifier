package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.atomic.AtomicReference;

@StabilityInferred
@d0.a
/* loaded from: classes2.dex */
public class TextInputService {

    /* renamed from: a, reason: collision with root package name */
    public final PlatformTextInputService f17366a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f17367b = new AtomicReference(null);

    public TextInputService(PlatformTextInputService platformTextInputService) {
        this.f17366a = platformTextInputService;
    }
}
