package sc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public Ref.ObjectRef f24946b;

    /* renamed from: c, reason: collision with root package name */
    public Ref.ObjectRef f24947c;

    /* renamed from: d, reason: collision with root package name */
    public int f24948d;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f24949f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f24950g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Continuation continuation) {
        super(2, continuation);
        this.f24950g = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = new d(this.f24950g, continuation);
        dVar.f24949f = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((JSONObject) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f7  */
    /* JADX WARN: Type inference failed for: r14v13, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Double] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sc.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
