package com.google.android.gms.tflite;

import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.Tensor;

/* compiled from: com.google.android.gms:play-services-tflite-java@@16.1.0 */
/* loaded from: classes12.dex */
final class TensorImpl implements Tensor {
    private long zza;
    private final DataType zzb;
    private int[] zzc;
    private final int[] zzd;
    private final Tensor.QuantizationParams zze;

    private TensorImpl(long j) {
        DataType dataType;
        this.zza = j;
        int dtype = dtype(j);
        switch (dtype) {
            case 1:
                dataType = DataType.FLOAT32;
                break;
            case 2:
                dataType = DataType.INT32;
                break;
            case 3:
                dataType = DataType.UINT8;
                break;
            case 4:
                dataType = DataType.INT64;
                break;
            case 5:
                dataType = DataType.STRING;
                break;
            case 6:
                dataType = DataType.BOOL;
                break;
            case 7:
                dataType = DataType.INT16;
                break;
            case 8:
            default:
                throw new IllegalArgumentException("DataType error: DataType " + dtype + " is not recognized in Java.");
            case 9:
                dataType = DataType.INT8;
                break;
        }
        this.zzb = dataType;
        this.zzc = shape(j);
        this.zzd = shapeSignature(j);
        this.zze = new Tensor.QuantizationParams(quantizationScale(j), quantizationZeroPoint(j));
    }

    private static native ByteBuffer buffer(long j);

    private static native long create(long j, int i, int i2);

    private static native void delete(long j);

    private static native int dtype(long j);

    private static native boolean hasDelegateBufferHandle(long j);

    private static native int index(long j);

    private static native String name(long j);

    private static native int numBytes(long j);

    private static native float quantizationScale(long j);

    private static native int quantizationZeroPoint(long j);

    private static native void readMultiDimensionalArray(long j, Object obj);

    private static native int[] shape(long j);

    private static native int[] shapeSignature(long j);

    private static native void writeDirectBuffer(long j, Buffer buffer);

    private static native void writeMultiDimensionalArray(long j, Object obj);

    private static native void writeScalar(long j, Object obj);

    static int zza(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return 0;
        }
        if (Array.getLength(obj) == 0) {
            throw new IllegalArgumentException("Array lengths cannot be 0.");
        }
        return zza(Array.get(obj, 0)) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static TensorImpl zzb(long j, int i) {
        return new TensorImpl(create(j, i, 0));
    }

    static void zze(Object obj, int i, int[] iArr) {
        int length;
        if (iArr == null || i == (length = iArr.length)) {
            return;
        }
        int length2 = Array.getLength(obj);
        int i2 = iArr[i];
        if (i2 == 0) {
            iArr[i] = length2;
        } else if (i2 != length2) {
            throw new IllegalArgumentException(String.format("Mismatched lengths (%d and %d) in dimension %d", Integer.valueOf(i2), Integer.valueOf(length2), Integer.valueOf(i)));
        }
        int i3 = i + 1;
        if (i3 != length) {
            for (int i4 = 0; i4 < length2; i4++) {
                zze(Array.get(obj, i4), i3, iArr);
            }
        }
    }

    private final ByteBuffer zzi() {
        return buffer(this.zza).order(ByteOrder.nativeOrder());
    }

    private final void zzj(Object obj) {
        DataType dataType;
        if (obj instanceof ByteBuffer) {
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            while (cls.isArray()) {
                cls = cls.getComponentType();
            }
            if (Float.TYPE.equals(cls)) {
                dataType = DataType.FLOAT32;
            } else if (Integer.TYPE.equals(cls)) {
                dataType = DataType.INT32;
            } else if (Short.TYPE.equals(cls)) {
                dataType = DataType.INT16;
            } else if (Byte.TYPE.equals(cls)) {
                dataType = this.zzb == DataType.STRING ? DataType.STRING : DataType.UINT8;
            } else if (Long.TYPE.equals(cls)) {
                dataType = DataType.INT64;
            } else if (Boolean.TYPE.equals(cls)) {
                dataType = DataType.BOOL;
            } else {
                if (String.class.equals(cls)) {
                    dataType = DataType.STRING;
                }
                throw new IllegalArgumentException("DataType error: cannot resolve DataType of ".concat(String.valueOf(obj.getClass().getName())));
            }
            if (dataType == this.zzb && !zzb.zza(dataType).equals(zzb.zza(this.zzb))) {
                throw new IllegalArgumentException(String.format("Cannot convert between a TensorFlowLite tensor with type %s and a Java object of type %s (which is compatible with the TensorFlowLite type %s).", this.zzb, obj.getClass().getName(), dataType));
            }
        }
        if (Float.class.equals(cls) || (obj instanceof FloatBuffer)) {
            dataType = DataType.FLOAT32;
        } else if (Integer.class.equals(cls) || (obj instanceof IntBuffer)) {
            dataType = DataType.INT32;
        } else if (Short.class.equals(cls) || (obj instanceof ShortBuffer)) {
            dataType = DataType.INT16;
        } else if (Byte.class.equals(cls)) {
            dataType = DataType.UINT8;
        } else if (Long.class.equals(cls) || (obj instanceof LongBuffer)) {
            dataType = DataType.INT64;
        } else if (Boolean.class.equals(cls)) {
            dataType = DataType.BOOL;
        } else {
            if (String.class.equals(cls)) {
                dataType = DataType.STRING;
            }
            throw new IllegalArgumentException("DataType error: cannot resolve DataType of ".concat(String.valueOf(obj.getClass().getName())));
        }
        if (dataType == this.zzb) {
        }
    }

    private final int[] zzk(Object obj) {
        int zza = zza(obj);
        if (this.zzb == DataType.STRING) {
            Class<?> cls = obj.getClass();
            if (cls.isArray()) {
                while (cls.isArray()) {
                    cls = cls.getComponentType();
                }
                if (Byte.TYPE.equals(cls)) {
                    zza--;
                }
            }
        }
        int[] iArr = new int[zza];
        zze(obj, 0, iArr);
        return iArr;
    }

    @Override // org.tensorflow.lite.Tensor
    public final ByteBuffer asReadOnlyBuffer() {
        return zzi().asReadOnlyBuffer().order(ByteOrder.nativeOrder());
    }

    @Override // org.tensorflow.lite.Tensor
    public final DataType dataType() {
        return this.zzb;
    }

    @Override // org.tensorflow.lite.Tensor
    public final int index() {
        return index(this.zza);
    }

    @Override // org.tensorflow.lite.Tensor
    public final String name() {
        return name(this.zza);
    }

    @Override // org.tensorflow.lite.Tensor
    public final int numBytes() {
        return numBytes(this.zza);
    }

    @Override // org.tensorflow.lite.Tensor
    public final int numDimensions() {
        return this.zzc.length;
    }

    @Override // org.tensorflow.lite.Tensor
    public final int numElements() {
        int i = 1;
        for (int i2 : this.zzc) {
            i *= i2;
        }
        return i;
    }

    @Override // org.tensorflow.lite.Tensor
    public final Tensor.QuantizationParams quantizationParams() {
        return this.zze;
    }

    @Override // org.tensorflow.lite.Tensor
    public final int[] shape() {
        return this.zzc;
    }

    @Override // org.tensorflow.lite.Tensor
    public final int[] shapeSignature() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc() {
        delete(this.zza);
        this.zza = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(Object obj) {
        if (obj == null) {
            if (!hasDelegateBufferHandle(this.zza)) {
                throw new IllegalArgumentException("Null outputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        zzj(obj);
        if (obj instanceof Buffer) {
            Buffer buffer = (Buffer) obj;
            int numBytes = numBytes(this.zza);
            int capacity = obj instanceof ByteBuffer ? buffer.capacity() : buffer.capacity() * this.zzb.byteSize();
            if (numBytes > capacity) {
                throw new IllegalArgumentException(String.format("Cannot copy from a TensorFlowLite tensor (%s) with %d bytes to a Java Buffer with %d bytes.", name(this.zza), Integer.valueOf(numBytes), Integer.valueOf(capacity)));
            }
            if (buffer instanceof ByteBuffer) {
                ((ByteBuffer) buffer).put(zzi());
                return;
            }
            if (buffer instanceof FloatBuffer) {
                ((FloatBuffer) buffer).put(zzi().asFloatBuffer());
                return;
            }
            if (buffer instanceof LongBuffer) {
                ((LongBuffer) buffer).put(zzi().asLongBuffer());
                return;
            } else if (buffer instanceof IntBuffer) {
                ((IntBuffer) buffer).put(zzi().asIntBuffer());
                return;
            } else {
                if (buffer instanceof ShortBuffer) {
                    ((ShortBuffer) buffer).put(zzi().asShortBuffer());
                    return;
                }
                throw new IllegalArgumentException("Unexpected output buffer type: ".concat(buffer.toString()));
            }
        }
        int[] zzk = zzk(obj);
        if (!Arrays.equals(zzk, this.zzc)) {
            throw new IllegalArgumentException(String.format("Cannot copy from a TensorFlowLite tensor (%s) with shape %s to a Java object with shape %s.", name(this.zza), Arrays.toString(this.zzc), Arrays.toString(zzk)));
        }
        readMultiDimensionalArray(this.zza, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf() {
        this.zzc = shape(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzg(Object obj) {
        if (obj == null) {
            if (!hasDelegateBufferHandle(this.zza)) {
                throw new IllegalArgumentException("Null inputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        zzj(obj);
        if (obj instanceof Buffer) {
            Buffer buffer = (Buffer) obj;
            int numBytes = numBytes(this.zza);
            int capacity = obj instanceof ByteBuffer ? buffer.capacity() : buffer.capacity() * this.zzb.byteSize();
            if (numBytes != capacity) {
                throw new IllegalArgumentException(String.format("Cannot copy to a TensorFlowLite tensor (%s) with %d bytes from a Java Buffer with %d bytes.", name(this.zza), Integer.valueOf(numBytes), Integer.valueOf(capacity)));
            }
            if (buffer instanceof ByteBuffer) {
                ByteBuffer byteBuffer = (ByteBuffer) buffer;
                if (!byteBuffer.isDirect() || byteBuffer.order() != ByteOrder.nativeOrder()) {
                    zzi().put(byteBuffer);
                    return;
                } else {
                    writeDirectBuffer(this.zza, buffer);
                    return;
                }
            }
            if (buffer instanceof LongBuffer) {
                LongBuffer longBuffer = (LongBuffer) buffer;
                if (!longBuffer.isDirect() || longBuffer.order() != ByteOrder.nativeOrder()) {
                    zzi().asLongBuffer().put(longBuffer);
                    return;
                } else {
                    writeDirectBuffer(this.zza, buffer);
                    return;
                }
            }
            if (buffer instanceof FloatBuffer) {
                FloatBuffer floatBuffer = (FloatBuffer) buffer;
                if (!floatBuffer.isDirect() || floatBuffer.order() != ByteOrder.nativeOrder()) {
                    zzi().asFloatBuffer().put(floatBuffer);
                    return;
                } else {
                    writeDirectBuffer(this.zza, buffer);
                    return;
                }
            }
            if (buffer instanceof IntBuffer) {
                IntBuffer intBuffer = (IntBuffer) buffer;
                if (!intBuffer.isDirect() || intBuffer.order() != ByteOrder.nativeOrder()) {
                    zzi().asIntBuffer().put(intBuffer);
                    return;
                } else {
                    writeDirectBuffer(this.zza, buffer);
                    return;
                }
            }
            if (buffer instanceof ShortBuffer) {
                ShortBuffer shortBuffer = (ShortBuffer) buffer;
                if (!shortBuffer.isDirect() || shortBuffer.order() != ByteOrder.nativeOrder()) {
                    zzi().asShortBuffer().put(shortBuffer);
                    return;
                } else {
                    writeDirectBuffer(this.zza, buffer);
                    return;
                }
            }
            throw new IllegalArgumentException("Unexpected input buffer type: ".concat(buffer.toString()));
        }
        int[] zzk = zzk(obj);
        if (Arrays.equals(zzk, this.zzc)) {
            if (this.zzb != DataType.STRING || this.zzc.length != 0) {
                if (obj.getClass().isArray()) {
                    writeMultiDimensionalArray(this.zza, obj);
                    return;
                } else {
                    writeScalar(this.zza, obj);
                    return;
                }
            }
            writeScalar(this.zza, obj);
            return;
        }
        throw new IllegalArgumentException(String.format("Cannot copy to a TensorFlowLite tensor (%s) with shape %s from a Java object with shape %s.", name(this.zza), Arrays.toString(this.zzc), Arrays.toString(zzk)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int[] zzh(Object obj) {
        if (obj == null || (obj instanceof Buffer)) {
            return null;
        }
        zzj(obj);
        int[] zzk = zzk(obj);
        if (Arrays.equals(this.zzc, zzk)) {
            return null;
        }
        return zzk;
    }
}
