package androidx.work;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5212a = new HashMap();

    public final void a(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            HashMap hashMap2 = this.f5212a;
            if (value == null) {
                hashMap2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls != Boolean.class && cls != Byte.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class && cls != Boolean[].class && cls != Byte[].class && cls != Integer[].class && cls != Long[].class && cls != Float[].class && cls != Double[].class && cls != String[].class) {
                    int i9 = 0;
                    if (cls == boolean[].class) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = g.b;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i9 < zArr.length) {
                            boolArr[i9] = Boolean.valueOf(zArr[i9]);
                            i9++;
                        }
                        hashMap2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        String str3 = g.b;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i9 < bArr.length) {
                            bArr2[i9] = Byte.valueOf(bArr[i9]);
                            i9++;
                        }
                        hashMap2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        String str4 = g.b;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i9 < iArr.length) {
                            numArr[i9] = Integer.valueOf(iArr[i9]);
                            i9++;
                        }
                        hashMap2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        String str5 = g.b;
                        Long[] lArr = new Long[jArr.length];
                        while (i9 < jArr.length) {
                            lArr[i9] = Long.valueOf(jArr[i9]);
                            i9++;
                        }
                        hashMap2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        String str6 = g.b;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i9 < fArr.length) {
                            fArr2[i9] = Float.valueOf(fArr[i9]);
                            i9++;
                        }
                        hashMap2.put(str, fArr2);
                    } else if (cls == double[].class) {
                        double[] dArr = (double[]) value;
                        String str7 = g.b;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i9 < dArr.length) {
                            dArr2[i9] = Double.valueOf(dArr[i9]);
                            i9++;
                        }
                        hashMap2.put(str, dArr2);
                    } else {
                        throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
                    }
                } else {
                    hashMap2.put(str, value);
                }
            }
        }
    }
}
