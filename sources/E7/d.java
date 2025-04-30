package e7;

import G7.j;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.vungle.ads.L;
import com.vungle.ads.internal.util.n;
import com.vungle.ads.internal.util.v;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class d {
    public static final c Companion = new c(null);
    private static final String OM_SDK_JS = "omsdk.js";
    private static final String OM_SESSION_JS = "omsdk-session.js";
    private final AtomicReference<Context> contextRef;
    private final Handler uiHandler;

    public d(Context context) {
        j.e(context, "context");
        this.uiHandler = new Handler(Looper.getMainLooper());
        this.contextRef = new AtomicReference<>(context.getApplicationContext());
    }

    public static /* synthetic */ void a(d dVar) {
        m121init$lambda0(dVar);
    }

    /* renamed from: init$lambda-0 */
    public static final void m121init$lambda0(d dVar) {
        j.e(dVar, "this$0");
        try {
            if (!Y5.a.f3816a.f1512a) {
                Y5.a.a(dVar.contextRef.get());
            }
        } catch (NoClassDefFoundError e4) {
            v.Companion.e("OMSDK", "error: " + e4.getLocalizedMessage());
        }
    }

    private final File writeToFile(String str, File file) throws IOException {
        FileWriter fileWriter;
        FileWriter fileWriter2 = null;
        try {
            fileWriter = new FileWriter(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileWriter.write(str);
            fileWriter.flush();
            n.INSTANCE.closeQuietly(fileWriter);
            return file;
        } catch (Throwable th2) {
            th = th2;
            fileWriter2 = fileWriter;
            n.INSTANCE.closeQuietly(fileWriter2);
            throw th;
        }
    }

    public final void init() {
        this.uiHandler.post(new L(this, 3));
    }

    public final List<File> injectJsFiles(File file) throws IOException {
        j.e(file, "dir");
        ArrayList arrayList = new ArrayList();
        h hVar = h.INSTANCE;
        arrayList.add(writeToFile(hVar.getOM_JS$vungle_ads_release(), new File(file, OM_SDK_JS)));
        arrayList.add(writeToFile(hVar.getOM_SESSION_JS$vungle_ads_release(), new File(file, OM_SESSION_JS)));
        return arrayList;
    }
}
