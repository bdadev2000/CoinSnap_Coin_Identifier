package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import z0.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DateInputKt$DateInputTextField$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableState f8678a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateInputKt$DateInputTextField$3(MutableState mutableState) {
        super(2);
        this.f8678a = mutableState;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            MutableState mutableState = this.f8678a;
            if (!m.Z0((CharSequence) mutableState.getValue())) {
                TextKt.b((String) mutableState.getValue(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            }
        }
        return b0.f30125a;
    }
}
