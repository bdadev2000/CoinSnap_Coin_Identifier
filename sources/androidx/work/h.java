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
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final String f2196b = p.g("Data");

    /* renamed from: c, reason: collision with root package name */
    public static final h f2197c = new g().b();
    public final HashMap a;

    public h(h hVar) {
        this.a = new HashMap(hVar.a);
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0060: MOVE (r8 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:97), block:B:36:0x005f */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.work.h a(byte[] r8) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            java.lang.String r1 = androidx.work.h.f2196b
            int r2 = r8.length
            r3 = 10240(0x2800, float:1.4349E-41)
            if (r2 > r3) goto L74
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
            r3.<init>(r8)
            r8 = 0
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3c java.lang.ClassNotFoundException -> L3e java.io.IOException -> L40
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L3c java.lang.ClassNotFoundException -> L3e java.io.IOException -> L40
            int r8 = r4.readInt()     // Catch: java.lang.Throwable -> L36 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L3a
        L1d:
            if (r8 <= 0) goto L2d
            java.lang.String r5 = r4.readUTF()     // Catch: java.lang.Throwable -> L36 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L3a
            java.lang.Object r6 = r4.readObject()     // Catch: java.lang.Throwable -> L36 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L3a
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L36 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L3a
            int r8 = r8 + (-1)
            goto L1d
        L2d:
            r4.close()     // Catch: java.io.IOException -> L31
            goto L51
        L31:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
            goto L51
        L36:
            r8 = move-exception
            goto L5f
        L38:
            r8 = move-exception
            goto L44
        L3a:
            r8 = move-exception
            goto L44
        L3c:
            r2 = move-exception
            goto L61
        L3e:
            r4 = move-exception
            goto L41
        L40:
            r4 = move-exception
        L41:
            r7 = r4
            r4 = r8
            r8 = r7
        L44:
            android.util.Log.e(r1, r0, r8)     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L51
            r4.close()     // Catch: java.io.IOException -> L4d
            goto L51
        L4d:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
        L51:
            r3.close()     // Catch: java.io.IOException -> L55
            goto L59
        L55:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
        L59:
            androidx.work.h r8 = new androidx.work.h
            r8.<init>(r2)
            return r8
        L5f:
            r2 = r8
            r8 = r4
        L61:
            if (r8 == 0) goto L6b
            r8.close()     // Catch: java.io.IOException -> L67
            goto L6b
        L67:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
        L6b:
            r3.close()     // Catch: java.io.IOException -> L6f
            goto L73
        L6f:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
        L73:
            throw r2
        L74:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.h.a(byte[]):androidx.work.h");
    }

    public static byte[] c(h hVar) {
        ObjectOutputStream objectOutputStream;
        String str = f2196b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeInt(hVar.a.size());
                    for (Map.Entry entry : hVar.a.entrySet()) {
                        objectOutputStream.writeUTF((String) entry.getKey());
                        objectOutputStream.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream.close();
                    } catch (IOException e2) {
                        Log.e(str, "Error in Data#toByteArray: ", e2);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e10) {
                        Log.e(str, "Error in Data#toByteArray: ", e10);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e11) {
                    e = e11;
                    objectOutputStream2 = objectOutputStream;
                    Log.e(str, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e12) {
                            Log.e(str, "Error in Data#toByteArray: ", e12);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e13) {
                        Log.e(str, "Error in Data#toByteArray: ", e13);
                    }
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e14) {
                            Log.e(str, "Error in Data#toByteArray: ", e14);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e15) {
                        Log.e(str, "Error in Data#toByteArray: ", e15);
                        throw th;
                    }
                }
            } catch (IOException e16) {
                e = e16;
            }
        } catch (Throwable th3) {
            th = th3;
            objectOutputStream = null;
        }
    }

    public final String b(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        HashMap hashMap = this.a;
        Set<String> keySet = hashMap.keySet();
        if (!keySet.equals(hVar.a.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = hashMap.get(str);
            Object obj3 = hVar.a.get(str);
            if (obj2 != null && obj3 != null) {
                if ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) {
                    z10 = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                } else {
                    z10 = obj2.equals(obj3);
                }
            } else if (obj2 == obj3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        HashMap hashMap = this.a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = hashMap.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    public h(HashMap hashMap) {
        this.a = new HashMap(hashMap);
    }
}
