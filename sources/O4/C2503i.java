package o4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: o4.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2503i extends G1.a {
    public final List b;

    public C2503i(ArrayList arrayList) {
        super("Dependency cycle detected: " + Arrays.toString(arrayList.toArray()));
    }
}
