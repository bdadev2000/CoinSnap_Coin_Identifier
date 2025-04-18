package li;

import java.io.IOException;
import ki.e0;
import ki.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes5.dex */
public final class h extends Lambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f21396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f21397c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f21398d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f21399f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f21400g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f21401h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Ref.BooleanRef booleanRef, long j3, Ref.LongRef longRef, e0 e0Var, Ref.LongRef longRef2, Ref.LongRef longRef3) {
        super(2);
        this.f21396b = booleanRef;
        this.f21397c = j3;
        this.f21398d = longRef;
        this.f21399f = e0Var;
        this.f21400g = longRef2;
        this.f21401h = longRef3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j3;
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 1) {
            Ref.BooleanRef booleanRef = this.f21396b;
            if (!booleanRef.element) {
                booleanRef.element = true;
                if (longValue >= this.f21397c) {
                    Ref.LongRef longRef = this.f21398d;
                    long j10 = longRef.element;
                    k kVar = this.f21399f;
                    if (j10 == 4294967295L) {
                        j10 = kVar.readLongLe();
                    }
                    longRef.element = j10;
                    Ref.LongRef longRef2 = this.f21400g;
                    long j11 = 0;
                    if (longRef2.element == 4294967295L) {
                        j3 = kVar.readLongLe();
                    } else {
                        j3 = 0;
                    }
                    longRef2.element = j3;
                    Ref.LongRef longRef3 = this.f21401h;
                    if (longRef3.element == 4294967295L) {
                        j11 = kVar.readLongLe();
                    }
                    longRef3.element = j11;
                } else {
                    throw new IOException("bad zip: zip64 extra too short");
                }
            } else {
                throw new IOException("bad zip: zip64 extra repeated");
            }
        }
        return Unit.INSTANCE;
    }
}
