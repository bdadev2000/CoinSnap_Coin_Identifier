package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.support.v4.media.d;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.compose.foundation.text.input.a;
import androidx.exifinterface.media.ExifInterfaceUtils;
import com.google.android.gms.common.api.Api;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* loaded from: classes2.dex */
public class ExifInterface {
    public static final String[] D;
    public static final int[] E;
    public static final byte[] F;
    public static final ExifTag G;
    public static final ExifTag[][] H;
    public static final ExifTag[] I;
    public static final HashMap[] J;
    public static final HashMap[] K;
    public static final HashSet L;
    public static final HashMap M;
    public static final Charset N;
    public static final byte[] O;
    public static final byte[] P;

    /* renamed from: a, reason: collision with root package name */
    public final FileDescriptor f19626a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager.AssetInputStream f19627b;

    /* renamed from: c, reason: collision with root package name */
    public int f19628c;
    public final HashMap[] d;
    public final HashSet e;

    /* renamed from: f, reason: collision with root package name */
    public ByteOrder f19629f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19630g;

    /* renamed from: h, reason: collision with root package name */
    public int f19631h;

    /* renamed from: i, reason: collision with root package name */
    public int f19632i;

    /* renamed from: j, reason: collision with root package name */
    public int f19633j;

    /* renamed from: k, reason: collision with root package name */
    public int f19634k;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f19613l = Log.isLoggable("ExifInterface", 3);

    /* renamed from: m, reason: collision with root package name */
    public static final List f19614m = Arrays.asList(1, 6, 3, 8);

    /* renamed from: n, reason: collision with root package name */
    public static final List f19615n = Arrays.asList(2, 7, 4, 5);

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f19616o = {8, 8, 8};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f19617p = {8};

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f19618q = {-1, -40, -1};

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f19619r = {102, 116, 121, 112};

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f19620s = {109, 105, 102, 49};

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f19621t = {104, 101, 105, 99};

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f19622u = {79, 76, 89, 77, 80, 0};

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f19623v = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] w = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] x = {101, 88, 73, 102};

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f19624y = {73, 72, 68, 82};

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f19625z = {73, 69, 78, 68};
    public static final byte[] A = {82, 73, 70, 70};
    public static final byte[] B = {87, 69, 66, 80};
    public static final byte[] C = {69, 88, 73, 70};

    /* loaded from: classes2.dex */
    public static class ByteOrderedDataInputStream extends InputStream implements DataInput {

        /* renamed from: a, reason: collision with root package name */
        public final DataInputStream f19637a;

        /* renamed from: b, reason: collision with root package name */
        public int f19638b;

        /* renamed from: c, reason: collision with root package name */
        public ByteOrder f19639c;
        public byte[] d;

        /* renamed from: f, reason: collision with root package name */
        public final int f19640f;

        public ByteOrderedDataInputStream(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f19640f = bArr.length;
        }

        public final void a(int i2) {
            int i3 = 0;
            while (i3 < i2) {
                DataInputStream dataInputStream = this.f19637a;
                int i4 = i2 - i3;
                int skip = (int) dataInputStream.skip(i4);
                if (skip <= 0) {
                    if (this.d == null) {
                        this.d = new byte[8192];
                    }
                    skip = dataInputStream.read(this.d, 0, Math.min(8192, i4));
                    if (skip == -1) {
                        throw new EOFException(d.j("Reached EOF while skipping ", i2, " bytes."));
                    }
                }
                i3 += skip;
            }
            this.f19638b += i3;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f19637a.available();
        }

        @Override // java.io.InputStream
        public final void mark(int i2) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public final int read() {
            this.f19638b++;
            return this.f19637a.read();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() {
            this.f19638b++;
            return this.f19637a.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() {
            this.f19638b++;
            int read = this.f19637a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() {
            this.f19638b += 2;
            return this.f19637a.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i2, int i3) {
            this.f19638b += i3;
            this.f19637a.readFully(bArr, i2, i3);
        }

        @Override // java.io.DataInput
        public final int readInt() {
            this.f19638b += 4;
            DataInputStream dataInputStream = this.f19637a;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            int read3 = dataInputStream.read();
            int read4 = dataInputStream.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f19639c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f19639c);
        }

        @Override // java.io.DataInput
        public final String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() {
            this.f19638b += 8;
            DataInputStream dataInputStream = this.f19637a;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            int read3 = dataInputStream.read();
            int read4 = dataInputStream.read();
            int read5 = dataInputStream.read();
            int read6 = dataInputStream.read();
            int read7 = dataInputStream.read();
            int read8 = dataInputStream.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f19639c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f19639c);
        }

        @Override // java.io.DataInput
        public final short readShort() {
            this.f19638b += 2;
            DataInputStream dataInputStream = this.f19637a;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f19639c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f19639c);
        }

        @Override // java.io.DataInput
        public final String readUTF() {
            this.f19638b += 2;
            return this.f19637a.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() {
            this.f19638b++;
            return this.f19637a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() {
            this.f19638b += 2;
            DataInputStream dataInputStream = this.f19637a;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f19639c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f19639c);
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i2) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i2, int i3) {
            int read = this.f19637a.read(bArr, i2, i3);
            this.f19638b += read;
            return read;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) {
            this.f19638b += bArr.length;
            this.f19637a.readFully(bArr);
        }

        public ByteOrderedDataInputStream(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public ByteOrderedDataInputStream(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f19637a = dataInputStream;
            dataInputStream.mark(0);
            this.f19638b = 0;
            this.f19639c = byteOrder;
            this.f19640f = inputStream instanceof ByteOrderedDataInputStream ? ((ByteOrderedDataInputStream) inputStream).f19640f : -1;
        }
    }

    /* loaded from: classes2.dex */
    public static class ByteOrderedDataOutputStream extends FilterOutputStream {
        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) {
            throw null;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i2, int i3) {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static class ExifAttribute {

        /* renamed from: a, reason: collision with root package name */
        public final int f19641a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19642b;

        /* renamed from: c, reason: collision with root package name */
        public final long f19643c;
        public final byte[] d;

        public ExifAttribute(int i2, byte[] bArr, int i3) {
            this(-1L, bArr, i2, i3);
        }

        public static ExifAttribute a(long j2, ByteOrder byteOrder) {
            long[] jArr = {j2};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.E[4]]);
            wrap.order(byteOrder);
            wrap.putInt((int) jArr[0]);
            return new ExifAttribute(4, wrap.array(), 1);
        }

        public static ExifAttribute b(Rational rational, ByteOrder byteOrder) {
            Rational[] rationalArr = {rational};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.E[5]]);
            wrap.order(byteOrder);
            Rational rational2 = rationalArr[0];
            wrap.putInt((int) rational2.f19647a);
            wrap.putInt((int) rational2.f19648b);
            return new ExifAttribute(5, wrap.array(), 1);
        }

        public static ExifAttribute c(int i2, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.E[3]]);
            wrap.order(byteOrder);
            wrap.putShort((short) new int[]{i2}[0]);
            return new ExifAttribute(3, wrap.array(), 1);
        }

        public final double d(ByteOrder byteOrder) {
            Object g2 = g(byteOrder);
            if (g2 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (g2 instanceof String) {
                return Double.parseDouble((String) g2);
            }
            if (g2 instanceof long[]) {
                if (((long[]) g2).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (g2 instanceof int[]) {
                if (((int[]) g2).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (g2 instanceof double[]) {
                double[] dArr = (double[]) g2;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(g2 instanceof Rational[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            Rational[] rationalArr = (Rational[]) g2;
            if (rationalArr.length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            Rational rational = rationalArr[0];
            return rational.f19647a / rational.f19648b;
        }

        public final int e(ByteOrder byteOrder) {
            Object g2 = g(byteOrder);
            if (g2 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (g2 instanceof String) {
                return Integer.parseInt((String) g2);
            }
            if (g2 instanceof long[]) {
                long[] jArr = (long[]) g2;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(g2 instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) g2;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public final String f(ByteOrder byteOrder) {
            Object g2 = g(byteOrder);
            if (g2 == null) {
                return null;
            }
            if (g2 instanceof String) {
                return (String) g2;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            if (g2 instanceof long[]) {
                long[] jArr = (long[]) g2;
                while (i2 < jArr.length) {
                    sb.append(jArr[i2]);
                    i2++;
                    if (i2 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (g2 instanceof int[]) {
                int[] iArr = (int[]) g2;
                while (i2 < iArr.length) {
                    sb.append(iArr[i2]);
                    i2++;
                    if (i2 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (g2 instanceof double[]) {
                double[] dArr = (double[]) g2;
                while (i2 < dArr.length) {
                    sb.append(dArr[i2]);
                    i2++;
                    if (i2 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(g2 instanceof Rational[])) {
                return null;
            }
            Rational[] rationalArr = (Rational[]) g2;
            while (i2 < rationalArr.length) {
                sb.append(rationalArr[i2].f19647a);
                sb.append('/');
                sb.append(rationalArr[i2].f19648b);
                i2++;
                if (i2 != rationalArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:89|(2:91|(2:92|(2:94|(2:97|98)(1:96))(2:99|100)))|101|(2:103|(6:112|113|114|115|116|117)(3:105|(2:107|108)(2:110|111)|109))|121|114|115|116|117) */
        /* JADX WARN: Code restructure failed: missing block: B:119:0x0131, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:120:0x0132, code lost:
        
            android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
         */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:158:0x0032 */
        /* JADX WARN: Removed duplicated region for block: B:161:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r14v23, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r14v24, types: [long[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r14v25, types: [androidx.exifinterface.media.ExifInterface$Rational[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r14v26, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r14v27, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r14v28, types: [androidx.exifinterface.media.ExifInterface$Rational[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r14v29, types: [double[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r14v30, types: [double[], java.io.Serializable] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.io.Serializable g(java.nio.ByteOrder r14) {
            /*
                Method dump skipped, instructions count: 416
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.ExifAttribute.g(java.nio.ByteOrder):java.io.Serializable");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(ExifInterface.D[this.f19641a]);
            sb.append(", data length:");
            return a.n(sb, this.d.length, ")");
        }

        public ExifAttribute(long j2, byte[] bArr, int i2, int i3) {
            this.f19641a = i2;
            this.f19642b = i3;
            this.f19643c = j2;
            this.d = bArr;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface ExifStreamType {
    }

    /* loaded from: classes2.dex */
    public static class ExifTag {

        /* renamed from: a, reason: collision with root package name */
        public final int f19644a;

        /* renamed from: b, reason: collision with root package name */
        public final String f19645b;

        /* renamed from: c, reason: collision with root package name */
        public final int f19646c;
        public final int d;

        public ExifTag(String str, int i2, int i3) {
            this.f19645b = str;
            this.f19644a = i2;
            this.f19646c = i3;
            this.d = -1;
        }

        public ExifTag(int i2, int i3, int i4, String str) {
            this.f19645b = str;
            this.f19644a = i2;
            this.f19646c = i3;
            this.d = i4;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface IfdType {
    }

    /* loaded from: classes2.dex */
    public static class Rational {

        /* renamed from: a, reason: collision with root package name */
        public final long f19647a;

        /* renamed from: b, reason: collision with root package name */
        public final long f19648b;

        public Rational(long j2, long j3) {
            if (j3 == 0) {
                this.f19647a = 0L;
                this.f19648b = 1L;
            } else {
                this.f19647a = j2;
                this.f19648b = j3;
            }
        }

        public final String toString() {
            return this.f19647a + RemoteSettings.FORWARD_SLASH_STRING + this.f19648b;
        }
    }

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        D = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        E = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        F = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        ExifTag[] exifTagArr = {new ExifTag("NewSubfileType", 254, 4), new ExifTag("SubfileType", 255, 4), new ExifTag(256, 3, 4, "ImageWidth"), new ExifTag(257, 3, 4, "ImageLength"), new ExifTag("BitsPerSample", 258, 3), new ExifTag("Compression", 259, 3), new ExifTag("PhotometricInterpretation", 262, 3), new ExifTag("ImageDescription", 270, 2), new ExifTag("Make", 271, 2), new ExifTag("Model", 272, 2), new ExifTag(273, 3, 4, "StripOffsets"), new ExifTag("Orientation", 274, 3), new ExifTag("SamplesPerPixel", 277, 3), new ExifTag(278, 3, 4, "RowsPerStrip"), new ExifTag(279, 3, 4, "StripByteCounts"), new ExifTag("XResolution", 282, 5), new ExifTag("YResolution", 283, 5), new ExifTag("PlanarConfiguration", 284, 3), new ExifTag("ResolutionUnit", 296, 3), new ExifTag("TransferFunction", 301, 3), new ExifTag("Software", 305, 2), new ExifTag("DateTime", 306, 2), new ExifTag("Artist", 315, 2), new ExifTag("WhitePoint", 318, 5), new ExifTag("PrimaryChromaticities", 319, 5), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("JPEGInterchangeFormat", 513, 4), new ExifTag("JPEGInterchangeFormatLength", 514, 4), new ExifTag("YCbCrCoefficients", 529, 5), new ExifTag("YCbCrSubSampling", 530, 3), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("ReferenceBlackWhite", 532, 5), new ExifTag("Copyright", 33432, 2), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("SensorTopBorder", 4, 4), new ExifTag("SensorLeftBorder", 5, 4), new ExifTag("SensorBottomBorder", 6, 4), new ExifTag("SensorRightBorder", 7, 4), new ExifTag("ISO", 23, 3), new ExifTag("JpgFromRaw", 46, 7), new ExifTag("Xmp", 700, 1)};
        ExifTag[] exifTagArr2 = {new ExifTag("ExposureTime", 33434, 5), new ExifTag("FNumber", 33437, 5), new ExifTag("ExposureProgram", 34850, 3), new ExifTag("SpectralSensitivity", 34852, 2), new ExifTag("PhotographicSensitivity", 34855, 3), new ExifTag("OECF", 34856, 7), new ExifTag("SensitivityType", 34864, 3), new ExifTag("StandardOutputSensitivity", 34865, 4), new ExifTag("RecommendedExposureIndex", 34866, 4), new ExifTag("ISOSpeed", 34867, 4), new ExifTag("ISOSpeedLatitudeyyy", 34868, 4), new ExifTag("ISOSpeedLatitudezzz", 34869, 4), new ExifTag("ExifVersion", 36864, 2), new ExifTag("DateTimeOriginal", 36867, 2), new ExifTag("DateTimeDigitized", 36868, 2), new ExifTag("OffsetTime", 36880, 2), new ExifTag("OffsetTimeOriginal", 36881, 2), new ExifTag("OffsetTimeDigitized", 36882, 2), new ExifTag("ComponentsConfiguration", 37121, 7), new ExifTag("CompressedBitsPerPixel", 37122, 5), new ExifTag("ShutterSpeedValue", 37377, 10), new ExifTag("ApertureValue", 37378, 5), new ExifTag("BrightnessValue", 37379, 10), new ExifTag("ExposureBiasValue", 37380, 10), new ExifTag("MaxApertureValue", 37381, 5), new ExifTag("SubjectDistance", 37382, 5), new ExifTag("MeteringMode", 37383, 3), new ExifTag("LightSource", 37384, 3), new ExifTag("Flash", 37385, 3), new ExifTag("FocalLength", 37386, 5), new ExifTag("SubjectArea", 37396, 3), new ExifTag("MakerNote", 37500, 7), new ExifTag("UserComment", 37510, 7), new ExifTag("SubSecTime", 37520, 2), new ExifTag("SubSecTimeOriginal", 37521, 2), new ExifTag("SubSecTimeDigitized", 37522, 2), new ExifTag("FlashpixVersion", 40960, 7), new ExifTag("ColorSpace", 40961, 3), new ExifTag(40962, 3, 4, "PixelXDimension"), new ExifTag(40963, 3, 4, "PixelYDimension"), new ExifTag("RelatedSoundFile", 40964, 2), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("FlashEnergy", 41483, 5), new ExifTag("SpatialFrequencyResponse", 41484, 7), new ExifTag("FocalPlaneXResolution", 41486, 5), new ExifTag("FocalPlaneYResolution", 41487, 5), new ExifTag("FocalPlaneResolutionUnit", 41488, 3), new ExifTag("SubjectLocation", 41492, 3), new ExifTag("ExposureIndex", 41493, 5), new ExifTag("SensingMethod", 41495, 3), new ExifTag("FileSource", 41728, 7), new ExifTag("SceneType", 41729, 7), new ExifTag("CFAPattern", 41730, 7), new ExifTag("CustomRendered", 41985, 3), new ExifTag("ExposureMode", 41986, 3), new ExifTag("WhiteBalance", 41987, 3), new ExifTag("DigitalZoomRatio", 41988, 5), new ExifTag("FocalLengthIn35mmFilm", 41989, 3), new ExifTag("SceneCaptureType", 41990, 3), new ExifTag("GainControl", 41991, 3), new ExifTag("Contrast", 41992, 3), new ExifTag("Saturation", 41993, 3), new ExifTag("Sharpness", 41994, 3), new ExifTag("DeviceSettingDescription", 41995, 7), new ExifTag("SubjectDistanceRange", 41996, 3), new ExifTag("ImageUniqueID", 42016, 2), new ExifTag("CameraOwnerName", 42032, 2), new ExifTag("BodySerialNumber", 42033, 2), new ExifTag("LensSpecification", 42034, 5), new ExifTag("LensMake", 42035, 2), new ExifTag("LensModel", 42036, 2), new ExifTag("Gamma", 42240, 5), new ExifTag("DNGVersion", 50706, 1), new ExifTag(50720, 3, 4, "DefaultCropSize")};
        ExifTag[] exifTagArr3 = {new ExifTag("GPSVersionID", 0, 1), new ExifTag("GPSLatitudeRef", 1, 2), new ExifTag(2, 5, 10, "GPSLatitude"), new ExifTag("GPSLongitudeRef", 3, 2), new ExifTag(4, 5, 10, "GPSLongitude"), new ExifTag("GPSAltitudeRef", 5, 1), new ExifTag("GPSAltitude", 6, 5), new ExifTag("GPSTimeStamp", 7, 5), new ExifTag("GPSSatellites", 8, 2), new ExifTag("GPSStatus", 9, 2), new ExifTag("GPSMeasureMode", 10, 2), new ExifTag("GPSDOP", 11, 5), new ExifTag("GPSSpeedRef", 12, 2), new ExifTag("GPSSpeed", 13, 5), new ExifTag("GPSTrackRef", 14, 2), new ExifTag("GPSTrack", 15, 5), new ExifTag("GPSImgDirectionRef", 16, 2), new ExifTag("GPSImgDirection", 17, 5), new ExifTag("GPSMapDatum", 18, 2), new ExifTag("GPSDestLatitudeRef", 19, 2), new ExifTag("GPSDestLatitude", 20, 5), new ExifTag("GPSDestLongitudeRef", 21, 2), new ExifTag("GPSDestLongitude", 22, 5), new ExifTag("GPSDestBearingRef", 23, 2), new ExifTag("GPSDestBearing", 24, 5), new ExifTag("GPSDestDistanceRef", 25, 2), new ExifTag("GPSDestDistance", 26, 5), new ExifTag("GPSProcessingMethod", 27, 7), new ExifTag("GPSAreaInformation", 28, 7), new ExifTag("GPSDateStamp", 29, 2), new ExifTag("GPSDifferential", 30, 3), new ExifTag("GPSHPositioningError", 31, 5)};
        ExifTag[] exifTagArr4 = {new ExifTag("InteroperabilityIndex", 1, 2)};
        ExifTag[] exifTagArr5 = {new ExifTag("NewSubfileType", 254, 4), new ExifTag("SubfileType", 255, 4), new ExifTag(256, 3, 4, "ThumbnailImageWidth"), new ExifTag(257, 3, 4, "ThumbnailImageLength"), new ExifTag("BitsPerSample", 258, 3), new ExifTag("Compression", 259, 3), new ExifTag("PhotometricInterpretation", 262, 3), new ExifTag("ImageDescription", 270, 2), new ExifTag("Make", 271, 2), new ExifTag("Model", 272, 2), new ExifTag(273, 3, 4, "StripOffsets"), new ExifTag("ThumbnailOrientation", 274, 3), new ExifTag("SamplesPerPixel", 277, 3), new ExifTag(278, 3, 4, "RowsPerStrip"), new ExifTag(279, 3, 4, "StripByteCounts"), new ExifTag("XResolution", 282, 5), new ExifTag("YResolution", 283, 5), new ExifTag("PlanarConfiguration", 284, 3), new ExifTag("ResolutionUnit", 296, 3), new ExifTag("TransferFunction", 301, 3), new ExifTag("Software", 305, 2), new ExifTag("DateTime", 306, 2), new ExifTag("Artist", 315, 2), new ExifTag("WhitePoint", 318, 5), new ExifTag("PrimaryChromaticities", 319, 5), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("JPEGInterchangeFormat", 513, 4), new ExifTag("JPEGInterchangeFormatLength", 514, 4), new ExifTag("YCbCrCoefficients", 529, 5), new ExifTag("YCbCrSubSampling", 530, 3), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("ReferenceBlackWhite", 532, 5), new ExifTag("Copyright", 33432, 2), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("DNGVersion", 50706, 1), new ExifTag(50720, 3, 4, "DefaultCropSize")};
        G = new ExifTag("StripOffsets", 273, 3);
        H = new ExifTag[][]{exifTagArr, exifTagArr2, exifTagArr3, exifTagArr4, exifTagArr5, exifTagArr, new ExifTag[]{new ExifTag("ThumbnailImage", 256, 7), new ExifTag("CameraSettingsIFDPointer", 8224, 4), new ExifTag("ImageProcessingIFDPointer", 8256, 4)}, new ExifTag[]{new ExifTag("PreviewImageStart", 257, 4), new ExifTag("PreviewImageLength", 258, 4)}, new ExifTag[]{new ExifTag("AspectFrame", 4371, 3)}, new ExifTag[]{new ExifTag("ColorSpace", 55, 3)}};
        I = new ExifTag[]{new ExifTag("SubIFDPointer", 330, 4), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("CameraSettingsIFDPointer", 8224, 1), new ExifTag("ImageProcessingIFDPointer", 8256, 1)};
        J = new HashMap[10];
        K = new HashMap[10];
        L = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        M = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        N = forName;
        O = "Exif\u0000\u0000".getBytes(forName);
        P = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            ExifTag[][] exifTagArr6 = H;
            if (i2 >= exifTagArr6.length) {
                HashMap hashMap = M;
                ExifTag[] exifTagArr7 = I;
                hashMap.put(Integer.valueOf(exifTagArr7[0].f19644a), 5);
                hashMap.put(Integer.valueOf(exifTagArr7[1].f19644a), 1);
                hashMap.put(Integer.valueOf(exifTagArr7[2].f19644a), 2);
                hashMap.put(Integer.valueOf(exifTagArr7[3].f19644a), 3);
                hashMap.put(Integer.valueOf(exifTagArr7[4].f19644a), 7);
                hashMap.put(Integer.valueOf(exifTagArr7[5].f19644a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            J[i2] = new HashMap();
            K[i2] = new HashMap();
            for (ExifTag exifTag : exifTagArr6[i2]) {
                J[i2].put(Integer.valueOf(exifTag.f19644a), exifTag);
                K[i2].put(exifTag.f19645b, exifTag);
            }
            i2++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ed A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005e, blocks: (B:6:0x004f, B:8:0x0052, B:10:0x0067, B:16:0x0084, B:18:0x008f, B:19:0x00a5, B:28:0x0096, B:31:0x009e, B:32:0x00a2, B:33:0x00af, B:35:0x00b8, B:37:0x00be, B:39:0x00c4, B:41:0x00ca, B:51:0x00d8), top: B:5:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ExifInterface(h.l r10) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.<init>(h.l):void");
    }

    public static ByteOrder r(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        short readShort = byteOrderedDataInputStream.readShort();
        boolean z2 = f19613l;
        if (readShort == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void a() {
        String b2 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.d;
        if (b2 != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b2.concat("\u0000").getBytes(N);
            hashMap.put("DateTime", new ExifAttribute(2, bytes, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", ExifAttribute.a(0L, this.f19629f));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", ExifAttribute.a(0L, this.f19629f));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", ExifAttribute.a(0L, this.f19629f));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", ExifAttribute.a(0L, this.f19629f));
        }
    }

    public final String b(String str) {
        ExifAttribute d = d(str);
        if (d != null) {
            if (!L.contains(str)) {
                return d.f(this.f19629f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i2 = d.f19641a;
                if (i2 != 5 && i2 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i2);
                    return null;
                }
                Rational[] rationalArr = (Rational[]) d.g(this.f19629f);
                if (rationalArr == null || rationalArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(rationalArr));
                    return null;
                }
                Rational rational = rationalArr[0];
                Integer valueOf = Integer.valueOf((int) (((float) rational.f19647a) / ((float) rational.f19648b)));
                Rational rational2 = rationalArr[1];
                Integer valueOf2 = Integer.valueOf((int) (((float) rational2.f19647a) / ((float) rational2.f19648b)));
                Rational rational3 = rationalArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) rational3.f19647a) / ((float) rational3.f19648b))));
            }
            try {
                return Double.toString(d.d(this.f19629f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int c() {
        ExifAttribute d = d("Orientation");
        if (d == null) {
            return 1;
        }
        try {
            return d.e(this.f19629f);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public final ExifAttribute d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f19613l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i2 = 0; i2 < H.length; i2++) {
            ExifAttribute exifAttribute = (ExifAttribute) this.d[i2].get(str);
            if (exifAttribute != null) {
                return exifAttribute;
            }
        }
        return null;
    }

    public final void e(final SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                ExifInterfaceUtils.Api23Impl.a(mediaMetadataRetriever, new MediaDataSource() { // from class: androidx.exifinterface.media.ExifInterface.1

                    /* renamed from: a, reason: collision with root package name */
                    public long f19635a;

                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                    }

                    @Override // android.media.MediaDataSource
                    public final long getSize() {
                        return -1L;
                    }

                    @Override // android.media.MediaDataSource
                    public final int readAt(long j2, byte[] bArr, int i2, int i3) {
                        if (i3 == 0) {
                            return 0;
                        }
                        if (j2 < 0) {
                            return -1;
                        }
                        try {
                            long j3 = this.f19635a;
                            SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = SeekableByteOrderedDataInputStream.this;
                            if (j3 != j2) {
                                if (j3 >= 0 && j2 >= j3 + seekableByteOrderedDataInputStream2.available()) {
                                    return -1;
                                }
                                seekableByteOrderedDataInputStream2.c(j2);
                                this.f19635a = j2;
                            }
                            if (i3 > seekableByteOrderedDataInputStream2.available()) {
                                i3 = seekableByteOrderedDataInputStream2.available();
                            }
                            int read = seekableByteOrderedDataInputStream2.read(bArr, i2, i3);
                            if (read >= 0) {
                                this.f19635a += read;
                                return read;
                            }
                        } catch (IOException unused) {
                        }
                        this.f19635a = -1L;
                        return -1;
                    }
                });
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap[] hashMapArr = this.d;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", ExifAttribute.c(Integer.parseInt(str), this.f19629f));
                }
                if (str2 != null) {
                    hashMapArr[0].put("ImageLength", ExifAttribute.c(Integer.parseInt(str2), this.f19629f));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    hashMapArr[0].put("Orientation", ExifAttribute.c(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f19629f));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    seekableByteOrderedDataInputStream.c(parseInt2);
                    byte[] bArr = new byte[6];
                    seekableByteOrderedDataInputStream.readFully(bArr);
                    int i2 = parseInt2 + 6;
                    int i3 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, O)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i3];
                    seekableByteOrderedDataInputStream.readFully(bArr2);
                    this.f19631h = i2;
                    s(0, bArr2);
                }
                if (f19613l) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x009e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x00a1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x00a4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0182 A[LOOP:0: B:9:0x0034->B:32:0x0182, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.f(androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream, int, int):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:(2:15|16)|(3:17|18|(6:99|(2:101|(1:103))(1:137)|104|(1:106)|107|(1:109)(3:110|(7:114|115|116|(3:118|(1:120)(2:129|(1:131))|(3:123|124|125))(1:132)|127|111|112)|135)))|20|(2:21|22)|(6:23|24|25|(1:85)(1:29)|30|(1:32))|34|35|36|37|38|(1:40)(1:71)|41|(1:43)|44|(2:45|(2:47|(4:50|51|(2:52|(2:54|(1:57)(1:56))(3:59|60|(2:61|(2:63|(1:66)(1:65))(2:67|68))))|58)(1:49))(2:69|70))) */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x00bb, code lost:
    
        if (r8 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0118, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0125, code lost:
    
        if (r6 != null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0127, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0115, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0116, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x011f, code lost:
    
        if (r6 != null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0121, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0124, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x011d, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x011a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x011b, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010c  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.g(java.io.BufferedInputStream):int");
    }

    public final void h(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) {
        int i2;
        int i3;
        k(seekableByteOrderedDataInputStream);
        HashMap[] hashMapArr = this.d;
        ExifAttribute exifAttribute = (ExifAttribute) hashMapArr[1].get("MakerNote");
        if (exifAttribute != null) {
            SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new SeekableByteOrderedDataInputStream(exifAttribute.d);
            seekableByteOrderedDataInputStream2.f19639c = this.f19629f;
            byte[] bArr = f19622u;
            byte[] bArr2 = new byte[bArr.length];
            seekableByteOrderedDataInputStream2.readFully(bArr2);
            seekableByteOrderedDataInputStream2.c(0L);
            byte[] bArr3 = f19623v;
            byte[] bArr4 = new byte[bArr3.length];
            seekableByteOrderedDataInputStream2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                seekableByteOrderedDataInputStream2.c(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                seekableByteOrderedDataInputStream2.c(12L);
            }
            t(seekableByteOrderedDataInputStream2, 6);
            ExifAttribute exifAttribute2 = (ExifAttribute) hashMapArr[7].get("PreviewImageStart");
            ExifAttribute exifAttribute3 = (ExifAttribute) hashMapArr[7].get("PreviewImageLength");
            if (exifAttribute2 != null && exifAttribute3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", exifAttribute2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", exifAttribute3);
            }
            ExifAttribute exifAttribute4 = (ExifAttribute) hashMapArr[8].get("AspectFrame");
            if (exifAttribute4 != null) {
                int[] iArr = (int[]) exifAttribute4.g(this.f19629f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i4 = iArr[2];
                int i5 = iArr[0];
                if (i4 <= i5 || (i2 = iArr[3]) <= (i3 = iArr[1])) {
                    return;
                }
                int i6 = (i4 - i5) + 1;
                int i7 = (i2 - i3) + 1;
                if (i6 < i7) {
                    int i8 = i6 + i7;
                    i7 = i8 - i7;
                    i6 = i8 - i7;
                }
                ExifAttribute c2 = ExifAttribute.c(i6, this.f19629f);
                ExifAttribute c3 = ExifAttribute.c(i7, this.f19629f);
                hashMapArr[0].put("ImageWidth", c2);
                hashMapArr[0].put("ImageLength", c3);
            }
        }
    }

    public final void i(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        if (f19613l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.f19639c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = w;
        byteOrderedDataInputStream.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = byteOrderedDataInputStream.readInt();
                byte[] bArr2 = new byte[4];
                byteOrderedDataInputStream.readFully(bArr2);
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, f19624y)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f19625z)) {
                    return;
                }
                if (Arrays.equals(bArr2, x)) {
                    byte[] bArr3 = new byte[readInt];
                    byteOrderedDataInputStream.readFully(bArr3);
                    int readInt2 = byteOrderedDataInputStream.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f19631h = i2;
                        s(0, bArr3);
                        y();
                        v(new ByteOrderedDataInputStream(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i3 = readInt + 4;
                byteOrderedDataInputStream.a(i3);
                length = i2 + i3;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void j(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        boolean z2 = f19613l;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        byteOrderedDataInputStream.readFully(bArr);
        byteOrderedDataInputStream.readFully(bArr2);
        byteOrderedDataInputStream.readFully(bArr3);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        int i4 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i3];
        byteOrderedDataInputStream.a(i2 - byteOrderedDataInputStream.f19638b);
        byteOrderedDataInputStream.readFully(bArr4);
        f(new ByteOrderedDataInputStream(bArr4), i2, 5);
        byteOrderedDataInputStream.a(i4 - byteOrderedDataInputStream.f19638b);
        byteOrderedDataInputStream.f19639c = ByteOrder.BIG_ENDIAN;
        int readInt = byteOrderedDataInputStream.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i5 = 0; i5 < readInt; i5++) {
            int readUnsignedShort = byteOrderedDataInputStream.readUnsignedShort();
            int readUnsignedShort2 = byteOrderedDataInputStream.readUnsignedShort();
            if (readUnsignedShort == G.f19644a) {
                short readShort = byteOrderedDataInputStream.readShort();
                short readShort2 = byteOrderedDataInputStream.readShort();
                ExifAttribute c2 = ExifAttribute.c(readShort, this.f19629f);
                ExifAttribute c3 = ExifAttribute.c(readShort2, this.f19629f);
                HashMap[] hashMapArr = this.d;
                hashMapArr[0].put("ImageLength", c2);
                hashMapArr[0].put("ImageWidth", c3);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            byteOrderedDataInputStream.a(readUnsignedShort2);
        }
    }

    public final void k(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) {
        p(seekableByteOrderedDataInputStream);
        t(seekableByteOrderedDataInputStream, 0);
        x(seekableByteOrderedDataInputStream, 0);
        x(seekableByteOrderedDataInputStream, 5);
        x(seekableByteOrderedDataInputStream, 4);
        y();
        if (this.f19628c == 8) {
            HashMap[] hashMapArr = this.d;
            ExifAttribute exifAttribute = (ExifAttribute) hashMapArr[1].get("MakerNote");
            if (exifAttribute != null) {
                SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new SeekableByteOrderedDataInputStream(exifAttribute.d);
                seekableByteOrderedDataInputStream2.f19639c = this.f19629f;
                seekableByteOrderedDataInputStream2.a(6);
                t(seekableByteOrderedDataInputStream2, 9);
                ExifAttribute exifAttribute2 = (ExifAttribute) hashMapArr[9].get("ColorSpace");
                if (exifAttribute2 != null) {
                    hashMapArr[1].put("ColorSpace", exifAttribute2);
                }
            }
        }
    }

    public final void l(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) {
        if (f19613l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + seekableByteOrderedDataInputStream);
        }
        k(seekableByteOrderedDataInputStream);
        HashMap[] hashMapArr = this.d;
        ExifAttribute exifAttribute = (ExifAttribute) hashMapArr[0].get("JpgFromRaw");
        if (exifAttribute != null) {
            f(new ByteOrderedDataInputStream(exifAttribute.d), (int) exifAttribute.f19643c, 5);
        }
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMapArr[0].get("ISO");
        ExifAttribute exifAttribute3 = (ExifAttribute) hashMapArr[1].get("PhotographicSensitivity");
        if (exifAttribute2 == null || exifAttribute3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", exifAttribute2);
    }

    public final void m(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        if (f19613l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.f19639c = ByteOrder.LITTLE_ENDIAN;
        byteOrderedDataInputStream.a(A.length);
        int readInt = byteOrderedDataInputStream.readInt() + 8;
        byte[] bArr = B;
        byteOrderedDataInputStream.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                byteOrderedDataInputStream.readFully(bArr2);
                int readInt2 = byteOrderedDataInputStream.readInt();
                int i2 = length + 8;
                if (Arrays.equals(C, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    byteOrderedDataInputStream.readFully(bArr3);
                    this.f19631h = i2;
                    s(0, bArr3);
                    v(new ByteOrderedDataInputStream(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i2 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                byteOrderedDataInputStream.a(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void n(ByteOrderedDataInputStream byteOrderedDataInputStream, HashMap hashMap) {
        ExifAttribute exifAttribute = (ExifAttribute) hashMap.get("JPEGInterchangeFormat");
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMap.get("JPEGInterchangeFormatLength");
        if (exifAttribute == null || exifAttribute2 == null) {
            return;
        }
        int e = exifAttribute.e(this.f19629f);
        int e2 = exifAttribute2.e(this.f19629f);
        if (this.f19628c == 7) {
            e += this.f19632i;
        }
        if (e > 0 && e2 > 0 && this.f19627b == null && this.f19626a == null) {
            byteOrderedDataInputStream.a(e);
            byteOrderedDataInputStream.readFully(new byte[e2]);
        }
        if (f19613l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e + ", length: " + e2);
        }
    }

    public final boolean o(HashMap hashMap) {
        ExifAttribute exifAttribute = (ExifAttribute) hashMap.get("ImageLength");
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMap.get("ImageWidth");
        if (exifAttribute == null || exifAttribute2 == null) {
            return false;
        }
        return exifAttribute.e(this.f19629f) <= 512 && exifAttribute2.e(this.f19629f) <= 512;
    }

    public final void p(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        ByteOrder r2 = r(byteOrderedDataInputStream);
        this.f19629f = r2;
        byteOrderedDataInputStream.f19639c = r2;
        int readUnsignedShort = byteOrderedDataInputStream.readUnsignedShort();
        int i2 = this.f19628c;
        if (i2 != 7 && i2 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = byteOrderedDataInputStream.readInt();
        if (readInt < 8) {
            throw new IOException(d.i("Invalid first Ifd offset: ", readInt));
        }
        int i3 = readInt - 8;
        if (i3 > 0) {
            byteOrderedDataInputStream.a(i3);
        }
    }

    public final void q() {
        int i2 = 0;
        while (true) {
            HashMap[] hashMapArr = this.d;
            if (i2 >= hashMapArr.length) {
                return;
            }
            StringBuilder t2 = d.t("The size of tag group[", i2, "]: ");
            t2.append(hashMapArr[i2].size());
            Log.d("ExifInterface", t2.toString());
            for (Map.Entry entry : hashMapArr[i2].entrySet()) {
                ExifAttribute exifAttribute = (ExifAttribute) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + exifAttribute.toString() + ", tagValue: '" + exifAttribute.f(this.f19629f) + "'");
            }
            i2++;
        }
    }

    public final void s(int i2, byte[] bArr) {
        SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream = new SeekableByteOrderedDataInputStream(bArr);
        p(seekableByteOrderedDataInputStream);
        t(seekableByteOrderedDataInputStream, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream r33, int r34) {
        /*
            Method dump skipped, instructions count: 959
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.t(androidx.exifinterface.media.ExifInterface$SeekableByteOrderedDataInputStream, int):void");
    }

    public final void u(int i2, String str, String str2) {
        HashMap[] hashMapArr = this.d;
        if (hashMapArr[i2].isEmpty() || hashMapArr[i2].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i2];
        hashMap.put(str2, hashMap.get(str));
        hashMapArr[i2].remove(str);
    }

    public final void v(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        ExifAttribute exifAttribute;
        int e;
        HashMap hashMap = this.d[4];
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMap.get("Compression");
        if (exifAttribute2 == null) {
            n(byteOrderedDataInputStream, hashMap);
            return;
        }
        int e2 = exifAttribute2.e(this.f19629f);
        if (e2 != 1) {
            if (e2 == 6) {
                n(byteOrderedDataInputStream, hashMap);
                return;
            } else if (e2 != 7) {
                return;
            }
        }
        ExifAttribute exifAttribute3 = (ExifAttribute) hashMap.get("BitsPerSample");
        if (exifAttribute3 != null) {
            int[] iArr = (int[]) exifAttribute3.g(this.f19629f);
            int[] iArr2 = f19616o;
            if (Arrays.equals(iArr2, iArr) || (this.f19628c == 3 && (exifAttribute = (ExifAttribute) hashMap.get("PhotometricInterpretation")) != null && (((e = exifAttribute.e(this.f19629f)) == 1 && Arrays.equals(iArr, f19617p)) || (e == 6 && Arrays.equals(iArr, iArr2))))) {
                ExifAttribute exifAttribute4 = (ExifAttribute) hashMap.get("StripOffsets");
                ExifAttribute exifAttribute5 = (ExifAttribute) hashMap.get("StripByteCounts");
                if (exifAttribute4 == null || exifAttribute5 == null) {
                    return;
                }
                long[] a2 = ExifInterfaceUtils.a(exifAttribute4.g(this.f19629f));
                long[] a3 = ExifInterfaceUtils.a(exifAttribute5.g(this.f19629f));
                if (a2 == null || a2.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (a3 == null || a3.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (a2.length != a3.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j2 = 0;
                for (long j3 : a3) {
                    j2 += j3;
                }
                byte[] bArr = new byte[(int) j2];
                this.f19630g = true;
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < a2.length; i4++) {
                    int i5 = (int) a2[i4];
                    int i6 = (int) a3[i4];
                    if (i4 < a2.length - 1 && i5 + i6 != a2[i4 + 1]) {
                        this.f19630g = false;
                    }
                    int i7 = i5 - i2;
                    if (i7 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        byteOrderedDataInputStream.a(i7);
                        int i8 = i2 + i7;
                        byte[] bArr2 = new byte[i6];
                        try {
                            byteOrderedDataInputStream.readFully(bArr2);
                            i2 = i8 + i6;
                            System.arraycopy(bArr2, 0, bArr, i3, i6);
                            i3 += i6;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i6 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i7 + " bytes.");
                        return;
                    }
                }
                if (this.f19630g) {
                    long j4 = a2[0];
                    return;
                }
                return;
            }
        }
        if (f19613l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void w(int i2, int i3) {
        HashMap[] hashMapArr = this.d;
        boolean isEmpty = hashMapArr[i2].isEmpty();
        boolean z2 = f19613l;
        if (isEmpty || hashMapArr[i3].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        ExifAttribute exifAttribute = (ExifAttribute) hashMapArr[i2].get("ImageLength");
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMapArr[i2].get("ImageWidth");
        ExifAttribute exifAttribute3 = (ExifAttribute) hashMapArr[i3].get("ImageLength");
        ExifAttribute exifAttribute4 = (ExifAttribute) hashMapArr[i3].get("ImageWidth");
        if (exifAttribute == null || exifAttribute2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (exifAttribute3 == null || exifAttribute4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int e = exifAttribute.e(this.f19629f);
        int e2 = exifAttribute2.e(this.f19629f);
        int e3 = exifAttribute3.e(this.f19629f);
        int e4 = exifAttribute4.e(this.f19629f);
        if (e >= e3 || e2 >= e4) {
            return;
        }
        HashMap hashMap = hashMapArr[i2];
        hashMapArr[i2] = hashMapArr[i3];
        hashMapArr[i3] = hashMap;
    }

    public final void x(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i2) {
        ExifAttribute c2;
        ExifAttribute c3;
        HashMap[] hashMapArr = this.d;
        ExifAttribute exifAttribute = (ExifAttribute) hashMapArr[i2].get("DefaultCropSize");
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMapArr[i2].get("SensorTopBorder");
        ExifAttribute exifAttribute3 = (ExifAttribute) hashMapArr[i2].get("SensorLeftBorder");
        ExifAttribute exifAttribute4 = (ExifAttribute) hashMapArr[i2].get("SensorBottomBorder");
        ExifAttribute exifAttribute5 = (ExifAttribute) hashMapArr[i2].get("SensorRightBorder");
        if (exifAttribute != null) {
            if (exifAttribute.f19641a == 5) {
                Rational[] rationalArr = (Rational[]) exifAttribute.g(this.f19629f);
                if (rationalArr == null || rationalArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(rationalArr));
                    return;
                }
                c2 = ExifAttribute.b(rationalArr[0], this.f19629f);
                c3 = ExifAttribute.b(rationalArr[1], this.f19629f);
            } else {
                int[] iArr = (int[]) exifAttribute.g(this.f19629f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c2 = ExifAttribute.c(iArr[0], this.f19629f);
                c3 = ExifAttribute.c(iArr[1], this.f19629f);
            }
            hashMapArr[i2].put("ImageWidth", c2);
            hashMapArr[i2].put("ImageLength", c3);
            return;
        }
        if (exifAttribute2 != null && exifAttribute3 != null && exifAttribute4 != null && exifAttribute5 != null) {
            int e = exifAttribute2.e(this.f19629f);
            int e2 = exifAttribute4.e(this.f19629f);
            int e3 = exifAttribute5.e(this.f19629f);
            int e4 = exifAttribute3.e(this.f19629f);
            if (e2 <= e || e3 <= e4) {
                return;
            }
            ExifAttribute c4 = ExifAttribute.c(e2 - e, this.f19629f);
            ExifAttribute c5 = ExifAttribute.c(e3 - e4, this.f19629f);
            hashMapArr[i2].put("ImageLength", c4);
            hashMapArr[i2].put("ImageWidth", c5);
            return;
        }
        ExifAttribute exifAttribute6 = (ExifAttribute) hashMapArr[i2].get("ImageLength");
        ExifAttribute exifAttribute7 = (ExifAttribute) hashMapArr[i2].get("ImageWidth");
        if (exifAttribute6 == null || exifAttribute7 == null) {
            ExifAttribute exifAttribute8 = (ExifAttribute) hashMapArr[i2].get("JPEGInterchangeFormat");
            ExifAttribute exifAttribute9 = (ExifAttribute) hashMapArr[i2].get("JPEGInterchangeFormatLength");
            if (exifAttribute8 == null || exifAttribute9 == null) {
                return;
            }
            int e5 = exifAttribute8.e(this.f19629f);
            int e6 = exifAttribute8.e(this.f19629f);
            seekableByteOrderedDataInputStream.c(e5);
            byte[] bArr = new byte[e6];
            seekableByteOrderedDataInputStream.readFully(bArr);
            f(new ByteOrderedDataInputStream(bArr), e5, i2);
        }
    }

    public final void y() {
        w(0, 5);
        w(0, 4);
        w(5, 4);
        HashMap[] hashMapArr = this.d;
        ExifAttribute exifAttribute = (ExifAttribute) hashMapArr[1].get("PixelXDimension");
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMapArr[1].get("PixelYDimension");
        if (exifAttribute != null && exifAttribute2 != null) {
            hashMapArr[0].put("ImageWidth", exifAttribute);
            hashMapArr[0].put("ImageLength", exifAttribute2);
        }
        if (hashMapArr[4].isEmpty() && o(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!o(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        u(0, "ThumbnailOrientation", "Orientation");
        u(0, "ThumbnailImageLength", "ImageLength");
        u(0, "ThumbnailImageWidth", "ImageWidth");
        u(5, "ThumbnailOrientation", "Orientation");
        u(5, "ThumbnailImageLength", "ImageLength");
        u(5, "ThumbnailImageWidth", "ImageWidth");
        u(4, "Orientation", "ThumbnailOrientation");
        u(4, "ImageLength", "ThumbnailImageLength");
        u(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* loaded from: classes2.dex */
    public static class SeekableByteOrderedDataInputStream extends ByteOrderedDataInputStream {
        public SeekableByteOrderedDataInputStream(byte[] bArr) {
            super(bArr);
            this.f19637a.mark(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }

        public final void c(long j2) {
            int i2 = this.f19638b;
            if (i2 > j2) {
                this.f19638b = 0;
                this.f19637a.reset();
            } else {
                j2 -= i2;
            }
            a((int) j2);
        }

        public SeekableByteOrderedDataInputStream(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f19637a.mark(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }
}
