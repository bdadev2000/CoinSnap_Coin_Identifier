package B1;

import java.util.List;
import y1.i;
import y1.o;

/* loaded from: classes.dex */
public final class c implements e {
    public final b b;

    /* renamed from: c, reason: collision with root package name */
    public final b f263c;

    public c(b bVar, b bVar2) {
        this.b = bVar;
        this.f263c = bVar2;
    }

    @Override // B1.e
    public final y1.e g() {
        return new o((i) this.b.g(), (i) this.f263c.g());
    }

    @Override // B1.e
    public final List j() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // B1.e
    public final boolean o() {
        if (this.b.o() && this.f263c.o()) {
            return true;
        }
        return false;
    }
}
