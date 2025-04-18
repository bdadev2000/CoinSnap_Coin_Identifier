package w5;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.internal.d0;
import com.facebook.m0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class l {
    public static final HashSet a = SetsKt.hashSetOf(200, 202);

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f26781b = SetsKt.hashSetOf(Integer.valueOf(PglCryptUtils.COMPRESS_FAILED), Integer.valueOf(PglCryptUtils.BASE64_FAILED), 429);

    /* renamed from: c, reason: collision with root package name */
    public static j f26782c;

    /* renamed from: d, reason: collision with root package name */
    public static List f26783d;

    /* renamed from: e, reason: collision with root package name */
    public static int f26784e;

    public static final void a(String datasetID, String url, String accessKey) {
        Intrinsics.checkNotNullParameter(datasetID, "datasetID");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(accessKey, "accessKey");
        com.facebook.internal.m mVar = d0.f11030d;
        com.facebook.internal.m.o(m0.APP_EVENTS, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", datasetID, url, accessKey);
        j jVar = new j(datasetID, url, accessKey);
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        f26782c = jVar;
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        f26783d = arrayList;
    }

    public static List b() {
        List list = f26783d;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transformedEvents");
        throw null;
    }
}
