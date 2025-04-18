package androidx.datastore.preferences.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class RawMessageInfo implements MessageInfo {

    /* renamed from: a, reason: collision with root package name */
    public final MessageLite f19330a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19331b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f19332c;
    public final int d;

    public RawMessageInfo(GeneratedMessageLite generatedMessageLite, String str, Object[] objArr) {
        this.f19330a = generatedMessageLite;
        this.f19331b = str;
        this.f19332c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i3 = 1;
        int i4 = 13;
        while (true) {
            int i5 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.d = i2 | (charAt2 << i4);
                return;
            } else {
                i2 |= (charAt2 & 8191) << i4;
                i4 += 13;
                i3 = i5;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public final boolean a() {
        return (this.d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public final MessageLite b() {
        return this.f19330a;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public final ProtoSyntax c() {
        return (this.d & 1) == 1 ? ProtoSyntax.f19322a : ProtoSyntax.f19323b;
    }

    public final Object[] d() {
        return this.f19332c;
    }

    public final String e() {
        return this.f19331b;
    }
}
