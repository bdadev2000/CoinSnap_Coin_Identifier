package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"ANDROID_DETECTED", "", "getANDROID_DETECTED", "()Z", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFastServiceLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoaderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
/* loaded from: classes3.dex */
public final class FastServiceLoaderKt {
    private static final boolean ANDROID_DETECTED;

    static {
        Object m145constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m145constructorimpl = Result.m145constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m145constructorimpl = Result.m145constructorimpl(ResultKt.createFailure(th2));
        }
        ANDROID_DETECTED = Result.m152isSuccessimpl(m145constructorimpl);
    }

    public static final boolean getANDROID_DETECTED() {
        return ANDROID_DETECTED;
    }
}
