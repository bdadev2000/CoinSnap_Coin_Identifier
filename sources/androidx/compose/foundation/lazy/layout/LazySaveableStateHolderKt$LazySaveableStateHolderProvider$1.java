package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* loaded from: classes2.dex */
final class LazySaveableStateHolderKt$LazySaveableStateHolderProvider$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazySaveableStateHolder f4874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f4875b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazySaveableStateHolderKt$LazySaveableStateHolderProvider$1(LazySaveableStateHolder lazySaveableStateHolder, q qVar) {
        super(2);
        this.f4874a = lazySaveableStateHolder;
        this.f4875b = qVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            SaveableStateHolder a2 = SaveableStateHolderKt.a(composer);
            LazySaveableStateHolder lazySaveableStateHolder = this.f4874a;
            lazySaveableStateHolder.f4862b.setValue(a2);
            this.f4875b.invoke(lazySaveableStateHolder, composer, 0);
        }
        return b0.f30125a;
    }
}
