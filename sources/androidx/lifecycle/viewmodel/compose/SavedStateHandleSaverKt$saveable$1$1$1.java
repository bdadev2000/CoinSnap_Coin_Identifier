package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.lifecycle.SavedStateHandle;
import d0.c;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.n;
import p0.a;

/* loaded from: classes3.dex */
final /* synthetic */ class SavedStateHandleSaverKt$saveable$1$1$1 implements SaverScope, l {
    @Override // androidx.compose.runtime.saveable.SaverScope
    public final boolean a(Object obj) {
        throw null;
    }

    @Override // kotlin.jvm.internal.l
    public final c c() {
        return new n(1, null, SavedStateHandle.Companion.class, "validateValue", "validateValue(Ljava/lang/Object;)Z", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof SaverScope) && (obj instanceof l)) {
            return a.g(c(), ((l) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return c().hashCode();
    }
}
