package ob;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.mediation.ads.e;
import com.facebook.internal.k0;
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
import java.util.concurrent.atomic.AtomicInteger;
import jb.i;
import m2.l;
import mb.o2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f23284e = Charset.forName("UTF-8");

    /* renamed from: f, reason: collision with root package name */
    public static final int f23285f = 15;

    /* renamed from: g, reason: collision with root package name */
    public static final nb.c f23286g = new nb.c();

    /* renamed from: h, reason: collision with root package name */
    public static final k0.b f23287h = new k0.b(27);

    /* renamed from: i, reason: collision with root package name */
    public static final k0 f23288i = new k0(7);
    public final AtomicInteger a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final c f23289b;

    /* renamed from: c, reason: collision with root package name */
    public final l f23290c;

    /* renamed from: d, reason: collision with root package name */
    public final i f23291d;

    public a(c cVar, l lVar, i iVar) {
        this.f23289b = cVar;
        this.f23290c = lVar;
        this.f23291d = iVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String d(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f23284e);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void e(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f23284e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        c cVar = this.f23289b;
        arrayList.addAll(c.s(((File) cVar.f23296f).listFiles()));
        arrayList.addAll(c.s(((File) cVar.f23297g).listFiles()));
        k0.b bVar = f23287h;
        Collections.sort(arrayList, bVar);
        List s5 = c.s(((File) cVar.f23295e).listFiles());
        Collections.sort(s5, bVar);
        arrayList.addAll(s5);
        return arrayList;
    }

    public final void c(o2 o2Var, String str, boolean z10) {
        String str2;
        c cVar = this.f23289b;
        int i10 = this.f23290c.f().a.a;
        f23286g.getClass();
        String c10 = nb.c.a.c(o2Var);
        String format = String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement()));
        if (z10) {
            str2 = "_";
        } else {
            str2 = "";
        }
        try {
            e(cVar.o(str, e.f(NotificationCompat.CATEGORY_EVENT, format, str2)), c10);
        } catch (IOException e2) {
            b6.a.f2288f.i("Could not persist event for session " + str, e2);
        }
        k0 k0Var = new k0(8);
        cVar.getClass();
        File file = new File((File) cVar.f23294d, str);
        file.mkdirs();
        List<File> s5 = c.s(file.listFiles(k0Var));
        Collections.sort(s5, new k0.b(28));
        int size = s5.size();
        for (File file2 : s5) {
            if (size > i10) {
                c.r(file2);
                size--;
            } else {
                return;
            }
        }
    }
}
