package androidx.datastore.preferences.protobuf;

import android.support.v4.media.d;
import androidx.datastore.preferences.protobuf.UnsafeUtil;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Utf8 {

    /* renamed from: a, reason: collision with root package name */
    public static final Processor f19397a;

    /* loaded from: classes2.dex */
    public static class DecodeUtil {
        public static void a(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) {
            if (!e(b3)) {
                if ((((b3 + 112) + (b2 << 28)) >> 30) == 0 && !e(b4) && !e(b5)) {
                    int i3 = ((b2 & 7) << 18) | ((b3 & okio.Utf8.REPLACEMENT_BYTE) << 12) | ((b4 & okio.Utf8.REPLACEMENT_BYTE) << 6) | (b5 & okio.Utf8.REPLACEMENT_BYTE);
                    cArr[i2] = (char) ((i3 >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
                    cArr[i2 + 1] = (char) ((i3 & 1023) + okio.Utf8.LOG_SURROGATE_HEADER);
                    return;
                }
            }
            throw InvalidProtocolBufferException.c();
        }

        public static boolean b(byte b2) {
            return b2 >= 0;
        }

        public static void c(byte b2, byte b3, char[] cArr, int i2) {
            if (b2 < -62 || e(b3)) {
                throw InvalidProtocolBufferException.c();
            }
            cArr[i2] = (char) (((b2 & 31) << 6) | (b3 & okio.Utf8.REPLACEMENT_BYTE));
        }

        public static void d(byte b2, byte b3, byte b4, char[] cArr, int i2) {
            if (e(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || e(b4)))) {
                throw InvalidProtocolBufferException.c();
            }
            cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & okio.Utf8.REPLACEMENT_BYTE) << 6) | (b4 & okio.Utf8.REPLACEMENT_BYTE));
        }

        public static boolean e(byte b2) {
            return b2 > -65;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class Processor {
        public static String b(ByteBuffer byteBuffer, int i2, int i3) {
            if ((i2 | i3 | ((byteBuffer.limit() - i2) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < i4) {
                byte b2 = byteBuffer.get(i2);
                if (!DecodeUtil.b(b2)) {
                    break;
                }
                i2++;
                cArr[i5] = (char) b2;
                i5++;
            }
            int i6 = i5;
            while (i2 < i4) {
                int i7 = i2 + 1;
                byte b3 = byteBuffer.get(i2);
                if (DecodeUtil.b(b3)) {
                    int i8 = i6 + 1;
                    cArr[i6] = (char) b3;
                    while (i7 < i4) {
                        byte b4 = byteBuffer.get(i7);
                        if (!DecodeUtil.b(b4)) {
                            break;
                        }
                        i7++;
                        cArr[i8] = (char) b4;
                        i8++;
                    }
                    i6 = i8;
                    i2 = i7;
                } else if (b3 < -32) {
                    if (i7 >= i4) {
                        throw InvalidProtocolBufferException.c();
                    }
                    i2 += 2;
                    DecodeUtil.c(b3, byteBuffer.get(i7), cArr, i6);
                    i6++;
                } else if (b3 < -16) {
                    if (i7 >= i4 - 1) {
                        throw InvalidProtocolBufferException.c();
                    }
                    int i9 = i2 + 2;
                    i2 += 3;
                    DecodeUtil.d(b3, byteBuffer.get(i7), byteBuffer.get(i9), cArr, i6);
                    i6++;
                } else {
                    if (i7 >= i4 - 2) {
                        throw InvalidProtocolBufferException.c();
                    }
                    byte b5 = byteBuffer.get(i7);
                    int i10 = i2 + 3;
                    byte b6 = byteBuffer.get(i2 + 2);
                    i2 += 4;
                    DecodeUtil.a(b3, b5, b6, byteBuffer.get(i10), cArr, i6);
                    i6 += 2;
                }
            }
            return new String(cArr, 0, i6);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
        
            if (r21.get(r0) > (-65)) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x009e, code lost:
        
            if (r21.get(r0) > (-65)) goto L50;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int h(int r18, int r19, int r20, java.nio.ByteBuffer r21) {
            /*
                Method dump skipped, instructions count: 307
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.Processor.h(int, int, int, java.nio.ByteBuffer):int");
        }

        public abstract String a(int i2, byte[] bArr, int i3);

        public abstract String c(ByteBuffer byteBuffer, int i2, int i3);

        public abstract int d(CharSequence charSequence, byte[] bArr, int i2, int i3);

        public final boolean e(int i2, byte[] bArr, int i3) {
            return g(0, i2, i3, bArr) == 0;
        }

        public final int f(int i2, int i3, int i4, ByteBuffer byteBuffer) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? i(i2, i3, i4, byteBuffer) : h(i2, i3, i4, byteBuffer);
            }
            int arrayOffset = byteBuffer.arrayOffset();
            return g(i2, i3 + arrayOffset, arrayOffset + i4, byteBuffer.array());
        }

        public abstract int g(int i2, int i3, int i4, byte[] bArr);

        public abstract int i(int i2, int i3, int i4, ByteBuffer byteBuffer);
    }

    /* loaded from: classes2.dex */
    public static final class SafeProcessor extends Processor {
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public final String a(int i2, byte[] bArr, int i3) {
            if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < i4) {
                byte b2 = bArr[i2];
                if (!DecodeUtil.b(b2)) {
                    break;
                }
                i2++;
                cArr[i5] = (char) b2;
                i5++;
            }
            int i6 = i5;
            while (i2 < i4) {
                int i7 = i2 + 1;
                byte b3 = bArr[i2];
                if (DecodeUtil.b(b3)) {
                    int i8 = i6 + 1;
                    cArr[i6] = (char) b3;
                    while (i7 < i4) {
                        byte b4 = bArr[i7];
                        if (!DecodeUtil.b(b4)) {
                            break;
                        }
                        i7++;
                        cArr[i8] = (char) b4;
                        i8++;
                    }
                    i6 = i8;
                    i2 = i7;
                } else if (b3 < -32) {
                    if (i7 >= i4) {
                        throw InvalidProtocolBufferException.c();
                    }
                    i2 += 2;
                    DecodeUtil.c(b3, bArr[i7], cArr, i6);
                    i6++;
                } else if (b3 < -16) {
                    if (i7 >= i4 - 1) {
                        throw InvalidProtocolBufferException.c();
                    }
                    int i9 = i2 + 2;
                    i2 += 3;
                    DecodeUtil.d(b3, bArr[i7], bArr[i9], cArr, i6);
                    i6++;
                } else {
                    if (i7 >= i4 - 2) {
                        throw InvalidProtocolBufferException.c();
                    }
                    byte b5 = bArr[i7];
                    int i10 = i2 + 3;
                    byte b6 = bArr[i2 + 2];
                    i2 += 4;
                    DecodeUtil.a(b3, b5, b6, bArr[i10], cArr, i6);
                    i6 += 2;
                }
            }
            return new String(cArr, 0, i6);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public final String c(ByteBuffer byteBuffer, int i2, int i3) {
            return Processor.b(byteBuffer, i2, i3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int d(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 251
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.SafeProcessor.d(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        
            if (r15[r13] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
        
            if (r15[r13] > (-65)) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
        
            if (r15[r13] > (-65)) goto L50;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int g(int r12, int r13, int r14, byte[] r15) {
            /*
                Method dump skipped, instructions count: 244
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.SafeProcessor.g(int, int, int, byte[]):int");
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public final int i(int i2, int i3, int i4, ByteBuffer byteBuffer) {
            return Processor.h(i2, i3, i4, byteBuffer);
        }
    }

    /* loaded from: classes2.dex */
    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i2, int i3) {
            super(d.k("Unpaired surrogate at index ", i2, " of ", i3));
        }
    }

    /* loaded from: classes2.dex */
    public static final class UnsafeProcessor extends Processor {
        public static int j(int i2, int i3, long j2) {
            if (i3 == 0) {
                Processor processor = Utf8.f19397a;
                if (i2 > -12) {
                    return -1;
                }
                return i2;
            }
            if (i3 == 1) {
                return Utf8.e(i2, UnsafeUtil.d.f(j2));
            }
            if (i3 != 2) {
                throw new AssertionError();
            }
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.d;
            return Utf8.f(i2, memoryAccessor.f(j2), memoryAccessor.f(j2 + 1));
        }

        public static int k(long j2, byte[] bArr, int i2, int i3) {
            if (i3 == 0) {
                Processor processor = Utf8.f19397a;
                if (i2 > -12) {
                    return -1;
                }
                return i2;
            }
            if (i3 == 1) {
                return Utf8.e(i2, UnsafeUtil.f(bArr, j2));
            }
            if (i3 == 2) {
                return Utf8.f(i2, UnsafeUtil.f(bArr, j2), UnsafeUtil.f(bArr, j2 + 1));
            }
            throw new AssertionError();
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public final String a(int i2, byte[] bArr, int i3) {
            if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < i4) {
                byte f2 = UnsafeUtil.f(bArr, i2);
                if (!DecodeUtil.b(f2)) {
                    break;
                }
                i2++;
                cArr[i5] = (char) f2;
                i5++;
            }
            int i6 = i5;
            while (i2 < i4) {
                int i7 = i2 + 1;
                byte f3 = UnsafeUtil.f(bArr, i2);
                if (DecodeUtil.b(f3)) {
                    int i8 = i6 + 1;
                    cArr[i6] = (char) f3;
                    while (i7 < i4) {
                        byte f4 = UnsafeUtil.f(bArr, i7);
                        if (!DecodeUtil.b(f4)) {
                            break;
                        }
                        i7++;
                        cArr[i8] = (char) f4;
                        i8++;
                    }
                    i6 = i8;
                    i2 = i7;
                } else if (f3 < -32) {
                    if (i7 >= i4) {
                        throw InvalidProtocolBufferException.c();
                    }
                    i2 += 2;
                    DecodeUtil.c(f3, UnsafeUtil.f(bArr, i7), cArr, i6);
                    i6++;
                } else if (f3 < -16) {
                    if (i7 >= i4 - 1) {
                        throw InvalidProtocolBufferException.c();
                    }
                    int i9 = i2 + 2;
                    i2 += 3;
                    DecodeUtil.d(f3, UnsafeUtil.f(bArr, i7), UnsafeUtil.f(bArr, i9), cArr, i6);
                    i6++;
                } else {
                    if (i7 >= i4 - 2) {
                        throw InvalidProtocolBufferException.c();
                    }
                    byte f5 = UnsafeUtil.f(bArr, i7);
                    int i10 = i2 + 3;
                    byte f6 = UnsafeUtil.f(bArr, i2 + 2);
                    i2 += 4;
                    DecodeUtil.a(f3, f5, f6, UnsafeUtil.f(bArr, i10), cArr, i6);
                    i6 += 2;
                }
            }
            return new String(cArr, 0, i6);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public final String c(ByteBuffer byteBuffer, int i2, int i3) {
            long j2;
            if ((i2 | i3 | ((byteBuffer.limit() - i2) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            long l2 = UnsafeUtil.d.l(UnsafeUtil.f19394h, byteBuffer) + i2;
            long j3 = i3 + l2;
            char[] cArr = new char[i3];
            int i4 = 0;
            while (true) {
                j2 = 1;
                if (l2 >= j3) {
                    break;
                }
                byte f2 = UnsafeUtil.d.f(l2);
                if (!DecodeUtil.b(f2)) {
                    break;
                }
                l2++;
                cArr[i4] = (char) f2;
                i4++;
            }
            int i5 = i4;
            while (l2 < j3) {
                long j4 = l2 + j2;
                UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.d;
                byte f3 = memoryAccessor.f(l2);
                if (DecodeUtil.b(f3)) {
                    int i6 = i5 + 1;
                    cArr[i5] = (char) f3;
                    while (j4 < j3) {
                        byte f4 = UnsafeUtil.d.f(j4);
                        if (!DecodeUtil.b(f4)) {
                            break;
                        }
                        j4 += j2;
                        cArr[i6] = (char) f4;
                        i6++;
                    }
                    i5 = i6;
                    l2 = j4;
                } else {
                    if (!(f3 < -32)) {
                        if (f3 < -16) {
                            if (j4 >= j3 - j2) {
                                throw InvalidProtocolBufferException.c();
                            }
                            long j5 = l2 + 2;
                            l2 += 3;
                            DecodeUtil.d(f3, memoryAccessor.f(j4), memoryAccessor.f(j5), cArr, i5);
                            i5++;
                        } else {
                            if (j4 >= j3 - 2) {
                                throw InvalidProtocolBufferException.c();
                            }
                            byte f5 = memoryAccessor.f(j4);
                            long j6 = l2 + 3;
                            byte f6 = memoryAccessor.f(l2 + 2);
                            l2 += 4;
                            DecodeUtil.a(f3, f5, f6, memoryAccessor.f(j6), cArr, i5);
                            i5 += 2;
                        }
                    } else {
                        if (j4 >= j3) {
                            throw InvalidProtocolBufferException.c();
                        }
                        l2 += 2;
                        DecodeUtil.c(f3, memoryAccessor.f(j4), cArr, i5);
                        i5++;
                    }
                }
                j2 = 1;
            }
            return new String(cArr, 0, i5);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public final int d(CharSequence charSequence, byte[] bArr, int i2, int i3) {
            long j2;
            String str;
            String str2;
            int i4;
            long j3;
            long j4;
            char charAt;
            long j5 = i2;
            long j6 = i3 + j5;
            int length = charSequence.length();
            String str3 = " at index ";
            String str4 = "Failed writing ";
            if (length > i3 || bArr.length - i3 < i2) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i2 + i3));
            }
            int i5 = 0;
            while (true) {
                j2 = 1;
                if (i5 >= length || (charAt = charSequence.charAt(i5)) >= 128) {
                    break;
                }
                UnsafeUtil.o(bArr, j5, (byte) charAt);
                i5++;
                j5 = 1 + j5;
            }
            if (i5 == length) {
                return (int) j5;
            }
            while (i5 < length) {
                char charAt2 = charSequence.charAt(i5);
                if (charAt2 >= 128 || j5 >= j6) {
                    if (charAt2 >= 2048 || j5 > j6 - 2) {
                        str = str3;
                        str2 = str4;
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || j5 > j6 - 3) {
                            if (j5 > j6 - 4) {
                                if (55296 <= charAt2 && charAt2 <= 57343 && ((i4 = i5 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i4)))) {
                                    throw new UnpairedSurrogateException(i5, length);
                                }
                                throw new ArrayIndexOutOfBoundsException(str2 + charAt2 + str + j5);
                            }
                            int i6 = i5 + 1;
                            if (i6 != length) {
                                char charAt3 = charSequence.charAt(i6);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    j3 = 1;
                                    UnsafeUtil.o(bArr, j5, (byte) ((codePoint >>> 18) | 240));
                                    j4 = j6;
                                    UnsafeUtil.o(bArr, j5 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j7 = j5 + 3;
                                    UnsafeUtil.o(bArr, j5 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j5 += 4;
                                    UnsafeUtil.o(bArr, j7, (byte) ((codePoint & 63) | 128));
                                    i5 = i6;
                                } else {
                                    i5 = i6;
                                }
                            }
                            throw new UnpairedSurrogateException(i5 - 1, length);
                        }
                        UnsafeUtil.o(bArr, j5, (byte) ((charAt2 >>> '\f') | 480));
                        long j8 = j5 + 2;
                        UnsafeUtil.o(bArr, j5 + 1, (byte) (((charAt2 >>> 6) & 63) | 128));
                        j5 += 3;
                        UnsafeUtil.o(bArr, j8, (byte) ((charAt2 & '?') | 128));
                    } else {
                        str = str3;
                        str2 = str4;
                        long j9 = j5 + j2;
                        UnsafeUtil.o(bArr, j5, (byte) ((charAt2 >>> 6) | 960));
                        j5 += 2;
                        UnsafeUtil.o(bArr, j9, (byte) ((charAt2 & '?') | 128));
                    }
                    j4 = j6;
                    j3 = 1;
                } else {
                    UnsafeUtil.o(bArr, j5, (byte) charAt2);
                    j4 = j6;
                    str2 = str4;
                    j3 = j2;
                    j5 += j2;
                    str = str3;
                }
                i5++;
                str3 = str;
                str4 = str2;
                j2 = j3;
                j6 = j4;
            }
            return (int) j5;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.f(r25, r4) > (-65)) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.f(r25, r4) > (-65)) goto L32;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int g(int r22, int r23, int r24, byte[] r25) {
            /*
                Method dump skipped, instructions count: 382
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.g(int, int, int, byte[]):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
        
            if (r2.f(r3) > (-65)) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
        
            if (r2.f(r3) > (-65)) goto L32;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int i(int r23, int r24, int r25, java.nio.ByteBuffer r26) {
            /*
                Method dump skipped, instructions count: 444
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.i(int, int, int, java.nio.ByteBuffer):int");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.preferences.protobuf.Utf8$Processor] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    static {
        f19397a = (UnsafeUtil.f19392f && UnsafeUtil.e && !Android.a()) ? new Object() : new Object();
    }

    public static int a(int i2, byte[] bArr, int i3) {
        byte b2 = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 == 0) {
            if (b2 > -12) {
                b2 = -1;
            }
            return b2;
        }
        if (i4 == 1) {
            return e(b2, bArr[i2]);
        }
        if (i4 == 2) {
            return f(b2, bArr[i2], bArr[i2 + 1]);
        }
        throw new AssertionError();
    }

    public static int b(int i2, int i3, int i4, ByteBuffer byteBuffer) {
        if (i4 == 0) {
            if (i2 > -12) {
                return -1;
            }
            return i2;
        }
        if (i4 == 1) {
            return e(i2, byteBuffer.get(i3));
        }
        if (i4 == 2) {
            return f(i2, byteBuffer.get(i3), byteBuffer.get(i3 + 1));
        }
        throw new AssertionError();
    }

    public static String c(ByteBuffer byteBuffer, int i2, int i3) {
        Processor processor = f19397a;
        processor.getClass();
        if (byteBuffer.hasArray()) {
            return processor.a(byteBuffer.arrayOffset() + i2, byteBuffer.array(), i3);
        }
        return byteBuffer.isDirect() ? processor.c(byteBuffer, i2, i3) : Processor.b(byteBuffer, i2, i3);
    }

    public static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt2 = charSequence.charAt(i3);
                    if (charAt2 < 2048) {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i3) < 65536) {
                                throw new UnpairedSurrogateException(i3, length2);
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i4 += i2;
            }
        }
        if (i4 >= length) {
            return i4;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i4 + 4294967296L));
    }

    public static int e(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    public static int f(int i2, int i3, int i4) {
        if (i2 > -12 || i3 > -65 || i4 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i4 << 16);
    }
}
