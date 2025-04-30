package p8;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class E extends IOException {
    public final EnumC2574b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(EnumC2574b enumC2574b) {
        super(G7.j.j(enumC2574b, "stream was reset: "));
        G7.j.e(enumC2574b, "errorCode");
        this.b = enumC2574b;
    }
}
