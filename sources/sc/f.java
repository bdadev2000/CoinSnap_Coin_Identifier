package sc;

import androidx.lifecycle.r0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes3.dex */
public final class f implements q {
    public final CoroutineContext a;

    /* renamed from: b, reason: collision with root package name */
    public final dc.e f24952b;

    /* renamed from: c, reason: collision with root package name */
    public final qc.b f24953c;

    /* renamed from: d, reason: collision with root package name */
    public final a f24954d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f24955e;

    /* renamed from: f, reason: collision with root package name */
    public final Mutex f24956f;

    public f(CoroutineContext backgroundDispatcher, dc.e firebaseInstallationsApi, qc.b appInfo, h configsFetcher, y0.j dataStore) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallationsApi");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(configsFetcher, "configsFetcher");
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.a = backgroundDispatcher;
        this.f24952b = firebaseInstallationsApi;
        this.f24953c = appInfo;
        this.f24954d = configsFetcher;
        this.f24955e = LazyKt.lazy(new r0(dataStore, 3));
        this.f24956f = MutexKt.Mutex$default(false, 1, null);
    }

    @Override // sc.q
    public final Boolean a() {
        i iVar = e().f24990b;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            iVar = null;
        }
        return iVar.a;
    }

    @Override // sc.q
    public final Duration b() {
        i iVar = e().f24990b;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            iVar = null;
        }
        Integer num = iVar.f24965c;
        if (num == null) {
            return null;
        }
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m1482boximpl(DurationKt.toDuration(num.intValue(), DurationUnit.SECONDS));
    }

    @Override // sc.q
    public final Double c() {
        i iVar = e().f24990b;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            iVar = null;
        }
        return iVar.f24964b;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5 A[Catch: all -> 0x0182, TRY_LEAVE, TryCatch #0 {all -> 0x0182, blocks: (B:26:0x0050, B:27:0x00ab, B:29:0x00b5, B:33:0x00c1, B:39:0x0173, B:41:0x0085, B:43:0x008f, B:46:0x009a), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f A[Catch: all -> 0x0182, TRY_LEAVE, TryCatch #0 {all -> 0x0182, blocks: (B:26:0x0050, B:27:0x00ab, B:29:0x00b5, B:33:0x00c1, B:39:0x0173, B:41:0x0085, B:43:0x008f, B:46:0x009a), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a A[Catch: all -> 0x0182, TRY_ENTER, TryCatch #0 {all -> 0x0182, blocks: (B:26:0x0050, B:27:0x00ab, B:29:0x00b5, B:33:0x00c1, B:39:0x0173, B:41:0x0085, B:43:0x008f, B:46:0x009a), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    @Override // sc.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sc.f.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final p e() {
        return (p) this.f24955e.getValue();
    }
}
