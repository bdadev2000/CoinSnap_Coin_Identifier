package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.Map;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class LazySaveableStateHolder$Companion$saver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SaveableStateRegistry f4868a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazySaveableStateHolder$Companion$saver$2(SaveableStateRegistry saveableStateRegistry) {
        super(1);
        this.f4868a = saveableStateRegistry;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return new LazySaveableStateHolder(this.f4868a, (Map) obj);
    }
}
