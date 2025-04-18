package com.applovin.impl;

import java.nio.ByteBuffer;
import java.util.UUID;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes.dex */
public abstract class ji {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final UUID f24693a;

        /* renamed from: b, reason: collision with root package name */
        private final int f24694b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f24695c;

        public a(UUID uuid, int i2, byte[] bArr) {
            this.f24693a = uuid;
            this.f24694b = i2;
            this.f24695c = bArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return a(uuid, null, bArr);
    }

    private static a b(byte[] bArr) {
        bh bhVar = new bh(bArr);
        if (bhVar.e() < 32) {
            return null;
        }
        bhVar.f(0);
        if (bhVar.j() != bhVar.a() + 4 || bhVar.j() != 1886614376) {
            return null;
        }
        int c2 = j1.c(bhVar.j());
        if (c2 > 1) {
            com.applovin.impl.adview.t.u("Unsupported pssh version: ", c2, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(bhVar.s(), bhVar.s());
        if (c2 == 1) {
            bhVar.g(bhVar.A() * 16);
        }
        int A = bhVar.A();
        if (A != bhVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[A];
        bhVar.a(bArr2, 0, A);
        return new a(uuid, c2, bArr2);
    }

    public static UUID c(byte[] bArr) {
        a b2 = b(bArr);
        if (b2 == null) {
            return null;
        }
        return b2.f24693a;
    }

    public static int d(byte[] bArr) {
        a b2 = b(bArr);
        if (b2 == null) {
            return -1;
        }
        return b2.f24694b;
    }

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length = androidx.compose.foundation.text.input.a.a(uuidArr.length, 16, 4, length);
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE : 0);
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
        a b2 = b(bArr);
        if (b2 == null) {
            return null;
        }
        if (!uuid.equals(b2.f24693a)) {
            pc.d("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + b2.f24693a + ".");
            return null;
        }
        return b2.f24695c;
    }
}
