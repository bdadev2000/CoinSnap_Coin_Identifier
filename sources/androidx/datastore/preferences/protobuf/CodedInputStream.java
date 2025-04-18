package androidx.datastore.preferences.protobuf;

import android.support.v4.media.d;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.UnsafeUtil;
import com.google.android.gms.common.api.Api;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class CodedInputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f19133a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19134b = 100;

    /* renamed from: c, reason: collision with root package name */
    public final int f19135c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public CodedInputStreamReader d;

    /* loaded from: classes.dex */
    public static final class ArrayDecoder extends CodedInputStream {
        public final byte[] e;

        /* renamed from: f, reason: collision with root package name */
        public int f19136f;

        /* renamed from: g, reason: collision with root package name */
        public int f19137g;

        /* renamed from: h, reason: collision with root package name */
        public int f19138h;

        /* renamed from: i, reason: collision with root package name */
        public final int f19139i;

        /* renamed from: j, reason: collision with root package name */
        public int f19140j;

        /* renamed from: k, reason: collision with root package name */
        public int f19141k = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        public ArrayDecoder(byte[] bArr, int i2, int i3, boolean z2) {
            this.e = bArr;
            this.f19136f = i3 + i2;
            this.f19138h = i2;
            this.f19139i = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long A() {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean B(int i2) {
            int y2;
            int i3 = i2 & 7;
            int i4 = 0;
            if (i3 == 0) {
                int i5 = this.f19136f - this.f19138h;
                byte[] bArr = this.e;
                if (i5 >= 10) {
                    while (i4 < 10) {
                        int i6 = this.f19138h;
                        this.f19138h = i6 + 1;
                        if (bArr[i6] < 0) {
                            i4++;
                        }
                    }
                    throw InvalidProtocolBufferException.e();
                }
                while (i4 < 10) {
                    int i7 = this.f19138h;
                    if (i7 == this.f19136f) {
                        throw InvalidProtocolBufferException.h();
                    }
                    this.f19138h = i7 + 1;
                    if (bArr[i7] < 0) {
                        i4++;
                    }
                }
                throw InvalidProtocolBufferException.e();
                return true;
            }
            if (i3 == 1) {
                I(8);
                return true;
            }
            if (i3 == 2) {
                I(E());
                return true;
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    return false;
                }
                if (i3 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                I(4);
                return true;
            }
            do {
                y2 = y();
                if (y2 == 0) {
                    break;
                }
            } while (B(y2));
            a(((i2 >>> 3) << 3) | 4);
            return true;
        }

        public final int C() {
            int i2 = this.f19138h;
            if (this.f19136f - i2 < 4) {
                throw InvalidProtocolBufferException.h();
            }
            this.f19138h = i2 + 4;
            byte[] bArr = this.e;
            return ((bArr[i2 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i2] & UnsignedBytes.MAX_VALUE) | ((bArr[i2 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i2 + 2] & UnsignedBytes.MAX_VALUE) << 16);
        }

        public final long D() {
            int i2 = this.f19138h;
            if (this.f19136f - i2 < 8) {
                throw InvalidProtocolBufferException.h();
            }
            this.f19138h = i2 + 8;
            byte[] bArr = this.e;
            return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
        }

        public final int E() {
            int i2;
            int i3 = this.f19138h;
            int i4 = this.f19136f;
            if (i4 != i3) {
                int i5 = i3 + 1;
                byte[] bArr = this.e;
                byte b2 = bArr[i3];
                if (b2 >= 0) {
                    this.f19138h = i5;
                    return b2;
                }
                if (i4 - i5 >= 9) {
                    int i6 = i3 + 2;
                    int i7 = (bArr[i5] << 7) ^ b2;
                    if (i7 < 0) {
                        i2 = i7 ^ (-128);
                    } else {
                        int i8 = i3 + 3;
                        int i9 = (bArr[i6] << 14) ^ i7;
                        if (i9 >= 0) {
                            i2 = i9 ^ 16256;
                        } else {
                            int i10 = i3 + 4;
                            int i11 = i9 ^ (bArr[i8] << 21);
                            if (i11 < 0) {
                                i2 = (-2080896) ^ i11;
                            } else {
                                i8 = i3 + 5;
                                byte b3 = bArr[i10];
                                int i12 = (i11 ^ (b3 << 28)) ^ 266354560;
                                if (b3 < 0) {
                                    i10 = i3 + 6;
                                    if (bArr[i8] < 0) {
                                        i8 = i3 + 7;
                                        if (bArr[i10] < 0) {
                                            i10 = i3 + 8;
                                            if (bArr[i8] < 0) {
                                                i8 = i3 + 9;
                                                if (bArr[i10] < 0) {
                                                    int i13 = i3 + 10;
                                                    if (bArr[i8] >= 0) {
                                                        i6 = i13;
                                                        i2 = i12;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i2 = i12;
                                }
                                i2 = i12;
                            }
                            i6 = i10;
                        }
                        i6 = i8;
                    }
                    this.f19138h = i6;
                    return i2;
                }
            }
            return (int) G();
        }

        public final long F() {
            long j2;
            long j3;
            long j4;
            long j5;
            int i2 = this.f19138h;
            int i3 = this.f19136f;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.e;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f19138h = i4;
                    return b2;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b2;
                    if (i6 < 0) {
                        j2 = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            j2 = i8 ^ 16256;
                            i5 = i7;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                j5 = (-2080896) ^ i10;
                            } else {
                                long j6 = i10;
                                i5 = i2 + 5;
                                long j7 = j6 ^ (bArr[i9] << 28);
                                if (j7 >= 0) {
                                    j4 = 266354560;
                                } else {
                                    i9 = i2 + 6;
                                    long j8 = j7 ^ (bArr[i5] << 35);
                                    if (j8 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        i5 = i2 + 7;
                                        j7 = j8 ^ (bArr[i9] << 42);
                                        if (j7 >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            i9 = i2 + 8;
                                            j8 = j7 ^ (bArr[i5] << 49);
                                            if (j8 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                i5 = i2 + 9;
                                                long j9 = (j8 ^ (bArr[i9] << 56)) ^ 71499008037633920L;
                                                if (j9 < 0) {
                                                    int i11 = i2 + 10;
                                                    if (bArr[i5] >= 0) {
                                                        i5 = i11;
                                                    }
                                                }
                                                j2 = j9;
                                            }
                                        }
                                    }
                                    j5 = j3 ^ j8;
                                }
                                j2 = j4 ^ j7;
                            }
                            i5 = i9;
                            j2 = j5;
                        }
                    }
                    this.f19138h = i5;
                    return j2;
                }
            }
            return G();
        }

        public final long G() {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                int i3 = this.f19138h;
                if (i3 == this.f19136f) {
                    throw InvalidProtocolBufferException.h();
                }
                this.f19138h = i3 + 1;
                j2 |= (r3 & Byte.MAX_VALUE) << i2;
                if ((this.e[i3] & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void H() {
            int i2 = this.f19136f + this.f19137g;
            this.f19136f = i2;
            int i3 = i2 - this.f19139i;
            int i4 = this.f19141k;
            if (i3 <= i4) {
                this.f19137g = 0;
                return;
            }
            int i5 = i3 - i4;
            this.f19137g = i5;
            this.f19136f = i2 - i5;
        }

        public final void I(int i2) {
            if (i2 >= 0) {
                int i3 = this.f19136f;
                int i4 = this.f19138h;
                if (i2 <= i3 - i4) {
                    this.f19138h = i4 + i2;
                    return;
                }
            }
            if (i2 >= 0) {
                throw InvalidProtocolBufferException.h();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void a(int i2) {
            if (this.f19140j != i2) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int d() {
            return this.f19138h - this.f19139i;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean e() {
            return this.f19138h == this.f19136f;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void h(int i2) {
            this.f19141k = i2;
            H();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int i(int i2) {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int d = i2 + d();
            int i3 = this.f19141k;
            if (d > i3) {
                throw InvalidProtocolBufferException.h();
            }
            this.f19141k = d;
            H();
            return i3;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean j() {
            return F() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final ByteString k() {
            byte[] bArr;
            int E = E();
            byte[] bArr2 = this.e;
            if (E > 0) {
                int i2 = this.f19136f;
                int i3 = this.f19138h;
                if (E <= i2 - i3) {
                    ByteString e = ByteString.e(i3, bArr2, E);
                    this.f19138h += E;
                    return e;
                }
            }
            if (E == 0) {
                return ByteString.f19122b;
            }
            if (E > 0) {
                int i4 = this.f19136f;
                int i5 = this.f19138h;
                if (E <= i4 - i5) {
                    int i6 = E + i5;
                    this.f19138h = i6;
                    bArr = Arrays.copyOfRange(bArr2, i5, i6);
                    ByteString byteString = ByteString.f19122b;
                    return new ByteString.LiteralByteString(bArr);
                }
            }
            if (E > 0) {
                throw InvalidProtocolBufferException.h();
            }
            if (E != 0) {
                throw InvalidProtocolBufferException.f();
            }
            bArr = Internal.f19252b;
            ByteString byteString2 = ByteString.f19122b;
            return new ByteString.LiteralByteString(bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final double l() {
            return Double.longBitsToDouble(D());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int m() {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int n() {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long o() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final float p() {
            return Float.intBitsToFloat(C());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int q() {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long r() {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int s() {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long t() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int u() {
            return CodedInputStream.b(E());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long v() {
            return CodedInputStream.c(F());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final String w() {
            int E = E();
            if (E > 0) {
                int i2 = this.f19136f;
                int i3 = this.f19138h;
                if (E <= i2 - i3) {
                    String str = new String(this.e, i3, E, Internal.f19251a);
                    this.f19138h += E;
                    return str;
                }
            }
            if (E == 0) {
                return "";
            }
            if (E < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final String x() {
            int E = E();
            if (E > 0) {
                int i2 = this.f19136f;
                int i3 = this.f19138h;
                if (E <= i2 - i3) {
                    String a2 = Utf8.f19397a.a(i3, this.e, E);
                    this.f19138h += E;
                    return a2;
                }
            }
            if (E == 0) {
                return "";
            }
            if (E <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int y() {
            if (e()) {
                this.f19140j = 0;
                return 0;
            }
            int E = E();
            this.f19140j = E;
            if ((E >>> 3) != 0) {
                return E;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int z() {
            return E();
        }
    }

    /* loaded from: classes.dex */
    public static final class IterableDirectByteBufferDecoder extends CodedInputStream {
        public int e;

        /* renamed from: f, reason: collision with root package name */
        public int f19142f;

        /* renamed from: g, reason: collision with root package name */
        public int f19143g;

        /* renamed from: h, reason: collision with root package name */
        public int f19144h;

        /* renamed from: i, reason: collision with root package name */
        public long f19145i;

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long A() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean B(int i2) {
            int y2;
            int i3 = i2 & 7;
            if (i3 == 0) {
                for (int i4 = 0; i4 < 10; i4++) {
                    if (D() >= 0) {
                        return true;
                    }
                }
                throw InvalidProtocolBufferException.e();
            }
            if (i3 == 1) {
                K(8);
                return true;
            }
            if (i3 == 2) {
                K(H());
                return true;
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    return false;
                }
                if (i3 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                K(4);
                return true;
            }
            do {
                y2 = y();
                if (y2 == 0) {
                    break;
                }
            } while (B(y2));
            a(((i2 >>> 3) << 3) | 4);
            return true;
        }

        public final long C() {
            return 0 - this.f19145i;
        }

        public final byte D() {
            if (C() == 0) {
                throw null;
            }
            long j2 = this.f19145i;
            this.f19145i = 1 + j2;
            return UnsafeUtil.d.f(j2);
        }

        public final void E(byte[] bArr, int i2) {
            if (i2 < 0 || i2 > ((int) (this.e - this.f19145i))) {
                if (i2 > 0) {
                    throw InvalidProtocolBufferException.h();
                }
                if (i2 != 0) {
                    throw InvalidProtocolBufferException.f();
                }
                return;
            }
            int i3 = i2;
            while (i3 > 0) {
                if (C() == 0) {
                    throw null;
                }
                int min = Math.min(i3, (int) C());
                long j2 = min;
                UnsafeUtil.d.c(this.f19145i, bArr, i2 - i3, j2);
                i3 -= min;
                this.f19145i += j2;
            }
        }

        public final int F() {
            if (C() < 4) {
                return (D() & UnsignedBytes.MAX_VALUE) | ((D() & UnsignedBytes.MAX_VALUE) << 8) | ((D() & UnsignedBytes.MAX_VALUE) << 16) | ((D() & UnsignedBytes.MAX_VALUE) << 24);
            }
            long j2 = this.f19145i;
            this.f19145i = 4 + j2;
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.d;
            return ((memoryAccessor.f(j2 + 3) & UnsignedBytes.MAX_VALUE) << 24) | (memoryAccessor.f(j2) & UnsignedBytes.MAX_VALUE) | ((memoryAccessor.f(1 + j2) & UnsignedBytes.MAX_VALUE) << 8) | ((memoryAccessor.f(2 + j2) & UnsignedBytes.MAX_VALUE) << 16);
        }

        public final long G() {
            long D;
            byte D2;
            if (C() >= 8) {
                long j2 = this.f19145i;
                this.f19145i = 8 + j2;
                D = (r1.f(j2) & 255) | ((r1.f(j2 + 1) & 255) << 8) | ((r1.f(2 + j2) & 255) << 16) | ((r1.f(3 + j2) & 255) << 24) | ((r1.f(4 + j2) & 255) << 32) | ((r1.f(5 + j2) & 255) << 40) | ((r1.f(6 + j2) & 255) << 48);
                D2 = UnsafeUtil.d.f(j2 + 7);
            } else {
                D = (D() & 255) | ((D() & 255) << 8) | ((D() & 255) << 16) | ((D() & 255) << 24) | ((D() & 255) << 32) | ((D() & 255) << 40) | ((D() & 255) << 48);
                D2 = D();
            }
            return ((D2 & 255) << 56) | D;
        }

        public final int H() {
            int i2;
            long j2 = this.f19145i;
            if (0 != j2) {
                long j3 = j2 + 1;
                UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.d;
                byte f2 = memoryAccessor.f(j2);
                if (f2 >= 0) {
                    this.f19145i++;
                    return f2;
                }
                if (0 - this.f19145i >= 10) {
                    long j4 = 2 + j2;
                    int f3 = (memoryAccessor.f(j3) << 7) ^ f2;
                    if (f3 < 0) {
                        i2 = f3 ^ (-128);
                    } else {
                        long j5 = 3 + j2;
                        int f4 = (memoryAccessor.f(j4) << 14) ^ f3;
                        if (f4 >= 0) {
                            i2 = f4 ^ 16256;
                        } else {
                            long j6 = 4 + j2;
                            int f5 = f4 ^ (memoryAccessor.f(j5) << 21);
                            if (f5 < 0) {
                                i2 = (-2080896) ^ f5;
                            } else {
                                j5 = 5 + j2;
                                byte f6 = memoryAccessor.f(j6);
                                int i3 = (f5 ^ (f6 << 28)) ^ 266354560;
                                if (f6 < 0) {
                                    j6 = 6 + j2;
                                    if (memoryAccessor.f(j5) < 0) {
                                        j5 = 7 + j2;
                                        if (memoryAccessor.f(j6) < 0) {
                                            j6 = 8 + j2;
                                            if (memoryAccessor.f(j5) < 0) {
                                                j5 = 9 + j2;
                                                if (memoryAccessor.f(j6) < 0) {
                                                    long j7 = j2 + 10;
                                                    if (memoryAccessor.f(j5) >= 0) {
                                                        i2 = i3;
                                                        j4 = j7;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i2 = i3;
                                }
                                i2 = i3;
                            }
                            j4 = j6;
                        }
                        j4 = j5;
                    }
                    this.f19145i = j4;
                    return i2;
                }
            }
            return (int) J();
        }

        public final long I() {
            long j2;
            long j3;
            long j4 = this.f19145i;
            if (0 != j4) {
                long j5 = j4 + 1;
                UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.d;
                byte f2 = memoryAccessor.f(j4);
                if (f2 >= 0) {
                    this.f19145i++;
                    return f2;
                }
                if (0 - this.f19145i >= 10) {
                    long j6 = 2 + j4;
                    int f3 = (memoryAccessor.f(j5) << 7) ^ f2;
                    if (f3 < 0) {
                        j2 = f3 ^ (-128);
                    } else {
                        long j7 = 3 + j4;
                        int f4 = (memoryAccessor.f(j6) << 14) ^ f3;
                        if (f4 >= 0) {
                            j2 = f4 ^ 16256;
                            j6 = j7;
                        } else {
                            long j8 = 4 + j4;
                            int f5 = f4 ^ (memoryAccessor.f(j7) << 21);
                            if (f5 < 0) {
                                j2 = (-2080896) ^ f5;
                                j6 = j8;
                            } else {
                                long j9 = j4 + 5;
                                long f6 = (memoryAccessor.f(j8) << 28) ^ f5;
                                if (f6 >= 0) {
                                    j2 = 266354560 ^ f6;
                                    j6 = j9;
                                } else {
                                    long j10 = 6 + j4;
                                    long f7 = f6 ^ (memoryAccessor.f(j9) << 35);
                                    if (f7 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        long j11 = 7 + j4;
                                        long f8 = f7 ^ (memoryAccessor.f(j10) << 42);
                                        if (f8 >= 0) {
                                            j2 = 4363953127296L ^ f8;
                                        } else {
                                            j10 = 8 + j4;
                                            f7 = f8 ^ (memoryAccessor.f(j11) << 49);
                                            if (f7 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                j11 = 9 + j4;
                                                long f9 = (f7 ^ (memoryAccessor.f(j10) << 56)) ^ 71499008037633920L;
                                                if (f9 < 0) {
                                                    long j12 = j4 + 10;
                                                    if (memoryAccessor.f(j11) >= 0) {
                                                        j2 = f9;
                                                        j6 = j12;
                                                    }
                                                } else {
                                                    j2 = f9;
                                                }
                                            }
                                        }
                                        j6 = j11;
                                    }
                                    j2 = j3 ^ f7;
                                    j6 = j10;
                                }
                            }
                        }
                    }
                    this.f19145i = j6;
                    return j2;
                }
            }
            return J();
        }

        public final long J() {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                j2 |= (r3 & Byte.MAX_VALUE) << i2;
                if ((D() & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void K(int i2) {
            if (i2 < 0 || i2 > this.e - this.f19145i) {
                if (i2 >= 0) {
                    throw InvalidProtocolBufferException.h();
                }
                throw InvalidProtocolBufferException.f();
            }
            while (i2 > 0) {
                if (C() == 0) {
                    throw null;
                }
                int min = Math.min(i2, (int) C());
                i2 -= min;
                this.f19145i += min;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void a(int i2) {
            if (this.f19144h != i2) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int d() {
            return (int) (0 + this.f19145i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean e() {
            return ((long) 0) + this.f19145i == ((long) this.e);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void h(int i2) {
            this.f19143g = i2;
            int i3 = this.e + this.f19142f;
            this.e = i3;
            if (i3 <= i2) {
                this.f19142f = 0;
                return;
            }
            int i4 = i3 - i2;
            this.f19142f = i4;
            this.e = i3 - i4;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int i(int i2) {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int d = i2 + d();
            int i3 = this.f19143g;
            if (d > i3) {
                throw InvalidProtocolBufferException.h();
            }
            this.f19143g = d;
            int i4 = this.e + this.f19142f;
            this.e = i4;
            if (i4 > d) {
                int i5 = i4 - d;
                this.f19142f = i5;
                this.e = i4 - i5;
            } else {
                this.f19142f = 0;
            }
            return i3;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean j() {
            return I() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final ByteString k() {
            int H = H();
            if (H > 0) {
                long j2 = H;
                long j3 = this.f19145i;
                if (j2 <= 0 - j3) {
                    byte[] bArr = new byte[H];
                    UnsafeUtil.d.c(j3, bArr, 0L, j2);
                    this.f19145i += j2;
                    ByteString byteString = ByteString.f19122b;
                    return new ByteString.LiteralByteString(bArr);
                }
            }
            if (H > 0 && H <= ((int) (this.e - this.f19145i))) {
                byte[] bArr2 = new byte[H];
                E(bArr2, H);
                ByteString byteString2 = ByteString.f19122b;
                return new ByteString.LiteralByteString(bArr2);
            }
            if (H == 0) {
                return ByteString.f19122b;
            }
            if (H < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final double l() {
            return Double.longBitsToDouble(G());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int m() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int n() {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long o() {
            return G();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final float p() {
            return Float.intBitsToFloat(F());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int q() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long r() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int s() {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long t() {
            return G();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int u() {
            return CodedInputStream.b(H());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long v() {
            return CodedInputStream.c(I());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final String w() {
            int H = H();
            if (H > 0) {
                long j2 = H;
                long j3 = this.f19145i;
                if (j2 <= 0 - j3) {
                    byte[] bArr = new byte[H];
                    UnsafeUtil.d.c(j3, bArr, 0L, j2);
                    String str = new String(bArr, Internal.f19251a);
                    this.f19145i += j2;
                    return str;
                }
            }
            if (H > 0 && H <= ((int) (this.e - this.f19145i))) {
                byte[] bArr2 = new byte[H];
                E(bArr2, H);
                return new String(bArr2, Internal.f19251a);
            }
            if (H == 0) {
                return "";
            }
            if (H < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final String x() {
            int H = H();
            if (H > 0) {
                long j2 = H;
                long j3 = this.f19145i;
                if (j2 <= 0 - j3) {
                    String c2 = Utf8.c(null, (int) j3, H);
                    this.f19145i += j2;
                    return c2;
                }
            }
            if (H >= 0 && H <= ((int) (this.e - this.f19145i))) {
                byte[] bArr = new byte[H];
                E(bArr, H);
                return Utf8.f19397a.a(0, bArr, H);
            }
            if (H == 0) {
                return "";
            }
            if (H <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int y() {
            if (e()) {
                this.f19144h = 0;
                return 0;
            }
            int H = H();
            this.f19144h = H;
            if ((H >>> 3) != 0) {
                return H;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int z() {
            return H();
        }
    }

    /* loaded from: classes.dex */
    public static final class StreamDecoder extends CodedInputStream {
        public final InputStream e;

        /* renamed from: f, reason: collision with root package name */
        public final byte[] f19146f;

        /* renamed from: g, reason: collision with root package name */
        public int f19147g;

        /* renamed from: h, reason: collision with root package name */
        public int f19148h;

        /* renamed from: i, reason: collision with root package name */
        public int f19149i;

        /* renamed from: j, reason: collision with root package name */
        public int f19150j;

        /* renamed from: k, reason: collision with root package name */
        public int f19151k;

        /* renamed from: l, reason: collision with root package name */
        public int f19152l = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* loaded from: classes.dex */
        public interface RefillCallback {
        }

        /* loaded from: classes.dex */
        public class SkippedDataSink implements RefillCallback {
        }

        public StreamDecoder(InputStream inputStream) {
            Charset charset = Internal.f19251a;
            this.e = inputStream;
            this.f19146f = new byte[4096];
            this.f19147g = 0;
            this.f19149i = 0;
            this.f19151k = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long A() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean B(int i2) {
            int y2;
            int i3 = i2 & 7;
            int i4 = 0;
            if (i3 == 0) {
                int i5 = this.f19147g - this.f19149i;
                byte[] bArr = this.f19146f;
                if (i5 >= 10) {
                    while (i4 < 10) {
                        int i6 = this.f19149i;
                        this.f19149i = i6 + 1;
                        if (bArr[i6] < 0) {
                            i4++;
                        }
                    }
                    throw InvalidProtocolBufferException.e();
                }
                while (i4 < 10) {
                    if (this.f19149i == this.f19147g) {
                        L(1);
                    }
                    int i7 = this.f19149i;
                    this.f19149i = i7 + 1;
                    if (bArr[i7] < 0) {
                        i4++;
                    }
                }
                throw InvalidProtocolBufferException.e();
                return true;
            }
            if (i3 == 1) {
                M(8);
                return true;
            }
            if (i3 == 2) {
                M(H());
                return true;
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    return false;
                }
                if (i3 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                M(4);
                return true;
            }
            do {
                y2 = y();
                if (y2 == 0) {
                    break;
                }
            } while (B(y2));
            a(((i2 >>> 3) << 3) | 4);
            return true;
        }

        public final byte[] C(int i2) {
            byte[] D = D(i2);
            if (D != null) {
                return D;
            }
            int i3 = this.f19149i;
            int i4 = this.f19147g;
            int i5 = i4 - i3;
            this.f19151k += i4;
            this.f19149i = 0;
            this.f19147g = 0;
            ArrayList E = E(i2 - i5);
            byte[] bArr = new byte[i2];
            System.arraycopy(this.f19146f, i3, bArr, 0, i5);
            Iterator it = E.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                i5 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] D(int i2) {
            if (i2 == 0) {
                return Internal.f19252b;
            }
            if (i2 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i3 = this.f19151k;
            int i4 = this.f19149i;
            int i5 = i3 + i4 + i2;
            if (i5 - this.f19135c > 0) {
                throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i6 = this.f19152l;
            if (i5 > i6) {
                M((i6 - i3) - i4);
                throw InvalidProtocolBufferException.h();
            }
            int i7 = this.f19147g - i4;
            int i8 = i2 - i7;
            InputStream inputStream = this.e;
            if (i8 >= 4096 && i8 > inputStream.available()) {
                return null;
            }
            byte[] bArr = new byte[i2];
            System.arraycopy(this.f19146f, this.f19149i, bArr, 0, i7);
            this.f19151k += this.f19147g;
            this.f19149i = 0;
            this.f19147g = 0;
            while (i7 < i2) {
                int read = inputStream.read(bArr, i7, i2 - i7);
                if (read == -1) {
                    throw InvalidProtocolBufferException.h();
                }
                this.f19151k += read;
                i7 += read;
            }
            return bArr;
        }

        public final ArrayList E(int i2) {
            ArrayList arrayList = new ArrayList();
            while (i2 > 0) {
                int min = Math.min(i2, 4096);
                byte[] bArr = new byte[min];
                int i3 = 0;
                while (i3 < min) {
                    int read = this.e.read(bArr, i3, min - i3);
                    if (read == -1) {
                        throw InvalidProtocolBufferException.h();
                    }
                    this.f19151k += read;
                    i3 += read;
                }
                i2 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int F() {
            int i2 = this.f19149i;
            if (this.f19147g - i2 < 4) {
                L(4);
                i2 = this.f19149i;
            }
            this.f19149i = i2 + 4;
            byte[] bArr = this.f19146f;
            return ((bArr[i2 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i2] & UnsignedBytes.MAX_VALUE) | ((bArr[i2 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i2 + 2] & UnsignedBytes.MAX_VALUE) << 16);
        }

        public final long G() {
            int i2 = this.f19149i;
            if (this.f19147g - i2 < 8) {
                L(8);
                i2 = this.f19149i;
            }
            this.f19149i = i2 + 8;
            byte[] bArr = this.f19146f;
            return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
        }

        public final int H() {
            int i2;
            int i3 = this.f19149i;
            int i4 = this.f19147g;
            if (i4 != i3) {
                int i5 = i3 + 1;
                byte[] bArr = this.f19146f;
                byte b2 = bArr[i3];
                if (b2 >= 0) {
                    this.f19149i = i5;
                    return b2;
                }
                if (i4 - i5 >= 9) {
                    int i6 = i3 + 2;
                    int i7 = (bArr[i5] << 7) ^ b2;
                    if (i7 < 0) {
                        i2 = i7 ^ (-128);
                    } else {
                        int i8 = i3 + 3;
                        int i9 = (bArr[i6] << 14) ^ i7;
                        if (i9 >= 0) {
                            i2 = i9 ^ 16256;
                        } else {
                            int i10 = i3 + 4;
                            int i11 = i9 ^ (bArr[i8] << 21);
                            if (i11 < 0) {
                                i2 = (-2080896) ^ i11;
                            } else {
                                i8 = i3 + 5;
                                byte b3 = bArr[i10];
                                int i12 = (i11 ^ (b3 << 28)) ^ 266354560;
                                if (b3 < 0) {
                                    i10 = i3 + 6;
                                    if (bArr[i8] < 0) {
                                        i8 = i3 + 7;
                                        if (bArr[i10] < 0) {
                                            i10 = i3 + 8;
                                            if (bArr[i8] < 0) {
                                                i8 = i3 + 9;
                                                if (bArr[i10] < 0) {
                                                    int i13 = i3 + 10;
                                                    if (bArr[i8] >= 0) {
                                                        i6 = i13;
                                                        i2 = i12;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i2 = i12;
                                }
                                i2 = i12;
                            }
                            i6 = i10;
                        }
                        i6 = i8;
                    }
                    this.f19149i = i6;
                    return i2;
                }
            }
            return (int) J();
        }

        public final long I() {
            long j2;
            long j3;
            long j4;
            long j5;
            int i2 = this.f19149i;
            int i3 = this.f19147g;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.f19146f;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f19149i = i4;
                    return b2;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b2;
                    if (i6 < 0) {
                        j2 = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            j2 = i8 ^ 16256;
                            i5 = i7;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                j5 = (-2080896) ^ i10;
                            } else {
                                long j6 = i10;
                                i5 = i2 + 5;
                                long j7 = j6 ^ (bArr[i9] << 28);
                                if (j7 >= 0) {
                                    j4 = 266354560;
                                } else {
                                    i9 = i2 + 6;
                                    long j8 = j7 ^ (bArr[i5] << 35);
                                    if (j8 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        i5 = i2 + 7;
                                        j7 = j8 ^ (bArr[i9] << 42);
                                        if (j7 >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            i9 = i2 + 8;
                                            j8 = j7 ^ (bArr[i5] << 49);
                                            if (j8 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                i5 = i2 + 9;
                                                long j9 = (j8 ^ (bArr[i9] << 56)) ^ 71499008037633920L;
                                                if (j9 < 0) {
                                                    int i11 = i2 + 10;
                                                    if (bArr[i5] >= 0) {
                                                        i5 = i11;
                                                    }
                                                }
                                                j2 = j9;
                                            }
                                        }
                                    }
                                    j5 = j3 ^ j8;
                                }
                                j2 = j4 ^ j7;
                            }
                            i5 = i9;
                            j2 = j5;
                        }
                    }
                    this.f19149i = i5;
                    return j2;
                }
            }
            return J();
        }

        public final long J() {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                if (this.f19149i == this.f19147g) {
                    L(1);
                }
                int i3 = this.f19149i;
                this.f19149i = i3 + 1;
                j2 |= (r3 & Byte.MAX_VALUE) << i2;
                if ((this.f19146f[i3] & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void K() {
            int i2 = this.f19147g + this.f19148h;
            this.f19147g = i2;
            int i3 = this.f19151k + i2;
            int i4 = this.f19152l;
            if (i3 <= i4) {
                this.f19148h = 0;
                return;
            }
            int i5 = i3 - i4;
            this.f19148h = i5;
            this.f19147g = i2 - i5;
        }

        public final void L(int i2) {
            if (N(i2)) {
                return;
            }
            if (i2 <= (this.f19135c - this.f19151k) - this.f19149i) {
                throw InvalidProtocolBufferException.h();
            }
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        public final void M(int i2) {
            int i3 = this.f19147g;
            int i4 = this.f19149i;
            if (i2 <= i3 - i4 && i2 >= 0) {
                this.f19149i = i4 + i2;
                return;
            }
            InputStream inputStream = this.e;
            if (i2 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i5 = this.f19151k;
            int i6 = i5 + i4;
            int i7 = i6 + i2;
            int i8 = this.f19152l;
            if (i7 > i8) {
                M((i8 - i5) - i4);
                throw InvalidProtocolBufferException.h();
            }
            this.f19151k = i6;
            int i9 = i3 - i4;
            this.f19147g = 0;
            this.f19149i = 0;
            while (i9 < i2) {
                long j2 = i2 - i9;
                try {
                    long skip = inputStream.skip(j2);
                    if (skip < 0 || skip > j2) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i9 += (int) skip;
                    }
                } finally {
                    this.f19151k += i9;
                    K();
                }
            }
            if (i9 >= i2) {
                return;
            }
            int i10 = this.f19147g;
            int i11 = i10 - this.f19149i;
            this.f19149i = i10;
            L(1);
            while (true) {
                int i12 = i2 - i11;
                int i13 = this.f19147g;
                if (i12 <= i13) {
                    this.f19149i = i12;
                    return;
                } else {
                    i11 += i13;
                    this.f19149i = i13;
                    L(1);
                }
            }
        }

        public final boolean N(int i2) {
            int i3 = this.f19149i;
            int i4 = i3 + i2;
            int i5 = this.f19147g;
            if (i4 <= i5) {
                throw new IllegalStateException(d.j("refillBuffer() called when ", i2, " bytes were already available in buffer"));
            }
            int i6 = this.f19151k;
            int i7 = this.f19135c;
            if (i2 > (i7 - i6) - i3 || i6 + i3 + i2 > this.f19152l) {
                return false;
            }
            byte[] bArr = this.f19146f;
            if (i3 > 0) {
                if (i5 > i3) {
                    System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
                }
                this.f19151k += i3;
                this.f19147g -= i3;
                this.f19149i = 0;
            }
            int i8 = this.f19147g;
            int min = Math.min(bArr.length - i8, (i7 - this.f19151k) - i8);
            InputStream inputStream = this.e;
            int read = inputStream.read(bArr, i8, min);
            if (read == 0 || read < -1 || read > bArr.length) {
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.f19147g += read;
            K();
            if (this.f19147g >= i2) {
                return true;
            }
            return N(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void a(int i2) {
            if (this.f19150j != i2) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int d() {
            return this.f19151k + this.f19149i;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean e() {
            return this.f19149i == this.f19147g && !N(1);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void h(int i2) {
            this.f19152l = i2;
            K();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int i(int i2) {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i3 = this.f19151k + this.f19149i + i2;
            int i4 = this.f19152l;
            if (i3 > i4) {
                throw InvalidProtocolBufferException.h();
            }
            this.f19152l = i3;
            K();
            return i4;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean j() {
            return I() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final ByteString k() {
            int H = H();
            int i2 = this.f19147g;
            int i3 = this.f19149i;
            int i4 = i2 - i3;
            byte[] bArr = this.f19146f;
            if (H <= i4 && H > 0) {
                ByteString e = ByteString.e(i3, bArr, H);
                this.f19149i += H;
                return e;
            }
            if (H == 0) {
                return ByteString.f19122b;
            }
            byte[] D = D(H);
            if (D != null) {
                return ByteString.e(0, D, D.length);
            }
            int i5 = this.f19149i;
            int i6 = this.f19147g;
            int i7 = i6 - i5;
            this.f19151k += i6;
            this.f19149i = 0;
            this.f19147g = 0;
            ArrayList E = E(H - i7);
            byte[] bArr2 = new byte[H];
            System.arraycopy(bArr, i5, bArr2, 0, i7);
            Iterator it = E.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = (byte[]) it.next();
                System.arraycopy(bArr3, 0, bArr2, i7, bArr3.length);
                i7 += bArr3.length;
            }
            ByteString byteString = ByteString.f19122b;
            return new ByteString.LiteralByteString(bArr2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final double l() {
            return Double.longBitsToDouble(G());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int m() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int n() {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long o() {
            return G();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final float p() {
            return Float.intBitsToFloat(F());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int q() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long r() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int s() {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long t() {
            return G();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int u() {
            return CodedInputStream.b(H());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long v() {
            return CodedInputStream.c(I());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final String w() {
            int H = H();
            byte[] bArr = this.f19146f;
            if (H > 0) {
                int i2 = this.f19147g;
                int i3 = this.f19149i;
                if (H <= i2 - i3) {
                    String str = new String(bArr, i3, H, Internal.f19251a);
                    this.f19149i += H;
                    return str;
                }
            }
            if (H == 0) {
                return "";
            }
            if (H > this.f19147g) {
                return new String(C(H), Internal.f19251a);
            }
            L(H);
            String str2 = new String(bArr, this.f19149i, H, Internal.f19251a);
            this.f19149i += H;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final String x() {
            int H = H();
            int i2 = this.f19149i;
            int i3 = this.f19147g;
            int i4 = i3 - i2;
            byte[] bArr = this.f19146f;
            if (H <= i4 && H > 0) {
                this.f19149i = i2 + H;
            } else {
                if (H == 0) {
                    return "";
                }
                i2 = 0;
                if (H <= i3) {
                    L(H);
                    this.f19149i = H;
                } else {
                    bArr = C(H);
                }
            }
            return Utf8.f19397a.a(i2, bArr, H);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int y() {
            if (e()) {
                this.f19150j = 0;
                return 0;
            }
            int H = H();
            this.f19150j = H;
            if ((H >>> 3) != 0) {
                return H;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int z() {
            return H();
        }
    }

    /* loaded from: classes.dex */
    public static final class UnsafeDirectNioDecoder extends CodedInputStream {
        public long e;

        /* renamed from: f, reason: collision with root package name */
        public long f19153f;

        /* renamed from: g, reason: collision with root package name */
        public int f19154g;

        /* renamed from: h, reason: collision with root package name */
        public int f19155h;

        /* renamed from: i, reason: collision with root package name */
        public int f19156i;

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long A() {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean B(int i2) {
            int y2;
            int i3 = i2 & 7;
            int i4 = 0;
            if (i3 == 0) {
                if (((int) (this.e - this.f19153f)) >= 10) {
                    while (i4 < 10) {
                        long j2 = this.f19153f;
                        this.f19153f = j2 + 1;
                        if (UnsafeUtil.d.f(j2) < 0) {
                            i4++;
                        }
                    }
                    throw InvalidProtocolBufferException.e();
                }
                while (i4 < 10) {
                    long j3 = this.f19153f;
                    if (j3 == this.e) {
                        throw InvalidProtocolBufferException.h();
                    }
                    this.f19153f = j3 + 1;
                    if (UnsafeUtil.d.f(j3) < 0) {
                        i4++;
                    }
                }
                throw InvalidProtocolBufferException.e();
                return true;
            }
            if (i3 == 1) {
                I(8);
                return true;
            }
            if (i3 == 2) {
                I(E());
                return true;
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    return false;
                }
                if (i3 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                I(4);
                return true;
            }
            do {
                y2 = y();
                if (y2 == 0) {
                    break;
                }
            } while (B(y2));
            a(((i2 >>> 3) << 3) | 4);
            return true;
        }

        public final int C() {
            long j2 = this.f19153f;
            if (this.e - j2 < 4) {
                throw InvalidProtocolBufferException.h();
            }
            this.f19153f = 4 + j2;
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.d;
            return ((memoryAccessor.f(j2 + 3) & UnsignedBytes.MAX_VALUE) << 24) | (memoryAccessor.f(j2) & UnsignedBytes.MAX_VALUE) | ((memoryAccessor.f(1 + j2) & UnsignedBytes.MAX_VALUE) << 8) | ((memoryAccessor.f(2 + j2) & UnsignedBytes.MAX_VALUE) << 16);
        }

        public final long D() {
            long j2 = this.f19153f;
            if (this.e - j2 < 8) {
                throw InvalidProtocolBufferException.h();
            }
            this.f19153f = 8 + j2;
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.d;
            return ((memoryAccessor.f(j2 + 7) & 255) << 56) | (memoryAccessor.f(j2) & 255) | ((memoryAccessor.f(1 + j2) & 255) << 8) | ((memoryAccessor.f(2 + j2) & 255) << 16) | ((memoryAccessor.f(3 + j2) & 255) << 24) | ((memoryAccessor.f(4 + j2) & 255) << 32) | ((memoryAccessor.f(5 + j2) & 255) << 40) | ((memoryAccessor.f(6 + j2) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
        
            if (r4.f(r8) < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int E() {
            /*
                r12 = this;
                long r0 = r12.f19153f
                long r2 = r12.e
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L93
            La:
                r2 = 1
                long r2 = r2 + r0
                androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.d
                byte r5 = r4.f(r0)
                if (r5 < 0) goto L18
                r12.f19153f = r2
                return r5
            L18:
                long r6 = r12.e
                long r6 = r6 - r2
                r8 = 9
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r6 >= 0) goto L23
                goto L93
            L23:
                r6 = 2
                long r6 = r6 + r0
                byte r2 = r4.f(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r5
                if (r2 >= 0) goto L33
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto La0
            L33:
                r10 = 3
                long r10 = r10 + r0
                byte r3 = r4.f(r6)
                int r3 = r3 << 14
                r2 = r2 ^ r3
                if (r2 < 0) goto L43
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L41:
                r6 = r10
                goto La0
            L43:
                r5 = 4
                long r6 = r0 + r5
                byte r3 = r4.f(r10)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L55
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto La0
            L55:
                r10 = 5
                long r10 = r10 + r0
                byte r3 = r4.f(r6)
                int r5 = r3 << 28
                r2 = r2 ^ r5
                r5 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r5
                if (r3 >= 0) goto L9e
                r5 = 6
                long r6 = r0 + r5
                byte r3 = r4.f(r10)
                if (r3 >= 0) goto L99
                r10 = 7
                long r10 = r10 + r0
                byte r3 = r4.f(r6)
                if (r3 >= 0) goto L9e
                r5 = 8
                long r6 = r0 + r5
                byte r3 = r4.f(r10)
                if (r3 >= 0) goto L99
                long r8 = r8 + r0
                byte r3 = r4.f(r6)
                if (r3 >= 0) goto L9b
                r5 = 10
                long r6 = r0 + r5
                byte r0 = r4.f(r8)
                if (r0 >= 0) goto L99
            L93:
                long r0 = r12.G()
                int r0 = (int) r0
                return r0
            L99:
                r0 = r2
                goto La0
            L9b:
                r0 = r2
                r6 = r8
                goto La0
            L9e:
                r0 = r2
                goto L41
            La0:
                r12.f19153f = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.CodedInputStream.UnsafeDirectNioDecoder.E():int");
        }

        public final long F() {
            long j2;
            long j3;
            long j4;
            int i2;
            long j5 = this.f19153f;
            if (this.e != j5) {
                long j6 = 1 + j5;
                UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.d;
                byte f2 = memoryAccessor.f(j5);
                if (f2 >= 0) {
                    this.f19153f = j6;
                    return f2;
                }
                if (this.e - j6 >= 9) {
                    long j7 = 2 + j5;
                    int f3 = (memoryAccessor.f(j6) << 7) ^ f2;
                    if (f3 >= 0) {
                        long j8 = 3 + j5;
                        int f4 = f3 ^ (memoryAccessor.f(j7) << 14);
                        if (f4 >= 0) {
                            j2 = f4 ^ 16256;
                        } else {
                            j7 = j5 + 4;
                            int f5 = f4 ^ (memoryAccessor.f(j8) << 21);
                            if (f5 < 0) {
                                i2 = (-2080896) ^ f5;
                            } else {
                                j8 = 5 + j5;
                                long f6 = f5 ^ (memoryAccessor.f(j7) << 28);
                                if (f6 < 0) {
                                    long j9 = 6 + j5;
                                    long f7 = f6 ^ (memoryAccessor.f(j8) << 35);
                                    if (f7 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        j8 = 7 + j5;
                                        f6 = f7 ^ (memoryAccessor.f(j9) << 42);
                                        if (f6 >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            j9 = 8 + j5;
                                            f7 = f6 ^ (memoryAccessor.f(j8) << 49);
                                            if (f7 >= 0) {
                                                long j10 = j5 + 9;
                                                long f8 = (f7 ^ (memoryAccessor.f(j9) << 56)) ^ 71499008037633920L;
                                                if (f8 < 0) {
                                                    long j11 = j5 + 10;
                                                    if (memoryAccessor.f(j10) >= 0) {
                                                        j7 = j11;
                                                        j2 = f8;
                                                    }
                                                } else {
                                                    j2 = f8;
                                                    j7 = j10;
                                                }
                                                this.f19153f = j7;
                                                return j2;
                                            }
                                            j3 = -558586000294016L;
                                        }
                                    }
                                    j2 = j3 ^ f7;
                                    j7 = j9;
                                    this.f19153f = j7;
                                    return j2;
                                }
                                j4 = 266354560;
                                j2 = j4 ^ f6;
                            }
                        }
                        j7 = j8;
                        this.f19153f = j7;
                        return j2;
                    }
                    i2 = f3 ^ (-128);
                    j2 = i2;
                    this.f19153f = j7;
                    return j2;
                }
            }
            return G();
        }

        public final long G() {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                long j3 = this.f19153f;
                if (j3 == this.e) {
                    throw InvalidProtocolBufferException.h();
                }
                this.f19153f = 1 + j3;
                j2 |= (r3 & Byte.MAX_VALUE) << i2;
                if ((UnsafeUtil.d.f(j3) & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void H() {
            long j2 = this.e + this.f19154g;
            this.e = j2;
            int i2 = (int) (j2 - 0);
            int i3 = this.f19156i;
            if (i2 <= i3) {
                this.f19154g = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f19154g = i4;
            this.e = j2 - i4;
        }

        public final void I(int i2) {
            if (i2 >= 0) {
                long j2 = this.e;
                long j3 = this.f19153f;
                if (i2 <= ((int) (j2 - j3))) {
                    this.f19153f = j3 + i2;
                    return;
                }
            }
            if (i2 >= 0) {
                throw InvalidProtocolBufferException.h();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void a(int i2) {
            if (this.f19155h != i2) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int d() {
            return (int) (this.f19153f - 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean e() {
            return this.f19153f == this.e;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void h(int i2) {
            this.f19156i = i2;
            H();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int i(int i2) {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int d = i2 + d();
            int i3 = this.f19156i;
            if (d > i3) {
                throw InvalidProtocolBufferException.h();
            }
            this.f19156i = d;
            H();
            return i3;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean j() {
            return F() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final ByteString k() {
            int E = E();
            if (E > 0) {
                long j2 = this.e;
                long j3 = this.f19153f;
                if (E <= ((int) (j2 - j3))) {
                    byte[] bArr = new byte[E];
                    long j4 = E;
                    UnsafeUtil.d.c(j3, bArr, 0L, j4);
                    this.f19153f += j4;
                    ByteString byteString = ByteString.f19122b;
                    return new ByteString.LiteralByteString(bArr);
                }
            }
            if (E == 0) {
                return ByteString.f19122b;
            }
            if (E < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final double l() {
            return Double.longBitsToDouble(D());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int m() {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int n() {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long o() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final float p() {
            return Float.intBitsToFloat(C());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int q() {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long r() {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int s() {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long t() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int u() {
            return CodedInputStream.b(E());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long v() {
            return CodedInputStream.c(F());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final String w() {
            int E = E();
            if (E > 0) {
                long j2 = this.e;
                long j3 = this.f19153f;
                if (E <= ((int) (j2 - j3))) {
                    byte[] bArr = new byte[E];
                    long j4 = E;
                    UnsafeUtil.d.c(j3, bArr, 0L, j4);
                    String str = new String(bArr, Internal.f19251a);
                    this.f19153f += j4;
                    return str;
                }
            }
            if (E == 0) {
                return "";
            }
            if (E < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final String x() {
            int E = E();
            if (E > 0) {
                long j2 = this.e;
                long j3 = this.f19153f;
                if (E <= ((int) (j2 - j3))) {
                    String c2 = Utf8.c(null, (int) (j3 - 0), E);
                    this.f19153f += E;
                    return c2;
                }
            }
            if (E == 0) {
                return "";
            }
            if (E <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int y() {
            if (e()) {
                this.f19155h = 0;
                return 0;
            }
            int E = E();
            this.f19155h = E;
            if ((E >>> 3) != 0) {
                return E;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int z() {
            return E();
        }
    }

    public static int b(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public static long c(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public static CodedInputStream f(InputStream inputStream) {
        return new StreamDecoder(inputStream);
    }

    public static CodedInputStream g(byte[] bArr, int i2, int i3, boolean z2) {
        ArrayDecoder arrayDecoder = new ArrayDecoder(bArr, i2, i3, z2);
        try {
            arrayDecoder.i(i3);
            return arrayDecoder;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract long A();

    public abstract boolean B(int i2);

    public abstract void a(int i2);

    public abstract int d();

    public abstract boolean e();

    public abstract void h(int i2);

    public abstract int i(int i2);

    public abstract boolean j();

    public abstract ByteString k();

    public abstract double l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract float p();

    public abstract int q();

    public abstract long r();

    public abstract int s();

    public abstract long t();

    public abstract int u();

    public abstract long v();

    public abstract String w();

    public abstract String x();

    public abstract int y();

    public abstract int z();
}
