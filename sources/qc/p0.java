package qc;

import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public final class p0 {
    public final z0 a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f23854b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23855c;

    /* renamed from: d, reason: collision with root package name */
    public int f23856d;

    /* renamed from: e, reason: collision with root package name */
    public h0 f23857e;

    public p0() {
        a1 timeProvider = a1.a;
        o0 uuidGenerator = o0.f23853b;
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        this.a = timeProvider;
        this.f23854b = uuidGenerator;
        this.f23855c = a();
        this.f23856d = -1;
    }

    public final String a() {
        String replace$default;
        String uuid = ((UUID) this.f23854b.invoke()).toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "uuidGenerator().toString()");
        replace$default = StringsKt__StringsJVMKt.replace$default(uuid, "-", "", false, 4, (Object) null);
        String lowerCase = replace$default.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final h0 b() {
        h0 h0Var = this.f23857e;
        if (h0Var != null) {
            return h0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("currentSession");
        return null;
    }
}
