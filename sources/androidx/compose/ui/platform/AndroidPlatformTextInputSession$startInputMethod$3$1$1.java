package androidx.compose.ui.platform;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper;
import d0.b0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AndroidPlatformTextInputSession$startInputMethod$3$1$1 extends r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InputMethodSession f16366a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AndroidPlatformTextInputSession f16367b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$3$1$1(InputMethodSession inputMethodSession, AndroidPlatformTextInputSession androidPlatformTextInputSession) {
        super(1);
        this.f16366a = inputMethodSession;
        this.f16367b = androidPlatformTextInputSession;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        InputMethodSession inputMethodSession = this.f16366a;
        synchronized (inputMethodSession.f16519c) {
            try {
                inputMethodSession.e = true;
                MutableVector mutableVector = inputMethodSession.d;
                int i2 = mutableVector.f14144c;
                if (i2 > 0) {
                    Object[] objArr = mutableVector.f14142a;
                    int i3 = 0;
                    do {
                        NullableInputConnectionWrapper nullableInputConnectionWrapper = (NullableInputConnectionWrapper) ((WeakReference) objArr[i3]).get();
                        if (nullableInputConnectionWrapper != null) {
                            nullableInputConnectionWrapper.a();
                        }
                        i3++;
                    } while (i3 < i2);
                }
                inputMethodSession.d.g();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f16367b.f16355b.f17366a.b();
        return b0.f30125a;
    }
}
