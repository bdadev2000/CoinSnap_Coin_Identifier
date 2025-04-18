package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.platform.WindowRecomposerFactory;
import java.util.concurrent.atomic.AtomicReference;

@StabilityInferred
@InternalComposeUiApi
/* loaded from: classes3.dex */
public final class WindowRecomposerPolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f16655a = new AtomicReference(WindowRecomposerFactory.Companion.f16654a);
}
