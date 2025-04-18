package gh;

import android.content.Context;
import bh.x3;
import com.facebook.w;
import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.executor.f;
import com.vungle.ads.internal.util.n;
import com.vungle.ads.internal.util.v;
import com.vungle.ads.internal.util.x;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import jb.j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.modules.SerializersModule;

/* loaded from: classes4.dex */
public final class c {
    private static final String FILENAME = "unclosed_ad";
    private final Context context;
    private final com.vungle.ads.internal.executor.a executors;
    private File file;
    private final x pathProvider;
    private final String sessionId;
    private final CopyOnWriteArrayList<x3> unclosedAdList;
    public static final b Companion = new b(null);
    private static final Json json = JsonKt.Json$default(null, a.INSTANCE, 1, null);

    public c(Context context, String sessionId, com.vungle.ads.internal.executor.a executors, x pathProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(executors, "executors");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.context = context;
        this.sessionId = sessionId;
        this.executors = executors;
        this.pathProvider = pathProvider;
        this.file = pathProvider.getUnclosedAdFile(FILENAME);
        this.unclosedAdList = new CopyOnWriteArrayList<>();
        File file = this.file;
        if (file != null && !file.exists()) {
            this.file.createNewFile();
        }
    }

    public static /* synthetic */ void a(c cVar) {
        m136retrieveUnclosedAd$lambda1(cVar);
    }

    public static /* synthetic */ List c(c cVar) {
        return m135readUnclosedAdFromFile$lambda2(cVar);
    }

    private final /* synthetic */ <T> T decodeJson(String str) {
        Json json2 = json;
        SerializersModule serializersModule = json2.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        KSerializer<Object> serializer = SerializersKt.serializer(serializersModule, (KType) null);
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (T) json2.decodeFromString(serializer, str);
    }

    private final List<x3> readUnclosedAdFromFile() {
        return (List) new com.vungle.ads.internal.executor.c(((f) this.executors).getIoExecutor().submit(new w(this, 6))).get(1000L, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:3:0x0005, B:5:0x000f, B:10:0x001b, B:13:0x0043), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043 A[Catch: Exception -> 0x0049, TRY_LEAVE, TryCatch #0 {Exception -> 0x0049, blocks: (B:3:0x0005, B:5:0x000f, B:10:0x001b, B:13:0x0043), top: B:2:0x0005 }] */
    /* renamed from: readUnclosedAdFromFile$lambda-2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List m135readUnclosedAdFromFile$lambda2(gh.c r5) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.vungle.ads.internal.util.n r0 = com.vungle.ads.internal.util.n.INSTANCE     // Catch: java.lang.Exception -> L49
            java.io.File r5 = r5.file     // Catch: java.lang.Exception -> L49
            java.lang.String r5 = r0.readString(r5)     // Catch: java.lang.Exception -> L49
            if (r5 == 0) goto L18
            int r0 = r5.length()     // Catch: java.lang.Exception -> L49
            if (r0 != 0) goto L16
            goto L18
        L16:
            r0 = 0
            goto L19
        L18:
            r0 = 1
        L19:
            if (r0 != 0) goto L43
            kotlinx.serialization.json.Json r0 = gh.c.json     // Catch: java.lang.Exception -> L49
            kotlinx.serialization.modules.SerializersModule r1 = r0.getSerializersModule()     // Catch: java.lang.Exception -> L49
            java.lang.Class<java.util.List> r2 = java.util.List.class
            kotlin.reflect.KTypeProjection$Companion r3 = kotlin.reflect.KTypeProjection.INSTANCE     // Catch: java.lang.Exception -> L49
            java.lang.Class<bh.x3> r4 = bh.x3.class
            kotlin.reflect.KType r4 = kotlin.jvm.internal.Reflection.typeOf(r4)     // Catch: java.lang.Exception -> L49
            kotlin.reflect.KTypeProjection r3 = r3.invariant(r4)     // Catch: java.lang.Exception -> L49
            kotlin.reflect.KType r2 = kotlin.jvm.internal.Reflection.typeOf(r2, r3)     // Catch: java.lang.Exception -> L49
            kotlinx.serialization.KSerializer r1 = kotlinx.serialization.SerializersKt.serializer(r1, r2)     // Catch: java.lang.Exception -> L49
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)     // Catch: java.lang.Exception -> L49
            java.lang.Object r5 = r0.decodeFromString(r1, r5)     // Catch: java.lang.Exception -> L49
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Exception -> L49
            goto L68
        L43:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> L49
            r5.<init>()     // Catch: java.lang.Exception -> L49
            goto L68
        L49:
            r5 = move-exception
            com.vungle.ads.internal.util.u r0 = com.vungle.ads.internal.util.v.Companion
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fail to read unclosed ad file "
            r1.<init>(r2)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "UnclosedAdDetector"
            r0.e(r1, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L68:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: gh.c.m135readUnclosedAdFromFile$lambda2(gh.c):java.util.List");
    }

    /* renamed from: retrieveUnclosedAd$lambda-1 */
    public static final void m136retrieveUnclosedAd$lambda1(c this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            n.deleteAndLogIfFailed(this$0.file);
        } catch (Exception e2) {
            v.Companion.e("UnclosedAdDetector", "Fail to delete file " + e2.getMessage());
        }
    }

    private final void writeUnclosedAdToFile(List<x3> list) {
        try {
            Json json2 = json;
            KSerializer<Object> serializer = SerializersKt.serializer(json2.getSerializersModule(), Reflection.typeOf(List.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(x3.class))));
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            ((f) this.executors).getIoExecutor().execute(new j(16, this, json2.encodeToString(serializer, list)));
        } catch (Exception e2) {
            v.Companion.e("UnclosedAdDetector", "Fail to write unclosed ad file " + e2.getMessage());
        }
    }

    /* renamed from: writeUnclosedAdToFile$lambda-3 */
    public static final void m137writeUnclosedAdToFile$lambda3(c this$0, String jsonContent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(jsonContent, "$jsonContent");
        n.INSTANCE.writeString(this$0.file, jsonContent);
    }

    public final void addUnclosedAd(x3 ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        ad2.setSessionId(this.sessionId);
        this.unclosedAdList.add(ad2);
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

    public final void removeUnclosedAd(x3 ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        if (this.unclosedAdList.contains(ad2)) {
            this.unclosedAdList.remove(ad2);
            writeUnclosedAdToFile(this.unclosedAdList);
        }
    }

    public final List<x3> retrieveUnclosedAd() {
        ArrayList arrayList = new ArrayList();
        List<x3> readUnclosedAdFromFile = readUnclosedAdFromFile();
        if (readUnclosedAdFromFile != null) {
            arrayList.addAll(readUnclosedAdFromFile);
        }
        ((f) this.executors).getIoExecutor().execute(new k8.f(this, 20));
        return arrayList;
    }
}
