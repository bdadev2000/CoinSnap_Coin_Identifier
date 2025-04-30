package w6;

import G7.j;
import android.content.Context;
import com.tools.arruler.models.InternalImageModel;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import u7.C2824o;

/* renamed from: w6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2910a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23994a;

    public C2910a(Context context) {
        j.e(context, "context");
        this.f23994a = context;
    }

    public final List a() {
        File file = new File(this.f23994a.getCacheDir(), "images");
        if (!file.exists()) {
            return C2824o.b;
        }
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    String name = file2.getName();
                    j.d(name, "getName(...)");
                    if (!name.endsWith(".png")) {
                        String name2 = file2.getName();
                        j.d(name2, "getName(...)");
                        if (!name2.endsWith(".jpg")) {
                        }
                    }
                    String W2 = D7.a.W(file2);
                    long lastModified = file2.lastModified();
                    String absolutePath = file2.getAbsolutePath();
                    j.d(absolutePath, "getAbsolutePath(...)");
                    arrayList.add(new InternalImageModel(absolutePath, W2, lastModified));
                }
            }
        }
        return arrayList;
    }
}
