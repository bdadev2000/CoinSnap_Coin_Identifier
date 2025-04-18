package com.google.protobuf;

/* loaded from: classes4.dex */
public final class s6 implements l5 {
    private final o5 defaultInstance;
    private final int flags;
    private final String info;
    private final Object[] objects;

    public s6(o5 o5Var, String str, Object[] objArr) {
        this.defaultInstance = o5Var;
        this.info = str;
        this.objects = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.flags = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 >= 55296) {
                i10 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            } else {
                this.flags = i10 | (charAt2 << i11);
                return;
            }
        }
    }

    @Override // com.google.protobuf.l5
    public o5 getDefaultInstance() {
        return this.defaultInstance;
    }

    public Object[] getObjects() {
        return this.objects;
    }

    public String getStringInfo() {
        return this.info;
    }

    @Override // com.google.protobuf.l5
    public o6 getSyntax() {
        return (this.flags & 1) == 1 ? o6.PROTO2 : o6.PROTO3;
    }

    @Override // com.google.protobuf.l5
    public boolean isMessageSetWireFormat() {
        return (this.flags & 2) == 2;
    }
}
