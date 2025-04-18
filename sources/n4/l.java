package n4;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class l implements e4.f {
    public static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f22419b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int e(k kVar, h4.h hVar) {
        boolean z10;
        try {
            int d10 = kVar.d();
            if ((d10 & 65496) != 65496 && d10 != 19789 && d10 != 18761) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + d10);
                }
                return -1;
            }
            int g10 = g(kVar);
            if (g10 == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) hVar.c(byte[].class, g10);
            try {
                return h(kVar, bArr, g10);
            } finally {
                hVar.g(bArr);
            }
        } catch (j unused) {
            return -1;
        }
    }

    public static ImageHeaderParser$ImageType f(k kVar) {
        boolean z10;
        try {
            int d10 = kVar.d();
            if (d10 == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int r6 = (d10 << 8) | kVar.r();
            if (r6 == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int r10 = (r6 << 8) | kVar.r();
            if (r10 == -1991225785) {
                kVar.skip(21L);
                try {
                    if (kVar.r() >= 3) {
                        return ImageHeaderParser$ImageType.PNG_A;
                    }
                    return ImageHeaderParser$ImageType.PNG;
                } catch (j unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (r10 != 1380533830) {
                if (((kVar.d() << 16) | kVar.d()) != 1718909296) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int d11 = (kVar.d() << 16) | kVar.d();
                if (d11 == 1635150195) {
                    return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                }
                int i10 = 0;
                if (d11 == 1635150182) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                kVar.skip(4L);
                int i11 = r10 - 16;
                if (i11 % 4 == 0) {
                    while (i10 < 5 && i11 > 0) {
                        int d12 = (kVar.d() << 16) | kVar.d();
                        if (d12 == 1635150195) {
                            return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                        }
                        if (d12 == 1635150182) {
                            z10 = true;
                        }
                        i10++;
                        i11 -= 4;
                    }
                }
                if (z10) {
                    return ImageHeaderParser$ImageType.AVIF;
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            kVar.skip(4L);
            if (((kVar.d() << 16) | kVar.d()) != 1464156752) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int d13 = (kVar.d() << 16) | kVar.d();
            if ((d13 & (-256)) != 1448097792) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int i12 = d13 & 255;
            if (i12 == 88) {
                kVar.skip(4L);
                short r11 = kVar.r();
                if ((r11 & 2) != 0) {
                    return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                }
                if ((r11 & 16) != 0) {
                    return ImageHeaderParser$ImageType.WEBP_A;
                }
                return ImageHeaderParser$ImageType.WEBP;
            }
            if (i12 == 76) {
                kVar.skip(4L);
                if ((kVar.r() & 8) != 0) {
                    return ImageHeaderParser$ImageType.WEBP_A;
                }
                return ImageHeaderParser$ImageType.WEBP;
            }
            return ImageHeaderParser$ImageType.WEBP;
        } catch (j unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static int g(k kVar) {
        short r6;
        int d10;
        long j3;
        long skip;
        do {
            short r10 = kVar.r();
            if (r10 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) r10));
                }
                return -1;
            }
            r6 = kVar.r();
            if (r6 == 218) {
                return -1;
            }
            if (r6 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            d10 = kVar.d() - 2;
            if (r6 != 225) {
                j3 = d10;
                skip = kVar.skip(j3);
            } else {
                return d10;
            }
        } while (skip == j3);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder n10 = a4.j.n("Unable to skip enough data, type: ", r6, ", wanted to skip: ", d10, ", but actually skipped: ");
            n10.append(skip);
            Log.d("DfltImageHeaderParser", n10.toString());
        }
        return -1;
    }

    public static int h(k kVar, byte[] bArr, int i10) {
        boolean z10;
        ByteOrder byteOrder;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        int j3 = kVar.j(i10, bArr);
        if (j3 != i10) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + j3);
            }
            return -1;
        }
        byte[] bArr2 = a;
        if (i10 > bArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i13 = 0;
            while (true) {
                if (i13 >= bArr2.length) {
                    break;
                }
                if (bArr[i13] != bArr2[i13]) {
                    z10 = false;
                    break;
                }
                i13++;
            }
        }
        if (z10) {
            f.a aVar = new f.a(bArr, i10);
            short q10 = aVar.q(6);
            if (q10 != 18761) {
                if (q10 != 19789) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) q10));
                    }
                    byteOrder = ByteOrder.BIG_ENDIAN;
                } else {
                    byteOrder = ByteOrder.BIG_ENDIAN;
                }
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            ((ByteBuffer) aVar.f17509c).order(byteOrder);
            if (((ByteBuffer) aVar.f17509c).remaining() - 10 >= 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i11 = ((ByteBuffer) aVar.f17509c).getInt(10);
            } else {
                i11 = -1;
            }
            int i14 = i11 + 6;
            short q11 = aVar.q(i14);
            for (int i15 = 0; i15 < q11; i15++) {
                int i16 = (i15 * 12) + i14 + 2;
                short q12 = aVar.q(i16);
                if (q12 == 274) {
                    short q13 = aVar.q(i16 + 2);
                    if (q13 >= 1 && q13 <= 12) {
                        int i17 = i16 + 4;
                        if (((ByteBuffer) aVar.f17509c).remaining() - i17 >= 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            i12 = ((ByteBuffer) aVar.f17509c).getInt(i17);
                        } else {
                            i12 = -1;
                        }
                        if (i12 < 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Negative tiff component count");
                            }
                        } else {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder n10 = a4.j.n("Got tagIndex=", i15, " tagType=", q12, " formatCode=");
                                n10.append((int) q13);
                                n10.append(" componentCount=");
                                n10.append(i12);
                                Log.d("DfltImageHeaderParser", n10.toString());
                            }
                            int i18 = i12 + f22419b[q13];
                            if (i18 > 4) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) q13));
                                }
                            } else {
                                int i19 = i16 + 8;
                                if (i19 >= 0 && i19 <= ((ByteBuffer) aVar.f17509c).remaining()) {
                                    if (i18 >= 0 && i18 + i19 <= ((ByteBuffer) aVar.f17509c).remaining()) {
                                        return aVar.q(i19);
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) q12));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i19 + " tagType=" + ((int) q12));
                                }
                            }
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) q13));
                    }
                }
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    @Override // e4.f
    public final int a(InputStream inputStream, h4.h hVar) {
        com.bumptech.glide.c.l(inputStream);
        v3.c cVar = new v3.c(inputStream, 21);
        com.bumptech.glide.c.l(hVar);
        return e(cVar, hVar);
    }

    @Override // e4.f
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        com.bumptech.glide.c.l(byteBuffer);
        return f(new androidx.emoji2.text.w(1, byteBuffer));
    }

    @Override // e4.f
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        com.bumptech.glide.c.l(inputStream);
        return f(new v3.c(inputStream, 21));
    }

    @Override // e4.f
    public final int d(ByteBuffer byteBuffer, h4.h hVar) {
        com.bumptech.glide.c.l(byteBuffer);
        androidx.emoji2.text.w wVar = new androidx.emoji2.text.w(1, byteBuffer);
        com.bumptech.glide.c.l(hVar);
        return e(wVar, hVar);
    }
}
