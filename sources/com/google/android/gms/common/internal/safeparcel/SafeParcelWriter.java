package com.google.android.gms.common.internal.safeparcel;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import androidx.annotation.NonNull;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* loaded from: classes2.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static int beginObjectHeader(@NonNull Parcel parcel) {
        return zza(parcel, 20293);
    }

    public static void finishObjectHeader(@NonNull Parcel parcel, int i9) {
        zzb(parcel, i9);
    }

    public static void writeBigDecimal(@NonNull Parcel parcel, int i9, @NonNull BigDecimal bigDecimal, boolean z8) {
        if (bigDecimal == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            int zza = zza(parcel, i9);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            zzb(parcel, zza);
        }
    }

    public static void writeBigDecimalArray(@NonNull Parcel parcel, int i9, @NonNull BigDecimal[] bigDecimalArr, boolean z8) {
        if (bigDecimalArr == null) {
            if (z8) {
                zzc(parcel, i9, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i9);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i10 = 0; i10 < length; i10++) {
            parcel.writeByteArray(bigDecimalArr[i10].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i10].scale());
        }
        zzb(parcel, zza);
    }

    public static void writeBigInteger(@NonNull Parcel parcel, int i9, @NonNull BigInteger bigInteger, boolean z8) {
        if (bigInteger == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            int zza = zza(parcel, i9);
            parcel.writeByteArray(bigInteger.toByteArray());
            zzb(parcel, zza);
        }
    }

    public static void writeBigIntegerArray(@NonNull Parcel parcel, int i9, @NonNull BigInteger[] bigIntegerArr, boolean z8) {
        if (bigIntegerArr == null) {
            if (z8) {
                zzc(parcel, i9, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i9);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        zzb(parcel, zza);
    }

    public static void writeBoolean(@NonNull Parcel parcel, int i9, boolean z8) {
        zzc(parcel, i9, 4);
        parcel.writeInt(z8 ? 1 : 0);
    }

    public static void writeBooleanArray(@NonNull Parcel parcel, int i9, @NonNull boolean[] zArr, boolean z8) {
        if (zArr == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            int zza = zza(parcel, i9);
            parcel.writeBooleanArray(zArr);
            zzb(parcel, zza);
        }
    }

    public static void writeBooleanList(@NonNull Parcel parcel, int i9, @NonNull List<Boolean> list, boolean z8) {
        if (list == null) {
            if (z8) {
                zzc(parcel, i9, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i9);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(list.get(i10).booleanValue() ? 1 : 0);
        }
        zzb(parcel, zza);
    }

    public static void writeBooleanObject(@NonNull Parcel parcel, int i9, @NonNull Boolean bool, boolean z8) {
        if (bool == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            zzc(parcel, i9, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public static void writeBundle(@NonNull Parcel parcel, int i9, @NonNull Bundle bundle, boolean z8) {
        if (bundle == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            int zza = zza(parcel, i9);
            parcel.writeBundle(bundle);
            zzb(parcel, zza);
        }
    }

    public static void writeByte(@NonNull Parcel parcel, int i9, byte b) {
        zzc(parcel, i9, 4);
        parcel.writeInt(b);
    }

    public static void writeByteArray(@NonNull Parcel parcel, int i9, @NonNull byte[] bArr, boolean z8) {
        if (bArr == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            int zza = zza(parcel, i9);
            parcel.writeByteArray(bArr);
            zzb(parcel, zza);
        }
    }

    public static void writeByteArrayArray(@NonNull Parcel parcel, int i9, @NonNull byte[][] bArr, boolean z8) {
        if (bArr == null) {
            if (z8) {
                zzc(parcel, i9, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i9);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        zzb(parcel, zza);
    }

    public static void writeByteArraySparseArray(@NonNull Parcel parcel, int i9, @NonNull SparseArray<byte[]> sparseArray, boolean z8) {
        if (sparseArray == null) {
            if (z8) {
                zzc(parcel, i9, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i9);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(sparseArray.keyAt(i10));
            parcel.writeByteArray(sparseArray.valueAt(i10));
        }
        zzb(parcel, zza);
    }

    public static void writeChar(@NonNull Parcel parcel, int i9, char c9) {
        zzc(parcel, i9, 4);
        parcel.writeInt(c9);
    }

    public static void writeCharArray(@NonNull Parcel parcel, int i9, @NonNull char[] cArr, boolean z8) {
        if (cArr == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            int zza = zza(parcel, i9);
            parcel.writeCharArray(cArr);
            zzb(parcel, zza);
        }
    }

    public static void writeDouble(@NonNull Parcel parcel, int i9, double d2) {
        zzc(parcel, i9, 8);
        parcel.writeDouble(d2);
    }

    public static void writeDoubleArray(@NonNull Parcel parcel, int i9, @NonNull double[] dArr, boolean z8) {
        if (dArr == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            int zza = zza(parcel, i9);
            parcel.writeDoubleArray(dArr);
            zzb(parcel, zza);
        }
    }

    public static void writeDoubleList(@NonNull Parcel parcel, int i9, @NonNull List<Double> list, boolean z8) {
        if (list == null) {
            if (z8) {
                zzc(parcel, i9, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i9);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeDouble(list.get(i10).doubleValue());
        }
        zzb(parcel, zza);
    }

    public static void writeDoubleObject(@NonNull Parcel parcel, int i9, @NonNull Double d2, boolean z8) {
        if (d2 == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            zzc(parcel, i9, 8);
            parcel.writeDouble(d2.doubleValue());
        }
    }

    public static void writeDoubleSparseArray(@NonNull Parcel parcel, int i9, @NonNull SparseArray<Double> sparseArray, boolean z8) {
        if (sparseArray == null) {
            if (z8) {
                zzc(parcel, i9, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i9);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(sparseArray.keyAt(i10));
            parcel.writeDouble(sparseArray.valueAt(i10).doubleValue());
        }
        zzb(parcel, zza);
    }

    public static void writeFloat(@NonNull Parcel parcel, int i9, float f9) {
        zzc(parcel, i9, 4);
        parcel.writeFloat(f9);
    }

    public static void writeFloatArray(@NonNull Parcel parcel, int i9, @NonNull float[] fArr, boolean z8) {
        if (fArr == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            int zza = zza(parcel, i9);
            parcel.writeFloatArray(fArr);
            zzb(parcel, zza);
        }
    }

    public static void writeFloatList(@NonNull Parcel parcel, int i9, @NonNull List<Float> list, boolean z8) {
        if (list == null) {
            if (z8) {
                zzc(parcel, i9, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i9);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeFloat(list.get(i10).floatValue());
        }
        zzb(parcel, zza);
    }

    public static void writeFloatObject(@NonNull Parcel parcel, int i9, @NonNull Float f9, boolean z8) {
        if (f9 == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            zzc(parcel, i9, 4);
            parcel.writeFloat(f9.floatValue());
        }
    }

    public static void writeFloatSparseArray(@NonNull Parcel parcel, int i9, @NonNull SparseArray<Float> sparseArray, boolean z8) {
        if (sparseArray == null) {
            if (z8) {
                zzc(parcel, i9, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i9);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(sparseArray.keyAt(i10));
            parcel.writeFloat(sparseArray.valueAt(i10).floatValue());
        }
        zzb(parcel, zza);
    }

    public static void writeIBinder(@NonNull Parcel parcel, int i9, @NonNull IBinder iBinder, boolean z8) {
        if (iBinder == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            int zza = zza(parcel, i9);
            parcel.writeStrongBinder(iBinder);
            zzb(parcel, zza);
        }
    }

    public static void writeIBinderArray(@NonNull Parcel parcel, int i9, @NonNull IBinder[] iBinderArr, boolean z8) {
        if (iBinderArr == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            int zza = zza(parcel, i9);
            parcel.writeBinderArray(iBinderArr);
            zzb(parcel, zza);
        }
    }

    public static void writeIBinderList(@NonNull Parcel parcel, int i9, @NonNull List<IBinder> list, boolean z8) {
        if (list == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            int zza = zza(parcel, i9);
            parcel.writeBinderList(list);
            zzb(parcel, zza);
        }
    }

    public static void writeIBinderSparseArray(@NonNull Parcel parcel, int i9, @NonNull SparseArray<IBinder> sparseArray, boolean z8) {
        if (sparseArray == null) {
            if (z8) {
                zzc(parcel, i9, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i9);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(sparseArray.keyAt(i10));
            parcel.writeStrongBinder(sparseArray.valueAt(i10));
        }
        zzb(parcel, zza);
    }

    public static void writeInt(@NonNull Parcel parcel, int i9, int i10) {
        zzc(parcel, i9, 4);
        parcel.writeInt(i10);
    }

    public static void writeIntArray(@NonNull Parcel parcel, int i9, @NonNull int[] iArr, boolean z8) {
        if (iArr == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            int zza = zza(parcel, i9);
            parcel.writeIntArray(iArr);
            zzb(parcel, zza);
        }
    }

    public static void writeIntegerList(@NonNull Parcel parcel, int i9, @NonNull List<Integer> list, boolean z8) {
        if (list == null) {
            if (z8) {
                zzc(parcel, i9, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i9);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(list.get(i10).intValue());
        }
        zzb(parcel, zza);
    }

    public static void writeIntegerObject(@NonNull Parcel parcel, int i9, @NonNull Integer num, boolean z8) {
        if (num == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            zzc(parcel, i9, 4);
            parcel.writeInt(num.intValue());
        }
    }

    public static void writeList(@NonNull Parcel parcel, int i9, @NonNull List list, boolean z8) {
        if (list == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            int zza = zza(parcel, i9);
            parcel.writeList(list);
            zzb(parcel, zza);
        }
    }

    public static void writeLong(@NonNull Parcel parcel, int i9, long j7) {
        zzc(parcel, i9, 8);
        parcel.writeLong(j7);
    }

    public static void writeLongArray(@NonNull Parcel parcel, int i9, @NonNull long[] jArr, boolean z8) {
        if (jArr == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            int zza = zza(parcel, i9);
            parcel.writeLongArray(jArr);
            zzb(parcel, zza);
        }
    }

    public static void writeLongList(@NonNull Parcel parcel, int i9, @NonNull List<Long> list, boolean z8) {
        if (list == null) {
            if (z8) {
                zzc(parcel, i9, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i9);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeLong(list.get(i10).longValue());
        }
        zzb(parcel, zza);
    }

    public static void writeLongObject(@NonNull Parcel parcel, int i9, @NonNull Long l, boolean z8) {
        if (l == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            zzc(parcel, i9, 8);
            parcel.writeLong(l.longValue());
        }
    }

    public static void writeParcel(@NonNull Parcel parcel, int i9, @NonNull Parcel parcel2, boolean z8) {
        if (parcel2 == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            int zza = zza(parcel, i9);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            zzb(parcel, zza);
        }
    }

    public static void writeParcelArray(@NonNull Parcel parcel, int i9, @NonNull Parcel[] parcelArr, boolean z8) {
        if (parcelArr == null) {
            if (z8) {
                zzc(parcel, i9, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i9);
        parcel.writeInt(parcelArr.length);
        for (Parcel parcel2 : parcelArr) {
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, zza);
    }

    public static void writeParcelList(@NonNull Parcel parcel, int i9, @NonNull List<Parcel> list, boolean z8) {
        if (list == null) {
            if (z8) {
                zzc(parcel, i9, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i9);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            Parcel parcel2 = list.get(i10);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, zza);
    }

    public static void writeParcelSparseArray(@NonNull Parcel parcel, int i9, @NonNull SparseArray<Parcel> sparseArray, boolean z8) {
        if (sparseArray == null) {
            if (z8) {
                zzc(parcel, i9, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i9);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(sparseArray.keyAt(i10));
            Parcel valueAt = sparseArray.valueAt(i10);
            if (valueAt != null) {
                parcel.writeInt(valueAt.dataSize());
                parcel.appendFrom(valueAt, 0, valueAt.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, zza);
    }

    public static void writeParcelable(@NonNull Parcel parcel, int i9, @NonNull Parcelable parcelable, int i10, boolean z8) {
        if (parcelable == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            int zza = zza(parcel, i9);
            parcelable.writeToParcel(parcel, i10);
            zzb(parcel, zza);
        }
    }

    public static void writePendingIntent(@NonNull Parcel parcel, int i9, @NonNull PendingIntent pendingIntent, boolean z8) {
        if (pendingIntent == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            int zza = zza(parcel, i9);
            PendingIntent.writePendingIntentOrNullToParcel(pendingIntent, parcel);
            zzb(parcel, zza);
        }
    }

    public static void writeShort(@NonNull Parcel parcel, int i9, short s5) {
        zzc(parcel, i9, 4);
        parcel.writeInt(s5);
    }

    public static void writeSparseBooleanArray(@NonNull Parcel parcel, int i9, @NonNull SparseBooleanArray sparseBooleanArray, boolean z8) {
        if (sparseBooleanArray == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            int zza = zza(parcel, i9);
            parcel.writeSparseBooleanArray(sparseBooleanArray);
            zzb(parcel, zza);
        }
    }

    public static void writeSparseIntArray(@NonNull Parcel parcel, int i9, @NonNull SparseIntArray sparseIntArray, boolean z8) {
        if (sparseIntArray == null) {
            if (z8) {
                zzc(parcel, i9, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i9);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(sparseIntArray.keyAt(i10));
            parcel.writeInt(sparseIntArray.valueAt(i10));
        }
        zzb(parcel, zza);
    }

    public static void writeSparseLongArray(@NonNull Parcel parcel, int i9, @NonNull SparseLongArray sparseLongArray, boolean z8) {
        if (sparseLongArray == null) {
            if (z8) {
                zzc(parcel, i9, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i9);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(sparseLongArray.keyAt(i10));
            parcel.writeLong(sparseLongArray.valueAt(i10));
        }
        zzb(parcel, zza);
    }

    public static void writeString(@NonNull Parcel parcel, int i9, @NonNull String str, boolean z8) {
        if (str == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            int zza = zza(parcel, i9);
            parcel.writeString(str);
            zzb(parcel, zza);
        }
    }

    public static void writeStringArray(@NonNull Parcel parcel, int i9, @NonNull String[] strArr, boolean z8) {
        if (strArr == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            int zza = zza(parcel, i9);
            parcel.writeStringArray(strArr);
            zzb(parcel, zza);
        }
    }

    public static void writeStringList(@NonNull Parcel parcel, int i9, @NonNull List<String> list, boolean z8) {
        if (list == null) {
            if (z8) {
                zzc(parcel, i9, 0);
            }
        } else {
            int zza = zza(parcel, i9);
            parcel.writeStringList(list);
            zzb(parcel, zza);
        }
    }

    public static void writeStringSparseArray(@NonNull Parcel parcel, int i9, @NonNull SparseArray<String> sparseArray, boolean z8) {
        if (sparseArray == null) {
            if (z8) {
                zzc(parcel, i9, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i9);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(sparseArray.keyAt(i10));
            parcel.writeString(sparseArray.valueAt(i10));
        }
        zzb(parcel, zza);
    }

    public static <T extends Parcelable> void writeTypedArray(@NonNull Parcel parcel, int i9, @NonNull T[] tArr, int i10, boolean z8) {
        if (tArr == null) {
            if (z8) {
                zzc(parcel, i9, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i9);
        parcel.writeInt(tArr.length);
        for (T t9 : tArr) {
            if (t9 == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t9, i10);
            }
        }
        zzb(parcel, zza);
    }

    public static <T extends Parcelable> void writeTypedList(@NonNull Parcel parcel, int i9, @NonNull List<T> list, boolean z8) {
        if (list == null) {
            if (z8) {
                zzc(parcel, i9, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i9);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            T t9 = list.get(i10);
            if (t9 == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t9, 0);
            }
        }
        zzb(parcel, zza);
    }

    public static <T extends Parcelable> void writeTypedSparseArray(@NonNull Parcel parcel, int i9, @NonNull SparseArray<T> sparseArray, boolean z8) {
        if (sparseArray == null) {
            if (z8) {
                zzc(parcel, i9, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i9);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(sparseArray.keyAt(i10));
            T valueAt = sparseArray.valueAt(i10);
            if (valueAt == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, valueAt, 0);
            }
        }
        zzb(parcel, zza);
    }

    private static int zza(Parcel parcel, int i9) {
        parcel.writeInt(i9 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void zzb(Parcel parcel, int i9) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i9 - 4);
        parcel.writeInt(dataPosition - i9);
        parcel.setDataPosition(dataPosition);
    }

    private static void zzc(Parcel parcel, int i9, int i10) {
        parcel.writeInt(i9 | (i10 << 16));
    }

    private static void zzd(Parcel parcel, Parcelable parcelable, int i9) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i9);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
