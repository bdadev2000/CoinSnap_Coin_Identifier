package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Recomposer$performRecompose$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableScatterSet f13910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlledComposition f13911b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$performRecompose$1$1(MutableScatterSet mutableScatterSet, ControlledComposition controlledComposition) {
        super(0);
        this.f13910a = mutableScatterSet;
        this.f13911b = controlledComposition;
    }

    @Override // q0.a
    public final Object invoke() {
        MutableScatterSet mutableScatterSet = this.f13910a;
        Object[] objArr = mutableScatterSet.f1592b;
        long[] jArr = mutableScatterSet.f1591a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            this.f13911b.p(objArr[(i2 << 3) + i4]);
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return b0.f30125a;
    }
}
