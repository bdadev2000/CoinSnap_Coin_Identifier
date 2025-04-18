package qc;

import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class o0 extends FunctionReferenceImpl implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public static final o0 f23853b = new o0();

    public o0() {
        super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return UUID.randomUUID();
    }
}
