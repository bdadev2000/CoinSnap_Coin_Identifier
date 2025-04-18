package com.applovin.impl;

import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class fi {

    /* loaded from: classes.dex */
    public static class a {
        private final UUID a;

        /* renamed from: b, reason: collision with root package name */
        private final int f4753b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f4754c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.a = uuid;
            this.f4753b = i10;
            this.f4754c = bArr;
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
        int c10 = i1.c(ygVar.j());
        if (c10 > 1) {
            a4.j.u("Unsupported pssh version: ", c10, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(ygVar.s(), ygVar.s());
        if (c10 == 1) {
            ygVar.g(ygVar.A() * 16);
        }
        int A = ygVar.A();
        if (A != ygVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[A];
        ygVar.a(bArr2, 0, A);
        return new a(uuid, c10, bArr2);
    }

    public static UUID c(byte[] bArr) {
        a b3 = b(bArr);
        if (b3 == null) {
            return null;
        }
        return b3.a;
    }

    public static int d(byte[] bArr) {
        a b3 = b(bArr);
        if (b3 == null) {
            return -1;
        }
        return b3.f4753b;
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
        a b3 = b(bArr);
        if (b3 == null) {
            return null;
        }
        if (!uuid.equals(b3.a)) {
            kc.d("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + b3.a + ".");
            return null;
        }
        return b3.f4754c;
    }
}
