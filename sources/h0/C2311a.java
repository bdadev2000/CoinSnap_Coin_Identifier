package h0;

import F7.l;
import G7.k;
import java.util.Map;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2311a extends k implements l {
    public static final C2311a b = new k(1);

    @Override // F7.l
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        G7.j.e(entry, "entry");
        return "  " + ((f) entry.getKey()).f20575a + " = " + entry.getValue();
    }
}
