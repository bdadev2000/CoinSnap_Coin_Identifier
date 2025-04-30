package z4;

import L2.e;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentTransaction;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import u4.C2764i;
import w4.L0;
import x0.AbstractC2914a;
import x4.C2923a;

/* renamed from: z4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2972a {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f24536e = Charset.forName("UTF-8");

    /* renamed from: f, reason: collision with root package name */
    public static final int f24537f = 15;

    /* renamed from: g, reason: collision with root package name */
    public static final C2923a f24538g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static final M2.b f24539h = new M2.b(6);

    /* renamed from: i, reason: collision with root package name */
    public static final e f24540i = new e(7);

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f24541a = new AtomicInteger(0);
    public final c b;

    /* renamed from: c, reason: collision with root package name */
    public final B4.c f24542c;

    /* renamed from: d, reason: collision with root package name */
    public final C2764i f24543d;

    public C2972a(c cVar, B4.c cVar2, C2764i c2764i) {
        this.b = cVar;
        this.f24542c = cVar2;
        this.f24543d = c2764i;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f24536e);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f24536e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        c cVar = this.b;
        arrayList.addAll(c.e(((File) cVar.f24549f).listFiles()));
        arrayList.addAll(c.e(((File) cVar.f24550g).listFiles()));
        M2.b bVar = f24539h;
        Collections.sort(arrayList, bVar);
        List e4 = c.e(((File) cVar.f24548e).listFiles());
        Collections.sort(e4, bVar);
        arrayList.addAll(e4);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(c.e(((File) this.b.f24547d).list())).descendingSet();
    }

    public final void d(L0 l02, String str, boolean z8) {
        String str2;
        c cVar = this.b;
        int i9 = this.f24542c.f().f311a.b;
        f24538g.getClass();
        String m = C2923a.f24234a.m(l02);
        String format = String.format(Locale.US, "%010d", Integer.valueOf(this.f24541a.getAndIncrement()));
        if (z8) {
            str2 = "_";
        } else {
            str2 = "";
        }
        try {
            f(cVar.b(str, AbstractC2914a.e(NotificationCompat.CATEGORY_EVENT, format, str2)), m);
        } catch (IOException e4) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e4);
        }
        e eVar = new e(8);
        cVar.getClass();
        File file = new File((File) cVar.f24547d, str);
        file.mkdirs();
        List<File> e9 = c.e(file.listFiles(eVar));
        Collections.sort(e9, new M2.b(7));
        int size = e9.size();
        for (File file2 : e9) {
            if (size > i9) {
                c.d(file2);
                size--;
            } else {
                return;
            }
        }
    }
}
