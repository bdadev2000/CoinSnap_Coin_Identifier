package W1;

import Q7.n0;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import n1.C2475f;

/* loaded from: classes.dex */
public final class n implements N1.e {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3578a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int e(m mVar, Q1.f fVar) {
        try {
            int b8 = mVar.b();
            if ((b8 & 65496) != 65496 && b8 != 19789 && b8 != 18761) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + b8);
                }
                return -1;
            }
            int g9 = g(mVar);
            if (g9 == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) fVar.c(g9, byte[].class);
            try {
                return h(mVar, bArr, g9);
            } finally {
                fVar.g(bArr);
            }
        } catch (l unused) {
            return -1;
        }
    }

    public static ImageHeaderParser$ImageType f(m mVar) {
        boolean z8;
        try {
            int b8 = mVar.b();
            if (b8 == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int e4 = (b8 << 8) | mVar.e();
            if (e4 == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int e9 = (e4 << 8) | mVar.e();
            if (e9 == -1991225785) {
                mVar.skip(21L);
                try {
                    if (mVar.e() >= 3) {
                        return ImageHeaderParser$ImageType.PNG_A;
                    }
                    return ImageHeaderParser$ImageType.PNG;
                } catch (l unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (e9 != 1380533830) {
                if (((mVar.b() << 16) | mVar.b()) != 1718909296) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int b9 = (mVar.b() << 16) | mVar.b();
                if (b9 == 1635150195) {
                    return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                }
                int i9 = 0;
                if (b9 == 1635150182) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                mVar.skip(4L);
                int i10 = e9 - 16;
                if (i10 % 4 == 0) {
                    while (i9 < 5 && i10 > 0) {
                        int b10 = (mVar.b() << 16) | mVar.b();
                        if (b10 == 1635150195) {
                            return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                        }
                        if (b10 == 1635150182) {
                            z8 = true;
                        }
                        i9++;
                        i10 -= 4;
                    }
                }
                if (z8) {
                    return ImageHeaderParser$ImageType.AVIF;
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            mVar.skip(4L);
            if (((mVar.b() << 16) | mVar.b()) != 1464156752) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int b11 = (mVar.b() << 16) | mVar.b();
            if ((b11 & (-256)) != 1448097792) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int i11 = b11 & 255;
            if (i11 == 88) {
                mVar.skip(4L);
                short e10 = mVar.e();
                if ((e10 & 2) != 0) {
                    return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                }
                if ((e10 & 16) != 0) {
                    return ImageHeaderParser$ImageType.WEBP_A;
                }
                return ImageHeaderParser$ImageType.WEBP;
            }
            if (i11 == 76) {
                mVar.skip(4L);
                if ((mVar.e() & 8) != 0) {
                    return ImageHeaderParser$ImageType.WEBP_A;
                }
                return ImageHeaderParser$ImageType.WEBP;
            }
            return ImageHeaderParser$ImageType.WEBP;
        } catch (l unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static int g(m mVar) {
        short e4;
        int b8;
        long j7;
        long skip;
        do {
            short e9 = mVar.e();
            if (e9 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) e9));
                }
                return -1;
            }
            e4 = mVar.e();
            if (e4 == 218) {
                return -1;
            }
            if (e4 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            b8 = mVar.b() - 2;
            if (e4 != 225) {
                j7 = b8;
                skip = mVar.skip(j7);
            } else {
                return b8;
            }
        } while (skip == j7);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder o3 = n0.o(e4, b8, "Unable to skip enough data, type: ", ", wanted to skip: ", ", but actually skipped: ");
            o3.append(skip);
            Log.d("DfltImageHeaderParser", o3.toString());
        }
        return -1;
    }

    public static int h(m mVar, byte[] bArr, int i9) {
        boolean z8;
        ByteOrder byteOrder;
        int i10;
        int i11;
        int j7 = mVar.j(i9, bArr);
        if (j7 != i9) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i9 + ", actually read: " + j7);
            }
            return -1;
        }
        short s5 = 1;
        int i12 = 0;
        byte[] bArr2 = f3578a;
        if (bArr != null && i9 > bArr2.length) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            int i13 = 0;
            while (true) {
                if (i13 >= bArr2.length) {
                    break;
                }
                if (bArr[i13] != bArr2[i13]) {
                    z8 = false;
                    break;
                }
                i13++;
            }
        }
        if (z8) {
            k kVar = new k(bArr, i9);
            short d2 = kVar.d(6);
            if (d2 != 18761) {
                if (d2 != 19789) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) d2));
                    }
                    byteOrder = ByteOrder.BIG_ENDIAN;
                } else {
                    byteOrder = ByteOrder.BIG_ENDIAN;
                }
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            ByteBuffer byteBuffer = kVar.b;
            byteBuffer.order(byteOrder);
            if (byteBuffer.remaining() - 10 >= 4) {
                i10 = byteBuffer.getInt(10);
            } else {
                i10 = -1;
            }
            short d9 = kVar.d(i10 + 6);
            while (i12 < d9) {
                int i14 = (i12 * 12) + i10 + 8;
                short d10 = kVar.d(i14);
                if (d10 == 274) {
                    short d11 = kVar.d(i14 + 2);
                    if (d11 >= s5 && d11 <= 12) {
                        int i15 = i14 + 4;
                        if (byteBuffer.remaining() - i15 >= 4) {
                            i11 = byteBuffer.getInt(i15);
                        } else {
                            i11 = -1;
                        }
                        if (i11 < 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Negative tiff component count");
                            }
                        } else {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder o3 = n0.o(i12, d10, "Got tagIndex=", " tagType=", " formatCode=");
                                o3.append((int) d11);
                                o3.append(" componentCount=");
                                o3.append(i11);
                                Log.d("DfltImageHeaderParser", o3.toString());
                            }
                            int i16 = i11 + b[d11];
                            if (i16 > 4) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) d11));
                                }
                            } else {
                                int i17 = i14 + 8;
                                if (i17 >= 0 && i17 <= byteBuffer.remaining()) {
                                    if (i16 >= 0 && i16 + i17 <= byteBuffer.remaining()) {
                                        return kVar.d(i17);
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) d10));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i17 + " tagType=" + ((int) d10));
                                }
                            }
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) d11));
                    }
                }
                i12++;
                s5 = 1;
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    @Override // N1.e
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        j2.g.c(byteBuffer, "Argument must not be null");
        return f(new j(byteBuffer));
    }

    @Override // N1.e
    public final ImageHeaderParser$ImageType b(InputStream inputStream) {
        j2.g.c(inputStream, "Argument must not be null");
        return f(new C2475f(inputStream, 17));
    }

    @Override // N1.e
    public final int c(InputStream inputStream, Q1.f fVar) {
        j2.g.c(inputStream, "Argument must not be null");
        C2475f c2475f = new C2475f(inputStream, 17);
        j2.g.c(fVar, "Argument must not be null");
        return e(c2475f, fVar);
    }

    @Override // N1.e
    public final int d(ByteBuffer byteBuffer, Q1.f fVar) {
        j2.g.c(byteBuffer, "Argument must not be null");
        j jVar = new j(byteBuffer);
        j2.g.c(fVar, "Argument must not be null");
        return e(jVar, fVar);
    }
}
