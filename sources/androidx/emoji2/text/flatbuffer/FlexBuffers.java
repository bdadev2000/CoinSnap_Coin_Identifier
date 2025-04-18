package androidx.emoji2.text.flatbuffer;

import android.support.v4.media.d;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes.dex */
public class FlexBuffers {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayReadWriteBuf f19573a;

    /* loaded from: classes.dex */
    public static class Blob extends Sized {
        public static final Blob e = new Sized(FlexBuffers.f19573a, 1, 1);

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public final StringBuilder a(StringBuilder sb) {
            sb.append('\"');
            sb.append(this.f19576a.a(this.f19577b, this.d));
            sb.append('\"');
            return sb;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public final String toString() {
            return this.f19576a.a(this.f19577b, this.d);
        }
    }

    /* loaded from: classes.dex */
    public static class FlexBufferException extends RuntimeException {
    }

    /* loaded from: classes.dex */
    public static class Key extends Object {
        public static final Key d = new Object(FlexBuffers.f19573a, 0, 0);

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public final StringBuilder a(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return key.f19577b == this.f19577b && key.f19578c == this.f19578c;
        }

        public final int hashCode() {
            return this.f19577b ^ this.f19578c;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public final String toString() {
            int i2 = this.f19577b;
            int i3 = i2;
            while (true) {
                ReadBuf readBuf = this.f19576a;
                if (readBuf.get(i3) == 0) {
                    return readBuf.a(i2, i3 - i2);
                }
                i3++;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class KeyVector {

        /* renamed from: a, reason: collision with root package name */
        public final TypedVector f19574a;

        public KeyVector(TypedVector typedVector) {
            this.f19574a = typedVector;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            int i2 = 0;
            while (true) {
                TypedVector typedVector = this.f19574a;
                if (i2 >= typedVector.d) {
                    sb.append("]");
                    return sb.toString();
                }
                typedVector.b(i2).d(sb);
                if (i2 != typedVector.d - 1) {
                    sb.append(", ");
                }
                i2++;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Map extends Vector {

        /* renamed from: f, reason: collision with root package name */
        public static final Map f19575f = new Sized(FlexBuffers.f19573a, 1, 1);

        /* JADX WARN: Type inference failed for: r1v4, types: [androidx.emoji2.text.flatbuffer.FlexBuffers$Vector, androidx.emoji2.text.flatbuffer.FlexBuffers$Sized] */
        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector, androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public final StringBuilder a(StringBuilder sb) {
            Object object;
            sb.append("{ ");
            int i2 = this.f19578c;
            int i3 = this.f19577b;
            int i4 = i3 - (i2 * 3);
            ReadBuf readBuf = this.f19576a;
            KeyVector keyVector = new KeyVector(new TypedVector(readBuf, FlexBuffers.a(readBuf, i4, i2), (int) FlexBuffers.c(readBuf, i4 + i2, i2), 4));
            ?? sized = new Sized(readBuf, i3, i2);
            int i5 = 0;
            while (true) {
                int i6 = this.d;
                if (i5 >= i6) {
                    sb.append(" }");
                    return sb;
                }
                sb.append('\"');
                TypedVector typedVector = keyVector.f19574a;
                if (i5 >= typedVector.d) {
                    object = Key.d;
                } else {
                    int i7 = typedVector.f19577b;
                    int i8 = typedVector.f19578c;
                    ReadBuf readBuf2 = typedVector.f19576a;
                    object = new Object(readBuf2, FlexBuffers.a(readBuf2, (i5 * i8) + i7, i8), 1);
                }
                sb.append(object.toString());
                sb.append("\" : ");
                sb.append(sized.b(i5).toString());
                if (i5 != i6 - 1) {
                    sb.append(", ");
                }
                i5++;
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Object {

        /* renamed from: a, reason: collision with root package name */
        public final ReadBuf f19576a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19577b;

        /* renamed from: c, reason: collision with root package name */
        public final int f19578c;

        public Object(ReadBuf readBuf, int i2, int i3) {
            this.f19576a = readBuf;
            this.f19577b = i2;
            this.f19578c = i3;
        }

        public abstract StringBuilder a(StringBuilder sb);

        public String toString() {
            return a(new StringBuilder(128)).toString();
        }
    }

    /* loaded from: classes.dex */
    public static class Reference {

        /* renamed from: f, reason: collision with root package name */
        public static final Reference f19579f = new Reference(FlexBuffers.f19573a, 0, 1, 0);

        /* renamed from: a, reason: collision with root package name */
        public final ReadBuf f19580a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19581b;

        /* renamed from: c, reason: collision with root package name */
        public final int f19582c;
        public final int d;
        public final int e;

        public Reference(ReadBuf readBuf, int i2, int i3, int i4) {
            this(readBuf, i2, i3, 1 << (i4 & 3), i4 >> 2);
        }

        public final String a() {
            int i2 = this.e;
            boolean z2 = i2 == 5;
            int i3 = this.d;
            int i4 = this.f19581b;
            ReadBuf readBuf = this.f19580a;
            if (z2) {
                int a2 = FlexBuffers.a(readBuf, i4, this.f19582c);
                return readBuf.a(a2, (int) FlexBuffers.d(readBuf, a2 - i3, i3));
            }
            if (i2 != 4) {
                return "";
            }
            int a3 = FlexBuffers.a(readBuf, i4, i3);
            int i5 = a3;
            while (readBuf.get(i5) != 0) {
                i5++;
            }
            return readBuf.a(a3, i5 - a3);
        }

        public final long b() {
            int i2 = this.f19581b;
            ReadBuf readBuf = this.f19580a;
            int i3 = this.f19582c;
            int i4 = this.e;
            if (i4 == 2) {
                return FlexBuffers.d(readBuf, i2, i3);
            }
            if (i4 == 1) {
                return FlexBuffers.c(readBuf, i2, i3);
            }
            if (i4 == 3) {
                return (long) FlexBuffers.b(readBuf, i2, i3);
            }
            if (i4 == 10) {
                return c().d;
            }
            if (i4 == 26) {
                return (int) FlexBuffers.c(readBuf, i2, i3);
            }
            if (i4 == 5) {
                return Long.parseLong(a());
            }
            int i5 = this.d;
            if (i4 == 6) {
                return FlexBuffers.c(readBuf, FlexBuffers.a(readBuf, i2, i3), i5);
            }
            if (i4 == 7) {
                return FlexBuffers.d(readBuf, FlexBuffers.a(readBuf, i2, i3), i5);
            }
            if (i4 != 8) {
                return 0L;
            }
            return (long) FlexBuffers.b(readBuf, FlexBuffers.a(readBuf, i2, i3), i3);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.emoji2.text.flatbuffer.FlexBuffers$Vector, androidx.emoji2.text.flatbuffer.FlexBuffers$Sized] */
        public final Vector c() {
            int i2 = this.e;
            int i3 = this.d;
            int i4 = this.f19582c;
            int i5 = this.f19581b;
            ReadBuf readBuf = this.f19580a;
            return (i2 == 10 || i2 == 9) ? new Sized(readBuf, FlexBuffers.a(readBuf, i5, i4), i3) : i2 == 15 ? new TypedVector(readBuf, FlexBuffers.a(readBuf, i5, i4), i3, 4) : ((i2 < 11 || i2 > 15) && i2 != 36) ? Vector.e : new TypedVector(readBuf, FlexBuffers.a(readBuf, i5, i4), i3, i2 - 10);
        }

        public final StringBuilder d(StringBuilder sb) {
            double b2;
            int i2;
            long c2;
            int i3;
            double d;
            long d2;
            int i4 = this.e;
            if (i4 != 36) {
                int i5 = this.d;
                int i6 = this.f19582c;
                int i7 = this.f19581b;
                ReadBuf readBuf = this.f19580a;
                long j2 = 0;
                boolean z2 = true;
                switch (i4) {
                    case 0:
                        sb.append("null");
                        return sb;
                    case 1:
                    case 6:
                        if (i4 == 1) {
                            j2 = FlexBuffers.c(readBuf, i7, i6);
                        } else if (i4 != 2) {
                            if (i4 == 3) {
                                b2 = FlexBuffers.b(readBuf, i7, i6);
                            } else if (i4 == 5) {
                                try {
                                    j2 = Long.parseLong(a());
                                } catch (NumberFormatException unused) {
                                }
                            } else if (i4 == 6) {
                                j2 = FlexBuffers.c(readBuf, FlexBuffers.a(readBuf, i7, i6), i5);
                            } else if (i4 == 7) {
                                j2 = FlexBuffers.d(readBuf, FlexBuffers.a(readBuf, i7, i6), i6);
                            } else if (i4 != 8) {
                                if (i4 == 10) {
                                    i2 = c().d;
                                } else if (i4 == 26) {
                                    i2 = (int) FlexBuffers.c(readBuf, i7, i6);
                                }
                                j2 = i2;
                            } else {
                                b2 = FlexBuffers.b(readBuf, FlexBuffers.a(readBuf, i7, i6), i5);
                            }
                            j2 = (long) b2;
                        } else {
                            j2 = FlexBuffers.d(readBuf, i7, i6);
                        }
                        sb.append(j2);
                        return sb;
                    case 2:
                    case 7:
                        sb.append(b());
                        return sb;
                    case 3:
                    case 8:
                        if (i4 == 3) {
                            d = FlexBuffers.b(readBuf, i7, i6);
                        } else {
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    if (i4 == 5) {
                                        d = Double.parseDouble(a());
                                    } else if (i4 == 6) {
                                        c2 = FlexBuffers.c(readBuf, FlexBuffers.a(readBuf, i7, i6), i5);
                                    } else if (i4 == 7) {
                                        d2 = FlexBuffers.d(readBuf, FlexBuffers.a(readBuf, i7, i6), i5);
                                        d = d2;
                                    } else if (i4 == 8) {
                                        d = FlexBuffers.b(readBuf, FlexBuffers.a(readBuf, i7, i6), i5);
                                    } else if (i4 == 10) {
                                        i3 = c().d;
                                        d = i3;
                                    } else if (i4 != 26) {
                                        d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                                    }
                                }
                                d2 = FlexBuffers.d(readBuf, i7, i6);
                                d = d2;
                            } else {
                                c2 = FlexBuffers.c(readBuf, i7, i6);
                            }
                            i3 = (int) c2;
                            d = i3;
                        }
                        sb.append(d);
                        return sb;
                    case 4:
                        Object object = i4 == 4 ? new Object(readBuf, FlexBuffers.a(readBuf, i7, i6), i5) : Key.d;
                        sb.append('\"');
                        object.a(sb);
                        sb.append('\"');
                        return sb;
                    case 5:
                        sb.append('\"');
                        sb.append(a());
                        sb.append('\"');
                        return sb;
                    case 9:
                        (i4 == 9 ? new Sized(readBuf, FlexBuffers.a(readBuf, i7, i6), i5) : Map.f19575f).a(sb);
                        return sb;
                    case 10:
                        c().a(sb);
                        return sb;
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new RuntimeException(d.i("not_implemented:", i4));
                    case 25:
                        ((i4 == 25 || i4 == 5) ? new Sized(readBuf, FlexBuffers.a(readBuf, i7, i6), i5) : Blob.e).a(sb);
                        return sb;
                    case 26:
                        if (i4 != 26 ? b() == 0 : readBuf.get(i7) == 0) {
                            z2 = false;
                        }
                        sb.append(z2);
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(c());
            return sb;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            d(sb);
            return sb.toString();
        }

        public Reference(ReadBuf readBuf, int i2, int i3, int i4, int i5) {
            this.f19580a = readBuf;
            this.f19581b = i2;
            this.f19582c = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Sized extends Object {
        public final int d;

        public Sized(ReadBuf readBuf, int i2, int i3) {
            super(readBuf, i2, i3);
            this.d = (int) FlexBuffers.c(readBuf, i2 - i3, i3);
        }
    }

    /* loaded from: classes.dex */
    public static class TypedVector extends Vector {

        /* renamed from: f, reason: collision with root package name */
        public final int f19583f;

        static {
            new TypedVector(FlexBuffers.f19573a, 1, 1, 1);
        }

        public TypedVector(ReadBuf readBuf, int i2, int i3, int i4) {
            super(readBuf, i2, i3);
            this.f19583f = i4;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector
        public final Reference b(int i2) {
            if (i2 >= this.d) {
                return Reference.f19579f;
            }
            return new Reference(this.f19576a, (i2 * this.f19578c) + this.f19577b, this.f19578c, 1, this.f19583f);
        }
    }

    /* loaded from: classes.dex */
    public static class Unsigned {
    }

    /* loaded from: classes.dex */
    public static class Vector extends Sized {
        public static final Vector e = new Sized(FlexBuffers.f19573a, 1, 1);

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder a(StringBuilder sb) {
            sb.append("[ ");
            int i2 = 0;
            while (true) {
                int i3 = this.d;
                if (i2 >= i3) {
                    sb.append(" ]");
                    return sb;
                }
                b(i2).d(sb);
                if (i2 != i3 - 1) {
                    sb.append(", ");
                }
                i2++;
            }
        }

        public Reference b(int i2) {
            long j2 = this.d;
            long j3 = i2;
            if (j3 >= j2) {
                return Reference.f19579f;
            }
            int i3 = this.f19577b;
            int i4 = this.f19578c;
            long j4 = j2 * i4;
            ReadBuf readBuf = this.f19576a;
            return new Reference(readBuf, (i2 * i4) + i3, i4, readBuf.get((int) (j4 + i3 + j3)) & UnsignedBytes.MAX_VALUE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf, java.lang.Object] */
    static {
        ?? obj = new java.lang.Object();
        obj.f19572a = new byte[]{0};
        f19573a = obj;
    }

    public static int a(ReadBuf readBuf, int i2, int i3) {
        return (int) (i2 - d(readBuf, i2, i3));
    }

    public static double b(ReadBuf readBuf, int i2, int i3) {
        if (i3 == 4) {
            return readBuf.getFloat(i2);
        }
        if (i3 != 8) {
            return -1.0d;
        }
        return readBuf.getDouble(i2);
    }

    public static long c(ReadBuf readBuf, int i2, int i3) {
        int i4;
        if (i3 == 1) {
            i4 = readBuf.get(i2);
        } else if (i3 == 2) {
            i4 = readBuf.getShort(i2);
        } else {
            if (i3 != 4) {
                if (i3 != 8) {
                    return -1L;
                }
                return readBuf.getLong(i2);
            }
            i4 = readBuf.getInt(i2);
        }
        return i4;
    }

    public static long d(ReadBuf readBuf, int i2, int i3) {
        if (i3 == 1) {
            return readBuf.get(i2) & UnsignedBytes.MAX_VALUE;
        }
        if (i3 == 2) {
            return readBuf.getShort(i2) & 65535;
        }
        if (i3 == 4) {
            return readBuf.getInt(i2) & 4294967295L;
        }
        if (i3 != 8) {
            return -1L;
        }
        return readBuf.getLong(i2);
    }
}
