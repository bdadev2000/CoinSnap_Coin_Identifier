package androidx.work;

import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {
    public final HashMap a;

    public g() {
        this.a = new HashMap();
    }

    public void a(w1.a... migrations) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        for (w1.a aVar : migrations) {
            int i10 = aVar.a;
            HashMap hashMap = this.a;
            Integer valueOf = Integer.valueOf(i10);
            Object obj = hashMap.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                hashMap.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            int i11 = aVar.f26667b;
            if (treeMap.containsKey(Integer.valueOf(i11))) {
                Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i11)) + " with " + aVar);
            }
            treeMap.put(Integer.valueOf(i11), aVar);
        }
    }

    public h b() {
        h hVar = new h(this.a);
        h.c(hVar);
        return hVar;
    }

    public void c(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            HashMap hashMap2 = this.a;
            if (value == null) {
                hashMap2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls != Boolean.class && cls != Byte.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class && cls != Boolean[].class && cls != Byte[].class && cls != Integer[].class && cls != Long[].class && cls != Float[].class && cls != Double[].class && cls != String[].class) {
                    int i10 = 0;
                    if (cls == boolean[].class) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = h.f2196b;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i10 < zArr.length) {
                            boolArr[i10] = Boolean.valueOf(zArr[i10]);
                            i10++;
                        }
                        hashMap2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        String str3 = h.f2196b;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i10 < bArr.length) {
                            bArr2[i10] = Byte.valueOf(bArr[i10]);
                            i10++;
                        }
                        hashMap2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        String str4 = h.f2196b;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i10 < iArr.length) {
                            numArr[i10] = Integer.valueOf(iArr[i10]);
                            i10++;
                        }
                        hashMap2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        String str5 = h.f2196b;
                        Long[] lArr = new Long[jArr.length];
                        while (i10 < jArr.length) {
                            lArr[i10] = Long.valueOf(jArr[i10]);
                            i10++;
                        }
                        hashMap2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        String str6 = h.f2196b;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i10 < fArr.length) {
                            fArr2[i10] = Float.valueOf(fArr[i10]);
                            i10++;
                        }
                        hashMap2.put(str, fArr2);
                    } else if (cls == double[].class) {
                        double[] dArr = (double[]) value;
                        String str7 = h.f2196b;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i10 < dArr.length) {
                            dArr2[i10] = Double.valueOf(dArr[i10]);
                            i10++;
                        }
                        hashMap2.put(str, dArr2);
                    } else {
                        throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
                    }
                } else {
                    hashMap2.put(str, value);
                }
            }
        }
    }

    public /* synthetic */ g(int i10) {
        if (i10 == 1) {
            this.a = new HashMap();
            return;
        }
        if (i10 == 2) {
            this.a = new HashMap();
        } else if (i10 != 3) {
            this.a = new LinkedHashMap();
        } else {
            this.a = new HashMap();
        }
    }
}
