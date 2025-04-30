package m0;

import Q7.n0;
import android.util.Log;
import androidx.fragment.app.FragmentTransaction;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: m0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2453b extends InputStream implements DataInput {

    /* renamed from: g, reason: collision with root package name */
    public static final ByteOrder f21656g = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: h, reason: collision with root package name */
    public static final ByteOrder f21657h = ByteOrder.BIG_ENDIAN;
    public final DataInputStream b;

    /* renamed from: c, reason: collision with root package name */
    public ByteOrder f21658c;

    /* renamed from: d, reason: collision with root package name */
    public int f21659d;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f21660f;

    public C2453b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }

    public final void a(int i9) {
        int i10 = 0;
        while (i10 < i9) {
            DataInputStream dataInputStream = this.b;
            int i11 = i9 - i10;
            int skip = (int) dataInputStream.skip(i11);
            if (skip <= 0) {
                if (this.f21660f == null) {
                    this.f21660f = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
                }
                skip = dataInputStream.read(this.f21660f, 0, Math.min(FragmentTransaction.TRANSIT_EXIT_MASK, i11));
                if (skip == -1) {
                    throw new EOFException(n0.f(i9, "Reached EOF while skipping ", " bytes."));
                }
            }
            i10 += skip;
        }
        this.f21659d += i10;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.b.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i9) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f21659d++;
        return this.b.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f21659d++;
        return this.b.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f21659d++;
        int read = this.b.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f21659d += 2;
        return this.b.readChar();
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
    public final void readFully(byte[] bArr, int i9, int i10) {
        this.f21659d += i10;
        this.b.readFully(bArr, i9, i10);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f21659d += 4;
        DataInputStream dataInputStream = this.b;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.f21658c;
            if (byteOrder == f21656g) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f21657h) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f21658c);
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
        this.f21659d += 8;
        DataInputStream dataInputStream = this.b;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.f21658c;
            if (byteOrder == f21656g) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f21657h) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f21658c);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f21659d += 2;
        DataInputStream dataInputStream = this.b;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f21658c;
            if (byteOrder == f21656g) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == f21657h) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f21658c);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f21659d += 2;
        return this.b.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f21659d++;
        return this.b.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f21659d += 2;
        DataInputStream dataInputStream = this.b;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f21658c;
            if (byteOrder == f21656g) {
                return (read2 << 8) + read;
            }
            if (byteOrder == f21657h) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f21658c);
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i9) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public C2453b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public C2453b(InputStream inputStream, ByteOrder byteOrder) {
        this.f21658c = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.b = dataInputStream;
        dataInputStream.mark(0);
        this.f21659d = 0;
        this.f21658c = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) {
        int read = this.b.read(bArr, i9, i10);
        this.f21659d += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f21659d += bArr.length;
        this.b.readFully(bArr);
    }
}
