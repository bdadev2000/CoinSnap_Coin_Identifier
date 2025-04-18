package f1;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* renamed from: g, reason: collision with root package name */
    public static final ByteOrder f17548g = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: h, reason: collision with root package name */
    public static final ByteOrder f17549h = ByteOrder.BIG_ENDIAN;

    /* renamed from: b, reason: collision with root package name */
    public final DataInputStream f17550b;

    /* renamed from: c, reason: collision with root package name */
    public ByteOrder f17551c;

    /* renamed from: d, reason: collision with root package name */
    public int f17552d;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f17553f;

    public b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f17550b.available();
    }

    public final void d(int i10) {
        int i11 = 0;
        while (i11 < i10) {
            DataInputStream dataInputStream = this.f17550b;
            int i12 = i10 - i11;
            int skip = (int) dataInputStream.skip(i12);
            if (skip <= 0) {
                if (this.f17553f == null) {
                    this.f17553f = new byte[8192];
                }
                skip = dataInputStream.read(this.f17553f, 0, Math.min(8192, i12));
                if (skip == -1) {
                    throw new EOFException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.i("Reached EOF while skipping ", i10, " bytes."));
                }
            }
            i11 += skip;
        }
        this.f17552d += i11;
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f17552d++;
        return this.f17550b.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f17552d++;
        return this.f17550b.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f17552d++;
        int read = this.f17550b.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f17552d += 2;
        return this.f17550b.readChar();
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
    public final void readFully(byte[] bArr, int i10, int i11) {
        this.f17552d += i11;
        this.f17550b.readFully(bArr, i10, i11);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f17552d += 4;
        DataInputStream dataInputStream = this.f17550b;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.f17551c;
            if (byteOrder == f17548g) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f17549h) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f17551c);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.f17552d += 8;
        DataInputStream dataInputStream = this.f17550b;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.f17551c;
            if (byteOrder == f17548g) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f17549h) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f17551c);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f17552d += 2;
        DataInputStream dataInputStream = this.f17550b;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f17551c;
            if (byteOrder == f17548g) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == f17549h) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f17551c);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f17552d += 2;
        return this.f17550b.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f17552d++;
        return this.f17550b.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f17552d += 2;
        DataInputStream dataInputStream = this.f17550b;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f17551c;
            if (byteOrder == f17548g) {
                return (read2 << 8) + read;
            }
            if (byteOrder == f17549h) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f17551c);
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i10) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public b(InputStream inputStream, ByteOrder byteOrder) {
        this.f17551c = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f17550b = dataInputStream;
        dataInputStream.mark(0);
        this.f17552d = 0;
        this.f17551c = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f17550b.read(bArr, i10, i11);
        this.f17552d += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f17552d += bArr.length;
        this.f17550b.readFully(bArr);
    }
}
