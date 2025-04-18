package v0;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes2.dex */
public final class a extends u0.a {
    @Override // u0.f
    public final int d(int i2, int i3) {
        return ThreadLocalRandom.current().nextInt(i2, i3);
    }

    @Override // u0.a
    public final Random e() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        p0.a.r(current, "current(...)");
        return current;
    }
}
