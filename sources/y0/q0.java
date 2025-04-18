package y0;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableDeferred;

/* loaded from: classes.dex */
public final class q0 extends Lambda implements Function2 {

    /* renamed from: c, reason: collision with root package name */
    public static final q0 f27828c = new q0(0);

    /* renamed from: d, reason: collision with root package name */
    public static final q0 f27829d = new q0(1);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27830b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(int i10) {
        super(2);
        this.f27830b = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27830b) {
            case 0:
                x0 msg = (x0) obj;
                Throwable th2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(msg, "msg");
                CompletableDeferred completableDeferred = msg.f27873b;
                if (th2 == null) {
                    th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                completableDeferred.completeExceptionally(th2);
                return Unit.INSTANCE;
            default:
                ki.b0 path = (ki.b0) obj;
                Intrinsics.checkNotNullParameter(path, "path");
                Intrinsics.checkNotNullParameter((ki.o) obj2, "<anonymous parameter 1>");
                Intrinsics.checkNotNullParameter(path, "path");
                String filePath = wh.c0.h(path.toString(), true).toString();
                Intrinsics.checkNotNullParameter(filePath, "filePath");
                return new i1(filePath);
        }
    }
}
