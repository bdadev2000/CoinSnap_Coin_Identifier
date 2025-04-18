package androidx.compose.ui.platform;

import androidx.compose.runtime.collection.MutableVector;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class InputMethodSession {

    /* renamed from: a, reason: collision with root package name */
    public final PlatformTextInputMethodRequest f16517a;

    /* renamed from: b, reason: collision with root package name */
    public final q0.a f16518b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16519c = new Object();
    public final MutableVector d = new MutableVector(new WeakReference[16]);
    public boolean e;

    public InputMethodSession(PlatformTextInputMethodRequest platformTextInputMethodRequest, q0.a aVar) {
        this.f16517a = platformTextInputMethodRequest;
        this.f16518b = aVar;
    }
}
