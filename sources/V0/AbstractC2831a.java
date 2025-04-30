package v0;

import android.content.Context;
import android.util.Log;
import com.mbridge.msdk.foundation.entity.o;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2831a {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f23452a = new HashSet();
    public static final boolean b;

    static {
        String str;
        String str2;
        String property = System.getProperty("java.vm.version");
        boolean z8 = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            String str3 = null;
            if (stringTokenizer.hasMoreTokens()) {
                str2 = stringTokenizer.nextToken();
            } else {
                str2 = null;
            }
            if (stringTokenizer.hasMoreTokens()) {
                str3 = stringTokenizer.nextToken();
            }
            if (str2 != null && str3 != null) {
                try {
                    int parseInt = Integer.parseInt(str2);
                    int parseInt2 = Integer.parseInt(str3);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z8 = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder("VM with version ");
        sb.append(property);
        if (z8) {
            str = " has multidex support";
        } else {
            str = " does not have multidex support";
        }
        sb.append(str);
        Log.i("MultiDex", sb.toString());
        b = z8;
    }

    public static void a(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            Log.i("MultiDex", "Clearing old secondary dex dir (" + file.getPath() + ").");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : listFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (!file2.delete()) {
                    Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
                } else {
                    Log.i("MultiDex", "Deleted old file " + file2.getPath());
                }
            }
            if (!file.delete()) {
                Log.w("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
            } else {
                Log.i("MultiDex", "Deleted old secondary dex dir " + file.getPath());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057 A[Catch: all -> 0x0011, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {all -> 0x0011, blocks: (B:4:0x0009, B:6:0x000f, B:9:0x0014, B:12:0x003e, B:13:0x0042, B:17:0x0057, B:21:0x0065, B:23:0x006c, B:24:0x007c, B:32:0x00a7, B:34:0x00ae, B:36:0x00b0, B:43:0x00b2, B:44:0x00b5, B:48:0x0070, B:51:0x005e, B:52:0x0047, B:56:0x004f, B:27:0x008a, B:29:0x008e, B:40:0x0096, B:20:0x0059), top: B:3:0x0009, inners: #0, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.content.Context r7, java.io.File r8, java.io.File r9) {
        /*
            java.lang.String r0 = "secondary-dexes"
            java.lang.String r1 = ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\""
            java.lang.String r2 = "MultiDex is not guaranteed to work in SDK version "
            java.util.HashSet r3 = v0.AbstractC2831a.f23452a
            monitor-enter(r3)
            boolean r4 = r3.contains(r8)     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto L14
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r7 = move-exception
            goto Lb6
        L14:
            r3.add(r8)     // Catch: java.lang.Throwable -> L11
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L11
            java.lang.String r5 = "MultiDex"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L11
            r6.append(r4)     // Catch: java.lang.Throwable -> L11
            r6.append(r1)     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = "java.vm.version"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.Throwable -> L11
            r6.append(r1)     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = "\""
            r6.append(r1)     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L11
            android.util.Log.w(r5, r1)     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = "MultiDex"
            r2 = 0
            java.lang.ClassLoader r4 = r7.getClassLoader()     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L4e
            boolean r5 = r4 instanceof dalvik.system.BaseDexClassLoader     // Catch: java.lang.Throwable -> L11
            if (r5 == 0) goto L47
            goto L55
        L47:
            java.lang.String r4 = "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching."
            android.util.Log.e(r1, r4)     // Catch: java.lang.Throwable -> L11
        L4c:
            r4 = r2
            goto L55
        L4e:
            r4 = move-exception
            java.lang.String r5 = "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching."
            android.util.Log.w(r1, r5, r4)     // Catch: java.lang.Throwable -> L11
            goto L4c
        L55:
            if (r4 != 0) goto L59
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            return
        L59:
            a(r7)     // Catch: java.lang.Throwable -> L5d
            goto L65
        L5d:
            r1 = move-exception
            java.lang.String r5 = "MultiDex"
            java.lang.String r6 = "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning."
            android.util.Log.w(r5, r6, r1)     // Catch: java.lang.Throwable -> L11
        L65:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L11
            java.lang.String r5 = "code_cache"
            r1.<init>(r9, r5)     // Catch: java.lang.Throwable -> L11
            e(r1)     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L70
            goto L7c
        L70:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L11
            java.io.File r9 = r7.getFilesDir()     // Catch: java.lang.Throwable -> L11
            r1.<init>(r9, r5)     // Catch: java.lang.Throwable -> L11
            e(r1)     // Catch: java.lang.Throwable -> L11
        L7c:
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> L11
            r9.<init>(r1, r0)     // Catch: java.lang.Throwable -> L11
            e(r9)     // Catch: java.lang.Throwable -> L11
            v0.d r0 = new v0.d     // Catch: java.lang.Throwable -> L11
            r0.<init>(r8, r9)     // Catch: java.lang.Throwable -> L11
            r8 = 0
            java.util.ArrayList r8 = r0.h(r7, r8)     // Catch: java.lang.Throwable -> Lb1
            r1 = r4
            dalvik.system.BaseDexClassLoader r1 = (dalvik.system.BaseDexClassLoader) r1     // Catch: java.io.IOException -> L95 java.lang.Throwable -> Lb1
            d(r1, r9, r8)     // Catch: java.io.IOException -> L95 java.lang.Throwable -> Lb1
            goto La7
        L95:
            r8 = move-exception
            java.lang.String r1 = "MultiDex"
            java.lang.String r5 = "Failed to install extracted secondary dex files, retrying with forced extraction"
            android.util.Log.w(r1, r5, r8)     // Catch: java.lang.Throwable -> Lb1
            r8 = 1
            java.util.ArrayList r7 = r0.h(r7, r8)     // Catch: java.lang.Throwable -> Lb1
            dalvik.system.BaseDexClassLoader r4 = (dalvik.system.BaseDexClassLoader) r4     // Catch: java.lang.Throwable -> Lb1
            d(r4, r9, r7)     // Catch: java.lang.Throwable -> Lb1
        La7:
            r0.close()     // Catch: java.lang.Throwable -> L11 java.io.IOException -> Lab
            goto Lac
        Lab:
            r2 = move-exception
        Lac:
            if (r2 != 0) goto Lb0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            return
        Lb0:
            throw r2     // Catch: java.lang.Throwable -> L11
        Lb1:
            r7 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L11 java.io.IOException -> Lb5
        Lb5:
            throw r7     // Catch: java.lang.Throwable -> L11
        Lb6:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.AbstractC2831a.b(android.content.Context, java.io.File, java.io.File):void");
    }

    public static Field c(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        StringBuilder n2 = o.n("Field ", str, " not found in ");
        n2.append(obj.getClass());
        throw new NoSuchFieldException(n2.toString());
    }

    public static void d(BaseDexClassLoader baseDexClassLoader, File file, ArrayList arrayList) {
        IOException[] iOExceptionArr;
        if (!arrayList.isEmpty()) {
            Object obj = c(baseDexClassLoader, "pathList").get(baseDexClassLoader);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(arrayList);
            Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
            for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod("makeDexElements", clsArr);
                    if (!declaredMethod.isAccessible()) {
                        declaredMethod.setAccessible(true);
                    }
                    Object[] objArr = (Object[]) declaredMethod.invoke(obj, arrayList3, file, arrayList2);
                    Field c9 = c(obj, "dexElements");
                    Object[] objArr2 = (Object[]) c9.get(obj);
                    Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
                    System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
                    System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
                    c9.set(obj, objArr3);
                    if (arrayList2.size() > 0) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                        }
                        Field c10 = c(obj, "dexElementsSuppressedExceptions");
                        IOException[] iOExceptionArr2 = (IOException[]) c10.get(obj);
                        if (iOExceptionArr2 == null) {
                            iOExceptionArr = (IOException[]) arrayList2.toArray(new IOException[arrayList2.size()]);
                        } else {
                            IOException[] iOExceptionArr3 = new IOException[arrayList2.size() + iOExceptionArr2.length];
                            arrayList2.toArray(iOExceptionArr3);
                            System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList2.size(), iOExceptionArr2.length);
                            iOExceptionArr = iOExceptionArr3;
                        }
                        c10.set(obj, iOExceptionArr);
                        IOException iOException = new IOException("I/O exception during makeDexElement");
                        iOException.initCause((Throwable) arrayList2.get(0));
                        throw iOException;
                    }
                    return;
                } catch (NoSuchMethodException unused) {
                }
            }
            throw new NoSuchMethodException("Method makeDexElements with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
        }
    }

    public static void e(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
            } else {
                Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
            }
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }
}
