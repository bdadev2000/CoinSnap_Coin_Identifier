package androidx.compose.material3.carousel;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class KeylinesKt$createLeftAlignedKeylineList$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f12738a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Arrangement f12739b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f12740c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeylinesKt$createLeftAlignedKeylineList$1(float f2, Arrangement arrangement, float f3) {
        super(1);
        this.f12738a = f2;
        this.f12739b = arrangement;
        this.f12740c = f3;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        KeylineListScope keylineListScope = (KeylineListScope) obj;
        keylineListScope.a(this.f12738a, true);
        Arrangement arrangement = this.f12739b;
        int i2 = arrangement.f12643g;
        for (int i3 = 0; i3 < i2; i3++) {
            keylineListScope.a(arrangement.f12642f, false);
        }
        for (int i4 = 0; i4 < arrangement.e; i4++) {
            keylineListScope.a(arrangement.d, false);
        }
        for (int i5 = 0; i5 < arrangement.f12641c; i5++) {
            keylineListScope.a(arrangement.f12640b, false);
        }
        keylineListScope.a(this.f12740c, true);
        return b0.f30125a;
    }
}
