package z4;

import B3.g;
import U4.y;
import android.content.Context;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.skydoves.balloon.radius.RadiusLayout;
import com.skydoves.balloon.vectortext.VectorTextView;
import com.vungle.ads.internal.a0;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import r4.d;
import u4.AbstractC2762g;
import v4.C2852d;
import w4.C2869b0;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public Object f24545a;
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f24546c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f24547d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f24548e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f24549f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f24550g;

    public c(FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, RadiusLayout radiusLayout, FrameLayout frameLayout3, VectorTextView vectorTextView, FrameLayout frameLayout4) {
        this.f24545a = frameLayout;
        this.b = frameLayout2;
        this.f24546c = imageView;
        this.f24547d = radiusLayout;
        this.f24548e = frameLayout3;
        this.f24549f = vectorTextView;
        this.f24550g = frameLayout4;
    }

    public static synchronized void c(File file) {
        synchronized (c.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return;
                    }
                    String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str, null);
                    }
                    file.delete();
                }
                if (!file.mkdirs()) {
                    Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean d(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                d(file2);
            }
        }
        return file.delete();
    }

    public static List e(Object[] objArr) {
        if (objArr == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(objArr);
    }

    public void a(String str) {
        File file = new File((File) this.b, str);
        if (file.exists() && d(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public File b(String str, String str2) {
        File file = new File((File) this.f24547d, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public void f(String str) {
        H0.b bVar = (H0.b) this.f24548e;
        synchronized (bVar) {
            try {
                if (((C2852d) ((AtomicMarkableReference) bVar.f1345c).getReference()).b(str)) {
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) bVar.f1345c;
                    atomicMarkableReference.set((C2852d) atomicMarkableReference.getReference(), true);
                    a0 a0Var = new a0(bVar, 4);
                    AtomicReference atomicReference = (AtomicReference) bVar.f1346d;
                    while (!atomicReference.compareAndSet(null, a0Var)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    ((y) ((c) bVar.f1347e).f24546c).k(a0Var);
                }
            } finally {
            }
        }
    }

    public c(Context context) {
        String str;
        String replaceAll;
        String str2 = ((C2869b0) d.b.e(context)).f23827a;
        this.f24545a = str2;
        File filesDir = context.getFilesDir();
        this.b = filesDir;
        if (!str2.isEmpty()) {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            if (str2.length() > 40) {
                replaceAll = AbstractC2762g.i(str2);
            } else {
                replaceAll = str2.replaceAll("[^a-zA-Z0-9.]", "_");
            }
            sb.append(replaceAll);
            str = sb.toString();
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        c(file);
        this.f24546c = file;
        File file2 = new File(file, "open-sessions");
        c(file2);
        this.f24547d = file2;
        File file3 = new File(file, "reports");
        c(file3);
        this.f24548e = file3;
        File file4 = new File(file, "priority-reports");
        c(file4);
        this.f24549f = file4;
        File file5 = new File(file, "native-reports");
        c(file5);
        this.f24550g = file5;
    }

    public c(String str, c cVar, y yVar) {
        this.f24547d = new H0.b(this, false);
        this.f24548e = new H0.b(this, true);
        this.f24549f = new g(10);
        this.f24550g = new AtomicMarkableReference(null, false);
        this.f24545a = str;
        this.b = new v4.g(cVar);
        this.f24546c = yVar;
    }
}
