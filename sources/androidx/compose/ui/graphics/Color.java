package androidx.compose.ui.graphics;

import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Connector;
import androidx.compose.ui.graphics.colorspace.ConnectorKt;
import kotlin.jvm.internal.q;
import okhttp3.internal.ws.WebSocketProtocol;

@Immutable
/* loaded from: classes4.dex */
public final class Color {

    /* renamed from: b, reason: collision with root package name */
    public static final long f14957b = ColorKt.d(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f14958c;
    public static final long d;
    public static final long e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f14959f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f14960g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f14961h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f14962i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f14963j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f14964a;

    /* loaded from: classes4.dex */
    public static final class Companion {
        public static long a() {
            return Color.f14957b;
        }
    }

    static {
        ColorKt.d(4282664004L);
        ColorKt.d(4287137928L);
        ColorKt.d(4291611852L);
        f14958c = ColorKt.d(4294967295L);
        d = ColorKt.d(4294901760L);
        e = ColorKt.d(4278255360L);
        f14959f = ColorKt.d(4278190335L);
        f14960g = ColorKt.d(4294967040L);
        ColorKt.d(4278255615L);
        ColorKt.d(4294902015L);
        f14961h = ColorKt.b(0);
        float[] fArr = ColorSpaces.f15073a;
        f14962i = ColorKt.a(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.f15089s);
    }

    public /* synthetic */ Color(long j2) {
        this.f14964a = j2;
    }

    public static final long a(long j2, ColorSpace colorSpace) {
        Connector connector;
        ColorSpace f2 = f(j2);
        int i2 = f2.f15072c;
        int i3 = colorSpace.f15072c;
        if ((i2 | i3) < 0) {
            connector = ColorSpaceKt.d(f2, colorSpace, 0);
        } else {
            MutableIntObjectMap mutableIntObjectMap = ConnectorKt.f15097a;
            int i4 = i2 | (i3 << 6);
            Object c2 = mutableIntObjectMap.c(i4);
            if (c2 == null) {
                c2 = ColorSpaceKt.d(f2, colorSpace, 0);
                mutableIntObjectMap.i(i4, c2);
            }
            connector = (Connector) c2;
        }
        return connector.a(j2);
    }

    public static long b(long j2, float f2) {
        return ColorKt.a(h(j2), g(j2), e(j2), f2, f(j2));
    }

    public static final boolean c(long j2, long j3) {
        return j2 == j3;
    }

    public static final float d(long j2) {
        float o2;
        float f2;
        if ((63 & j2) == 0) {
            o2 = (float) q.o((j2 >>> 56) & 255);
            f2 = 255.0f;
        } else {
            o2 = (float) q.o((j2 >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return o2 / f2;
    }

    public static final float e(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) q.o((j2 >>> 32) & 255)) / 255.0f;
        }
        short s2 = (short) ((j2 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i5 = 32768 & s2;
        int i6 = ((65535 & s2) >>> 10) & 31;
        int i7 = s2 & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - Float16Kt.f14968a;
                return i5 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final ColorSpace f(long j2) {
        float[] fArr = ColorSpaces.f15073a;
        return ColorSpaces.f15091u[(int) (j2 & 63)];
    }

    public static final float g(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) q.o((j2 >>> 40) & 255)) / 255.0f;
        }
        short s2 = (short) ((j2 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i5 = 32768 & s2;
        int i6 = ((65535 & s2) >>> 10) & 31;
        int i7 = s2 & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - Float16Kt.f14968a;
                return i5 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final float h(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) q.o((j2 >>> 48) & 255)) / 255.0f;
        }
        short s2 = (short) ((j2 >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i5 = 32768 & s2;
        int i6 = ((65535 & s2) >>> 10) & 31;
        int i7 = s2 & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - Float16Kt.f14968a;
                return i5 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static String i(long j2) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j2));
        sb.append(", ");
        sb.append(g(j2));
        sb.append(", ");
        sb.append(e(j2));
        sb.append(", ");
        sb.append(d(j2));
        sb.append(", ");
        return android.support.v4.media.d.q(sb, f(j2).f15070a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Color) {
            return this.f14964a == ((Color) obj).f14964a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14964a);
    }

    public final String toString() {
        return i(this.f14964a);
    }
}
