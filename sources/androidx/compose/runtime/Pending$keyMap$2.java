package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import b1.f0;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.r;
import r0.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Pending$keyMap$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Pending f13854a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pending$keyMap$2(Pending pending) {
        super(0);
        this.f13854a = pending;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.runtime.KeyInfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object[]] */
    @Override // q0.a
    public final Object invoke() {
        Pending pending = this.f13854a;
        MutableScatterMap mutableScatterMap = new MutableScatterMap(pending.f13850a.size());
        List list = pending.f13850a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ?? r5 = (KeyInfo) list.get(i2);
            Object obj = r5.f13819b;
            int i3 = r5.f13818a;
            Object joinedKey = obj != null ? new JoinedKey(Integer.valueOf(i3), r5.f13819b) : Integer.valueOf(i3);
            int g2 = mutableScatterMap.g(joinedKey);
            boolean z2 = g2 < 0;
            Object obj2 = z2 ? null : mutableScatterMap.f1559c[g2];
            if (obj2 != null) {
                if (!(obj2 instanceof List) || ((obj2 instanceof r0.a) && !(obj2 instanceof c))) {
                    r5 = f0.w(obj2, r5);
                } else {
                    List d = e.d(obj2);
                    d.add(r5);
                    r5 = d;
                }
            }
            if (z2) {
                int i4 = ~g2;
                mutableScatterMap.f1558b[i4] = joinedKey;
                mutableScatterMap.f1559c[i4] = r5;
            } else {
                mutableScatterMap.f1559c[g2] = r5;
            }
        }
        return new MutableScatterMultiMap(mutableScatterMap);
    }
}
