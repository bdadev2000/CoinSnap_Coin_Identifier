package h7;

import G7.e;
import G7.j;
import G7.s;
import a.AbstractC0325a;
import a5.C0398b;
import android.content.Context;
import c7.y1;
import com.facebook.appevents.k;
import com.vungle.ads.L;
import com.vungle.ads.internal.a0;
import com.vungle.ads.internal.executor.f;
import com.vungle.ads.internal.util.n;
import com.vungle.ads.internal.util.v;
import com.vungle.ads.internal.util.x;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class c {
    private static final String FILENAME = "unclosed_ad";
    private final Context context;
    private final com.vungle.ads.internal.executor.a executors;
    private File file;
    private final x pathProvider;
    private final String sessionId;
    private final CopyOnWriteArrayList<y1> unclosedAdList;
    public static final C2329b Companion = new C2329b(null);
    private static final f8.b json = R2.b.a(C2328a.INSTANCE);

    public c(Context context, String str, com.vungle.ads.internal.executor.a aVar, x xVar) {
        j.e(context, "context");
        j.e(str, "sessionId");
        j.e(aVar, "executors");
        j.e(xVar, "pathProvider");
        this.context = context;
        this.sessionId = str;
        this.executors = aVar;
        this.pathProvider = xVar;
        this.file = xVar.getUnclosedAdFile(FILENAME);
        this.unclosedAdList = new CopyOnWriteArrayList<>();
        File file = this.file;
        if (file != null && !file.exists()) {
            this.file.createNewFile();
        }
    }

    private final <T> T decodeJson(String str) {
        C0398b c0398b = json.b;
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    private final List<y1> readUnclosedAdFromFile() {
        return (List) new com.vungle.ads.internal.executor.c(((f) this.executors).getIoExecutor().submit(new a0(this, 1))).get(1000L, TimeUnit.MILLISECONDS);
    }

    /* renamed from: readUnclosedAdFromFile$lambda-2 */
    public static final List m123readUnclosedAdFromFile$lambda2(c cVar) {
        List arrayList;
        j.e(cVar, "this$0");
        try {
            String readString = n.INSTANCE.readString(cVar.file);
            if (readString != null && readString.length() != 0) {
                f8.b bVar = json;
                C0398b c0398b = bVar.b;
                int i9 = M7.f.f2011c;
                M7.f q9 = y8.a.q(s.b(y1.class));
                e a6 = s.a(List.class);
                List singletonList = Collections.singletonList(q9);
                s.f1335a.getClass();
                arrayList = (List) bVar.a(AbstractC0325a.q(c0398b, new G7.x(a6, singletonList)), readString);
                return arrayList;
            }
            arrayList = new ArrayList();
            return arrayList;
        } catch (Exception e4) {
            v.Companion.e("UnclosedAdDetector", "Fail to read unclosed ad file " + e4.getMessage());
            return new ArrayList();
        }
    }

    /* renamed from: retrieveUnclosedAd$lambda-1 */
    public static final void m124retrieveUnclosedAd$lambda1(c cVar) {
        j.e(cVar, "this$0");
        try {
            n.deleteAndLogIfFailed(cVar.file);
        } catch (Exception e4) {
            v.Companion.e("UnclosedAdDetector", "Fail to delete file " + e4.getMessage());
        }
    }

    private final void writeUnclosedAdToFile(List<y1> list) {
        try {
            f8.b bVar = json;
            C0398b c0398b = bVar.b;
            int i9 = M7.f.f2011c;
            M7.f q9 = y8.a.q(s.b(y1.class));
            e a6 = s.a(List.class);
            List singletonList = Collections.singletonList(q9);
            s.f1335a.getClass();
            ((f) this.executors).getIoExecutor().execute(new k(13, this, bVar.b(AbstractC0325a.q(c0398b, new G7.x(a6, singletonList)), list)));
        } catch (Exception e4) {
            v.Companion.e("UnclosedAdDetector", "Fail to write unclosed ad file " + e4.getMessage());
        }
    }

    /* renamed from: writeUnclosedAdToFile$lambda-3 */
    public static final void m125writeUnclosedAdToFile$lambda3(c cVar, String str) {
        j.e(cVar, "this$0");
        j.e(str, "$jsonContent");
        n.INSTANCE.writeString(cVar.file, str);
    }

    public final void addUnclosedAd(y1 y1Var) {
        j.e(y1Var, "ad");
        y1Var.setSessionId(this.sessionId);
        this.unclosedAdList.add(y1Var);
        writeUnclosedAdToFile(this.unclosedAdList);
    }

    public final Context getContext() {
        return this.context;
    }

    public final com.vungle.ads.internal.executor.a getExecutors() {
        return this.executors;
    }

    public final x getPathProvider() {
        return this.pathProvider;
    }

    public final void removeUnclosedAd(y1 y1Var) {
        j.e(y1Var, "ad");
        if (this.unclosedAdList.contains(y1Var)) {
            this.unclosedAdList.remove(y1Var);
            writeUnclosedAdToFile(this.unclosedAdList);
        }
    }

    public final List<y1> retrieveUnclosedAd() {
        ArrayList arrayList = new ArrayList();
        List<y1> readUnclosedAdFromFile = readUnclosedAdFromFile();
        if (readUnclosedAdFromFile != null) {
            arrayList.addAll(readUnclosedAdFromFile);
        }
        ((f) this.executors).getIoExecutor().execute(new L(this, 6));
        return arrayList;
    }
}
