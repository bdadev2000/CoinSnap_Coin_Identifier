package androidx.compose.ui.platform;

import androidx.collection.IntObjectMap;
import androidx.collection.IntSetKt;
import androidx.collection.MutableIntSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import java.util.List;

@StabilityInferred
/* loaded from: classes3.dex */
public final class SemanticsNodeCopy {

    /* renamed from: a, reason: collision with root package name */
    public final SemanticsConfiguration f16594a;

    /* renamed from: b, reason: collision with root package name */
    public final MutableIntSet f16595b;

    public SemanticsNodeCopy(SemanticsNode semanticsNode, IntObjectMap intObjectMap) {
        this.f16594a = semanticsNode.d;
        int[] iArr = IntSetKt.f1446a;
        this.f16595b = new MutableIntSet();
        List h2 = SemanticsNode.h(semanticsNode, true, 4);
        int size = h2.size();
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode2 = (SemanticsNode) h2.get(i2);
            if (intObjectMap.a(semanticsNode2.f16823g)) {
                this.f16595b.b(semanticsNode2.f16823g);
            }
        }
    }
}
