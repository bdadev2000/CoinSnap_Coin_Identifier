package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
final class Util {
    private Util() {
    }

    public static <T> List<T> add(List<T> list, T t2) {
        if (list == null) {
            list = new ArrayList<>(1);
        }
        list.add(t2);
        return list;
    }

    public static <T> List<T> asArrayList(int i2) {
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(null);
        }
        return arrayList;
    }

    public static <T> List<T> asArrayList(T[] tArr) {
        if (tArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t2 : tArr) {
            arrayList.add(t2);
        }
        return arrayList;
    }

    public static List<Byte> asArrayList(byte[] bArr) {
        if (bArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b2 : bArr) {
            arrayList.add(Byte.valueOf(b2));
        }
        return arrayList;
    }

    public static List<Boolean> asArrayList(boolean[] zArr) {
        if (zArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z2 : zArr) {
            arrayList.add(Boolean.valueOf(z2));
        }
        return arrayList;
    }

    public static List<Short> asArrayList(short[] sArr) {
        if (sArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s2 : sArr) {
            arrayList.add(Short.valueOf(s2));
        }
        return arrayList;
    }

    public static List<Character> asArrayList(char[] cArr) {
        if (cArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c2 : cArr) {
            arrayList.add(Character.valueOf(c2));
        }
        return arrayList;
    }

    public static List<Integer> asArrayList(int[] iArr) {
        if (iArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    public static List<Float> asArrayList(float[] fArr) {
        if (fArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f2 : fArr) {
            arrayList.add(Float.valueOf(f2));
        }
        return arrayList;
    }

    public static List<Long> asArrayList(long[] jArr) {
        if (jArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j2 : jArr) {
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    public static List<Double> asArrayList(double[] dArr) {
        if (dArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    public static <T> List<T> asArrayList(int i2, T[] tArr) {
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(tArr[i3]);
        }
        return arrayList;
    }
}
