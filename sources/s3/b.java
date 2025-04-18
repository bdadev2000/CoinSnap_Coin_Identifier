package s3;

import java.util.List;
import p3.h;
import p3.p;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: b, reason: collision with root package name */
    public final a f24173b;

    /* renamed from: c, reason: collision with root package name */
    public final a f24174c;

    public b(a aVar, a aVar2) {
        this.f24173b = aVar;
        this.f24174c = aVar2;
    }

    @Override // s3.d
    public final p3.d a() {
        return new p((h) this.f24173b.a(), (h) this.f24174c.a());
    }

    @Override // s3.d
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // s3.d
    public final boolean isStatic() {
        return this.f24173b.isStatic() && this.f24174c.isStatic();
    }
}
