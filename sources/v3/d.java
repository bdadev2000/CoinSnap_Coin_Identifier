package v3;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import m3.b0;
import m3.n;

/* loaded from: classes.dex */
public final class d {
    public final c a;

    /* renamed from: b, reason: collision with root package name */
    public final com.facebook.b f26022b;

    public d(c cVar, com.facebook.b bVar) {
        this.a = cVar;
        this.f26022b = bVar;
    }

    public final b0 a(Context context, String str, InputStream inputStream, String str2, String str3) {
        b0 f10;
        b0 b0Var;
        b bVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        boolean contains = str2.contains("application/zip");
        c cVar = this.a;
        if (!contains && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            y3.b.a();
            bVar = b.JSON;
            if (str3 != null && cVar != null) {
                b0Var = n.c(new FileInputStream(cVar.E(str, inputStream, bVar).getAbsolutePath()), str);
            } else {
                b0Var = n.c(inputStream, null);
            }
        } else {
            y3.b.a();
            b bVar2 = b.ZIP;
            if (str3 != null && cVar != null) {
                f10 = n.f(context, new ZipInputStream(new FileInputStream(cVar.E(str, inputStream, bVar2))), str);
            } else {
                f10 = n.f(context, new ZipInputStream(inputStream), null);
            }
            b0Var = f10;
            bVar = bVar2;
        }
        if (str3 != null && b0Var.a != null && cVar != null) {
            File file = new File(cVar.D(), c.A(str, bVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean renameTo = file.renameTo(file2);
            file2.toString();
            y3.b.a();
            if (!renameTo) {
                y3.b.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return b0Var;
    }
}
