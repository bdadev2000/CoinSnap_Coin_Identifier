package com.applovin.impl;

import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class fi {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final UUID f7709a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f7710c;

        public a(UUID uuid, int i9, byte[] bArr) {
            this.f7709a = uuid;
            this.b = i9;
            this.f7710c = bArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return a(uuid, null, bArr);
    }

    private static a b(byte[] bArr) {
        yg ygVar = new yg(bArr);
        if (ygVar.e() < 32) {
            return null;
        }
        ygVar.f(0);
        if (ygVar.j() != ygVar.a() + 4 || ygVar.j() != 1886614376) {
            return null;
        }
        int c9 = AbstractC0708i1.c(ygVar.j());
        if (c9 > 1) {
            L.p(c9, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(ygVar.s(), ygVar.s());
        if (c9 == 1) {
            ygVar.g(ygVar.A() * 16);
        }
        int A8 = ygVar.A();
        if (A8 != ygVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[A8];
        ygVar.a(bArr2, 0, A8);
        return new a(uuid, c9, bArr2);
    }

    public static UUID c(byte[] bArr) {
        a b = b(bArr);
        if (b != null) {
            return b.f7709a;
        }
        return null;
    }

    public static int d(byte[] bArr) {
        a b = b(bArr);
        if (b != null) {
            return b.b;
        }
        return -1;
    }

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static boolean a(byte[] bArr) {
        return b(bArr) != null;
    }

    public static byte[] a(byte[] bArr, UUID uuid) {
        a b = b(bArr);
        if (b == null) {
            return null;
        }
        if (uuid.equals(b.f7709a)) {
            return b.f7710c;
        }
        kc.d("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + b.f7709a + ".");
        return null;
    }
}
