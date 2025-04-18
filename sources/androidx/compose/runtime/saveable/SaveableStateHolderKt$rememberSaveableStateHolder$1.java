package androidx.compose.runtime.saveable;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes4.dex */
final class SaveableStateHolderKt$rememberSaveableStateHolder$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public static final SaveableStateHolderKt$rememberSaveableStateHolder$1 f14522a = new r(0);

    @Override // q0.a
    public final Object invoke() {
        return new SaveableStateHolderImpl(new LinkedHashMap());
    }
}
