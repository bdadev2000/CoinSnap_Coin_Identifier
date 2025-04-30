package androidx.work;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class g {
    public static final String b = o.g("Data");

    /* renamed from: c, reason: collision with root package name */
    public static final g f5213c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5214a;

    static {
        g gVar = new g(new HashMap());
        c(gVar);
        f5213c = gVar;
    }

    public g(g gVar) {
        this.f5214a = new HashMap(gVar.f5214a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0040 -> B:16:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.work.g a(byte[] r8) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            java.lang.String r1 = androidx.work.g.b
            int r2 = r8.length
            r3 = 10240(0x2800, float:1.4349E-41)
            if (r2 > r3) goto L78
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
            r3.<init>(r8)
            r8 = 0
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L44 java.lang.ClassNotFoundException -> L48 java.io.IOException -> L4d
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L44 java.lang.ClassNotFoundException -> L48 java.io.IOException -> L4d
            int r8 = r4.readInt()     // Catch: java.lang.Throwable -> L2d java.lang.ClassNotFoundException -> L2f java.io.IOException -> L31
        L1d:
            if (r8 <= 0) goto L33
            java.lang.String r5 = r4.readUTF()     // Catch: java.lang.Throwable -> L2d java.lang.ClassNotFoundException -> L2f java.io.IOException -> L31
            java.lang.Object r6 = r4.readObject()     // Catch: java.lang.Throwable -> L2d java.lang.ClassNotFoundException -> L2f java.io.IOException -> L31
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L2d java.lang.ClassNotFoundException -> L2f java.io.IOException -> L31
            int r8 = r8 + (-1)
            goto L1d
        L2d:
            r8 = move-exception
            goto L65
        L2f:
            r8 = move-exception
            goto L4f
        L31:
            r8 = move-exception
            goto L4f
        L33:
            r4.close()     // Catch: java.io.IOException -> L37
            goto L3b
        L37:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
        L3b:
            r3.close()     // Catch: java.io.IOException -> L3f
            goto L5f
        L3f:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
            goto L5f
        L44:
            r2 = move-exception
            r4 = r8
            r8 = r2
            goto L65
        L48:
            r4 = move-exception
        L49:
            r7 = r4
            r4 = r8
            r8 = r7
            goto L4f
        L4d:
            r4 = move-exception
            goto L49
        L4f:
            android.util.Log.e(r1, r0, r8)     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L5c
            r4.close()     // Catch: java.io.IOException -> L58
            goto L5c
        L58:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
        L5c:
            r3.close()     // Catch: java.io.IOException -> L3f
        L5f:
            androidx.work.g r8 = new androidx.work.g
            r8.<init>(r2)
            return r8
        L65:
            if (r4 == 0) goto L6f
            r4.close()     // Catch: java.io.IOException -> L6b
            goto L6f
        L6b:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L6f:
            r3.close()     // Catch: java.io.IOException -> L73
            goto L77
        L73:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L77:
            throw r8
        L78:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.g.a(byte[]):androidx.work.g");
    }

    public static byte[] c(g gVar) {
        String str = b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(gVar.f5214a.size());
                    for (Map.Entry entry : gVar.f5214a.entrySet()) {
                        objectOutputStream2.writeUTF((String) entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e4) {
                        Log.e(str, "Error in Data#toByteArray: ", e4);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e9) {
                        Log.e(str, "Error in Data#toByteArray: ", e9);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e10) {
                    e = e10;
                    objectOutputStream = objectOutputStream2;
                    Log.e(str, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e11) {
                            Log.e(str, "Error in Data#toByteArray: ", e11);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e12) {
                        Log.e(str, "Error in Data#toByteArray: ", e12);
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e13) {
                            Log.e(str, "Error in Data#toByteArray: ", e13);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e14) {
                        Log.e(str, "Error in Data#toByteArray: ", e14);
                        throw th;
                    }
                }
            } catch (IOException e15) {
                e = e15;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final String b(String str) {
        Object obj = this.f5214a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        boolean z8;
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        HashMap hashMap = this.f5214a;
        Set<String> keySet = hashMap.keySet();
        HashMap hashMap2 = ((g) obj).f5214a;
        if (!keySet.equals(hashMap2.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = hashMap.get(str);
            Object obj3 = hashMap2.get(str);
            if (obj2 != null && obj3 != null) {
                if ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) {
                    z8 = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                } else {
                    z8 = obj2.equals(obj3);
                }
            } else if (obj2 == obj3) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!z8) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f5214a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        HashMap hashMap = this.f5214a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = hashMap.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public g(Map map) {
        this.f5214a = new HashMap(map);
    }
}
