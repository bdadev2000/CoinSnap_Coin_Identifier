package je;

import he.q;
import ie.e;
import java.util.Arrays;
import le.f;
import le.i;

/* loaded from: classes4.dex */
public final class c extends ie.d {

    /* renamed from: f, reason: collision with root package name */
    public final q f20021f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i10) {
        super(0);
        if (i10 != 1) {
            this.f20021f = new q(Arrays.asList(new a(), new b(), new d()));
        } else {
            super(0);
            this.f20021f = new q(Arrays.asList(new le.d(), new f(), new i()));
        }
    }

    @Override // ie.d
    public final e o() {
        return this.f20021f;
    }
}
