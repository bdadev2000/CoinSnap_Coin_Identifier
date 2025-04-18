package wh;

/* loaded from: classes5.dex */
public enum m0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* renamed from: b, reason: collision with root package name */
    public final String f27143b;

    m0(String str) {
        this.f27143b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f27143b;
    }
}
