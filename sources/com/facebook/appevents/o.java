package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import androidx.emoji2.text.x;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.k1;
import androidx.recyclerview.widget.v0;
import androidx.work.y;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.plantcare.ai.identifier.plantid.R;
import f2.f0;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.List;
import java.util.zip.ZipException;
import kotlin.UShort;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import v1.c0;

/* loaded from: classes3.dex */
public abstract class o {
    public static boolean a = true;

    /* renamed from: b, reason: collision with root package name */
    public static Field f10958b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f10959c;

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x005c: MOVE (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:93), block:B:35:0x005b */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.work.f a(byte[] r7) {
        /*
            androidx.work.f r0 = new androidx.work.f
            r0.<init>()
            if (r7 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L41
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L41
            int r7 = r2.readInt()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
        L17:
            if (r7 <= 0) goto L32
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            androidx.work.e r5 = new androidx.work.e     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            java.util.HashSet r3 = r0.a     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r3.add(r5)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            int r7 = r7 + (-1)
            goto L17
        L32:
            r2.close()     // Catch: java.io.IOException -> L36
            goto L52
        L36:
            r7 = move-exception
            r7.printStackTrace()
            goto L52
        L3b:
            r7 = move-exception
            goto L5b
        L3d:
            r7 = move-exception
            goto L45
        L3f:
            r0 = move-exception
            goto L5d
        L41:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L45:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L52
            r2.close()     // Catch: java.io.IOException -> L4e
            goto L52
        L4e:
            r7 = move-exception
            r7.printStackTrace()
        L52:
            r1.close()     // Catch: java.io.IOException -> L56
            goto L5a
        L56:
            r7 = move-exception
            r7.printStackTrace()
        L5a:
            return r0
        L5b:
            r0 = r7
            r7 = r2
        L5d:
            if (r7 == 0) goto L67
            r7.close()     // Catch: java.io.IOException -> L63
            goto L67
        L63:
            r7 = move-exception
            r7.printStackTrace()
        L67:
            r1.close()     // Catch: java.io.IOException -> L6b
            goto L6f
        L6b:
            r7 = move-exception
            r7.printStackTrace()
        L6f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.o.a(byte[]):androidx.work.f");
    }

    public static int b(k1 k1Var, OrientationHelper orientationHelper, View view, View view2, v0 v0Var, boolean z10) {
        if (v0Var.getChildCount() != 0 && k1Var.b() != 0 && view != null && view2 != null) {
            if (!z10) {
                return Math.abs(v0Var.getPosition(view) - v0Var.getPosition(view2)) + 1;
            }
            return Math.min(orientationHelper.getTotalSpace(), orientationHelper.getDecoratedEnd(view2) - orientationHelper.getDecoratedStart(view));
        }
        return 0;
    }

    public static int c(k1 k1Var, OrientationHelper orientationHelper, View view, View view2, v0 v0Var, boolean z10, boolean z11) {
        int max;
        if (v0Var.getChildCount() == 0 || k1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(v0Var.getPosition(view), v0Var.getPosition(view2));
        int max2 = Math.max(v0Var.getPosition(view), v0Var.getPosition(view2));
        if (z11) {
            max = Math.max(0, (k1Var.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z10) {
            return max;
        }
        return Math.round((max * (Math.abs(orientationHelper.getDecoratedEnd(view2) - orientationHelper.getDecoratedStart(view)) / (Math.abs(v0Var.getPosition(view) - v0Var.getPosition(view2)) + 1))) + (orientationHelper.getStartAfterPadding() - orientationHelper.getDecoratedStart(view)));
    }

    public static int d(k1 k1Var, OrientationHelper orientationHelper, View view, View view2, v0 v0Var, boolean z10) {
        if (v0Var.getChildCount() != 0 && k1Var.b() != 0 && view != null && view2 != null) {
            if (!z10) {
                return k1Var.b();
            }
            return (int) (((orientationHelper.getDecoratedEnd(view2) - orientationHelper.getDecoratedStart(view)) / (Math.abs(v0Var.getPosition(view) - v0Var.getPosition(view2)) + 1)) * k1Var.b());
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048 A[EDGE_INSN: B:12:0x0048->B:13:0x0048 BREAK  A[LOOP:0: B:2:0x0022->B:25:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:2:0x0022->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.emoji2.text.m e(android.content.Context r7) {
        /*
            f.a r0 = new f.a
            r1 = 0
            r0.<init>(r1)
            android.content.pm.PackageManager r2 = r7.getPackageManager()
            java.lang.String r3 = "Package manager required to locate emoji font provider"
            com.bumptech.glide.e.l(r2, r3)
            java.lang.Object r3 = r0.f17509c
            ac.e r3 = (ac.e) r3
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "androidx.content.action.LOAD_EMOJI_FONT"
            r4.<init>(r5)
            java.util.List r3 = r3.q(r2, r4)
            java.util.Iterator r3 = r3.iterator()
        L22:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L47
            java.lang.Object r4 = r3.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            java.lang.Object r5 = r0.f17509c
            ac.e r5 = (ac.e) r5
            android.content.pm.ProviderInfo r4 = r5.j(r4)
            if (r4 == 0) goto L43
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 == 0) goto L43
            int r5 = r5.flags
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L43
            goto L44
        L43:
            r6 = 0
        L44:
            if (r6 == 0) goto L22
            goto L48
        L47:
            r4 = r1
        L48:
            if (r4 != 0) goto L4b
            goto L56
        L4b:
            k0.c r0 = r0.k(r4, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            goto L57
        L50:
            r0 = move-exception
            java.lang.String r2 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r2, r0)
        L56:
            r0 = r1
        L57:
            if (r0 != 0) goto L5a
            goto L5f
        L5a:
            androidx.emoji2.text.m r1 = new androidx.emoji2.text.m
            r1.<init>(r7, r0)
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.o.e(android.content.Context):androidx.emoji2.text.m");
    }

    public static final c0 f(Context context, Class klass, String str) {
        boolean z10;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        if (StringsKt.isBlank(str)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return new c0(context, klass, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
    }

    public static InvocationHandler g() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = l2.f.b();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, new Object[0]).getClass().getClassLoader();
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    public static x h(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length() - 22;
        long j3 = 0;
        if (length >= 0) {
            long j10 = length - 65536;
            if (j10 >= 0) {
                j3 = j10;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    x xVar = new x();
                    xVar.f1549b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    xVar.a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    return xVar;
                }
                length--;
            } while (length >= j3);
            throw new ZipException("End Of Central Directory signature not found");
        }
        throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
    }

    public static final Object i(Context context, Class entryPoint) {
        Application application;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            application = (Application) applicationContext;
        } else {
            Context context2 = applicationContext;
            while (context2 instanceof ContextWrapper) {
                context2 = ((ContextWrapper) context2).getBaseContext();
                if (context2 instanceof Application) {
                    application = (Application) context2;
                }
            }
            throw new IllegalStateException("Could not find an Application in the given context: " + applicationContext);
        }
        return com.facebook.internal.i.r(entryPoint, application);
    }

    public static final int j(Cursor c10, String name) {
        String str;
        boolean z10;
        boolean endsWith$default;
        boolean endsWith$default2;
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = c10.getColumnIndex(name);
        if (columnIndex < 0) {
            columnIndex = c10.getColumnIndex("`" + name + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25) {
                    if (name.length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        String[] columnNames = c10.getColumnNames();
                        Intrinsics.checkNotNullExpressionValue(columnNames, "columnNames");
                        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
                        Intrinsics.checkNotNullParameter(name, "name");
                        String concat = ".".concat(name);
                        String l10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.l(".", name, '`');
                        int length = columnNames.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (i11 < length) {
                            String str2 = columnNames[i11];
                            int i12 = i10 + 1;
                            if (str2.length() >= name.length() + 2) {
                                endsWith$default = StringsKt__StringsJVMKt.endsWith$default(str2, concat, false, 2, null);
                                if (!endsWith$default) {
                                    if (str2.charAt(0) == '`') {
                                        endsWith$default2 = StringsKt__StringsJVMKt.endsWith$default(str2, l10, false, 2, null);
                                        if (endsWith$default2) {
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                columnIndex = i10;
                                break;
                            }
                            i11++;
                            i10 = i12;
                        }
                    }
                }
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = c10.getColumnNames();
            Intrinsics.checkNotNullExpressionValue(columnNames2, "c.columnNames");
            str = ArraysKt.m(columnNames2, null, null, null, null, 63);
        } catch (Exception e2) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e2);
            str = AppLovinMediationProvider.UNKNOWN;
        }
        throw new IllegalArgumentException(eb.j.l("column '", name, "' does not exist. Available columns: ", str));
    }

    public static int k(h4.h hVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new n4.w(inputStream, hVar);
        }
        inputStream.mark(5242880);
        return l(list, new d3.g(17, inputStream, hVar));
    }

    public static int l(List list, e4.h hVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int j3 = hVar.j((e4.f) list.get(i10));
            if (j3 != -1) {
                return j3;
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType n(h4.h hVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new n4.w(inputStream, hVar);
        }
        inputStream.mark(5242880);
        return p(list, new f.a(inputStream, 17));
    }

    public static ImageHeaderParser$ImageType o(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        return p(list, new v3.c(byteBuffer, 15));
    }

    public static ImageHeaderParser$ImageType p(List list, e4.i iVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser$ImageType n10 = iVar.n((e4.f) list.get(i10));
            if (n10 != ImageHeaderParser$ImageType.UNKNOWN) {
                return n10;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static int q(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.i("Could not convert ", i10, " to BackoffPolicy"));
    }

    public static androidx.work.q r(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i10 == 5) {
                                return androidx.work.q.TEMPORARILY_UNMETERED;
                            }
                            throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.i("Could not convert ", i10, " to NetworkType"));
                        }
                        return androidx.work.q.METERED;
                    }
                    return androidx.work.q.NOT_ROAMING;
                }
                return androidx.work.q.UNMETERED;
            }
            return androidx.work.q.CONNECTED;
        }
        return androidx.work.q.NOT_REQUIRED;
    }

    public static int s(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.i("Could not convert ", i10, " to OutOfQuotaPolicy"));
    }

    public static y t(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                return y.CANCELLED;
                            }
                            throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.i("Could not convert ", i10, " to State"));
                        }
                        return y.BLOCKED;
                    }
                    return y.FAILED;
                }
                return y.SUCCEEDED;
            }
            return y.RUNNING;
        }
        return y.ENQUEUED;
    }

    public static d1.b u(MappedByteBuffer mappedByteBuffer) {
        long j3;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        androidx.emoji2.text.w wVar = new androidx.emoji2.text.w(0, duplicate);
        wVar.b(4);
        ByteBuffer byteBuffer = wVar.f1548b;
        int i10 = byteBuffer.getShort() & UShort.MAX_VALUE;
        if (i10 <= 100) {
            wVar.b(6);
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    int i12 = byteBuffer.getInt();
                    wVar.b(4);
                    j3 = wVar.a();
                    wVar.b(4);
                    if (1835365473 == i12) {
                        break;
                    }
                    i11++;
                } else {
                    j3 = -1;
                    break;
                }
            }
            if (j3 != -1) {
                wVar.b((int) (j3 - byteBuffer.position()));
                wVar.b(12);
                long a10 = wVar.a();
                for (int i13 = 0; i13 < a10; i13++) {
                    int i14 = byteBuffer.getInt();
                    long a11 = wVar.a();
                    long a12 = wVar.a();
                    if (1164798569 == i14 || 1701669481 == i14) {
                        duplicate.position((int) new x(a11 + j3, a12).a);
                        d1.b bVar = new d1.b();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        bVar.b(duplicate.position() + duplicate.getInt(duplicate.position()), duplicate);
                        return bVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final void v(View view, y1.f fVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, fVar);
    }

    public static int y(y yVar) {
        int ordinal = yVar.ordinal();
        if (ordinal != 0) {
            int i10 = 1;
            if (ordinal != 1) {
                i10 = 2;
                if (ordinal != 2) {
                    i10 = 3;
                    if (ordinal != 3) {
                        i10 = 4;
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return 5;
                            }
                            throw new IllegalArgumentException("Could not convert " + yVar + " to int");
                        }
                    }
                }
            }
            return i10;
        }
        return 0;
    }

    public static int z() {
        if (Build.VERSION.SDK_INT >= 30) {
            return o1.a.a.a();
        }
        return 0;
    }

    public float m(View view) {
        if (a) {
            try {
                return f0.a(view);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        return view.getAlpha();
    }

    public void w(View view, float f10) {
        if (a) {
            try {
                f0.b(view, f10);
                return;
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        view.setAlpha(f10);
    }

    public void x(View view, int i10) {
        if (!f10959c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f10958b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f10959c = true;
        }
        Field field = f10958b;
        if (field != null) {
            try {
                f10958b.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
