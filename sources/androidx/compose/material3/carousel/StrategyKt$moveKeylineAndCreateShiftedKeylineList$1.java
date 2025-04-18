package androidx.compose.material3.carousel;

import d0.b0;
import e0.u;
import java.util.ArrayList;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class StrategyKt$moveKeylineAndCreateShiftedKeylineList$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KeylineList f12757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12759c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategyKt$moveKeylineAndCreateShiftedKeylineList$1(KeylineList keylineList, int i2, int i3) {
        super(1);
        this.f12757a = keylineList;
        this.f12758b = i2;
        this.f12759c = i3;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        KeylineListScope keylineListScope = (KeylineListScope) obj;
        ArrayList b12 = u.b1(this.f12757a);
        int i2 = this.f12758b;
        Keyline keyline = (Keyline) b12.get(i2);
        b12.remove(i2);
        b12.add(this.f12759c, keyline);
        int size = b12.size();
        for (int i3 = 0; i3 < size; i3++) {
            Keyline keyline2 = (Keyline) b12.get(i3);
            keylineListScope.a(keyline2.f12721a, keyline2.e);
        }
        return b0.f30125a;
    }
}
