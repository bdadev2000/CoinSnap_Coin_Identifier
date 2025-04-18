package androidx.compose.material3.carousel;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class StrategyKt$createShiftedKeylineListForContentPadding$newKeylines$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KeylineList f12755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f12756b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategyKt$createShiftedKeylineListForContentPadding$newKeylines$1(KeylineList keylineList, float f2) {
        super(1);
        this.f12755a = keylineList;
        this.f12756b = f2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        KeylineListScope keylineListScope = (KeylineListScope) obj;
        KeylineList keylineList = this.f12755a;
        int size = keylineList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Keyline keyline = (Keyline) keylineList.get(i2);
            keylineListScope.a(keyline.f12721a - Math.abs(this.f12756b), keyline.e);
        }
        return b0.f30125a;
    }
}
