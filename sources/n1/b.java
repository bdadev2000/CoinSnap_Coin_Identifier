package n1;

import a4.j;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class b {
    public static final HashSet a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f22377b;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r2 < 1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    static {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            n1.b.a = r0
            java.lang.String r0 = "java.vm.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L42
            java.util.StringTokenizer r1 = new java.util.StringTokenizer
            java.lang.String r2 = "."
            r1.<init>(r0, r2)
            boolean r2 = r1.hasMoreTokens()
            r3 = 0
            if (r2 == 0) goto L22
            java.lang.String r2 = r1.nextToken()
            goto L23
        L22:
            r2 = r3
        L23:
            boolean r4 = r1.hasMoreTokens()
            if (r4 == 0) goto L2d
            java.lang.String r3 = r1.nextToken()
        L2d:
            if (r2 == 0) goto L42
            if (r3 == 0) goto L42
            int r1 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L42
            int r2 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L42
            r3 = 1
            r4 = 2
            if (r1 > r4) goto L43
            if (r1 != r4) goto L42
            if (r2 < r3) goto L42
            goto L43
        L42:
            r3 = 0
        L43:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "VM with version "
            r1.<init>(r2)
            r1.append(r0)
            if (r3 == 0) goto L52
            java.lang.String r0 = " has multidex support"
            goto L54
        L52:
            java.lang.String r0 = " does not have multidex support"
        L54:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "MultiDex"
            android.util.Log.i(r1, r0)
            n1.b.f22377b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.b.<clinit>():void");
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053 A[Catch: all -> 0x00ae, DONT_GENERATE, TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0009, B:6:0x000f, B:9:0x0011, B:12:0x003b, B:13:0x003f, B:17:0x0053, B:21:0x0061, B:23:0x0068, B:24:0x0078, B:31:0x00a0, B:33:0x00a7, B:35:0x00a9, B:44:0x00aa, B:45:0x00ad, B:49:0x006c, B:52:0x005a, B:53:0x0044, B:57:0x004b, B:20:0x0055, B:27:0x0086, B:29:0x008a, B:40:0x0091), top: B:3:0x0009, inners: #1, #4, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.content.Context r7, java.io.File r8, java.io.File r9) {
        /*
            java.lang.String r0 = "secondary-dexes"
            java.lang.String r1 = ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\""
            java.lang.String r2 = "MultiDex is not guaranteed to work in SDK version "
            java.util.HashSet r3 = n1.b.a
            monitor-enter(r3)
            boolean r4 = r3.contains(r8)     // Catch: java.lang.Throwable -> Lae
            if (r4 == 0) goto L11
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lae
            return
        L11:
            r3.add(r8)     // Catch: java.lang.Throwable -> Lae
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lae
            java.lang.String r5 = "MultiDex"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lae
            r6.<init>(r2)     // Catch: java.lang.Throwable -> Lae
            r6.append(r4)     // Catch: java.lang.Throwable -> Lae
            r6.append(r1)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r1 = "java.vm.version"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.Throwable -> Lae
            r6.append(r1)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r1 = "\""
            r6.append(r1)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> Lae
            android.util.Log.w(r5, r1)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r1 = "MultiDex"
            r2 = 0
            java.lang.ClassLoader r4 = r7.getClassLoader()     // Catch: java.lang.RuntimeException -> L4a java.lang.Throwable -> Lae
            boolean r5 = r4 instanceof dalvik.system.BaseDexClassLoader     // Catch: java.lang.Throwable -> Lae
            if (r5 == 0) goto L44
            goto L51
        L44:
            java.lang.String r4 = "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching."
            android.util.Log.e(r1, r4)     // Catch: java.lang.Throwable -> Lae
            goto L50
        L4a:
            r4 = move-exception
            java.lang.String r5 = "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching."
            android.util.Log.w(r1, r5, r4)     // Catch: java.lang.Throwable -> Lae
        L50:
            r4 = r2
        L51:
            if (r4 != 0) goto L55
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lae
            return
        L55:
            a(r7)     // Catch: java.lang.Throwable -> L59
            goto L61
        L59:
            r1 = move-exception
            java.lang.String r5 = "MultiDex"
            java.lang.String r6 = "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning."
            android.util.Log.w(r5, r6, r1)     // Catch: java.lang.Throwable -> Lae
        L61:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Lae
            java.lang.String r5 = "code_cache"
            r1.<init>(r9, r5)     // Catch: java.lang.Throwable -> Lae
            e(r1)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> Lae
            goto L78
        L6c:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Lae
            java.io.File r9 = r7.getFilesDir()     // Catch: java.lang.Throwable -> Lae
            r1.<init>(r9, r5)     // Catch: java.lang.Throwable -> Lae
            e(r1)     // Catch: java.lang.Throwable -> Lae
        L78:
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> Lae
            r9.<init>(r1, r0)     // Catch: java.lang.Throwable -> Lae
            e(r9)     // Catch: java.lang.Throwable -> Lae
            n1.e r0 = new n1.e     // Catch: java.lang.Throwable -> Lae
            r0.<init>(r8, r9)     // Catch: java.lang.Throwable -> Lae
            r8 = 0
            java.util.ArrayList r8 = r0.k(r7, r8)     // Catch: java.lang.Throwable -> L8e
            d(r9, r4, r8)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            goto La0
        L8e:
            r7 = move-exception
            goto Laa
        L90:
            r8 = move-exception
            java.lang.String r1 = "MultiDex"
            java.lang.String r5 = "Failed to install extracted secondary dex files, retrying with forced extraction"
            android.util.Log.w(r1, r5, r8)     // Catch: java.lang.Throwable -> L8e
            r8 = 1
            java.util.ArrayList r7 = r0.k(r7, r8)     // Catch: java.lang.Throwable -> L8e
            d(r9, r4, r7)     // Catch: java.lang.Throwable -> L8e
        La0:
            r0.close()     // Catch: java.io.IOException -> La4 java.lang.Throwable -> Lae
            goto La5
        La4:
            r2 = move-exception
        La5:
            if (r2 != 0) goto La9
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lae
            return
        La9:
            throw r2     // Catch: java.lang.Throwable -> Lae
        Laa:
            r0.close()     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Lae
        Lad:
            throw r7     // Catch: java.lang.Throwable -> Lae
        Lae:
            r7 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lae
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.b.b(android.content.Context, java.io.File, java.io.File):void");
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
        StringBuilder o10 = j.o("Field ", str, " not found in ");
        o10.append(obj.getClass());
        throw new NoSuchFieldException(o10.toString());
    }

    public static void d(File file, ClassLoader classLoader, ArrayList arrayList) {
        IOException[] iOExceptionArr;
        if (!arrayList.isEmpty()) {
            Object obj = c(classLoader, "pathList").get(classLoader);
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
                    Field c10 = c(obj, "dexElements");
                    Object[] objArr2 = (Object[]) c10.get(obj);
                    Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
                    System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
                    System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
                    c10.set(obj, objArr3);
                    if (arrayList2.size() > 0) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                        }
                        Field c11 = c(obj, "dexElementsSuppressedExceptions");
                        IOException[] iOExceptionArr2 = (IOException[]) c11.get(obj);
                        if (iOExceptionArr2 == null) {
                            iOExceptionArr = (IOException[]) arrayList2.toArray(new IOException[arrayList2.size()]);
                        } else {
                            IOException[] iOExceptionArr3 = new IOException[arrayList2.size() + iOExceptionArr2.length];
                            arrayList2.toArray(iOExceptionArr3);
                            System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList2.size(), iOExceptionArr2.length);
                            iOExceptionArr = iOExceptionArr3;
                        }
                        c11.set(obj, iOExceptionArr);
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
