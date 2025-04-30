package K7;

import G7.j;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes3.dex */
public final class a extends J7.a {
    @Override // J7.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        j.d(current, "current(...)");
        return current;
    }
}
