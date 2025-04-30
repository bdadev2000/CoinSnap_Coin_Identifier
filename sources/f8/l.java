package f8;

import java.util.Map;

/* loaded from: classes3.dex */
public final class l extends G7.k implements F7.l {

    /* renamed from: c, reason: collision with root package name */
    public static final l f20401c = new l(1, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final l f20402d = new l(1, 1);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i9, int i10) {
        super(i9);
        this.b = i10;
    }

    @Override // F7.l
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                c8.a aVar = (c8.a) obj;
                G7.j.e(aVar, "$this$buildSerialDescriptor");
                c8.a.a(aVar, "JsonPrimitive", new n(k.f20395c));
                c8.a.a(aVar, "JsonNull", new n(k.f20396d));
                c8.a.a(aVar, "JsonLiteral", new n(k.f20397f));
                c8.a.a(aVar, "JsonObject", new n(k.f20398g));
                c8.a.a(aVar, "JsonArray", new n(k.f20399h));
                return t7.y.f23029a;
            default:
                Map.Entry entry = (Map.Entry) obj;
                G7.j.e(entry, "<name for destructuring parameter 0>");
                String str = (String) entry.getKey();
                j jVar = (j) entry.getValue();
                StringBuilder sb = new StringBuilder();
                g8.y.a(sb, str);
                sb.append(':');
                sb.append(jVar);
                String sb2 = sb.toString();
                G7.j.d(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
        }
    }
}
