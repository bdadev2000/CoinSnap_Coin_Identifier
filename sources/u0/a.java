package u0;

import java.util.Random;

/* loaded from: classes.dex */
public abstract class a extends f {
    @Override // u0.f
    public final int a(int i2) {
        return ((-i2) >> 31) & (e().nextInt() >>> (32 - i2));
    }

    @Override // u0.f
    public final int b() {
        return e().nextInt();
    }

    @Override // u0.f
    public final int c(int i2) {
        return e().nextInt(i2);
    }

    public abstract Random e();
}
