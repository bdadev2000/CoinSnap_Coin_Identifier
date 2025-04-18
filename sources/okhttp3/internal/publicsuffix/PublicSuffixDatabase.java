package okhttp3.internal.publicsuffix;

import a6.k;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import ki.e0;
import ki.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import wh.a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "wh/a0", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f23341e;

    /* renamed from: f, reason: collision with root package name */
    public static final List f23342f;

    /* renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f23343g;
    public final AtomicBoolean a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f23344b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f23345c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f23346d;

    static {
        new a0(21, 0);
        f23341e = new byte[]{42};
        f23342f = CollectionsKt.listOf("*");
        f23343g = new PublicSuffixDatabase();
    }

    public static List c(String str) {
        List split$default;
        List dropLast;
        split$default = StringsKt__StringsKt.split$default(str, new char[]{'.'}, false, 0, 6, (Object) null);
        if (Intrinsics.areEqual(CollectionsKt.last(split$default), "")) {
            dropLast = CollectionsKt___CollectionsKt.dropLast(split$default, 1);
            return dropLast;
        }
        return split$default;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r1 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x003b, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0039, code lost:
    
        if (r1 == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String):java.lang.String");
    }

    public final void b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(com.mbridge.msdk.thrid.okhttp.internal.publicsuffix.PublicSuffixDatabase.PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream == null) {
            return;
        }
        e0 f10 = k.f(new t(k.N(resourceAsStream)));
        try {
            long readInt = f10.readInt();
            f10.require(readInt);
            byte[] readByteArray = f10.f20977c.readByteArray(readInt);
            long readInt2 = f10.readInt();
            f10.require(readInt2);
            byte[] readByteArray2 = f10.f20977c.readByteArray(readInt2);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(f10, null);
            synchronized (this) {
                Intrinsics.checkNotNull(readByteArray);
                this.f23345c = readByteArray;
                Intrinsics.checkNotNull(readByteArray2);
                this.f23346d = readByteArray2;
            }
            this.f23344b.countDown();
        } finally {
        }
    }
}
