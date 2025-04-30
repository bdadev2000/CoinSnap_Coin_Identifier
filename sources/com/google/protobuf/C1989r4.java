package com.google.protobuf;

/* renamed from: com.google.protobuf.r4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1989r4 implements K3 {
    private final N3 defaultInstance;
    private final int flags;
    private final String info;
    private final Object[] objects;

    public C1989r4(N3 n32, String str, Object[] objArr) {
        this.defaultInstance = n32;
        this.info = str;
        this.objects = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.flags = charAt;
            return;
        }
        int i9 = charAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 >= 55296) {
                i9 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            } else {
                this.flags = i9 | (charAt2 << i10);
                return;
            }
        }
    }

    @Override // com.google.protobuf.K3
    public N3 getDefaultInstance() {
        return this.defaultInstance;
    }

    public Object[] getObjects() {
        return this.objects;
    }

    public String getStringInfo() {
        return this.info;
    }

    @Override // com.google.protobuf.K3
    public EnumC1962n4 getSyntax() {
        if ((this.flags & 1) == 1) {
            return EnumC1962n4.PROTO2;
        }
        return EnumC1962n4.PROTO3;
    }

    @Override // com.google.protobuf.K3
    public boolean isMessageSetWireFormat() {
        if ((this.flags & 2) == 2) {
            return true;
        }
        return false;
    }
}
