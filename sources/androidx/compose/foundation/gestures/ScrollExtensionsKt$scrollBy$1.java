package androidx.compose.foundation.gestures;

import j0.c;
import j0.e;
import kotlin.jvm.internal.c0;
import org.objectweb.asm.Opcodes;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {Opcodes.V17}, m = "scrollBy")
/* loaded from: classes3.dex */
public final class ScrollExtensionsKt$scrollBy$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public c0 f3418a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3419b;

    /* renamed from: c, reason: collision with root package name */
    public int f3420c;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3419b = obj;
        this.f3420c |= Integer.MIN_VALUE;
        return ScrollExtensionsKt.b(null, 0.0f, this);
    }
}
