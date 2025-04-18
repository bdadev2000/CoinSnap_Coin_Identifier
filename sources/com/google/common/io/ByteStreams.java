package com.google.common.io;

import android.support.v4.media.d;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes2.dex */
public final class ByteStreams {
    private static final int BUFFER_SIZE = 8192;
    private static final int MAX_ARRAY_LEN = 2147483639;
    private static final OutputStream NULL_OUTPUT_STREAM = new OutputStream() { // from class: com.google.common.io.ByteStreams.1
        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i2) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            Preconditions.checkNotNull(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) {
            Preconditions.checkNotNull(bArr);
            Preconditions.checkPositionIndexes(i2, i3 + i2, bArr.length);
        }
    };
    private static final int TO_BYTE_ARRAY_DEQUE_SIZE = 20;
    private static final int ZERO_COPY_CHUNK_SIZE = 524288;

    /* loaded from: classes2.dex */
    public static final class LimitedInputStream extends FilterInputStream {
        private long left;
        private long mark;

        public LimitedInputStream(InputStream inputStream, long j2) {
            super(inputStream);
            this.mark = -1L;
            Preconditions.checkNotNull(inputStream);
            Preconditions.checkArgument(j2 >= 0, "limit must be non-negative");
            this.left = j2;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.left);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i2) {
            ((FilterInputStream) this).in.mark(i2);
            this.mark = this.left;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.left == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.left--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.mark == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.left = this.mark;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j2) throws IOException {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j2, this.left));
            this.left -= skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            long j2 = this.left;
            if (j2 == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i2, (int) Math.min(i3, j2));
            if (read != -1) {
                this.left -= read;
            }
            return read;
        }
    }

    private ByteStreams() {
    }

    private static byte[] combineBuffers(Queue<byte[]> queue, int i2) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i2) {
            return remove;
        }
        int length = i2 - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, i2);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, i2 - length, min);
            length -= min;
        }
        return copyOf;
    }

    @CanIgnoreReturnValue
    public static long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(outputStream);
        byte[] createBuffer = createBuffer();
        long j2 = 0;
        while (true) {
            int read = inputStream.read(createBuffer);
            if (read == -1) {
                return j2;
            }
            outputStream.write(createBuffer, 0, read);
            j2 += read;
        }
    }

    public static byte[] createBuffer() {
        return new byte[8192];
    }

    @CanIgnoreReturnValue
    @Beta
    public static long exhaust(InputStream inputStream) throws IOException {
        byte[] createBuffer = createBuffer();
        long j2 = 0;
        while (true) {
            long read = inputStream.read(createBuffer);
            if (read == -1) {
                return j2;
            }
            j2 += read;
        }
    }

    @Beta
    public static InputStream limit(InputStream inputStream, long j2) {
        return new LimitedInputStream(inputStream, j2);
    }

    @Beta
    public static ByteArrayDataInput newDataInput(byte[] bArr) {
        return newDataInput(new ByteArrayInputStream(bArr));
    }

    @Beta
    public static ByteArrayDataOutput newDataOutput() {
        return newDataOutput(new ByteArrayOutputStream());
    }

    @Beta
    public static OutputStream nullOutputStream() {
        return NULL_OUTPUT_STREAM;
    }

    @CanIgnoreReturnValue
    @Beta
    public static int read(InputStream inputStream, byte[] bArr, int i2, int i3) throws IOException {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(bArr);
        if (i3 < 0) {
            throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", Integer.valueOf(i3)));
        }
        Preconditions.checkPositionIndexes(i2, i2 + i3, bArr.length);
        int i4 = 0;
        while (i4 < i3) {
            int read = inputStream.read(bArr, i2 + i4, i3 - i4);
            if (read == -1) {
                break;
            }
            i4 += read;
        }
        return i4;
    }

    @Beta
    @CanIgnoreReturnValue
    @ParametricNullness
    public static <T> T readBytes(InputStream inputStream, ByteProcessor<T> byteProcessor) throws IOException {
        int read;
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(byteProcessor);
        byte[] createBuffer = createBuffer();
        do {
            read = inputStream.read(createBuffer);
            if (read == -1) {
                break;
            }
        } while (byteProcessor.processBytes(createBuffer, 0, read));
        return byteProcessor.getResult();
    }

    @Beta
    public static void readFully(InputStream inputStream, byte[] bArr) throws IOException {
        readFully(inputStream, bArr, 0, bArr.length);
    }

    @Beta
    public static void skipFully(InputStream inputStream, long j2) throws IOException {
        long skipUpTo = skipUpTo(inputStream, j2);
        if (skipUpTo >= j2) {
            return;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append("reached end of stream after skipping ");
        sb.append(skipUpTo);
        sb.append(" bytes; ");
        throw new EOFException(d.p(sb, j2, " bytes expected"));
    }

    private static long skipSafely(InputStream inputStream, long j2) throws IOException {
        int available = inputStream.available();
        if (available == 0) {
            return 0L;
        }
        return inputStream.skip(Math.min(available, j2));
    }

    public static long skipUpTo(InputStream inputStream, long j2) throws IOException {
        byte[] bArr = null;
        long j3 = 0;
        while (j3 < j2) {
            long j4 = j2 - j3;
            long skipSafely = skipSafely(inputStream, j4);
            if (skipSafely == 0) {
                int min = (int) Math.min(j4, 8192L);
                if (bArr == null) {
                    bArr = new byte[min];
                }
                skipSafely = inputStream.read(bArr, 0, min);
                if (skipSafely == -1) {
                    break;
                }
            }
            j3 += skipSafely;
        }
        return j3;
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        Preconditions.checkNotNull(inputStream);
        return toByteArrayInternal(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] toByteArrayInternal(InputStream inputStream, Queue<byte[]> queue, int i2) throws IOException {
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i2) * 2));
        while (i2 < MAX_ARRAY_LEN) {
            int min2 = Math.min(min, MAX_ARRAY_LEN - i2);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i3 = 0;
            while (i3 < min2) {
                int read = inputStream.read(bArr, i3, min2 - i3);
                if (read == -1) {
                    return combineBuffers(queue, i2);
                }
                i3 += read;
                i2 += read;
            }
            min = IntMath.saturatedMultiply(min, min < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return combineBuffers(queue, MAX_ARRAY_LEN);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* loaded from: classes2.dex */
    public static class ByteArrayDataInputStream implements ByteArrayDataInput {
        final DataInput input;

        public ByteArrayDataInputStream(ByteArrayInputStream byteArrayInputStream) {
            this.input = new DataInputStream(byteArrayInputStream);
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public boolean readBoolean() {
            try {
                return this.input.readBoolean();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public byte readByte() {
            try {
                return this.input.readByte();
            } catch (EOFException e) {
                throw new IllegalStateException(e);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public char readChar() {
            try {
                return this.input.readChar();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public double readDouble() {
            try {
                return this.input.readDouble();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public float readFloat() {
            try {
                return this.input.readFloat();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public void readFully(byte[] bArr) {
            try {
                this.input.readFully(bArr);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int readInt() {
            try {
                return this.input.readInt();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public String readLine() {
            try {
                return this.input.readLine();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public long readLong() {
            try {
                return this.input.readLong();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public short readShort() {
            try {
                return this.input.readShort();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public String readUTF() {
            try {
                return this.input.readUTF();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int readUnsignedByte() {
            try {
                return this.input.readUnsignedByte();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int readUnsignedShort() {
            try {
                return this.input.readUnsignedShort();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int skipBytes(int i2) {
            try {
                return this.input.skipBytes(i2);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public void readFully(byte[] bArr, int i2, int i3) {
            try {
                this.input.readFully(bArr, i2, i3);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class ByteArrayDataOutputStream implements ByteArrayDataOutput {
        final ByteArrayOutputStream byteArrayOutputStream;
        final DataOutput output;

        public ByteArrayDataOutputStream(ByteArrayOutputStream byteArrayOutputStream) {
            this.byteArrayOutputStream = byteArrayOutputStream;
            this.output = new DataOutputStream(byteArrayOutputStream);
        }

        @Override // com.google.common.io.ByteArrayDataOutput
        public byte[] toByteArray() {
            return this.byteArrayOutputStream.toByteArray();
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void write(int i2) {
            try {
                this.output.write(i2);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeBoolean(boolean z2) {
            try {
                this.output.writeBoolean(z2);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeByte(int i2) {
            try {
                this.output.writeByte(i2);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeBytes(String str) {
            try {
                this.output.writeBytes(str);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeChar(int i2) {
            try {
                this.output.writeChar(i2);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeChars(String str) {
            try {
                this.output.writeChars(str);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeDouble(double d) {
            try {
                this.output.writeDouble(d);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeFloat(float f2) {
            try {
                this.output.writeFloat(f2);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeInt(int i2) {
            try {
                this.output.writeInt(i2);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeLong(long j2) {
            try {
                this.output.writeLong(j2);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeShort(int i2) {
            try {
                this.output.writeShort(i2);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeUTF(String str) {
            try {
                this.output.writeUTF(str);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void write(byte[] bArr) {
            try {
                this.output.write(bArr);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void write(byte[] bArr, int i2, int i3) {
            try {
                this.output.write(bArr, i2, i3);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    @Beta
    public static ByteArrayDataInput newDataInput(byte[] bArr, int i2) {
        Preconditions.checkPositionIndex(i2, bArr.length);
        return newDataInput(new ByteArrayInputStream(bArr, i2, bArr.length - i2));
    }

    @Beta
    public static ByteArrayDataOutput newDataOutput(int i2) {
        if (i2 >= 0) {
            return newDataOutput(new ByteArrayOutputStream(i2));
        }
        throw new IllegalArgumentException(String.format("Invalid size: %s", Integer.valueOf(i2)));
    }

    @Beta
    public static void readFully(InputStream inputStream, byte[] bArr, int i2, int i3) throws IOException {
        int read = read(inputStream, bArr, i2, i3);
        if (read == i3) {
            return;
        }
        StringBuilder sb = new StringBuilder(81);
        sb.append("reached end of stream after reading ");
        sb.append(read);
        sb.append(" bytes; ");
        sb.append(i3);
        sb.append(" bytes expected");
        throw new EOFException(sb.toString());
    }

    public static byte[] toByteArray(InputStream inputStream, long j2) throws IOException {
        Preconditions.checkArgument(j2 >= 0, "expectedSize (%s) must be non-negative", j2);
        if (j2 <= 2147483639) {
            int i2 = (int) j2;
            byte[] bArr = new byte[i2];
            int i3 = i2;
            while (i3 > 0) {
                int i4 = i2 - i3;
                int read = inputStream.read(bArr, i4, i3);
                if (read == -1) {
                    return Arrays.copyOf(bArr, i4);
                }
                i3 -= read;
            }
            int read2 = inputStream.read();
            if (read2 == -1) {
                return bArr;
            }
            ArrayDeque arrayDeque = new ArrayDeque(22);
            arrayDeque.add(bArr);
            arrayDeque.add(new byte[]{(byte) read2});
            return toByteArrayInternal(inputStream, arrayDeque, i2 + 1);
        }
        StringBuilder sb = new StringBuilder(62);
        sb.append(j2);
        sb.append(" bytes is too large to fit in a byte array");
        throw new OutOfMemoryError(sb.toString());
    }

    @Beta
    public static ByteArrayDataInput newDataInput(ByteArrayInputStream byteArrayInputStream) {
        return new ByteArrayDataInputStream((ByteArrayInputStream) Preconditions.checkNotNull(byteArrayInputStream));
    }

    @Beta
    public static ByteArrayDataOutput newDataOutput(ByteArrayOutputStream byteArrayOutputStream) {
        return new ByteArrayDataOutputStream((ByteArrayOutputStream) Preconditions.checkNotNull(byteArrayOutputStream));
    }

    @CanIgnoreReturnValue
    public static long copy(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) throws IOException {
        Preconditions.checkNotNull(readableByteChannel);
        Preconditions.checkNotNull(writableByteChannel);
        long j2 = 0;
        if (readableByteChannel instanceof FileChannel) {
            FileChannel fileChannel = (FileChannel) readableByteChannel;
            long position = fileChannel.position();
            long j3 = position;
            while (true) {
                long transferTo = fileChannel.transferTo(j3, 524288L, writableByteChannel);
                j3 += transferTo;
                fileChannel.position(j3);
                if (transferTo <= 0 && j3 >= fileChannel.size()) {
                    return j3 - position;
                }
            }
        } else {
            ByteBuffer wrap = ByteBuffer.wrap(createBuffer());
            while (readableByteChannel.read(wrap) != -1) {
                Java8Compatibility.flip(wrap);
                while (wrap.hasRemaining()) {
                    j2 += writableByteChannel.write(wrap);
                }
                Java8Compatibility.clear(wrap);
            }
            return j2;
        }
    }
}
