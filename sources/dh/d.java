package dh;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.vungle.ads.internal.util.n;
import com.vungle.ads.internal.util.v;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {
    public static final c Companion = new c(null);
    private static final String OM_SDK_JS = "omsdk.js";
    private static final String OM_SESSION_JS = "omsdk-session.js";
    private final AtomicReference<Context> contextRef;
    private final Handler uiHandler;

    public d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.uiHandler = new Handler(Looper.getMainLooper());
        this.contextRef = new AtomicReference<>(context.getApplicationContext());
    }

    public static /* synthetic */ void a(d dVar) {
        m129init$lambda0(dVar);
    }

    /* renamed from: init$lambda-0 */
    public static final void m129init$lambda0(d this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            jd.b bVar = com.facebook.appevents.g.f10941f;
            if (!bVar.b()) {
                bVar.a(this$0.contextRef.get().getApplicationContext());
            }
        } catch (NoClassDefFoundError e2) {
            v.Companion.e("OMSDK", "error: " + e2.getLocalizedMessage());
        }
    }

    private final File writeToFile(String str, File file) throws IOException {
        FileWriter fileWriter;
        FileWriter fileWriter2 = null;
        try {
            fileWriter = new FileWriter(file);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            fileWriter.write(str);
            fileWriter.flush();
            n.INSTANCE.closeQuietly(fileWriter);
            return file;
        } catch (Throwable th3) {
            th = th3;
            fileWriter2 = fileWriter;
            n.INSTANCE.closeQuietly(fileWriter2);
            throw th;
        }
    }

    public final void init() {
        this.uiHandler.post(new k8.f(this, 19));
    }

    public final List<File> injectJsFiles(File dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        ArrayList arrayList = new ArrayList();
        h hVar = h.INSTANCE;
        arrayList.add(writeToFile(hVar.getOM_JS$vungle_ads_release(), new File(dir, OM_SDK_JS)));
        arrayList.add(writeToFile(hVar.getOM_SESSION_JS$vungle_ads_release(), new File(dir, OM_SESSION_JS)));
        return arrayList;
    }
}
