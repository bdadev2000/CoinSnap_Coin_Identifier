package retrofit2;

import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.l;

/* loaded from: classes.dex */
public final class KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1 extends r implements l {
    final /* synthetic */ Call $this_await$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1(Call call) {
        super(1);
        this.$this_await$inlined = call;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return b0.f30125a;
    }

    public final void invoke(@Nullable Throwable th) {
        this.$this_await$inlined.cancel();
    }
}
