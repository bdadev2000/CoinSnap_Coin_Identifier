package li;

import java.io.IOException;
import ki.e0;
import ki.k;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes5.dex */
public final class i extends Lambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f21402b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f21403c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f21404d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f21405f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e0 e0Var, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
        super(2);
        this.f21402b = e0Var;
        this.f21403c = objectRef;
        this.f21404d = objectRef2;
        this.f21405f = objectRef3;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v12, types: [T, java.lang.Long] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 21589) {
            long j3 = 1;
            if (longValue >= 1) {
                int readByte = this.f21402b.readByte() & UByte.MAX_VALUE;
                boolean z12 = true;
                if ((readByte & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((readByte & 2) == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((readByte & 4) != 4) {
                    z12 = false;
                }
                if (z10) {
                    j3 = 5;
                }
                if (z11) {
                    j3 += 4;
                }
                if (z12) {
                    j3 += 4;
                }
                if (longValue >= j3) {
                    if (z10) {
                        this.f21403c.element = Long.valueOf(r2.readIntLe() * 1000);
                    }
                    if (z11) {
                        this.f21404d.element = Long.valueOf(r2.readIntLe() * 1000);
                    }
                    if (z12) {
                        this.f21405f.element = Long.valueOf(r2.readIntLe() * 1000);
                    }
                } else {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
            } else {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
        }
        return Unit.INSTANCE;
    }
}
