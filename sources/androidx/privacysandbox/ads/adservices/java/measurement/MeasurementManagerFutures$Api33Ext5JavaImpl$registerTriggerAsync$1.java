package androidx.privacysandbox.ads.adservices.java.measurement;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import androidx.privacysandbox.ads.adservices.measurement.MeasurementManager;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {Opcodes.F2D}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f20846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MeasurementManagerFutures.Api33Ext5JavaImpl f20847b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f20848c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1(MeasurementManagerFutures.Api33Ext5JavaImpl api33Ext5JavaImpl, Uri uri, g gVar) {
        super(2, gVar);
        this.f20847b = api33Ext5JavaImpl;
        this.f20848c = uri;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1(this.f20847b, this.f20848c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f20846a;
        if (i2 == 0) {
            q.m(obj);
            MeasurementManager measurementManager = this.f20847b.f20837a;
            this.f20846a = 1;
            if (measurementManager.d(this.f20848c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
