package Q7;

/* loaded from: classes3.dex */
public final class I implements P {
    public final boolean b;

    public I(boolean z8) {
        this.b = z8;
    }

    @Override // Q7.P
    public final f0 c() {
        return null;
    }

    @Override // Q7.P
    public final boolean isActive() {
        return this.b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.b) {
            str = "Active";
        } else {
            str = "New";
        }
        return com.applovin.impl.L.k(sb, str, '}');
    }
}
